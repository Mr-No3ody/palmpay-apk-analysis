package Pe;

import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransHistoryReqV2 f7210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(TransHistoryReqV2 transHistoryReqV2, Continuation continuation) {
        super(1, continuation);
        this.f7210b = transHistoryReqV2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new W(this.f7210b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((W) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7209a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f7209a = 1;
        Object objQueryWardBillList = iApiMainService.queryWardBillList(this.f7210b, this);
        return objQueryWardBillList == aVar ? aVar : objQueryWardBillList;
    }
}
