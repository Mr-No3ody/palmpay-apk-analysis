package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.transsnet.palmpay.core.web.JsInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ActivityWebView extends WebView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28200e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JsInterface.JsCallback f28201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Callback f28202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f28204d;

    public interface Callback {
        default void openCustomerService(Bundle bundle) {
        }
    }

    public ActivityWebView(Context context) {
        super(context);
        getContext();
        a();
    }

    public final void a() {
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(new a(this), "palmpay");
        getSettings().setCacheMode(-1);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        if (Build.VERSION.SDK_INT < 29) {
            getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        }
        getSettings().setDomStorageEnabled(true);
        getSettings().setDatabaseEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setTextZoom(100);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        this.f28204d = str;
        super.loadUrl(str);
    }

    public void setBusinessData(String businessData) {
        this.f28203c = businessData;
    }

    public void setJsCallback(JsInterface.JsCallback callback) {
        this.f28201a = callback;
    }

    public void setWebCallBack(Callback webCallBack) {
        this.f28202b = webCallBack;
    }

    public ActivityWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        getContext();
        a();
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        this.f28204d = str;
        super.loadUrl(str, map);
    }

    public ActivityWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        getContext();
        a();
    }
}
