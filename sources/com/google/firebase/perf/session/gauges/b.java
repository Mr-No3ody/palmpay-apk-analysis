package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.ApplicationProcessState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GaugeManager f23044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f23046d;

    public /* synthetic */ b(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState, int i7) {
        this.f23043a = i7;
        this.f23044b = gaugeManager;
        this.f23045c = str;
        this.f23046d = applicationProcessState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23043a) {
            case 0:
                this.f23044b.lambda$stopCollectingGauges$3(this.f23045c, this.f23046d);
                break;
            default:
                this.f23044b.lambda$startCollectingGauges$2(this.f23045c, this.f23046d);
                break;
        }
    }
}
