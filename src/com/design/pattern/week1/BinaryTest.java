/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.week1;

public class BinaryTest extends FinalResult{

   public BinaryTest(Solution solution){
      this.solution = solution;
      this.solution.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary decimal value in String: " + Integer.toBinaryString( solution.getState() ) ); 
   }
}
