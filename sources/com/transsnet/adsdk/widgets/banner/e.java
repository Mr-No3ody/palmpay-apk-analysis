package com.transsnet.adsdk.widgets.banner;

import Ff.h;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerAdView f25630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BannerAdView bannerAdView, List list, Continuation continuation) {
        super(2, continuation);
        this.f25630a = bannerAdView;
        this.f25631b = list;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f25630a, this.f25631b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f25630a.showData(this.f25631b);
        return Unit.f38893a;
    }
}
