package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;

public class Music
  extends Activity
  implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, AdapterView.OnItemSelectedListener
{
  AudioManager am;
  Button bBuy;
  Button bStop;
  MediaPlayer chill;
  MediaPlayer daydreaming;
  MediaPlayer digitaltime;
  String entries;
  MediaPlayer happyfeelings;
  MediaPlayer letsmokethis;
  MediaPlayer lickin;
  ImageView mImage;
  MediaPlayer makemeleak;
  SeekBar sb;
  Spinner spinner;
  MediaPlayer toughtitty;
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    this.mImage = ((ImageView)findViewById(2130837508));
    this.bStop = ((Button)findViewById(2131230737));
    this.bBuy = ((Button)findViewById(2131230738));
    this.chill = MediaPlayer.create(this, 2131034112);
    this.letsmokethis = MediaPlayer.create(this, 2131034116);
    this.daydreaming = MediaPlayer.create(this, 2131034113);
    this.lickin = MediaPlayer.create(this, 2131034117);
    this.makemeleak = MediaPlayer.create(this, 2131034118);
    this.happyfeelings = MediaPlayer.create(this, 2131034115);
    this.digitaltime = MediaPlayer.create(this, 2131034114);
    this.toughtitty = MediaPlayer.create(this, 2131034120);
    this.sb = ((SeekBar)findViewById(2131230732));
    this.am = ((AudioManager)getSystemService("audio"));
    int i = this.am.getStreamMaxVolume(3);
    int j = this.am.getStreamVolume(3);
    this.sb.setMax(i);
    this.sb.setProgress(j);
    this.sb.setOnSeekBarChangeListener(this);
    paramBundle = new ArrayAdapter(this, 17367048, new String[] { "Pick a Song", "Chill", "Let's Smoke This", "Lickin'", "Daydreaming", "Making Me Leak", "Happy Feelings", "Digital Time", "Tough Titty" });
    this.spinner = ((Spinner)findViewById(2131230731));
    this.spinner.setAdapter(paramBundle);
    this.spinner.setOnItemSelectedListener(this);
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (this.spinner.getSelectedItemPosition())
    {
    case 0: 
    default: 
      return;
    case 1: 
      if (this.chill.isPlaying())
      {
        this.chill.release();
        return;
      }
      this.chill.start();
      return;
    case 2: 
      if (this.letsmokethis.isPlaying())
      {
        this.letsmokethis.release();
        return;
      }
      this.letsmokethis.start();
      return;
    case 3: 
      if (this.lickin.isPlaying())
      {
        this.lickin.release();
        return;
      }
      this.lickin.start();
      return;
    case 4: 
      if (this.daydreaming.isPlaying())
      {
        this.daydreaming.release();
        return;
      }
      this.daydreaming.start();
      return;
    case 5: 
      if (this.makemeleak.isPlaying())
      {
        this.makemeleak.release();
        return;
      }
      this.makemeleak.start();
      return;
    case 6: 
      if (this.happyfeelings.isPlaying())
      {
        this.happyfeelings.release();
        return;
      }
      this.happyfeelings.start();
      return;
    case 7: 
      if (this.digitaltime.isPlaying())
      {
        this.digitaltime.release();
        return;
      }
      this.digitaltime.start();
      return;
    }
    if (this.toughtitty.isPlaying())
    {
      this.toughtitty.release();
      return;
    }
    this.toughtitty.start();
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void onPause()
  {
    super.onPause();
    this.letsmokethis.release();
    this.lickin.release();
    this.chill.release();
    this.daydreaming.release();
    this.makemeleak.release();
    this.happyfeelings.release();
    this.digitaltime.release();
    this.toughtitty.release();
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    this.am.setStreamVolume(3, paramInt, 0);
  }
  
  public void onResume()
  {
    super.onResume();
    this.spinner.getSelectedItemPosition();
    this.bBuy.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        try
        {
          paramAnonymousView = Class.forName("com.missinlink.keenan.Buy");
          paramAnonymousView = new Intent(Music.this, paramAnonymousView);
          Music.this.startActivity(paramAnonymousView);
          return;
        }
        catch (ClassNotFoundException paramAnonymousView)
        {
          paramAnonymousView.printStackTrace();
        }
      }
    });
    this.bStop.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (Music.this.letsmokethis.isPlaying()) {
          Music.this.letsmokethis.reset();
        }
        do
        {
          return;
          if (Music.this.lickin.isPlaying())
          {
            Music.this.lickin.reset();
            return;
          }
          if (Music.this.chill.isPlaying())
          {
            Music.this.chill.reset();
            return;
          }
          if (Music.this.daydreaming.isPlaying())
          {
            Music.this.daydreaming.reset();
            return;
          }
          if (Music.this.makemeleak.isPlaying())
          {
            Music.this.makemeleak.reset();
            return;
          }
          if (Music.this.happyfeelings.isPlaying())
          {
            Music.this.happyfeelings.reset();
            return;
          }
          if (Music.this.digitaltime.isPlaying())
          {
            Music.this.digitaltime.reset();
            return;
          }
        } while (!Music.this.toughtitty.isPlaying());
        Music.this.toughtitty.reset();
      }
    });
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}
