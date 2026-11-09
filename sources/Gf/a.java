package Gf;

import java.io.Serializable;
import kotlin.collections.AbstractC1836c;
import kotlin.collections.C1847n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1836c implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum[] f3405b;

    public a(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f3405b = entries;
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        return this.f3405b.length;
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) C1847n.s(element.ordinal(), this.f3405b)) == element;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final Object get(int i7) {
        AbstractC1836c.a aVar = AbstractC1836c.f38922a;
        Enum[] enumArr = this.f3405b;
        aVar.checkElementIndex$kotlin_stdlib(i7, enumArr.length);
        return enumArr[i7];
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C1847n.s(iOrdinal, this.f3405b)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
