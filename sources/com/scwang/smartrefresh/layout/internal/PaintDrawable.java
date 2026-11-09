package com.scwang.smartrefresh.layout.internal;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PaintDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f25185a;

    public PaintDrawable() {
        Paint paint = new Paint();
        this.f25185a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(-5592406);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f25185a.setAlpha(i7);
    }

    public void setColor(int i7) {
        this.f25185a.setColor(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25185a.setColorFilter(colorFilter);
    }
}
