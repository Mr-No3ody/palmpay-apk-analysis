package p253qb;

import F6.d;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.rnbridge.LoanCreditApplyBridge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p221ob.c;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41470b;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(2, continuation);
        aVar.f41470b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f41469a;
        try {
            if (i7 == 0) {
                g.M(obj);
                o oVar = q.f43977a;
                c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = c.a();
                this.f41469a = 1;
                obj = iApiCreditServiceA.loanEnterPreCheckForMvvm(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            objF = (CommonBeanResult) obj;
            o oVar2 = q.f43977a;
        } catch (Throwable th) {
            o oVar3 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(LoanCreditApplyBridge.TAG, "querySignedProtocol failed", thA);
        }
        if (objF instanceof p) {
            return null;
        }
        return objF;
    }
}
