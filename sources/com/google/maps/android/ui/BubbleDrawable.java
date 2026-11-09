package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.maps.android.R;

/* JADX INFO: loaded from: classes3.dex */
class BubbleDrawable extends Drawable {
    private int mColor = -1;
    private final Drawable mMask;
    private final Drawable mShadow;

    public BubbleDrawable(Context context) {
        this.mMask = context.getDrawable(R.drawable.amu_bubble_mask);
        this.mShadow = context.getDrawable(R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mMask.draw(canvas);
        canvas.drawColor(this.mColor, PorterDuff.Mode.SRC_IN);
        this.mShadow.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.mMask.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i7, int i10, int i11, int i12) {
        this.mMask.setBounds(i7, i10, i11, i12);
        this.mShadow.setBounds(i7, i10, i11, i12);
    }

    public void setColor(int i7) {
        this.mColor = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.mMask.setBounds(rect);
        this.mShadow.setBounds(rect);
    }
}
