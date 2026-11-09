package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f16867s;
    public float t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16868u;

    public j(Object obj, h hVar) {
        super(obj, hVar);
        this.f16867s = null;
        this.t = Float.MAX_VALUE;
        this.f16868u = false;
    }

    public final void c(float f10) {
        if (this.f16859f) {
            this.t = f10;
            return;
        }
        if (this.f16867s == null) {
            this.f16867s = new k(f10);
        }
        k kVar = this.f16867s;
        double d2 = f10;
        kVar.f16877i = d2;
        double d10 = (float) d2;
        if (d10 > this.f16860g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < this.f16861h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f16863j * 0.75f);
        kVar.f16872d = dAbs;
        kVar.f16873e = dAbs * 62.5d;
        if (!g.a().f16841e.isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z3 = this.f16859f;
        if (z3 || z3) {
            return;
        }
        this.f16859f = true;
        if (!this.f16856c) {
            this.f16855b = this.f16858e.getValue(this.f16857d);
        }
        float f11 = this.f16855b;
        if (f11 > this.f16860g || f11 < this.f16861h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        d dVarA = g.a();
        ArrayList arrayList = dVarA.f16838b;
        if (arrayList.size() == 0) {
            dVarA.f16841e.postFrameCallback(dVarA.f16840d);
            if (Build.VERSION.SDK_INT >= 33) {
                dVarA.f16843g = ValueAnimator.getDurationScale();
                if (dVarA.f16844h == null) {
                    dVarA.f16844h = new p1.d(dVarA, 28);
                }
                dVarA.f16844h.register();
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void d() {
        if (this.f16867s.f16870b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!g.a().f16841e.isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f16859f) {
            this.f16868u = true;
        }
    }
}
