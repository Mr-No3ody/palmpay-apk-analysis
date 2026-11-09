package E;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: E.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205j extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f2043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f2047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2048f;

    public C0205j(Rect rect, int i7, int i10, boolean z3, Matrix matrix, boolean z8) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f2043a = rect;
        this.f2044b = i7;
        this.f2045c = i10;
        this.f2046d = z3;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f2047e = matrix;
        this.f2048f = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.f2043a.equals(((C0205j) l0Var).f2043a)) {
                C0205j c0205j = (C0205j) l0Var;
                if (this.f2044b == c0205j.f2044b && this.f2045c == c0205j.f2045c && this.f2046d == c0205j.f2046d && this.f2047e.equals(c0205j.f2047e) && this.f2048f == c0205j.f2048f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f2043a.hashCode() ^ 1000003) * 1000003) ^ this.f2044b) * 1000003) ^ this.f2045c) * 1000003) ^ (this.f2046d ? 1231 : 1237)) * 1000003) ^ this.f2047e.hashCode()) * 1000003) ^ (this.f2048f ? 1231 : 1237);
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f2043a + ", getRotationDegrees=" + this.f2044b + ", getTargetRotation=" + this.f2045c + ", hasCameraTransform=" + this.f2046d + ", getSensorToBufferTransform=" + this.f2047e + ", isMirroring=" + this.f2048f + "}";
    }
}
