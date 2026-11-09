package com.google.maps.android.geometry;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class Point {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final double f23092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double f23093y;

    public Point(double d2, double d10) {
        this.f23092x = d2;
        this.f23093y = d10;
    }

    @NonNull
    public String toString() {
        return "Point{x=" + this.f23092x + ", y=" + this.f23093y + '}';
    }
}
