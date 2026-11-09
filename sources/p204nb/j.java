package p204nb;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p221ob.c;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39895a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f39895a;
        try {
            if (i7 == 0) {
                g.M(obj);
                c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = c.a();
                this.f39895a = 1;
                obj = iApiCreditServiceA.mfbMemberMappingInitialize(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            CommonResult commonResult = (CommonResult) obj;
            return new b(commonResult.getRespMsg(), "00000000".equals(commonResult.getRespCode()), false);
        } catch (Exception e10) {
            return new b(null, false, q.a(e10));
        }
    }
}
