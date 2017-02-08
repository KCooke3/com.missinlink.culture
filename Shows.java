package com.missinlink.keenan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Shows
  extends Activity
  implements View.OnClickListener
{
  WebView webview;
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903048);
    this.webview = ((WebView)findViewById(2131230739));
    this.webview.getSettings().setJavaScriptEnabled(true);
    this.webview.getSettings().setLoadWithOverviewMode(true);
    this.webview.getSettings().setUseWideViewPort(true);
    try
    {
      this.webview.loadUrl("http://www.themissinlink.com/tourdates/");
      return;
    }
    catch (Exception paramBundle)
    {
      paramBundle.printStackTrace();
    }
  }
}
