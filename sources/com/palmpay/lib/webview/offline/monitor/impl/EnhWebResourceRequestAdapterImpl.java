package com.palmpay.lib.webview.offline.monitor.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.annotation.Nullable;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EnhWebResourceRequestAdapterImpl implements IEnhWebResourceRequestAdapter {

    @Nullable
    private WebResourceRequest smttRequest;

    @Nullable
    private WebResourceRequest webkitRequest;

    public EnhWebResourceRequestAdapterImpl(@Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceRequest webResourceRequest2) {
        this.webkitRequest = webResourceRequest;
        this.smttRequest = webResourceRequest2;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter
    @Nullable
    public String getMethod() {
        WebResourceRequest webResourceRequest = this.webkitRequest;
        if (webResourceRequest != null) {
            return webResourceRequest.getMethod();
        }
        WebResourceRequest webResourceRequest2 = this.smttRequest;
        if (webResourceRequest2 != null) {
            return webResourceRequest2.getMethod();
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter
    @Nullable
    public Map<String, String> getRequestHeaders() {
        WebResourceRequest webResourceRequest = this.webkitRequest;
        if (webResourceRequest != null) {
            return webResourceRequest.getRequestHeaders();
        }
        WebResourceRequest webResourceRequest2 = this.smttRequest;
        if (webResourceRequest2 != null) {
            return webResourceRequest2.getRequestHeaders();
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter
    @Nullable
    public Uri getUrl() {
        WebResourceRequest webResourceRequest = this.webkitRequest;
        if (webResourceRequest != null) {
            return webResourceRequest.getUrl();
        }
        WebResourceRequest webResourceRequest2 = this.smttRequest;
        if (webResourceRequest2 != null) {
            return webResourceRequest2.getUrl();
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter
    public boolean hasGesture() {
        WebResourceRequest webResourceRequest = this.webkitRequest;
        if (webResourceRequest != null) {
            return webResourceRequest.hasGesture();
        }
        WebResourceRequest webResourceRequest2 = this.smttRequest;
        if (webResourceRequest2 != null) {
            return webResourceRequest2.hasGesture();
        }
        return false;
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter
    public boolean isForMainFrame() {
        WebResourceRequest webResourceRequest = this.webkitRequest;
        if (webResourceRequest != null) {
            return webResourceRequest.isForMainFrame();
        }
        WebResourceRequest webResourceRequest2 = this.smttRequest;
        if (webResourceRequest2 != null) {
            return webResourceRequest2.isForMainFrame();
        }
        return false;
    }
}
