package io.reactivex.internal.schedulers;

import p190mf.c;
import p190mf.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements SchedulerMultiWorkerSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c[] f37888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f37889c;

    public a(int i7, k kVar) {
        this.f37887a = i7;
        this.f37888b = new c[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f37888b[i10] = new c(kVar);
        }
    }

    public final c a() {
        int i7 = this.f37887a;
        if (i7 == 0) {
            return b.f37893g;
        }
        long j6 = this.f37889c;
        this.f37889c = 1 + j6;
        return this.f37888b[(int) (j6 % ((long) i7))];
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public final void createWorkers(int i7, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        int i10 = this.f37887a;
        if (i10 == 0) {
            for (int i11 = 0; i11 < i7; i11++) {
                workerCallback.onWorker(i11, b.f37893g);
            }
            return;
        }
        int i12 = ((int) this.f37889c) % i10;
        for (int i13 = 0; i13 < i7; i13++) {
            workerCallback.onWorker(i13, new p190mf.b(this.f37888b[i12]));
            i12++;
            if (i12 == i10) {
                i12 = 0;
            }
        }
        this.f37889c = i12;
    }
}
