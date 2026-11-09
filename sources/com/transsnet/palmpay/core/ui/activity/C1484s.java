package com.transsnet.palmpay.core.ui.activity;

import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1484s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1484s(String str, Continuation continuation) {
        super(2, continuation);
        this.f27807b = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1484s(this.f27807b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1484s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f27806a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        String strI = p367ya.a.d().i();
        this.f27806a = 1;
        Object objClaimCommonReward = payApiService.claimCommonReward(this.f27807b, strI, this);
        return objClaimCommonReward == aVar ? aVar : objClaimCommonReward;
    }
}
