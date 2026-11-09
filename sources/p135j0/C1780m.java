package p135j0;

import Ff.h;
import O2.a;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InterProcessCoordinator;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.sync.Mutex;
import p072eg.e;

/* JADX INFO: renamed from: j0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1780m extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f38093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f38095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f38096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38098g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O f38099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f38100j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1780m(O o10, a aVar, Continuation continuation) {
        super(1, continuation);
        this.f38099i = o10;
        this.f38100j = aVar;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1780m(this.f38099i, this.f38100j, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1780m) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a3->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Mutex eVar;
        B b7;
        F f10;
        F f11;
        Mutex mutex;
        Iterator it;
        Mutex mutex2;
        B b10;
        F f12;
        C1779l c1779l;
        F f13;
        B b11;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Object version;
        int i7;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f38098g;
        a aVar2 = this.f38100j;
        O o10 = this.f38099i;
        if (i10 == 0) {
            g.M(obj);
            eVar = new e();
            b7 = new B();
            f10 = new F();
            this.f38092a = eVar;
            this.f38093b = b7;
            this.f38094c = f10;
            this.f38095d = f10;
            this.f38098g = 1;
            obj = O.e(o10, true, this);
            if (obj != aVar) {
                f11 = f10;
            }
            return aVar;
        }
        if (i10 == 1) {
            f10 = (F) this.f38095d;
            f11 = (F) this.f38094c;
            b7 = (B) this.f38093b;
            eVar = (Mutex) this.f38092a;
            g.M(obj);
        } else {
            if (i10 == 2) {
                it = this.f38096e;
                c1779l = (C1779l) this.f38095d;
                f12 = (F) this.f38094c;
                b10 = (B) this.f38093b;
                mutex2 = (Mutex) this.f38092a;
                g.M(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.f38092a = mutex2;
                    this.f38093b = b10;
                    this.f38094c = f12;
                    this.f38095d = c1779l;
                    this.f38096e = it;
                    this.f38098g = 2;
                    if (function2.invoke(c1779l, this) == aVar) {
                        return aVar;
                    }
                }
                f11 = f12;
                b7 = b10;
                mutex = mutex2;
                aVar2.f6555c = null;
                this.f38092a = b7;
                this.f38093b = f11;
                this.f38094c = mutex;
                this.f38095d = null;
                this.f38096e = null;
                this.f38098g = 3;
                if (mutex.lock(null, this) != aVar) {
                    f13 = f11;
                    b11 = b7;
                    b11.f38947a = true;
                    Unit unit = Unit.f38893a;
                    mutex.unlock(null);
                    obj2 = f13.f38951a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    int i11 = O.f37960m;
                    InterProcessCoordinator interProcessCoordinatorF = o10.f();
                    this.f38092a = obj2;
                    this.f38093b = null;
                    this.f38094c = null;
                    this.f38097f = iHashCode;
                    this.f38098g = 4;
                    version = interProcessCoordinatorF.getVersion(this);
                    if (version != aVar) {
                        i7 = iHashCode;
                        obj = version;
                    }
                }
                return aVar;
            }
            if (i10 == 3) {
                mutex = (Mutex) this.f38094c;
                f13 = (F) this.f38093b;
                b11 = (B) this.f38092a;
                g.M(obj);
                try {
                    b11.f38947a = true;
                    Unit unit2 = Unit.f38893a;
                    mutex.unlock(null);
                    obj2 = f13.f38951a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    int i12 = O.f37960m;
                    InterProcessCoordinator interProcessCoordinatorF2 = o10.f();
                    this.f38092a = obj2;
                    this.f38093b = null;
                    this.f38094c = null;
                    this.f38097f = iHashCode;
                    this.f38098g = 4;
                    version = interProcessCoordinatorF2.getVersion(this);
                    if (version != aVar) {
                        i7 = iHashCode;
                        obj = version;
                    }
                    return aVar;
                } catch (Throwable th) {
                    mutex.unlock(null);
                    throw th;
                }
            }
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f38097f;
            obj2 = this.f38092a;
            g.M(obj);
        }
        return new C1769b(obj2, i7, ((Number) obj).intValue());
        f10.f38951a = ((C1769b) obj).f38013b;
        C1779l c1779l2 = new C1779l(eVar, b7, f11, o10);
        List list = (List) aVar2.f6555c;
        if (list != null) {
            it = list.iterator();
            mutex2 = eVar;
            b10 = b7;
            f12 = f11;
            c1779l = c1779l2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.f38092a = mutex2;
                this.f38093b = b10;
                this.f38094c = f12;
                this.f38095d = c1779l;
                this.f38096e = it;
                this.f38098g = 2;
                if (function2.invoke(c1779l, this) == aVar) {
                    return aVar;
                }
            }
            f11 = f12;
            b7 = b10;
            mutex = mutex2;
        } else {
            mutex = eVar;
        }
        aVar2.f6555c = null;
        this.f38092a = b7;
        this.f38093b = f11;
        this.f38094c = mutex;
        this.f38095d = null;
        this.f38096e = null;
        this.f38098g = 3;
        if (mutex.lock(null, this) != aVar) {
            f13 = f11;
            b11 = b7;
            b11.f38947a = true;
            Unit unit3 = Unit.f38893a;
            mutex.unlock(null);
            obj2 = f13.f38951a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            int i13 = O.f37960m;
            InterProcessCoordinator interProcessCoordinatorF3 = o10.f();
            this.f38092a = obj2;
            this.f38093b = null;
            this.f38094c = null;
            this.f38097f = iHashCode;
            this.f38098g = 4;
            version = interProcessCoordinatorF3.getVersion(this);
            if (version != aVar) {
                i7 = iHashCode;
                obj = version;
                return new C1769b(obj2, i7, ((Number) obj).intValue());
            }
        }
        return aVar;
    }
}
