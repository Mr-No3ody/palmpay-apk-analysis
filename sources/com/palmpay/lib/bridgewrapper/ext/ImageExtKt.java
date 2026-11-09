package com.palmpay.lib.bridgewrapper.ext;

import Kf.o;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.luck.picture.lib.config.PictureMimeType;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a,\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0006*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"ALBUM_DIR", "", "kotlin.jvm.PlatformType", "TAG", "finishPending", "", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "resolver", "Landroid/content/ContentResolver;", "outputFile", "Ljava/io/File;", "getBitmapFormat", "Landroid/graphics/Bitmap$CompressFormat;", "getMimeType", "insertMediaImage", "fileName", "relativePath", "outputFileTaker", "Lcom/palmpay/lib/bridgewrapper/ext/OutputFileTaker;", "outputStream", "Ljava/io/OutputStream;", "queryMediaImage28", "imagePath", "lib_bridgeWrapper_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ImageExtKt {
    private static final String ALBUM_DIR = Environment.DIRECTORY_PICTURES;

    @NotNull
    private static final String TAG = "ImageExt";

    public static final void finishPending(@NotNull Uri uri, @NotNull Context context, @NotNull ContentResolver resolver, @Nullable File file) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ContentValues contentValues = new ContentValues();
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", (Integer) 0);
            resolver.update(uri, contentValues, null, null);
        } else {
            if (file != null) {
                contentValues.put("_size", Long.valueOf(file.length()));
            }
            resolver.update(uri, contentValues, null, null);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
        }
    }

    @NotNull
    public static final Bitmap.CompressFormat getBitmapFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (y.g(lowerCase, PictureMimeType.PNG, false)) {
            return Bitmap.CompressFormat.PNG;
        }
        if (y.g(lowerCase, PictureMimeType.JPG, false) || y.g(lowerCase, ".jpeg", false)) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (y.g(lowerCase, ".webp", false)) {
            return Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSLESS : Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.PNG;
    }

    private static final String getMimeType(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (y.g(lowerCase, PictureMimeType.PNG, false)) {
            return "image/png";
        }
        if (y.g(lowerCase, PictureMimeType.JPG, false) || y.g(lowerCase, ".jpeg", false)) {
            return "image/jpeg";
        }
        if (y.g(lowerCase, ".webp", false)) {
            return ClipboardModule.MIMETYPE_WEBP;
        }
        if (y.g(lowerCase, ".gif", false)) {
            return "image/gif";
        }
        return null;
    }

    @Nullable
    public static final Uri insertMediaImage(@NotNull ContentResolver contentResolver, @NotNull String fileName, @Nullable String str, @Nullable OutputFileTaker outputFileTaker) {
        Uri EXTERNAL_CONTENT_URI;
        String str2;
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ContentValues contentValues = new ContentValues();
        String mimeType = getMimeType(fileName);
        if (mimeType != null) {
            contentValues.put("mime_type", mimeType);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        int i7 = 1;
        if (Build.VERSION.SDK_INT >= 29) {
            if (str != null) {
                str2 = ALBUM_DIR + '/' + str;
            } else {
                str2 = ALBUM_DIR;
            }
            contentValues.put("_display_name", fileName);
            contentValues.put("relative_path", str2);
            contentValues.put("is_pending", (Integer) 1);
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.getContentUri("external_primary");
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)");
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(ALBUM_DIR);
            if (str != null) {
                externalStoragePublicDirectory = new File(externalStoragePublicDirectory, str);
            }
            if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                Log.e(TAG, "save: error: can't create Pictures directory");
                return null;
            }
            File file = new File(externalStoragePublicDirectory, fileName);
            Intrinsics.checkNotNullParameter(file, "<this>");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String strT = StringsKt.T(name, Consts.DOT);
            String strF = o.f(file);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "imageFile.absolutePath");
            Uri uriQueryMediaImage28 = queryMediaImage28(contentResolver, absolutePath);
            while (uriQueryMediaImage28 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strT);
                sb2.append('(');
                int i10 = i7 + 1;
                sb2.append(i7);
                sb2.append(").");
                sb2.append(strF);
                File file2 = new File(externalStoragePublicDirectory, sb2.toString());
                String absolutePath2 = file2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "imageFile.absolutePath");
                uriQueryMediaImage28 = queryMediaImage28(contentResolver, absolutePath2);
                file = file2;
                i7 = i10;
            }
            contentValues.put("_display_name", file.getName());
            contentValues.put("_data", file.getAbsolutePath());
            if (outputFileTaker != null) {
                outputFileTaker.setFile(file);
            }
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        }
        return contentResolver.insert(EXTERNAL_CONTENT_URI, contentValues);
    }

    public static /* synthetic */ Uri insertMediaImage$default(ContentResolver contentResolver, String str, String str2, OutputFileTaker outputFileTaker, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            outputFileTaker = null;
        }
        return insertMediaImage(contentResolver, str, str2, outputFileTaker);
    }

    @Nullable
    public static final OutputStream outputStream(@NotNull Uri uri, @NotNull ContentResolver resolver) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        try {
            return resolver.openOutputStream(uri);
        } catch (FileNotFoundException e10) {
            Log.e(TAG, "save: open stream error: " + e10);
            return null;
        }
    }

    private static final Uri queryMediaImage28(ContentResolver contentResolver, String str) throws IOException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        File file = new File(str);
        if (file.canRead() && file.exists()) {
            return Uri.fromFile(file);
        }
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "_data"}, "_data == ?", new String[]{str}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    Uri uriWithAppendedId = ContentUris.withAppendedId(uri, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")));
                    Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(collection, id)");
                    Objects.toString(uriWithAppendedId);
                    cursorQuery.close();
                    return uriWithAppendedId;
                }
                Unit unit = Unit.f38893a;
                cursorQuery.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.o(cursorQuery, th);
                    throw th2;
                }
            }
        }
        return null;
    }
}
