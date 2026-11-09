package p193n0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f39818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f39818c = (h) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f39818c, continuation);
        jVar.f39817b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((g) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f39816a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f39817b;
            g.M(obj);
            return bVar;
        }
        g.M(obj);
        b bVar2 = new b(G.l(((g) this.f39817b).a()), false);
        this.f39817b = bVar2;
        this.f39816a = 1;
        return this.f39818c.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
