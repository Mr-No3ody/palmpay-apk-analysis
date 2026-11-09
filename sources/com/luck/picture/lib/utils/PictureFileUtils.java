package com.luck.picture.lib.utils;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import androidx.core.content.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luck.picture.lib.config.FileSizeUnit;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class PictureFileUtils {
    private static final int BYTE_SIZE = 1024;
    private static final String POSTFIX_AMR = ".amr";
    private static final String POSTFIX_JPG = ".jpg";
    private static final String POSTFIX_MP4 = ".mp4";
    static final String TAG = "PictureFileUtils";

    private PictureFileUtils() {
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copyFile(@NonNull String str, @NonNull String str2) throws Throwable {
        Throwable th;
        FileChannel channel;
        Exception exc;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = new FileInputStream(str).getChannel();
            try {
                channel = new FileOutputStream(str2).getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    close(channel2);
                    close(channel);
                } catch (Exception e10) {
                    exc = e10;
                    fileChannel = channel2;
                    try {
                        exc.printStackTrace();
                        close(fileChannel);
                        close(channel);
                    } catch (Throwable th2) {
                        th = th2;
                        close(fileChannel);
                        close(channel);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = channel2;
                    close(fileChannel);
                    close(channel);
                    throw th;
                }
            } catch (Exception e11) {
                exc = e11;
                channel = null;
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } catch (Exception e12) {
            exc = e12;
            channel = null;
        } catch (Throwable th5) {
            th = th5;
            channel = null;
        }
    }

    public static File createCameraFile(Context context, int i7, String str, String str2, String str3) {
        return createMediaFile(context, i7, str, str2, str3);
    }

    public static String createFilePath(Context context, String str, String str2) {
        File rootDirFile;
        String str3;
        String lastSourceSuffix = PictureMimeType.getLastSourceSuffix(str);
        if (PictureMimeType.isHasVideo(str)) {
            rootDirFile = getRootDirFile(context, 2);
            str3 = "VID_";
        } else if (PictureMimeType.isHasAudio(str)) {
            rootDirFile = getRootDirFile(context, 3);
            str3 = "AUD_";
        } else {
            rootDirFile = getRootDirFile(context, 1);
            str3 = "IMG_";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rootDirFile.getPath());
        sb2.append(File.separator);
        if (TextUtils.isEmpty(str2)) {
            str2 = DateUtils.getCreateFileName(str3) + lastSourceSuffix;
        }
        sb2.append(str2);
        return sb2.toString();
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
        if (i7 == 3) {
            if (zIsEmpty) {
                str = DateUtils.getCreateFileName("AUD_") + ".amr";
            }
            return new File(file, str);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ".jpg";
        }
        if (zIsEmpty) {
            str = DateUtils.getCreateFileName("IMG_") + str2;
        }
        return new File(file, str);
    }

    @Deprecated
    public static void deleteAllCacheDirFile(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File[] fileArrListFiles3;
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir != null && (fileArrListFiles3 = externalFilesDir.listFiles()) != null) {
            for (File file : fileArrListFiles3) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }
        File externalFilesDir2 = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir2 != null && (fileArrListFiles2 = externalFilesDir2.listFiles()) != null) {
            for (File file2 : fileArrListFiles2) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
        File externalFilesDir3 = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        if (externalFilesDir3 == null || (fileArrListFiles = externalFilesDir3.listFiles()) == null) {
            return;
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isFile()) {
                file3.delete();
            }
        }
    }

    @Deprecated
    public static void deleteCacheDirFile(Context context, int i7) {
        File[] fileArrListFiles;
        File externalFilesDir = context.getExternalFilesDir(i7 == SelectMimeType.ofImage() ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES);
        if (externalFilesDir == null || (fileArrListFiles = externalFilesDir.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                file.delete();
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static String formatAccurateUnitFileSize(long j6) {
        double d2;
        String str;
        if (j6 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j6 < 1000) {
            d2 = j6;
            str = "";
        } else if (j6 < 1000000) {
            d2 = j6 / 1000.0d;
            str = "KB";
        } else if (j6 < 1000000000) {
            d2 = j6 / 1000000.0d;
            str = "MB";
        } else {
            d2 = j6 / 1.0E9d;
            str = "GB";
        }
        Object objValueOf = String.format(new Locale("zh"), "%.2f", Double.valueOf(d2));
        StringBuilder sb2 = new StringBuilder();
        if (Math.round(ValueOf.toDouble(objValueOf)) - ValueOf.toDouble(objValueOf) == 0.0d) {
            objValueOf = Long.valueOf(Math.round(ValueOf.toDouble(objValueOf)));
        }
        sb2.append(objValueOf);
        sb2.append(str);
        return sb2.toString();
    }

    @SuppressLint({"DefaultLocale"})
    public static String formatFileSize(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j6 < FileSizeUnit.KB) {
            Object objValueOf = String.format("%.2f", Double.valueOf(j6));
            double d2 = ValueOf.toDouble(objValueOf);
            long jRound = Math.round(d2);
            StringBuilder sb2 = new StringBuilder();
            if (jRound - d2 == 0.0d) {
                objValueOf = Long.valueOf(jRound);
            }
            sb2.append(objValueOf);
            sb2.append("B");
            return sb2.toString();
        }
        if (j6 < FileSizeUnit.MB) {
            Object objValueOf2 = String.format("%.2f", Double.valueOf(j6 / 1024.0d));
            double d10 = ValueOf.toDouble(objValueOf2);
            long jRound2 = Math.round(d10);
            StringBuilder sb3 = new StringBuilder();
            if (jRound2 - d10 == 0.0d) {
                objValueOf2 = Long.valueOf(jRound2);
            }
            sb3.append(objValueOf2);
            sb3.append("KB");
            return sb3.toString();
        }
        if (j6 < FileSizeUnit.GB) {
            Object objValueOf3 = String.format("%.2f", Double.valueOf(j6 / 1048576.0d));
            double d11 = ValueOf.toDouble(objValueOf3);
            long jRound3 = Math.round(d11);
            StringBuilder sb4 = new StringBuilder();
            if (jRound3 - d11 == 0.0d) {
                objValueOf3 = Long.valueOf(jRound3);
            }
            sb4.append(objValueOf3);
            sb4.append("MB");
            return sb4.toString();
        }
        Object objValueOf4 = String.format("%.2f", Double.valueOf(j6 / 1.073741824E9d));
        double d12 = ValueOf.toDouble(objValueOf4);
        long jRound4 = Math.round(d12);
        StringBuilder sb5 = new StringBuilder();
        if (jRound4 - d12 == 0.0d) {
            objValueOf4 = Long.valueOf(jRound4);
        }
        sb5.append(objValueOf4);
        sb5.append("GB");
        return sb5.toString();
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    cursorQuery.close();
                    return string;
                }
                if (cursorQuery == null) {
                    return "";
                }
                cursorQuery.close();
                return "";
            } catch (IllegalArgumentException e10) {
                Locale.getDefault();
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder("getDataColumn: _data - [");
                sb2.append(message);
                sb2.append("]");
                if (cursorQuery == null) {
                    return "";
                }
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @SuppressLint({"NewApi"})
    public static String getPath(Context context, Uri uri) {
        Context applicationContext = context.getApplicationContext();
        Uri uri2 = null;
        if (!DocumentsContract.isDocumentUri(applicationContext, uri)) {
            if (FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(applicationContext, uri, null, null);
            }
            return "file".equalsIgnoreCase(uri.getScheme()) ? uri.getPath() : "";
        }
        if (!isExternalStorageDocument(uri)) {
            if (isDownloadsDocument(uri)) {
                return getDataColumn(applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), ValueOf.toLong(DocumentsContract.getDocumentId(uri))), null, null);
            }
            if (!isMediaDocument(uri)) {
                return "";
            }
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            if ("image".equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(applicationContext, uri2, "_id=?", new String[]{strArrSplit[1]});
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
        if (!"primary".equalsIgnoreCase(strArrSplit2[0])) {
            return "";
        }
        if (SdkVersionUtils.isQ()) {
            return applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + strArrSplit2[1];
        }
        return Environment.getExternalStorageDirectory() + "/" + strArrSplit2[1];
    }

    private static File getRootDirFile(Context context, int i7) {
        return new File(FileDirMap.getFileDirPath(context, i7));
    }

    public static String getVideoThumbnailDir(Context context) {
        File file = new File(context.getExternalFilesDir("").getAbsolutePath(), "VideoThumbnail");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isFileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isImageFileExists(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 2;
        BitmapFactory.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
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
