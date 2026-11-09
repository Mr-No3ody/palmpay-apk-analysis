package Qc;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Qc.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0574o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxViewModel f7807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0574o(CashBoxViewModel cashBoxViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7807b = cashBoxViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0574o c0574o = new C0574o(this.f7807b, continuation);
        c0574o.f7806a = obj;
        return c0574o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0574o) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Pair pair = (Pair) this.f7806a;
        CommonBeanResult commonBeanResult = (CommonBeanResult) pair.f38891a;
        CashBoxViewModel cashBoxViewModel = this.f7807b;
        if (commonBeanResult != null) {
            cashBoxViewModel.f32741Y.k(new com.transsnet.palmpay.core.base.p(commonBeanResult));
        }
        GetRemindTurnOnAutoSaveResp getRemindTurnOnAutoSaveResp = (GetRemindTurnOnAutoSaveResp) pair.f38892b;
        if (getRemindTurnOnAutoSaveResp != null) {
            cashBoxViewModel.f32753r0.k(new com.transsnet.palmpay.core.base.p(getRemindTurnOnAutoSaveResp));
        }
        return Unit.f38893a;
    }
}
