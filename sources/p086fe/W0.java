package p086fe;

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
public final class W0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36601b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        W0 w3 = new W0(this.f36601b, continuation);
        w3.f36600a = obj;
        return w3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W0) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.B(this.f36601b, (CommonResult) this.f36600a);
        return Unit.f38893a;
    }
}
