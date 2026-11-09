package com.facebook.imageutils;

import C0.G;
import Hg.c;
import N8.q0;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058e0.b;
import p171lb.d;
import p262r2.a;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\n\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001dH\u0007¢\u0006\u0004\b#\u0010!J-\u0010(\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u00102\u001a\u0002018\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/facebook/imageutils/BitmapUtil;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "getSizeInBytes", "(Landroid/graphics/Bitmap;)I", "", "bytes", "Landroid/util/Pair;", "decodeDimensions", "([B)Landroid/util/Pair;", "Landroid/net/Uri;", "uri", "(Landroid/net/Uri;)Landroid/util/Pair;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Landroid/util/Pair;", "Lcom/facebook/imageutils/ImageMetaData;", "decodeDimensionsAndColorSpace", "(Ljava/io/InputStream;)Lcom/facebook/imageutils/ImageMetaData;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "getPixelSizeForBitmapConfig", "(Landroid/graphics/Bitmap$Config;)I", "width", "height", "getSizeInByteForBitmap", "(IILandroid/graphics/Bitmap$Config;)I", "", "useDecodeBufferHelper", "", "setUseDecodeBufferHelper", "(Z)V", "fixDecodeDrmImageCrash", "setFixDecodeDrmImageCrash", "Landroid/graphics/Rect;", "outPadding", "Landroid/graphics/BitmapFactory$Options;", "options", "decodeStreamInternal", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "ALPHA_8_BYTES_PER_PIXEL", "I", "ARGB_4444_BYTES_PER_PIXEL", "ARGB_8888_BYTES_PER_PIXEL", "RGB_565_BYTES_PER_PIXEL", "RGBA_F16_BYTES_PER_PIXEL", "RGBA_1010102_BYTES_PER_PIXEL", "", "MAX_BITMAP_DIMENSION", "F", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtil.kt\ncom/facebook/imageutils/BitmapUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class BitmapUtil {
    public static final int ALPHA_8_BYTES_PER_PIXEL = 1;
    public static final int ARGB_4444_BYTES_PER_PIXEL = 2;
    public static final int ARGB_8888_BYTES_PER_PIXEL = 4;
    public static final float MAX_BITMAP_DIMENSION = 2048.0f;
    public static final int RGBA_1010102_BYTES_PER_PIXEL = 4;
    public static final int RGBA_F16_BYTES_PER_PIXEL = 8;
    public static final int RGB_565_BYTES_PER_PIXEL = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f21684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f21685c;

    @NotNull
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f21683a = C2131j.b(new d(27));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ByteBuffer a() {
        ByteBuffer byteBuffer;
        if (f21684b) {
            c cVar = a.f41548a;
            byteBuffer = (ByteBuffer) a.f41548a.get();
        } else {
            byteBuffer = (ByteBuffer) ((b) f21683a.getValue()).acquire();
        }
        if (byteBuffer != null) {
            return byteBuffer;
        }
        c cVar2 = a.f41548a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> decodeDimensions(@Nullable byte[] bytes) {
        return decodeDimensions(new ByteArrayInputStream(bytes));
    }

    @JvmStatic
    @NotNull
    public static final ImageMetaData decodeDimensionsAndColorSpace(@Nullable InputStream inputStream) {
        t tVar = f21683a;
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BitmapUtil bitmapUtil = INSTANCE;
        bitmapUtil.getClass();
        ByteBuffer byteBufferA = a();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferA.array();
            bitmapUtil.decodeStreamInternal(inputStream, null, options);
            return new ImageMetaData(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
        } finally {
            INSTANCE.getClass();
            if (!f21684b) {
                ((b) tVar.getValue()).release(byteBufferA);
            }
        }
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final int getPixelSizeForBitmapConfig(@Nullable Bitmap.Config bitmapConfig) {
        switch (bitmapConfig == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bitmapConfig.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    @JvmStatic
    public static final int getSizeInByteForBitmap(int width, int height, @Nullable Bitmap.Config bitmapConfig) {
        if (width <= 0) {
            throw new IllegalArgumentException(G.m(width, "width must be > 0, width is: ").toString());
        }
        if (height <= 0) {
            throw new IllegalArgumentException(G.m(height, "height must be > 0, height is: ").toString());
        }
        int pixelSizeForBitmapConfig = getPixelSizeForBitmapConfig(bitmapConfig);
        int i7 = width * height * pixelSizeForBitmapConfig;
        if (i7 > 0) {
            return i7;
        }
        StringBuilder sbP = q0.p(i7, "size must be > 0: size: ", width, ", width: ", ", height: ");
        sbP.append(height);
        sbP.append(", pixelSize: ");
        sbP.append(pixelSizeForBitmapConfig);
        throw new IllegalStateException(sbP.toString().toString());
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final int getSizeInBytes(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    @JvmStatic
    public static final void setFixDecodeDrmImageCrash(boolean fixDecodeDrmImageCrash) {
        f21685c = fixDecodeDrmImageCrash;
    }

    @JvmStatic
    public static final void setUseDecodeBufferHelper(boolean useDecodeBufferHelper) {
        f21684b = useDecodeBufferHelper;
    }

    @Nullable
    public final Bitmap decodeStreamInternal(@Nullable InputStream inputStream, @Nullable Rect outPadding, @Nullable BitmapFactory.Options options) {
        if (!f21685c) {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> decodeDimensions(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> decodeDimensions(@Nullable InputStream inputStream) {
        t tVar = f21683a;
        if (inputStream != null) {
            BitmapUtil bitmapUtil = INSTANCE;
            bitmapUtil.getClass();
            ByteBuffer byteBufferA = a();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = byteBufferA.array();
                Pair<Integer, Integer> pair = null;
                bitmapUtil.decodeStreamInternal(inputStream, null, options);
                if (options.outWidth != -1 && options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
                return pair;
            } finally {
                INSTANCE.getClass();
                if (!f21684b) {
                    ((b) tVar.getValue()).release(byteBufferA);
                }
            }
        }
        throw new IllegalStateException("Required value was null.");
    }
}
