package com.palmpay.lib.webview.container.fast.cookie;

import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.C1951t;
import okhttp3.CookieJar;
import okhttp3.J;

/* JADX INFO: loaded from: classes3.dex */
public class CookieJarImpl implements CookieJar {
    private FastCookieManager mCookieManager = FastCookieManager.getInstance();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<okhttp3.t>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.palmpay.lib.webview.container.fast.cookie.CookieInterceptor] */
    @Override // okhttp3.CookieJar
    @NonNull
    public synchronized List<C1951t> loadForRequest(J j6) {
        ?? arrayList;
        try {
            arrayList = new ArrayList();
            String cookie = CookieManager.getInstance().getCookie(j6.f40582d);
            if (!TextUtils.isEmpty(cookie)) {
                for (String str : cookie.split(";")) {
                    C1951t c1951t = C1951t.f40977j.parse(j6, str);
                    if (c1951t != null) {
                        arrayList.add(c1951t);
                    }
                }
            }
            List<CookieInterceptor> responseCookieInterceptors = this.mCookieManager.getResponseCookieInterceptors();
            if (responseCookieInterceptors != null && !responseCookieInterceptors.isEmpty()) {
                Iterator<CookieInterceptor> it = responseCookieInterceptors.iterator();
                arrayList = arrayList;
                while (it.hasNext()) {
                    arrayList = it.next().newCookies(j6, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(J j6, List<C1951t> list) {
        try {
            List<CookieInterceptor> requestCookieInterceptors = this.mCookieManager.getRequestCookieInterceptors();
            if (requestCookieInterceptors != null && !requestCookieInterceptors.isEmpty()) {
                Iterator<CookieInterceptor> it = requestCookieInterceptors.iterator();
                while (it.hasNext()) {
                    list = it.next().newCookies(j6, list);
                }
            }
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            Iterator<C1951t> it2 = list.iterator();
            while (it2.hasNext()) {
                cookieManager.setCookie(j6.f40587i, it2.next().a(false));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
