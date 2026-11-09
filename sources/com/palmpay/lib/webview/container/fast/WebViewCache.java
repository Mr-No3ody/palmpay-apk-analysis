package com.palmpay.lib.webview.container.fast;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.palmpay.lib.webview.container.fast.offline.Destroyable;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewCache extends FastOpenApi, Destroyable {
    public static final int DISK_CACHE_MODE = 2;
    public static final int HTTP_CACHE_MODE = 3;
    public static final int MEM_CACHE_MODE = 1;
    public static final String SOURCE_DISK_CACHE = "file";
    public static final String SOURCE_MEMORY_CACHE = "memory";
    public static final String SOURCE_OKHTTP_CACHE = "okhttp_cache";
    public static final String SOURCE_OKHTTP_NETWORK = "okhttp_network";
    public static final String SOURCE_OKHTTP_REVALIDATION = "revalidation";
    public static final String SOURCE_UNKNOW = "unknow";

    WebResourceResponse getResource(WebResourceRequest webResourceRequest, int i7, String str);
}
