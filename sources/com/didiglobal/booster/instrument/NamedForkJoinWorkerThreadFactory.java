package com.didiglobal.booster.instrument;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

/* JADX INFO: loaded from: classes.dex */
public class NamedForkJoinWorkerThreadFactory implements ForkJoinPool.ForkJoinWorkerThreadFactory {
    private final ForkJoinPool.ForkJoinWorkerThreadFactory factory;
    private final String name;

    public NamedForkJoinWorkerThreadFactory(ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory, String str) {
        this.factory = forkJoinWorkerThreadFactory;
        this.name = str;
    }

    @Override // java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory
    public ForkJoinWorkerThread newThread(ForkJoinPool forkJoinPool) {
        ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory = this.factory;
        ForkJoinWorkerThread forkJoinWorkerThreadNewThread = forkJoinWorkerThreadFactory != null ? forkJoinWorkerThreadFactory.newThread(forkJoinPool) : new ForkJoinWorkerThread(forkJoinPool) { // from class: com.didiglobal.booster.instrument.NamedForkJoinWorkerThreadFactory.1
        };
        forkJoinWorkerThreadNewThread.setName(ShadowThread.makeThreadName(forkJoinWorkerThreadNewThread.getName(), this.name));
        return forkJoinWorkerThreadNewThread;
    }

    public NamedForkJoinWorkerThreadFactory(String str) {
        this(null, str);
    }
}
