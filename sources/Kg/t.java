package Kg;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f5512j = new s(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f5513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f5514i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f5513h = sslSocketFactoryClass;
        this.f5514i = paramClass;
    }

    @Override // Kg.i, okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocketFactory(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return this.f5513h.isInstance(sslSocketFactory);
    }

    @Override // Kg.i, okhttp3.internal.platform.android.SocketAdapter
    public final X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Object objT = Dg.c.t(this.f5514i, "sslParameters", sslSocketFactory);
        Intrinsics.e(objT);
        X509TrustManager x509TrustManager = (X509TrustManager) Dg.c.t(X509TrustManager.class, "x509TrustManager", objT);
        return x509TrustManager == null ? (X509TrustManager) Dg.c.t(X509TrustManager.class, "trustManager", objT) : x509TrustManager;
    }
}
