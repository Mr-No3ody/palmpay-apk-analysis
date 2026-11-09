package p135j0;

import Ef.a;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InitializerApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: j0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1779l implements InitializerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mutex f38088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f38089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f38090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f38091d;

    public C1779l(Mutex mutex, B b7, F f10, O o10) {
        this.f38088a = mutex;
        this.f38089b = b7;
        this.f38090c = f10;
        this.f38091d = o10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    public final Object updateData(Function2 function2, Continuation continuation) throws Throwable {
        C1778k c1778k;
        Mutex mutex;
        O o10;
        B b7;
        F f10;
        Mutex mutex2;
        Mutex mutex3;
        O o11;
        Object obj;
        F f11;
        if (continuation instanceof C1778k) {
            c1778k = (C1778k) continuation;
            int i7 = c1778k.f38083i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1778k.f38083i = i7 - Integer.MIN_VALUE;
            } else {
                c1778k = new C1778k(this, continuation);
            }
        } else {
            c1778k = new C1778k(this, continuation);
        }
        Object obj2 = c1778k.f38081f;
        a aVar = a.f2423a;
        int i10 = c1778k.f38083i;
        try {
            if (i10 == 0) {
                g.M(obj2);
                c1778k.f38076a = function2;
                mutex = this.f38088a;
                c1778k.f38077b = mutex;
                B b10 = this.f38089b;
                c1778k.f38078c = b10;
                F f12 = this.f38090c;
                c1778k.f38079d = f12;
                o10 = this.f38091d;
                c1778k.f38080e = o10;
                c1778k.f38083i = 1;
                if (mutex.lock(null, c1778k) != aVar) {
                    b7 = b10;
                    f10 = f12;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c1778k.f38078c;
                    f11 = (F) c1778k.f38077b;
                    mutex2 = (Mutex) c1778k.f38076a;
                    try {
                        g.M(obj2);
                        f11.f38951a = obj;
                        f10 = f11;
                        Object obj3 = f10.f38951a;
                        mutex2.unlock(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                o11 = (O) c1778k.f38078c;
                f10 = (F) c1778k.f38077b;
                mutex3 = (Mutex) c1778k.f38076a;
                try {
                    g.M(obj2);
                    if (!Intrinsics.c(obj2, f10.f38951a)) {
                        c1778k.f38076a = mutex3;
                        c1778k.f38077b = f10;
                        c1778k.f38078c = obj2;
                        c1778k.f38083i = 3;
                        if (o11.i(obj2, false, c1778k) != aVar) {
                            obj = obj2;
                            f11 = f10;
                            mutex2 = mutex3;
                            f11.f38951a = obj;
                            f10 = f11;
                        }
                        return aVar;
                    }
                    mutex2 = mutex3;
                    Object obj4 = f10.f38951a;
                    mutex2.unlock(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            O o12 = c1778k.f38080e;
            f10 = c1778k.f38079d;
            b7 = (B) c1778k.f38078c;
            Mutex mutex4 = (Mutex) c1778k.f38077b;
            Function2 function3 = (Function2) c1778k.f38076a;
            g.M(obj2);
            o10 = o12;
            function2 = function3;
            mutex = mutex4;
            if (b7.f38947a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = f10.f38951a;
            c1778k.f38076a = mutex;
            c1778k.f38077b = f10;
            c1778k.f38078c = o10;
            c1778k.f38079d = null;
            c1778k.f38080e = null;
            c1778k.f38083i = 2;
            Object objInvoke = function2.invoke(obj5, c1778k);
            if (objInvoke != aVar) {
                mutex3 = mutex;
                obj2 = objInvoke;
                o11 = o10;
                if (!Intrinsics.c(obj2, f10.f38951a)) {
                    c1778k.f38076a = mutex3;
                    c1778k.f38077b = f10;
                    c1778k.f38078c = obj2;
                    c1778k.f38083i = 3;
                    if (o11.i(obj2, false, c1778k) != aVar) {
                        obj = obj2;
                        f11 = f10;
                        mutex2 = mutex3;
                        f11.f38951a = obj;
                        f10 = f11;
                    }
                } else {
                    mutex2 = mutex3;
                }
                Object obj6 = f10.f38951a;
                mutex2.unlock(null);
                return obj6;
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
