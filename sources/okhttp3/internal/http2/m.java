package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1940k f40842a;

    static {
        new C1941l(null);
        f40842a = new C1940k();
    }

    public void a(u connection, K settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
    }

    public abstract void b(E e10);
}
