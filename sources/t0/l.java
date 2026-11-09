package t0;

import androidx.graphics.shapes.Measurer;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f42284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f42286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f42287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f42288e;

    public l(m mVar, e cubic, float f10, float f11) {
        Intrinsics.checkNotNullParameter(cubic, "cubic");
        this.f42288e = mVar;
        this.f42284a = cubic;
        if (f11 < f10) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        this.f42285b = mVar.f42290b.measureCubic(cubic);
        this.f42286c = f10;
        this.f42287d = f11;
    }

    public final Pair a(float f10) {
        float fB = kotlin.ranges.b.b(f10, this.f42286c, this.f42287d);
        float f11 = this.f42287d;
        float f12 = this.f42286c;
        float f13 = (fB - f12) / (f11 - f12);
        m mVar = this.f42288e;
        Measurer measurer = mVar.f42290b;
        float f14 = f13 * this.f42285b;
        e eVar = this.f42284a;
        float fFindCubicCutPoint = measurer.findCubicCutPoint(eVar, f14);
        if (0.0f > fFindCubicCutPoint || fFindCubicCutPoint > 1.0f) {
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        Pair pairD = eVar.d(fFindCubicCutPoint);
        return new Pair(new l(mVar, (e) pairD.f38891a, this.f42286c, fB), new l(mVar, (e) pairD.f38892b, fB, this.f42287d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.f42286c + " .. " + this.f42287d + "], size=" + this.f42285b + ", cubic=" + this.f42284a + ')';
    }
}
