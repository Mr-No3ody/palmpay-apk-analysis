package com.airbnb.lottie;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.airbnb.lottie.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1318j implements LottieListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f19873b;

    public C1318j(LottieAnimationView lottieAnimationView, int i7) {
        this.f19872a = i7;
        switch (i7) {
            case 1:
                this.f19873b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f19873b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        switch (this.f19872a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f19873b.get();
                if (lottieAnimationView != null) {
                    int i7 = lottieAnimationView.f19578d;
                    if (i7 != 0) {
                        lottieAnimationView.setImageResource(i7);
                    }
                    LottieListener lottieListener = lottieAnimationView.f19577c;
                    if (lottieListener == null) {
                        lottieListener = LottieAnimationView.f19574w;
                    }
                    lottieListener.onResult(th);
                    break;
                }
                break;
            default:
                k kVar = (k) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f19873b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(kVar);
                    break;
                }
                break;
        }
    }
}
