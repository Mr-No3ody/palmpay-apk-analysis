package com.facebook.react.runtime;

import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements BridgelessAtomicRef.Provider, QueueThreadExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21803b;

    public /* synthetic */ k(ReactHostImpl reactHostImpl, int i7) {
        this.f21802a = i7;
        this.f21803b = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
    public Object get() {
        switch (this.f21802a) {
            case 0:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$41(this.f21803b, "getOrCreateReactInstanceTask()");
            default:
                return ReactHostImpl.getOrCreateReactContext$lambda$31(this.f21803b, "getOrCreateReactContext()");
        }
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$38$lambda$36(this.f21803b, exc);
    }
}
