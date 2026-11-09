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

/* JADX INFO: renamed from: fe.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1682o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682o(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36703b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1682o c1682o = new C1682o(this.f36703b, continuation);
        c1682o.f36702a = obj;
        return c1682o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1682o) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f36703b, (CommonResult) this.f36702a);
        return Unit.f38893a;
    }
}
