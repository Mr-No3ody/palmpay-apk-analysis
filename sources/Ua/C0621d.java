package Ua;

import com.transsnet.palmpay.core.bean.req.CheckModifyBankCardReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ua.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0621d extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckModifyBankCardReq f9391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621d(CheckModifyBankCardReq checkModifyBankCardReq, Continuation continuation) {
        super(1, continuation);
        this.f9391b = checkModifyBankCardReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0621d(this.f9391b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0621d) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9390a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        this.f9390a = 1;
        Object objCheckModifyBankCard = accountApiService.checkModifyBankCard(this.f9391b, this);
        return objCheckModifyBankCard == aVar ? aVar : objCheckModifyBankCard;
    }
}
