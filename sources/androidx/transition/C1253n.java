package androidx.transition;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.transition.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1253n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f18093h;

    public C1253n(View view) {
        this.f18086a = view.getTranslationX();
        this.f18087b = view.getTranslationY();
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        this.f18088c = androidx.core.view.E.g(view);
        this.f18089d = view.getScaleX();
        this.f18090e = view.getScaleY();
        this.f18091f = view.getRotationX();
        this.f18092g = view.getRotationY();
        this.f18093h = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1253n)) {
            return false;
        }
        C1253n c1253n = (C1253n) obj;
        return c1253n.f18086a == this.f18086a && c1253n.f18087b == this.f18087b && c1253n.f18088c == this.f18088c && c1253n.f18089d == this.f18089d && c1253n.f18090e == this.f18090e && c1253n.f18091f == this.f18091f && c1253n.f18092g == this.f18092g && c1253n.f18093h == this.f18093h;
    }

    public final int hashCode() {
        float f10 = this.f18086a;
        int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.f18087b;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
        float f12 = this.f18088c;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
        float f13 = this.f18089d;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
        float f14 = this.f18090e;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
        float f15 = this.f18091f;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
        float f16 = this.f18092g;
        int iFloatToIntBits7 = (iFloatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
        float f17 = this.f18093h;
        return iFloatToIntBits7 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0);
    }
}
