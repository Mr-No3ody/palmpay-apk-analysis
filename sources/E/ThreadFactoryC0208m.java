package E;

import com.didiglobal.booster.instrument.ShadowThread;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: E.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0208m implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f2053b;

    public ThreadFactoryC0208m(int i7) {
        this.f2052a = i7;
        switch (i7) {
            case 1:
                this.f2053b = new AtomicInteger(0);
                break;
            case 2:
                this.f2053b = new AtomicInteger(1);
                break;
            case 3:
                this.f2053b = new AtomicInteger(1);
                break;
            case 4:
                this.f2053b = new AtomicInteger(0);
                break;
            default:
                this.f2053b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2052a) {
            case 0:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + this.f2053b.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-camerax_io_" + this.f2053b.getAndIncrement());
                return thread2;
            case 2:
                return new ShadowThread(runnable, "Alpha Thread #" + this.f2053b.getAndIncrement(), "\u200bcom.alibaba.android.alpha.AlphaConfig$1");
            case 3:
                return new ShadowThread(runnable, "Request #" + this.f2053b.getAndIncrement(), "\u200bj.a$a");
            default:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.f2053b.getAndIncrement());
                return thread3;
        }
    }
}
