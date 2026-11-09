package p350xa;

import C0.G;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.e0;
import retrofit2.C1993k;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        String str = "";
        try {
            Y yRequest = chain.request();
            str = yRequest.f40685a.f40587i;
            return chain.proceed(yRequest);
        } catch (InterruptedIOException e10) {
            throw new IOException(G.o("Get InterruptedIOException when call ", str), e10);
        } catch (ConnectException e11) {
            throw new IOException(G.o("Get ConnectException when call ", str), e11);
        } catch (SocketException e12) {
            throw new IOException(G.o("Get SocketException when call ", str), e12);
        } catch (UnknownHostException e13) {
            throw new IOException(G.o("Get UnknownHostException when call ", str), e13);
        } catch (SSLHandshakeException e14) {
            throw new IOException(G.o("Get SSLHandshakeException when call ", str), e14);
        } catch (C1993k e15) {
            throw new IOException(G.o("Get HttpException when call ", str), e15);
        } catch (Exception e16) {
            throw new IOException(G.o("Get Exception when call ", str), e16);
        } catch (Throwable th) {
            throw new IOException(G.o("Get Exception when call ", str), th);
        }
    }
}
