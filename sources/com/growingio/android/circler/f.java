package com.growingio.android.circler;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f23145b;

    public /* synthetic */ f(g gVar, int i7) {
        this.f23144a = i7;
        this.f23145b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23144a) {
            case 0:
                ((c) this.f23145b.f23148c).onFailed();
                break;
            case 1:
                ((c) this.f23145b.f23148c).onReady();
                break;
            case 2:
                ((c) this.f23145b.f23148c).onQuited();
                break;
            case 3:
                Object obj = this.f23145b.f23148c;
                break;
            case 4:
                ((c) this.f23145b.f23148c).onQuited();
                break;
            default:
                ((c) this.f23145b.f23148c).onFailed();
                break;
        }
    }

    public f(g gVar, String str) {
        this.f23144a = 3;
        this.f23145b = gVar;
    }
}
