package com.palmpay.lib.webview.offline.monitor.impl;

import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceResponseAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class EnhWebResourceResponseAdapterImpl implements IEnhWebResourceResponseAdapter {

    @Nullable
    private WebResourceResponse smttResponse;

    @Nullable
    private WebResourceResponse webkitResponse;

    public EnhWebResourceResponseAdapterImpl(@Nullable WebResourceResponse webResourceResponse, @Nullable WebResourceResponse webResourceResponse2) {
        this.webkitResponse = webResourceResponse;
        this.smttResponse = webResourceResponse2;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceResponseAdapter
    @Nullable
    public String getReasonPhrase() {
        WebResourceResponse webResourceResponse = this.webkitResponse;
        if (webResourceResponse != null) {
            return webResourceResponse.getReasonPhrase();
        }
        WebResourceResponse webResourceResponse2 = this.smttResponse;
        if (webResourceResponse2 != null) {
            return webResourceResponse2.getReasonPhrase();
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceResponseAdapter
    public int getStatusCode() {
        WebResourceResponse webResourceResponse = this.webkitResponse;
        if (webResourceResponse != null) {
            return webResourceResponse.getStatusCode();
        }
        WebResourceResponse webResourceResponse2 = this.smttResponse;
        if (webResourceResponse2 != null) {
            return webResourceResponse2.getStatusCode();
        }
        return -1;
    }
}
