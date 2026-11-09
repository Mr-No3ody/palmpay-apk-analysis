package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: j0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1788v extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f38153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788v(F f10, Continuation continuation) {
        super(1, continuation);
        this.f38153b = f10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1788v(this.f38153b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1788v) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38152a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        this.f38152a = 1;
        Object objInvoke = this.f38153b.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
