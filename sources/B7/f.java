package B7;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f547c;

    public f(SmartRefreshLayout smartRefreshLayout, float f10, int i7) {
        this.f547c = smartRefreshLayout;
        this.f545a = f10;
        this.f546b = i7;
    }

    @Override // java.lang.Runnable
    public void run() {
        SmartRefreshLayout smartRefreshLayout = this.f547c;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(smartRefreshLayout.f25047b, -((int) (smartRefreshLayout.f25046a1 * this.f545a)));
        smartRefreshLayout.f25015A1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f546b);
        smartRefreshLayout.f25015A1.setInterpolator(new DecelerateInterpolator());
        smartRefreshLayout.f25015A1.addUpdateListener(new d(this));
        smartRefreshLayout.f25015A1.addListener(new e(this));
        smartRefreshLayout.f25015A1.start();
    }
}
