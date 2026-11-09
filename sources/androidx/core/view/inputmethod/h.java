package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfoCompat$InputContentInfoCompatImpl f16245a;

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f16245a = new f(uri, clipDescription, uri2);
        } else {
            this.f16245a = new g(uri, clipDescription, uri2);
        }
    }

    public h(f fVar) {
        this.f16245a = fVar;
    }
}
