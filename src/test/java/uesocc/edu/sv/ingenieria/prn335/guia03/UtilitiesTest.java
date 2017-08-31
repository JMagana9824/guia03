/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import static jdk.nashorn.internal.objects.NativeRegExp.test;
import junit.framework.Assert;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author usuario
 */

@RunWith(Arquillian.class)
public class UtilitiesTest {
    
    @Deployment
    public static WebArchive deploy(){
        WebArchive salida= ShrinkWrap.create(WebArchive.class).addClass(Utilities.class).addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    
    @Test
    public void testgetResume(){
        String texto="Bienvenidos a la mat";
        String resultado;
        resultado=Utilities.getResume("Bienvenidos a la materia de Programación 3 Ciclo II 2017");
        Assert.assertEquals(texto, resultado);
    }
    
    @Test
    public void testgetResume1(){
        String texto="Hola Mundo!";
        String resultado;
        resultado=Utilities.getResume("Hola Mundo!");
        Assert.assertEquals(texto, resultado);
    }
    @Test
    public void testgetResume2(){
        String texto=null;
        String resultado;
        resultado=Utilities.getResume(null);
        Assert.assertEquals(texto, resultado);
    }
    
    @Test
    public void testcapitalizar(){
        String texto="Pruebas De Unidad Con Junit & Arquillian";
        String resultado;
        resultado=Utilities.capitalizar("prueBas   de UNIDAD    con JUnit & arQuillian");
        Assert.assertEquals(texto, resultado);
    }
    @Test
    public void testcapitalizar1(){
        String texto="";
        String resultado;
        resultado=Utilities.capitalizar("");
        Assert.assertEquals(texto, resultado);
    }
    @Test
    public void testcapitalizar2(){
        String texto=null;
        String resultado;
        resultado=Utilities.capitalizar(null);
        Assert.assertEquals(texto, resultado);
       
    }
    
    @Test
    public void testcontarCoincidencias(){
        int querido=1;
        String texto="Bienvenidos a la materia de Programación 3 Ciclo II 2017";
        int resultado;
        resultado=Utilities.contarCoincidencias("2017", texto);
        Assert.assertEquals(querido, resultado);
        }
    @Test
    public void testcontarCoincidencias1(){
        int querido=2;
        String texto="Bienvenidos a la materia de Programación 3 Ciclo II 2017";
        int resultado;
        resultado=Utilities.contarCoincidencias("MA", texto);
        Assert.assertEquals(querido, resultado);
        }
    @Test
    public void testcontarCoincidencias2(){
        int querido=0;
        String texto="null";
        int resultado;
        resultado=Utilities.contarCoincidencias("bienvenido", texto);
        Assert.assertEquals(querido, resultado);
        }
    
   
    
}
