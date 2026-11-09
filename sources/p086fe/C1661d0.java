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

/* JADX INFO: renamed from: fe.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1661d0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1661d0(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36633b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1661d0 c1661d0 = new C1661d0(this.f36633b, continuation);
        c1661d0.f36632a = obj;
        return c1661d0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1661d0) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f36633b, (CommonResult) this.f36632a);
        return Unit.f38893a;
    }
}
