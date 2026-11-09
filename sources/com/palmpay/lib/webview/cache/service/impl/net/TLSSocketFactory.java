package com.palmpay.lib.webview.cache.service.impl.net;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0005J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\nJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/TLSSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "<init>", "()V", "factory", "(Ljavax/net/ssl/SSLSocketFactory;)V", "delegate", "getDefaultCipherSuites", "", "", "()[Ljava/lang/String;", "getSupportedCipherSuites", "createSocket", "Ljava/net/Socket;", "s", "host", "port", "", "autoClose", "", "localHost", "Ljava/net/InetAddress;", "localPort", "address", "localAddress", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TLSSocketFactory extends SSLSocketFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] PROTOCOL_ARRAY;

    @NotNull
    private SSLSocketFactory delegate;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/TLSSocketFactory$Companion;", "", "<init>", "()V", "PROTOCOL_ARRAY", "", "", "[Ljava/lang/String;", "setSupportProtocolAndCipherSuites", "", "socket", "Ljava/net/Socket;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setSupportProtocolAndCipherSuites(Socket socket) {
            if (socket instanceof SSLSocket) {
                ((SSLSocket) socket).setEnabledProtocols(TLSSocketFactory.PROTOCOL_ARRAY);
            }
        }

        private Companion() {
        }
    }

    static {
        PROTOCOL_ARRAY = Build.VERSION.SDK_INT >= 26 ? new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"} : new String[]{"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
    }

    public TLSSocketFactory() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.e(socketFactory);
            this.delegate = socketFactory;
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public Socket createSocket(@NotNull Socket s3, @NotNull String host, int port, boolean autoClose) throws IOException {
        Intrinsics.checkNotNullParameter(s3, "s");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.delegate.createSocket(s3, host, port, autoClose);
        Companion companion = INSTANCE;
        Intrinsics.e(socketCreateSocket);
        companion.setSupportProtocolAndCipherSuites(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull String host, int port) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.delegate.createSocket(host, port);
        Companion companion = INSTANCE;
        Intrinsics.e(socketCreateSocket);
        companion.setSupportProtocolAndCipherSuites(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull String host, int port, @NotNull InetAddress localHost, int localPort) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket socketCreateSocket = this.delegate.createSocket(host, port, localHost, localPort);
        Companion companion = INSTANCE;
        Intrinsics.e(socketCreateSocket);
        companion.setSupportProtocolAndCipherSuites(socketCreateSocket);
        return socketCreateSocket;
    }

    public TLSSocketFactory(@NotNull SSLSocketFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.delegate = factory;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull InetAddress host, int port) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.delegate.createSocket(host, port);
        Companion companion = INSTANCE;
        Intrinsics.e(socketCreateSocket);
        companion.setSupportProtocolAndCipherSuites(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull InetAddress address, int port, @NotNull InetAddress localAddress, int localPort) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket socketCreateSocket = this.delegate.createSocket(address, port, localAddress, localPort);
        Companion companion = INSTANCE;
        Intrinsics.e(socketCreateSocket);
        companion.setSupportProtocolAndCipherSuites(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket();
        Companion companion = INSTANCE;
        Intrinsics.e(socketCreateSocket);
        companion.setSupportProtocolAndCipherSuites(socketCreateSocket);
        return socketCreateSocket;
    }
}
