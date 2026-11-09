package androidx.work.impl.utils.taskexecutor;

import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.executor.f;
import androidx.work.impl.utils.k;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class a implements TaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0774s f18728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f18729c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f18730d = new f(this);

    public a(ExecutorService executorService) {
        k kVar = new k(executorService);
        this.f18727a = kVar;
        this.f18728b = AbstractC0780y.h(kVar);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final Executor getMainThreadExecutor() {
        return this.f18730d;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final SerialExecutor getSerialTaskExecutor() {
        return this.f18727a;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final AbstractC0774s getTaskCoroutineDispatcher() {
        return this.f18728b;
    }
}
