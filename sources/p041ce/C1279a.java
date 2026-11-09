package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ce.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1279a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f18918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f18920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279a(CommonResult commonResult, Continuation continuation, Function1 function1, Function1 function2) {
        super(2, continuation);
        this.f18918a = commonResult;
        this.f18919b = function1;
        this.f18920c = function2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1279a(this.f18918a, continuation, this.f18919b, this.f18920c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1279a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f18918a;
        if (commonBeanResult.isSuccess()) {
            this.f18919b.invoke(commonBeanResult.data);
        } else {
            String respMsg = commonBeanResult.getRespMsg();
            if (respMsg == null) {
                respMsg = "";
            }
            this.f18920c.invoke(respMsg);
        }
        return Unit.f38893a;
    }
}
