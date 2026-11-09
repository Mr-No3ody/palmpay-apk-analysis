package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f12690a;

    public I0(SearchView searchView) {
        this.f12690a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        SearchView searchView = this.f12690a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f12796q0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z3);
        }
    }
}
