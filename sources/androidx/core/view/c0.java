package androidx.core.view;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f16206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16207d;

    public c0(int i7, Interpolator interpolator, long j6) {
        this.f16204a = i7;
        this.f16206c = interpolator;
        this.f16207d = j6;
    }

    public long a() {
        return this.f16207d;
    }

    public float b() {
        Interpolator interpolator = this.f16206c;
        return interpolator != null ? interpolator.getInterpolation(this.f16205b) : this.f16205b;
    }

    public int c() {
        return this.f16204a;
    }

    public void d(float f10) {
        this.f16205b = f10;
    }
}
