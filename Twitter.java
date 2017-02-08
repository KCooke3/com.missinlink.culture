package com.missinlink.keenan;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class Twitter
  extends ListActivity
{
  private ArrayList<Tweet> loadTweets()
  {
    localArrayList = new ArrayList();
    try
    {
      Object localObject = new DefaultHttpClient().execute(new HttpGet("http://search.twitter.com/search.json?q=the_missinlink"));
      if (((HttpResponse)localObject).getStatusLine().getStatusCode() == 200)
      {
        localObject = new JSONObject(EntityUtils.toString(((HttpResponse)localObject).getEntity())).getJSONArray("results");
        int i = 0;
        for (;;)
        {
          if (i >= ((JSONArray)localObject).length()) {
            return localArrayList;
          }
          JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
          Tweet localTweet = new Tweet();
          localTweet.content = localJSONObject.getString("text");
          localTweet.author = localJSONObject.getString("from_user");
          localArrayList.add(localTweet);
          i += 1;
        }
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      Log.e("Twitter", "Error loading JSON", localException);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Tweet();
    new ArrayList().add(paramBundle);
    setListAdapter(new TweetListAdaptor(this, 2130903050, loadTweets()));
  }
  
  private class TweetListAdaptor
    extends ArrayAdapter<Tweet>
  {
    private ArrayList<Tweet> tweets;
    
    public TweetListAdaptor(int paramInt, ArrayList<Tweet> paramArrayList)
    {
      super(paramArrayList, localList);
      this.tweets = localList;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      paramView = paramViewGroup;
      if (paramViewGroup == null) {
        paramView = ((LayoutInflater)Twitter.this.getSystemService("layout_inflater")).inflate(2130903050, null);
      }
      paramViewGroup = (Tweet)this.tweets.get(paramInt);
      TextView localTextView1 = (TextView)paramView.findViewById(2131230740);
      TextView localTextView2 = (TextView)paramView.findViewById(2131230741);
      localTextView1.setText(paramViewGroup.content);
      localTextView2.setText(paramViewGroup.author);
      return paramView;
    }
  }
}
