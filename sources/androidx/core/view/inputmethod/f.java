package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InputContentInfoCompat$InputContentInfoCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f16241a;

    public f(Object obj) {
        this.f16241a = (InputContentInfo) obj;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Uri getContentUri() {
        return this.f16241a.getContentUri();
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final ClipDescription getDescription() {
        return this.f16241a.getDescription();
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Object getInputContentInfo() {
        return this.f16241a;
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Uri getLinkUri() {
        return this.f16241a.getLinkUri();
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final void releasePermission() {
        this.f16241a.releasePermission();
    }

    @Override // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final void requestPermission() {
        this.f16241a.requestPermission();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16241a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
