package Ua;

import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneTimeCodeV5View f9444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(CommonResult commonResult, Continuation continuation, boolean z3, OneTimeCodeV5View oneTimeCodeV5View) {
        super(2, continuation);
        this.f9442a = commonResult;
        this.f9443b = z3;
        this.f9444c = oneTimeCodeV5View;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o0(this.f9442a, continuation, this.f9443b, this.f9444c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) this.f9442a;
        boolean z3 = this.f9443b;
        OneTimeCodeV5View oneTimeCodeV5View = this.f9444c;
        if (z3) {
            int i7 = OneTimeCodeV5View.f28495A;
            oneTimeCodeV5View.m(false);
            oneTimeCodeV5View.o();
        }
        if (commonListResultV2.isSuccess()) {
            oneTimeCodeV5View.f28503o = commonListResultV2.data;
        }
        if (z3) {
            int i10 = OneTimeCodeV5View.f28495A;
            oneTimeCodeV5View.n();
        }
        return Unit.f38893a;
    }
}
