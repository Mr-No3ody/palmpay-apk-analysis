package Ng;

import C0.G;
import Pg.x;
import androidx.camera.camera2.internal.F;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f6436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6442g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6444j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Pg.k f6446p;
    public final Pg.k t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f6447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f6448w;

    public k(x source, h frameCallback, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f6436a = source;
        this.f6437b = frameCallback;
        this.f6438c = z3;
        this.f6439d = z8;
        this.f6446p = new Pg.k();
        this.t = new Pg.k();
        this.f6448w = null;
    }

    public final void a() throws IOException {
        short s3;
        String utf8;
        String strM;
        long j6 = this.f6442g;
        Pg.k kVar = this.f6446p;
        if (j6 > 0) {
            this.f6436a.readFully(kVar, j6);
        }
        int i7 = this.f6441f;
        h hVar = this.f6437b;
        switch (i7) {
            case 8:
                long j10 = kVar.f7358b;
                if (j10 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j10 != 0) {
                    s3 = kVar.readShort();
                    utf8 = kVar.readUtf8();
                    if (s3 < 1000 || s3 >= 5000) {
                        strM = G.m(s3, "Code must be in range [1000,5000): ");
                    } else {
                        strM = ((1004 > s3 || s3 >= 1007) && (1015 > s3 || s3 >= 3000)) ? null : F.c(s3, "Code ", " is reserved and may not be used.");
                    }
                    if (strM != null) {
                        throw new ProtocolException(strM);
                    }
                } else {
                    s3 = 1005;
                    utf8 = "";
                }
                hVar.onReadClose(s3, utf8);
                this.f6440e = true;
                return;
            case 9:
                hVar.onReadPing(kVar.readByteString(kVar.f7358b));
                return;
            case 10:
                hVar.onReadPong(kVar.readByteString(kVar.f7358b));
                return;
            default:
                StringBuilder sb2 = new StringBuilder("Unknown control opcode: ");
                int i10 = this.f6441f;
                byte[] bArr = Dg.c.f1879a;
                String hexString = Integer.toHexString(i10);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                sb2.append(hexString);
                throw new ProtocolException(sb2.toString());
        }
    }

    public final void b() throws IOException {
        boolean z3;
        if (this.f6440e) {
            throw new IOException("closed");
        }
        x xVar = this.f6436a;
        long jTimeoutNanos = xVar.f7388a.timeout().timeoutNanos();
        Source source = xVar.f7388a;
        source.timeout().clearTimeout();
        try {
            byte b7 = xVar.readByte();
            byte[] bArr = Dg.c.f1879a;
            source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i7 = b7 & Ascii.SI;
            this.f6441f = i7;
            boolean z8 = (b7 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            this.f6443i = z8;
            boolean z10 = (b7 & 8) != 0;
            this.f6444j = z10;
            if (z10 && !z8) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z11 = (b7 & SignedBytes.MAX_POWER_OF_TWO) != 0;
            if (i7 == 1 || i7 == 2) {
                if (!z11) {
                    z3 = false;
                } else {
                    if (!this.f6438c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z3 = true;
                }
                this.f6445o = z3;
            } else if (z11) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b7 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b7 & Ascii.DLE) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b10 = xVar.readByte();
            boolean z12 = (b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            if (z12) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j6 = b10 & Ascii.DEL;
            this.f6442g = j6;
            if (j6 == 126) {
                this.f6442g = xVar.readShort() & 65535;
            } else if (j6 == 127) {
                long j10 = xVar.readLong();
                this.f6442g = j10;
                if (j10 < 0) {
                    StringBuilder sb2 = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f6442g);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb2.append(hexString);
                    sb2.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb2.toString());
                }
            }
            if (this.f6444j && this.f6442g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z12) {
                byte[] bArr2 = this.f6448w;
                Intrinsics.e(bArr2);
                xVar.readFully(bArr2);
            }
        } catch (Throwable th) {
            source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f6447v;
        if (aVar != null) {
            aVar.close();
        }
    }
}
