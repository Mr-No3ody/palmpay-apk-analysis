package V0;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f9857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f9858c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9859d;

    public B(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f9856a = context;
        this.f9857b = workerParameters;
    }

    public abstract androidx.concurrent.futures.m a();

    public abstract androidx.concurrent.futures.m b();
}
