package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0410r1 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferCreateOrderReq f5368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410r1(TransferCreateOrderReq transferCreateOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f5368b = transferCreateOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0410r1(this.f5368b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0410r1) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5367a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5367a = 1;
        Object objCreateOrderMvvm = sendMoneyApiService.createOrderMvvm(this.f5368b, this);
        return objCreateOrderMvvm == aVar ? aVar : objCreateOrderMvvm;
    }
}
