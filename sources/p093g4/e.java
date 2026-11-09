package p093g4;

import C0.G;
import N8.q0;
import com.flexibank.sdk.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.H;
import okhttp3.I;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import p046d4.a;
import retrofit2.C1993k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Interceptor {
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Y yRequest = chain.request();
        J j6 = yRequest.f40685a;
        I i7 = J.f40577k;
        if (k.k()) {
            k kVar = k.f22317a;
            str = k.o().f21930b.f21937a;
        } else {
            str = "https://app.flexi-bank.com";
        }
        J j10 = i7.parse(str);
        if (j10 == null) {
            return chain.proceed(yRequest);
        }
        String str2 = j6.f40582d;
        String str3 = j10.f40582d;
        if (!StringsKt.A(str2, str3, false)) {
            return chain.proceed(yRequest);
        }
        X xB = yRequest.b();
        String str4 = k.f22325i;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str4.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strY = q0.y(lowerCase, "-", str3);
        if (Intrinsics.c(strY, str2)) {
            return chain.proceed(yRequest);
        }
        H hF = j6.f();
        hF.h(j10.f40579a);
        hF.d(strY);
        hF.f(j10.f40583e);
        J url = hF.b();
        Intrinsics.checkNotNullParameter(url, "url");
        xB.f40680a = url;
        Y yB = xB.b();
        String str5 = j6.f40587i;
        try {
            return chain.proceed(yB);
        } catch (a e10) {
            throw e10;
        } catch (InterruptedIOException e11) {
            throw new IOException(G.o("Get InterruptedIOException when call ", str5), e11);
        } catch (ConnectException e12) {
            throw new IOException(G.o("Get ConnectException when call ", str5), e12);
        } catch (SocketException e13) {
            throw new IOException(G.o("Get SocketException when call ", str5), e13);
        } catch (UnknownHostException e14) {
            throw new IOException(G.o("Get UnknownHostException when call ", str5), e14);
        } catch (SSLHandshakeException e15) {
            throw new IOException(G.o("Get SSLHandshakeException when call ", str5), e15);
        } catch (C1993k e16) {
            throw new IOException(G.o("Get HttpException when call ", str5), e16);
        } catch (Exception e17) {
            throw new IOException(G.o("Get Exception when call ", str5), e17);
        }
    }
}
