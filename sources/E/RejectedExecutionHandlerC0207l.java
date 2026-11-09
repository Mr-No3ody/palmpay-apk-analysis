package E;

import com.appsflyer.internal.AFc1dSDK;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: E.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0207l implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2051a;

    public /* synthetic */ RejectedExecutionHandlerC0207l(int i7) {
        this.f2051a = i7;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.f2051a) {
            case 0:
                p140j8.f.g("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
                break;
            default:
                AFc1dSDK.getMediationNetwork(runnable, threadPoolExecutor);
                break;
        }
    }
}
