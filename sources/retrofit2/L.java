package retrofit2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f41876a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f41877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f41878c;

    public L(N n10, Class cls) {
        this.f41878c = n10;
        this.f41877b = cls;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object objA;
        Object obj2;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f41876a;
        }
        Object[] objArr2 = objArr;
        C1983a c1983a = F.f41820b;
        boolean zE = c1983a.e(method);
        Class cls = this.f41877b;
        if (zE) {
            return c1983a.d(method, cls, obj, objArr2);
        }
        N n10 = this.f41878c;
        while (true) {
            Object objPutIfAbsent = n10.f41883a.get(method);
            if (!(objPutIfAbsent instanceof O)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = n10.f41883a.get(method);
                        if (obj2 == null) {
                            objA = (O) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = n10.f41883a.putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = n10.f41883a.get(method);
                                        if (obj2 == null) {
                                            objA = (O) obj2;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                break;
                            }
                            try {
                                objA = O.a(n10, cls, method);
                                n10.f41883a.put(method, objA);
                                break;
                            } catch (Throwable th2) {
                                n10.f41883a.remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                objA = (O) objPutIfAbsent;
                break;
            }
        }
        AbstractC1997o abstractC1997o = (AbstractC1997o) objA;
        return abstractC1997o.b(new C2002u(abstractC1997o.f41939a, obj, objArr2, abstractC1997o.f41940b, abstractC1997o.f41941c), objArr2);
    }
}
