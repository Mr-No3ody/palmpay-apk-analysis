package Pa;

import com.adjust.sdk.AdjustFactory;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7040a;

    public /* synthetic */ Q(int i7) {
        this.f7040a = i7;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.f7040a) {
            case 0:
                System.out.println(th);
                break;
            case 1:
                AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
                break;
            default:
                ARouter.logger.info("ARouter::", "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + "]");
                break;
        }
    }
}
