package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactInstanceManager f21708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21709c;

    public /* synthetic */ c(ReactInstanceManager reactInstanceManager, Object obj, int i7) {
        this.f21707a = i7;
        this.f21708b = reactInstanceManager;
        this.f21709c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21707a) {
            case 0:
                this.f21708b.lambda$runCreateReactContextOnNewThread$2((ReactInstanceManager.ReactContextInitParams) this.f21709c);
                break;
            default:
                this.f21708b.lambda$runCreateReactContextOnNewThread$1((ReactApplicationContext) this.f21709c);
                break;
        }
    }
}
