package kotlin.jvm.internal;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1858h implements KClass, ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1857g f38963b = new C1857g(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f38964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f38965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f38966e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f38967a;

    static {
        List listH = C1850q.h(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.l(listH, 10));
        int i7 = 0;
        for (Object obj : listH) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i7)));
            i7 = i10;
        }
        f38964c = kotlin.collections.G.j(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.e(str);
            sb2.append(StringsKt.Q(str, str));
            sb2.append("CompanionObject");
            map3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f38964c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f38965d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.F.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.e(str2);
            linkedHashMap.put(key, StringsKt.Q(str2, str2));
        }
        f38966e = linkedHashMap;
    }

    public C1858h(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f38967a = jClass;
    }

    public static void a() {
        throw new Mf.a();
    }

    @Override // kotlin.reflect.KClass
    public final boolean equals(Object obj) {
        return (obj instanceof C1858h) && p002a.a.n(this).equals(p002a.a.n((KClass) obj));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        a();
        throw null;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.f38967a;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getNestedClasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Object getObjectInstance() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        return f38963b.getClassQualifiedName(this.f38967a);
    }

    @Override // kotlin.reflect.KClass
    public final List getSealedSubclasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        return f38963b.getClassSimpleName(this.f38967a);
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final kotlin.reflect.d getVisibility() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return p002a.a.n(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        return f38963b.isInstance(obj, this.f38967a);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        a();
        throw null;
    }

    public final String toString() {
        return androidx.camera.video.u.o(new StringBuilder(), this.f38967a, " (Kotlin reflection is not available)");
    }
}
