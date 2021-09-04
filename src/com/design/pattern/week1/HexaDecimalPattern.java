/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.week1;

public class HexaDecimalPattern extends FinalResult{

   public HexaDecimalPattern(Solution solution){
      this.solution = solution;
      this.solution.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hexdecimal value in  String: " + Integer.toHexString( solution.getState() ).toUpperCase() ); 
   }
}