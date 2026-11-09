package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class ForeignObjectView extends GroupView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1420q f23300g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1420q f23301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1420q f23302j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Canvas f23303o;

    @Override // com.horcrux.svg.GroupView
    public final void b(Canvas canvas, Paint paint, float f10) {
        g();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof MaskView)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                        boolean z3 = virtualView instanceof RenderableView;
                        if (z3) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z3) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    int iSave = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
            }
        }
        setClientRect(rectF);
        f();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f23303o);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f23299f);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f23300g);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f23301i);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f23302j);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f10);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(this.f23303o, view, j6);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public final void invalidate() {
        super.invalidate();
        SvgView svgView = getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }
}
