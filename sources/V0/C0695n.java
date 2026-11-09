package V0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.C1845l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0695n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0693l f9956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0695n f9957c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9958a;

    static {
        C0693l c0693l = new C0693l(null);
        f9956b = c0693l;
        C0695n c0695n = new C0695n(new LinkedHashMap());
        c0693l.toByteArrayInternalV1(c0695n);
        f9957c = c0695n;
    }

    public C0695n(C0695n other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f9958a = new HashMap(other.f9958a);
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f9958a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(String.class, "klass");
        Object obj = this.f9958a.get(key);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C0695n.class.equals(obj.getClass())) {
                HashMap map = this.f9958a;
                Set<String> setKeySet = map.keySet();
                HashMap map2 = ((C0695n) obj).f9958a;
                if (Intrinsics.c(setKeySet, map2.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map.get(str);
                        Object obj3 = map2.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = C1845l.b(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f9958a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        String str = "Data {" + CollectionsKt.J(this.f9958a.entrySet(), null, null, null, C0694m.f9955a, 31) + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public C0695n(LinkedHashMap values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f9958a = new HashMap(values);
    }
}
