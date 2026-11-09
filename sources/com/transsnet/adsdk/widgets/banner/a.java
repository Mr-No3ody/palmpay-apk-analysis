package com.transsnet.adsdk.widgets.banner;

import com.transsnet.adsdk.interfaces.IMultipleUpdateListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ObservableOnSubscribe, Function, IRemoteDataListener, IMultipleUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerAdView f25615a;

    public /* synthetic */ a(BannerAdView bannerAdView) {
        this.f25615a = bannerAdView;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return BannerAdView.fetchData$lambda$10(this.f25615a, (Boolean) obj);
    }

    @Override // com.transsnet.adsdk.interfaces.IMultipleUpdateListener
    public void dataUpdate(boolean z3, List list) {
        BannerAdView.fetchData$lambda$12(this.f25615a, z3, list);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean z3) {
        BannerAdView.fetchData$lambda$11(this.f25615a, z3);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        BannerAdView.fetchData$lambda$5(this.f25615a, observableEmitter);
    }
}
