package com.luck.lib.camerax.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import androidx.core.content.f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtils {
    public static final String POSTFIX = ".jpeg";
    public static final String POST_VIDEO = ".mp4";

    public static void close(@Nullable Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean copyPath(Context context, String str, String str2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = BitmapUtils.computeSize(options.outWidth, options.outHeight);
            options.inJustDecodeBounds = false;
            Bitmap horizontalMirror = BitmapUtils.toHorizontalMirror(BitmapFactory.decodeFile(str, options));
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    horizontalMirror.compress(horizontalMirror.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                    horizontalMirror.recycle();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                    try {
                        fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                        fileOutputStream2.flush();
                        deleteFile(context, str);
                        close(fileOutputStream2);
                        close(byteArrayOutputStream);
                        return true;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        close(fileOutputStream);
                        close(byteArrayOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        close(fileOutputStream);
                        close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public static File createCameraFile(Context context, int i7, String str, String str2, String str3) {
        return createMediaFile(context, i7, str, str2, str3);
    }

    private static File createMediaFile(Context context, int i7, String str, String str2, String str3) {
        return createOutFile(context, i7, str, str2, str3);
    }

    private static File createOutFile(Context context, int i7, String str, String str2, String str3) {
        File file;
        File rootDirFile;
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.equals("mounted", Environment.getExternalStorageState())) {
                rootDirFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(rootDirFile.getAbsolutePath());
                String str4 = File.separator;
                file = new File(F.d(sb2, str4, "Camera", str4));
            } else {
                rootDirFile = getRootDirFile(applicationContext, i7);
                file = new File(rootDirFile.getAbsolutePath() + File.separator);
            }
            if (!rootDirFile.exists()) {
                rootDirFile.mkdirs();
            }
        } else {
            File file2 = new File(str3);
            File parentFile = file2.getParentFile();
            Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file2.getParentFile().mkdirs();
            }
            file = file2;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (i7 == 2) {
            if (zIsEmpty) {
                str = DateUtils.getCreateFileName("VID_") + ".mp4";
            }
            return new File(file, str);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ".jpeg";
        }
        if (zIsEmpty) {
            str = DateUtils.getCreateFileName("IMG_") + str2;
        }
        return new File(file, str);
    }

    public static File createTempFile(Context context, boolean z3) {
        File file = new File(context.getExternalFilesDir("").getAbsolutePath(), ".TemporaryCamera");
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        sb2.append(z3 ? ".mp4" : ".jpeg");
        return new File(file.getAbsolutePath(), sb2.toString());
    }

    public static void deleteFile(Context context, String str) {
        try {
            if (isContent(str)) {
                context.getContentResolver().delete(Uri.parse(str), null, null);
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static File getRootDirFile(Context context, int i7) {
        return i7 == 2 ? context.getExternalFilesDir(Environment.DIRECTORY_MOVIES) : context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    public static boolean isContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static Uri parUri(Context context, File file) {
        return f.getUriForFile(context, context.getPackageName() + ".luckProvider", file);
    }

    public static boolean writeFileFromIS(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = bufferedInputStream2.read(bArr);
                        if (i7 == -1) {
                            outputStream.flush();
                            close(bufferedInputStream2);
                            close(bufferedOutputStream);
                            return true;
                        }
                        outputStream.write(bArr, 0, i7);
                    }
                } catch (Exception e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        close(bufferedInputStream);
                        close(bufferedOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        close(bufferedInputStream);
                        close(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    close(bufferedInputStream);
                    close(bufferedOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
