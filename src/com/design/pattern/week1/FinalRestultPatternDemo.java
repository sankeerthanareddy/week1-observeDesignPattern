/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.pattern.week1;
public class FinalRestultPatternDemo {
   public static void main(String[] args) {
      Solution solution = new Solution();

      new HexaDecimalPattern(solution);
      new OctalDecimalTest(solution);
      new BinaryTest(solution);

      System.out.println("First state value in integer: 26");	
      solution.setState(26);
      System.out.println("Second state value in integer: 90");	
      solution.setState(90);
   }
}