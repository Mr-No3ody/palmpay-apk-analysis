package com.transsnet.adsdk.widgets;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IDataUpdateListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function, ObservableOnSubscribe, IRemoteDataListener, IDataUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25635a;

    public /* synthetic */ c(SingleAdView singleAdView) {
        this.f25635a = singleAdView;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return SingleAdView.fetchData$lambda$12(this.f25635a, (Boolean) obj);
    }

    @Override // com.transsnet.adsdk.interfaces.IDataUpdateListener
    public void dataUpdate(boolean z3, AdEntity adEntity) {
        SingleAdView.fetchData$lambda$16(this.f25635a, z3, adEntity);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean z3) {
        SingleAdView.fetchData$lambda$14(this.f25635a, z3);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        SingleAdView.fetchData$lambda$3(this.f25635a, observableEmitter);
    }
}
