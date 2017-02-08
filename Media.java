package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Media
  extends Activity
  implements View.OnClickListener
{
  private void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    paramOnClickListener = Uri.parse("http://www.youtube.com/watch?v=b83Icn39lpE");
    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:" + paramOnClickListener.getQueryParameter("v"))));
  }
  
  public void onClick(View paramView) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = Uri.parse("http://www.youtube.com/watch?v=opZ69P-0Jbc");
        paramAnonymousView = new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:" + paramAnonymousView.getQueryParameter("v")));
        Media.this.startActivity(paramAnonymousView);
      }
    });
  }
  
  protected void onPause()
  {
    super.onPause();
    finish();
  }
}
