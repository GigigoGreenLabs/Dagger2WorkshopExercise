package com.gigigo.gigigogreenlabs.daggertwoworkshop.main;

import com.gigigo.gigigogreenlabs.daggertwoworkshop.base.AppComponent;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.scopes.PerActivity;
import dagger.Component;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 17/9/15.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
  void injectActivity(MainActivity mainActivity);
}
