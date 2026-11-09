package L3;

import Ff.h;
import K3.j;
import K3.k;
import K3.l;
import K3.m;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.util.NetworkUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f5546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f5547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(j jVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f5546c = jVar;
        this.f5547d = (h) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f5546c, this.f5547d, continuation);
        bVar.f5545b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Type inference failed for: r6v11, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Throwable e10;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5544a;
        j jVar = this.f5546c;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    g.M(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.M(obj);
                }
                o oVar = q.f43977a;
                if (!(obj instanceof p)) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    jVar.i(new m(obj));
                }
                e10 = q.a(obj);
                if (e10 != null) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    Intrinsics.checkNotNullParameter(e10, "e");
                    jVar.i(new k(D3.a.x(e10)));
                }
                return Unit.f38893a;
            }
            g.M(obj);
            if (!NetworkUtils.isConnected()) {
                return Unit.f38893a;
            }
            ?? r10 = this.f5547d;
            o oVar2 = q.f43977a;
            jVar.k(l.f4934a);
            this.f5545b = null;
            this.f5544a = 2;
            obj = r10.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
            o oVar3 = q.f43977a;
        } catch (Throwable th) {
            o oVar4 = q.f43977a;
            obj = g.f(th);
        }
        if (!(obj instanceof p)) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            jVar.i(new m(obj));
        }
        e10 = q.a(obj);
        if (e10 != null) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            Intrinsics.checkNotNullParameter(e10, "e");
            jVar.i(new k(D3.a.x(e10)));
        }
        return Unit.f38893a;
    }
}
