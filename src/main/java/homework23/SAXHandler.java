package homework23;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {
    public String firstName = "";
    public String lastName = "";
    public String title = "";
    public List<String> lines = new ArrayList<>();

    private StringBuilder currentValue = new StringBuilder();
    private boolean insideLine = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentValue.setLength(0);  // Очистка буфера
        if ("line".equals(qName)) {
            insideLine = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentValue.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = currentValue.toString().trim();
        if ("firstName".equals(qName)) {
            firstName = value;
        } else if ("lastName".equals(qName)) {
            lastName = value;
        } else if ("title".equals(qName)) {
            title = value;
        } else if ("line".equals(qName)) {
            lines.add(value);
            insideLine = false;
        }
    }
}