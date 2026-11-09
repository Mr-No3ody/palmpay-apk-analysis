package B5;

import android.os.Handler;
import android.os.Looper;
import com.imuxuan.floatingview.FloatingMagnetView;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f370a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FloatingMagnetView f374e;

    public b(FloatingMagnetView floatingMagnetView) {
        this.f374e = floatingMagnetView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FloatingMagnetView floatingMagnetView = this.f374e;
        if (floatingMagnetView.getRootView() == null || floatingMagnetView.getRootView().getParent() == null) {
            return;
        }
        float fMin = Math.min(1.0f, (System.currentTimeMillis() - this.f373d) / 400.0f);
        float x3 = (this.f371b - floatingMagnetView.getX()) * fMin;
        float y8 = (this.f372c - floatingMagnetView.getY()) * fMin;
        int i7 = FloatingMagnetView.f23546v;
        floatingMagnetView.setX(floatingMagnetView.getX() + x3);
        floatingMagnetView.setY(floatingMagnetView.getY() + y8);
        if (fMin < 1.0f) {
            this.f370a.post(this);
        }
    }
}
