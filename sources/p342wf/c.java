package p342wf;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f43496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f43497b;
    private SSLSocketFactory delegate;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f43496a = new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"};
        } else {
            f43496a = new String[]{"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
        }
        f43497b = new b();
    }

    public c() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{f43497b}, new SecureRandom());
            this.delegate = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public static void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f43496a);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(str, i7);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(str, i7, inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i7);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i10) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i7, inetAddress2, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i7, boolean z3) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(socket, str, i7, z3);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
