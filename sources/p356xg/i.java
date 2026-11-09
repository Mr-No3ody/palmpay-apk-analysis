package p356xg;

import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.n;
import androidx.camera.video.internal.c;
import com.google.common.primitives.UnsignedBytes;
import com.horcrux.svg.d0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.sufficientlysecure.htmltextview.o;
import p372yg.d;
import p372yg.e;
import p372yg.f;
import p372yg.g;
import p372yg.h;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f44004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f44005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f44006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f44007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f44008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f44009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f44010g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f44011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CRC32 f44012j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f44013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f44014p;
    public com.growingio.android.circler.a t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44016w;

    public final void a() throws IOException {
        this.f44007d.a();
        long j6 = this.f44007d.f43995a.f43993a.f44001a;
        d dVar = this.f44008e;
        dVar.f44368g = j6;
        e eVar = this.f44009f;
        eVar.f44368g = j6;
        long j10 = this.f44014p;
        dVar.f44369h = j10;
        eVar.f44369h = j10;
        boolean zA = (dVar.f44371j && F.a(dVar.f44372k, 4)) ? F.a(dVar.f44374m.f44360b, 1) : true;
        CRC32 crc32 = this.f44012j;
        if (zA) {
            this.f44008e.f44367f = crc32.getValue();
            this.f44009f.f44367f = crc32.getValue();
        }
        g gVar = this.f44006c;
        gVar.f44391a.add(this.f44009f);
        gVar.f44392b.f2516a.add(this.f44008e);
        e eVar2 = this.f44009f;
        if (eVar2.f44373l) {
            c cVar = this.f44011i;
            byte[] bArr = (byte[]) cVar.f14623d;
            a aVar = (a) cVar.f14621b;
            d dVar2 = this.f44004a;
            if (dVar2 == null) {
                throw new Kf.d("input parameters is null, cannot write extended local header");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                aVar.z(byteArrayOutputStream, (int) 134695760);
                a.B(bArr, eVar2.f44367f);
                byteArrayOutputStream.write(bArr, 0, 4);
                if (eVar2.f44381n) {
                    aVar.A(byteArrayOutputStream, eVar2.f44368g);
                    aVar.A(byteArrayOutputStream, eVar2.f44369h);
                } else {
                    a.B(bArr, eVar2.f44368g);
                    byteArrayOutputStream.write(bArr, 0, 4);
                    a.B(bArr, eVar2.f44369h);
                    byteArrayOutputStream.write(bArr, 0, 4);
                }
                dVar2.write(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.f44014p = 0L;
        crc32.reset();
        this.f44007d.close();
        this.f44016w = true;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x030e A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0322 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x033d A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x034b  */
    /* JADX WARN: Code duplicated, block: B:145:0x034e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0354 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x035e A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0365 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x037c A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:125:0x02c8, B:127:0x02fb, B:135:0x030e, B:139:0x0333, B:141:0x033d, B:142:0x0343, B:146:0x0350, B:148:0x0354, B:149:0x0356, B:151:0x035e, B:154:0x0365, B:155:0x0378, B:157:0x037c, B:158:0x03b2, B:138:0x0322), top: B:196:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:175:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:176:0x0414  */
    public final void b(h hVar) throws IOException {
        int i7;
        a aVar;
        boolean z3;
        byte[] bArrM;
        a aVar2;
        int i10;
        p372yg.a aVar3;
        h hVar2;
        char[] cArr;
        int i11;
        b fVar;
        c gVar;
        byte bE;
        char[] cArr2 = null;
        int i12 = 0;
        String str = hVar.f44403g;
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("fileNameInZip is null or empty");
        }
        if (hVar.f44397a == 1 && hVar.f44405i < 0 && !Ag.a.d(hVar.f44403g) && hVar.f44406j) {
            throw new IllegalArgumentException("uncompressed size should be set for zip entries of compression type store");
        }
        h hVar3 = new h();
        hVar3.f44397a = 2;
        hVar3.f44398b = 6;
        hVar3.f44399c = false;
        hVar3.f44400d = 1;
        hVar3.f44401e = 3;
        hVar3.f44402f = 2;
        hVar3.f44404h = 0L;
        hVar3.f44405i = -1L;
        hVar3.f44406j = true;
        hVar3.f44397a = hVar.f44397a;
        hVar3.f44398b = hVar.f44398b;
        hVar3.f44399c = hVar.f44399c;
        hVar3.f44400d = hVar.f44400d;
        hVar3.f44401e = hVar.f44401e;
        int i13 = hVar.f44402f;
        hVar3.f44402f = i13;
        hVar3.f44403g = hVar.f44403g;
        hVar3.f44404h = hVar.f44404h;
        hVar3.f44405i = hVar.f44405i;
        hVar3.f44406j = hVar.f44406j;
        if (Ag.a.d(hVar.f44403g)) {
            hVar3.f44406j = false;
            hVar3.f44397a = 1;
            hVar3.f44399c = false;
            hVar3.f44405i = 0L;
        }
        if (hVar.f44404h <= 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis < 0) {
                hVar3.f44404h = 0L;
            } else {
                hVar3.f44404h = jCurrentTimeMillis;
            }
        }
        d dVar = this.f44004a;
        dVar.getClass();
        this.t.getClass();
        this.f44010g.getClass();
        d dVar2 = new d();
        dVar2.f17706a = 3;
        byte[] bArr = {51, 3};
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            bArr[1] = 0;
        }
        this.f44013o.getClass();
        dVar2.f44378n = ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[0] & UnsignedBytes.MAX_VALUE);
        char c6 = hVar3.f44397a == 2 ? (char) 2 : (char) 1;
        if (hVar3.f44405i > 4294967295L) {
            c6 = 3;
        }
        if (hVar3.f44399c && F.a(hVar3.f44400d, 4)) {
            c6 = 4;
        }
        if (c6 == 1) {
            i7 = 10;
        } else if (c6 == 2) {
            i7 = 20;
        } else if (c6 == 3) {
            i7 = 45;
        } else {
            if (c6 != 4) {
                throw null;
            }
            i7 = 51;
        }
        dVar2.f44363b = i7;
        boolean z8 = hVar3.f44399c;
        if (z8 && hVar3.f44400d == 4) {
            dVar2.f44365d = 3;
            p372yg.a aVar4 = new p372yg.a();
            aVar4.f17706a = 12;
            aVar4.f44360b = 2;
            aVar4.f44361c = 3;
            aVar4.f44362d = 2;
            if (i13 != 0) {
                aVar4.f44360b = i13;
            }
            int i14 = hVar3.f44401e;
            if (i14 == 1) {
                aVar4.f44361c = 1;
            } else if (i14 == 2) {
                aVar4.f44361c = 2;
            } else {
                if (i14 != 3) {
                    throw new Kf.d("invalid AES key strength");
                }
                aVar4.f44361c = 3;
            }
            aVar4.f44362d = hVar3.f44397a;
            dVar2.f44374m = aVar4;
        } else {
            dVar2.f44365d = hVar3.f44397a;
        }
        if (z8) {
            int i15 = hVar3.f44400d;
            if (i15 == 0 || i15 == 1) {
                throw new Kf.d("Encryption method has to be set when encryptFiles flag is set in zip parameters");
            }
            dVar2.f44371j = true;
            dVar2.f44372k = i15;
        }
        String str2 = hVar3.f44403g;
        if (!Ag.a.c(str2)) {
            throw new Kf.d("fileNameInZip is null or empty");
        }
        dVar2.f44370i = str2;
        int length = n.m(str2, null).length;
        dVar2.f44366e = Ag.a.b(hVar3.f44404h);
        boolean zD = Ag.a.d(str2);
        byte[] bArr2 = new byte[4];
        if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("mac")) {
            if (zD) {
                System.arraycopy(Ag.a.f356b, 0, bArr2, 0, 4);
            } else {
                System.arraycopy(Ag.a.f355a, 0, bArr2, 0, 4);
            }
        } else if (System.getProperty("os.name").toLowerCase().contains("win") && zD) {
            bArr2[0] = Ag.a.e(bArr2[0], 4);
        }
        dVar2.f44379o = bArr2;
        if (hVar3.f44406j && hVar3.f44405i == -1) {
            dVar2.f44369h = 0L;
        } else {
            dVar2.f44369h = hVar3.f44405i;
        }
        if (hVar3.f44399c && hVar3.f44400d == 2) {
            dVar2.f44367f = 0L;
        }
        byte[] bArr3 = new byte[2];
        byte bE2 = dVar2.f44371j ? Ag.a.e((byte) 0, 0) : (byte) 0;
        if (F.a(2, hVar3.f44397a)) {
            if (F.a(6, hVar3.f44398b)) {
                bE = (byte) (bE2 & (-3));
            } else if (F.a(8, hVar3.f44398b)) {
                bE = Ag.a.e(bE2, 1);
            } else if (F.a(4, hVar3.f44398b)) {
                bE2 = Ag.a.e((byte) (bE2 & (-3)), 2);
            } else if (F.a(2, hVar3.f44398b) || F.a(10, hVar3.f44398b)) {
                bE2 = Ag.a.e(Ag.a.e(bE2, 1), 2);
            }
            bE2 = (byte) (bE & (-5));
        }
        if (hVar3.f44406j) {
            bE2 = Ag.a.e(bE2, 3);
        }
        bArr3[0] = bE2;
        bArr3[1] = Ag.a.e(bArr3[1], 3);
        dVar2.f44364c = bArr3;
        dVar2.f44373l = hVar3.f44406j;
        this.f44008e = dVar2;
        dVar2.f44380p = dVar.f43997b;
        e eVar = new e();
        eVar.f17706a = 1;
        eVar.f44363b = dVar2.f44363b;
        eVar.f44365d = dVar2.f44365d;
        eVar.f44366e = dVar2.f44366e;
        eVar.f44369h = dVar2.f44369h;
        eVar.f44370i = dVar2.f44370i;
        eVar.f44371j = dVar2.f44371j;
        eVar.f44372k = dVar2.f44372k;
        eVar.f44374m = dVar2.f44374m;
        eVar.f44367f = dVar2.f44367f;
        eVar.f44368g = dVar2.f44368g;
        eVar.f44364c = (byte[]) bArr3.clone();
        eVar.f44373l = dVar2.f44373l;
        this.f44009f = eVar;
        g gVar2 = this.f44006c;
        c cVar = this.f44011i;
        byte[] bArr4 = (byte[]) cVar.f14623d;
        a aVar5 = (a) cVar.f14621b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aVar5.z(byteArrayOutputStream, (int) d0.c(eVar.f17706a));
            aVar5.C(byteArrayOutputStream, eVar.f44363b);
            byteArrayOutputStream.write(eVar.f44364c);
            aVar5.C(byteArrayOutputStream, d0.a(eVar.f44365d));
            a.B(bArr4, eVar.f44366e);
            byteArrayOutputStream.write(bArr4, 0, 4);
            a.B(bArr4, eVar.f44367f);
            byteArrayOutputStream.write(bArr4, 0, 4);
            long j6 = eVar.f44368g;
            if (j6 < 4294967295L) {
                aVar = aVar5;
                if (eVar.f44369h < 4294967295L) {
                    z3 = false;
                }
                if (z3) {
                    a.B(bArr4, 4294967295L);
                    byteArrayOutputStream.write(bArr4, 0, 4);
                    byteArrayOutputStream.write(bArr4, 0, 4);
                    gVar2.f44396f = true;
                    eVar.f44381n = true;
                } else {
                    a.B(bArr4, j6);
                    byteArrayOutputStream.write(bArr4, 0, 4);
                    a.B(bArr4, eVar.f44369h);
                    byteArrayOutputStream.write(bArr4, 0, 4);
                    eVar.f44381n = false;
                }
                bArrM = new byte[0];
                if (Ag.a.c(eVar.f44370i)) {
                    bArrM = n.m(eVar.f44370i, null);
                }
                aVar2 = aVar;
                aVar2.C(byteArrayOutputStream, bArrM.length);
                if (z3) {
                    i10 = 20;
                } else {
                    i10 = 0;
                }
                if (eVar.f44374m != null) {
                    i10 += 11;
                }
                aVar2.C(byteArrayOutputStream, i10);
                if (bArrM.length > 0) {
                    byteArrayOutputStream.write(bArrM);
                }
                if (z3) {
                    aVar2.C(byteArrayOutputStream, (int) 1);
                    aVar2.C(byteArrayOutputStream, 16);
                    aVar2.A(byteArrayOutputStream, eVar.f44369h);
                    aVar2.A(byteArrayOutputStream, eVar.f44368g);
                }
                aVar3 = eVar.f44374m;
                if (aVar3 != null) {
                    aVar2.C(byteArrayOutputStream, (int) d0.c(aVar3.f17706a));
                    aVar2.C(byteArrayOutputStream, 7);
                    aVar2.C(byteArrayOutputStream, d0.d(aVar3.f44360b));
                    byteArrayOutputStream.write(n.m("AE", null));
                    byteArrayOutputStream.write(new byte[]{(byte) d0.b(aVar3.f44361c)});
                    aVar2.C(byteArrayOutputStream, d0.a(aVar3.f44362d));
                }
                dVar.write(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
                hVar2 = new h();
                hVar2.f44001a = 0L;
                hVar2.f44002b = dVar;
                hVar2.f44003c = false;
                if (!hVar3.f44399c) {
                    cArr = this.f44005b;
                    if (cArr != null || cArr.length == 0) {
                        throw new Kf.d("password not set");
                    }
                    int i16 = hVar3.f44400d;
                    if (i16 == 4) {
                        a aVar6 = new a(hVar2, hVar3, cArr);
                        aVar6.f43991c = new byte[16];
                        aVar6.f43992d = 0;
                        fVar = aVar6;
                    } else {
                        i11 = 2;
                        if (i16 != 2) {
                            if (i16 != 3) {
                                throw new Kf.d("Invalid encryption method");
                            }
                            throw new Kf.d("ZIP_STANDARD_VARIANT_STRONG".concat(" encryption method is not supported"));
                        }
                        fVar = new f(hVar2, hVar3, cArr, 1);
                    }
                    if (hVar3.f44397a == i11) {
                        int i17 = hVar3.f44398b;
                        e eVar2 = new e(fVar);
                        eVar2.f43999c = new Deflater(F.i(i17), true);
                        eVar2.f43998b = new byte[4096];
                        gVar = eVar2;
                    } else {
                        gVar = new g(fVar);
                    }
                    this.f44007d = gVar;
                    this.f44016w = false;
                }
                fVar = new f(hVar2, hVar3, cArr2, i12);
                i11 = 2;
                if (hVar3.f44397a == i11) {
                    int i18 = hVar3.f44398b;
                    e eVar3 = new e(fVar);
                    eVar3.f43999c = new Deflater(F.i(i18), true);
                    eVar3.f43998b = new byte[4096];
                    gVar = eVar3;
                } else {
                    gVar = new g(fVar);
                }
                this.f44007d = gVar;
                this.f44016w = false;
            }
            aVar = aVar5;
            z3 = true;
            if (z3) {
                a.B(bArr4, 4294967295L);
                byteArrayOutputStream.write(bArr4, 0, 4);
                byteArrayOutputStream.write(bArr4, 0, 4);
                gVar2.f44396f = true;
                eVar.f44381n = true;
            } else {
                a.B(bArr4, j6);
                byteArrayOutputStream.write(bArr4, 0, 4);
                a.B(bArr4, eVar.f44369h);
                byteArrayOutputStream.write(bArr4, 0, 4);
                eVar.f44381n = false;
            }
            bArrM = new byte[0];
            if (Ag.a.c(eVar.f44370i)) {
                bArrM = n.m(eVar.f44370i, null);
            }
            aVar2 = aVar;
            aVar2.C(byteArrayOutputStream, bArrM.length);
            if (z3) {
                i10 = 20;
            } else {
                i10 = 0;
            }
            if (eVar.f44374m != null) {
                i10 += 11;
            }
            aVar2.C(byteArrayOutputStream, i10);
            if (bArrM.length > 0) {
                byteArrayOutputStream.write(bArrM);
            }
            if (z3) {
                aVar2.C(byteArrayOutputStream, (int) 1);
                aVar2.C(byteArrayOutputStream, 16);
                aVar2.A(byteArrayOutputStream, eVar.f44369h);
                aVar2.A(byteArrayOutputStream, eVar.f44368g);
            }
            aVar3 = eVar.f44374m;
            if (aVar3 != null) {
                aVar2.C(byteArrayOutputStream, (int) d0.c(aVar3.f17706a));
                aVar2.C(byteArrayOutputStream, 7);
                aVar2.C(byteArrayOutputStream, d0.d(aVar3.f44360b));
                byteArrayOutputStream.write(n.m("AE", null));
                byteArrayOutputStream.write(new byte[]{(byte) d0.b(aVar3.f44361c)});
                aVar2.C(byteArrayOutputStream, d0.a(aVar3.f44362d));
            }
            dVar.write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            hVar2 = new h();
            hVar2.f44001a = 0L;
            hVar2.f44002b = dVar;
            hVar2.f44003c = false;
            if (!hVar3.f44399c) {
                cArr = this.f44005b;
                if (cArr != null) {
                }
                throw new Kf.d("password not set");
            }
            fVar = new f(hVar2, hVar3, cArr2, i12);
            i11 = 2;
            if (hVar3.f44397a == i11) {
                int i19 = hVar3.f44398b;
                e eVar4 = new e(fVar);
                eVar4.f43999c = new Deflater(F.i(i19), true);
                eVar4.f43998b = new byte[4096];
                gVar = eVar4;
            } else {
                gVar = new g(fVar);
            }
            this.f44007d = gVar;
            this.f44016w = false;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:6:0x0022, B:8:0x0029, B:10:0x002d, B:14:0x003c, B:18:0x0051, B:31:0x00a6, B:33:0x00af, B:36:0x00bb, B:37:0x00c2, B:22:0x0061, B:24:0x0065, B:27:0x006f, B:29:0x0073, B:30:0x007a, B:13:0x0037), top: B:45:0x0022 }] */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j6;
        f fVar;
        if (!this.f44016w) {
            a();
        }
        g gVar = this.f44006c;
        p372yg.c cVar = gVar.f44393c;
        d dVar = this.f44004a;
        cVar.f44376c = dVar.f43997b;
        this.t.getClass();
        c cVar2 = this.f44011i;
        a aVar = (a) cVar2.f14621b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.r(gVar, dVar);
            if (!gVar.f44396f || (fVar = gVar.f44395e) == null) {
                j6 = gVar.f44393c.f44376c;
            } else {
                j6 = fVar.f44390j;
                if (j6 == -1) {
                    j6 = gVar.f44393c.f44376c;
                }
            }
            long j10 = j6;
            cVar2.v(gVar, byteArrayOutputStream, aVar);
            int size = byteArrayOutputStream.size();
            if (gVar.f44396f || j10 >= 4294967295L || gVar.f44392b.f2516a.size() >= 65535) {
                if (gVar.f44395e == null) {
                    gVar.f44395e = new f();
                }
                if (gVar.f44394d == null) {
                    gVar.f44394d = new p372yg.c();
                }
                p372yg.c cVar3 = gVar.f44394d;
                cVar3.f44376c = ((long) size) + j10;
                cVar3.f44375b = 0;
                cVar3.f44377d = 1;
                f fVarE = c.e(gVar, size, j10);
                gVar.f44395e = fVarE;
                c.x(fVarE, byteArrayOutputStream, aVar);
                p372yg.c cVar4 = gVar.f44394d;
                aVar.z(byteArrayOutputStream, (int) 117853008);
                aVar.z(byteArrayOutputStream, cVar4.f44375b);
                aVar.A(byteArrayOutputStream, cVar4.f44376c);
                aVar.z(byteArrayOutputStream, cVar4.f44377d);
            }
            c.w(gVar, size, j10, byteArrayOutputStream, aVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray == null) {
                throw new Kf.d("invalid buff to write as zip headers");
            }
            dVar.write(byteArray);
            byteArrayOutputStream.close();
            dVar.close();
            this.f44015v = true;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        if (!this.f44015v) {
            this.f44012j.update(bArr, i7, i10);
            this.f44007d.write(bArr, i7, i10);
            this.f44014p += (long) i10;
            return;
        }
        throw new IOException("Stream is closed");
    }
}
