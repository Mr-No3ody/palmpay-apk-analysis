package com.transsnet.adsdk.widgets.MarqueeTextView;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarqueeViewV2 f25604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MarqueeViewV2 marqueeViewV2, Continuation continuation) {
        super(2, continuation);
        this.f25604a = marqueeViewV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f25604a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f25604a.setContent();
        return Unit.f38893a;
    }
}
