package p196n3;

import E.AbstractC0198c;
import W2.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.i;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ImageTranscoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f39827b = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39828a;

    public e(boolean z3) {
        this.f39828a = z3;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final boolean canResize(p109h3.e encodedImage, i iVar, g gVar) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (iVar == null) {
            iVar = i.f21434c.autoRotate();
        }
        return this.f39828a && AbstractC0198c.l(iVar, gVar, encodedImage, 2048) > 1;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final boolean canTranscode(W2.e imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == c.f10540k || imageFormat == c.f10530a;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final a transcode(p109h3.e encodedImage, OutputStream outputStream, i iVar, g gVar, W2.e eVar, Integer num, ColorSpace colorSpace) throws Throwable {
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        i rotationOptions = iVar == null ? i.f21434c.autoRotate() : iVar;
        int iL = !this.f39828a ? 1 : AbstractC0198c.l(rotationOptions, gVar, encodedImage, 2048);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iL;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Matrix matrix2 = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.e(), null, options);
            if (bitmapDecodeStream == null) {
                a.h("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new a(2);
            }
            p213o2.c cVar = b.f39823a;
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
            encodedImage.k();
            try {
                try {
                    if (b.f39823a.contains(Integer.valueOf(encodedImage.f37277d))) {
                        int iA = b.a(rotationOptions, encodedImage);
                        Matrix matrix3 = new Matrix();
                        if (iA == 2) {
                            matrix3.setScale(-1.0f, 1.0f);
                        } else if (iA == 7) {
                            matrix3.setRotate(-90.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        } else {
                            if (iA != 4) {
                                if (iA == 5) {
                                    matrix3.setRotate(90.0f);
                                    matrix3.postScale(-1.0f, 1.0f);
                                }
                                if (matrix != null) {
                                    try {
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
                                    } catch (OutOfMemoryError e10) {
                                        e = e10;
                                        bitmapCreateBitmap = bitmapDecodeStream;
                                        a.i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                                        a aVar = new a(2);
                                        bitmapCreateBitmap.recycle();
                                        bitmapDecodeStream.recycle();
                                        return aVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        bitmapCreateBitmap = bitmapDecodeStream;
                                        bitmapCreateBitmap.recycle();
                                        bitmapDecodeStream.recycle();
                                        throw th;
                                    }
                                } else {
                                    bitmapCreateBitmap = bitmapDecodeStream;
                                }
                                bitmapCreateBitmap.compress(f39827b.getOutputFormat(eVar), num2.intValue(), outputStream);
                                a aVar2 = new a(iL > 1 ? 0 : 1);
                                bitmapCreateBitmap.recycle();
                                bitmapDecodeStream.recycle();
                                return aVar2;
                            }
                            matrix3.setRotate(180.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        }
                        matrix = matrix3;
                        if (matrix != null) {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
                        } else {
                            bitmapCreateBitmap = bitmapDecodeStream;
                        }
                        bitmapCreateBitmap.compress(f39827b.getOutputFormat(eVar), num2.intValue(), outputStream);
                        a aVar3 = new a(iL > 1 ? 0 : 1);
                        bitmapCreateBitmap.recycle();
                        bitmapDecodeStream.recycle();
                        return aVar3;
                    }
                    int iB = b.b(rotationOptions, encodedImage);
                    if (iB != 0) {
                        matrix2 = new Matrix();
                        matrix2.setRotate(iB);
                    }
                    bitmapCreateBitmap.compress(f39827b.getOutputFormat(eVar), num2.intValue(), outputStream);
                    a aVar4 = new a(iL > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return aVar4;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    a.i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    a aVar5 = new a(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return aVar5;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
            matrix = matrix2;
            if (matrix != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
        } catch (OutOfMemoryError e12) {
            a.i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e12);
            return new a(2);
        }
    }
}
