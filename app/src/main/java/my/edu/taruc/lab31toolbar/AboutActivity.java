package my.edu.taruc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webview = new WebView(this);
        setContentView(webview);

        WebView webViewAbout = (WebView)findViewById(R.id.webViewAbout);

        webview.loadUrl("https://www.google.com/");

        //String summary = "<html><body>You scored <b>192</b> points.</body></html>";
        //webview.loadData(summary, "text/html", null);

    }
}
