package p250q8;

import com.transsnet.adsdk.widgets.splash.SplashAdView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashAdView f41463b;

    public /* synthetic */ a(SplashAdView splashAdView, int i7) {
        this.f41462a = i7;
        this.f41463b = splashAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41462a) {
            case 0:
                this.f41463b.lambda$run$3();
                break;
            default:
                this.f41463b.lambda$run$5();
                break;
        }
    }
}
