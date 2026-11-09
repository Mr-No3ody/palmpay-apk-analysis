package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogBoxModule f21737b;

    public /* synthetic */ m(LogBoxModule logBoxModule, int i7) {
        this.f21736a = i7;
        this.f21737b = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21736a) {
            case 0:
                LogBoxModule.hide$lambda$1(this.f21737b);
                break;
            case 1:
                LogBoxModule.invalidate$lambda$2(this.f21737b);
                break;
            default:
                LogBoxModule.show$lambda$0(this.f21737b);
                break;
        }
    }
}
