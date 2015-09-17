package com.gigigo.gigigogreenlabs.daggertwoworkshop.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 17/9/15.
 */
@Scope @Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {

}
