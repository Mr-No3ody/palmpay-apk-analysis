package com.luck.picture.lib.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.luck.picture.lib.basic.PictureContentResolver;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import p242q0.g;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapUtils {
    private static final int ARGB_8888_MEMORY_BYTE = 4;
    private static final int MAX_BITMAP_SIZE = 104857600;

    public static int computeSize(int i7, int i10) {
        if (i7 % 2 == 1) {
            i7++;
        }
        if (i10 % 2 == 1) {
            i10++;
        }
        int iMax = Math.max(i7, i10);
        float fMin = Math.min(i7, i10) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d2 = fMin;
            if (d2 > 0.5625d || d2 <= 0.5d) {
                return (int) Math.ceil(((double) iMax) / (1280.0d / d2));
            }
            int i11 = iMax / 1280;
            if (i11 == 0) {
                return 1;
            }
            return i11;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    public static int[] getMaxImageSize(int i7, int i10) {
        int i11 = -1;
        if (i7 == 0 && i10 == 0) {
            return new int[]{-1, -1};
        }
        int iComputeSize = computeSize(i7, i10);
        long totalMemory = getTotalMemory();
        boolean z3 = false;
        int i12 = iComputeSize;
        int i13 = -1;
        while (!z3) {
            i11 = i7 / i12;
            i13 = i10 / i12;
            if (i11 * i13 * 4 > totalMemory) {
                i12 *= 2;
            } else {
                z3 = true;
            }
        }
        return new int[]{i11, i13};
    }

    public static long getTotalMemory() {
        long j6 = Runtime.getRuntime().totalMemory();
        if (j6 > 104857600) {
            return 104857600L;
        }
        return j6;
    }

    public static int readPictureDegree(Context context, String str) {
        g gVar;
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                if (PictureMimeType.isContent(str)) {
                    inputStreamOpenInputStream = PictureContentResolver.openInputStream(context, Uri.parse(str));
                    gVar = new g(inputStreamOpenInputStream);
                } else {
                    gVar = new g(str);
                }
                int iE = gVar.e(1, "Orientation");
                if (iE == 3) {
                    PictureFileUtils.close(inputStreamOpenInputStream);
                    return 180;
                }
                if (iE == 6) {
                    PictureFileUtils.close(inputStreamOpenInputStream);
                    return 90;
                }
                if (iE != 8) {
                    PictureFileUtils.close(inputStreamOpenInputStream);
                    return 0;
                }
                PictureFileUtils.close(inputStreamOpenInputStream);
                return 270;
            } catch (Exception e10) {
                e10.printStackTrace();
                PictureFileUtils.close(inputStreamOpenInputStream);
                return 0;
            }
        } catch (Throwable th) {
            PictureFileUtils.close(inputStreamOpenInputStream);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    public static void rotateImage(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapRotatingImage;
        FileOutputStream fileOutputStream2;
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapDecodeFile;
        InputStream inputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        InputStream inputStream2 = null;
        inputStream = null;
        try {
            int pictureDegree = readPictureDegree(context, str);
            if (pictureDegree > 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (PictureMimeType.isContent(str)) {
                    inputStreamOpenInputStream = PictureContentResolver.openInputStream(context, Uri.parse(str));
                    try {
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = null;
                        bitmapRotatingImage = null;
                        inputStream = inputStreamOpenInputStream;
                        try {
                            e.printStackTrace();
                            PictureFileUtils.close(inputStream);
                            PictureFileUtils.close(fileOutputStream);
                            if (bitmapRotatingImage != null || bitmapRotatingImage.isRecycled()) {
                                return;
                            }
                            bitmapRotatingImage.recycle();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            PictureFileUtils.close(inputStream);
                            PictureFileUtils.close(fileOutputStream);
                            if (bitmapRotatingImage != null && !bitmapRotatingImage.isRecycled()) {
                                bitmapRotatingImage.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        bitmapRotatingImage = null;
                        inputStream = inputStreamOpenInputStream;
                        PictureFileUtils.close(inputStream);
                        PictureFileUtils.close(fileOutputStream);
                        if (bitmapRotatingImage != null) {
                            bitmapRotatingImage.recycle();
                        }
                        throw th;
                    }
                } else {
                    BitmapFactory.decodeFile(str, options);
                    inputStreamOpenInputStream = null;
                }
                options.inSampleSize = computeSize(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                if (PictureMimeType.isContent(str)) {
                    inputStreamOpenInputStream = PictureContentResolver.openInputStream(context, Uri.parse(str));
                    bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                }
                if (bitmapDecodeFile != null) {
                    try {
                        bitmapRotatingImage = rotatingImage(bitmapDecodeFile, pictureDegree);
                        try {
                            fileOutputStream3 = PictureMimeType.isContent(str) ? (FileOutputStream) PictureContentResolver.openOutputStream(context, Uri.parse(str)) : new FileOutputStream(str);
                            saveBitmapFile(bitmapRotatingImage, fileOutputStream3);
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream = fileOutputStream3;
                            inputStream = inputStreamOpenInputStream;
                            e.printStackTrace();
                            PictureFileUtils.close(inputStream);
                            PictureFileUtils.close(fileOutputStream);
                            if (bitmapRotatingImage != null) {
                                return;
                            } else {
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream3;
                            inputStream = inputStreamOpenInputStream;
                            PictureFileUtils.close(inputStream);
                            PictureFileUtils.close(fileOutputStream);
                            if (bitmapRotatingImage != null) {
                                bitmapRotatingImage.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                        bitmapRotatingImage = bitmapDecodeFile;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                        bitmapRotatingImage = bitmapDecodeFile;
                    }
                } else {
                    fileOutputStream2 = null;
                    bitmapRotatingImage = bitmapDecodeFile;
                }
                inputStream2 = inputStreamOpenInputStream;
            } else {
                fileOutputStream2 = null;
                bitmapRotatingImage = null;
            }
            PictureFileUtils.close(inputStream2);
            PictureFileUtils.close(fileOutputStream2);
            if (bitmapRotatingImage == null || bitmapRotatingImage.isRecycled()) {
                return;
            }
            bitmapRotatingImage.recycle();
        } catch (Exception e13) {
            e = e13;
            fileOutputStream = null;
            bitmapRotatingImage = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            bitmapRotatingImage = null;
        }
    }

    public static Bitmap rotatingImage(Bitmap bitmap, int i7) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i7);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static void saveBitmapFile(Bitmap bitmap, FileOutputStream fileOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                    fileOutputStream.write(byteArrayOutputStream2.toByteArray());
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    PictureFileUtils.close(fileOutputStream);
                    PictureFileUtils.close(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    e.printStackTrace();
                    PictureFileUtils.close(fileOutputStream);
                    PictureFileUtils.close(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    PictureFileUtils.close(fileOutputStream);
                    PictureFileUtils.close(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
