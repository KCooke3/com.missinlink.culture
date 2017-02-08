package com.phonegap.api;

import android.app.Activity;
import android.content.Intent;

public abstract class PhonegapActivity
  extends Activity
{
  public abstract void addService(String paramString1, String paramString2);
  
  public abstract void loadUrl(String paramString);
  
  public abstract void sendJavascript(String paramString);
  
  public abstract void setActivityResultCallback(IPlugin paramIPlugin);
  
  public abstract void startActivityForResult(IPlugin paramIPlugin, Intent paramIntent, int paramInt);
}
