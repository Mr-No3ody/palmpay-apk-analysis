package p133ig;

import Sf.b;
import Sf.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.collections.IndexedValue;
import kotlin.collections.r;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import p010a9.m;
import p068ec.d;
import p162kg.L;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f37609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f37611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f37612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f37613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f37614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f37615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f37616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f37617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SerialDescriptor[] f37618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f37619l;

    public e(String serialName, g kind, int i7, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f37608a = serialName;
        this.f37609b = kind;
        this.f37610c = i7;
        this.f37611d = builder.f37592b;
        ArrayList arrayList = builder.f37593c;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashSet hashSet = new HashSet(F.a(r.l(arrayList, 12)));
        CollectionsKt.V(arrayList, hashSet);
        this.f37612e = hashSet;
        int i10 = 0;
        this.f37613f = (String[]) arrayList.toArray(new String[0]);
        this.f37614g = L.c(builder.f37595e);
        this.f37615h = (List[]) builder.f37596f.toArray(new List[0]);
        ArrayList arrayList2 = builder.f37597g;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.f37616i = zArr;
        String[] strArr = this.f37613f;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        o oVar = new o(new d(strArr, 7));
        ArrayList arrayList3 = new ArrayList(r.l(oVar, 10));
        Iterator it2 = oVar.iterator();
        while (true) {
            b bVar = (b) it2;
            if (!bVar.f8875c.hasNext()) {
                this.f37617j = G.j(arrayList3);
                this.f37618k = L.c(typeParameters);
                this.f37619l = C2131j.b(new d(this, 3));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) bVar.next();
            arrayList3.add(new Pair(indexedValue.f38900b, Integer.valueOf(indexedValue.f38899a)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f37608a.equals(serialDescriptor.getSerialName()) && Arrays.equals(this.f37618k, ((e) obj).f37618k)) {
                int elementsCount = serialDescriptor.getElementsCount();
                int i7 = this.f37610c;
                if (i7 == elementsCount) {
                    for (int i10 = 0; i10 < i7; i10++) {
                        SerialDescriptor[] serialDescriptorArr = this.f37614g;
                        if (Intrinsics.c(serialDescriptorArr[i10].getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) && Intrinsics.c(serialDescriptorArr[i10].getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
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
        return this.f37611d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        return this.f37615h[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        return this.f37614g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f37617j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        return this.f37613f[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.f37610c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        return this.f37609b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.f37608a;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public final Set getSerialNames() {
        return this.f37612e;
    }

    public final int hashCode() {
        return ((Number) this.f37619l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        return this.f37616i[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return false;
    }

    public final String toString() {
        return CollectionsKt.J(kotlin.ranges.b.f(0, this.f37610c), ", ", this.f37608a.concat("("), ")", new m(this, 29), 24);
    }
}
