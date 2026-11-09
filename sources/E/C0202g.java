package E;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraInternal;

/* JADX INFO: renamed from: E.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f2027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraInternal f2029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2031e;

    public C0202g(Size size, Rect rect, CameraInternal cameraInternal, int i7, boolean z3) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f2027a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f2028b = rect;
        this.f2029c = cameraInternal;
        this.f2030d = i7;
        this.f2031e = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0202g) {
            C0202g c0202g = (C0202g) obj;
            if (this.f2027a.equals(c0202g.f2027a) && this.f2028b.equals(c0202g.f2028b)) {
                CameraInternal cameraInternal = c0202g.f2029c;
                CameraInternal cameraInternal2 = this.f2029c;
                if (cameraInternal2 != null ? cameraInternal2.equals(cameraInternal) : cameraInternal == null) {
                    if (this.f2030d == c0202g.f2030d && this.f2031e == c0202g.f2031e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f2027a.hashCode() ^ 1000003) * 1000003) ^ this.f2028b.hashCode()) * 1000003;
        CameraInternal cameraInternal = this.f2029c;
        return ((((iHashCode ^ (cameraInternal == null ? 0 : cameraInternal.hashCode())) * 1000003) ^ this.f2030d) * 1000003) ^ (this.f2031e ? 1231 : 1237);
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.f2027a + ", inputCropRect=" + this.f2028b + ", cameraInternal=" + this.f2029c + ", rotationDegrees=" + this.f2030d + ", mirroring=" + this.f2031e + "}";
    }
}
