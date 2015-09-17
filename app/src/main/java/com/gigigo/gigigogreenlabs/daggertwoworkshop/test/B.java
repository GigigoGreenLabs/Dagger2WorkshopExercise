package com.gigigo.gigigogreenlabs.daggertwoworkshop.test;

import javax.inject.Inject;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 17/9/15.
 */
public class B {

  String text = "";

  @Inject public B() {
    this.text = "Hola mundo B";
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
