package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1838e extends AbstractC1836c implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1836c f38924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38926d;

    public C1838e(AbstractC1836c list, int i7, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f38924b = list;
        this.f38925c = i7;
        AbstractC1836c.f38922a.checkRangeIndexes$kotlin_stdlib(i7, i10, list.a());
        this.f38926d = i10 - i7;
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        return this.f38926d;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final Object get(int i7) {
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f38926d);
        return this.f38924b.get(this.f38925c + i7);
    }
}
