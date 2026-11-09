package com.transsnet.adsdk.widgets.banner;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerAdView f25632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BannerAdView bannerAdView, Continuation continuation) {
        super(2, continuation);
        this.f25632a = bannerAdView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f25632a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f25632a.fetchData();
        return Unit.f38893a;
    }
}
