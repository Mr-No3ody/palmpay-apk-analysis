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

/* JADX INFO: renamed from: fe.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1667g0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667g0(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36652b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1667g0 c1667g0 = new C1667g0(this.f36652b, continuation);
        c1667g0.f36651a = obj;
        return c1667g0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1667g0) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.B(this.f36652b, (CommonResult) this.f36651a);
        return Unit.f38893a;
    }
}
