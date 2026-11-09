package com.palmpay.lib.webview.cache.service.impl.net;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/SSLUtils;", "", "<init>", "()V", "defaultSSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "defaultHostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "url", "Ljava/net/URL;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SSLUtils {

    @NotNull
    public static final SSLUtils INSTANCE = new SSLUtils();

    private SSLUtils() {
    }

    @NotNull
    public final HostnameVerifier defaultHostnameVerifier(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new HostVerifier(url);
    }

    @NotNull
    public final SSLSocketFactory defaultSSLSocketFactory() {
        return new TLSSocketFactory();
    }
}
