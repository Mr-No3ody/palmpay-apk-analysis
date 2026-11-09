package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements LottieDrawable$LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f20278b;

    public /* synthetic */ w(y yVar, int i7) {
        this.f20277a = i7;
        this.f20278b = yVar;
    }

    @Override // com.airbnb.lottie.LottieDrawable$LazyCompositionTask
    public final void run(k kVar) {
        switch (this.f20277a) {
            case 0:
                this.f20278b.o();
                break;
            default:
                this.f20278b.m();
                break;
        }
    }
}
