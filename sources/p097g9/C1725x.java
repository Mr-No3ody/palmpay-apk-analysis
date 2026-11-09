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

/* JADX INFO: renamed from: g9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1725x extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f37002b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725x(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f37002b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1725x c1725x = new C1725x(this.f37002b, continuation);
        c1725x.f37001a = obj;
        return c1725x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1725x) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f37002b, (CommonResult) this.f37001a);
        return Unit.f38893a;
    }
}
