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

/* JADX INFO: renamed from: fe.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1692t0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36756b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1692t0(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36756b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1692t0 c1692t0 = new C1692t0(this.f36756b, continuation);
        c1692t0.f36755a = obj;
        return c1692t0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1692t0) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f36756b, (CommonResult) this.f36755a);
        return Unit.f38893a;
    }
}
