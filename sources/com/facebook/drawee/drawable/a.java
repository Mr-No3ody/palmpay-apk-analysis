package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DrawableParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21224b;

    public a(e eVar, int i7) {
        this.f21224b = eVar;
        this.f21223a = i7;
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    public final Drawable getDrawable() {
        return this.f21224b.c(this.f21223a);
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    public final Drawable setDrawable(Drawable drawable) {
        return this.f21224b.d(this.f21223a, drawable);
    }
}
