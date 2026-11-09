package okhttp3;

import N8.q0;
import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f40680a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f40683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f40684e = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40681b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F1.b f40682c = new F1.b(3);

    public final void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f40682c.b(name, value);
    }

    public final Y b() {
        Map mapUnmodifiableMap;
        J j6 = this.f40680a;
        if (j6 == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f40681b;
        F fH = this.f40682c.h();
        c0 c0Var = this.f40683d;
        LinkedHashMap linkedHashMap = this.f40684e;
        byte[] bArr = Dg.c.f1879a;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = kotlin.collections.G.c();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new Y(j6, str, fH, c0Var, mapUnmodifiableMap);
    }

    public final void c(C1943k cacheControl) {
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            i(HttpHeaders.CACHE_CONTROL);
        } else {
            e(HttpHeaders.CACHE_CONTROL, string);
        }
    }

    public final void d() {
        g("GET", null);
    }

    public final void e(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        F1.b bVar = this.f40682c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        E e10 = F.f40566b;
        e10.checkName(name);
        e10.checkValue(value, name);
        bVar.j(name);
        bVar.d(name, value);
    }

    public final void f(F headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f40682c = headers.d();
    }

    public final void g(String method, c0 c0Var) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (c0Var == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(q0.k("method ", method, " must have a request body.").toString());
            }
        } else if (!p377z5.l.A(method)) {
            throw new IllegalArgumentException(q0.k("method ", method, " must not have a request body.").toString());
        }
        this.f40681b = method;
        this.f40683d = c0Var;
    }

    public final void h(c0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        g("POST", body);
    }

    public final void i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f40682c.j(name);
    }

    public final void j(Class type, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (obj == null) {
            this.f40684e.remove(type);
            return;
        }
        if (this.f40684e.isEmpty()) {
            this.f40684e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.f40684e;
        Object objCast = type.cast(obj);
        Intrinsics.e(objCast);
        linkedHashMap.put(type, objCast);
    }

    public final void k(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.text.y.m(url, "ws:", true)) {
            StringBuilder sb2 = new StringBuilder("http:");
            String strSubstring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring);
            url = sb2.toString();
        } else if (kotlin.text.y.m(url, "wss:", true)) {
            StringBuilder sb3 = new StringBuilder("https:");
            String strSubstring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb3.append(strSubstring2);
            url = sb3.toString();
        }
        J url2 = J.f40577k.get(url);
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f40680a = url2;
    }

    public final void l(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        I i7 = J.f40577k;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
        J url2 = i7.get(string);
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f40680a = url2;
    }
}
