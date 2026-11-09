package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class L extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f37948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o10, Continuation continuation) {
        super(2, continuation);
        this.f37948c = o10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        L l5 = new L(this.f37948c, continuation);
        l5.f37947b = obj;
        return l5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((b0) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37946a;
        if (i7 == 0) {
            g.M(obj);
            b0 b0Var = (b0) this.f37947b;
            this.f37946a = 1;
            if (O.b(this.f37948c, b0Var, this) == aVar) {
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
