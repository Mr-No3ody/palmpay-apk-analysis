package p098ga;

import Ef.a;
import Ff.h;
import Pa.I;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.apm.network.NQEManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f37029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f37030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f37031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function1 function1, Function1 function2, Function1 function3, Continuation continuation) {
        super(2, continuation);
        this.f37029c = (h) function1;
        this.f37030d = function2;
        this.f37031e = function3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f37029c, this.f37030d, this.f37031e, continuation);
        eVar.f37028b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37027a;
        try {
            if (i7 == 0) {
                g.M(obj);
                if (NQEManager.INSTANCE.isNetworkOffline()) {
                    return Unit.f38893a;
                }
                ?? r10 = this.f37029c;
                o oVar = q.f43977a;
                AbstractC0774s abstractC0774s = I.f7021a;
                d dVar = new d(r10, null);
                this.f37027a = 1;
                obj = AbstractC0780y.s(abstractC0774s, dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            o oVar2 = q.f43977a;
        } catch (Throwable th) {
            o oVar3 = q.f43977a;
            obj = g.f(th);
        }
        if (!(obj instanceof p)) {
            this.f37030d.invoke(obj);
        }
        Throwable thA = q.a(obj);
        if (thA != null) {
            this.f37031e.invoke(b.W(thA));
        }
        return Unit.f38893a;
    }
}
