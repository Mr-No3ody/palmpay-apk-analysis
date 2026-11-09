package p193n0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f39811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f39811c = function2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f39811c, continuation);
        cVar.f39810b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f39809a;
        if (i7 == 0) {
            g.M(obj);
            g gVar = (g) this.f39810b;
            this.f39809a = 1;
            obj = this.f39811c.invoke(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        g gVar2 = (g) obj;
        Intrinsics.f(gVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) ((b) gVar2).f39808b.f8871b).set(true);
        return gVar2;
    }
}
