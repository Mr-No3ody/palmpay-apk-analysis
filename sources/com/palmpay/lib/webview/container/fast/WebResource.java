package com.palmpay.lib.webview.container.fast;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class WebResource {
    private int cacheMode;
    private byte[] originBytes;
    private String reasonPhrase;
    private int responseCode;
    private Map<String, String> responseHeaders;
    private boolean isModified = true;
    private boolean isCacheByOurselves = false;

    public int getCacheMode() {
        return this.cacheMode;
    }

    public byte[] getOriginBytes() {
        return this.originBytes;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public boolean isCacheByOurselves() {
        return this.isCacheByOurselves;
    }

    public boolean isCacheable() {
        int i7 = this.responseCode;
        return i7 == 200 || i7 == 203 || i7 == 204 || i7 == 300 || i7 == 301 || i7 == 404 || i7 == 405 || i7 == 410 || i7 == 414 || i7 == 501 || i7 == 308;
    }

    public boolean isModified() {
        return this.isModified;
    }

    public void setCacheByOurselves(boolean z3) {
        this.isCacheByOurselves = z3;
    }

    public void setCacheMode(int i7) {
        this.cacheMode = i7;
    }

    public void setModified(boolean z3) {
        this.isModified = z3;
    }

    public void setOriginBytes(byte[] bArr) {
        this.originBytes = bArr;
    }

    public void setReasonPhrase(String str) {
        this.reasonPhrase = str;
    }

    public void setResponseCode(int i7) {
        this.responseCode = i7;
    }

    public void setResponseHeaders(Map<String, String> map) {
        this.responseHeaders = map;
    }
}
