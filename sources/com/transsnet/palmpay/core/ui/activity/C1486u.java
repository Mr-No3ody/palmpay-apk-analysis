package com.transsnet.palmpay.core.ui.activity;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonClaimRewardActivity f27811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1486u(CommonClaimRewardActivity commonClaimRewardActivity, Continuation continuation) {
        super(2, continuation);
        this.f27811a = commonClaimRewardActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1486u(this.f27811a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1486u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f27811a.showLoadingDialog(true);
        return Unit.f38893a;
    }
}
