package com.transsnet.adsdk;

import android.content.Context;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.observer.AdCommonObserver;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.widgets.SingleAdView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AdCommonObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeakReference f25569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, IAdListener iAdListener, Context context2, WeakReference weakReference) {
        super(context, iAdListener);
        this.f25568a = context2;
        this.f25569b = weakReference;
    }

    @Override // com.transsnet.adsdk.data.network.observer.AdCommonObserver, com.transsnet.adsdk.data.network.INetResult
    public final void onFailed(String str, String str2) {
        super.onFailed(str, str2);
        SingleAdView.clearPreloadData();
    }

    @Override // com.transsnet.adsdk.data.network.INetResult
    public final void onSuccess(Object obj) {
        Context context = this.f25568a;
        AdManager.preloadImage(context, (AdEntity) obj);
        AdSdkUtils.onLoadAdSuccess(context, (IAdListener) this.f25569b.get());
    }
}
