package p151k3;

import Hg.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools$Pool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import com.facebook.imageutils.BitmapUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import p045d3.g;
import p109h3.e;
import p137j3.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PlatformDecoder {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f38657e = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f38658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PreverificationHelper f38659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pools$Pool f38660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38661d;

    public a(BitmapPool bitmapPool, Pools$Pool pools$Pool, g gVar, int i7) {
        this.f38661d = i7;
        this.f38659b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f38658a = bitmapPool;
        if (bitmapPool instanceof n) {
            gVar.getClass();
        }
        this.f38660c = pools$Pool;
    }

    public static BitmapFactory.Options b(e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.f37280g;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z3 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z3) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(eVar.e(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        if (z3) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cb A[Catch: all -> 0x00af, RuntimeException -> 0x00b1, IllegalArgumentException -> 0x00b3, TryCatch #8 {IllegalArgumentException -> 0x00b3, RuntimeException -> 0x00b1, blocks: (B:39:0x0089, B:42:0x0093, B:52:0x00ab, B:71:0x00d2, B:67:0x00cb, B:68:0x00ce, B:65:0x00c5), top: B:105:0x0089, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2 A[Catch: all -> 0x00af, RuntimeException -> 0x00b1, IllegalArgumentException -> 0x00b3, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00b3, RuntimeException -> 0x00b1, blocks: (B:39:0x0089, B:42:0x0093, B:52:0x00ab, B:71:0x00d2, B:67:0x00cb, B:68:0x00ce, B:65:0x00c5), top: B:105:0x0089, outer: #7 }] */
    public final b a(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        int sizeInByteForBitmap;
        Bitmap bitmap;
        Bitmap bitmapDecodeStream;
        Bitmap.Config config;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        com.facebook.common.references.a aVar = CloseableReference.f21217f;
        int iWidth = options.outWidth;
        int iHeight = options.outHeight;
        if (rect != null) {
            iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
        }
        int i7 = Build.VERSION.SDK_INT;
        boolean z3 = i7 >= 26 && (preverificationHelper = this.f38659b) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = null;
        BitmapPool bitmapPool = this.f38658a;
        if (rect == null && z3) {
            options.inMutable = false;
            bitmap = null;
        } else {
            if (rect != null && z3) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            int i10 = this.f38661d;
            Intrinsics.checkNotNullParameter(options, "options");
            switch (i10) {
                case 0:
                    Bitmap.Config config2 = options.inPreferredConfig;
                    if (config2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    sizeInByteForBitmap = BitmapUtil.getSizeInByteForBitmap(iWidth, iHeight, config2);
                    break;
                    break;
                default:
                    Bitmap.Config config3 = options.outConfig;
                    if (config3 == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    }
                    sizeInByteForBitmap = BitmapUtil.getSizeInByteForBitmap(iWidth, iHeight, config3);
                    break;
            }
            bitmap = bitmapPool.get(sizeInByteForBitmap);
            if (bitmap == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        }
        options.inBitmap = bitmap;
        if (i7 >= 26) {
            if (colorSpace == null) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        Pools$Pool pools$Pool = this.f38660c;
        ByteBuffer byteBufferAllocate = (ByteBuffer) pools$Pool.acquire();
        if (byteBufferAllocate == null) {
            c cVar = p262r2.a.f41548a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = byteBufferAllocate.array();
                if (rect == null || bitmap == null || (config = options.inPreferredConfig) == null) {
                    bitmapDecodeStream = null;
                } else {
                    try {
                        bitmap.reconfigure(iWidth, iHeight, config);
                        bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                        if (bitmapRegionDecoderNewInstance != null) {
                            try {
                                try {
                                    bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                } catch (IOException unused2) {
                                    p229p2.a.g(a.class, "Could not decode region %s, decoding full bitmap instead.", rect);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                    bitmapDecodeStream = null;
                                    if (bitmapDecodeStream == null) {
                                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                                    }
                                    pools$Pool.release(byteBufferAllocate);
                                    if (bitmap != null) {
                                    }
                                    return CloseableReference.j(bitmapDecodeStream, bitmapPool, aVar);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bitmapRegionDecoder = bitmapRegionDecoderNewInstance;
                                if (bitmapRegionDecoder != null) {
                                    bitmapRegionDecoder.recycle();
                                }
                                throw th;
                            }
                        } else {
                            bitmapDecodeStream = null;
                        }
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                    } catch (IOException unused3) {
                        bitmapRegionDecoderNewInstance = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bitmapRegionDecoder != null) {
                            bitmapRegionDecoder.recycle();
                        }
                        throw th;
                    }
                }
                if (bitmapDecodeStream == null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                }
                pools$Pool.release(byteBufferAllocate);
                if (bitmap != null || bitmap == bitmapDecodeStream) {
                    return CloseableReference.j(bitmapDecodeStream, bitmapPool, aVar);
                }
                bitmapPool.release(bitmap);
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                throw new IllegalStateException();
            } catch (IllegalArgumentException e10) {
                if (bitmap != null) {
                    bitmapPool.release(bitmap);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e10;
                    }
                    b bVarJ = CloseableReference.j(bitmapDecodeStream2, p121i2.e.a(), aVar);
                    pools$Pool.release(byteBufferAllocate);
                    return bVarJ;
                } catch (IOException unused4) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                if (bitmap != null) {
                    bitmapPool.release(bitmap);
                }
                throw e11;
            }
        } catch (Throwable th3) {
            pools$Pool.release(byteBufferAllocate);
            throw th3;
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeFromEncodedImage(e eVar, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, null);
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsB = b(eVar, config);
        boolean z3 = optionsB.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamE = eVar.e();
            inputStreamE.getClass();
            return a(inputStreamE, optionsB, rect, colorSpace);
        } catch (RuntimeException e10) {
            if (z3) {
                return decodeFromEncodedImageWithColorSpace(eVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e10;
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeJPEGFromEncodedImage(e eVar, Bitmap.Config config, Rect rect, int i7) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i7, null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public final CloseableReference decodeJPEGFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, int i7, ColorSpace colorSpace) {
        boolean z3;
        W2.e eVar2 = eVar.f37275b;
        if (eVar2 == W2.c.f10530a || eVar2 == W2.c.f10541l) {
            CloseableReference closeableReference = eVar.f37274a;
            closeableReference.getClass();
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.f();
            if (i7 >= 2 && pooledByteBuffer.read(i7 - 2) == -1 && pooledByteBuffer.read(i7 - 1) == -39) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = true;
        }
        BitmapFactory.Options optionsB = b(eVar, config);
        InputStream inputStreamE = eVar.e();
        inputStreamE.getClass();
        if (eVar.f() > i7) {
            inputStreamE = new p302u2.a(inputStreamE, i7);
        }
        if (!z3) {
            inputStreamE = new p302u2.b(inputStreamE, f38657e);
        }
        boolean z8 = optionsB.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                b bVarA = a(inputStreamE, optionsB, rect, colorSpace);
                try {
                    inputStreamE.close();
                    return bVarA;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return bVarA;
                }
            } catch (Throwable th) {
                try {
                    inputStreamE.close();
                    throw th;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    throw th;
                }
            }
        } catch (RuntimeException e12) {
            if (!z8) {
                throw e12;
            }
            CloseableReference closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace = decodeJPEGFromEncodedImageWithColorSpace(eVar, Bitmap.Config.ARGB_8888, rect, i7, colorSpace);
            try {
                inputStreamE.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            return closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace;
        }
    }
}
