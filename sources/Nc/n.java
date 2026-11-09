package Nc;

import android.os.Bundle;
import com.transsnet.adsdk.widgets.banner.BannerAdView;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC0482a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6338c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAdView f6339b;

    @Override // Nc.AbstractC0482a
    public final void b(Bundle bundle) {
        BannerAdView.refreshData$default(this.f6339b, false, 1, null);
    }
}
