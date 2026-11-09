package androidx.vectordrawable.graphics.drawable;

import Pa.C0505b;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0505b f18158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0505b f18160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f18166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f18167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18168n;

    @Override // androidx.vectordrawable.graphics.drawable.l
    public final boolean a() {
        return this.f18160f.m() || this.f18158d.m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // androidx.vectordrawable.graphics.drawable.l
    public final boolean b(int[] iArr) {
        boolean z3;
        C0505b c0505b = this.f18160f;
        boolean z8 = false;
        if (c0505b.m()) {
            ColorStateList colorStateList = (ColorStateList) c0505b.f7074d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0505b.f7072b) {
                c0505b.f7072b = colorForState;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        C0505b c0505b2 = this.f18158d;
        if (c0505b2.m()) {
            ColorStateList colorStateList2 = (ColorStateList) c0505b2.f7074d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0505b2.f7072b) {
                c0505b2.f7072b = colorForState2;
                z8 = true;
            }
        }
        return z3 | z8;
    }

    public float getFillAlpha() {
        return this.f18162h;
    }

    @ColorInt
    public int getFillColor() {
        return this.f18160f.f7072b;
    }

    public float getStrokeAlpha() {
        return this.f18161g;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f18158d.f7072b;
    }

    public float getStrokeWidth() {
        return this.f18159e;
    }

    public float getTrimPathEnd() {
        return this.f18164j;
    }

    public float getTrimPathOffset() {
        return this.f18165k;
    }

    public float getTrimPathStart() {
        return this.f18163i;
    }

    public void setFillAlpha(float f10) {
        this.f18162h = f10;
    }

    public void setFillColor(int i7) {
        this.f18160f.f7072b = i7;
    }

    public void setStrokeAlpha(float f10) {
        this.f18161g = f10;
    }

    public void setStrokeColor(int i7) {
        this.f18158d.f7072b = i7;
    }

    public void setStrokeWidth(float f10) {
        this.f18159e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f18164j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f18165k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f18163i = f10;
    }
}
