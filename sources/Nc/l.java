package Nc;

import com.transsnet.adsdk.widgets.banner.BannerAdView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6335b;

    public /* synthetic */ l(n nVar, int i7) {
        this.f6334a = i7;
        this.f6335b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6334a) {
            case 0:
                BannerAdView bannerAdView = this.f6335b.f6339b;
                if (bannerAdView != null) {
                    bannerAdView.setVisibility(8);
                }
                break;
            default:
                BannerAdView bannerAdView2 = this.f6335b.f6339b;
                if (bannerAdView2 != null) {
                    bannerAdView2.setVisibility(0);
                }
                break;
        }
    }
}
