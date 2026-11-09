package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class G implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f12682a;

    public G(AppCompatSpinner appCompatSpinner) {
        this.f12682a = appCompatSpinner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AppCompatSpinner appCompatSpinner = this.f12682a;
        if (!appCompatSpinner.getInternalPopup().isShowing()) {
            appCompatSpinner.f12618f.show(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        }
        ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
