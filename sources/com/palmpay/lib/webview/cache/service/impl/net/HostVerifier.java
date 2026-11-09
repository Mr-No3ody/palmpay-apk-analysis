package com.palmpay.lib.webview.cache.service.impl.net;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/HostVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "url", "Ljava/net/URL;", "<init>", "(Ljava/net/URL;)V", "getUrl", "()Ljava/net/URL;", "verify", "", "hostname", "", "session", "Ljavax/net/ssl/SSLSession;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HostVerifier implements HostnameVerifier {

    @NotNull
    private final URL url;

    public HostVerifier(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@Nullable String hostname, @Nullable SSLSession session) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.url.getHost(), session);
    }
}
