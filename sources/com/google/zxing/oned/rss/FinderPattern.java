package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes3.dex */
public final class FinderPattern {
    private final ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int i7, int[] iArr, int i10, int i11, int i12) {
        this.value = i7;
        this.startEnd = iArr;
        float f10 = i10;
        float f11 = i12;
        this.resultPoints = new ResultPoint[]{new ResultPoint(f10, f11), new ResultPoint(i11, f11)};
    }

    public boolean equals(Object obj) {
        return (obj instanceof FinderPattern) && this.value == ((FinderPattern) obj).value;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }
}
