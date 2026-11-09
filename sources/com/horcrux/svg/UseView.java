package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class UseView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1420q f23409e;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f23405a);
        if (definedTemplate == null) {
            p229p2.a.v("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f23405a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f23406b), (float) relativeOnHeight(this.f23407c));
        boolean z3 = definedTemplate instanceof RenderableView;
        if (z3) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof SymbolView) {
            canvas2 = canvas;
            paint2 = paint;
            ((SymbolView) definedTemplate).i(canvas2, paint2, f10, (float) relativeOnWidth(this.f23408d), (float) relativeOnHeight(this.f23409e));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f10 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, iSaveAndSetupCanvas);
        if (z3) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f23405a);
        if (definedTemplate == null) {
            p229p2.a.v("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f23405a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f23406b), (float) relativeOnHeight(this.f23407c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        if (this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f23405a);
            if (definedTemplate == null) {
                p229p2.a.v("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f23405a + " is not defined.");
                return -1;
            }
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
        }
        return -1;
    }
}
