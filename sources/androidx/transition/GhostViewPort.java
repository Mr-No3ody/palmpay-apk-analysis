package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewPort extends ViewGroup implements GhostView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f17940g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f17941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f17942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f17943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f17945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserverOnPreDrawListenerC1263y f17946f;

    public GhostViewPort(View view) {
        super(view.getContext());
        this.f17946f = new ViewTreeObserverOnPreDrawListenerC1263y(this);
        this.f17943c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = E.ghost_view;
        View view = this.f17943c;
        view.setTag(i7, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f17946f);
        k0.c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f17943c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f17946f);
        k0.c(view, 0);
        view.setTag(E.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        K.c(canvas, true);
        canvas.setMatrix(this.f17945e);
        View view = this.f17943c;
        k0.c(view, 0);
        view.invalidate();
        k0.c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        K.c(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }

    @Override // androidx.transition.GhostView
    public final void reserveEndViewTransition(ViewGroup viewGroup, View view) {
        this.f17941a = viewGroup;
        this.f17942b = view;
    }

    @Override // android.view.View, androidx.transition.GhostView
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        int i10 = E.ghost_view;
        View view = this.f17943c;
        if (((GhostViewPort) view.getTag(i10)) == this) {
            k0.c(view, i7 == 0 ? 4 : 0);
        }
    }
}
