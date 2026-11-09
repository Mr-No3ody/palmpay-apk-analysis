package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements LottieDrawable$LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f20204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20205c;

    public /* synthetic */ r(y yVar, int i7, int i10) {
        this.f20203a = i10;
        this.f20204b = yVar;
        this.f20205c = i7;
    }

    @Override // com.airbnb.lottie.LottieDrawable$LazyCompositionTask
    public final void run(k kVar) {
        switch (this.f20203a) {
            case 0:
                this.f20204b.q(this.f20205c);
                break;
            case 1:
                this.f20204b.u(this.f20205c);
                break;
            default:
                this.f20204b.p(this.f20205c);
                break;
        }
    }
}
