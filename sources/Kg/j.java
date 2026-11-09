package Kg;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.DeferredSocketAdapter$Factory;
import okhttp3.internal.platform.android.SocketAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements DeferredSocketAdapter$Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public final SocketAdapter create(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new l();
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public final boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Jg.g.f4848e.isSupported();
        return false;
    }
}
