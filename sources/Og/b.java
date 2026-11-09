package Og;

import C0.G;
import Hg.e;
import N8.q0;
import Pg.k;
import Pg.q;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.collections.B;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Connection;
import okhttp3.F;
import okhttp3.Interceptor;
import okhttp3.L;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpLoggingInterceptor$Logger f6849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile B f6850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f6851c;

    public b(HttpLoggingInterceptor$Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f6849a = logger;
        this.f6850b = B.f38895a;
        this.f6851c = a.f6844a;
    }

    public final void a(F f10, int i7) {
        this.f6850b.contains(f10.b(i7));
        String strF = f10.f(i7);
        this.f6849a.log(f10.b(i7) + ": " + strF);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f5 A[LOOP:0: B:41:0x00f3->B:42:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01e5, please report this as an issue */
    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws Exception {
        boolean z3;
        boolean z8;
        Long lValueOf;
        Charset UTF_8;
        int size;
        int i7;
        Charset UTF_9;
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.f6851c;
        Y yRequest = chain.request();
        if (aVar == a.f6844a) {
            return chain.proceed(yRequest);
        }
        boolean z10 = true;
        boolean z11 = aVar == a.f6847d;
        if (!z11 && aVar != a.f6846c) {
            z10 = false;
        }
        c0 c0Var = yRequest.f40688d;
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(yRequest.f40686b);
        sb2.append(' ');
        sb2.append(yRequest.f40685a);
        String str = " ";
        String str2 = "";
        sb2.append(connection != null ? " " + connection.protocol() : "");
        String string = sb2.toString();
        if (!z10 && c0Var != null) {
            StringBuilder sbT = G.t(string, " (");
            sbT.append(c0Var.contentLength());
            sbT.append("-byte body)");
            string = sbT.toString();
        }
        this.f6849a.log(string);
        if (z10) {
            F f10 = yRequest.f40687c;
            z3 = z11;
            if (c0Var != null) {
                L lContentType = c0Var.get$mediaType();
                z8 = z10;
                if (lContentType != null && f10.a(HttpHeaders.CONTENT_TYPE) == null) {
                    this.f6849a.log("Content-Type: " + lContentType);
                }
                if (c0Var.contentLength() != -1 && f10.a(HttpHeaders.CONTENT_LENGTH) == null) {
                    this.f6849a.log("Content-Length: " + c0Var.contentLength());
                }
                size = f10.size();
                for (i7 = 0; i7 < size; i7++) {
                    a(f10, i7);
                }
                if (z3 || c0Var == null) {
                    this.f6849a.log("--> END " + yRequest.f40686b);
                } else {
                    String strA = yRequest.f40687c.a("Content-Encoding");
                    if (strA != null && !strA.equalsIgnoreCase(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY) && !strA.equalsIgnoreCase("gzip")) {
                        this.f6849a.log("--> END " + yRequest.f40686b + " (encoded body omitted)");
                    } else if (c0Var.isDuplex()) {
                        this.f6849a.log("--> END " + yRequest.f40686b + " (duplex request body omitted)");
                    } else if (c0Var.isOneShot()) {
                        this.f6849a.log("--> END " + yRequest.f40686b + " (one-shot body omitted)");
                    } else {
                        k kVar = new k();
                        c0Var.writeTo(kVar);
                        L lContentType2 = c0Var.get$mediaType();
                        if (lContentType2 == null || (UTF_9 = lContentType2.a(StandardCharsets.UTF_8)) == null) {
                            UTF_9 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                        }
                        this.f6849a.log(str2);
                        if (p264r5.a.z(kVar)) {
                            this.f6849a.log(kVar.readString(UTF_9));
                            this.f6849a.log("--> END " + yRequest.f40686b + " (" + c0Var.contentLength() + "-byte body)");
                        } else {
                            this.f6849a.log("--> END " + yRequest.f40686b + " (binary " + c0Var.contentLength() + "-byte body omitted)");
                        }
                    }
                }
            } else {
                z8 = z10;
                str = " ";
            }
            size = f10.size();
            while (i7 < size) {
                a(f10, i7);
            }
            if (z3) {
                this.f6849a.log("--> END " + yRequest.f40686b);
            } else {
                this.f6849a.log("--> END " + yRequest.f40686b);
            }
        } else {
            z3 = z11;
            z8 = z10;
            str = " ";
            str2 = "";
        }
        long jNanoTime = System.nanoTime();
        try {
            e0 e0VarProceed = chain.proceed(yRequest);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            h0 h0Var = e0VarProceed.f40734g;
            Intrinsics.e(h0Var);
            long jContentLength = h0Var.contentLength();
            String str3 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            HttpLoggingInterceptor$Logger httpLoggingInterceptor$Logger = this.f6849a;
            StringBuilder sb3 = new StringBuilder("<-- ");
            sb3.append(e0VarProceed.f40731d);
            sb3.append(e0VarProceed.f40730c.length() == 0 ? str2 : G.o(str, e0VarProceed.f40730c));
            sb3.append(' ');
            sb3.append(e0VarProceed.f40728a.f40685a);
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(!z8 ? q0.k(", ", str3, " body") : str2);
            sb3.append(')');
            httpLoggingInterceptor$Logger.log(sb3.toString());
            if (z8) {
                F f11 = e0VarProceed.f40733f;
                int size2 = f11.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    a(f11, i10);
                }
                if (z3 && e.a(e0VarProceed)) {
                    String strA2 = e0VarProceed.f40733f.a("Content-Encoding");
                    if (strA2 != null && !strA2.equalsIgnoreCase(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY) && !strA2.equalsIgnoreCase("gzip")) {
                        this.f6849a.log("<-- END HTTP (encoded body omitted)");
                        return e0VarProceed;
                    }
                    BufferedSource bufferedSourceSource = h0Var.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    k buffer = bufferedSourceSource.getBuffer();
                    if ("gzip".equalsIgnoreCase(f11.a("Content-Encoding"))) {
                        lValueOf = Long.valueOf(buffer.f7358b);
                        q qVar = new q(buffer.clone());
                        try {
                            buffer = new k();
                            buffer.writeAll(qVar);
                            qVar.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                org.chromium.support_lib_boundary.util.b.o(qVar, th);
                                throw th2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    L lContentType3 = h0Var.contentType();
                    if (lContentType3 == null || (UTF_8 = lContentType3.a(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!p264r5.a.z(buffer)) {
                        this.f6849a.log(str2);
                        this.f6849a.log("<-- END HTTP (binary " + buffer.f7358b + "-byte body omitted)");
                        return e0VarProceed;
                    }
                    if (jContentLength != 0) {
                        this.f6849a.log(str2);
                        this.f6849a.log(buffer.clone().readString(UTF_8));
                    }
                    if (lValueOf == null) {
                        this.f6849a.log("<-- END HTTP (" + buffer.f7358b + "-byte body)");
                        return e0VarProceed;
                    }
                    this.f6849a.log("<-- END HTTP (" + buffer.f7358b + "-byte, " + lValueOf + "-gzipped-byte body)");
                    return e0VarProceed;
                }
                this.f6849a.log("<-- END HTTP");
            }
            return e0VarProceed;
        } catch (Exception e10) {
            this.f6849a.log("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }
}
