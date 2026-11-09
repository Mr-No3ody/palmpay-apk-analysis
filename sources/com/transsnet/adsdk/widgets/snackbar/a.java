package com.transsnet.adsdk.widgets.snackbar;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ObservableOnSubscribe, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25653a;

    public /* synthetic */ a(SnackBarAdView snackBarAdView) {
        this.f25653a = snackBarAdView;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return SnackBarAdView.fetchData$lambda$6(this.f25653a, (Boolean) obj);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        SnackBarAdView.fetchData$lambda$1(this.f25653a, observableEmitter);
    }
}
