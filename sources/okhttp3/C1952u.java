package okhttp3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1952u implements CookieJar {
    @Override // okhttp3.CookieJar
    public final List loadForRequest(J url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return kotlin.collections.z.f38935a;
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(J url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
