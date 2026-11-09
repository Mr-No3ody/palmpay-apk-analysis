package p130ic;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f37533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f37533b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.f37533b, continuation);
        oVar.f37532a = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f37533b, (CommonResult) this.f37532a);
        return Unit.f38893a;
    }
}
