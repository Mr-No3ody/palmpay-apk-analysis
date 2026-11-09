package p310ub;

import C0.G;
import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.credit.bean.req.TriggerFullExemptionReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p221ob.c;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TriggerFullExemptionReq f42812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(TriggerFullExemptionReq triggerFullExemptionReq, Continuation continuation) {
        super(2, continuation);
        this.f42812b = triggerFullExemptionReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y0(this.f42812b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f42811a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        this.f42811a = 1;
        Object objTriggerFullExemption = iApiCreditServiceH.triggerFullExemption(this.f42812b, this);
        return objTriggerFullExemption == aVar ? aVar : objTriggerFullExemption;
    }
}
