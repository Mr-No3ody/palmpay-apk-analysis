package p359y1;

import androidx.camera.core.impl.utils.executor.e;
import com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p7.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f44023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z4.a f44025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f44027e;

    public a(e eVar, String str, boolean z3) {
        Z4.a aVar = GlideExecutor$UncaughtThrowableStrategy.i0;
        this.f44027e = new AtomicInteger();
        this.f44023a = eVar;
        this.f44024b = str;
        this.f44025c = aVar;
        this.f44026d = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f44023a.newThread(new h(22, this, runnable));
        threadNewThread.setName(ShadowThread.makeThreadName("glide-" + this.f44024b + "-thread-" + this.f44027e.getAndIncrement(), "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory"));
        return threadNewThread;
    }
}
