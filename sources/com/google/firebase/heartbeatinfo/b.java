package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f22982b;

    public /* synthetic */ b(DefaultHeartBeatController defaultHeartBeatController, int i7) {
        this.f22981a = i7;
        this.f22982b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f22981a) {
            case 0:
                return this.f22982b.lambda$getHeartBeatsHeader$1();
            default:
                return this.f22982b.lambda$registerHeartBeat$0();
        }
    }
}
