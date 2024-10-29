package com.aktie.samples.httpclient;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Base64;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.aktie.samples.JsonUtils;

public class QRCodeSample {
    public static void main(String[] args) {
        try {
            Map<String, Object> tokenJson = JsonUtils.srtToMap(TokenSample.getToken());
            String token = "Bearer " + tokenJson.get("access_token").toString();

            Double amount = Double.parseDouble(JOptionPane.showInputDialog("Valor do pix?"));

            Map<String, Object> qrCodeData = genQRCode(token, amount);
            String emv = splitString(qrCodeData.get("emvqrcps").toString(), 60);

            String msg = "Pix Copia e Cola\n".concat(emv).concat("\n\nValor\n").concat(formatCurrency(amount));

            Image image = getBase64Image(token, qrCodeData.get("transactionId").toString());
            Icon icon = new ImageIcon(image);

            JOptionPane.showMessageDialog(
                    null,
                    msg,
                    "QR Code PIX🤑",
                    JOptionPane.PLAIN_MESSAGE,
                    icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Object> genQRCode(String token, Double amount) {
        try {
            //Configurando JSON para a requisição
            String json = "{\n" + //
                        "  \"key\": \"testepix@celcoin.com.br\",\n" + //
                        "  \"amount\": " + amount.toString() + ",\n" + //
                        "  \"merchant\": {\n" + //
                        "    \"postalCode\": \"858402\",\n" + //
                        "    \"city\": \"cascaland\",\n" + //
                        "    \"merchantCategoryCode\": \"5000\",\n" + //
                        "    \"name\": \"TestBullet\"\n" + //
                        "  }\n" + //
                        "}";

            //Criando o cliente HttpClient
            HttpClient client = HttpClient.newHttpClient();

            //Configurando a requisição POST com JSON e headers
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static"))
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("Authorization", token)
                    .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
                    .build();

            //Enviando a requisição e capturando a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //Convertendo a resposta JSON para Map
            return JsonUtils.srtToMap(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Image getBase64Image(String token, String transactionId) {
        try {
            //Configurando o URL de requisição
            String path = "https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static/" + transactionId + "/base64";
            
            //Criando o cliente HttpClient
            HttpClient client = HttpClient.newHttpClient();

            //Configurando a requisição GET com os headers
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(path))
                    .header("Accept", "application/json")
                    .header("Authorization", token)
                    .GET()
                    .build();

            //Enviando a requisição e capturando a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //Parse do JSON da resposta para extrair a imagem base64
            String base64 = (String) JsonUtils.srtToMap(response.body()).get("base64image");
            byte[] imageData = Base64.getDecoder().decode(decodeUtfToPlain(base64));

            //Convertendo os bytes em uma imagem BufferedImage
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageData));

            //Redimensiona a imagem
            return resize(img, 140, 140);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String decodeUtfToPlain(String input) {
        Pattern pattern = Pattern.compile("\\\\u[0-9a-fA-F]{4}");
        Matcher matcher = pattern.matcher(input);

        StringBuilder decodedString = new StringBuilder();

        while (matcher.find()) {
            String unicodeSequence = matcher.group();
            char unicodeChar = (char) Integer.parseInt(unicodeSequence.substring(2), 16);

            matcher.appendReplacement(decodedString, Character.toString(unicodeChar));
        }

        matcher.appendTail(decodedString);

        return decodedString.toString();
    }

    private static Image resize(BufferedImage img, int width, int height) {
        return img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    private static String formatCurrency(Double value) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        return currencyFormat.format(value);
    }

    private static String splitString(String text, int wordsPerLine) {
        final StringBuilder newText = new StringBuilder();

        long wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (wordCount++ > wordsPerLine) {
                newText.append(character);
                newText.append("\n");

                wordCount = 1;

                continue;
            }

            newText.append(character);
        }

        return newText.toString();
    }
}
