package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements LottieDrawable$LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f20211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f20212c;

    public /* synthetic */ t(y yVar, float f10, int i7) {
        this.f20210a = i7;
        this.f20211b = yVar;
        this.f20212c = f10;
    }

    @Override // com.airbnb.lottie.LottieDrawable$LazyCompositionTask
    public final void run(k kVar) {
        switch (this.f20210a) {
            case 0:
                y yVar = this.f20211b;
                k kVar2 = yVar.f20304a;
                float f10 = this.f20212c;
                if (kVar2 != null) {
                    float f11 = com.airbnb.lottie.utils.g.f(kVar2.f19885l, kVar2.f19886m, f10);
                    com.airbnb.lottie.utils.e eVar = yVar.f20305b;
                    eVar.i(eVar.f20236o, f11);
                } else {
                    yVar.f20309f.add(new t(yVar, f10, 0));
                }
                break;
            case 1:
                y yVar2 = this.f20211b;
                k kVar3 = yVar2.f20304a;
                float f12 = this.f20212c;
                if (kVar3 != null) {
                    yVar2.u((int) com.airbnb.lottie.utils.g.f(kVar3.f19885l, kVar3.f19886m, f12));
                } else {
                    yVar2.f20309f.add(new t(yVar2, f12, 1));
                }
                break;
            default:
                this.f20211b.w(this.f20212c);
                break;
        }
    }
}
