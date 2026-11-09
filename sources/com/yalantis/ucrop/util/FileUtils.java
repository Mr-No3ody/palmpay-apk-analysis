package com.yalantis.ucrop.util;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luck.picture.lib.config.PictureMimeType;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    public static final String GIF = ".gif";
    public static final String JPEG = ".jpeg";
    private static final String TAG = "FileUtils";
    public static final String WEBP = ".webp";
    private static final SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    private FileUtils() {
    }

    public static void copyFile(@NonNull String str, @NonNull String str2) throws Throwable {
        Throwable th;
        FileChannel channel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = new FileInputStream(new File(str)).getChannel();
            try {
                channel = new FileOutputStream(new File(str2)).getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    channel2.close();
                    if (channel != null) {
                        channel.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel == null) {
                        throw th;
                    }
                    channel.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                channel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            channel = null;
        }
    }

    public static String getCreateFileName(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbS = u.s(str);
        sbS.append(sf.format(Long.valueOf(jCurrentTimeMillis)));
        return sbS.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th;
        IllegalArgumentException illegalArgumentException;
        Cursor cursorQuery;
        ?? r10 = 0;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (IllegalArgumentException e10) {
                        illegalArgumentException = e10;
                        Locale.getDefault();
                        String message = illegalArgumentException.getMessage();
                        StringBuilder sb2 = new StringBuilder("getDataColumn: _data - [");
                        sb2.append(message);
                        sb2.append("]");
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = context;
                if (r10 != 0) {
                    throw th;
                }
                r10.close();
                throw th;
            }
        } catch (IllegalArgumentException e11) {
            illegalArgumentException = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                throw th;
            }
            r10.close();
            throw th;
        }
        return null;
    }

    public static String getInputPath(Uri uri) {
        return (isContent(uri.toString()) || isHasHttp(uri.toString())) ? uri.toString() : uri.getPath();
    }

    public static String getMimeTypeFromMediaContentUri(Context context, Uri uri) {
        if (uri.getScheme().equals(FirebaseAnalytics.Param.CONTENT)) {
            return context.getContentResolver().getType(uri);
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    @SuppressLint({"NewApi"})
    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e10) {
                        e10.getMessage();
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
        } else {
            if (FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static String getPostfixDefaultEmpty(Context context, boolean z3, Uri uri) {
        if (!z3) {
            return "";
        }
        String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
        if (isGif(mimeTypeFromMediaContentUri)) {
            return ".gif";
        }
        return isWebp(mimeTypeFromMediaContentUri) ? ".webp" : "";
    }

    public static String getPostfixDefaultJPEG(Context context, boolean z3, Uri uri) {
        if (!z3) {
            return ".jpeg";
        }
        String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
        if (isGif(mimeTypeFromMediaContentUri)) {
            return ".gif";
        }
        return isWebp(mimeTypeFromMediaContentUri) ? ".webp" : ".jpeg";
    }

    public static boolean isContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGif(String str) {
        if (str != null) {
            return str.equals("image/gif") || str.equals("image/GIF");
        }
        return false;
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isHasAudio(String str) {
        return str != null && str.startsWith(PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
    }

    public static boolean isHasHttp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http") || str.startsWith(Constants.SCHEME) || str.startsWith("/http") || str.startsWith("/https");
    }

    public static boolean isHasVideo(String str) {
        return str != null && str.startsWith("video");
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isUrlHasVideo(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().endsWith(".mp4");
    }

    public static boolean isWebp(String str) {
        if (str != null) {
            return str.equals(ClipboardModule.MIMETYPE_WEBP) || str.equals("image/WEBP");
        }
        return false;
    }

    public static Uri replaceOutputUri(Context context, boolean z3, Uri uri, Uri uri2) {
        try {
            String postfixDefaultEmpty = getPostfixDefaultEmpty(context, z3, uri);
            if (TextUtils.isEmpty(postfixDefaultEmpty)) {
                return uri2;
            }
            String string = isContent(uri2.toString()) ? uri2.toString() : uri2.getPath();
            String strReplace = string.replace(string.substring(string.lastIndexOf(Consts.DOT)), postfixDefaultEmpty);
            return isContent(strReplace) ? Uri.parse(strReplace) : Uri.fromFile(new File(strReplace));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
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
                            BitmapLoadUtils.close(bufferedInputStream2);
                            BitmapLoadUtils.close(bufferedOutputStream);
                            return true;
                        }
                        outputStream.write(bArr, 0, i7);
                    }
                } catch (Exception e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        BitmapLoadUtils.close(bufferedInputStream);
                        BitmapLoadUtils.close(bufferedOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        BitmapLoadUtils.close(bufferedInputStream);
                        BitmapLoadUtils.close(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    BitmapLoadUtils.close(bufferedInputStream);
                    BitmapLoadUtils.close(bufferedOutputStream);
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

    public static String getCreateFileName() {
        return sf.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static void copyFile(@NonNull Context context, @NonNull Uri uri, @NonNull Uri uri2) throws Throwable {
        Throwable th;
        OutputStream outputStream;
        if (uri.equals(uri2)) {
            return;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                if ((inputStreamOpenInputStream instanceof FileInputStream) && (outputStreamOpenOutputStream instanceof FileOutputStream)) {
                    FileChannel channel = ((FileInputStream) inputStreamOpenInputStream).getChannel();
                    channel.transferTo(0L, channel.size(), ((FileOutputStream) outputStreamOpenOutputStream).getChannel());
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                outputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }
}
