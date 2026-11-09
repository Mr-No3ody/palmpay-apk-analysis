package mono.connect.kit;

import R3.a;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AbstractActivityC0837o;
import org.json.JSONException;
import org.json.JSONObject;
import p258qg.b;
import p273rg.c;

/* JADX INFO: loaded from: classes4.dex */
public class ConnectKitActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressBar f39792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f39793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f39794c = new a(this, 3);

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        setContentView(b.main);
        WebView webView = (WebView) findViewById(p258qg.a.connect_web_view);
        this.f39792a = (ProgressBar) findViewById(p258qg.a.connect_loader);
        this.f39793b = findViewById(p258qg.a.progress_container);
        String stringExtra = getIntent().getStringExtra("mono.connect.widget.url");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.setWebViewClient(this.f39794c);
        c cVarA = c.a();
        cVarA.f41990e = this;
        webView.addJavascriptInterface(cVarA, "MonoClientInterface");
        webView.loadUrl(stringExtra);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            String str = cVarA.f41989d;
            if (str == null) {
                str = null;
            }
            if (str != null) {
                jSONObject.put("reference", str);
                jSONObject.put("type", "mono.connect.widget_opened");
            }
            p273rg.a aVar = new p273rg.a("OPENED", jSONObject);
            p184m8.b bVar = cVarA.f41988c;
            if (bVar != null) {
                bVar.run(aVar);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
