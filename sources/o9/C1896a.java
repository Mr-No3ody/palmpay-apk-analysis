package o9;

import com.transsnet.palmpay.airtime.bean.req.AirtimePreOrderCancelReq;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1896a extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AirtimePreOrderCancelReq f40155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1896a(AirtimePreOrderCancelReq airtimePreOrderCancelReq, Continuation continuation) {
        super(1, continuation);
        this.f40155b = airtimePreOrderCancelReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1896a(this.f40155b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1896a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40154a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40154a = 1;
        Object objCancelPreOrder = iAirtimeService.cancelPreOrder(this.f40155b, this);
        return objCancelPreOrder == aVar ? aVar : objCancelPreOrder;
    }
}
