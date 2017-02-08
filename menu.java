package com.missinlink.keenan;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu
  extends ListActivity
{
  String[] classes = { "Music", "Biography", "Shows", "Twitter", "Facebook", "Email", "Media", "Website" };
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setListAdapter(new ArrayAdapter(this, 17367043, this.classes));
  }
  
  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(paramListView, paramView, paramInt, paramLong);
    paramListView = this.classes[paramInt];
    try
    {
      startActivity(new Intent(this, Class.forName("com.missinlink.keenan." + paramListView)));
      return;
    }
    catch (ClassNotFoundException paramListView)
    {
      paramListView.printStackTrace();
    }
  }
}
