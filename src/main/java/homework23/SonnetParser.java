package homework23;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;


public class SonnetParser {
    private static final String XML_FILE = "src/main/resources/sonnet.xml";

    public static void main(String[] args) {
        // Проверка файла
        File xmlFile = new File(XML_FILE);
        if (!xmlFile.exists()) {
            System.out.println("Файл " + XML_FILE + " не найден!");
            return;
        }

        // Определение метода парсинга
        String choice = (args.length > 0) ? args[0] : "";
        if (choice.isEmpty()) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Введите 1 для SAX или 2 для DOM: ");
                choice = reader.readLine().trim();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String method;
        String firstName = "", lastName = "", title = "";
        StringBuilder linesContent = new StringBuilder();

        if ("1".equals(choice)) {
            method = "SAX";
            try {
                SAXHandler handler = new SAXHandler();
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser parser = factory.newSAXParser();
                parser.parse(xmlFile, handler);

                firstName = handler.firstName;
                lastName = handler.lastName;
                title = handler.title;
                java.util.List<String> lines = handler.lines;
                for (String line : lines) {
                    linesContent.append(line).append("\n");
                }
            } catch (Exception e) {
                System.out.println("Ошибка при парсинге SAX: " + e.getMessage());
                return;
            }
        } else if ("2".equals(choice)) {
            method = "DOM";
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(xmlFile);
                doc.getDocumentElement().normalize();

                NodeList authorList = doc.getElementsByTagName("author");
                if (authorList.getLength() > 0) {
                    Element author = (Element) authorList.item(0);
                    firstName = author.getElementsByTagName("firstName").item(0).getTextContent();
                    lastName = author.getElementsByTagName("lastName").item(0).getTextContent();
                }
                title = doc.getElementsByTagName("title").item(0).getTextContent();

                NodeList lineList = doc.getElementsByTagName("line");
                for (int i = 0; i < lineList.getLength(); i++) {
                    linesContent.append(lineList.item(i).getTextContent()).append("\n");
                }
            } catch (Exception e) {
                System.out.println("Ошибка при парсинге DOM: " + e.getMessage());
                return;
            }
        } else {
            System.out.println("Неверный выбор. Используйте 1 (SAX) или 2 (DOM).");
            return;
        }

        if (firstName.isEmpty() || lastName.isEmpty() || title.isEmpty()) {
            System.out.println("Ошибка извлечения данных из XML.");
            return;
        }

        // Создание файла и запись содержимого
        String filename = firstName + "_" + lastName + "_" + title + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(linesContent.toString());
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
            return;
        }

        System.out.println("Парсинг с " + method + " завершен.");
        System.out.println("Файл создан: " + filename);
        System.out.println("Содержимое (первые 10 строк):");

        String[] linesArray = linesContent.toString().split("\n");
        for (int i = 0; i < Math.min(10, linesArray.length); i++) {
            System.out.println((i + 1) + ": " + linesArray[i]);
        }
    }
}