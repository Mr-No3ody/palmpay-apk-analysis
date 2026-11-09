package com.transsnet.palmpay.custom_view;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends GradientDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f30995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f30996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30997c;

    public final void a() {
        ColorStateList colorStateList = this.f30995a;
        if (colorStateList != null) {
            setStroke(this.f30997c, colorStateList.getColorForState(getState(), this.f30995a.getDefaultColor()));
        }
        ColorStateList colorStateList2 = this.f30996b;
        if (colorStateList2 != null) {
            setColor(colorStateList2.getColorForState(getState(), this.f30996b.getDefaultColor()));
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f30995a;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f30996b;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        a();
        return super.onStateChange(iArr);
    }
}
