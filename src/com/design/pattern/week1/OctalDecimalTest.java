/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.week1;

public class OctalDecimalTest extends FinalResult{

   public OctalDecimalTest(Solution subject){
      this.solution = subject;
      this.solution.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal decimal value in String: " + Integer.toOctalString( solution.getState() ) ); 
   }
}