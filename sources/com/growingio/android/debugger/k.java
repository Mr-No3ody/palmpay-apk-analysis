package com.growingio.android.debugger;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.growingio.android.circler.g f23182b;

    public /* synthetic */ k(com.growingio.android.circler.g gVar, int i7) {
        this.f23181a = i7;
        this.f23182b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23181a) {
            case 0:
                ((g) this.f23182b.f23148c).onFailed();
                break;
            case 1:
                ((g) this.f23182b.f23148c).onReady();
                break;
            case 2:
                ((g) this.f23182b.f23148c).onQuited();
                break;
            case 3:
                ((g) this.f23182b.f23148c).onQuited();
                break;
            default:
                ((g) this.f23182b.f23148c).onFailed();
                break;
        }
    }
}
