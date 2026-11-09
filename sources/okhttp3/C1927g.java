package okhttp3;

import Pg.AbstractC0555b;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: renamed from: okhttp3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1927g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f40745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f40746l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f40747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f40748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f40750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f40753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f40754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f40755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f40756j;

    static {
        new C1926f(null);
        Jg.s sVar = Jg.t.f4869a;
        sVar.get().getClass();
        f40745k = "OkHttp-Sent-Millis";
        sVar.get().getClass();
        f40746l = "OkHttp-Received-Millis";
    }

    public C1927g(Source rawSource) throws IOException {
        Intrinsics.checkNotNullParameter(rawSource, "rawSource");
        try {
            Pg.x xVarC = AbstractC0555b.c(rawSource);
            String utf8LineStrict = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            J j6 = J.f40577k.parse(utf8LineStrict);
            if (j6 == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(utf8LineStrict));
                Jg.t.f4869a.get().getClass();
                Jg.t.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.f40747a = j6;
            this.f40749c = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
            F1.b bVar = new F1.b(3);
            int int$okhttp = C1929i.f40759b.readInt$okhttp(xVarC);
            for (int i7 = 0; i7 < int$okhttp; i7++) {
                bVar.c(xVarC.readUtf8LineStrict(Long.MAX_VALUE));
            }
            this.f40748b = bVar.h();
            Hg.k kVar = Hg.k.f3948d.parse(xVarC.readUtf8LineStrict(Long.MAX_VALUE));
            this.f40750d = kVar.f3949a;
            this.f40751e = kVar.f3950b;
            this.f40752f = kVar.f3951c;
            F1.b bVar2 = new F1.b(3);
            int int$okhttp2 = C1929i.f40759b.readInt$okhttp(xVarC);
            for (int i10 = 0; i10 < int$okhttp2; i10++) {
                bVar2.c(xVarC.readUtf8LineStrict(Long.MAX_VALUE));
            }
            String str = f40745k;
            String strI = bVar2.i(str);
            String str2 = f40746l;
            String strI2 = bVar2.i(str2);
            bVar2.j(str);
            bVar2.j(str2);
            this.f40755i = strI != null ? Long.parseLong(strI) : 0L;
            this.f40756j = strI2 != null ? Long.parseLong(strI2) : 0L;
            this.f40753g = bVar2.h();
            if (Intrinsics.c(this.f40747a.f40579a, Constants.SCHEME)) {
                String utf8LineStrict2 = xVarC.readUtf8LineStrict(Long.MAX_VALUE);
                if (utf8LineStrict2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                }
                this.f40754h = D.f40560e.get(!xVarC.exhausted() ? k0.f40939b.forJavaName(xVarC.readUtf8LineStrict(Long.MAX_VALUE)) : k0.SSL_3_0, C1947o.f40951b.forJavaName(xVarC.readUtf8LineStrict(Long.MAX_VALUE)), a(xVarC), a(xVarC));
            } else {
                this.f40754h = null;
            }
            Unit unit = Unit.f38893a;
            rawSource.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(rawSource, th);
                throw th2;
            }
        }
    }

    public static List a(Pg.x xVar) throws IOException {
        int int$okhttp = C1929i.f40759b.readInt$okhttp(xVar);
        if (int$okhttp == -1) {
            return kotlin.collections.z.f38935a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(int$okhttp);
            for (int i7 = 0; i7 < int$okhttp; i7++) {
                String utf8LineStrict = xVar.readUtf8LineStrict(Long.MAX_VALUE);
                Pg.k kVar = new Pg.k();
                Pg.m mVarDecodeBase64 = Pg.m.f7359d.decodeBase64(utf8LineStrict);
                if (mVarDecodeBase64 == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                kVar.i(mVarDecodeBase64);
                arrayList.add(certificateFactory.generateCertificate(new Pg.i(kVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static void b(Pg.w wVar, List list) throws IOException {
        try {
            wVar.writeDecimalLong(list.size());
            wVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((Certificate) it.next()).getEncoded();
                Pg.l lVar = Pg.m.f7359d;
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                wVar.writeUtf8(Pg.l.of$default(lVar, bytes, 0, 0, 3, null).a());
                wVar.writeByte(10);
            }
        } catch (CertificateEncodingException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public final void c(Eg.g editor) {
        J j6 = this.f40747a;
        D d2 = this.f40754h;
        F f10 = this.f40753g;
        F f11 = this.f40748b;
        Intrinsics.checkNotNullParameter(editor, "editor");
        Pg.w wVarB = AbstractC0555b.b(editor.f(0));
        try {
            wVarB.writeUtf8(j6.f40587i);
            wVarB.writeByte(10);
            wVarB.writeUtf8(this.f40749c);
            wVarB.writeByte(10);
            wVarB.writeDecimalLong(f11.size());
            wVarB.writeByte(10);
            int size = f11.size();
            for (int i7 = 0; i7 < size; i7++) {
                wVarB.writeUtf8(f11.b(i7));
                wVarB.writeUtf8(": ");
                wVarB.writeUtf8(f11.f(i7));
                wVarB.writeByte(10);
            }
            wVarB.writeUtf8(new Hg.k(this.f40750d, this.f40751e, this.f40752f).toString());
            wVarB.writeByte(10);
            wVarB.writeDecimalLong(f10.size() + 2);
            wVarB.writeByte(10);
            int size2 = f10.size();
            for (int i10 = 0; i10 < size2; i10++) {
                wVarB.writeUtf8(f10.b(i10));
                wVarB.writeUtf8(": ");
                wVarB.writeUtf8(f10.f(i10));
                wVarB.writeByte(10);
            }
            wVarB.writeUtf8(f40745k);
            wVarB.writeUtf8(": ");
            wVarB.writeDecimalLong(this.f40755i);
            wVarB.writeByte(10);
            wVarB.writeUtf8(f40746l);
            wVarB.writeUtf8(": ");
            wVarB.writeDecimalLong(this.f40756j);
            wVarB.writeByte(10);
            if (Intrinsics.c(j6.f40579a, Constants.SCHEME)) {
                wVarB.writeByte(10);
                Intrinsics.e(d2);
                wVarB.writeUtf8(d2.f40562b.f40969a);
                wVarB.writeByte(10);
                b(wVarB, d2.a());
                b(wVarB, d2.f40563c);
                wVarB.writeUtf8(d2.f40561a.f40946a);
                wVarB.writeByte(10);
            }
            Unit unit = Unit.f38893a;
            wVarB.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(wVarB, th);
                throw th2;
            }
        }
    }

    public C1927g(e0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Y y8 = response.f40728a;
        this.f40747a = y8.f40685a;
        this.f40748b = C1929i.f40759b.varyHeaders(response);
        this.f40749c = y8.f40686b;
        this.f40750d = response.f40729b;
        this.f40751e = response.f40731d;
        this.f40752f = response.f40730c;
        this.f40753g = response.f40733f;
        this.f40754h = response.f40732e;
        this.f40755i = response.f40738p;
        this.f40756j = response.t;
    }
}
