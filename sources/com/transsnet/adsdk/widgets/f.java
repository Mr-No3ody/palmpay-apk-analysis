package com.transsnet.adsdk.widgets;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SingleAdView singleAdView, Continuation continuation) {
        super(2, continuation);
        this.f25639a = singleAdView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f25639a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f25639a.postLoadFailResult();
        return Unit.f38893a;
    }
}
