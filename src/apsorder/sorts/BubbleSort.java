package apsorder.sorts;

import apsorder.Caminhao;
import apsorder.timer.StopWatch;
import java.util.*;

public class BubbleSort {
    
    public static long bubble(int op, ArrayList<Caminhao> listaCaminhao){
        StopWatch s = new StopWatch(); 
        s.start();
        Caminhao aux = new Caminhao();
        int i = 0;
        boolean trocou = true;
        
        switch(op){
            case 1:
                while (trocou){
                    trocou = false;
                    for(i = 0; i < listaCaminhao.size() - 1; i++){
                        if(listaCaminhao.get(i).getCodigo() > (listaCaminhao.get(i + 1).getCodigo())){
                            aux = listaCaminhao.get(i);
                            listaCaminhao.set(i, listaCaminhao.get(i + 1));
                            listaCaminhao.set(i + 1, (Caminhao) aux);
                            trocou = true;
                        } 
                    } 
                }
                
                break;
            case 2:
                while (trocou) {                    
                    trocou = false;
                    for(i = 0; i < listaCaminhao.size() - 1; i++){
                        if(listaCaminhao.get(i).getNome().compareTo(listaCaminhao.get(i + 1).getNome()) > 0){
                            aux = listaCaminhao.get(i);
                            listaCaminhao.set(i, listaCaminhao.get(i + 1));
                            listaCaminhao.set(i + 1, (Caminhao) aux);
                            trocou = true;
                        }
                    }
                }
                
                 
                break;
            case 3:
                while (trocou){
                    trocou = false;
                    for(i = 0; i < listaCaminhao.size() - 1; i++){
                        if(listaCaminhao.get(i).getPeso()> (listaCaminhao.get(i + 1).getPeso())){
                            aux = listaCaminhao.get(i);
                            listaCaminhao.set(i, listaCaminhao.get(i + 1));
                            listaCaminhao.set(i + 1, (Caminhao) aux);
                            trocou = true;
                        } 
                    } 
                }
                
                break;
            default:
        }
        s.stop(); 
        return s.getElapsedTime();

    }
}
