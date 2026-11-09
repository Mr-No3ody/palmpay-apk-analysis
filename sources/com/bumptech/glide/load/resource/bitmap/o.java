package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20933f = com.bumptech.glide.load.g.a(com.bumptech.glide.load.b.f20516c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20934g = new com.bumptech.glide.load.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, com.bumptech.glide.load.g.f20802e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final E f20937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f20938k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f20939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f20940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f20943e = u.a();

    static {
        m mVar = m.f20925b;
        Boolean bool = Boolean.FALSE;
        f20935h = com.bumptech.glide.load.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f20936i = com.bumptech.glide.load.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f20937j = new E(3);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = J1.o.f4478a;
        f20938k = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, BitmapPool bitmapPool, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20942d = arrayList;
        J1.g.c(displayMetrics, "Argument must not be null");
        this.f20940b = displayMetrics;
        J1.g.c(bitmapPool, "Argument must not be null");
        this.f20939a = bitmapPool;
        J1.g.c(fVar, "Argument must not be null");
        this.f20941c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(com.bumptech.glide.load.resource.bitmap.ImageReader r8, android.graphics.BitmapFactory.Options r9, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r10, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.onObtainBounds()
            r8.stopGrowingBuffers()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.B.f20894d
            r3.lock()
            android.graphics.Bitmap r8 = r8.decodeBitmap(r9)     // Catch: java.lang.IllegalArgumentException -> L1d java.lang.Throwable -> L58
            r3.unlock()
            return r8
        L1d:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = N8.q0.p(r0, r5, r1, r6, r7)     // Catch: java.lang.Throwable -> L58
            r0.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L58
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L58
            r0.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L58
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L58
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L57
            r11.put(r0)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            r0 = 0
            r9.inBitmap = r0     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.B.f20894d
            r9.unlock()
            return r8
        L56:
            throw r4     // Catch: java.lang.Throwable -> L58
        L57:
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.B.f20894d
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.o.c(com.bumptech.glide.load.resource.bitmap.ImageReader, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C1331c a(ImageReader imageReader, int i7, int i10, com.bumptech.glide.load.h hVar, Downsampler$DecodeCallbacks downsampler$DecodeCallbacks) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f20941c.get(65536, byte[].class);
        synchronized (o.class) {
            arrayDeque = f20938k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar = (com.bumptech.glide.load.b) hVar.a(f20933f);
        com.bumptech.glide.load.i iVar = (com.bumptech.glide.load.i) hVar.a(f20934g);
        m mVar = (m) hVar.a(m.f20930g);
        boolean zBooleanValue = ((Boolean) hVar.a(f20935h)).booleanValue();
        com.bumptech.glide.load.g gVar = f20936i;
        try {
            C1331c c1331cA = C1331c.a(this.f20939a, b(imageReader, options, mVar, bVar, iVar, hVar.a(gVar) != null && ((Boolean) hVar.a(gVar)).booleanValue(), i7, i10, zBooleanValue, downsampler$DecodeCallbacks));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return c1331cA;
        } finally {
            e(options);
            ArrayDeque arrayDeque2 = f20938k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f20941c.put(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x020f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0212  */
    /* JADX WARN: Code duplicated, block: B:107:0x0214  */
    /* JADX WARN: Code duplicated, block: B:116:0x0230  */
    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:120:0x023b  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f  */
    /* JADX WARN: Code duplicated, block: B:127:0x024d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0251  */
    /* JADX WARN: Code duplicated, block: B:133:0x0259  */
    /* JADX WARN: Code duplicated, block: B:135:0x025c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0262  */
    /* JADX WARN: Code duplicated, block: B:142:0x028d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0296  */
    /* JADX WARN: Code duplicated, block: B:146:0x029b  */
    /* JADX WARN: Code duplicated, block: B:148:0x029e  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x02da  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:171:0x0306  */
    /* JADX WARN: Code duplicated, block: B:173:0x0310  */
    /* JADX WARN: Code duplicated, block: B:174:0x0313  */
    /* JADX WARN: Code duplicated, block: B:177:0x0324  */
    /* JADX WARN: Code duplicated, block: B:178:0x0328  */
    /* JADX WARN: Code duplicated, block: B:179:0x0331  */
    /* JADX WARN: Code duplicated, block: B:180:0x0335  */
    /* JADX WARN: Code duplicated, block: B:181:0x033e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0347  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x037a  */
    /* JADX WARN: Code duplicated, block: B:187:0x037f  */
    /* JADX WARN: Code duplicated, block: B:191:0x039f  */
    /* JADX WARN: Code duplicated, block: B:193:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r40v0, types: [com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(ImageReader imageReader, BitmapFactory.Options options, m mVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.i iVar, boolean z3, int i7, int i10, boolean z8, Downsampler$DecodeCallbacks downsampler$DecodeCallbacks) throws IOException {
        char c6;
        boolean z10;
        float f10;
        int i11;
        boolean zC;
        boolean z11;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        float f11;
        int i14;
        ?? r10;
        ?? C10;
        Matrix matrix;
        Bitmap.Config config2;
        boolean z14;
        ColorSpace.Named named;
        Bitmap.Config config3;
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        int i17 = J1.i.f4465a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        ?? r11 = this.f20939a;
        c(imageReader, options, downsampler$DecodeCallbacks, r11);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i18 = iArr[0];
        int i19 = iArr[1];
        boolean z15 = (i18 == -1 || i19 == -1) ? false : z3;
        int imageOrientation = imageReader.getImageOrientation();
        switch (imageOrientation) {
            case 3:
            case 4:
                c6 = 180;
                break;
            case 5:
            case 6:
                c6 = 'Z';
                break;
            case 7:
            case 8:
                c6 = 270;
                break;
            default:
                c6 = 0;
                break;
        }
        switch (imageOrientation) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        int i20 = i7;
        if (i20 == Integer.MIN_VALUE) {
            i20 = (c6 == 'Z' || c6 == 270) ? i19 : i18;
        }
        if (i10 == -2147483648) {
            i10 = (c6 == 'Z' || c6 == 270) ? i18 : i19;
        }
        ImageHeaderParser.ImageType imageType = imageReader.getImageType();
        String str = "Downsampler";
        if (i18 > 0) {
            if (i19 <= 0) {
                i11 = 3;
                f10 = 1.0f;
            } else {
                f10 = 1.0f;
                if (c6 == 'Z' || c6 == 270) {
                    i15 = i19;
                    i16 = i18;
                } else {
                    i16 = i19;
                    i15 = i18;
                }
                float fB = mVar.b(i15, i16, i20, i10);
                if (fB <= 0.0f) {
                    StringBuilder sb2 = new StringBuilder("Cannot scale with factor: ");
                    sb2.append(fB);
                    sb2.append(" from: ");
                    sb2.append(mVar);
                    sb2.append(", source: [");
                    androidx.camera.video.u.u(sb2, i18, "x", i19, "], target: [");
                    sb2.append(i20);
                    sb2.append("x");
                    sb2.append(i10);
                    sb2.append("]");
                    throw new IllegalArgumentException(sb2.toString());
                }
                z15 = z15;
                int iA = mVar.a(i15, i16, i20, i10);
                if (iA == 0) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                float f12 = i15;
                int i21 = i15;
                float f13 = i16;
                int i22 = i21 / ((int) (((double) (fB * f12)) + 0.5d));
                int i23 = i16 / ((int) (((double) (fB * f13)) + 0.5d));
                int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i22, i23) : Math.min(i22, i23)));
                if (iA == 1 && iMax < 1.0f / fB) {
                    iMax <<= 1;
                }
                options.inSampleSize = iMax;
                if (imageType == ImageHeaderParser.ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f12 / fMin);
                    iFloor2 = (int) Math.ceil(f13 / fMin);
                    int i24 = iMax / 8;
                    if (i24 > 0) {
                        iFloor /= i24;
                        iFloor2 /= i24;
                    }
                } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                    float f14 = iMax;
                    iFloor = (int) Math.floor(f12 / f14);
                    iFloor2 = (int) Math.floor(f13 / f14);
                } else if (imageType.isWebp()) {
                    float f15 = iMax;
                    iFloor = Math.round(f12 / f15);
                    iFloor2 = Math.round(f13 / f15);
                } else if (i21 % iMax == 0 && i16 % iMax == 0) {
                    iFloor = i21 / iMax;
                    iFloor2 = i16 / iMax;
                } else {
                    options.inJustDecodeBounds = true;
                    c(imageReader, options, downsampler$DecodeCallbacks, r11);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    iFloor = iArr2[0];
                    iFloor2 = iArr2[1];
                }
                double dB = mVar.b(iFloor, iFloor2, i20, i10);
                int iRound = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                int i25 = (int) ((((double) iRound) * dB) + 0.5d);
                options.inTargetDensity = (int) (((dB / ((double) (i25 / iRound))) * ((double) i25)) + 0.5d);
                int iRound2 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                options.inDensity = iRound2;
                int i26 = options.inTargetDensity;
                if (i26 <= 0 || iRound2 <= 0 || i26 == iRound2) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                str = "Downsampler";
            }
            zC = this.f20943e.c(i20, i10, z15, z10);
            if (zC) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                z11 = false;
                options.inMutable = false;
            } else {
                z11 = false;
            }
            if (!zC) {
                z12 = true;
            } else if (bVar != com.bumptech.glide.load.b.f20514a) {
                try {
                    zHasAlpha = imageReader.getImageType().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable(str, 3)) {
                        Objects.toString(bVar);
                    }
                    zHasAlpha = z11;
                }
                if (zHasAlpha) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    z12 = true;
                    options.inDither = true;
                } else {
                    z12 = true;
                }
            } else {
                z12 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i18 >= 0 || i19 < 0 || !z8) {
                i13 = options.inTargetDensity;
                if (i13 > 0 || (i14 = options.inDensity) <= 0 || i13 == i14) {
                    z13 = z11;
                } else {
                    z13 = z12;
                }
                if (z13) {
                    f11 = i13 / options.inDensity;
                } else {
                    f11 = f10;
                }
                float f16 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i18 / f16);
                int iCeil2 = (int) Math.ceil(i19 / f16);
                int iRound3 = Math.round(iCeil * f11);
                i10 = Math.round(iCeil2 * f11);
                i20 = iRound3;
            }
            r10 = 0;
            if (i20 > 0 && i10 > 0) {
                if (i12 >= 26) {
                    config3 = null;
                } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                    config3 = options.outConfig;
                }
                if (config3 == null) {
                    config3 = options.inPreferredConfig;
                }
                options.inBitmap = r11.getDirty(i20, i10, config3);
            }
            if (iVar != null) {
                if (i12 >= 28) {
                    if (iVar == com.bumptech.glide.load.i.f20808a || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                        z14 = z11;
                    } else {
                        z14 = z12;
                    }
                    if (z14) {
                        named = ColorSpace.Named.DISPLAY_P3;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                } else if (i12 >= 26) {
                    ColorSpace.Named unused2 = ColorSpace.Named.SRGB;
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            C10 = c(imageReader, options, downsampler$DecodeCallbacks, r11);
            downsampler$DecodeCallbacks.onDecodeComplete(r11, C10);
            if (Log.isLoggable(str, 2)) {
                d(C10);
                d(options.inBitmap);
                Thread.currentThread().getName();
                SystemClock.elapsedRealtimeNanos();
            }
            if (C10 != 0) {
                C10.setDensity(this.f20940b.densityDpi);
                switch (imageOrientation) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (imageOrientation) {
                            case 2:
                                matrix.setScale(-1.0f, f10);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, f10);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, f10);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, f10);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, C10.getWidth(), C10.getHeight());
                        matrix.mapRect(rectF);
                        int iRound4 = Math.round(rectF.width());
                        int iRound5 = Math.round(rectF.height());
                        if (C10.getConfig() != null) {
                            config2 = C10.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap bitmap = r11.get(iRound4, iRound5, config2);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmap.setHasAlpha(C10.hasAlpha());
                        B.a(C10, bitmap, matrix);
                        r10 = bitmap;
                        break;
                    default:
                        r10 = C10;
                        break;
                }
                if (!C10.equals(r10)) {
                    r11.put(C10);
                }
            }
            return r10;
        }
        f10 = 1.0f;
        i11 = 3;
        if (Log.isLoggable(str, i11)) {
            Objects.toString(imageType);
        }
        zC = this.f20943e.c(i20, i10, z15, z10);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z11 = false;
            options.inMutable = false;
        } else {
            z11 = false;
        }
        if (!zC) {
            z12 = true;
        } else if (bVar != com.bumptech.glide.load.b.f20514a) {
            zHasAlpha = imageReader.getImageType().hasAlpha();
            if (zHasAlpha) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                z12 = true;
                options.inDither = true;
            } else {
                z12 = true;
            }
        } else {
            z12 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        i12 = Build.VERSION.SDK_INT;
        if (i18 >= 0) {
            i13 = options.inTargetDensity;
            if (i13 > 0) {
                z13 = z11;
            } else {
                z13 = z11;
            }
            if (z13) {
                f11 = i13 / options.inDensity;
            } else {
                f11 = f10;
            }
            float f17 = options.inSampleSize;
            int iCeil3 = (int) Math.ceil(i18 / f17);
            int iCeil4 = (int) Math.ceil(i19 / f17);
            int iRound6 = Math.round(iCeil3 * f11);
            i10 = Math.round(iCeil4 * f11);
            i20 = iRound6;
        } else {
            i13 = options.inTargetDensity;
            if (i13 > 0) {
                z13 = z11;
            } else {
                z13 = z11;
            }
            if (z13) {
                f11 = i13 / options.inDensity;
            } else {
                f11 = f10;
            }
            float f18 = options.inSampleSize;
            int iCeil5 = (int) Math.ceil(i18 / f18);
            int iCeil6 = (int) Math.ceil(i19 / f18);
            int iRound7 = Math.round(iCeil5 * f11);
            i10 = Math.round(iCeil6 * f11);
            i20 = iRound7;
        }
        r10 = 0;
        if (i20 > 0) {
            if (i12 >= 26) {
                config3 = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config3 = options.outConfig;
            }
            if (config3 == null) {
                config3 = options.inPreferredConfig;
            }
            options.inBitmap = r11.getDirty(i20, i10, config3);
        }
        if (iVar != null) {
            if (i12 >= 28) {
                if (iVar == com.bumptech.glide.load.i.f20808a) {
                    z14 = z11;
                } else {
                    z14 = z11;
                }
                if (z14) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i12 >= 26) {
                ColorSpace.Named unused3 = ColorSpace.Named.SRGB;
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        C10 = c(imageReader, options, downsampler$DecodeCallbacks, r11);
        downsampler$DecodeCallbacks.onDecodeComplete(r11, C10);
        if (Log.isLoggable(str, 2)) {
            d(C10);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (C10 != 0) {
            C10.setDensity(this.f20940b.densityDpi);
            switch (imageOrientation) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    matrix = new Matrix();
                    switch (imageOrientation) {
                        case 2:
                            matrix.setScale(-1.0f, f10);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, f10);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, f10);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, f10);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF2 = new RectF(0.0f, 0.0f, C10.getWidth(), C10.getHeight());
                    matrix.mapRect(rectF2);
                    int iRound8 = Math.round(rectF2.width());
                    int iRound9 = Math.round(rectF2.height());
                    if (C10.getConfig() != null) {
                        config2 = C10.getConfig();
                    } else {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmap2 = r11.get(iRound8, iRound9, config2);
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    bitmap2.setHasAlpha(C10.hasAlpha());
                    B.a(C10, bitmap2, matrix);
                    r10 = bitmap2;
                    break;
                default:
                    r10 = C10;
                    break;
            }
            if (!C10.equals(r10)) {
                r11.put(C10);
            }
        }
        return r10;
    }
}
