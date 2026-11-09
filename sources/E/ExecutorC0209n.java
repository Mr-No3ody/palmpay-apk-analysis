package E;

import androidx.camera.core.impl.CameraFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: E.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0209n implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactoryC0208m f2070c = new ThreadFactoryC0208m(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2071a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f2072b;

    public ExecutorC0209n() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2070c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC0207l(0));
        this.f2072b = threadPoolExecutor;
    }

    public final void a(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        cameraFactory.getClass();
        synchronized (this.f2071a) {
            try {
                if (this.f2072b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2070c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC0207l(0));
                    this.f2072b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f2072b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, cameraFactory.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f2071a) {
            this.f2072b.execute(runnable);
        }
    }
}
