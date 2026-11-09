package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScalingUtils$ScaleType f21323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f21327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f21328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Drawable drawable, n scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f21328f = new Matrix();
        this.f21323a = scaleType;
    }

    public final void a() {
        Drawable current = getCurrent();
        if (current == null) {
            this.f21326d = 0;
            this.f21325c = 0;
            this.f21327e = null;
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f21325c = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f21326d = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f21327e = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f21327e = null;
        } else {
            if (this.f21323a == o.f21336i) {
                current.setBounds(bounds);
                this.f21327e = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.f21328f;
            matrix.reset();
            this.f21323a.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f);
            this.f21327e = matrix;
        }
    }

    public final void b() {
        boolean z3;
        ScalingUtils$ScaleType scalingUtils$ScaleType = this.f21323a;
        if (scalingUtils$ScaleType instanceof ScalingUtils$StatefulScaleType) {
            Intrinsics.f(scalingUtils$ScaleType, "null cannot be cast to non-null type com.facebook.drawee.drawable.ScalingUtils.StatefulScaleType");
            Object state = ((ScalingUtils$StatefulScaleType) scalingUtils$ScaleType).getState();
            Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
            z3 = !Intrinsics.c(state, this.f21324b);
            this.f21324b = state;
        } else {
            z3 = false;
        }
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f21325c == current.getIntrinsicWidth() && this.f21326d == current.getIntrinsicHeight() && !z3) {
            return;
        }
        a();
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        b();
        if (this.f21327e == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f21327e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.f, com.facebook.drawee.drawable.TransformCallback
    public final void getTransform(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        getParentTransform(transform);
        b();
        Matrix matrix = this.f21327e;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        a();
    }

    @Override // com.facebook.drawee.drawable.f
    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        a();
        return current;
    }
}
