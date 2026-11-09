package Yf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SendChannel f11454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SendChannel sendChannel, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f11454c = sendChannel;
        this.f11455d = obj;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        x xVar = new x(this.f11454c, this.f11455d, continuation);
        xVar.f11453b = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11452a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                SendChannel sendChannel = this.f11454c;
                Object obj2 = this.f11455d;
                p355xf.o oVar = p355xf.q.f43977a;
                this.f11452a = 1;
                if (sendChannel.send(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            objF = Unit.f38893a;
            p355xf.o oVar2 = p355xf.q.f43977a;
        } catch (Throwable th) {
            p355xf.o oVar3 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return new v(!(objF instanceof p355xf.p) ? v.f11447b.m69successJP2dKIU(Unit.f38893a) : v.f11447b.m67closedJP2dKIU(p355xf.q.a(objF)));
    }
}
