package com.gigigo.gigigogreenlabs.daggertwoworkshop.main;

import com.gigigo.gigigogreenlabs.daggertwoworkshop.base.AppComponent;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.scopes.PerActivity;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 17/9/15.
 */
@PerActivity @Subcomponent(modules = SecondActivityModule.class)
public interface SecondActivityComponent {
  void injectActivity(SecondActivity secondActivity);
}
