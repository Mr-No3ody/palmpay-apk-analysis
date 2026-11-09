package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1051c;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0878q implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12999b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0878q(Object obj, int i7) {
        this.f12998a = i7;
        this.f12999b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C0868l c0868l;
        switch (this.f12998a) {
            case 0:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.f12999b;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        break;
                    } else {
                        activityChooserView.getListPopupWindow().show();
                        AbstractC1051c abstractC1051c = activityChooserView.f12596g;
                        if (abstractC1051c != null && (c0868l = abstractC1051c.f16203a) != null) {
                            c0868l.onSubUiVisibilityChanged(true);
                            break;
                        }
                    }
                }
                break;
            default:
                M m7 = (M) this.f12999b;
                AppCompatSpinner appCompatSpinner = m7.f12731w0;
                m7.getClass();
                if (appCompatSpinner.isAttachedToWindow() && appCompatSpinner.getGlobalVisibleRect(m7.f12729u0)) {
                    m7.c();
                    m7.show();
                } else {
                    m7.dismiss();
                }
                break;
        }
    }
}
