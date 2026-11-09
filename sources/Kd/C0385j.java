package Kd;

import com.transsnet.palmpay.send_money.api.kkcar.IApiKkCarService;
import com.transsnet.palmpay.send_money.bean.req.kkcar.QrCodeOrderResultReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Kd.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0385j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385j(String str, Continuation continuation) {
        super(2, continuation);
        this.f5286c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0385j c0385j = new C0385j(this.f5286c, continuation);
        c0385j.f5285b = obj;
        return c0385j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0385j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5284a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                String str = this.f5286c;
                p355xf.o oVar = p355xf.q.f43977a;
                IApiKkCarService iApiKkCarService = (IApiKkCarService) p188md.a.f39647a.f139b;
                QrCodeOrderResultReq qrCodeOrderResultReq = new QrCodeOrderResultReq(str);
                this.f5284a = 1;
                obj = iApiKkCarService.qrCodeOrderResult(qrCodeOrderResultReq, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            p355xf.o oVar2 = p355xf.q.f43977a;
        } catch (Throwable th) {
            p355xf.o oVar3 = p355xf.q.f43977a;
            androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return Unit.f38893a;
    }
}
