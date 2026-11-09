package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class GroupView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReadableMap f23304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1413j f23305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f23306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Canvas f23307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f23308e;

    public GroupView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f23308e = new Paint(1);
    }

    public void b(Canvas canvas, Paint paint, float f10) {
        g();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f23306c;
            if (bitmap == null) {
                this.f23306c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f23307d = new Canvas(this.f23306c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f23306c = bitmapCreateBitmap;
                this.f23307d.setBitmap(bitmapCreateBitmap);
            }
            this.f23307d.save();
            this.f23307d.setMatrix(canvas.getMatrix());
        } else {
            this.f23307d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof MaskView) || (childAt instanceof ClipPathView)) {
                ((RenderableView) childAt).mergeProperties(this);
            } else if (childAt instanceof VirtualView) {
                VirtualView virtualView = (VirtualView) childAt;
                if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                    boolean z3 = virtualView instanceof RenderableView;
                    if (z3) {
                        ((RenderableView) virtualView).mergeProperties(this);
                    }
                    int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f23307d, this.mCTM);
                    virtualView.render(this.f23307d, paint, f10);
                    RectF clientRect = virtualView.getClientRect();
                    if (clientRect != null) {
                        rectF.union(clientRect);
                    }
                    virtualView.restoreCanvas(this.f23307d, iSaveAndSetupCanvas);
                    if (z3) {
                        ((RenderableView) virtualView).resetProperties();
                    }
                    if (virtualView.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                    ArrayList<C1415l> arrayList = virtualView.elements;
                    if (arrayList != null) {
                        this.elements.addAll(arrayList);
                    }
                }
            } else if (childAt instanceof SvgView) {
                SvgView svgView2 = (SvgView) childAt;
                if (svgView2.getChildCount() > 0) {
                    View childAt2 = svgView2.getChildAt(0);
                    if (childAt2 instanceof GroupView) {
                        ((GroupView) childAt2).mergeProperties(this);
                    }
                }
                svgView2.drawChildren(canvas);
                if (svgView2.isResponsible()) {
                    svgView.enableTouchEvents();
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f23307d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            Paint paint2 = this.f23308e;
            paint2.setAlpha((int) (this.mOpacity * 255.0f));
            Bitmap bitmap2 = this.f23306c;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint2);
            }
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        f();
    }

    public final void c(Canvas canvas, Paint paint, float f10) {
        super.draw(canvas, paint, f10);
    }

    public Path d(Canvas canvas, Paint paint) {
        Region.Op op = Region.Op.UNION;
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof MaskView) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathD = virtualView instanceof GroupView ? ((GroupView) virtualView).d(canvas, paint) : virtualView.getPath(canvas, paint);
                pathD.transform(matrix);
                path.op(pathD, opValueOf);
            }
        }
        return path;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        h(canvas);
        clip(canvas, paint);
        b(canvas, paint, f10);
        renderMarkers(canvas, paint, f10);
    }

    public final C1413j e() {
        GroupView textRoot = getTextRoot();
        textRoot.getClass();
        return textRoot.f23305b;
    }

    public void f() {
        C1413j c1413jE = e();
        ArrayList arrayList = c1413jE.f23503a;
        arrayList.remove(c1413jE.f23499L);
        ArrayList arrayList2 = c1413jE.f23514l;
        arrayList2.remove(c1413jE.f23499L);
        ArrayList arrayList3 = c1413jE.f23515m;
        arrayList3.remove(c1413jE.f23499L);
        ArrayList arrayList4 = c1413jE.f23516n;
        arrayList4.remove(c1413jE.f23499L);
        ArrayList arrayList5 = c1413jE.f23517o;
        arrayList5.remove(c1413jE.f23499L);
        ArrayList arrayList6 = c1413jE.f23518p;
        arrayList6.remove(c1413jE.f23499L);
        int i7 = c1413jE.f23499L - 1;
        c1413jE.f23499L = i7;
        int i10 = c1413jE.f23489B;
        int i11 = c1413jE.f23490C;
        int i12 = c1413jE.f23491D;
        int i13 = c1413jE.f23492E;
        int i14 = c1413jE.f23493F;
        c1413jE.f23520r = (C1412i) arrayList.get(i7);
        c1413jE.f23489B = ((Integer) arrayList2.get(c1413jE.f23499L)).intValue();
        c1413jE.f23490C = ((Integer) arrayList3.get(c1413jE.f23499L)).intValue();
        c1413jE.f23491D = ((Integer) arrayList4.get(c1413jE.f23499L)).intValue();
        c1413jE.f23492E = ((Integer) arrayList5.get(c1413jE.f23499L)).intValue();
        c1413jE.f23493F = ((Integer) arrayList6.get(c1413jE.f23499L)).intValue();
        if (i10 != c1413jE.f23489B) {
            ArrayList arrayList7 = c1413jE.f23504b;
            arrayList7.remove(i10);
            c1413jE.f23524w = (C1420q[]) arrayList7.get(c1413jE.f23489B);
            c1413jE.f23494G = ((Integer) c1413jE.f23509g.get(c1413jE.f23489B)).intValue();
        }
        if (i11 != c1413jE.f23490C) {
            ArrayList arrayList8 = c1413jE.f23505c;
            arrayList8.remove(i11);
            c1413jE.f23525x = (C1420q[]) arrayList8.get(c1413jE.f23490C);
            c1413jE.f23495H = ((Integer) c1413jE.f23510h.get(c1413jE.f23490C)).intValue();
        }
        if (i12 != c1413jE.f23491D) {
            ArrayList arrayList9 = c1413jE.f23506d;
            arrayList9.remove(i12);
            c1413jE.f23526y = (C1420q[]) arrayList9.get(c1413jE.f23491D);
            c1413jE.f23496I = ((Integer) c1413jE.f23511i.get(c1413jE.f23491D)).intValue();
        }
        if (i13 != c1413jE.f23492E) {
            ArrayList arrayList10 = c1413jE.f23507e;
            arrayList10.remove(i13);
            c1413jE.f23527z = (C1420q[]) arrayList10.get(c1413jE.f23492E);
            c1413jE.f23497J = ((Integer) c1413jE.f23512j.get(c1413jE.f23492E)).intValue();
        }
        if (i14 != c1413jE.f23493F) {
            ArrayList arrayList11 = c1413jE.f23508f;
            arrayList11.remove(i14);
            c1413jE.f23488A = (double[]) arrayList11.get(c1413jE.f23493F);
            c1413jE.f23498K = ((Integer) c1413jE.f23513k.get(c1413jE.f23493F)).intValue();
        }
    }

    public void g() {
        C1413j c1413jE = e();
        c1413jE.f(this, this.f23304a);
        c1413jE.e();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof MaskView) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path path2 = virtualView.getPath(canvas, paint);
                if (path2 != null) {
                    this.mPath.addPath(path2, matrix);
                }
            }
        }
        return this.mPath;
    }

    public final void h(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f23305b = new C1413j(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof MaskView) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
