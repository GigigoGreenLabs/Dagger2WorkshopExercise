package com.gigigo.gigigogreenlabs.daggertwoworkshop.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.R;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.base.App;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.base.AppComponent;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.test.A;
import com.gigigo.gigigogreenlabs.daggertwoworkshop.test.B;
import javax.inject.Inject;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 17/9/15.
 */
public class SecondActivity extends AppCompatActivity {

  @Inject A a;
  @Inject B b;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initDI();
    Log.i("TAG", "TEXTO ACTIVITY--> " + a.getText());
    Log.i("TAG", "TEXTO ACTIVITY B--> " + b.getText());
  }

  private void initDI() {
    App app = (App)getApplicationContext();
    AppComponent appComponent = app.getAppComponent();
    SecondActivityComponent secondActivityComponent = appComponent.plus(new SecondActivityModule());
    secondActivityComponent.injectActivity(this);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
