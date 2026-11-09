package com.palmpay.lib.webview.container;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.camera.video.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LoadJsHolder {
    private final WebView mWebView;

    public LoadJsHolder(WebView webView) {
        this.mWebView = webView;
    }

    private String concat(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            if (isJson(str)) {
                sb2.append(str);
            } else {
                u.w(sb2, "\"", str, "\"");
            }
            if (i7 != strArr.length - 1) {
                sb2.append(" , ");
            }
        }
        return sb2.toString();
    }

    @RequiresApi(api = 19)
    private void evaluateJs(String str, final ValueCallback<String> valueCallback) {
        this.mWebView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.palmpay.lib.webview.container.LoadJsHolder.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(str2);
                }
            }
        });
    }

    public static boolean isJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.startsWith("[")) {
                new JSONArray(str);
                return true;
            }
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public void loadJs(String str, ValueCallback<String> valueCallback) {
        evaluateJs(str, valueCallback);
    }

    public void quickCallJs(String str, ValueCallback<String> valueCallback, String... strArr) {
        StringBuilder sb2 = new StringBuilder("javascript:");
        sb2.append(str);
        if (strArr == null || strArr.length == 0) {
            sb2.append("()");
        } else {
            sb2.append("(");
            sb2.append(concat(strArr));
            sb2.append(")");
        }
        loadJs(sb2.toString(), valueCallback);
    }

    public void loadJs(String str) {
        loadJs(str, null);
    }

    public void quickCallJs(String str, String... strArr) {
        quickCallJs(str, null, strArr);
    }

    public void quickCallJs(String str) {
        quickCallJs(str, null);
    }
}
