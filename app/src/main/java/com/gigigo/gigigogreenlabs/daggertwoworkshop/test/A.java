package com.gigigo.gigigogreenlabs.daggertwoworkshop.test;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 17/9/15.
 */
public class A {

  private  String text = "";

  public A() {
    text = "Hola mundo";
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
