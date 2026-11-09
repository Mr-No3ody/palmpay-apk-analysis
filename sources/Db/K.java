package Db;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.ui.viewmodel.UnfreezeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnfreezeViewModel f1791a;

    public K(UnfreezeViewModel unfreezeViewModel) {
        this.f1791a = unfreezeViewModel;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, xf.u] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        com.transsnet.palmpay.core.base.l lVar = this.f1791a.f30706e;
        CommonBeanResult commonBeanResult = new CommonBeanResult();
        commonBeanResult.setRespCode("00000000");
        commonBeanResult.data = (p355xf.u) obj;
        lVar.k(new com.transsnet.palmpay.core.base.p(commonBeanResult));
        return Unit.f38893a;
    }
}
