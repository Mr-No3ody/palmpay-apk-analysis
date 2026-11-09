package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p332w1.b;
import p332w1.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GifDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f20474a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GifDecoder.BitmapProvider f20476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f20477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f20478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f20479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public short[] f20480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f20481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f20482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f20483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f20484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20485l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f20487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20492s;
    public Boolean t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20475b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bitmap.Config f20493u = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f20486m = new b();

    public a(GifDecoder.BitmapProvider bitmapProvider, b bVar, ByteBuffer byteBuffer, int i7) {
        this.f20476c = bitmapProvider;
        setData(bVar, byteBuffer, i7);
    }

    public final Bitmap a() {
        Boolean bool = this.t;
        Bitmap bitmapObtain = this.f20476c.obtain(this.f20492s, this.f20491r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f20493u);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void advance() {
        this.f20485l = (this.f20485l + 1) % this.f20486m.f43240c;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [short] */
    /* JADX WARN: Type inference failed for: r6v21 */
    public final Bitmap b(p332w1.a aVar, p332w1.a aVar2) {
        byte b7;
        int i7;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        short s3;
        int i15;
        Bitmap bitmap;
        int i16;
        int[] iArr2 = this.f20484k;
        GifDecoder.BitmapProvider bitmapProvider = this.f20476c;
        byte b10 = 0;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.f20487n;
            if (bitmap2 != null) {
                bitmapProvider.release(bitmap2);
            }
            this.f20487n = null;
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && aVar2.f43233g == 3 && this.f20487n == null) {
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && (i15 = aVar2.f43233g) > 0) {
            if (i15 == 2) {
                if (aVar.f43232f) {
                    i16 = 0;
                } else {
                    b bVar = this.f20486m;
                    i16 = bVar.f43248k;
                    if (aVar.f43237k != null && bVar.f43247j == aVar.f43234h) {
                        i16 = 0;
                    }
                }
                int i17 = aVar2.f43230d;
                int i18 = this.f20490q;
                int i19 = i17 / i18;
                int i20 = aVar2.f43228b / i18;
                int i21 = aVar2.f43229c / i18;
                int i22 = aVar2.f43227a / i18;
                int i23 = this.f20492s;
                int i24 = (i20 * i23) + i22;
                int i25 = (i19 * i23) + i24;
                while (i24 < i25) {
                    int i26 = i24 + i21;
                    for (int i27 = i24; i27 < i26; i27++) {
                        iArr2[i27] = i16;
                    }
                    i24 += this.f20492s;
                }
            } else if (i15 == 3 && (bitmap = this.f20487n) != null) {
                int i28 = this.f20492s;
                bitmap.getPixels(iArr2, 0, i28, 0, 0, i28, this.f20491r);
            }
        }
        int[] iArr3 = iArr2;
        this.f20477d.position(aVar.f43236j);
        int i29 = aVar.f43229c * aVar.f43230d;
        byte[] bArr = this.f20483j;
        if (bArr == null || bArr.length < i29) {
            this.f20483j = bitmapProvider.obtainByteArray(i29);
        }
        byte[] bArr2 = this.f20483j;
        if (this.f20480g == null) {
            this.f20480g = new short[4096];
        }
        short[] sArr = this.f20480g;
        if (this.f20481h == null) {
            this.f20481h = new byte[4096];
        }
        byte[] bArr3 = this.f20481h;
        if (this.f20482i == null) {
            this.f20482i = new byte[4097];
        }
        byte[] bArr4 = this.f20482i;
        int i30 = this.f20477d.get() & UnsignedBytes.MAX_VALUE;
        int i31 = 1;
        int i32 = 1 << i30;
        int i33 = i32 + 1;
        int i34 = i32 + 2;
        int i35 = i30 + 1;
        int i36 = (1 << i35) - 1;
        int i37 = 0;
        while (i37 < i32) {
            sArr[i37] = 0;
            bArr3[i37] = (byte) i37;
            i37++;
            i31 = i31;
        }
        int i38 = i31;
        byte[] bArr5 = this.f20478e;
        int i39 = i35;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = i34;
        int i49 = i36;
        int i50 = -1;
        while (true) {
            if (i40 >= i29) {
                iArr3 = iArr3;
                b7 = b10;
                break;
            }
            if (i41 == 0) {
                i14 = -1;
                int i51 = this.f20477d.get() & UnsignedBytes.MAX_VALUE;
                if (i51 > 0) {
                    ByteBuffer byteBuffer = this.f20477d;
                    byteBuffer.get(this.f20478e, 0, Math.min(i51, byteBuffer.remaining()));
                }
                if (i51 <= 0) {
                    this.f20489p = 3;
                    b7 = 0;
                    break;
                }
                i41 = i51;
                i42 = 0;
            } else {
                iArr3 = iArr3;
                sArr = sArr;
                i14 = -1;
            }
            i44 += (bArr5[i42] & UnsignedBytes.MAX_VALUE) << i43;
            i42++;
            i41--;
            i43 += 8;
            i48 = i48;
            i50 = i50;
            i39 = i39;
            i47 = i47;
            while (true) {
                i43 = i43;
                if (i43 < i39) {
                    b10 = 0;
                    break;
                }
                int i52 = i44 & i49;
                i44 >>= i39;
                i43 -= i39;
                if (i52 == i32) {
                    i39 = i35;
                    i48 = i34;
                    i49 = i36;
                    i43 = i43;
                    i50 = i14;
                } else {
                    if (i52 == i33) {
                        b10 = 0;
                        break;
                    }
                    int i53 = i40;
                    if (i50 == i14) {
                        bArr2[i45] = bArr3[i52];
                        i45++;
                        i40 = i53 + 1;
                        i50 = i52;
                        i47 = i50;
                    } else {
                        if (i52 >= i48) {
                            bArr4[i46] = (byte) i47;
                            i46++;
                            s3 = i50;
                        } else {
                            s3 = i52;
                        }
                        while (s3 >= i32) {
                            bArr4[i46] = bArr3[s3];
                            i46++;
                            s3 = sArr[s3];
                        }
                        i47 = bArr3[s3] & UnsignedBytes.MAX_VALUE;
                        byte b11 = (byte) i47;
                        bArr2[i45] = b11;
                        while (true) {
                            i45++;
                            i53++;
                            if (i46 <= 0) {
                                break;
                            }
                            i46--;
                            bArr2[i45] = bArr4[i46];
                        }
                        if (i48 < 4096) {
                            sArr[i48] = (short) i50;
                            bArr3[i48] = b11;
                            i48++;
                            if ((i48 & i49) == 0 && i48 < 4096) {
                                i39++;
                                i49 += i48;
                            }
                        }
                        i40 = i53;
                        i50 = i52;
                    }
                    i14 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i45, i29, b7);
        if (aVar.f43231e || this.f20490q != i38) {
            int[] iArr4 = this.f20484k;
            int i54 = aVar.f43230d;
            int i55 = this.f20490q;
            int i56 = i54 / i55;
            int i57 = aVar.f43228b / i55;
            int i58 = aVar.f43229c / i55;
            int i59 = aVar.f43227a / i55;
            boolean z3 = this.f20485l == 0;
            int i60 = this.f20492s;
            int i61 = this.f20491r;
            byte[] bArr6 = this.f20483j;
            int[] iArr5 = this.f20474a;
            Boolean bool = this.t;
            int i62 = 8;
            int i63 = 0;
            int i64 = 1;
            int i65 = 0;
            while (i65 < i56) {
                int[] iArr6 = iArr4;
                if (aVar.f43231e) {
                    if (i63 >= i56) {
                        i64++;
                        if (i64 == 2) {
                            i63 = 4;
                        } else if (i64 == 3) {
                            i62 = 4;
                            i63 = 2;
                        } else if (i64 == 4) {
                            i63 = 1;
                            i62 = 2;
                        }
                    }
                    i7 = i63 + i62;
                } else {
                    i7 = i63;
                    i63 = i65;
                }
                int i66 = i63 + i57;
                int i67 = i7;
                boolean z8 = i55 == 1;
                if (i66 < i61) {
                    int i68 = i66 * i60;
                    int i69 = i68 + i59;
                    boolean z10 = z8;
                    int i70 = i69 + i58;
                    int i71 = i68 + i60;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    i10 = i56;
                    int i72 = i65 * i55 * aVar.f43229c;
                    if (z10) {
                        int i73 = i69;
                        while (i73 < i70) {
                            int i74 = i73;
                            int i75 = iArr5[bArr6[i72] & UnsignedBytes.MAX_VALUE];
                            if (i75 != 0) {
                                iArr6[i74] = i75;
                            } else if (z3 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i55;
                            i73 = i74 + 1;
                        }
                    } else {
                        int i76 = ((i70 - i69) * i55) + i72;
                        i11 = i55;
                        int i77 = i69;
                        while (i77 < i70) {
                            int i78 = i70;
                            int i79 = aVar.f43229c;
                            int i80 = i77;
                            int i81 = i72;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            while (true) {
                                if (i81 >= this.f20490q + i72) {
                                    i12 = i57;
                                    break;
                                }
                                byte[] bArr7 = this.f20483j;
                                i12 = i57;
                                if (i81 >= bArr7.length || i81 >= i76) {
                                    break;
                                }
                                int i87 = this.f20474a[bArr7[i81] & UnsignedBytes.MAX_VALUE];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & 255;
                                    i83 += (i87 >> 16) & 255;
                                    i84 += (i87 >> 8) & 255;
                                    i85 += i87 & 255;
                                    i86++;
                                }
                                i81++;
                                i57 = i12;
                            }
                            int i88 = i72 + i79;
                            int i89 = i88;
                            while (i89 < this.f20490q + i88) {
                                byte[] bArr8 = this.f20483j;
                                int i90 = i88;
                                if (i89 >= bArr8.length || i89 >= i76) {
                                    break;
                                }
                                int i91 = this.f20474a[bArr8[i89] & UnsignedBytes.MAX_VALUE];
                                if (i91 != 0) {
                                    i82 += (i91 >> 24) & 255;
                                    i83 += (i91 >> 16) & 255;
                                    i84 += (i91 >> 8) & 255;
                                    i85 += i91 & 255;
                                    i86++;
                                }
                                i89++;
                                i88 = i90;
                            }
                            int i92 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                            if (i92 != 0) {
                                iArr6[i80] = i92;
                            } else if (z3 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i11;
                            i77 = i80 + 1;
                            i70 = i78;
                            i57 = i12;
                        }
                    }
                    i65++;
                    iArr4 = iArr6;
                    i63 = i67;
                    i55 = i11;
                    i56 = i10;
                    i57 = i57;
                } else {
                    i10 = i56;
                }
                i11 = i55;
                i65++;
                iArr4 = iArr6;
                i63 = i67;
                i55 = i11;
                i56 = i10;
                i57 = i57;
            }
            if (this.t == null) {
                this.t = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr7 = this.f20484k;
            int i93 = aVar.f43230d;
            int i94 = aVar.f43228b;
            int i95 = aVar.f43229c;
            int i96 = aVar.f43227a;
            byte b12 = this.f20485l == 0 ? (byte) 1 : b7;
            int i97 = this.f20492s;
            byte[] bArr9 = this.f20483j;
            int[] iArr8 = this.f20474a;
            byte b13 = -1;
            for (int i98 = b7; i98 < i93; i98++) {
                int i99 = (i98 + i94) * i97;
                int i100 = i99 + i96;
                int i101 = i100 + i95;
                int i102 = i99 + i97;
                if (i102 < i101) {
                    i101 = i102;
                }
                int i103 = aVar.f43229c * i98;
                while (i100 < i101) {
                    int[] iArr9 = iArr7;
                    byte b14 = bArr9[i103];
                    int i104 = i93;
                    int i105 = b14 & UnsignedBytes.MAX_VALUE;
                    if (i105 != b13) {
                        int i106 = iArr8[i105];
                        if (i106 != 0) {
                            iArr9[i100] = i106;
                        } else {
                            b13 = b14;
                        }
                    }
                    i103++;
                    i100++;
                    iArr7 = iArr9;
                    i93 = i104;
                }
            }
            Boolean bool2 = this.t;
            this.t = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.t != null || b12 == 0 || b13 == -1));
        }
        if (this.f20488o && ((i13 = aVar.f43233g) == 0 || i13 == 1)) {
            if (this.f20487n == null) {
                this.f20487n = a();
            }
            Bitmap bitmap3 = this.f20487n;
            int i107 = this.f20492s;
            iArr = iArr3;
            bitmap3.setPixels(iArr, 0, i107, 0, 0, i107, this.f20491r);
        } else {
            iArr = iArr3;
        }
        Bitmap bitmapA = a();
        int i108 = this.f20492s;
        bitmapA.setPixels(iArr, 0, i108, 0, 0, i108, this.f20491r);
        return bitmapA;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void clear() {
        this.f20486m = null;
        byte[] bArr = this.f20483j;
        GifDecoder.BitmapProvider bitmapProvider = this.f20476c;
        if (bArr != null) {
            bitmapProvider.release(bArr);
        }
        int[] iArr = this.f20484k;
        if (iArr != null) {
            bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.f20487n;
        if (bitmap != null) {
            bitmapProvider.release(bitmap);
        }
        this.f20487n = null;
        this.f20477d = null;
        this.t = null;
        byte[] bArr2 = this.f20478e;
        if (bArr2 != null) {
            bitmapProvider.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getByteSize() {
        return (this.f20484k.length * 4) + this.f20477d.limit() + this.f20483j.length;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getCurrentFrameIndex() {
        return this.f20485l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final ByteBuffer getData() {
        return this.f20477d;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getDelay(int i7) {
        if (i7 < 0) {
            return -1;
        }
        b bVar = this.f20486m;
        if (i7 < bVar.f43240c) {
            return ((p332w1.a) bVar.f43242e.get(i7)).f43235i;
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getFrameCount() {
        return this.f20486m.f43240c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getHeight() {
        return this.f20486m.f43244g;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getLoopCount() {
        int i7 = this.f20486m.f43249l;
        if (i7 == -1) {
            return 1;
        }
        return i7;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getNetscapeLoopCount() {
        return this.f20486m.f43249l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getNextDelay() {
        int i7;
        if (this.f20486m.f43240c <= 0 || (i7 = this.f20485l) < 0) {
            return 0;
        }
        return getDelay(i7);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized Bitmap getNextFrame() {
        try {
            if (this.f20486m.f43240c <= 0 || this.f20485l < 0) {
                if (Log.isLoggable("a", 3)) {
                    int i7 = this.f20486m.f43240c;
                }
                this.f20489p = 1;
            }
            int i10 = this.f20489p;
            if (i10 != 1 && i10 != 2) {
                this.f20489p = 0;
                if (this.f20478e == null) {
                    this.f20478e = this.f20476c.obtainByteArray(255);
                }
                p332w1.a aVar = (p332w1.a) this.f20486m.f43242e.get(this.f20485l);
                int i11 = this.f20485l - 1;
                p332w1.a aVar2 = i11 >= 0 ? (p332w1.a) this.f20486m.f43242e.get(i11) : null;
                int[] iArr = aVar.f43237k;
                if (iArr == null) {
                    iArr = this.f20486m.f43238a;
                }
                this.f20474a = iArr;
                if (iArr == null) {
                    this.f20489p = 1;
                    return null;
                }
                if (aVar.f43232f) {
                    System.arraycopy(iArr, 0, this.f20475b, 0, iArr.length);
                    int[] iArr2 = this.f20475b;
                    this.f20474a = iArr2;
                    iArr2[aVar.f43234h] = 0;
                    if (aVar.f43233g == 2 && this.f20485l == 0) {
                        this.t = Boolean.TRUE;
                    }
                }
                return b(aVar, aVar2);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getStatus() {
        return this.f20489p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getTotalIterationCount() {
        int i7 = this.f20486m.f43249l;
        if (i7 == -1) {
            return 1;
        }
        if (i7 == 0) {
            return 0;
        }
        return i7 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int getWidth() {
        return this.f20486m.f43243f;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final int read(InputStream inputStream, int i7) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7 > 0 ? i7 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 16384);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.f20489p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f20489p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void resetFrameIndex() {
        this.f20485l = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized void setData(b bVar, byte[] bArr) {
        setData(bVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final void setDefaultBitmapConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f20493u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized void setData(b bVar, ByteBuffer byteBuffer) {
        setData(bVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized void setData(b bVar, ByteBuffer byteBuffer, int i7) {
        try {
            if (i7 > 0) {
                int iHighestOneBit = Integer.highestOneBit(i7);
                this.f20489p = 0;
                this.f20486m = bVar;
                this.f20485l = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f20477d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f20477d.order(ByteOrder.LITTLE_ENDIAN);
                this.f20488o = false;
                Iterator it = bVar.f43242e.iterator();
                while (it.hasNext()) {
                    if (((p332w1.a) it.next()).f43233g == 3) {
                        this.f20488o = true;
                        break;
                    }
                }
                this.f20490q = iHighestOneBit;
                int i10 = bVar.f43243f;
                this.f20492s = i10 / iHighestOneBit;
                int i11 = bVar.f43244g;
                this.f20491r = i11 / iHighestOneBit;
                this.f20483j = this.f20476c.obtainByteArray(i10 * i11);
                this.f20484k = this.f20476c.obtainIntArray(this.f20492s * this.f20491r);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized int read(byte[] bArr) {
        try {
            if (this.f20479f == null) {
                this.f20479f = new c();
            }
            c cVar = this.f20479f;
            if (bArr != null) {
                cVar.getClass();
                cVar.f(ByteBuffer.wrap(bArr));
            } else {
                cVar.f43251b = null;
                cVar.f43252c.f43239b = 2;
            }
            b bVarB = cVar.b();
            this.f20486m = bVarB;
            if (bArr != null) {
                setData(bVarB, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20489p;
    }
}
