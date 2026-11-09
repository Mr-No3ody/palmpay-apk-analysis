package androidx.dynamicanimation.animation;

import M.n;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f16836i = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p279s5.d f16841e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1.d f16844h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16837a = new n(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16838b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Oe.a f16839c = new Oe.a(this, 13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f16840d = new Runnable() { // from class: androidx.dynamicanimation.animation.a
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            Oe.a aVar = this.f16833a.f16839c;
            aVar.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            d dVar = (d) aVar.f6830b;
            dVar.getClass();
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            int i7 = 0;
            while (true) {
                arrayList = dVar.f16838b;
                if (i7 >= arrayList.size()) {
                    break;
                }
                AnimationHandler$AnimationFrameCallback animationHandler$AnimationFrameCallback = (AnimationHandler$AnimationFrameCallback) arrayList.get(i7);
                if (animationHandler$AnimationFrameCallback != null) {
                    n nVar = dVar.f16837a;
                    Long l5 = (Long) nVar.get(animationHandler$AnimationFrameCallback);
                    if (l5 == null) {
                        animationHandler$AnimationFrameCallback.doAnimationFrame(jUptimeMillis);
                    } else if (l5.longValue() < jUptimeMillis2) {
                        nVar.remove(animationHandler$AnimationFrameCallback);
                        animationHandler$AnimationFrameCallback.doAnimationFrame(jUptimeMillis);
                    }
                }
                i7++;
            }
            if (dVar.f16842f) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                    dVar.f16844h.unregister();
                }
                dVar.f16842f = false;
            }
            if (arrayList.size() > 0) {
                dVar.f16841e.postFrameCallback(dVar.f16840d);
            }
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16842f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16843g = 1.0f;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.dynamicanimation.animation.a] */
    public d(p279s5.d dVar) {
        this.f16841e = dVar;
    }
}
