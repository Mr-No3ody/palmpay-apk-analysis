package com.palmpay.lib.webview;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.ViewGroup;
import com.palmpay.lib.webview.dsbridge.DWebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewPool {
    private static List<DWebView> sAvailable;
    private static WebViewPool sInstance;
    private Context mContext;
    private int mPoolSize = 2;
    private boolean init = false;

    private WebViewPool() {
        sAvailable = new ArrayList();
    }

    public static WebViewPool getInstance() {
        if (sInstance == null) {
            synchronized (WebViewPool.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new WebViewPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public synchronized DWebView getWebView(Context context) {
        DWebView dWebView;
        try {
            if (!this.init) {
                initWebViewPool(context);
            }
            if (sAvailable.size() > 0) {
                dWebView = sAvailable.get(0);
                sAvailable.remove(0);
            } else {
                dWebView = new DWebView(new MutableContextWrapper(this.mContext));
            }
            if (dWebView.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) dWebView.getContext()).setBaseContext(context);
            }
            dWebView.getSettings().setCacheMode(2);
            dWebView.loadUrl("about:blank");
        } catch (Throwable th) {
            throw th;
        }
        return dWebView;
    }

    public void initWebViewPool(Context context) {
        this.init = true;
        this.mContext = context.getApplicationContext();
        for (int i7 = 0; i7 < this.mPoolSize; i7++) {
            sAvailable.add(new DWebView(new MutableContextWrapper(this.mContext)));
        }
    }

    public synchronized void resetWebView(DWebView dWebView) {
        try {
            ((MutableContextWrapper) dWebView.getContext()).setBaseContext(this.mContext);
            if (dWebView.getParent() != null) {
                ((ViewGroup) dWebView.getParent()).removeView(dWebView);
            }
            dWebView.removeAllJavascriptObject();
            dWebView.stopLoading();
            dWebView.loadUrl("about:blank");
            dWebView.clearHistory();
            dWebView.setWebViewClient(null);
            dWebView.setWebChromeClient(null);
            if (sAvailable.size() < this.mPoolSize) {
                sAvailable.add(dWebView);
            } else {
                dWebView.removeAllViews();
                dWebView.destroy();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMaxSize(int i7) {
        this.mPoolSize = i7;
    }
}
