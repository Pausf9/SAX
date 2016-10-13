/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1.pkg4;

/**
 *
 * @author Pau
 */
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Exercice extends DefaultHandler {

    boolean bTitle = false;
    boolean bArtist = false;
    String nom="nom";

    @Override

    public void startElement(String uri,
            String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase("llibre") && qName.contains(nom)) {
            System.out.println(qName + " found!");

        } else if (qName.equalsIgnoreCase("titol")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("autor")) {
            bArtist = true;
        }
    }

    @Override
    
    public void endElement(String uri,
            String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("llibre") && qName.contains(nom)) {
            System.out.println("End Element: " + qName + "\r\n");
        }
    }

    @Override
    public void characters(char[] ch,
            int start, int length) throws SAXException {

        String busqueda = new String(ch, start, length);

        if (bTitle) {
            if (busqueda.contains(nom)) {
                System.out.println("Titol: "
                        + new String(ch, start, length));
                bTitle = false;
            }

        } else if (bArtist) {
            System.out.println("Autor: "
                    + new String(ch, start, length));
            bArtist = false;

        }
    }

}
