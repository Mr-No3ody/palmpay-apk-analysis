package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G implements ResourceDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20898d = new com.bumptech.glide.load.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new j(1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20899e = new com.bumptech.glide.load.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new j(2));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E f20900f = new E(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f20901g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoDecoder$MediaInitializer f20902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapPool f20903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f20904c = f20900f;

    public G(BitmapPool bitmapPool, VideoDecoder$MediaInitializer videoDecoder$MediaInitializer) {
        this.f20903b = bitmapPool;
        this.f20902a = videoDecoder$MediaInitializer;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    public final Bitmap a(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j6, int i7, int i10, int i11, m mVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f20902a.initializeExtractor(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i17 = 0; i17 < trackCount; i17++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i17).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable unused) {
                        if (mediaExtractor != null) {
                        }
                        if (Build.VERSION.SDK_INT >= 27) {
                            try {
                                i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i16 != 90) {
                                    i15 = i14;
                                    i14 = i15;
                                } else {
                                    i15 = i14;
                                    i14 = i15;
                                }
                                float fB = mVar.b(i14, i15, i10, i11);
                                bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j6, i7, Math.round(i14 * fB), Math.round(fB * i15));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j6, i7);
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i13 = Integer.parseInt(strExtractMetadata);
                                    int i18 = Integer.parseInt(strExtractMetadata2);
                                    if (i13 != 7) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                    } else {
                                        Matrix matrix2 = new Matrix();
                                        matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        } else {
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 30) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i13 = Integer.parseInt(strExtractMetadata3);
                                int i19 = Integer.parseInt(strExtractMetadata4);
                                if (i13 != 7) {
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                        }
                        if (bitmapCreateBitmap != null) {
                            return bitmapCreateBitmap;
                        }
                        throw new P0.c("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details", 7, false);
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable unused4) {
                mediaExtractor = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && mVar != m.f20928e) {
            i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i16 != 90 || i16 == 270) {
                i15 = i14;
                i14 = i15;
            }
            float fB2 = mVar.b(i14, i15, i10, i11);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j6, i7, Math.round(i14 * fB2), Math.round(fB2 * i15));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j6, i7);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30 && i12 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i13 = Integer.parseInt(strExtractMetadata5);
                int i110 = Integer.parseInt(strExtractMetadata6);
                if ((i13 != 7 || i13 == 6) && i110 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator it = f20901g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i13 = Integer.parseInt(strExtractMetadata7);
            int i111 = Integer.parseInt(strExtractMetadata8);
            if (i13 != 7) {
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new P0.c("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details", 7, false);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) throws Throwable {
        long jLongValue = ((Long) hVar.a(f20898d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) hVar.a(f20899e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.a(m.f20930g);
        if (mVar == null) {
            mVar = m.f20929f;
        }
        m mVar2 = mVar;
        this.f20904c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f20902a.initializeRetriever(mediaMetadataRetriever, obj);
            try {
                Bitmap bitmapA = a(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i7, i10, mVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return C1331c.a(this.f20903b, bitmapA);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                    throw th2;
                }
                mediaMetadataRetriever.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, com.bumptech.glide.load.h hVar) {
        return true;
    }
}
