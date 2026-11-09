package com.palmpay.lib.webview.container.fast.cookie;

import com.palmpay.lib.webview.container.fast.offline.Destroyable;
import java.util.ArrayList;
import java.util.List;
import okhttp3.CookieJar;

/* JADX INFO: loaded from: classes3.dex */
public class FastCookieManager implements Destroyable {
    private List<CookieInterceptor> mRequestCookieInterceptors;
    private List<CookieInterceptor> mResponseCookieInterceptors;
    private CookieJar mUserCookieJar;

    public static class SingletonHolder {
        private static final FastCookieManager INSTANCE = new FastCookieManager(0);

        private SingletonHolder() {
        }
    }

    public /* synthetic */ FastCookieManager(int i7) {
        this();
    }

    public static FastCookieManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addRequestCookieInterceptor(CookieInterceptor cookieInterceptor) {
        if (this.mRequestCookieInterceptors.contains(cookieInterceptor)) {
            return;
        }
        this.mRequestCookieInterceptors.add(cookieInterceptor);
    }

    public void addResponseCookieInterceptor(CookieInterceptor cookieInterceptor) {
        if (this.mResponseCookieInterceptors.contains(cookieInterceptor)) {
            return;
        }
        this.mResponseCookieInterceptors.add(cookieInterceptor);
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        this.mRequestCookieInterceptors.clear();
        this.mResponseCookieInterceptors.clear();
        this.mUserCookieJar = null;
    }

    public CookieJar getCookieJar() {
        CookieJar cookieJar = this.mUserCookieJar;
        return cookieJar != null ? cookieJar : new CookieJarImpl();
    }

    public List<CookieInterceptor> getRequestCookieInterceptors() {
        return this.mRequestCookieInterceptors;
    }

    public List<CookieInterceptor> getResponseCookieInterceptors() {
        return this.mResponseCookieInterceptors;
    }

    public void setCookieJar(CookieJar cookieJar) {
        this.mUserCookieJar = cookieJar;
    }

    private FastCookieManager() {
        this.mRequestCookieInterceptors = new ArrayList();
        this.mResponseCookieInterceptors = new ArrayList();
    }
}
