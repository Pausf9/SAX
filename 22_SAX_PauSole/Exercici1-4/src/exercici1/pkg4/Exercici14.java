/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1.pkg4;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Opció A:
 *
 * Realitza una lectura d'un fitxer XML i treu el resultat d'una cerca per un
 * nom de node (p.e. cerca per títol) per consola
 *
 * @author Pau
 */
public class Exercici14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File inputFile = new File("src/XML/XML.xml");

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            Exercice userhandler = new Exercice();
            saxParser.parse(inputFile, userhandler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
