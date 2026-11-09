package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.ReadScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final class r extends h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38123a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38125c;

    public /* synthetic */ r(int i7, Continuation continuation) {
        super(i7, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f38123a) {
            case 0:
                return new r((O) this.f38125c, (Continuation) obj3).invokeSuspend(Unit.f38893a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (Continuation) obj3);
                rVar.f38125c = (ReadScope) obj;
                return rVar.invokeSuspend(Unit.f38893a);
        }
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f38123a) {
            case 0:
                a aVar = a.f2423a;
                int i7 = this.f38124b;
                if (i7 == 0) {
                    g.M(obj);
                    this.f38124b = 1;
                    if (O.a((O) this.f38125c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.M(obj);
                }
                return Unit.f38893a;
            default:
                a aVar2 = a.f2423a;
                int i10 = this.f38124b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.M(obj);
                    return obj;
                }
                g.M(obj);
                ReadScope readScope = (ReadScope) this.f38125c;
                this.f38124b = 1;
                Object data = readScope.readData(this);
                return data == aVar2 ? aVar2 : data;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(O o10, Continuation continuation) {
        super(3, continuation);
        this.f38125c = o10;
    }
}
