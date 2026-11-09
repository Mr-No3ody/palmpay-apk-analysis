package com.transsnet.adsdk.widgets.Interstitial;

import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdShowCallback f25576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdView f25578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterstitialAdView interstitialAdView, Continuation continuation) {
        super(continuation);
        this.f25578c = interstitialAdView;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f25577b = obj;
        this.f25579d |= Integer.MIN_VALUE;
        return this.f25578c.fetchDataWithCoroutine(null, this);
    }
}
