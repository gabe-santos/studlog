package com.ex;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MainController {

  // TODO: in here figure out how to set pane visibility to hidden and visible when you hit delete and duplicate
  // also calculate units is where we can try to get unit values from all choiceboxes and create a new scene with
  // the returned hours needed to study.

  public void duplicatePane(){
    System.out.println("Duplicate Pane Here");
  }
  // most likely will have to add ActionEvent to the method. having it blank at the moment doesnt do anything
  // except print to console.
  public void deletePane(){
    System.out.println("Delete Pane Here");
  }

  public void calculateUnits(){
    System.out.println("Calculate Units Here");
  }
}
