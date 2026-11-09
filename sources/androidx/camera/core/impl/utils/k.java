package androidx.camera.core.impl.utils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f14235g = "Exif\u0000\u0000".getBytes(f.f14182d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f14238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14241f;

    public k(ByteArrayOutputStream byteArrayOutputStream, j jVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f14237b = new byte[1];
        this.f14238c = ByteBuffer.allocate(4);
        this.f14239d = 0;
        this.f14236a = jVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        j jVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 1;
        int i17 = i7;
        int i18 = i10;
        while (true) {
            int i19 = this.f14240e;
            if ((i19 <= 0 && this.f14241f <= 0 && this.f14239d == 2) || i18 <= 0) {
                break;
            }
            if (i19 > 0) {
                int iMin = Math.min(i18, i19);
                i18 -= iMin;
                this.f14240e -= iMin;
                i17 += iMin;
            }
            int i20 = this.f14241f;
            if (i20 > 0) {
                int iMin2 = Math.min(i18, i20);
                ((FilterOutputStream) this).out.write(bArr, i17, iMin2);
                i18 -= iMin2;
                this.f14241f -= iMin2;
                i17 += iMin2;
            }
            if (i18 == 0) {
                return;
            }
            int i21 = this.f14239d;
            int i22 = 0;
            int i23 = 4;
            ByteBuffer byteBuffer = this.f14238c;
            if (i21 != 0) {
                if (i21 == i16) {
                    int iMin3 = Math.min(i18, 4 - byteBuffer.position());
                    byteBuffer.put(bArr, i17, iMin3);
                    i17 += iMin3;
                    i18 -= iMin3;
                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                        byteBuffer.rewind();
                    }
                    if (byteBuffer.position() < 4) {
                        return;
                    }
                    byteBuffer.rewind();
                    short s3 = byteBuffer.getShort();
                    if (s3 == -31) {
                        this.f14240e = (byteBuffer.getShort() & 65535) - 2;
                        this.f14239d = 2;
                    } else if (s3 < -64 || s3 > -49 || s3 == -60 || s3 == -56 || s3 == -52) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.f14241f = (byteBuffer.getShort() & 65535) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.f14239d = 2;
                    }
                    byteBuffer.rewind();
                }
                i11 = i16;
            } else {
                int iMin4 = Math.min(i18, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i17, iMin4);
                int i24 = i17 + iMin4;
                i18 -= iMin4;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.f14239d = i16;
                byteBuffer.rewind();
                OutputStream outputStream = ((FilterOutputStream) this).out;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                c cVar = new c(outputStream);
                cVar.c((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                l[] lVarArr = j.f14230c;
                int i25 = 0;
                while (true) {
                    jVar = this.f14236a;
                    if (i25 >= i23) {
                        break;
                    }
                    l lVar = lVarArr[i25];
                    int i26 = 0;
                    while (true) {
                        l[] lVarArr2 = j.f14230c;
                        if (i26 < i23) {
                            jVar.a(i26).remove(lVar.f14243b);
                            i26 += i16;
                            i23 = 4;
                        }
                    }
                    i25 += i16;
                    i23 = 4;
                }
                boolean zIsEmpty = jVar.a(i16).isEmpty();
                ByteOrder byteOrder2 = jVar.f14234b;
                if (!zIsEmpty) {
                    jVar.a(0).put(j.f14230c[i16].f14243b, f.a(0L, byteOrder2));
                }
                if (!jVar.a(2).isEmpty()) {
                    jVar.a(0).put(j.f14230c[2].f14243b, f.a(0L, byteOrder2));
                }
                if (!jVar.a(3).isEmpty()) {
                    jVar.a(i16).put(j.f14230c[3].f14243b, f.a(0L, byteOrder2));
                }
                int i27 = 0;
                while (true) {
                    l[] lVarArr3 = j.f14230c;
                    if (i27 >= 4) {
                        break;
                    }
                    Iterator it = jVar.a(i27).entrySet().iterator();
                    int i28 = i22;
                    while (it.hasNext()) {
                        f fVar = (f) ((Map.Entry) it.next()).getValue();
                        int i29 = f.f14184f[fVar.f14185a] * fVar.f14186b;
                        if (i29 > 4) {
                            i28 += i29;
                        }
                    }
                    iArr2[i27] = iArr2[i27] + i28;
                    i27 += i16;
                    i22 = 0;
                }
                int size = 8;
                int i30 = 0;
                while (true) {
                    l[] lVarArr4 = j.f14230c;
                    if (i30 >= 4) {
                        break;
                    }
                    if (!jVar.a(i30).isEmpty()) {
                        iArr[i30] = size;
                        size += (jVar.a(i30).size() * 12) + 6 + iArr2[i30];
                    }
                    i30 += i16;
                }
                int i31 = size + 8;
                if (!jVar.a(i16).isEmpty()) {
                    jVar.a(0).put(j.f14230c[i16].f14243b, f.a(iArr[i16], byteOrder2));
                }
                if (!jVar.a(2).isEmpty()) {
                    jVar.a(0).put(j.f14230c[2].f14243b, f.a(iArr[2], byteOrder2));
                }
                if (!jVar.a(3).isEmpty()) {
                    jVar.a(i16).put(j.f14230c[3].f14243b, f.a(iArr[3], byteOrder2));
                }
                cVar.c((short) i31);
                cVar.write(f14235g);
                cVar.c(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                cVar.f14149c = byteOrder2;
                cVar.c((short) 42);
                cVar.b((int) 8);
                int i32 = 0;
                while (true) {
                    l[] lVarArr5 = j.f14230c;
                    if (i32 >= 4) {
                        break;
                    }
                    if (jVar.a(i32).isEmpty()) {
                        i12 = i16;
                        i13 = i24;
                    } else {
                        cVar.c((short) jVar.a(i32).size());
                        int size2 = (jVar.a(i32).size() * 12) + iArr[i32] + 2 + 4;
                        for (Map.Entry entry : jVar.a(i32).entrySet()) {
                            l lVar2 = (l) ((HashMap) i.f14227f.get(i32)).get(entry.getKey());
                            p118hf.a.j(lVar2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                            f fVar2 = (f) entry.getValue();
                            int i33 = f.f14184f[fVar2.f14185a];
                            int i34 = fVar2.f14186b;
                            int i35 = i33 * i34;
                            cVar.c((short) lVar2.f14242a);
                            cVar.c((short) fVar2.f14185a);
                            cVar.b(i34);
                            if (i35 > 4) {
                                i14 = i16;
                                i15 = i24;
                                cVar.b(size2);
                                size2 += i35;
                            } else {
                                i14 = i16;
                                i15 = i24;
                                cVar.write(fVar2.f14187c);
                                if (i35 < 4) {
                                    for (int i36 = 4; i35 < i36; i36 = 4) {
                                        cVar.f14148b.write(0);
                                        i35 += i14;
                                    }
                                }
                            }
                            i24 = i15;
                            i16 = i14;
                        }
                        i12 = i16;
                        i13 = i24;
                        cVar.b((int) 0);
                        Iterator it2 = jVar.a(i32).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = ((f) ((Map.Entry) it2.next()).getValue()).f14187c;
                            if (bArr2.length > 4) {
                                cVar.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i32 += i12;
                    i24 = i13;
                    i16 = i12;
                }
                i11 = i16;
                cVar.f14149c = ByteOrder.BIG_ENDIAN;
                i17 = i24;
            }
            i16 = i11;
        }
        if (i18 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i17, i18);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i7) throws IOException {
        byte[] bArr = this.f14237b;
        bArr[0] = (byte) (i7 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
