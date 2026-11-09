package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class V extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f12179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(X x3, int i7) {
        super(11);
        this.f12178e = i7;
        this.f12179f = x3;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        View view2;
        X x3 = this.f12179f;
        switch (this.f12178e) {
            case 0:
                if (x3.f12202p && (view2 = x3.f12193g) != null) {
                    view2.setTranslationY(0.0f);
                    x3.f12190d.setTranslationY(0.0f);
                }
                x3.f12190d.setVisibility(8);
                x3.f12190d.setTransitioning(false);
                x3.f12206u = null;
                p279s5.d dVar = x3.f12197k;
                if (dVar != null) {
                    dVar.onDestroyActionMode(x3.f12196j);
                    x3.f12196j = null;
                    x3.f12197k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = x3.f12189c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                    androidx.core.view.C.c(actionBarOverlayLayout);
                }
                break;
            default:
                x3.f12206u = null;
                x3.f12190d.requestLayout();
                break;
        }
    }
}
