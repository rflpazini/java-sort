package apsorder.sorts;

import apsorder.Caminhao;
import apsorder.timer.StopWatch;
import java.util.*;

public class InsertSort {
    
    public static long insert(int op, ArrayList<Caminhao> listaCaminhao){
        StopWatch s = new StopWatch(); 
        s.start();
        Caminhao aux = new Caminhao();
        int i = 0;
        int j = 0;
        
        switch (op){
            case 1:
                for(i = 0; i < listaCaminhao.size(); i++){
                    aux = listaCaminhao.get(i);
                    j = i - 1;
            
                    while ((j >= 0) && (aux.getCodigo() < listaCaminhao.get(j).getCodigo())) {                
                        listaCaminhao.set(j+1, listaCaminhao.get(j));
                        j--;
                    }
                    listaCaminhao.set(j+1, aux);
                }
                
                break;
            
            case 2:
                for(i = 0; i < listaCaminhao.size(); i++){
                    aux = listaCaminhao.get(i);
                    j = i - 1;
                    
                    while((j >= 0) && (aux.getNome().compareTo(listaCaminhao.get(j).getNome()) < 0)){
                        listaCaminhao.set(j+1, listaCaminhao.get(j));
                        j--;
                    }
                    listaCaminhao.set(j+1, aux);
                }
                break;
            case 3:
                for(i = 0; i < listaCaminhao.size(); i++){
                    aux = listaCaminhao.get(i);
                    j = i - 1;
            
                    while ((j >= 0) && (aux.getPeso() < listaCaminhao.get(j).getPeso())) {                
                        listaCaminhao.set(j+1, listaCaminhao.get(j));
                        j--;
                    }
                    listaCaminhao.set(j+1, aux);
                }
               
                break;
        }
        s.stop(); 
        return s.getElapsedTime();
    }
}
