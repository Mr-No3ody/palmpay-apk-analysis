package com.transsnet.adsdk.widgets.Interstitial;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdView f25582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdEntity f25583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterstitialAdView interstitialAdView, AdEntity adEntity, AdShowCallback adShowCallback, Continuation continuation) {
        super(2, continuation);
        this.f25582a = interstitialAdView;
        this.f25583b = adEntity;
        this.f25584c = adShowCallback;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f25582a, this.f25583b, this.f25584c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        AdEntity adEntity = this.f25583b;
        InterstitialAdView interstitialAdView = this.f25582a;
        interstitialAdView.mAdData = adEntity;
        interstitialAdView.showAd(interstitialAdView.weakContext, this.f25584c);
        return Unit.f38893a;
    }
}
