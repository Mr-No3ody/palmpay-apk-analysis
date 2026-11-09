package Kg;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.DeferredSocketAdapter$Factory;
import okhttp3.internal.platform.android.SocketAdapter;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements DeferredSocketAdapter$Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public final SocketAdapter create(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new q();
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public final boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Jg.j.f4852e.isSupported() && Conscrypt.isConscrypt(sslSocket);
    }
}
