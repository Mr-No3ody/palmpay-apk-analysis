package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CpuGaugeCollector f23041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f23042c;

    public /* synthetic */ a(CpuGaugeCollector cpuGaugeCollector, Timer timer, int i7) {
        this.f23040a = i7;
        this.f23041b = cpuGaugeCollector;
        this.f23042c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23040a) {
            case 0:
                this.f23041b.lambda$scheduleCpuMetricCollectionWithRate$0(this.f23042c);
                break;
            default:
                this.f23041b.lambda$scheduleCpuMetricCollectionOnce$1(this.f23042c);
                break;
        }
    }
}
