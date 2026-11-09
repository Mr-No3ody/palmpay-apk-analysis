package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.C1951t;
import okhttp3.CookieJar;
import okhttp3.E;
import okhttp3.F;
import okhttp3.J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/network/ReactCookieJarContainer;", "Lcom/facebook/react/modules/network/CookieJarContainer;", "<init>", "()V", "Lokhttp3/CookieJar;", "cookieJar", "", "setCookieJar", "(Lokhttp3/CookieJar;)V", "removeCookieJar", "Lokhttp3/J;", "url", "", "Lokhttp3/t;", "cookies", "saveFromResponse", "(Lokhttp3/J;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/J;)Ljava/util/List;", "Lokhttp3/CookieJar;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactCookieJarContainer implements CookieJarContainer {

    @Nullable
    private CookieJar cookieJar;

    @Override // okhttp3.CookieJar
    @NotNull
    public List<C1951t> loadForRequest(@NotNull J url) {
        Intrinsics.checkNotNullParameter(url, "url");
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar == null) {
            return z.f38935a;
        }
        List<C1951t> listLoadForRequest = cookieJar.loadForRequest(url);
        ArrayList arrayList = new ArrayList();
        for (C1951t c1951t : listLoadForRequest) {
            try {
                ArrayList arrayList2 = new ArrayList(20);
                String name = c1951t.f40982a;
                String value = c1951t.f40983b;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                E e10 = F.f40566b;
                e10.checkName(name);
                e10.checkValue(value, name);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList2.add(name);
                arrayList2.add(StringsKt.V(value).toString());
                arrayList.add(c1951t);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void removeCookieJar() {
        this.cookieJar = null;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull J url, @NotNull List<C1951t> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(url, cookies);
        }
    }

    @Override // com.facebook.react.modules.network.CookieJarContainer
    public void setCookieJar(@NotNull CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }
}
