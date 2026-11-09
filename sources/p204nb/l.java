package p204nb;

import Ef.a;
import F6.d;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p221ob.c;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39898b;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(2, continuation);
        lVar.f39898b = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        a aVar = a.f2423a;
        int i7 = this.f39897a;
        try {
            if (i7 == 0) {
                g.M(obj);
                o oVar = q.f43977a;
                c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = c.a();
                this.f39897a = 1;
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
            d.c("LoanBankSilentAuth", "querySignedProtocol failed", thA);
        }
        LoanEnterPreCheckInfo loanEnterPreCheckInfo = null;
        if (objF instanceof p) {
            objF = null;
        }
        CommonBeanResult commonBeanResult = (CommonBeanResult) objF;
        if (commonBeanResult != null) {
            if (!commonBeanResult.isSuccess()) {
                commonBeanResult = null;
            }
            if (commonBeanResult != null) {
                loanEnterPreCheckInfo = (LoanEnterPreCheckInfo) commonBeanResult.data;
            }
        }
        if (loanEnterPreCheckInfo == null) {
            return Boolean.FALSE;
        }
        b.c(loanEnterPreCheckInfo.rnEnabled, loanEnterPreCheckInfo.rnNewEnabled, loanEnterPreCheckInfo.newVersionEnabled, loanEnterPreCheckInfo.useNewDomain);
        d.h("LoanBankSilentAuth", 3, "querySignedProtocol rnEnabled=" + loanEnterPreCheckInfo.rnEnabled + ", rnNewEnabled=" + loanEnterPreCheckInfo.rnNewEnabled + ", useNewDomain=" + loanEnterPreCheckInfo.useNewDomain + ", bank=" + b.y());
        return Boolean.TRUE;
    }
}
