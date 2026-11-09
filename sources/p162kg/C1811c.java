package p162kg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p133ig.e;
import p176lg.l;

/* JADX INFO: renamed from: kg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1811c extends AbstractC1821m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1810b f38829b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1811c() {
        l element = l.f39385a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        super(element);
        e elementDesc = l.f39386b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f38829b = new C1810b(elementDesc);
    }

    @Override // p162kg.AbstractC1809a
    public final Object a() {
        return new ArrayList();
    }

    @Override // p162kg.AbstractC1809a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p162kg.AbstractC1809a
    public final void c(int i7, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i7);
    }

    @Override // p162kg.AbstractC1809a
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f38829b;
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // p162kg.AbstractC1809a
    public final Object j(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // p162kg.AbstractC1821m
    public final void k(int i7, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i7, obj2);
    }
}
