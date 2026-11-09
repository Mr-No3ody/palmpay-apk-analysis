package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InterProcessCoordinator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class E extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f37923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f37924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o10, int i7, Continuation continuation) {
        super(2, continuation);
        this.f37924d = o10;
        this.f37925e = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        E e10 = new E(this.f37924d, this.f37925e, continuation);
        e10.f37923c = ((Boolean) obj).booleanValue();
        return e10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        Object obj2;
        int iIntValue;
        int iHashCode;
        a aVar = a.f2423a;
        int i7 = this.f37922b;
        O o10 = this.f37924d;
        if (i7 == 0) {
            g.M(obj);
            z3 = this.f37923c;
            this.f37923c = z3;
            this.f37922b = 1;
            int i10 = O.f37960m;
            obj = o10.h(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i7 == 1) {
            z3 = this.f37923c;
            g.M(obj);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f37921a;
            g.M(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C1769b(obj2, iHashCode, iIntValue);
        if (z3) {
            int i11 = O.f37960m;
            InterProcessCoordinator interProcessCoordinatorF = o10.f();
            this.f37921a = obj;
            this.f37922b = 2;
            Object version = interProcessCoordinatorF.getVersion(this);
            if (version != aVar) {
                obj2 = obj;
                obj = version;
                iIntValue = ((Number) obj).intValue();
            }
            return aVar;
        }
        obj2 = obj;
        iIntValue = this.f37925e;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C1769b(obj2, iHashCode, iIntValue);
    }
}
