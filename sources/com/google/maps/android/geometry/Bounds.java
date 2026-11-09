package com.google.maps.android.geometry;

/* JADX INFO: loaded from: classes3.dex */
public class Bounds {
    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public Bounds(double d2, double d10, double d11, double d12) {
        this.minX = d2;
        this.minY = d11;
        this.maxX = d10;
        this.maxY = d12;
        this.midX = (d2 + d10) / 2.0d;
        this.midY = (d11 + d12) / 2.0d;
    }

    public boolean contains(double d2, double d10) {
        return this.minX <= d2 && d2 <= this.maxX && this.minY <= d10 && d10 <= this.maxY;
    }

    public boolean intersects(double d2, double d10, double d11, double d12) {
        return d2 < this.maxX && this.minX < d10 && d11 < this.maxY && this.minY < d12;
    }

    public boolean contains(Point point) {
        return contains(point.f23092x, point.f23093y);
    }

    public boolean intersects(Bounds bounds) {
        return intersects(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }

    public boolean contains(Bounds bounds) {
        return bounds.minX >= this.minX && bounds.maxX <= this.maxX && bounds.minY >= this.minY && bounds.maxY <= this.maxY;
    }
}
