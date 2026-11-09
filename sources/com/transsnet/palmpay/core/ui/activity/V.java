package com.transsnet.palmpay.core.ui.activity;

import com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class V extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ILoanBankSilentAuthService f27725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ILoanBankSilentAuthService iLoanBankSilentAuthService, Continuation continuation) {
        super(2, continuation);
        this.f27725b = iLoanBankSilentAuthService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.f27725b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f27724a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f27724a = 1;
        Object objEnsure = this.f27725b.ensure(this);
        return objEnsure == aVar ? aVar : objEnsure;
    }
}
