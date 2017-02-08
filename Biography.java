package com.missinlink.keenan;

import android.os.Bundle;
import com.phonegap.DroidGap;

public class Biography
  extends DroidGap
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.loadUrl("file:///android_asset/www/bio.html");
  }
}
