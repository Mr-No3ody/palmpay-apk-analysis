package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements LottieDrawable$LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f20201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20202c;

    public /* synthetic */ q(y yVar, String str, int i7) {
        this.f20200a = i7;
        this.f20201b = yVar;
        this.f20202c = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable$LazyCompositionTask
    public final void run(k kVar) {
        switch (this.f20200a) {
            case 0:
                this.f20201b.t(this.f20202c);
                break;
            case 1:
                this.f20201b.r(this.f20202c);
                break;
            default:
                this.f20201b.v(this.f20202c);
                break;
        }
    }
}
