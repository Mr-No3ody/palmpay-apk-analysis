package p212o1;

import C0.G;
import android.graphics.PointF;
import androidx.camera.camera2.internal.F;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f39991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f39992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f39995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f39997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f39998m;

    public final int hashCode() {
        int i7 = ((F.i(this.f39989d) + (((int) (G.c(this.f39986a.hashCode() * 31, 31, this.f39987b) + this.f39988c)) * 31)) * 31) + this.f39990e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f39991f);
        return (((i7 * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f39993h;
    }
}
