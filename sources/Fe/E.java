package Fe;

import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.HomeMePageMenuRsp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f2727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String str, Continuation continuation, I i7) {
        super(2, continuation);
        this.f2726b = str;
        this.f2727c = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.f2726b, continuation, this.f2727c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2725a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            String strD = Pa.H.c(BaseApplication.getInstance()).d(this.f2726b);
            if (!TextUtils.isEmpty(strD)) {
                Object objL = com.horcrux.svg.d0.l(HomeMePageMenuRsp.class, strD);
                if (objL instanceof CommonResult) {
                    ((CommonResult) objL).markParseFromCache(true);
                    p042cg.f fVar = Wf.I.f10809a;
                    Wf.p0 p0Var = p015ag.o.f11960a;
                    C c6 = new C((CommonResult) objL, null, this.f2727c);
                    this.f2725a = 1;
                    if (AbstractC0780y.s(p0Var, c6, this) != aVar) {
                    }
                }
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AbstractC0774s abstractC0774s = Pa.I.f7021a;
        D d2 = new D(2, null);
        this.f2725a = 2;
        Object objS = AbstractC0780y.s(abstractC0774s, d2, this);
        return objS == aVar ? aVar : objS;
    }
}
