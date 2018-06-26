package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {

    // your tests here
    @Test //Esta prueba debe borrarse dado que nunca va a ocurrir, por estar controlado en el código
    public void testGetSummarylargoNulo(){
        Note nota = new Note();
        //nota.setContent("");
        String not1 = nota.getSummary();
        assertEquals(0,not1.length());
    }

   @Test
   public void testGetSummarylargoCero(){
       Note nota = new Note();
       nota.setContent("");
       String not1 = nota.getSummary();
       assertEquals(0,not1.length());
   }

    @Test
    public void testGetSummaryTextOK(){
        Note nota = new Note();
        nota.setContent("Hola mundo");
        String not1 = nota.getSummary();
        assertEquals("Hola mundo",not1);
    }
    @Test
    public void testGetSummaryLargoMax(){
        Note nota = new Note();
        nota.setContent("Hola mundo, como estan todos?");
        String not1 = nota.getSummary();
        assertEquals(15,not1.length());
    }

    @Test
    public void testGetSummarylargoMenora15(){
        //
        Note nota = new Note();
        nota.setContent("Hola mundo");
        String not1 = nota.getSummary();
        assertEquals(10,not1.length());
    }

   // @Test
   // public void testClonarTareaPrueba(){
        //Arrange
     //   Note nota = new Note();
    //    nota.setContent("Hola a todos los de este loco mundo");
     //   nota.setId(99999);
     //   nota.setTimestamp("20/06/2018");
     //   nota.setTitle("PruebaVetuTit");
        //Act
     //   nota.clonarTarea(99999);
        //Assert
    //    assertEquals();
  //  }
}