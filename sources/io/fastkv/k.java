package io.fastkv;

import Pa.C0505b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f37640b;

    public /* synthetic */ k(m mVar, int i7) {
        this.f37639a = i7;
        this.f37640b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37639a) {
            case 0:
                m mVar = this.f37640b;
                mVar.getClass();
                com.facebook.imagepipeline.nativecode.b.Y(mVar);
                return;
            default:
                m mVar2 = this.f37640b;
                synchronized (mVar2) {
                    try {
                        synchronized (mVar2.f37652f) {
                            mVar2.f37653g = true;
                            mVar2.f37652f.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!com.facebook.imagepipeline.nativecode.b.A(mVar2) && mVar2.f37669x == 0) {
                            com.facebook.imagepipeline.nativecode.b.z(mVar2);
                        }
                        if (mVar2.f37654h == null) {
                            mVar2.f37654h = new C0505b(m.f37645B);
                        }
                        if (mVar2.f37650d == 0) {
                            mVar2.f37650d = 12;
                        }
                        if (mVar2.f37658l) {
                            com.facebook.imagepipeline.nativecode.b.O(mVar2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
