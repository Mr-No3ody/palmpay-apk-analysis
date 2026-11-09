package p162kg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.GeneratedSerializer;
import p133ig.g;
import p133ig.h;
import p141j9.C1798f;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
public class N implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GeneratedSerializer f38801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f38804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f38805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f38806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f38807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f38808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f38809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f38810k;

    public N(String serialName, GeneratedSerializer generatedSerializer, int i7) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f38800a = serialName;
        this.f38801b = generatedSerializer;
        this.f38802c = i7;
        this.f38803d = -1;
        String[] strArr = new String[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f38804e = strArr;
        int i11 = this.f38802c;
        this.f38805f = new List[i11];
        this.f38806g = new boolean[i11];
        this.f38807h = G.c();
        EnumC2132k enumC2132k = EnumC2132k.f43970b;
        final int i12 = 0;
        this.f38808i = C2131j.a(enumC2132k, new Function0(this) { // from class: kg.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f38799b;

            {
                this.f38799b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer<?>[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                switch (i12) {
                    case 0:
                        GeneratedSerializer generatedSerializer2 = this.f38799b.f38801b;
                        return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? L.f38797b : kSerializerArrChildSerializers;
                    case 1:
                        KSerializer<?>[] kSerializerArrTypeParametersSerializers = this.f38799b.f38801b.typeParametersSerializers();
                        if (kSerializerArrTypeParametersSerializers != null) {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return L.c(arrayList);
                    default:
                        N n10 = this.f38799b;
                        return Integer.valueOf(L.d(n10, (SerialDescriptor[]) n10.f38809j.getValue()));
                }
            }
        });
        final int i13 = 1;
        this.f38809j = C2131j.a(enumC2132k, new Function0(this) { // from class: kg.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f38799b;

            {
                this.f38799b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer<?>[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                switch (i13) {
                    case 0:
                        GeneratedSerializer generatedSerializer2 = this.f38799b.f38801b;
                        return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? L.f38797b : kSerializerArrChildSerializers;
                    case 1:
                        KSerializer<?>[] kSerializerArrTypeParametersSerializers = this.f38799b.f38801b.typeParametersSerializers();
                        if (kSerializerArrTypeParametersSerializers != null) {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return L.c(arrayList);
                    default:
                        N n10 = this.f38799b;
                        return Integer.valueOf(L.d(n10, (SerialDescriptor[]) n10.f38809j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f38810k = C2131j.a(enumC2132k, new Function0(this) { // from class: kg.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f38799b;

            {
                this.f38799b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer<?>[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                switch (i14) {
                    case 0:
                        GeneratedSerializer generatedSerializer2 = this.f38799b.f38801b;
                        return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? L.f38797b : kSerializerArrChildSerializers;
                    case 1:
                        KSerializer<?>[] kSerializerArrTypeParametersSerializers = this.f38799b.f38801b.typeParametersSerializers();
                        if (kSerializerArrTypeParametersSerializers != null) {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return L.c(arrayList);
                    default:
                        N n10 = this.f38799b;
                        return Integer.valueOf(L.d(n10, (SerialDescriptor[]) n10.f38809j.getValue()));
                }
            }
        });
    }

    public final void a(String name, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i7 = this.f38803d + 1;
        this.f38803d = i7;
        String[] strArr = this.f38804e;
        strArr[i7] = name;
        this.f38806g[i7] = z3;
        this.f38805f[i7] = null;
        if (i7 == this.f38802c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f38807h = map;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f38800a.equals(serialDescriptor.getSerialName()) && Arrays.equals((SerialDescriptor[]) this.f38809j.getValue(), (SerialDescriptor[]) ((N) obj).f38809j.getValue())) {
                int elementsCount = serialDescriptor.getElementsCount();
                int i7 = this.f38802c;
                if (i7 == elementsCount) {
                    for (int i10 = 0; i10 < i7; i10++) {
                        if (Intrinsics.c(getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) && Intrinsics.c(getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return z.f38935a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        List list = this.f38805f[i7];
        return list == null ? z.f38935a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        return ((KSerializer[]) this.f38808i.getValue())[i7].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f38807h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        return this.f38804e[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.f38802c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        return h.f37622a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.f38800a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.internal.CachedNames
    public final Set getSerialNames() {
        return this.f38807h.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public int hashCode() {
        return ((Number) this.f38810k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        return this.f38806g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return false;
    }

    public final String toString() {
        return CollectionsKt.J(b.f(0, this.f38802c), ", ", this.f38800a.concat("("), ")", new C1798f(this, 7), 24);
    }
}
