package com.luck.picture.lib.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.luck.picture.lib.app.PictureAppMaster;
import com.luck.picture.lib.basic.PictureContentResolver;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.MediaExtraInfo;
import com.luck.picture.lib.interfaces.OnCallbackListener;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class MediaUtils {
    public static final String QUERY_ARG_SQL_LIMIT = "android:query-arg-sql-limit";

    public static Bundle createQueryArgsBundle(String str, String[] strArr, int i7, int i10, String str2) {
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", str2);
            if (SdkVersionUtils.isR()) {
                bundle.putString(QUERY_ARG_SQL_LIMIT, i7 + " offset " + i10);
            }
        }
        return bundle;
    }

    public static void deleteUri(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str) || !PictureMimeType.isContent(str)) {
                return;
            }
            context.getContentResolver().delete(Uri.parse(str), null, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String generateCameraFolderName(String str) {
        File file = new File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : "Camera";
    }

    public static void getAsyncVideoThumbnail(final Context context, final String str, final OnCallbackListener<MediaExtraInfo> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.3
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaExtraInfo doInBackground() {
                return MediaUtils.getVideoThumbnail(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaExtraInfo mediaExtraInfo) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    public static MediaExtraInfo getAudioSize(Context context, String str) {
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        if (!PictureMimeType.isHasHttp(str)) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    try {
                        if (PictureMimeType.isContent(str)) {
                            mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                        } else {
                            mediaMetadataRetriever.setDataSource(str);
                        }
                        mediaExtraInfo.setDuration(ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
                        mediaMetadataRetriever.release();
                        return mediaExtraInfo;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        mediaMetadataRetriever.release();
                        return mediaExtraInfo;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                throw th;
            }
        }
        return mediaExtraInfo;
    }

    public static int getDCIMLastImageId(Context context, String str) {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            try {
                String[] strArr = {"%" + str + "%"};
                if (SdkVersionUtils.isR()) {
                    Bundle bundleCreateQueryArgsBundle = createQueryArgsBundle("_data like ?", strArr, 1, 0, "_id DESC");
                    ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    cursorQuery = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, bundleCreateQueryArgsBundle, null);
                } else {
                    cursorQuery = context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                }
                cursor = cursorQuery;
                if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
                    int i7 = DateUtils.dateDiffer(cursor.getLong(cursor.getColumnIndex("date_added"))) <= 1 ? cursor.getInt(cursor.getColumnIndex("_id")) : -1;
                    cursor.close();
                    return i7;
                }
                if (cursor != null) {
                    cursor.close();
                    return -1;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (cursor == null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    @Deprecated
    public static MediaExtraInfo getImageSize(String str) throws Throwable {
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        InputStream inputStream = null;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream = PictureMimeType.isContent(str) ? PictureContentResolver.openInputStream(PictureAppMaster.getInstance().getAppContext(), Uri.parse(str)) : new FileInputStream(str);
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    mediaExtraInfo.setWidth(options.outWidth);
                    mediaExtraInfo.setHeight(options.outHeight);
                    PictureFileUtils.close(inputStreamOpenInputStream);
                    return mediaExtraInfo;
                } catch (Exception e10) {
                    inputStream = inputStreamOpenInputStream;
                    e = e10;
                    e.printStackTrace();
                    PictureFileUtils.close(inputStream);
                    return mediaExtraInfo;
                } catch (Throwable th) {
                    inputStream = inputStreamOpenInputStream;
                    th = th;
                    PictureFileUtils.close(inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static String getMimeType(File file) {
        return URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    public static String getMimeTypeFromMediaHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.toLowerCase().endsWith(PictureMimeType.JPG) || str.toLowerCase().endsWith(".jpeg")) {
            return "image/jpeg";
        }
        if (str.toLowerCase().endsWith(PictureMimeType.PNG)) {
            return "image/png";
        }
        if (str.toLowerCase().endsWith(".gif")) {
            return "image/gif";
        }
        if (str.toLowerCase().endsWith(".webp")) {
            return ClipboardModule.MIMETYPE_WEBP;
        }
        if (str.toLowerCase().endsWith(PictureMimeType.BMP)) {
            return "image/bmp";
        }
        if (str.toLowerCase().endsWith(".mp4")) {
            return "video/mp4";
        }
        if (str.toLowerCase().endsWith(PictureMimeType.AVI)) {
            return PictureMimeType.AVI_Q;
        }
        if (str.toLowerCase().endsWith(PictureMimeType.MP3)) {
            return "audio/mpeg";
        }
        if (str.toLowerCase().endsWith(PictureMimeType.AMR)) {
            return "audio/amr";
        }
        if (str.toLowerCase().endsWith(".m4a")) {
            return "audio/mpeg";
        }
        return null;
    }

    public static String getMimeTypeFromMediaUrl(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = getMimeType(new File(str));
        }
        return TextUtils.isEmpty(mimeTypeFromExtension) ? "image/jpeg" : mimeTypeFromExtension;
    }

    public static Long[] getPathMediaBucketId(Context context, String str) {
        Long[] lArr = {0L, 0L};
        Cursor cursorQuery = null;
        try {
            String[] strArr = {"%" + str + "%"};
            cursorQuery = SdkVersionUtils.isR() ? context.getContentResolver().query(MediaStore.Files.getContentUri("external"), null, createQueryArgsBundle("_data like ?", strArr, 1, 0, "_id DESC"), null) : context.getContentResolver().query(MediaStore.Files.getContentUri("external"), null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
            if (cursorQuery != null && cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                lArr[0] = Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                lArr[1] = Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id")));
            }
            if (cursorQuery != null) {
                return lArr;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return lArr;
    }

    public static String getRealPathUri(long j6, String str) {
        Uri contentUri;
        if (PictureMimeType.isHasImage(str)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (PictureMimeType.isHasVideo(str)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = PictureMimeType.isHasAudio(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j6).toString();
    }

    public static void getVideoSize(final Context context, final String str, final OnCallbackListener<MediaExtraInfo> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaExtraInfo doInBackground() {
                return MediaUtils.getVideoSize(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaExtraInfo mediaExtraInfo) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static com.luck.picture.lib.entity.MediaExtraInfo getVideoThumbnail(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.MediaUtils.getVideoThumbnail(android.content.Context, java.lang.String):com.luck.picture.lib.entity.MediaExtraInfo");
    }

    public static boolean isLongImage(int i7, int i10) {
        return i7 > 0 && i10 > 0 && i10 > i7 * 3;
    }

    public static void removeMedia(Context context, int i7) {
        try {
            context.getApplicationContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{Long.toString(i7)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static MediaExtraInfo getVideoSize(Context context, String str) {
        int i7;
        int i10;
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        if (!PictureMimeType.isHasHttp(str)) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    try {
                        if (PictureMimeType.isContent(str)) {
                            mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                        } else {
                            mediaMetadataRetriever.setDataSource(str);
                        }
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                        if (TextUtils.equals("90", strExtractMetadata) || TextUtils.equals("270", strExtractMetadata)) {
                            int i11 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(18));
                            i7 = i11;
                            i10 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(19));
                        } else {
                            i10 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(18));
                            i7 = ValueOf.toInt(mediaMetadataRetriever.extractMetadata(19));
                        }
                        mediaExtraInfo.setWidth(i10);
                        mediaExtraInfo.setHeight(i7);
                        mediaExtraInfo.setOrientation(strExtractMetadata);
                        mediaExtraInfo.setDuration(ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
                        mediaMetadataRetriever.release();
                        return mediaExtraInfo;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                throw th;
            }
        }
        return mediaExtraInfo;
    }

    public static MediaExtraInfo getImageSize(Context context, String str) {
        InputStream fileInputStream;
        MediaExtraInfo mediaExtraInfo = new MediaExtraInfo();
        if (!PictureMimeType.isHasHttp(str)) {
            InputStream inputStream = null;
            try {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    if (PictureMimeType.isContent(str)) {
                        fileInputStream = PictureContentResolver.openInputStream(context, Uri.parse(str));
                    } else {
                        fileInputStream = new FileInputStream(str);
                    }
                    try {
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                        mediaExtraInfo.setWidth(options.outWidth);
                        mediaExtraInfo.setHeight(options.outHeight);
                        PictureFileUtils.close(fileInputStream);
                        return mediaExtraInfo;
                    } catch (Exception e10) {
                        inputStream = fileInputStream;
                        e = e10;
                        e.printStackTrace();
                        PictureFileUtils.close(inputStream);
                        return mediaExtraInfo;
                    } catch (Throwable th) {
                        inputStream = fileInputStream;
                        th = th;
                        PictureFileUtils.close(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return mediaExtraInfo;
    }

    public static void getImageSize(final Context context, final String str, final OnCallbackListener<MediaExtraInfo> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaExtraInfo doInBackground() {
                return MediaUtils.getImageSize(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaExtraInfo mediaExtraInfo) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }
}
