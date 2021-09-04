
package com.design.pattern.week1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
   private List<FinalResult> observers = new ArrayList<FinalResult>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(FinalResult result){
      observers.add(result);		
   }

   public void notifyAllObservers(){
      for (FinalResult observer : observers) {
         observer.update();
      }
   } 	
}

