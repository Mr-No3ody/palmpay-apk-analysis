package okhttp3;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N f40602e = new N(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L f40603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L f40604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f40605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f40606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f40607j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.m f40608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f40610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40611d;

    static {
        K k2 = L.f40589e;
        f40603f = k2.get("multipart/mixed");
        k2.get("multipart/alternative");
        k2.get("multipart/digest");
        k2.get("multipart/parallel");
        f40604g = k2.get("multipart/form-data");
        f40605h = new byte[]{58, 32};
        f40606i = new byte[]{Ascii.CR, 10};
        f40607j = new byte[]{45, 45};
    }

    public Q(Pg.m boundaryByteString, L type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f40608a = boundaryByteString;
        this.f40609b = parts;
        this.f40610c = L.f40589e.get(type + "; boundary=" + boundaryByteString.l());
        this.f40611d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(BufferedSink bufferedSink, boolean z3) throws IOException {
        Pg.k kVar;
        BufferedSink kVar2;
        if (z3) {
            kVar2 = new Pg.k();
            kVar = kVar2;
        } else {
            kVar = 0;
            kVar2 = bufferedSink;
        }
        List list = this.f40609b;
        int size = list.size();
        long j6 = 0;
        int i7 = 0;
        while (true) {
            Pg.m mVar = this.f40608a;
            byte[] bArr = f40607j;
            byte[] bArr2 = f40606i;
            if (i7 >= size) {
                Intrinsics.e(kVar2);
                kVar2.write(bArr);
                kVar2.write(mVar);
                kVar2.write(bArr);
                kVar2.write(bArr2);
                if (!z3) {
                    return j6;
                }
                Intrinsics.e(kVar);
                long j10 = j6 + kVar.f7358b;
                kVar.a();
                return j10;
            }
            P p3 = (P) list.get(i7);
            F f10 = p3.f40600a;
            Intrinsics.e(kVar2);
            kVar2.write(bArr);
            kVar2.write(mVar);
            kVar2.write(bArr2);
            if (f10 != null) {
                int size2 = f10.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    kVar2.writeUtf8(f10.b(i10)).write(f40605h).writeUtf8(f10.f(i10)).write(bArr2);
                }
            }
            c0 c0Var = p3.f40601b;
            L lContentType = c0Var.contentType();
            if (lContentType != null) {
                kVar2.writeUtf8("Content-Type: ").writeUtf8(lContentType.f40592a).write(bArr2);
            }
            long jContentLength = c0Var.contentLength();
            if (jContentLength != -1) {
                kVar2.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(bArr2);
            } else if (z3) {
                Intrinsics.e(kVar);
                kVar.a();
                return -1L;
            }
            kVar2.write(bArr2);
            if (z3) {
                j6 += jContentLength;
            } else {
                c0Var.writeTo(kVar2);
            }
            kVar2.write(bArr2);
            i7++;
        }
    }

    @Override // okhttp3.c0
    public final long contentLength() throws IOException {
        long j6 = this.f40611d;
        if (j6 != -1) {
            return j6;
        }
        long jA = a(null, true);
        this.f40611d = jA;
        return jA;
    }

    @Override // okhttp3.c0
    public final L contentType() {
        return this.f40610c;
    }

    @Override // okhttp3.c0
    public final void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
