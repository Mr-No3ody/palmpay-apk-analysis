package p183m6;

import Ef.a;
import Ff.h;
import Wf.u0;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f39489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f39490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f39491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(E e10, f fVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f39489b = e10;
        this.f39490c = fVar;
        this.f39491d = eVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f39489b, this.f39490c, this.f39491d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f39488a;
        if (i7 == 0) {
            g.M(obj);
            c cVar = new c(this.f39489b, this.f39490c, this.f39491d, null);
            this.f39488a = 1;
            u0 u0Var = new u0(getContext(), this, 0);
            Object objJ = l.J(u0Var, u0Var, cVar);
            if (objJ == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (objJ == aVar) {
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
