package androidx.appcompat.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListener;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0846a implements ViewPropertyAnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12865a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbsActionBarView f12867c;

    public C0846a(AbsActionBarView absActionBarView) {
        this.f12867c = absActionBarView;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationCancel(View view) {
        this.f12865a = true;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        if (this.f12865a) {
            return;
        }
        AbsActionBarView absActionBarView = this.f12867c;
        absActionBarView.f12517f = null;
        super/*android.view.View*/.setVisibility(this.f12866b);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        super/*android.view.View*/.setVisibility(0);
        this.f12865a = false;
    }
}
