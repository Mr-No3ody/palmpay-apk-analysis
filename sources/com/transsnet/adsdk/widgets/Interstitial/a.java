package com.transsnet.adsdk.widgets.Interstitial;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ObservableOnSubscribe, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdView f25575a;

    public /* synthetic */ a(InterstitialAdView interstitialAdView) {
        this.f25575a = interstitialAdView;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return InterstitialAdView.fetchData$lambda$13(this.f25575a, (Boolean) obj);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        InterstitialAdView.fetchData$lambda$8(this.f25575a, observableEmitter);
    }
}
