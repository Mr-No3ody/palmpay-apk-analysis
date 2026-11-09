package F1;

import Pa.C0525w;
import Pa.a0;
import com.nimbusds.jose.shaded.gson.InstanceCreator;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.internal.o;
import com.nimbusds.jose.shaded.gson.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p045d3.j;
import p045d3.k;
import p137j3.u;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2526c;

    public f(int i7) {
        this.f2524a = i7;
        switch (i7) {
            case 2:
                this.f2525b = new HashMap();
                this.f2526c = new ArrayList();
                break;
            default:
                this.f2526c = new ArrayList();
                this.f2525b = new HashMap();
                break;
        }
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    public ObjectConstructor b(com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        ObjectConstructor c2085k0;
        ObjectConstructor c0525w;
        String str;
        byte b7 = 0;
        int i7 = 19;
        int i10 = 5;
        HashMap map = this.f2525b;
        Type type = aVar.f23690b;
        InstanceCreator instanceCreator = (InstanceCreator) map.get(type);
        if (instanceCreator != null) {
            return new p039cb.c(6, instanceCreator, type);
        }
        Class cls = aVar.f23689a;
        InstanceCreator instanceCreator2 = (InstanceCreator) map.get(cls);
        if (instanceCreator2 != null) {
            return new androidx.work.impl.model.b(7, instanceCreator2, type);
        }
        ObjectConstructor gVar = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            c2085k0 = new p1.c(type, i7);
        } else {
            c2085k0 = cls == EnumMap.class ? new C2085k0(type, i7) : null;
        }
        if (c2085k0 != null) {
            return c2085k0;
        }
        t tVarE = com.nimbusds.jose.shaded.gson.internal.d.e(this.f2526c, cls);
        boolean zIsAbstract = Modifier.isAbstract(cls.getModifiers());
        t tVar = t.f23717a;
        if (zIsAbstract) {
            c0525w = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                if (tVarE != tVar && (!o.f23669a.a(declaredConstructor, null) || (tVarE == t.f23720d && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    c0525w = new F6.c("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                } else if (tVarE == tVar) {
                    p264r5.a aVar2 = X5.c.f11002a;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e10) {
                        str = "Failed making constructor '" + X5.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
                    }
                    if (str != null) {
                        c0525w = new a0(str, 2);
                    } else {
                        c0525w = new C0525w(declaredConstructor, 20);
                    }
                } else {
                    c0525w = new C0525w(declaredConstructor, 20);
                }
            } catch (NoSuchMethodException unused) {
                c0525w = null;
            }
        }
        if (c0525w != null) {
            return c0525w;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                gVar = new com.growingio.android.debugger.a(i10);
            } else if (Set.class.isAssignableFrom(cls)) {
                gVar = new p045d3.g(i10);
            } else {
                gVar = Queue.class.isAssignableFrom(cls) ? new j(i10) : new p121i2.d(b7, i10);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                gVar = new p121i2.e(i10);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                gVar = new u(i10);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                gVar = new p166l2.a(i10);
            } else if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Objects.requireNonNull(type2);
                Type typeA = com.nimbusds.jose.shaded.gson.internal.d.a(type2);
                Class clsG = com.nimbusds.jose.shaded.gson.internal.d.g(typeA);
                typeA.hashCode();
                if (String.class.isAssignableFrom(clsG)) {
                    gVar = new org.sufficientlysecure.htmltextview.g(i10);
                } else {
                    gVar = new org.sufficientlysecure.htmltextview.f(i10);
                }
            } else {
                gVar = new org.sufficientlysecure.htmltextview.g(i10);
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String strA = a(cls);
        if (strA != null) {
            return new p183m6.j(strA, 15);
        }
        if (tVarE == tVar) {
            return new k(cls, i7);
        }
        return new Kg.g("Unable to create instance of " + cls + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f2526c.contains(str)) {
                this.f2526c.add(str);
            }
            arrayList = (List) this.f2525b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2525b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2526c.iterator();
        while (it.hasNext()) {
            List<e> list = (List) this.f2525b.get((String) it.next());
            if (list != null) {
                for (e eVar : list) {
                    if ((eVar.f2521a.isAssignableFrom(cls) && cls2.isAssignableFrom(eVar.f2522b)) && !arrayList.contains(eVar.f2522b)) {
                        arrayList.add(eVar.f2522b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f2524a) {
            case 1:
                return this.f2525b.toString();
            default:
                return super.toString();
        }
    }

    public f(HashMap map, ArrayList arrayList) {
        this.f2524a = 1;
        this.f2525b = map;
        this.f2526c = arrayList;
    }
}
