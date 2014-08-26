package com.example.webview;
import com.example.webview.R;
import android.webkit.GeolocationPermissions;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class rating extends Activity {
	private WebView webView;

	
	
	@SuppressLint("SetJavaScriptEnabled")
	public void onCreate(Bundle savedInstanceState) {

		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rating);

		webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://192.168.1.100/nz/rate.php");
		webView.getSettings().setGeolocationDatabasePath(getString(R.string._data_data_chchnightlife));
		webView.getSettings().setAppCacheEnabled(true);
		webView.getSettings().setDatabaseEnabled(true);
		webView.getSettings().setDomStorageEnabled(true);
		
		webView.setWebChromeClient(new WebChromeClient(){
			  public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
			    // callback.invoke(String origin, boolean allow, boolean remember);
			    callback.invoke(origin, true, false);
			  }
			}
		
		);
	//	webView.setWebChromeClient(new WebChromeClient());
	//	webView.setWebViewClient(new WebViewClient());


	}
}
