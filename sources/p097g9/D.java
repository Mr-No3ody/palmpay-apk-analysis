package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36895b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        D d2 = new D(this.f36895b, continuation);
        d2.f36894a = obj;
        return d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f36895b, (CommonResult) this.f36894a);
        return Unit.f38893a;
    }
}
