package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MemoryGaugeCollector f23048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f23049c;

    public /* synthetic */ c(MemoryGaugeCollector memoryGaugeCollector, Timer timer, int i7) {
        this.f23047a = i7;
        this.f23048b = memoryGaugeCollector;
        this.f23049c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23047a) {
            case 0:
                this.f23048b.lambda$scheduleMemoryMetricCollectionWithRate$0(this.f23049c);
                break;
            default:
                this.f23048b.lambda$scheduleMemoryMetricCollectionOnce$1(this.f23049c);
                break;
        }
    }
}
