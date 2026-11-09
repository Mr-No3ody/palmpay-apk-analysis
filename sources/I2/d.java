package I2;

import androidx.camera.camera2.internal.F;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3991a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3992b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f3993c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3994d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3995e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3996f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3997g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3998h = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3992b == dVar.f3992b && this.f3994d == dVar.f3994d && Float.compare(dVar.f3995e, this.f3995e) == 0 && this.f3996f == dVar.f3996f && Float.compare(dVar.f3997g, this.f3997g) == 0 && this.f3991a == dVar.f3991a && this.f3998h == dVar.f3998h) {
            return Arrays.equals(this.f3993c, dVar.f3993c);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f3991a;
        int i10 = (((i7 != 0 ? F.i(i7) : 0) * 31) + (this.f3992b ? 1 : 0)) * 31;
        float[] fArr = this.f3993c;
        int iHashCode = (((i10 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f3994d) * 31;
        float f10 = this.f3995e;
        int iFloatToIntBits = (((iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f3996f) * 31;
        float f11 = this.f3997g;
        return ((iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 961) + (this.f3998h ? 1 : 0);
    }
}
