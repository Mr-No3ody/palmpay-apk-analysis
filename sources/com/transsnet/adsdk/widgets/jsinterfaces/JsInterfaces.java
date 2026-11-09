package com.transsnet.adsdk.widgets.jsinterfaces;

import android.webkit.JavascriptInterface;
import com.transsnet.adsdk.widgets.interfaces.IAppDataInterfaces;

/* JADX INFO: loaded from: classes3.dex */
public class JsInterfaces {
    private IAppDataInterfaces mDataInterfaces;
    private IJsClickListener mJsClickListener;

    public JsInterfaces(IJsClickListener listener) {
        this.mJsClickListener = listener;
    }

    @JavascriptInterface
    public String getAppInfo() {
        IAppDataInterfaces iAppDataInterfaces = this.mDataInterfaces;
        return iAppDataInterfaces != null ? iAppDataInterfaces.getAppInfo() : "";
    }

    @JavascriptInterface
    public void invoke(String param) {
        IJsClickListener iJsClickListener = this.mJsClickListener;
        if (iJsClickListener != null) {
            iJsClickListener.jsOnClickCallback(param);
        }
    }

    public JsInterfaces(IJsClickListener listener, IAppDataInterfaces dataInterfaces) {
        this.mJsClickListener = listener;
        this.mDataInterfaces = dataInterfaces;
    }

    @JavascriptInterface
    public String getAppInfo(String body) {
        IAppDataInterfaces iAppDataInterfaces = this.mDataInterfaces;
        if (iAppDataInterfaces != null) {
            return iAppDataInterfaces.getAppInfo(body);
        }
        return "";
    }
}
