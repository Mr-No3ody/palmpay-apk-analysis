package p102ge;

import Pa.N;
import Pa.i0;
import com.transsnet.palmpay.ui.activity.SplashActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f37199c;

    @Override // Pa.N
    public final void d(Object obj) {
        SplashActivity splashActivity = (SplashActivity) this.f37199c.get();
        if (!i0.W(splashActivity) || splashActivity.f34572d) {
            return;
        }
        splashActivity.g(1);
    }

    @Override // Pa.N
    public final /* bridge */ /* synthetic */ void a() {
    }
}
