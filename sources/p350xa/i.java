package p350xa;

import F6.d;
import Pa.T;
import android.os.Build;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.H;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import p059e1.a;
import p203na.c;
import retrofit2.C1993k;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f43741a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43742b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43743c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43744d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f43745e = new AtomicInteger(0);

    public static void a(long j6, J j10, String str) {
        if (Build.VERSION.SDK_INT == 34) {
            return;
        }
        String strB = j10.b();
        T.b(-4).execute(new b(System.currentTimeMillis() - j6, str, j10.f40582d, strB));
    }

    public final String b() {
        String str;
        String str2 = "";
        try {
            str = J.f40577k.parse(this.f43742b).f40582d;
        } catch (Exception unused) {
            str = "";
        }
        if (str.startsWith("ng-")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BaseApplication.getCountryLocale().toLowerCase());
        sb2.append("-");
        try {
            str2 = J.f40577k.parse(this.f43742b).f40582d;
        } catch (Exception unused2) {
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void c() {
        AtomicInteger atomicInteger = this.f43745e;
        if (atomicInteger.get() <= 10) {
            atomicInteger.incrementAndGet();
            return;
        }
        Boolean bool = g.f43732c;
        if (bool != null && bool.booleanValue()) {
            g.f43732c = Boolean.FALSE;
            d.c("EncryptionInterceptor", "disable encryption due to base url fallback, reason=dynamic_base_url_fallback");
        }
        d("https://ng-m.palmpay.app");
        atomicInteger.set(0);
    }

    public final synchronized void d(String str) {
        this.f43742b = str;
        this.f43743c = b();
    }

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        String str;
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f43742b)) {
            String strE = g.e();
            if (TextUtils.isEmpty(strE)) {
                strE = a.H("key_dynamic_base_url_v3");
            }
            d(strE);
            if (TextUtils.isEmpty(this.f43742b)) {
                d("https://ng-m.palmpay.app");
            }
        }
        Y yRequest = chain.request();
        J j6 = yRequest.f40685a;
        String str3 = j6.f40582d;
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(this.f43743c)) {
                    this.f43743c = b();
                }
                str = this.f43743c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!str.equals(str3)) {
            if (TextUtils.isEmpty(this.f43744d)) {
                try {
                    str2 = J.f40577k.parse("https://ng-m.palmpay.app").f40582d;
                } catch (Exception unused) {
                    str2 = "";
                }
                this.f43744d = str2;
            }
            if (str3.contains(this.f43744d)) {
                if (this.f43741a == null) {
                    this.f43741a = J.f40577k.parse("https://ng-m.palmpay.app");
                }
                J j10 = this.f43741a;
                H hF = j6.f();
                hF.h(j10.f40579a);
                hF.d(str);
                hF.f(j10.f40583e);
                J url = hF.b();
                X xB = yRequest.b();
                Intrinsics.checkNotNullParameter(url, "url");
                xB.f40680a = url;
                try {
                    e0 e0VarProceed = chain.proceed(xB.b());
                    this.f43745e.set(0);
                    return e0VarProceed;
                } catch (InterruptedIOException unused2) {
                    a(jCurrentTimeMillis, url, "InterruptedIOException");
                    throw new InterruptedIOException("Get InterruptedIOException when call " + url.f40587i);
                } catch (ConnectException unused3) {
                    a(jCurrentTimeMillis, url, "ConnectException");
                    throw new ConnectException("Get ConnectException when call " + url.f40587i);
                } catch (SocketException e10) {
                    a(jCurrentTimeMillis, url, "SocketException");
                    throw new SocketException("Get SocketException when call " + url.f40587i + " " + e10.getMessage());
                } catch (UnknownHostException unused4) {
                    a(jCurrentTimeMillis, url, "UnknownHostException");
                    c();
                    throw new UnknownHostException("Get UnknownHostException when call " + url.f40587i);
                } catch (SSLHandshakeException unused5) {
                    a(jCurrentTimeMillis, url, "SSLHandshakeException");
                    c();
                    throw new SSLHandshakeException("Get SSLHandshakeException when call " + url.f40587i);
                } catch (c e11) {
                    throw e11;
                } catch (IOException e12) {
                    a(jCurrentTimeMillis, url, e12.getClass().getSimpleName());
                    throw new IOException(e12.getMessage() + ". Get Exception when call " + url.f40587i, e12);
                } catch (C1993k e13) {
                    a(jCurrentTimeMillis, url, "HttpException");
                    throw e13;
                }
            }
        }
        return chain.proceed(yRequest);
    }
}
