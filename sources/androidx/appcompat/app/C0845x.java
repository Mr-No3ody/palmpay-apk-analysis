package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0845x extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0845x(Object obj, int i7) {
        super(11);
        this.f12327e = i7;
        this.f12328f = obj;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        Object obj = this.f12328f;
        switch (this.f12327e) {
            case 0:
                I i7 = (I) ((RunnableC0842u) obj).f12324b;
                i7.f12139X.setAlpha(1.0f);
                i7.f12142k0.d(null);
                i7.f12142k0 = null;
                break;
            case 1:
                I i10 = (I) obj;
                i10.f12139X.setAlpha(1.0f);
                i10.f12142k0.d(null);
                i10.f12142k0 = null;
                break;
            default:
                I i11 = (I) ((p279s5.d) obj).f42026c;
                i11.f12139X.setVisibility(8);
                PopupWindow popupWindow = i11.f12140Y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (i11.f12139X.getParent() instanceof View) {
                    View view2 = (View) i11.f12139X.getParent();
                    WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                    androidx.core.view.C.c(view2);
                }
                i11.f12139X.g();
                i11.f12142k0.d(null);
                i11.f12142k0 = null;
                ViewGroup viewGroup = i11.f12146q0;
                WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
                androidx.core.view.C.c(viewGroup);
                break;
        }
    }

    @Override // p059e1.a, androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view) {
        Object obj = this.f12328f;
        switch (this.f12327e) {
            case 0:
                ((I) ((RunnableC0842u) obj).f12324b).f12139X.setVisibility(0);
                break;
            case 1:
                I i7 = (I) obj;
                i7.f12139X.setVisibility(0);
                if (i7.f12139X.getParent() instanceof View) {
                    View view2 = (View) i7.f12139X.getParent();
                    WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                    androidx.core.view.C.c(view2);
                }
                break;
        }
    }
}
