package com.nimbusds.jose.shaded.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f23680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F1.f f23682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V5.c f23683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f23684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23685f;

    public m(com.nimbusds.jose.shaded.gson.internal.f fVar, HashMap map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        w wVar = y.f23724c;
        this.f23680a = new ThreadLocal();
        this.f23681b = new ConcurrentHashMap();
        F1.f fVar2 = new F1.f(map, arrayList4);
        this.f23682c = fVar2;
        this.f23685f = true;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(V5.w.f10061A);
        arrayList5.add(new V5.k(wVar, 1));
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(V5.w.f10078p);
        arrayList5.add(V5.w.f10069g);
        arrayList5.add(V5.w.f10066d);
        arrayList5.add(V5.w.f10067e);
        arrayList5.add(V5.w.f10068f);
        V5.l lVar = V5.w.f10073k;
        arrayList5.add(new V5.r(Long.TYPE, Long.class, lVar));
        arrayList5.add(new V5.r(Double.TYPE, Double.class, new j(0)));
        arrayList5.add(new V5.r(Float.TYPE, Float.class, new j(1)));
        arrayList5.add(V5.l.f10023b);
        arrayList5.add(V5.w.f10070h);
        arrayList5.add(V5.w.f10071i);
        arrayList5.add(new V5.u(AtomicLong.class, new k(new k(lVar, 0), 2), 0));
        arrayList5.add(new V5.u(AtomicLongArray.class, new k(new k(lVar, 1), 2), 0));
        arrayList5.add(V5.w.f10072j);
        arrayList5.add(V5.w.f10074l);
        arrayList5.add(V5.w.f10079q);
        arrayList5.add(V5.w.f10080r);
        arrayList5.add(new V5.u(BigDecimal.class, V5.w.f10075m, 0));
        arrayList5.add(new V5.u(BigInteger.class, V5.w.f10076n, 0));
        arrayList5.add(new V5.u(com.nimbusds.jose.shaded.gson.internal.h.class, V5.w.f10077o, 0));
        arrayList5.add(V5.w.f10081s);
        arrayList5.add(V5.w.t);
        arrayList5.add(V5.w.f10083v);
        arrayList5.add(V5.w.f10084w);
        arrayList5.add(V5.w.f10086y);
        arrayList5.add(V5.w.f10082u);
        arrayList5.add(V5.w.f10064b);
        arrayList5.add(V5.d.f10005b);
        arrayList5.add(V5.w.f10085x);
        if (Y5.b.f11299a) {
            arrayList5.add(Y5.b.f11301c);
            arrayList5.add(Y5.b.f11300b);
            arrayList5.add(Y5.b.f11302d);
        }
        arrayList5.add(V5.b.f9999d);
        arrayList5.add(V5.w.f10063a);
        arrayList5.add(new V5.c(fVar2, 0));
        arrayList5.add(new V5.c(fVar2, 2));
        V5.c cVar = new V5.c(fVar2, 1);
        this.f23683d = cVar;
        arrayList5.add(cVar);
        arrayList5.add(V5.w.f10062B);
        arrayList5.add(new V5.r(fVar2, fVar, cVar, arrayList4));
        this.f23684e = Collections.unmodifiableList(arrayList5);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(com.nimbusds.jose.shaded.gson.stream.b bVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        boolean z3 = bVar.f23696b;
        boolean z8 = true;
        bVar.f23696b = true;
        try {
            try {
                try {
                    try {
                        bVar.w();
                        z8 = false;
                        Object objA = d(aVar).a(bVar);
                        bVar.f23696b = z3;
                        return objA;
                    } catch (EOFException e10) {
                        if (!z8) {
                            throw new p(10, e10);
                        }
                        bVar.f23696b = z3;
                        return null;
                    }
                } catch (IllegalStateException e11) {
                    throw new p(10, e11);
                }
            } catch (IOException e12) {
                throw new p(10, e12);
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
            }
        } catch (Throwable th) {
            bVar.f23696b = z3;
            throw th;
        }
    }

    public final Object c(String str, Type type) {
        com.nimbusds.jose.shaded.gson.reflect.a aVar = new com.nimbusds.jose.shaded.gson.reflect.a(type);
        com.nimbusds.jose.shaded.gson.stream.b bVar = new com.nimbusds.jose.shaded.gson.stream.b(new StringReader(str));
        bVar.f23696b = false;
        Object objB = b(bVar, aVar);
        if (objB != null) {
            try {
                if (bVar.w() != 10) {
                    throw new p("JSON document was not fully consumed.", 10, false);
                }
            } catch (com.nimbusds.jose.shaded.gson.stream.d e10) {
                throw new p(10, e10);
            } catch (IOException e11) {
                throw new p(10, e11);
            }
        }
        return objB;
    }

    public final z d(com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        boolean z3;
        ConcurrentHashMap concurrentHashMap = this.f23681b;
        z zVar = (z) concurrentHashMap.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        ThreadLocal threadLocal = this.f23680a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            z zVar2 = (z) map.get(aVar);
            if (zVar2 != null) {
                return zVar2;
            }
            z3 = false;
        }
        try {
            l lVar = new l();
            z zVarCreate = null;
            lVar.f23679a = null;
            map.put(aVar, lVar);
            Iterator it = this.f23684e.iterator();
            while (it.hasNext()) {
                zVarCreate = ((TypeAdapterFactory) it.next()).create(this, aVar);
                if (zVarCreate != null) {
                    if (lVar.f23679a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f23679a = zVarCreate;
                    map.put(aVar, zVarCreate);
                    break;
                }
            }
            if (z3) {
                threadLocal.remove();
            }
            if (zVarCreate != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return zVarCreate;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final z e(TypeAdapterFactory typeAdapterFactory, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        List<TypeAdapterFactory> list = this.f23684e;
        if (!list.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f23683d;
        }
        boolean z3 = false;
        for (TypeAdapterFactory typeAdapterFactory2 : list) {
            if (z3) {
                z zVarCreate = typeAdapterFactory2.create(this, aVar);
                if (zVarCreate != null) {
                    return zVarCreate;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z3 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final com.nimbusds.jose.shaded.gson.stream.c f(Writer writer) {
        com.nimbusds.jose.shaded.gson.stream.c cVar = new com.nimbusds.jose.shaded.gson.stream.c(writer);
        cVar.f23714e = false;
        cVar.f23716g = this.f23685f;
        return cVar;
    }

    public final void g(com.nimbusds.jose.shaded.gson.stream.c cVar) {
        q qVar = q.f23687a;
        boolean z3 = cVar.f23714e;
        cVar.f23714e = true;
        boolean z8 = cVar.f23716g;
        cVar.f23716g = this.f23685f;
        try {
            try {
                try {
                    V5.u uVar = V5.w.f10063a;
                    V5.l.d(cVar, qVar);
                    cVar.f23714e = z3;
                    cVar.f23716g = z8;
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new p(10, e11);
            }
        } catch (Throwable th) {
            cVar.f23714e = z3;
            cVar.f23716g = z8;
            throw th;
        }
    }

    public final void h(Object obj, Type type, com.nimbusds.jose.shaded.gson.stream.c cVar) {
        z zVarD = d(new com.nimbusds.jose.shaded.gson.reflect.a(type));
        boolean z3 = cVar.f23714e;
        cVar.f23714e = true;
        boolean z8 = cVar.f23716g;
        cVar.f23716g = this.f23685f;
        try {
            try {
                zVarD.b(cVar, obj);
                cVar.f23714e = z3;
                cVar.f23716g = z8;
            } catch (IOException e10) {
                throw new p(10, e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            cVar.f23714e = z3;
            cVar.f23716g = z8;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f23685f + ",factories:" + this.f23684e + ",instanceCreators:" + this.f23682c + "}";
    }
}
