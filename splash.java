package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class splash
  extends Activity
{
  MediaPlayer splashmusic;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903049);
    this.splashmusic = MediaPlayer.create(this, 2131034119);
    this.splashmusic.start();
    new Thread()
    {
      public void run()
      {
        try
        {
          sleep(11750L);
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
          Intent localIntent3 = new Intent("com.missinlink.keenan.MENU");
          splash.this.startActivity(localIntent3);
        }
      }
    }.start();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.splashmusic.release();
    finish();
  }
}
