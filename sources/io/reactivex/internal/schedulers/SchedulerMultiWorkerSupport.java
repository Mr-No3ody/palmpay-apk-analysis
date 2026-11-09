package io.reactivex.internal.schedulers;

import df.h;
import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i7, @NonNull h hVar);
    }

    void createWorkers(int i7, @NonNull WorkerCallback workerCallback);
}
