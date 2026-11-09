package Kd;

import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0358a extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckBankCardInfoReq f5188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358a(CheckBankCardInfoReq checkBankCardInfoReq, Continuation continuation) {
        super(1, continuation);
        this.f5188b = checkBankCardInfoReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0358a(this.f5188b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0358a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5187a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        this.f5187a = 1;
        Object objCheckInputBankInfoMvvm = accountApiService.checkInputBankInfoMvvm(this.f5188b, this);
        return objCheckInputBankInfoMvvm == aVar ? aVar : objCheckInputBankInfoMvvm;
    }
}
