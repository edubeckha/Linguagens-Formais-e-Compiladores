/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedHashSet;
import java.util.Set;

public class GramaticaLivreDeContexto {
    
    private Set<Simbolo> naoTerminais, terminais;
    private Simbolo inicial;
    
    
    public GramaticaLivreDeContexto(){
        naoTerminais = new LinkedHashSet<>();
        terminais = new LinkedHashSet<>();
    }
    
    public void salvar(){
        
    }
    public void resetar(){
        
    }
    
    
}
