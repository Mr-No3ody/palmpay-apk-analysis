package p220oa;

import F6.d;
import Kf.o;
import N8.q0;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40249a = Environment.DIRECTORY_PICTURES;

    public static final Uri a(Context context, String fileName, File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!file.canRead() || !file.exists()) {
            d.h("ImageExt", 5, u.k(file, "check: read file error: "));
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Uri uriE = e(fileInputStream, context, fileName);
            fileInputStream.close();
            return uriE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void b(Uri uri, Context context, ContentResolver contentResolver, File file) {
        ContentValues contentValues = new ContentValues();
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uri, contentValues, null, null);
        } else {
            if (file != null) {
                contentValues.put("_size", Long.valueOf(file.length()));
            }
            contentResolver.update(uri, contentValues, null, null);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
        }
    }

    public static final Uri c(ContentResolver contentResolver, String str) throws IOException {
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(str);
            if (file.canRead() && file.exists()) {
                d.h("ImageExt", 2, q0.k("query: path: ", str, " exists"));
                return Uri.fromFile(file);
            }
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "_data"}, "_data == ?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToNext()) {
                        Unit unit = Unit.f38893a;
                        cursorQuery.close();
                        return null;
                    }
                    Uri uriWithAppendedId = ContentUris.withAppendedId(uri, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")));
                    Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                    d.h("ImageExt", 2, "query: path: " + str + " exists uri: " + uriWithAppendedId);
                    cursorQuery.close();
                    return uriWithAppendedId;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    public static final Uri d(FileInputStream fileInputStream, Context context, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        Intrinsics.checkNotNullParameter(fileInputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        if (uri == null) {
            d.h("ImageExt", 5, "insert: error: uri == null");
            return null;
        }
        Intrinsics.e(contentResolver);
        try {
            outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        } catch (FileNotFoundException e10) {
            d.c("ImageExt", "save: open stream error: " + e10);
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
                    org.chromium.support_lib_boundary.util.b.o(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                org.chromium.support_lib_boundary.util.b.o(outputStreamOpenOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0156  */
    /* JADX WARN: Code duplicated, block: B:58:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final Uri e(FileInputStream fileInputStream, Context context, String fileName) throws IOException {
        File file;
        Uri uriInsert;
        OutputStream outputStreamOpenOutputStream;
        Uri EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullParameter(fileInputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.e(contentResolver);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("mime_type", "image/jpeg");
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
            int i7 = Build.VERSION.SDK_INT;
            String str = f40249a;
            if (i7 < 29) {
                File file2 = new File(Environment.getExternalStoragePublicDirectory(str), "palmPay");
                if (file2.exists() || file2.mkdirs()) {
                    file = new File(file2, fileName);
                    Intrinsics.checkNotNullParameter(file, "<this>");
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String strT = StringsKt.T(name, Consts.DOT);
                    String strF = o.f(file);
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    Uri uriC = c(contentResolver, absolutePath);
                    int i10 = 1;
                    while (uriC != null) {
                        int i11 = i10 + 1;
                        File file3 = new File(file2, strT + "(" + i10 + ")." + strF);
                        String absolutePath2 = file3.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                        uriC = c(contentResolver, absolutePath2);
                        i10 = i11;
                        file = file3;
                    }
                    contentValues.put("_display_name", file.getName());
                    String absolutePath3 = file.getAbsolutePath();
                    d.h("ImageExt", 2, "save file: " + absolutePath3);
                    contentValues.put("_data", absolutePath3);
                    try {
                        EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                    } catch (Exception e10) {
                        e = e10;
                        d.c("ImageExt", "insertMediaImage: error: " + e);
                        uriInsert = null;
                    }
                } else {
                    d.c("ImageExt", "save: error: can't create Pictures directory");
                    uriInsert = null;
                    file = null;
                }
                if (uriInsert == null) {
                    d.h("ImageExt", 5, "insert: error: uri == null");
                } else {
                    try {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    } catch (FileNotFoundException e11) {
                        d.c("ImageExt", "save: open stream error: " + e11);
                        outputStreamOpenOutputStream = null;
                    }
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            try {
                                f.d(fileInputStream, outputStreamOpenOutputStream);
                                try {
                                    b(uriInsert, context, contentResolver, file);
                                } catch (Exception unused) {
                                }
                                Unit unit = Unit.f38893a;
                                fileInputStream.close();
                                outputStreamOpenOutputStream.close();
                                return uriInsert;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    org.chromium.support_lib_boundary.util.b.o(fileInputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                org.chromium.support_lib_boundary.util.b.o(outputStreamOpenOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                return null;
            }
            contentValues.put("_display_name", fileName);
            contentValues.put("relative_path", str + "/palmPay");
            contentValues.put("is_pending", (Integer) 1);
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.getContentUri("external_primary");
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "getContentUri(...)");
            file = null;
            uriInsert = contentResolver.insert(EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e12) {
            e = e12;
            file = null;
        }
        if (uriInsert == null) {
            d.h("ImageExt", 5, "insert: error: uri == null");
        } else {
            outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream != null) {
                f.d(fileInputStream, outputStreamOpenOutputStream);
                b(uriInsert, context, contentResolver, file);
                Unit unit2 = Unit.f38893a;
                fileInputStream.close();
                outputStreamOpenOutputStream.close();
                return uriInsert;
            }
        }
        return null;
    }
}
