package androidx.core.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
interface FontProvider$ContentQueryWrapper {
    static FontProvider$ContentQueryWrapper make(Context context, Uri uri) {
        return new b(context, uri);
    }

    void close();

    Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
}
