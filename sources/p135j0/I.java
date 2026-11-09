package p135j0;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f37938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f37939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f37940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(O o10, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f37938c = o10;
        this.f37939d = coroutineContext;
        this.f37940e = function2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new I(this.f37938c, this.f37939d, this.f37940e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((I) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1769b c1769b;
        Object obj2;
        int iHashCode;
        a aVar = a.f2423a;
        int i7 = this.f37937b;
        O o10 = this.f37938c;
        if (i7 == 0) {
            g.M(obj);
            this.f37937b = 1;
            obj = O.e(o10, true, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i7 == 1) {
            g.M(obj);
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = this.f37936a;
                g.M(obj);
                return obj3;
            }
            c1769b = (C1769b) this.f37936a;
            g.M(obj);
        }
        obj2 = c1769b.f38013b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == c1769b.f38014c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!Intrinsics.c(c1769b.f38013b, obj)) {
            this.f37936a = obj;
            this.f37937b = 3;
            if (o10.i(obj, true, this) == aVar) {
                return aVar;
            }
        }
        return obj;
        c1769b = (C1769b) obj;
        H h7 = new H(this.f37940e, c1769b, null);
        this.f37936a = c1769b;
        this.f37937b = 2;
        obj = AbstractC0780y.s(this.f37939d, h7, this);
        if (obj != aVar) {
            obj2 = c1769b.f38013b;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == c1769b.f38014c) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!Intrinsics.c(c1769b.f38013b, obj)) {
                this.f37936a = obj;
                this.f37937b = 3;
                if (o10.i(obj, true, this) == aVar) {
                }
            }
            return obj;
        }
        return aVar;
    }
}
