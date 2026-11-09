package androidx.appcompat.view.menu;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class s implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f12477a;

    public s(t tVar) {
        this.f12477a = tVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f12477a.c();
    }
}
