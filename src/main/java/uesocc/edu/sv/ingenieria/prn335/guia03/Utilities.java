/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

/**
 *
 * @author usuario
 */
public class Utilities {
    /**
     * Este método hace un resumen de un texto , devolviendo los primeros 30 caracteres
     * @param texto Esta es la variable que recibirá un texto 
     * @return Acá devolverá los primeros 30 caracteres de un texto
     */
    public static String getResume(String texto){
         String txt= "";
       if(texto!=null){  
        if(texto.length()>20){
            for(int letra=0; letra<20; letra++){
                txt=txt+String.valueOf(texto.charAt(letra));
            }
        }
        else {
            txt=texto;
        }
        return txt;
       }
       else{
           return null;
       }
    }
    
    
    /**
     * ESte método Capitaliza la primera letra de las palabras de una frase
     * @param texto Esta es la variable que recibirá un texto 
     * @return devolverá las perimeras letras de un oracion en mayusculas y sin dobles espacios
     */
    public static String capitalizar (String texto){
        if(texto!=null){
          texto=texto.toLowerCase();
           for(int esp=0; esp<texto.length(); esp++){
        texto=texto.replaceAll("  ", " ");
        }
        
        char [] caracter= texto.toCharArray();
        
        for(int i=0; i<texto.length(); i++){
            if(caracter[i]==' ' || caracter[i]=='.' || caracter[i]==','){
                caracter[i+1]=Character.toUpperCase(caracter[i+1]);
            }
            else{
                caracter[0]=Character.toUpperCase(caracter[0]);
            }
        }
        return new String (caracter); 
        }
        else{
            return null;
        }
        }
        
    
    /**
     * Este método debe de contar cuantas veces una palabra se repite en una oracion
     * @param frase esta variable es la palabra a buscar
     * @param texto este es la variable que recibirá un texto
     * @return debolvera la cantidad de palabras repetidas
     */
    public static int contarCoincidencias(String frase, String texto){
        int cont=0, esp=0;
        String encont;       
        if(texto!=null){
            if(frase.length()<texto.length()){
            for(int pos=frase.length(); pos<=texto.length(); pos++, esp++){
                encont="";
                for(int poss=0+esp; poss<frase.length()+esp; poss++ ){
                    encont=encont+String.valueOf(texto.charAt(poss));
                }
                if(frase.equalsIgnoreCase(encont)){
                    cont=cont+1;
                }
            }
        }
      
        return cont;
        }
        else{
            return 0;
        }
    }
}
