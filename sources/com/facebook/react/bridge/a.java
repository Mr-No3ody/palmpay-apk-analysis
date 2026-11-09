package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f21702b;

    public /* synthetic */ a(CatalystInstanceImpl catalystInstanceImpl, int i7) {
        this.f21701a = i7;
        this.f21702b = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21701a) {
            case 0:
                CatalystInstanceImpl.InstanceCallback.lambda$onBatchComplete$0(this.f21702b);
                break;
            case 1:
                this.f21702b.lambda$destroy$2();
                break;
            case 2:
                this.f21702b.lambda$destroy$1();
                break;
            case 3:
                this.f21702b.lambda$onNativeException$6();
                break;
            case 4:
                this.f21702b.lambda$destroy$0();
                break;
            case 5:
                this.f21702b.lambda$incrementPendingJSCalls$4();
                break;
            case 6:
                this.f21702b.lambda$initialize$3();
                break;
            default:
                this.f21702b.lambda$decrementPendingJSCalls$5();
                break;
        }
    }
}
