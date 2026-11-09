package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: j0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1782o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f38109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1782o(O o10, Continuation continuation) {
        super(2, continuation);
        this.f38109b = o10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1782o(this.f38109b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1782o) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38108a;
        if (i7 == 0) {
            g.M(obj);
            this.f38108a = 1;
            if (O.c(this.f38109b, this) == aVar) {
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
