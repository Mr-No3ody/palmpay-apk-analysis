package androidx.core.view.inputmethod;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.C1052d;
import androidx.core.view.N;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements InputConnectionCompat$OnCommitContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatEditText f16238a;

    public /* synthetic */ c(AppCompatEditText appCompatEditText) {
        this.f16238a = appCompatEditText;
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
    public final boolean onCommitContent(h hVar, int i7, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                hVar.f16245a.requestPermission();
                Parcelable parcelable = (Parcelable) hVar.f16245a.getInputContentInfo();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription description = hVar.f16245a.getDescription();
        InputContentInfoCompat$InputContentInfoCompatImpl inputContentInfoCompat$InputContentInfoCompatImpl = hVar.f16245a;
        C1052d c1052d = new C1052d(new ClipData(description, new ClipData.Item(inputContentInfoCompat$InputContentInfoCompatImpl.getContentUri())), 2, 0);
        c1052d.setLinkUri(inputContentInfoCompat$InputContentInfoCompatImpl.getLinkUri());
        c1052d.setExtras(bundle);
        return N.m(this.f16238a, c1052d.build()) == null;
    }
}
