package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15046d = new e(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f15047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f15048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f15049c;

    public e(Runnable runnable, Executor executor) {
        this.f15047a = runnable;
        this.f15048b = executor;
    }
}
