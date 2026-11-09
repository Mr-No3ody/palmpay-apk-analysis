package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes2.dex */
final class x extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f22779a;

    public x(ae aeVar) {
        this.f22779a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f22779a.f22753g) {
            try {
                if (this.f22779a.f22759m.get() > 0 && this.f22779a.f22759m.decrementAndGet() > 0) {
                    this.f22779a.f22749c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                ae aeVar = this.f22779a;
                if (aeVar.f22761o != null) {
                    aeVar.f22749c.d("Unbind from service.", new Object[0]);
                    ae aeVar2 = this.f22779a;
                    aeVar2.f22748b.unbindService(aeVar2.f22760n);
                    this.f22779a.f22754h = false;
                    this.f22779a.f22761o = null;
                    this.f22779a.f22760n = null;
                }
                this.f22779a.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
