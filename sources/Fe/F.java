package Fe;

import Pa.C0525w;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonResult f2729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, CommonResult commonResult, Continuation continuation) {
        super(2, continuation);
        this.f2728a = str;
        this.f2729b = commonResult;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new F(this.f2728a, this.f2729b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Pa.H.c(BaseApplication.getInstance()).g(this.f2728a, ((Gson) C0525w.f().f7166b).toJson(this.f2729b));
        return Unit.f38893a;
    }
}
