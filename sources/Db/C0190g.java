package Db;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Db.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0190g extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferCreateOrderReq f1808b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190g(TransferCreateOrderReq transferCreateOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f1808b = transferCreateOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0190g(this.f1808b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0190g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1807a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f1807a = 1;
        Object objCreateOrderMvvm = sendMoneyApiService.createOrderMvvm(this.f1808b, this);
        return objCreateOrderMvvm == aVar ? aVar : objCreateOrderMvvm;
    }
}
