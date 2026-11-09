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

/* JADX INFO: renamed from: g9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1720s extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720s(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f36986b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1720s c1720s = new C1720s(this.f36986b, continuation);
        c1720s.f36985a = obj;
        return c1720s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1720s) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.C(this.f36986b, (CommonResult) this.f36985a);
        return Unit.f38893a;
    }
}
