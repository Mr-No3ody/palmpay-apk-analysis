package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.e f20720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f20721c;

    public /* synthetic */ n(q qVar, G1.e eVar, int i7) {
        this.f20719a = i7;
        this.f20721c = qVar;
        this.f20720b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20719a) {
            case 0:
                synchronized (this.f20720b.getLock()) {
                    synchronized (this.f20721c) {
                        try {
                            p pVar = this.f20721c.f20735a;
                            G1.e eVar = this.f20720b;
                            pVar.getClass();
                            if (pVar.f20724a.contains(new o(eVar, J1.g.f4462b))) {
                                q qVar = this.f20721c;
                                G1.e eVar2 = this.f20720b;
                                qVar.getClass();
                                try {
                                    eVar2.c(qVar.f20729H, 5);
                                } catch (Throwable th) {
                                    throw new b(th);
                                }
                            }
                            this.f20721c.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                synchronized (this.f20720b.getLock()) {
                    synchronized (this.f20721c) {
                        try {
                            p pVar2 = this.f20721c.f20735a;
                            G1.e eVar3 = this.f20720b;
                            pVar2.getClass();
                            if (pVar2.f20724a.contains(new o(eVar3, J1.g.f4462b))) {
                                this.f20721c.f20731M.a();
                                q qVar2 = this.f20721c;
                                G1.e eVar4 = this.f20720b;
                                qVar2.getClass();
                                try {
                                    eVar4.onResourceReady(qVar2.f20731M, qVar2.f20727B, qVar2.f20734Y);
                                    this.f20721c.f(this.f20720b);
                                } catch (Throwable th3) {
                                    throw new b(th3);
                                }
                            }
                            this.f20721c.b();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
