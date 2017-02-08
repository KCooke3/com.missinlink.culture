package com.missinlink.keenan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Website
  extends Activity
  implements View.OnClickListener
{
  WebView webview;
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903051);
    this.webview = ((WebView)findViewById(2131230742));
    this.webview.getSettings().setJavaScriptEnabled(true);
    this.webview.getSettings().setLoadWithOverviewMode(true);
    this.webview.getSettings().setUseWideViewPort(true);
    try
    {
      this.webview.loadUrl("http://www.themissinlink.com/");
      return;
    }
    catch (Exception paramBundle)
    {
      paramBundle.printStackTrace();
    }
  }
}
