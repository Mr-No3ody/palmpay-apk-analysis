package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes3.dex */
public final class FinderPattern extends ResultPoint {
    private final int count;
    private final float estimatedModuleSize;

    public FinderPattern(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public boolean aboutEquals(float f10, float f11, float f12) {
        if (Math.abs(f11 - getY()) > f10 || Math.abs(f12 - getX()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.estimatedModuleSize);
        return fAbs <= 1.0f || fAbs <= this.estimatedModuleSize;
    }

    public FinderPattern combineEstimate(float f10, float f11, float f12) {
        int i7 = this.count;
        int i10 = i7 + 1;
        float x3 = (getX() * i7) + f11;
        float f13 = i10;
        return new FinderPattern(x3 / f13, ((getY() * this.count) + f10) / f13, ((this.count * this.estimatedModuleSize) + f12) / f13, i10);
    }

    public int getCount() {
        return this.count;
    }

    public float getEstimatedModuleSize() {
        return this.estimatedModuleSize;
    }

    private FinderPattern(float f10, float f11, float f12, int i7) {
        super(f10, f11);
        this.estimatedModuleSize = f12;
        this.count = i7;
    }
}
