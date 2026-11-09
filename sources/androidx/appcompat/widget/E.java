package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatSeekBar f12669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f12670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f12671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f12672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12674i;

    public E(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f12671f = null;
        this.f12672g = null;
        this.f12673h = false;
        this.f12674i = false;
        this.f12669d = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.C
    public final void a(AttributeSet attributeSet, int i7) {
        super.a(attributeSet, i7);
        AppCompatSeekBar appCompatSeekBar = this.f12669d;
        Z0 z0F = Z0.f(appCompatSeekBar.getContext(), attributeSet, p241q.j.AppCompatSeekBar, i7, 0);
        androidx.core.view.N.p(appCompatSeekBar, appCompatSeekBar.getContext(), p241q.j.AppCompatSeekBar, attributeSet, z0F.f12863b, i7, 0);
        Drawable drawableC = z0F.c(p241q.j.AppCompatSeekBar_android_thumb);
        if (drawableC != null) {
            appCompatSeekBar.setThumb(drawableC);
        }
        Drawable drawableB = z0F.b(p241q.j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f12670e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f12670e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(appCompatSeekBar);
            drawableB.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(appCompatSeekBar.getDrawableState());
            }
            c();
        }
        appCompatSeekBar.invalidate();
        int i10 = p241q.j.AppCompatSeekBar_tickMarkTintMode;
        TypedArray typedArray = z0F.f12863b;
        if (typedArray.hasValue(i10)) {
            this.f12672g = AbstractC0859g0.c(typedArray.getInt(p241q.j.AppCompatSeekBar_tickMarkTintMode, -1), this.f12672g);
            this.f12674i = true;
        }
        if (typedArray.hasValue(p241q.j.AppCompatSeekBar_tickMarkTint)) {
            this.f12671f = z0F.a(p241q.j.AppCompatSeekBar_tickMarkTint);
            this.f12673h = true;
        }
        z0F.g();
        c();
    }

    public final void c() {
        Drawable drawable = this.f12670e;
        if (drawable != null) {
            if (this.f12673h || this.f12674i) {
                Drawable drawableMutate = drawable.mutate();
                this.f12670e = drawableMutate;
                if (this.f12673h) {
                    drawableMutate.setTintList(this.f12671f);
                }
                if (this.f12674i) {
                    this.f12670e.setTintMode(this.f12672g);
                }
                if (this.f12670e.isStateful()) {
                    this.f12670e.setState(this.f12669d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f12670e != null) {
            AppCompatSeekBar appCompatSeekBar = this.f12669d;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f12670e.getIntrinsicWidth();
                int intrinsicHeight = this.f12670e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f12670e.setBounds(-i7, -i10, i7, i10);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f12670e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
