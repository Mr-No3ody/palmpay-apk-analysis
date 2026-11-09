package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1843j extends AbstractC1840g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f38929d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f38930e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f38932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38933c;

    /* JADX INFO: renamed from: kotlin.collections.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1843j() {
        this.f38932b = f38930e;
    }

    @Override // kotlin.collections.AbstractC1840g
    public final int a() {
        return this.f38933c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        j();
        d(elements.size() + a());
        c(i(a() + this.f38931a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        d(this.f38933c + 1);
        int length = this.f38931a;
        if (length == 0) {
            Object[] objArr = this.f38932b;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length;
        }
        int i7 = length - 1;
        this.f38931a = i7;
        this.f38932b[i7] = obj;
        this.f38933c++;
    }

    public final void addLast(Object obj) {
        j();
        d(a() + 1);
        this.f38932b[i(a() + this.f38931a)] = obj;
        this.f38933c = a() + 1;
    }

    @Override // kotlin.collections.AbstractC1840g
    public final Object b(int i7) {
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f38933c);
        if (i7 == C1850q.g(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        j();
        int i10 = i(this.f38931a + i7);
        Object[] objArr = this.f38932b;
        Object obj = objArr[i10];
        if (i7 < (this.f38933c >> 1)) {
            int i11 = this.f38931a;
            if (i10 >= i11) {
                C1846m.f(objArr, i11 + 1, objArr, i11, i10);
            } else {
                C1846m.f(objArr, 1, objArr, 0, i10);
                Object[] objArr2 = this.f38932b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f38931a;
                C1846m.f(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f38932b;
            int i13 = this.f38931a;
            objArr3[i13] = null;
            this.f38931a = e(i13);
        } else {
            int i14 = i(C1850q.g(this) + this.f38931a);
            if (i10 <= i14) {
                Object[] objArr4 = this.f38932b;
                C1846m.f(objArr4, i10, objArr4, i10 + 1, i14 + 1);
            } else {
                Object[] objArr5 = this.f38932b;
                C1846m.f(objArr5, i10, objArr5, i10 + 1, objArr5.length);
                Object[] objArr6 = this.f38932b;
                objArr6[objArr6.length - 1] = objArr6[0];
                C1846m.f(objArr6, 0, objArr6, 1, i14 + 1);
            }
            this.f38932b[i14] = null;
        }
        this.f38933c--;
        return obj;
    }

    public final void c(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f38932b.length;
        while (i7 < length && it.hasNext()) {
            this.f38932b[i7] = it.next();
            i7++;
        }
        int i10 = this.f38931a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f38932b[i11] = it.next();
        }
        this.f38933c = collection.size() + this.f38933c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f38931a, i(a() + this.f38931a));
        }
        this.f38931a = 0;
        this.f38933c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f38932b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f38930e) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f38932b = new Object[i7];
            return;
        }
        Object[] objArr2 = new Object[AbstractC1836c.f38922a.newCapacity$kotlin_stdlib(objArr.length, i7)];
        Object[] objArr3 = this.f38932b;
        C1846m.f(objArr3, 0, objArr2, this.f38931a, objArr3.length);
        Object[] objArr4 = this.f38932b;
        int length = objArr4.length;
        int i10 = this.f38931a;
        C1846m.f(objArr4, length - i10, objArr2, 0, i10);
        this.f38931a = 0;
        this.f38932b = objArr2;
    }

    public final int e(int i7) {
        Object[] objArr = this.f38932b;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f38932b[i(C1850q.g(this) + this.f38931a)];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f38932b[this.f38931a];
    }

    public final int g(int i7) {
        return i7 < 0 ? i7 + this.f38932b.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, a());
        return this.f38932b[i(this.f38931a + i7)];
    }

    public final void h(int i7, int i10) {
        if (i7 < i10) {
            C1846m.i(this.f38932b, null, i7, i10);
            return;
        }
        Object[] objArr = this.f38932b;
        int length = objArr.length;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i7, length, (Object) null);
        C1846m.i(this.f38932b, null, 0, i10);
    }

    public final int i(int i7) {
        Object[] objArr = this.f38932b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int i10 = i(a() + this.f38931a);
        int length = this.f38931a;
        if (length < i10) {
            while (length < i10) {
                if (Intrinsics.c(obj, this.f38932b[length])) {
                    i7 = this.f38931a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < i10) {
            return -1;
        }
        int length2 = this.f38932b.length;
        while (length < length2) {
            if (Intrinsics.c(obj, this.f38932b[length])) {
                i7 = this.f38931a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (Intrinsics.c(obj, this.f38932b[i11])) {
                length = i11 + this.f38932b.length;
                i7 = this.f38931a;
            }
        }
        return -1;
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f38932b[i(C1850q.g(this) + this.f38931a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int i10 = i(this.f38933c + this.f38931a);
        int i11 = this.f38931a;
        if (i11 < i10) {
            length = i10 - 1;
            if (i11 <= length) {
                while (!Intrinsics.c(obj, this.f38932b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i7 = this.f38931a;
                return length - i7;
            }
            return -1;
        }
        if (i11 > i10) {
            for (int i12 = i10 - 1; -1 < i12; i12--) {
                if (Intrinsics.c(obj, this.f38932b[i12])) {
                    length = i12 + this.f38932b.length;
                    i7 = this.f38931a;
                    return length - i7;
                }
            }
            Object[] objArr = this.f38932b;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f38931a;
            if (i13 <= length) {
                while (!Intrinsics.c(obj, this.f38932b[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i7 = this.f38931a;
                return length - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int i7;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f38932b.length != 0) {
            int i10 = i(this.f38933c + this.f38931a);
            int i11 = this.f38931a;
            if (i11 < i10) {
                i7 = i11;
                while (i11 < i10) {
                    Object obj = this.f38932b[i11];
                    if (elements.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f38932b[i7] = obj;
                        i7++;
                    }
                    i11++;
                }
                C1846m.i(this.f38932b, null, i7, i10);
            } else {
                int length = this.f38932b.length;
                boolean z8 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f38932b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f38932b[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                i7 = i(i12);
                for (int i13 = 0; i13 < i10; i13++) {
                    Object[] objArr2 = this.f38932b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f38932b[i7] = obj3;
                        i7 = e(i7);
                    }
                }
                z3 = z8;
            }
            if (z3) {
                j();
                this.f38933c = g(i7 - this.f38931a);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f38932b;
        int i7 = this.f38931a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f38931a = e(i7);
        this.f38933c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i7 = i(C1850q.g(this) + this.f38931a);
        Object[] objArr = this.f38932b;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f38933c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        AbstractC1836c.f38922a.checkRangeIndexes$kotlin_stdlib(i7, i10, this.f38933c);
        int i11 = i10 - i7;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f38933c) {
            clear();
            return;
        }
        if (i11 == 1) {
            b(i7);
            return;
        }
        j();
        if (i7 < this.f38933c - i10) {
            int i12 = i((i7 - 1) + this.f38931a);
            int i13 = i((i10 - 1) + this.f38931a);
            while (i7 > 0) {
                int i14 = i12 + 1;
                int iMin = Math.min(i7, Math.min(i14, i13 + 1));
                Object[] objArr = this.f38932b;
                int i15 = i13 - iMin;
                int i16 = i12 - iMin;
                C1846m.f(objArr, i15 + 1, objArr, i16 + 1, i14);
                i12 = g(i16);
                i13 = g(i15);
                i7 -= iMin;
            }
            int i17 = i(this.f38931a + i11);
            h(this.f38931a, i17);
            this.f38931a = i17;
        } else {
            int i18 = i(this.f38931a + i10);
            int i19 = i(this.f38931a + i7);
            int i20 = this.f38933c;
            while (true) {
                i20 -= i10;
                if (i20 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f38932b;
                i10 = Math.min(i20, Math.min(objArr2.length - i18, objArr2.length - i19));
                Object[] objArr3 = this.f38932b;
                int i21 = i18 + i10;
                C1846m.f(objArr3, i19, objArr3, i18, i21);
                i18 = i(i21);
                i19 = i(i19 + i10);
            }
            int i22 = i(this.f38933c + this.f38931a);
            h(g(i22 - i11), i22);
        }
        this.f38933c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i7;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f38932b.length != 0) {
            int i10 = i(this.f38933c + this.f38931a);
            int i11 = this.f38931a;
            if (i11 < i10) {
                i7 = i11;
                while (i11 < i10) {
                    Object obj = this.f38932b[i11];
                    if (elements.contains(obj)) {
                        this.f38932b[i7] = obj;
                        i7++;
                    } else {
                        z3 = true;
                    }
                    i11++;
                }
                C1846m.i(this.f38932b, null, i7, i10);
            } else {
                int length = this.f38932b.length;
                boolean z8 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f38932b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        this.f38932b[i12] = obj2;
                        i12++;
                    } else {
                        z8 = true;
                    }
                    i11++;
                }
                i7 = i(i12);
                for (int i13 = 0; i13 < i10; i13++) {
                    Object[] objArr2 = this.f38932b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        this.f38932b[i7] = obj3;
                        i7 = e(i7);
                    } else {
                        z8 = true;
                    }
                }
                z3 = z8;
            }
            if (z3) {
                j();
                this.f38933c = g(i7 - this.f38931a);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, a());
        int i10 = i(this.f38931a + i7);
        Object[] objArr = this.f38932b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int length;
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f38933c);
        if (i7 == this.f38933c) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        j();
        d(this.f38933c + 1);
        int i10 = i(this.f38931a + i7);
        int i11 = this.f38933c;
        if (i7 < ((i11 + 1) >> 1)) {
            if (i10 == 0) {
                Object[] objArr = this.f38932b;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                i10 = objArr.length;
            }
            int i12 = i10 - 1;
            int i13 = this.f38931a;
            if (i13 == 0) {
                Object[] objArr2 = this.f38932b;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i13 - 1;
            }
            int i14 = this.f38931a;
            if (i12 >= i14) {
                Object[] objArr3 = this.f38932b;
                objArr3[length] = objArr3[i14];
                C1846m.f(objArr3, i14, objArr3, i14 + 1, i12 + 1);
            } else {
                Object[] objArr4 = this.f38932b;
                C1846m.f(objArr4, i14 - 1, objArr4, i14, objArr4.length);
                Object[] objArr5 = this.f38932b;
                objArr5[objArr5.length - 1] = objArr5[0];
                C1846m.f(objArr5, 0, objArr5, 1, i12 + 1);
            }
            this.f38932b[i12] = obj;
            this.f38931a = length;
        } else {
            int i15 = i(i11 + this.f38931a);
            if (i10 < i15) {
                Object[] objArr6 = this.f38932b;
                C1846m.f(objArr6, i10 + 1, objArr6, i10, i15);
            } else {
                Object[] objArr7 = this.f38932b;
                C1846m.f(objArr7, 1, objArr7, 0, i15);
                Object[] objArr8 = this.f38932b;
                objArr8[0] = objArr8[objArr8.length - 1];
                C1846m.f(objArr8, i10 + 1, objArr8, i10, objArr8.length - 1);
            }
            this.f38932b[i10] = obj;
        }
        this.f38933c++;
    }

    public C1843j(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = f38930e;
        } else if (i7 > 0) {
            objArr = new Object[i7];
        } else {
            throw new IllegalArgumentException(C0.G.m(i7, "Illegal Capacity: "));
        }
        this.f38932b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] reference) {
        Intrinsics.checkNotNullParameter(reference, "array");
        int length = reference.length;
        int i7 = this.f38933c;
        if (length < i7) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i7);
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            reference = (Object[]) objNewInstance;
        }
        int i10 = i(this.f38933c + this.f38931a);
        int i11 = this.f38931a;
        if (i11 < i10) {
            C1846m.g(this.f38932b, i11, reference, i10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f38932b;
            C1846m.f(objArr, 0, reference, this.f38931a, objArr.length);
            Object[] objArr2 = this.f38932b;
            C1846m.f(objArr2, objArr2.length - this.f38931a, reference, 0, i10);
        }
        C1849p.d(this.f38933c, reference);
        return reference;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f38933c);
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == this.f38933c) {
            return addAll(elements);
        }
        j();
        d(elements.size() + this.f38933c);
        int i10 = i(this.f38933c + this.f38931a);
        int i11 = i(this.f38931a + i7);
        int size = elements.size();
        if (i7 < ((this.f38933c + 1) >> 1)) {
            int i12 = this.f38931a;
            int length = i12 - size;
            if (i11 < i12) {
                Object[] objArr = this.f38932b;
                C1846m.f(objArr, length, objArr, i12, objArr.length);
                if (size >= i11) {
                    Object[] objArr2 = this.f38932b;
                    C1846m.f(objArr2, objArr2.length - size, objArr2, 0, i11);
                } else {
                    Object[] objArr3 = this.f38932b;
                    C1846m.f(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f38932b;
                    C1846m.f(objArr4, 0, objArr4, size, i11);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f38932b;
                C1846m.f(objArr5, length, objArr5, i12, i11);
            } else {
                Object[] objArr6 = this.f38932b;
                length += objArr6.length;
                int i13 = i11 - i12;
                int length2 = objArr6.length - length;
                if (length2 >= i13) {
                    C1846m.f(objArr6, length, objArr6, i12, i11);
                } else {
                    C1846m.f(objArr6, length, objArr6, i12, i12 + length2);
                    Object[] objArr7 = this.f38932b;
                    C1846m.f(objArr7, 0, objArr7, this.f38931a + length2, i11);
                }
            }
            this.f38931a = length;
            c(g(i11 - size), elements);
            return true;
        }
        int i14 = i11 + size;
        if (i11 < i10) {
            int i15 = size + i10;
            Object[] objArr8 = this.f38932b;
            if (i15 <= objArr8.length) {
                C1846m.f(objArr8, i14, objArr8, i11, i10);
            } else if (i14 >= objArr8.length) {
                C1846m.f(objArr8, i14 - objArr8.length, objArr8, i11, i10);
            } else {
                int length3 = i10 - (i15 - objArr8.length);
                C1846m.f(objArr8, 0, objArr8, length3, i10);
                Object[] objArr9 = this.f38932b;
                C1846m.f(objArr9, i14, objArr9, i11, length3);
            }
        } else {
            Object[] objArr10 = this.f38932b;
            C1846m.f(objArr10, size, objArr10, 0, i10);
            Object[] objArr11 = this.f38932b;
            if (i14 >= objArr11.length) {
                C1846m.f(objArr11, i14 - objArr11.length, objArr11, i11, objArr11.length);
            } else {
                C1846m.f(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.f38932b;
                C1846m.f(objArr12, i14, objArr12, i11, objArr12.length - size);
            }
        }
        c(i11, elements);
        return true;
    }
}
