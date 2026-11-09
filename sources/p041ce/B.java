package p041ce;

import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import com.transsnet.palmpay.util.NetworkUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ModelBillerTipsInfo f18910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f18911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, Continuation continuation, String str2, ModelBillerTipsInfo modelBillerTipsInfo, Function0 function0) {
        super(2, continuation);
        this.f18908b = str;
        this.f18909c = str2;
        this.f18910d = modelBillerTipsInfo;
        this.f18911e = function0;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Function0 function0 = this.f18911e;
        return new B(this.f18908b, continuation, this.f18909c, this.f18910d, function0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f18907a;
        if (i7 == 0) {
            g.M(obj);
            if (!NetworkUtils.isConnected()) {
                return Unit.f38893a;
            }
            F f10 = new F();
            f10.f38951a = "";
            T t = new T(new y(this.f18908b, f10, null, this.f18909c));
            f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, e.f19009c), new z(3, null));
            A a3 = new A(null, this.f18910d, this.f18911e);
            this.f18907a = 1;
            if (X.g(c1888u, a3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
