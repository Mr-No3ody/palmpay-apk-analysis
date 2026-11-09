package B7;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f542c;

    public c(SmartRefreshLayout smartRefreshLayout, float f10, int i7) {
        this.f542c = smartRefreshLayout;
        this.f540a = f10;
        this.f541b = i7;
    }

    @Override // java.lang.Runnable
    public void run() {
        SmartRefreshLayout smartRefreshLayout = this.f542c;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(smartRefreshLayout.f25047b, (int) (smartRefreshLayout.f25044Y0 * this.f540a));
        smartRefreshLayout.f25015A1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f541b);
        smartRefreshLayout.f25015A1.setInterpolator(new DecelerateInterpolator());
        smartRefreshLayout.f25015A1.addUpdateListener(new a(this));
        smartRefreshLayout.f25015A1.addListener(new b(this));
        smartRefreshLayout.f25015A1.start();
    }
}
