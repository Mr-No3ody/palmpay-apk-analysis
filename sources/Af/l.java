package Af;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC1841h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC1841h implements Set, Serializable, KMutableSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f352b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f353c = new l(e.f328w.getEmpty$kotlin_stdlib());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f354a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(e backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f354a = backing;
    }

    @Override // kotlin.collections.AbstractC1841h
    public final int a() {
        return this.f354a.f337j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f354a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f354a.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f354a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f354a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f354a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e map = this.f354a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new f(map, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f354a;
        eVar.c();
        int iH = eVar.h(obj);
        if (iH < 0) {
            return false;
        }
        eVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f354a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f354a.c();
        return super.retainAll(elements);
    }

    public l() {
        this(new e());
    }
}
