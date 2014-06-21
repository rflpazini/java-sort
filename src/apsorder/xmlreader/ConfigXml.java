package apsorder.xmlreader;

import apsorder.*;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@XStreamAlias("Caminhao")
public class ConfigXml {
    
    public static ArrayList<Caminhao> lerVeiculo() throws Exception{
        try {
            XStream xStream = new XStream(new DomDriver());
            xStream.alias("Caminhoes", ArrayList.class);
            xStream.alias("caminhao", Caminhao.class);
            File arquivoLeitura = new File("Caminhao.xml");
            BufferedReader input = new BufferedReader(new FileReader("Caminhoes.xml"));
            ArrayList<Caminhao> caminhoes = (ArrayList) xStream.fromXML(input);
            input.close();
          
            return caminhoes;
        } 
        catch (IOException e) {
            throw new Exception(e.getCause());
        }
    }
}
