package p220oa;

import F6.d;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.camera.video.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40248a = Environment.DIRECTORY_DOWNLOADS;

    public static final Uri a(Context context, String str, File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!file.canRead() || !file.exists()) {
            d.h("FileExt", 5, u.k(file, "check: read file error: "));
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Uri uriE = e(fileInputStream, context, file, str);
            fileInputStream.close();
            return uriE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void b(File file, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!file.canRead() || !file.exists()) {
            d.h("FileExt", 5, u.k(file, "check: read file error: "));
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            d(fileInputStream, context, file, uri);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void c(Uri uri, Context context, ContentResolver contentResolver, File file) {
        ContentValues contentValues = new ContentValues();
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uri, contentValues, null, null);
        } else {
            contentValues.put("_size", Long.valueOf(file.length()));
            contentResolver.update(uri, contentValues, null, null);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
        }
    }

    public static final Uri d(FileInputStream fileInputStream, Context context, File file, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        Intrinsics.checkNotNullParameter(fileInputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        ContentResolver contentResolver = context.getContentResolver();
        if (uri == null) {
            d.h("FileExt", 5, "insert: error: uri == null");
            return null;
        }
        Intrinsics.e(contentResolver);
        try {
            outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        } catch (FileNotFoundException e10) {
            d.c("FileExt", "save: open stream error: " + e10);
            outputStreamOpenOutputStream = null;
        }
        try {
            if (outputStreamOpenOutputStream == null) {
                return null;
            }
            try {
                f.d(fileInputStream, outputStreamOpenOutputStream);
                fileInputStream.close();
                outputStreamOpenOutputStream.close();
                return uri;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.o(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                b.o(outputStreamOpenOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final Uri e(FileInputStream fileInputStream, Context context, File file, String str) throws IOException {
        Uri uriInsert;
        OutputStream outputStreamOpenOutputStream;
        Uri EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullParameter(fileInputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.e(contentResolver);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        try {
            ContentValues contentValues = new ContentValues();
            if (Build.VERSION.SDK_INT >= 29) {
                String str2 = f40248a + "/" + str;
                contentValues.put("_display_name", name);
                contentValues.put("relative_path", str2);
                contentValues.put("is_pending", (Integer) 1);
                EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            } else {
                contentValues.put("_data", Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_DOWNLOADS + "/" + str + "/" + name);
                EXTERNAL_CONTENT_URI = MediaStore.Files.getContentUri("external");
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "getContentUri(...)");
            }
            uriInsert = contentResolver.insert(EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e10) {
            d.c("FileExt", "insertMediaImage: error: " + e10);
            uriInsert = null;
        }
        if (uriInsert == null) {
            d.h("FileExt", 5, "insert: error: uri == null");
        } else {
            try {
                outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            } catch (FileNotFoundException e11) {
                d.c("FileExt", "save: open stream error: " + e11);
                outputStreamOpenOutputStream = null;
            }
            try {
                if (outputStreamOpenOutputStream != null) {
                    try {
                        f.d(fileInputStream, outputStreamOpenOutputStream);
                        c(uriInsert, context, contentResolver, file);
                        Unit unit = Unit.f38893a;
                        fileInputStream.close();
                        outputStreamOpenOutputStream.close();
                        return uriInsert;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            b.o(fileInputStream, th);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    b.o(outputStreamOpenOutputStream, th3);
                    throw th4;
                }
            }
        }
        return null;
    }
}
