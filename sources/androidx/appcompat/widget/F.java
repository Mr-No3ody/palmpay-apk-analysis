package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractViewOnTouchListenerC0875o0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M f12676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f12677p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, M m7) {
        super(appCompatSpinner2);
        this.f12677p = appCompatSpinner;
        this.f12676o = m7;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final ShowableListMenu b() {
        return this.f12676o;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f12677p;
        if (appCompatSpinner.getInternalPopup().isShowing()) {
            return true;
        }
        appCompatSpinner.f12618f.show(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
