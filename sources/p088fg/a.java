package p088fg;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36799a = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
