package Pa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {
    public /* synthetic */ o0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @SuppressLint({"SimpleDateFormat"})
    private final File createImageFile(Activity activity) {
        if (activity != null) {
            String strK = N8.q0.k("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), "_");
            File externalFilesDir = activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            if (externalFilesDir != null) {
                try {
                    return File.createTempFile(strK, PictureMimeType.JPG, externalFilesDir);
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return null;
    }

    @JvmStatic
    public final void launch(@Nullable Activity activity, int i7) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/phone_v2");
        if (activity != null) {
            activity.startActivityForResult(intent, i7);
        }
    }

    @JvmStatic
    public final void pickImage(@Nullable Activity activity, int i7) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType(SelectMimeType.SYSTEM_IMAGE);
        if (activity == null || intent.resolveActivity(activity.getPackageManager()) == null) {
            return;
        }
        activity.startActivityForResult(intent, i7, null);
    }

    @JvmStatic
    @Nullable
    public final String retrieveContactName(@Nullable Activity activity, @NotNull Uri contactUri) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(contactUri, "contactUri");
        String[] strArr = {"display_name"};
        if (activity == null) {
            return null;
        }
        try {
            ContentResolver contentResolver = activity.getContentResolver();
            if (contentResolver == null || (cursorQuery = contentResolver.query(contactUri, strArr, null, null, null)) == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                    cursorQuery.close();
                    return string;
                }
                Unit unit = Unit.f38893a;
                cursorQuery.close();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public final String retrieveContactPhone(@Nullable Activity activity, @NotNull Uri contactUri) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(contactUri, "contactUri");
        String[] strArr = {"data1"};
        if (activity == null) {
            return null;
        }
        try {
            ContentResolver contentResolver = activity.getContentResolver();
            if (contentResolver == null || (cursorQuery = contentResolver.query(contactUri, strArr, null, null, null)) == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                    cursorQuery.close();
                    return string;
                }
                Unit unit = Unit.f38893a;
                cursorQuery.close();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @JvmStatic
    public final void takePhoto(@Nullable Activity activity, int i7) {
        File fileCreateImageFile;
        if (activity != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(activity.getPackageManager()) == null || (fileCreateImageFile = p0.f7134a.createImageFile(activity)) == null) {
                return;
            }
            intent.putExtra("output", androidx.core.content.f.getUriForFile(activity, "com.transsnet.palmpay.fileprovider", fileCreateImageFile));
            activity.startActivityForResult(intent, i7, null);
        }
    }

    private o0() {
    }
}
