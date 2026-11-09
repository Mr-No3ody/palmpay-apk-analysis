package androidx.webkit;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes.dex */
public interface WebViewCompat$WebMessageListener {
    @UiThread
    void onPostMessage(WebView webView, h hVar, Uri uri, boolean z3, b bVar);
}
