package apsorder;


import apsorder.xmlreader.ConfigXml;
import apsorder.sorts.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class APSOrder {
    
    public static void main(String[] args) {
        start();
    }
    
    private static void start(){
        int opcao = 0;
        long tempoBubble = 0;
        long tempoInsert;
        long tempoSelect;
        
        try {
           System.out.println("Carregando XML... \n");
           ArrayList<Caminhao> listaCaminhao = ConfigXml.lerVeiculo(); 
           System.out.println("XML Carregado... \n");
           opcao = menu();
           
           tempoBubble = BubbleSort.bubble(opcao, listaCaminhao);
           tempoInsert = InsertSort.insert(opcao, listaCaminhao);
           tempoSelect = SelectSort.select(opcao, listaCaminhao);
           
           printList(listaCaminhao);
           System.out.println("Tempo de Execução por BUBBLE SORT: "+tempoBubble + "ms");
           System.out.println("Tempo de Execução por INSERT SORT: "+tempoInsert + "ms");
           System.out.println("Tempo de Execução por SELECT SORT: "+tempoSelect + "ms");
           
           System.out.println("\n-------------------------------");
           
           if(tempoBubble < tempoInsert && tempoBubble < tempoSelect){
               System.out.println("BUBBLE é mais rápido");
           }
           else if(tempoInsert < tempoBubble && tempoInsert < tempoSelect){
               System.out.println("INSERT é mais rápido");
           }
           else{
               System.out.println("SELECT é mais rápido");
           }
           
           System.out.println("-------------------------------\n\n");
           
        } 
        catch (Exception e) {
            System.out.println("ERRO:" + e.getMessage());
            
        }
    }
    
    private static int menu(){
        int tipo = (Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da opcao pela qual deseja ordenar (1-Codigo / 2-Nome / 3-Peso):")));
        return tipo;
    }
    
    private static void printList(ArrayList<Caminhao> list){
        int count = 1;
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
            if(count%10 != 10){
                System.out.println();
            }
            count++;
        }
    }
    
}
