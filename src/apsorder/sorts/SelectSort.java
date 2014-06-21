package apsorder.sorts;

import apsorder.Caminhao;
import apsorder.timer.StopWatch;
import java.util.*;

public class SelectSort {
    
    public static long select(int op, ArrayList<Caminhao> listaCaminhao){
        StopWatch s = new StopWatch(); 
        s.start();
        Caminhao aux = new Caminhao();
        int i = 0;
        int j = 0;
        int menor = 0;
        
        switch(op){
            case 1:
                for(i = 0; i < listaCaminhao.size(); i++){
                    menor = i;
                    for(j = i; j < listaCaminhao.size(); j++){
                        if(listaCaminhao.get(j).getCodigo() < listaCaminhao.get(menor).getCodigo()){
                            menor = j;
                        }
                        aux = listaCaminhao.get(i);
                        listaCaminhao.set(i, listaCaminhao.get(menor));
                        listaCaminhao.set(menor, aux);
                    }
                }
                
                break;
            case 2:
                for(i = 0; i < listaCaminhao.size(); i++){
                    menor = i;
                    for(j = i; j < listaCaminhao.size(); j++){
                        if(listaCaminhao.get(j).getNome().compareTo(listaCaminhao.get(menor).getNome()) > 0){
                            aux = listaCaminhao.get(i);
                            listaCaminhao.set(i, listaCaminhao.get(menor));
                            listaCaminhao.set(menor, aux);
                        }
                    }
                    
                }
                break;
                
            case 3:
                for(i = 0; i < listaCaminhao.size(); i++){
                    menor = i;
                    for(j = i; j < listaCaminhao.size(); j++){
                        if(listaCaminhao.get(j).getPeso() < listaCaminhao.get(menor).getPeso()){
                            menor = j;
                        }
                        aux = listaCaminhao.get(i);
                        listaCaminhao.set(i, listaCaminhao.get(menor));
                        listaCaminhao.set(menor, aux);
                    }
                }
                
                break;
        }
        s.stop(); 
        return s.getElapsedTime();
    }
}
