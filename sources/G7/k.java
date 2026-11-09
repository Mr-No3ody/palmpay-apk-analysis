package G7;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3119a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3122d;

    public k(View view, long j6, i iVar) {
        this.f3121c = view;
        this.f3120b = j6;
        this.f3122d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3119a) {
            case 0:
                View view = (View) this.f3121c;
                if (view.isAttachedToWindow()) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), 0.0f);
                    animatorCreateCircularReveal.setDuration(this.f3120b);
                    animatorCreateCircularReveal.start();
                    animatorCreateCircularReveal.addListener(new j((i) this.f3122d, 0));
                }
                break;
            case 1:
                try {
                    Thread.sleep(this.f3120b);
                } catch (InterruptedException e10) {
                    AdjustFactory.getLogger().warn("Sleep delay exception: %s", e10.getMessage());
                }
                ((SingleThreadCachedScheduler) this.f3122d).submit((Runnable) this.f3121c);
                break;
            default:
                if (!((p190mf.s) this.f3122d).f39717d) {
                    p190mf.s sVar = (p190mf.s) this.f3122d;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    sVar.getClass();
                    long jA = df.h.a(timeUnit);
                    long j6 = this.f3120b;
                    if (j6 > jA) {
                        try {
                            Thread.sleep(j6 - jA);
                        } catch (InterruptedException e11) {
                            Thread.currentThread().interrupt();
                            org.chromium.support_lib_boundary.util.b.V(e11);
                            return;
                        }
                    }
                    if (!((p190mf.s) this.f3122d).f39717d) {
                        ((Runnable) this.f3121c).run();
                    }
                }
                break;
        }
    }

    public k(SingleThreadCachedScheduler singleThreadCachedScheduler, long j6, Runnable runnable) {
        this.f3122d = singleThreadCachedScheduler;
        this.f3120b = j6;
        this.f3121c = runnable;
    }

    public k(Runnable runnable, p190mf.s sVar, long j6) {
        this.f3121c = runnable;
        this.f3122d = sVar;
        this.f3120b = j6;
    }
}
