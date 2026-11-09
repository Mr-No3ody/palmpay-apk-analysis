package Lb;

import Ae.n;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5619a;

    public /* synthetic */ c(int i7) {
        this.f5619a = i7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f5619a) {
            case 0:
                return new ShadowThread(new n(runnable, 28), "PpAsyncInflate", "\u200bcom.transsnet.palmpay.custom_view.async.PpAsyncInflateQueue");
            default:
                return p267r9.b.install$lambda$1(runnable);
        }
    }
}
