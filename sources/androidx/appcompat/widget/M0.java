package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f12732a;

    public M0(SearchView searchView) {
        this.f12732a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        this.f12732a.h();
        return true;
    }
}
