package com.facebook.imagepipeline.nativecode;

import N8.q0;
import P0.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.DoNotOptimize;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p137j3.d;
import p137j3.e;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public abstract class DalvikPurgeableDecoder implements PlatformDecoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f21444b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21445a;

    @DoNotOptimize
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        List list = a.f21452a;
        D3.a.r("imagepipeline");
        f21444b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (e.f38230c == null) {
            synchronized (e.class) {
                try {
                    if (e.f38230c == null) {
                        e.f38230c = new d(e.f38229b, e.f38228a);
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d dVar = e.f38230c;
        Intrinsics.e(dVar);
        this.f21445a = dVar;
    }

    public static boolean c(CloseableReference closeableReference, int i7) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.f();
        return i7 >= 2 && pooledByteBuffer.read(i7 + (-2)) == -1 && pooledByteBuffer.read(i7 - 1) == -39;
    }

    @DoNotStrip
    private static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap a(CloseableReference closeableReference, BitmapFactory.Options options);

    public abstract Bitmap b(CloseableReference closeableReference, int i7, BitmapFactory.Options options);

    public final com.facebook.common.references.b d(Bitmap bitmap) throws Throwable {
        int i7;
        long j6;
        int i10;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            d dVar = this.f21445a;
            synchronized (dVar) {
                int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
                int i11 = dVar.f38223a;
                if (i11 < dVar.f38225c) {
                    long j10 = dVar.f38224b + ((long) sizeInBytes);
                    if (j10 <= dVar.f38226d) {
                        dVar.f38223a = i11 + 1;
                        dVar.f38224b = j10;
                        return CloseableReference.j(bitmap, this.f21445a.f38227e, CloseableReference.f21217f);
                    }
                }
                int sizeInBytes2 = BitmapUtil.getSizeInBytes(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                d dVar2 = this.f21445a;
                synchronized (dVar2) {
                    i7 = dVar2.f38223a;
                }
                d dVar3 = this.f21445a;
                synchronized (dVar3) {
                    j6 = dVar3.f38224b;
                }
                d dVar4 = this.f21445a;
                synchronized (dVar4) {
                    i10 = dVar4.f38225c;
                }
                int iB = this.f21445a.b();
                StringBuilder sbP = q0.p(sizeInBytes2, "Attempted to pin a bitmap of size ", i7, " bytes. The current pool count is ", ", the current pool size is ");
                sbP.append(j6);
                sbP.append(" bytes. The current pool max count is ");
                sbP.append(i10);
                sbP.append(", the current pool max size is ");
                sbP.append(iB);
                sbP.append(" bytes.");
                throw new c(sbP.toString(), 8, false);
            }
        } catch (Exception e10) {
            bitmap.recycle();
            p213o2.e.j(e10);
            throw null;
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeFromEncodedImage(p109h3.e eVar, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeFromEncodedImageWithColorSpace(p109h3.e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        int i7 = eVar.f37280g;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i7;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            if (colorSpace == null) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        CloseableReference closeableReferenceC = CloseableReference.c(eVar.f37274a);
        closeableReferenceC.getClass();
        try {
            return d(a(closeableReferenceC, options));
        } finally {
            closeableReferenceC.close();
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeJPEGFromEncodedImage(p109h3.e eVar, Bitmap.Config config, Rect rect, int i7) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i7, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeJPEGFromEncodedImageWithColorSpace(p109h3.e eVar, Bitmap.Config config, Rect rect, int i7, ColorSpace colorSpace) {
        int i10 = eVar.f37280g;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            if (colorSpace == null) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        CloseableReference closeableReferenceC = CloseableReference.c(eVar.f37274a);
        closeableReferenceC.getClass();
        try {
            return d(b(closeableReferenceC, i7, options));
        } finally {
            closeableReferenceC.close();
        }
    }
}
