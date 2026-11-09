package com.palmpay.lib.webview.offline.monitor.impl;

import android.webkit.WebResourceError;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceErrorAdapter;

/* JADX INFO: loaded from: classes3.dex */
public class EnhWebResourceErrorAdapterImpl extends IEnhWebResourceErrorAdapter {
    private WebResourceError smttError;
    private WebResourceError webkitError;

    public EnhWebResourceErrorAdapterImpl(WebResourceError webResourceError, WebResourceError webResourceError2) {
        this.webkitError = webResourceError;
        this.smttError = webResourceError2;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceErrorAdapter
    public String getDescription() {
        WebResourceError webResourceError = this.webkitError;
        if (webResourceError != null) {
            return webResourceError.getDescription().toString();
        }
        WebResourceError webResourceError2 = this.smttError;
        if (webResourceError2 != null) {
            return webResourceError2.getDescription().toString();
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceErrorAdapter
    public int getErrorCode() {
        WebResourceError webResourceError = this.webkitError;
        if (webResourceError != null) {
            return webResourceError.getErrorCode();
        }
        WebResourceError webResourceError2 = this.smttError;
        if (webResourceError2 != null) {
            return webResourceError2.getErrorCode();
        }
        return -1;
    }
}
