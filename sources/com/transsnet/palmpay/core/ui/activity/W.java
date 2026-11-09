package com.transsnet.palmpay.core.ui.activity;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiPayOneClickOpenActivity f27730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ILoanBankSilentAuthService f27731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(FlexiPayOneClickOpenActivity flexiPayOneClickOpenActivity, ILoanBankSilentAuthService iLoanBankSilentAuthService, Continuation continuation) {
        super(2, continuation);
        this.f27730b = flexiPayOneClickOpenActivity;
        this.f27731c = iLoanBankSilentAuthService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new W(this.f27730b, this.f27731c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f27729a;
        FlexiPayOneClickOpenActivity flexiPayOneClickOpenActivity = this.f27730b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            flexiPayOneClickOpenActivity.showLoadingDialog(true);
            p042cg.f fVar = Wf.I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            V v3 = new V(this.f27731c, null);
            this.f27729a = 1;
            obj = AbstractC0780y.s(eVar, v3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        flexiPayOneClickOpenActivity.showLoadingDialog(false);
        if (flexiPayOneClickOpenActivity.isFinishing()) {
            return Unit.f38893a;
        }
        if (zBooleanValue) {
            flexiPayOneClickOpenActivity.r();
        } else {
            FlexiPayOneClickOpenActivity.o(flexiPayOneClickOpenActivity, 0, null, null, 6);
        }
        return Unit.f38893a;
    }
}
