package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InputContentInfoCompat$InputContentInfoCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClipDescription f16243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f16244c;

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16242a = uri;
        this.f16243b = clipDescription;
        this.f16244c = uri2;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Uri getContentUri() {
        return this.f16242a;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final ClipDescription getDescription() {
        return this.f16243b;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Object getInputContentInfo() {
        return null;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Uri getLinkUri() {
        return this.f16244c;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final void releasePermission() {
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final void requestPermission() {
    }
}
