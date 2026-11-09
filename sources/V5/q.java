package V5;

import N8.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f10042e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f10043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f10044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10045d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f10042e = map;
    }

    public q(Class cls, LinkedHashMap linkedHashMap, boolean z3) {
        super(linkedHashMap);
        this.f10045d = new HashMap();
        p264r5.a aVar = X5.c.f11002a;
        Constructor constructorN = aVar.n(cls);
        this.f10043b = constructorN;
        if (z3) {
            r.a(null, constructorN);
        } else {
            X5.c.e(constructorN);
        }
        String[] strArrV = aVar.v(cls);
        for (int i7 = 0; i7 < strArrV.length; i7++) {
            this.f10045d.put(strArrV[i7], Integer.valueOf(i7));
        }
        Class<?>[] parameterTypes = this.f10043b.getParameterTypes();
        this.f10044c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f10044c[i10] = f10042e.get(parameterTypes[i10]);
        }
    }

    @Override // V5.o
    public final Object c() {
        return (Object[]) this.f10044c.clone();
    }

    @Override // V5.o
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f10043b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            p264r5.a aVar = X5.c.f11002a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + X5.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + X5.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + X5.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override // V5.o
    public final void e(Object obj, com.nimbusds.jose.shaded.gson.stream.b bVar, n nVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f10045d;
        String str = nVar.f10029c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + X5.c.b(this.f10043b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = nVar.f10035i.a(bVar);
        if (objA != null || !nVar.f10038l) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbQ = q0.q("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbQ.append(bVar.getPath());
            throw new P0.c(sbQ.toString(), 10, false);
        }
    }
}
