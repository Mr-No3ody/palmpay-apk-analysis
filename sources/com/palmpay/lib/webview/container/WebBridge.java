package com.palmpay.lib.webview.container;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridgewrapper.DefaultBridge;
import com.palmpay.lib.webview.dsbridge.CompletionHandler;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class WebBridge {
    private final Activity activity;

    public WebBridge(Activity activity) {
        this.activity = activity;
    }

    @JavascriptInterface
    public void bridgeToNative(Object obj, final CompletionHandler<String> completionHandler) {
        if (obj instanceof JSONObject) {
            new DefaultBridge().b2n(this.activity, obj.toString(), new IBridgeCallback() { // from class: com.palmpay.lib.webview.container.WebBridge.1
                @Override // com.palmpay.lib.bridge.IBridgeCallback
                public void resolved(@NonNull String str) {
                    completionHandler.complete(str);
                }
            });
        }
    }
}
