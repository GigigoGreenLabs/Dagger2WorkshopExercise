/*
 *
 *  Copyright (C) 2015 Gigigo Green Labs Open Source Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.gigigo.gigigogreenlabs.daggertwoworkshop.base;

import android.app.Application;

/**
 * Created by Gigigo Green Labs
 * Date 9/9/15.
 */
public class App extends Application{

  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();

    initDI();

  }

  private void initDI() {
    appComponent = DaggerAppComponent.create();

    /** DaggerAppComponent.create() is equivalent to :
     * DaggerAppComponent.builder().appModule(new AppModule()).build()
     * when module has not arguments
     **/

    appComponent.inject(this);
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }
}
