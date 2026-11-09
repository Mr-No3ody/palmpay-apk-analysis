package kotlin.collections;

import N8.q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1836c extends AbstractC1834a implements List, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f38922a = new a(null);

    /* JADX INFO: renamed from: kotlin.collections.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i7, int i10, int i11) {
            if (i7 < 0 || i10 > i11) {
                StringBuilder sbP = q0.p(i7, "startIndex: ", i10, ", endIndex: ", ", size: ");
                sbP.append(i11);
                throw new IndexOutOfBoundsException(sbP.toString());
            }
            if (i7 > i10) {
                throw new IllegalArgumentException(androidx.camera.video.u.h(i7, "startIndex: ", i10, " > endIndex: "));
            }
        }

        public final void checkElementIndex$kotlin_stdlib(int i7, int i10) {
            if (i7 < 0 || i7 >= i10) {
                throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i7, int i10) {
            if (i7 < 0 || i7 > i10) {
                throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i7, int i10, int i11) {
            if (i7 < 0 || i10 > i11) {
                StringBuilder sbP = q0.p(i7, "fromIndex: ", i10, ", toIndex: ", ", size: ");
                sbP.append(i11);
                throw new IndexOutOfBoundsException(sbP.toString());
            }
            if (i7 > i10) {
                throw new IllegalArgumentException(androidx.camera.video.u.h(i7, "fromIndex: ", i10, " > toIndex: "));
            }
        }

        public final int newCapacity$kotlin_stdlib(int i7, int i10) {
            int i11 = i7 + (i7 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                return i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i11;
        }

        public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection<?> c6, @NotNull Collection<?> other) {
            Intrinsics.checkNotNullParameter(c6, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c6.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c6.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(@NotNull Collection<?> c6) {
            Intrinsics.checkNotNullParameter(c6, "c");
            Iterator<?> it = c6.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f38922a.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i7);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return f38922a.orderedHashCode$kotlin_stdlib(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (Intrinsics.c(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new M.q(this, 1);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C1837d(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        return new C1838e(this, i7, i10);
    }

    public ListIterator listIterator(int i7) {
        return new C1837d(this, i7);
    }
}
