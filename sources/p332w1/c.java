package p332w1;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f43251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f43252c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f43250a = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43253d = 0;

    public final boolean a() {
        return this.f43252c.f43239b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f43251b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f43252c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < 6; i7++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f43252c.f43243f = this.f43251b.getShort();
            this.f43252c.f43244g = this.f43251b.getShort();
            int iC = c();
            b bVar = this.f43252c;
            bVar.f43245h = (iC & 128) != 0;
            bVar.f43246i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f43252c.f43247j = c();
            b bVar2 = this.f43252c;
            c();
            bVar2.getClass();
            if (this.f43252c.f43245h && !a()) {
                b bVar3 = this.f43252c;
                bVar3.f43238a = e(bVar3.f43246i);
                b bVar4 = this.f43252c;
                bVar4.f43248k = bVar4.f43238a[bVar4.f43247j];
            }
        } else {
            this.f43252c.f43239b = 1;
        }
        if (!a()) {
            boolean z3 = false;
            while (!z3 && !a() && this.f43252c.f43240c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        g();
                    } else if (iC3 == 249) {
                        this.f43252c.f43241d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f43252c.f43241d;
                        int i10 = (iC4 & 28) >> 2;
                        aVar.f43233g = i10;
                        if (i10 == 0) {
                            aVar.f43233g = 1;
                        }
                        aVar.f43232f = (iC4 & 1) != 0;
                        short s3 = this.f43251b.getShort();
                        if (s3 < 2) {
                            s3 = 10;
                        }
                        a aVar2 = this.f43252c.f43241d;
                        aVar2.f43235i = s3 * 10;
                        aVar2.f43234h = c();
                        c();
                    } else if (iC3 == 254) {
                        g();
                    } else if (iC3 != 255) {
                        g();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            bArr = this.f43250a;
                            if (i11 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i11]);
                            i11++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    this.f43252c.f43249l = (bArr[1] & UnsignedBytes.MAX_VALUE) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8);
                                }
                                if (this.f43253d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            g();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f43252c;
                    if (bVar5.f43241d == null) {
                        bVar5.f43241d = new a();
                    }
                    bVar5.f43241d.f43227a = this.f43251b.getShort();
                    this.f43252c.f43241d.f43228b = this.f43251b.getShort();
                    this.f43252c.f43241d.f43229c = this.f43251b.getShort();
                    this.f43252c.f43241d.f43230d = this.f43251b.getShort();
                    int iC5 = c();
                    boolean z8 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f43252c.f43241d;
                    aVar3.f43231e = (iC5 & 64) != 0;
                    if (z8) {
                        aVar3.f43237k = e(iPow);
                    } else {
                        aVar3.f43237k = null;
                    }
                    this.f43252c.f43241d.f43236j = this.f43251b.position();
                    c();
                    g();
                    if (!a()) {
                        b bVar6 = this.f43252c;
                        bVar6.f43240c++;
                        bVar6.f43242e.add(bVar6.f43241d);
                    }
                } else if (iC2 != 59) {
                    this.f43252c.f43239b = 1;
                } else {
                    z3 = true;
                }
            }
            b bVar7 = this.f43252c;
            if (bVar7.f43240c < 0) {
                bVar7.f43239b = 1;
            }
        }
        return this.f43252c;
    }

    public final int c() {
        try {
            return this.f43251b.get() & UnsignedBytes.MAX_VALUE;
        } catch (Exception unused) {
            this.f43252c.f43239b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f43253d = iC;
        if (iC <= 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            try {
                int i10 = this.f43253d;
                if (i7 >= i10) {
                    return;
                }
                int i11 = i10 - i7;
                this.f43251b.get(this.f43250a, i7, i11);
                i7 += i11;
            } catch (Exception unused) {
                this.f43252c.f43239b = 1;
                return;
            }
        }
    }

    public final int[] e(int i7) {
        byte[] bArr = new byte[i7 * 3];
        int[] iArr = null;
        try {
            this.f43251b.get(bArr);
            iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int i12 = bArr[i11] & UnsignedBytes.MAX_VALUE;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & UnsignedBytes.MAX_VALUE;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | (-16777216) | (bArr[i13] & UnsignedBytes.MAX_VALUE);
                i10 = i15;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.f43252c.f43239b = 1;
            return iArr;
        }
    }

    public final void f(ByteBuffer byteBuffer) {
        this.f43251b = null;
        Arrays.fill(this.f43250a, (byte) 0);
        this.f43252c = new b();
        this.f43253d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f43251b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f43251b.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void g() {
        int iC;
        do {
            iC = c();
            this.f43251b.position(Math.min(this.f43251b.position() + iC, this.f43251b.limit()));
        } while (iC > 0);
    }
}
