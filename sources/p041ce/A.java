package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelBillerTipsInfo f18905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f18906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Continuation continuation, ModelBillerTipsInfo modelBillerTipsInfo, Function0 function0) {
        super(2, continuation);
        this.f18905b = modelBillerTipsInfo;
        this.f18906c = function0;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        A a3 = new A(continuation, this.f18905b, this.f18906c);
        a3.f18904a = obj;
        return a3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((CommonResult) this.f18904a);
        if (commonListResultV2 != null && commonListResultV2.isSuccess()) {
            this.f18905b.f34344e = commonListResultV2.data;
            this.f18906c.invoke();
        }
        return Unit.f38893a;
    }
}
