package com.palmpay.lib.webview.container.fast.offline;

import com.palmpay.lib.webview.container.fast.utils.MD5Utils;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CacheRequest {
    private boolean forceMode;
    private boolean isForFrame;
    private boolean isRedirect;
    private String key;
    private Map<String, String> mHeaders;
    private String mUserAgent;
    private int mWebViewCacheMode;
    private String method;
    private String mime;
    private String url;

    public static String generateKey(String str) {
        return MD5Utils.getMD5(URLEncoder.encode(str), false);
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public String getKey() {
        return this.key;
    }

    public String getMethod() {
        return this.method;
    }

    public String getMime() {
        return this.mime;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserAgent() {
        return this.mUserAgent;
    }

    public int getWebViewCacheMode() {
        return this.mWebViewCacheMode;
    }

    public boolean isForFrame() {
        return this.isForFrame;
    }

    public boolean isForceMode() {
        return this.forceMode;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setForFrame(boolean z3) {
        this.isForFrame = z3;
    }

    public void setForceMode(boolean z3) {
        this.forceMode = z3;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setRedirect(boolean z3) {
        this.isRedirect = z3;
    }

    public void setUrl(String str) {
        this.url = str;
        this.key = generateKey(str);
    }

    public void setUserAgent(String str) {
        this.mUserAgent = str;
    }

    public void setWebViewCacheMode(int i7) {
        this.mWebViewCacheMode = i7;
    }
}
