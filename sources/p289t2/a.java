package p289t2;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f42314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f42315i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile File f42317b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile File f42319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42320e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile StatFs f42316a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile StatFs f42318c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f42322g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f42321f = new ReentrantLock();

    public static StatFs b(StatFs statFs, File file) throws Throwable {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                e.j(th);
                throw null;
            }
        }
        return null;
    }

    public final void a() {
        if (this.f42322g) {
            return;
        }
        this.f42321f.lock();
        try {
            if (!this.f42322g) {
                this.f42317b = Environment.getDataDirectory();
                this.f42319d = Environment.getExternalStorageDirectory();
                this.f42316a = b(this.f42316a, this.f42317b);
                this.f42318c = b(this.f42318c, this.f42319d);
                this.f42320e = SystemClock.uptimeMillis();
                this.f42322g = true;
            }
        } finally {
            this.f42321f.unlock();
        }
    }
}
