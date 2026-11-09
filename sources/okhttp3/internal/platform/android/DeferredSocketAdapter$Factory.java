package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"okhttp3/internal/platform/android/DeferredSocketAdapter$Factory", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "Lokhttp3/internal/platform/android/SocketAdapter;", "create", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/SocketAdapter;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DeferredSocketAdapter$Factory {
    @NotNull
    SocketAdapter create(@NotNull SSLSocket sslSocket);

    boolean matchesSocket(@NotNull SSLSocket sslSocket);
}
