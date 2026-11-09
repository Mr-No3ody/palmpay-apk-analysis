package Ma;

import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.mvvm.CoreWithdrawalViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreWithdrawalViewModel f5904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CoreWithdrawalViewModel coreWithdrawalViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5904b = coreWithdrawalViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(this.f5904b, continuation);
        mVar.f5903a = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((PayByOrderResp) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.C(this.f5904b.f28068e, (PayByOrderResp) this.f5903a);
        return Unit.f38893a;
    }
}
