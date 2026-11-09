package com.palmpay.lib.webview.offline.monitor.base;

/* JADX INFO: loaded from: classes3.dex */
public interface IWebPageStatus {
    void onCacheHit(int i7);

    void onLoadError(IEnhWebResourceRequestAdapter iEnhWebResourceRequestAdapter, IEnhWebResourceErrorAdapter iEnhWebResourceErrorAdapter);

    void onLoadError(IEnhWebResourceRequestAdapter iEnhWebResourceRequestAdapter, IEnhWebResourceResponseAdapter iEnhWebResourceResponseAdapter);

    void onLoadError(String str, String str2);

    void onLoadUrl(String str);

    void onPageLoadFinish(String str, int i7);
}
