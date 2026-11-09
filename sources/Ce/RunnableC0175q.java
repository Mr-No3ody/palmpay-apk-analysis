package Ce;

import android.os.Trace;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.ui.fragment.HomeFragment;

/* JADX INFO: renamed from: Ce.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0175q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f1516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f1517c;

    public /* synthetic */ RunnableC0175q(HomeFragment homeFragment, HomeFragment homeFragment2, int i7) {
        this.f1515a = i7;
        this.f1516b = homeFragment;
        this.f1517c = homeFragment2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1515a) {
            case 0:
                HomeFragment homeFragment = this.f1516b;
                if (!homeFragment.isAdded() || homeFragment.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    HomeFragment homeFragment2 = this.f1517c;
                    homeFragment2.f35092w.postDelayed(new B5.c(homeFragment2, 3), BaseApplication.get().isOldAndroidDevice() ? 2000L : 1000L);
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                HomeFragment homeFragment3 = this.f1517c;
                HomeFragment homeFragment4 = this.f1516b;
                if (!homeFragment4.isAdded() || homeFragment4.isDetached()) {
                    return;
                }
                Trace.beginSection("delayInit");
                try {
                    F6.d.h(homeFragment3.f27317a, 3, "delayInit: ");
                    homeFragment3.f35084L = true;
                    homeFragment3.F();
                    HomeFragment.u(homeFragment3);
                    HomeFragment.w(homeFragment3);
                    Fe.I i7 = (Fe.I) homeFragment3.f27328i;
                    if (i7 != null) {
                        i7.queryMeTabTotalAssetInfo();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
