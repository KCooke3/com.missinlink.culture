package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView.BufferType;

public class Email
  extends Activity
  implements View.OnClickListener
{
  Button MenuButton;
  String beginning;
  String emailAdd;
  EditText intro;
  EditText personsEmail;
  Button sendEmail;
  
  private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated()
  {
    this.emailAdd = this.personsEmail.getText().toString();
    this.beginning = this.intro.getText().toString();
  }
  
  private void initializeVars()
  {
    this.personsEmail = ((EditText)findViewById(2131230721));
    this.personsEmail.setText("LincolnTramble@gmail.com", TextView.BufferType.EDITABLE);
    this.intro = ((EditText)findViewById(2131230722));
    this.sendEmail = ((Button)findViewById(2131230723));
    this.MenuButton = ((Button)findViewById(2131230725));
  }
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    initializeVars();
    this.sendEmail.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Email.this.convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
        paramAnonymousView = Email.this.emailAdd;
        String str = Email.this.beginning;
        Intent localIntent = new Intent("android.intent.action.SEND");
        localIntent.putExtra("android.intent.extra.EMAIL", new String[] { paramAnonymousView });
        localIntent.putExtra("android.intent.extra.SUBJECT", "From the Missin MF Link's Android App ");
        localIntent.setType("plain/text");
        localIntent.putExtra("android.intent.extra.TEXT", str);
        Email.this.startActivity(localIntent);
      }
    });
    this.MenuButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        try
        {
          paramAnonymousView = Class.forName("com.missinlink.keenan.menu");
          paramAnonymousView = new Intent(Email.this, paramAnonymousView);
          Email.this.startActivity(paramAnonymousView);
          return;
        }
        catch (ClassNotFoundException paramAnonymousView)
        {
          paramAnonymousView.printStackTrace();
        }
      }
    });
  }
  
  protected void onPause()
  {
    super.onPause();
    finish();
  }
}
