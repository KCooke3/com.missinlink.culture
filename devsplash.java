package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class devsplash
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    new Thread()
    {
      public void run()
      {
        try
        {
          sleep(3000L);
          Intent localIntent1;
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          Intent localIntent2;
          return;
        }
        finally
        {
          Intent localIntent3 = new Intent("com.missinlink.keenan.SPLASH");
          devsplash.this.startActivity(localIntent3);
        }
      }
    }.start();
  }
  
  protected void onPause()
  {
    super.onPause();
    finish();
  }
}
