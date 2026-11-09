package p250q8;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.observer.AdCommonObserver;
import com.transsnet.adsdk.widgets.splash.SplashAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AdCommonObserver {
    @Override // com.transsnet.adsdk.data.network.INetResult
    public final void onSuccess(Object obj) {
        SplashAdView.downloadNoCacheImg((AdEntity) obj);
    }
}
