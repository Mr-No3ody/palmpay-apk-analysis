package com.transsnet.adsdk.widgets.banner;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerAdView f25626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BannerAdView bannerAdView, Continuation continuation) {
        super(continuation);
        this.f25626b = bannerAdView;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f25625a = obj;
        this.f25627c |= Integer.MIN_VALUE;
        return this.f25626b.fetchDataWithCoroutine(this);
    }
}
