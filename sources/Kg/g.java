package Kg;

import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import okhttp3.internal.platform.android.DeferredSocketAdapter$Factory;
import okhttp3.internal.platform.android.SocketAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements DeferredSocketAdapter$Factory, ObjectConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5494a;

    public /* synthetic */ g(String str) {
        this.f5494a = str;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        throw new com.nimbusds.jose.shaded.gson.p(this.f5494a, 10, false);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public SocketAdapter create(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return i.f5495f.build(sslSocket.getClass());
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return y.m(name, this.f5494a + '.', false);
    }
}
