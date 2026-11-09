package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InterProcessCoordinator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class B extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f37904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f37906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o10, Continuation continuation) {
        super(1, continuation);
        this.f37906c = o10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new B(this.f37906c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((B) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        w0 n0Var;
        a aVar = a.f2423a;
        int i7 = this.f37905b;
        O o10 = this.f37906c;
        try {
            if (i7 == 0) {
                g.M(obj);
                this.f37905b = 1;
                obj = O.e(o10, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.f37904a;
                    g.M(obj);
                    n0Var = new n0(((Number) obj).intValue(), th);
                    return new Pair(n0Var, Boolean.TRUE);
                }
                g.M(obj);
            }
            n0Var = (w0) obj;
        } catch (Throwable th2) {
            int i10 = O.f37960m;
            InterProcessCoordinator interProcessCoordinatorF = o10.f();
            this.f37904a = th2;
            this.f37905b = 2;
            Object version = interProcessCoordinatorF.getVersion(this);
            if (version != aVar) {
                th = th2;
                obj = version;
            }
            return aVar;
        }
        return new Pair(n0Var, Boolean.TRUE);
    }
}
