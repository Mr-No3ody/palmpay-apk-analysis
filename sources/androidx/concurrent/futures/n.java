package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f15067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f15068b;

    static {
        n nVar = new n("INSTANCE", 0);
        f15067a = nVar;
        f15068b = new n[]{nVar};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f15068b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
