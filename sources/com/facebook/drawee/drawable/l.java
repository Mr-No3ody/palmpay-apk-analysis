package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k {
    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        p181m3.a.a();
        if (!this.f21306b && !this.f21307c && this.f21308d <= 0.0f) {
            super.draw(canvas);
            p181m3.a.a();
            return;
        }
        b();
        a();
        canvas.clipPath(this.f21309e);
        super.draw(canvas);
        p181m3.a.a();
    }
}
