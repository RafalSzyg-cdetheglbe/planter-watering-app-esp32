package com.example.plantwatcher.services.interfaces;

import com.example.plantwatcher.models.Insolation;

public interface InsolationInterface {

   public void postInsolationRead(int insolationRead);
   public Insolation getAllInsolationDataOfLastReading();
}
