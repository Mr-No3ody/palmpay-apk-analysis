package com.transsnet.adsdk.widgets.Interstitial;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdView f25580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterstitialAdView interstitialAdView, AdShowCallback adShowCallback, Continuation continuation) {
        super(2, continuation);
        this.f25580a = interstitialAdView;
        this.f25581b = adShowCallback;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f25580a, this.f25581b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        InterstitialAdView interstitialAdView = this.f25580a;
        interstitialAdView.showAd(interstitialAdView.weakContext, this.f25581b);
        return Unit.f38893a;
    }
}
