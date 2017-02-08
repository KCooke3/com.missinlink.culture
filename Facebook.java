package com.missinlink.keenan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Facebook
  extends Activity
  implements View.OnClickListener
{
  EditText url;
  WebView webview;
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131230726: 
    case 2131230727: 
      do
      {
        do
        {
          return;
        } while (!this.webview.canGoBack());
        this.webview.goBack();
        return;
      } while (!this.webview.canGoForward());
      this.webview.goForward();
      return;
    }
    this.webview.reload();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903043);
    this.webview = ((WebView)findViewById(2131230729));
    this.webview.getSettings().setJavaScriptEnabled(true);
    this.webview.getSettings().setLoadWithOverviewMode(true);
    this.webview.getSettings().setUseWideViewPort(true);
    try
    {
      this.webview.loadUrl("http://www.facebook.com/pages/Missin-MF-Link/257317548706");
      paramBundle = (Button)findViewById(2131230726);
      Button localButton1 = (Button)findViewById(2131230727);
      Button localButton2 = (Button)findViewById(2131230728);
      paramBundle.setOnClickListener(this);
      localButton1.setOnClickListener(this);
      localButton2.setOnClickListener(this);
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        paramBundle.printStackTrace();
      }
    }
  }
}
