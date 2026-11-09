package p191mg;

import C4.a;
import C9.N;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import p355xf.A;
import p355xf.C;
import p355xf.D;
import p355xf.G;
import p355xf.H;
import p355xf.w;
import p355xf.x;
import p355xf.z;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a writer, boolean z3) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f39726d = z3;
    }

    @Override // C9.N
    public final void e(byte b7) {
        if (this.f39726d) {
            w wVar = x.f43988b;
            k(String.valueOf(b7 & UnsignedBytes.MAX_VALUE));
        } else {
            w wVar2 = x.f43988b;
            i(String.valueOf(b7 & UnsignedBytes.MAX_VALUE));
        }
    }

    @Override // C9.N
    public final void g(int i7) {
        if (this.f39726d) {
            z zVar = A.f43945b;
            k(Long.toString(4294967295L & ((long) i7), 10));
        } else {
            z zVar2 = A.f43945b;
            i(Long.toString(4294967295L & ((long) i7), 10));
        }
    }

    @Override // C9.N
    public final void h(long j6) {
        int i7 = 63;
        String str = "0";
        if (this.f39726d) {
            C c6 = D.f43948b;
            if (j6 != 0) {
                if (j6 > 0) {
                    str = Long.toString(j6, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j6 >>> 1) / ((long) 5);
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j6 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i7--;
                        cArr[i7] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i7, 64 - i7);
                }
            }
            k(str);
            return;
        }
        C c10 = D.f43948b;
        if (j6 != 0) {
            if (j6 > 0) {
                str = Long.toString(j6, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j6 >>> 1) / ((long) 5);
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j6 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i7--;
                    cArr2[i7] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i7, 64 - i7);
            }
        }
        i(str);
    }

    @Override // C9.N
    public final void j(short s3) {
        if (this.f39726d) {
            G g7 = H.f43952b;
            k(String.valueOf(s3 & 65535));
        } else {
            G g10 = H.f43952b;
            i(String.valueOf(s3 & 65535));
        }
    }
}
