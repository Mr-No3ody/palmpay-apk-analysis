package p333w2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f43254a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String a(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!FirebaseAnalytics.Param.CONTENT.equals(b(uri))) {
            if ("file".equals(b(uri))) {
                return uri.getPath();
            }
            return null;
        }
        boolean z3 = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            documentId.getClass();
            Uri uri3 = z3 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri3.getClass();
            str = "_id=?";
            uri2 = uri3;
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{"_data"}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data")) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean c(Uri uri) {
        String strB = b(uri);
        return Constants.SCHEME.equals(strB) || "http".equals(strB);
    }
}
