package p061e3;

import com.didiglobal.booster.instrument.ShadowThread;
import com.flexibank.sdk.g;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f36116b;

    public t(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f36115a = prefix;
        this.f36116b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new ShadowThread(new g(19, this, runnable), this.f36115a + "-" + this.f36116b.getAndIncrement(), "\u200bcom.facebook.imagepipeline.core.PriorityThreadFactory");
    }
}
