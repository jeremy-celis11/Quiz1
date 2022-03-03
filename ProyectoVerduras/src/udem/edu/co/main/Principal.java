/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.main;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.DoubleStream.builder;
import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import udem.edu.co.verdura.interfaces.Verdura;
import udem.edu.co.verdura.Apio;
import udem.edu.co.verdura.Cebolla;
import udem.edu.co.verdura.Rabano;

/**
 *
 * @author JEREMY
 * 03/03/2022
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Esta es una lista que me almacenas todas las verduras con sus tipos y carateristicas
         */
        List <Verdura> verduras=new ArrayList<>();
        verduras.add(new Rabano("Rojo y Verde", (float)2.300, "3 semanas"));
        verduras.add(new Apio("Verde y Blanco", (float)3.500, "2 semanas"));
        verduras.add(new Cebolla("Blanca o Roja", (float)5.300, "1 mes"));
        
        /**
         * For para recorrer la lista de verduras y imprimirA
         */
        for (int i = 0; i < verduras.size(); i++) {
            System.out.println(verduras.get(i).toString());
   
        
        }
    }
    
}
