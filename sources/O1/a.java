package O1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f6536c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6538b;

    public a(int i7) {
        this.f6537a = i7;
        switch (i7) {
            case 1:
                this.f6538b = new Handler(Looper.getMainLooper());
                break;
            case 2:
                this.f6538b = Executors.newSingleThreadExecutor(new androidx.camera.core.impl.utils.executor.e(0));
                break;
            default:
                this.f6538b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f6537a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                ((Handler) this.f6538b).post(command);
                break;
            case 1:
                ((Handler) this.f6538b).post(command);
                break;
            default:
                ((ExecutorService) this.f6538b).execute(command);
                break;
        }
    }
}
