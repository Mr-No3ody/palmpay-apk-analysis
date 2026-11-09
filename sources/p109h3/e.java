package p109h3;

import W2.c;
import W2.g;
import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.b;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.ImageMetaData;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CloseableReference f37274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W2.e f37275b = W2.e.f10545c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37276c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37277d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37278e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37279f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37280g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37281i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f37282j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorSpace f37283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37284p;

    public e(CloseableReference closeableReference) {
        if (!CloseableReference.h(closeableReference)) {
            throw new IllegalArgumentException();
        }
        this.f37274a = closeableReference.clone();
    }

    public static e a(e eVar) {
        e eVar2 = null;
        if (eVar == null) {
            return null;
        }
        CloseableReference closeableReferenceC = CloseableReference.c(eVar.f37274a);
        if (closeableReferenceC != null) {
            try {
                eVar2 = new e(closeableReferenceC);
            } catch (Throwable th) {
                closeableReferenceC.close();
                throw th;
            }
        }
        CloseableReference.d(closeableReferenceC);
        if (eVar2 != null) {
            eVar2.c(eVar);
        }
        return eVar2;
    }

    public static void b(e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    public static boolean h(e eVar) {
        return eVar.f37276c >= 0 && eVar.f37278e >= 0 && eVar.f37279f >= 0;
    }

    public static boolean j(e eVar) {
        return eVar != null && eVar.i();
    }

    public final void c(e eVar) {
        eVar.k();
        this.f37275b = eVar.f37275b;
        eVar.k();
        this.f37278e = eVar.f37278e;
        eVar.k();
        this.f37279f = eVar.f37279f;
        eVar.k();
        this.f37276c = eVar.f37276c;
        eVar.k();
        this.f37277d = eVar.f37277d;
        this.f37280g = eVar.f37280g;
        this.f37281i = eVar.f();
        this.f37282j = eVar.f37282j;
        eVar.k();
        this.f37283o = eVar.f37283o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CloseableReference.d(this.f37274a);
    }

    public final String d() {
        CloseableReference closeableReferenceC = CloseableReference.c(this.f37274a);
        if (closeableReferenceC == null) {
            return "";
        }
        int iMin = Math.min(f(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((PooledByteBuffer) closeableReferenceC.f()).read(0, bArr, 0, iMin);
            closeableReferenceC.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i7 = 0; i7 < iMin; i7++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i7])));
            }
            return sb2.toString();
        } catch (Throwable th) {
            closeableReferenceC.close();
            throw th;
        }
    }

    public final InputStream e() {
        CloseableReference closeableReferenceC = CloseableReference.c(this.f37274a);
        if (closeableReferenceC == null) {
            return null;
        }
        try {
            return new p262r2.e((PooledByteBuffer) closeableReferenceC.f());
        } finally {
            closeableReferenceC.close();
        }
    }

    public final int f() {
        CloseableReference closeableReference = this.f37274a;
        if (closeableReference == null) {
            return this.f37281i;
        }
        closeableReference.f();
        return ((PooledByteBuffer) closeableReference.f()).size();
    }

    public final void g() {
        Pair<Integer, Integer> dimensions;
        W2.e imageFormat = g.f10548d.getImageFormat_WrapIOException(e());
        this.f37275b = imageFormat;
        W2.e eVar = c.f10530a;
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        Pair<Integer, Integer> size = null;
        InputStream inputStreamE = null;
        if ((imageFormat == c.f10535f || imageFormat == c.f10536g || imageFormat == c.f10537h || imageFormat == c.f10538i) || imageFormat == c.f10539j) {
            InputStream inputStreamE2 = e();
            if (inputStreamE2 != null && (size = WebpUtil.getSize(inputStreamE2)) != null) {
                this.f37278e = ((Integer) size.f38891a).intValue();
                this.f37279f = ((Integer) size.f38892b).intValue();
            }
            dimensions = size;
        } else {
            try {
                inputStreamE = e();
                ImageMetaData imageMetaDataDecodeDimensionsAndColorSpace = BitmapUtil.decodeDimensionsAndColorSpace(inputStreamE);
                this.f37283o = imageMetaDataDecodeDimensionsAndColorSpace.getColorSpace();
                Pair<Integer, Integer> dimensions2 = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
                if (dimensions2 != null) {
                    this.f37278e = ((Integer) dimensions2.f38891a).intValue();
                    this.f37279f = ((Integer) dimensions2.f38892b).intValue();
                }
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (IOException unused) {
                    }
                }
                dimensions = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
            } catch (Throwable th) {
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
        if (imageFormat == c.f10530a && this.f37276c == -1) {
            if (dimensions != null) {
                int orientation = JfifUtil.getOrientation(e());
                this.f37277d = orientation;
                this.f37276c = JfifUtil.getAutoRotateAngleFromOrientation(orientation);
                return;
            }
            return;
        }
        if (imageFormat == c.f10540k && this.f37276c == -1) {
            int orientation2 = HeifExifUtil.getOrientation(e());
            this.f37277d = orientation2;
            this.f37276c = JfifUtil.getAutoRotateAngleFromOrientation(orientation2);
        } else if (this.f37276c == -1) {
            this.f37276c = 0;
        }
    }

    public final synchronized boolean i() {
        return CloseableReference.h(this.f37274a);
    }

    public final void k() {
        if (this.f37278e < 0 || this.f37279f < 0) {
            g();
        }
    }
}
