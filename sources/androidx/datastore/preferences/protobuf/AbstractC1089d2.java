package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1089d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f16600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r2 f16601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2 f16602c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C1077a2 c1077a2 = C1077a2.f16579c;
        r2 r2Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f16600a = cls;
        try {
            C1077a2 c1077a3 = C1077a2.f16579c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                r2Var = (r2) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f16601b = r2Var;
        f16602c = new r2();
    }

    public static int a(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1148v1)) {
            int iE = 0;
            while (i7 < size) {
                iE += AbstractC1146v.E(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iE;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int iE2 = 0;
        while (i7 < size) {
            iE2 += AbstractC1146v.E(c1148v1.getInt(i7));
            i7++;
        }
        return iE2;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1146v.C(i7) + 4) * size;
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1146v.C(i7) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1148v1)) {
            int iE = 0;
            while (i7 < size) {
                iE += AbstractC1146v.E(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iE;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int iE2 = 0;
        while (i7 < size) {
            iE2 += AbstractC1146v.E(c1148v1.getInt(i7));
            i7++;
        }
        return iE2;
    }

    public static int e(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G1)) {
            int iE = 0;
            while (i7 < size) {
                iE += AbstractC1146v.E(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iE;
        }
        G1 g7 = (G1) list;
        int iE2 = 0;
        while (i7 < size) {
            iE2 += AbstractC1146v.E(g7.getLong(i7));
            i7++;
        }
        return iE2;
    }

    public static int f(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1148v1)) {
            int iZ = 0;
            while (i7 < size) {
                iZ += AbstractC1146v.z(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZ;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int iZ2 = 0;
        while (i7 < size) {
            iZ2 += AbstractC1146v.z(c1148v1.getInt(i7));
            i7++;
        }
        return iZ2;
    }

    public static int g(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G1)) {
            int iA = 0;
            while (i7 < size) {
                iA += AbstractC1146v.A(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iA;
        }
        G1 g7 = (G1) list;
        int iA2 = 0;
        while (i7 < size) {
            iA2 += AbstractC1146v.A(g7.getLong(i7));
            i7++;
        }
        return iA2;
    }

    public static int h(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1148v1)) {
            int iD = 0;
            while (i7 < size) {
                iD += AbstractC1146v.D(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iD;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int iD2 = 0;
        while (i7 < size) {
            iD2 += AbstractC1146v.D(c1148v1.getInt(i7));
            i7++;
        }
        return iD2;
    }

    public static int i(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G1)) {
            int iE = 0;
            while (i7 < size) {
                iE += AbstractC1146v.E(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iE;
        }
        G1 g7 = (G1) list;
        int iE2 = 0;
        while (i7 < size) {
            iE2 += AbstractC1146v.E(g7.getLong(i7));
            i7++;
        }
        return iE2;
    }

    public static Object j(Object obj, int i7, List list, Internal$EnumVerifier internal$EnumVerifier, Object obj2, r2 r2Var) {
        if (internal$EnumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!internal$EnumVerifier.isInRange(iIntValue)) {
                    obj2 = n(obj, i7, iIntValue, obj2, r2Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (internal$EnumVerifier.isInRange(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = n(obj, i7, iIntValue2, obj2, r2Var);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static void k(AbstractC1096f1 abstractC1096f1, Object obj, Object obj2) {
        ((C1100g1) abstractC1096f1).getClass();
        C1122m1 c1122m1 = ((AbstractC1142t1) obj2).extensions;
        if (c1122m1.f16696a.isEmpty()) {
            return;
        }
        C1122m1 c1122m1N = ((AbstractC1142t1) obj).n();
        c1122m1N.getClass();
        C1093e2 c1093e2 = c1122m1.f16696a;
        int size = c1093e2.f16607a.size();
        for (int i7 = 0; i7 < size; i7++) {
            c1122m1N.j(c1093e2.c(i7));
        }
        Iterator it = c1093e2.d().iterator();
        while (it.hasNext()) {
            c1122m1N.j((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void l(r2 r2Var, Object obj, Object obj2) {
        r2Var.getClass();
        AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) obj;
        q2 q2Var = abstractC1145u1.unknownFields;
        q2 q2Var2 = ((AbstractC1145u1) obj2).unknownFields;
        q2 q2Var3 = q2.f16751f;
        if (!q2Var3.equals(q2Var2)) {
            if (q2Var3.equals(q2Var)) {
                int i7 = q2Var.f16752a + q2Var2.f16752a;
                int[] iArrCopyOf = Arrays.copyOf(q2Var.f16753b, i7);
                System.arraycopy(q2Var2.f16753b, 0, iArrCopyOf, q2Var.f16752a, q2Var2.f16752a);
                Object[] objArrCopyOf = Arrays.copyOf(q2Var.f16754c, i7);
                System.arraycopy(q2Var2.f16754c, 0, objArrCopyOf, q2Var.f16752a, q2Var2.f16752a);
                q2Var = new q2(i7, iArrCopyOf, objArrCopyOf, true);
            } else {
                q2Var.getClass();
                if (!q2Var2.equals(q2Var3)) {
                    if (!q2Var.f16756e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = q2Var.f16752a + q2Var2.f16752a;
                    q2Var.a(i10);
                    System.arraycopy(q2Var2.f16753b, 0, q2Var.f16753b, q2Var.f16752a, q2Var2.f16752a);
                    System.arraycopy(q2Var2.f16754c, 0, q2Var.f16754c, q2Var.f16752a, q2Var2.f16752a);
                    q2Var.f16752a = i10;
                }
            }
        }
        abstractC1145u1.unknownFields = q2Var;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i7, int i10, Object obj2, r2 r2Var) {
        if (obj2 == null) {
            r2Var.getClass();
            obj2 = r2.a(obj);
        }
        r2Var.getClass();
        ((q2) obj2).d(i7 << 3, Long.valueOf(i10));
        return obj2;
    }
}
