package androidx.camera.core.impl.utils.executor;

import J1.o;
import Pa.T;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f14157b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14158a;

    public /* synthetic */ a(int i7) {
        this.f14158a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14158a) {
            case 0:
                runnable.run();
                break;
            case 1:
                o.f().post(runnable);
                break;
            case 2:
                runnable.run();
                break;
            default:
                T.c(runnable);
                break;
        }
    }
}
