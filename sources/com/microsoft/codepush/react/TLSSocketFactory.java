package com.microsoft.codepush.react;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class TLSSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory delegate;

    public TLSSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.delegate = sSLContext.getSocketFactory();
    }

    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i7, boolean z3) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, i7, z3));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i7) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i7));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i7, InetAddress inetAddress, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i7, inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i7) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i7));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i7, inetAddress2, i10));
    }
}
