package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements FontProvider$ContentQueryWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentProviderClient f16104a;

    public b(Context context, Uri uri) {
        this.f16104a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // androidx.core.provider.FontProvider$ContentQueryWrapper
    public final void close() {
        ContentProviderClient contentProviderClient = this.f16104a;
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    @Override // androidx.core.provider.FontProvider$ContentQueryWrapper
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        ContentProviderClient contentProviderClient = this.f16104a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
