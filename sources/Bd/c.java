package Bd;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.api.kkcar.IApiKkCarService;
import com.transsnet.palmpay.send_money.bean.req.kkcar.GetQrCodePollOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Continuation continuation) {
        super(2, continuation);
        this.f899c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f899c, continuation);
        cVar.f898b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f897a;
        try {
            if (i7 == 0) {
                g.M(obj);
                String str = this.f899c;
                o oVar = q.f43977a;
                IApiKkCarService iApiKkCarService = (IApiKkCarService) p188md.a.f39647a.f139b;
                GetQrCodePollOrderReq getQrCodePollOrderReq = new GetQrCodePollOrderReq(str);
                this.f897a = 1;
                obj = iApiKkCarService.getQrCodePollOrder(getQrCodePollOrderReq, this);
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
        if (objF instanceof p) {
            return null;
        }
        return objF;
    }
}
