package androidx.camera.core.impl.utils;

import C0.G;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f14182d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f14183e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f14184f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14187c;

    public f(int i7, int i10, byte[] bArr) {
        this.f14185a = i7;
        this.f14186b = i10;
        this.f14187c = bArr;
    }

    public static f a(long j6, ByteOrder byteOrder) {
        return b(new long[]{j6}, byteOrder);
    }

    public static f b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f14184f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j6 : jArr) {
            byteBufferWrap.putInt((int) j6);
        }
        return new f(4, jArr.length, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(f14183e[this.f14185a]);
        sb2.append(", data length:");
        return G.n(this.f14187c.length, ")", sb2);
    }
}
