package com.adjust.sdk.sig;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractList implements List, q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f19439d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f19441b = f19439d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19442c;

    public final void a(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f19441b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f19439d) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f19441b = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i7 < 0) {
            i10 = i7;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        int i11 = this.f19440a;
        System.arraycopy(objArr, i11, objArr2, 0, objArr.length - i11);
        Object[] objArr3 = this.f19441b;
        int length2 = objArr3.length;
        int i12 = this.f19440a;
        System.arraycopy(objArr3, 0, objArr2, length2 - i12, i12);
        this.f19440a = 0;
        this.f19441b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10 = this.f19442c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
        }
        if (i7 == i10) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        a(i10 + 1);
        int iC = c(this.f19440a + i7);
        int i11 = this.f19442c;
        int i12 = (i11 + 1) >> 1;
        int i13 = this.f19440a;
        if (i7 < i12) {
            int length = iC == 0 ? this.f19441b.length - 1 : iC - 1;
            int length2 = i13 == 0 ? this.f19441b.length - 1 : i13 - 1;
            Object[] objArr = this.f19441b;
            if (length >= i13) {
                objArr[length2] = objArr[i13];
                int i14 = i13 + 1;
                System.arraycopy(objArr, i14, objArr, i13, (length + 1) - i14);
            } else {
                System.arraycopy(objArr, i13, objArr, i13 - 1, objArr.length - i13);
                Object[] objArr2 = this.f19441b;
                objArr2[objArr2.length - 1] = objArr2[0];
                System.arraycopy(objArr2, 1, objArr2, 0, length);
            }
            this.f19441b[length] = obj;
            this.f19440a = length2;
        } else {
            int iC2 = c(i13 + i11);
            Object[] objArr3 = this.f19441b;
            if (iC < iC2) {
                System.arraycopy(objArr3, iC, objArr3, iC + 1, iC2 - iC);
            } else {
                System.arraycopy(objArr3, 0, objArr3, 1, iC2);
                Object[] objArr4 = this.f19441b;
                objArr4[0] = objArr4[objArr4.length - 1];
                System.arraycopy(objArr4, iC, objArr4, iC + 1, (objArr4.length - 1) - iC);
            }
            this.f19441b[iC] = obj;
        }
        this.f19442c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        int i10 = this.f19442c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i11 = this.f19442c;
        if (i7 == i11) {
            return addAll(collection);
        }
        ((AbstractList) this).modCount++;
        a(collection.size() + i11);
        int iC = c(this.f19440a + this.f19442c);
        int iC2 = c(this.f19440a + i7);
        int size = collection.size();
        if (i7 < ((this.f19442c + 1) >> 1)) {
            int i12 = this.f19440a;
            int length = i12 - size;
            if (iC2 >= i12) {
                Object[] objArr = this.f19441b;
                if (length >= 0) {
                    System.arraycopy(objArr, i12, objArr, length, iC2 - i12);
                } else {
                    length += objArr.length;
                    int i13 = iC2 - i12;
                    int length2 = objArr.length - length;
                    if (length2 >= i13) {
                        System.arraycopy(objArr, i12, objArr, length, i13);
                    } else {
                        System.arraycopy(objArr, i12, objArr, length, (i12 + length2) - i12);
                        Object[] objArr2 = this.f19441b;
                        int i14 = this.f19440a + length2;
                        System.arraycopy(objArr2, i14, objArr2, 0, iC2 - i14);
                    }
                }
            } else {
                Object[] objArr3 = this.f19441b;
                System.arraycopy(objArr3, i12, objArr3, length, objArr3.length - i12);
                Object[] objArr4 = this.f19441b;
                if (size >= iC2) {
                    System.arraycopy(objArr4, 0, objArr4, objArr4.length - size, iC2);
                } else {
                    System.arraycopy(objArr4, 0, objArr4, objArr4.length - size, size);
                    Object[] objArr5 = this.f19441b;
                    System.arraycopy(objArr5, size, objArr5, 0, iC2 - size);
                }
            }
            this.f19440a = length;
            a(b(iC2 - size), collection);
        } else {
            int i15 = iC2 + size;
            Object[] objArr6 = this.f19441b;
            if (iC2 < iC) {
                int i16 = size + iC;
                if (i16 <= objArr6.length) {
                    System.arraycopy(objArr6, iC2, objArr6, i15, iC - iC2);
                } else if (i15 >= objArr6.length) {
                    System.arraycopy(objArr6, iC2, objArr6, i15 - objArr6.length, iC - iC2);
                } else {
                    int length3 = iC - (i16 - objArr6.length);
                    System.arraycopy(objArr6, length3, objArr6, 0, iC - length3);
                    Object[] objArr7 = this.f19441b;
                    System.arraycopy(objArr7, iC2, objArr7, i15, length3 - iC2);
                }
            } else {
                System.arraycopy(objArr6, 0, objArr6, size, iC);
                Object[] objArr8 = this.f19441b;
                if (i15 >= objArr8.length) {
                    System.arraycopy(objArr8, iC2, objArr8, i15 - objArr8.length, objArr8.length - iC2);
                } else {
                    int length4 = objArr8.length - size;
                    System.arraycopy(objArr8, length4, objArr8, 0, objArr8.length - length4);
                    Object[] objArr9 = this.f19441b;
                    System.arraycopy(objArr9, iC2, objArr9, i15, (objArr9.length - size) - iC2);
                }
            }
            a(iC2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        ((AbstractList) this).modCount++;
        a(this.f19442c + 1);
        int length = this.f19440a;
        if (length == 0) {
            length = this.f19441b.length;
        }
        int i7 = length - 1;
        this.f19440a = i7;
        this.f19441b[i7] = obj;
        this.f19442c++;
    }

    public final void addLast(Object obj) {
        ((AbstractList) this).modCount++;
        a(this.f19442c + 1);
        this.f19441b[c(this.f19440a + this.f19442c)] = obj;
        this.f19442c++;
    }

    public final int b(int i7) {
        return i7 < 0 ? i7 + this.f19441b.length : i7;
    }

    public final int c(int i7) {
        Object[] objArr = this.f19441b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            int iC = c(this.f19440a + this.f19442c);
            int i7 = this.f19440a;
            Object[] objArr = this.f19441b;
            if (i7 < iC) {
                Arrays.fill(objArr, i7, iC, (Object) null);
            } else {
                Arrays.fill(objArr, i7, objArr.length, (Object) null);
                Arrays.fill(this.f19441b, 0, iC, (Object) null);
            }
        }
        this.f19440a = 0;
        this.f19442c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object d(int i7) {
        int i10 = this.f19442c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
        }
        if (i7 == i10 - 1) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        ((AbstractList) this).modCount++;
        int iC = c(this.f19440a + i7);
        Object[] objArr = this.f19441b;
        Object obj = objArr[iC];
        int i11 = this.f19442c;
        int i12 = i11 >> 1;
        int i13 = this.f19440a;
        if (i7 < i12) {
            if (iC >= i13) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, iC - i13);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, iC);
                Object[] objArr2 = this.f19441b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i14 = this.f19440a;
                System.arraycopy(objArr2, i14, objArr2, i14 + 1, (objArr2.length - 1) - i14);
            }
            Object[] objArr3 = this.f19441b;
            int i15 = this.f19440a;
            objArr3[i15] = null;
            this.f19440a = i15 != objArr3.length - 1 ? i15 + 1 : 0;
        } else {
            int iC2 = c((i11 - 1) + i13);
            Object[] objArr4 = this.f19441b;
            if (iC <= iC2) {
                int i16 = iC + 1;
                System.arraycopy(objArr4, i16, objArr4, iC, (iC2 + 1) - i16);
            } else {
                int i17 = iC + 1;
                System.arraycopy(objArr4, i17, objArr4, iC, objArr4.length - i17);
                Object[] objArr5 = this.f19441b;
                objArr5[objArr5.length - 1] = objArr5[0];
                System.arraycopy(objArr5, 1, objArr5, 0, iC2);
            }
            this.f19441b[iC2] = null;
        }
        this.f19442c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i10 = this.f19442c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
        }
        return this.f19441b[c(this.f19440a + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int iC = c(this.f19440a + this.f19442c);
        int length = this.f19440a;
        if (length < iC) {
            while (length < iC) {
                if (g1.a(obj, this.f19441b[length])) {
                    i7 = this.f19440a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iC) {
            return -1;
        }
        int length2 = this.f19441b.length;
        while (length < length2) {
            if (g1.a(obj, this.f19441b[length])) {
                i7 = this.f19440a;
            } else {
                length++;
            }
        }
        for (int i10 = 0; i10 < iC; i10++) {
            if (g1.a(obj, this.f19441b[i10])) {
                length = i10 + this.f19441b.length;
                i7 = this.f19440a;
            }
        }
        return -1;
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f19442c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i7;
        int iC = c(this.f19440a + this.f19442c);
        int i10 = this.f19440a;
        if (i10 < iC) {
            length = iC - 1;
            if (i10 <= length) {
                while (!g1.a(obj, this.f19441b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i7 = this.f19440a;
                return length - i7;
            }
            return -1;
        }
        if (i10 > iC) {
            do {
                iC--;
                objArr = this.f19441b;
                if (-1 >= iC) {
                    length = objArr.length - 1;
                    int i11 = this.f19440a;
                    if (i11 <= length) {
                        while (!g1.a(obj, this.f19441b[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i7 = this.f19440a;
                    }
                }
                return length - i7;
            } while (!g1.a(obj, objArr[iC]));
            length = iC + this.f19441b.length;
            i7 = this.f19440a;
            return length - i7;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return d(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iC;
        Object[] objArr;
        boolean z3 = false;
        if (!isEmpty() && this.f19441b.length != 0) {
            int iC2 = c(this.f19440a + this.f19442c);
            int i7 = this.f19440a;
            if (i7 < iC2) {
                iC = i7;
                while (true) {
                    objArr = this.f19441b;
                    if (i7 >= iC2) {
                        break;
                    }
                    Object obj = objArr[i7];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f19441b[iC] = obj;
                        iC++;
                    }
                    i7++;
                }
                Arrays.fill(objArr, iC, iC2, (Object) null);
            } else {
                int length = this.f19441b.length;
                boolean z8 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr2 = this.f19441b;
                    Object obj2 = objArr2[i7];
                    objArr2[i7] = null;
                    if (collection.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f19441b[i10] = obj2;
                        i10++;
                    }
                    i7++;
                }
                iC = c(i10);
                for (int i11 = 0; i11 < iC2; i11++) {
                    Object[] objArr3 = this.f19441b;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        z8 = true;
                    } else {
                        Object[] objArr4 = this.f19441b;
                        objArr4[iC] = obj3;
                        iC = iC == objArr4.length - 1 ? 0 : iC + 1;
                    }
                }
                z3 = z8;
            }
            if (z3) {
                ((AbstractList) this).modCount++;
                this.f19442c = b(iC - this.f19440a);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f19441b;
        int i7 = this.f19440a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f19440a = i7 == objArr.length + (-1) ? 0 : i7 + 1;
        this.f19442c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        int iC = c((size() - 1) + this.f19440a);
        Object[] objArr = this.f19441b;
        Object obj = objArr[iC];
        objArr[iC] = null;
        this.f19442c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        int i11 = this.f19442c;
        if (i7 < 0 || i10 > i11) {
            StringBuilder sbP = N8.q0.p(i7, "fromIndex: ", i10, ", toIndex: ", ", size: ");
            sbP.append(i11);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(i7, "fromIndex: ", i10, " > toIndex: "));
        }
        int i12 = i10 - i7;
        if (i12 == 0) {
            return;
        }
        if (i12 == i11) {
            clear();
            return;
        }
        if (i12 == 1) {
            d(i7);
            return;
        }
        ((AbstractList) this).modCount++;
        int i13 = i11 - i10;
        int i14 = this.f19440a;
        if (i7 < i13) {
            int iC = c((i7 - 1) + i14);
            int iC2 = c(this.f19440a + (i10 - 1));
            while (i7 > 0) {
                int i15 = iC + 1;
                int iMin = Math.min(i7, Math.min(i15, iC2 + 1));
                Object[] objArr = this.f19441b;
                int i16 = iC2 - iMin;
                int i17 = iC - iMin;
                int i18 = i17 + 1;
                System.arraycopy(objArr, i18, objArr, i16 + 1, i15 - i18);
                iC = b(i17);
                iC2 = b(i16);
                i7 -= iMin;
            }
            int iC3 = c(this.f19440a + i12);
            int i19 = this.f19440a;
            Object[] objArr2 = this.f19441b;
            if (i19 < iC3) {
                Arrays.fill(objArr2, i19, iC3, (Object) null);
            } else {
                Arrays.fill(objArr2, i19, objArr2.length, (Object) null);
                Arrays.fill(this.f19441b, 0, iC3, (Object) null);
            }
            this.f19440a = iC3;
        } else {
            int iC4 = c(i14 + i10);
            int iC5 = c(this.f19440a + i7);
            int i20 = this.f19442c;
            while (true) {
                i20 -= i10;
                if (i20 <= 0) {
                    break;
                }
                Object[] objArr3 = this.f19441b;
                i10 = Math.min(i20, Math.min(objArr3.length - iC4, objArr3.length - iC5));
                Object[] objArr4 = this.f19441b;
                int i21 = iC4 + i10;
                System.arraycopy(objArr4, iC4, objArr4, iC5, i21 - iC4);
                iC4 = c(i21);
                iC5 = c(iC5 + i10);
            }
            int iC6 = c(this.f19440a + this.f19442c);
            int iB = b(iC6 - i12);
            Object[] objArr5 = this.f19441b;
            if (iB < iC6) {
                Arrays.fill(objArr5, iB, iC6, (Object) null);
            } else {
                Arrays.fill(objArr5, iB, objArr5.length, (Object) null);
                Arrays.fill(this.f19441b, 0, iC6, (Object) null);
            }
        }
        this.f19442c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iC;
        Object[] objArr;
        boolean z3 = false;
        if (!isEmpty() && this.f19441b.length != 0) {
            int iC2 = c(this.f19440a + this.f19442c);
            int i7 = this.f19440a;
            if (i7 < iC2) {
                iC = i7;
                while (true) {
                    objArr = this.f19441b;
                    if (i7 >= iC2) {
                        break;
                    }
                    Object obj = objArr[i7];
                    if (collection.contains(obj)) {
                        this.f19441b[iC] = obj;
                        iC++;
                    } else {
                        z3 = true;
                    }
                    i7++;
                }
                Arrays.fill(objArr, iC, iC2, (Object) null);
            } else {
                int length = this.f19441b.length;
                boolean z8 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr2 = this.f19441b;
                    Object obj2 = objArr2[i7];
                    objArr2[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f19441b[i10] = obj2;
                        i10++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                iC = c(i10);
                for (int i11 = 0; i11 < iC2; i11++) {
                    Object[] objArr3 = this.f19441b;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        Object[] objArr4 = this.f19441b;
                        objArr4[iC] = obj3;
                        iC = iC == objArr4.length - 1 ? 0 : iC + 1;
                    } else {
                        z8 = true;
                    }
                }
                z3 = z8;
            }
            if (z3) {
                ((AbstractList) this).modCount++;
                this.f19442c = b(iC - this.f19440a);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i10 = this.f19442c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", i10, ", size: "));
        }
        int iC = c(this.f19440a + i7);
        Object[] objArr = this.f19441b;
        Object obj2 = objArr[iC];
        objArr[iC] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19442c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f19442c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i7 = this.f19442c;
        if (length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        int iC = c(this.f19440a + this.f19442c);
        int i10 = this.f19440a;
        if (i10 < iC) {
            System.arraycopy(this.f19441b, i10, objArr, 0, iC - i10);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f19441b;
            int i11 = this.f19440a;
            System.arraycopy(objArr2, i11, objArr, 0, objArr2.length - i11);
            Object[] objArr3 = this.f19441b;
            System.arraycopy(objArr3, 0, objArr, objArr3.length - this.f19440a, iC);
        }
        int i12 = this.f19442c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    public final void a(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f19441b.length;
        while (i7 < length && it.hasNext()) {
            this.f19441b[i7] = it.next();
            i7++;
        }
        int i10 = this.f19440a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f19441b[i11] = it.next();
        }
        this.f19442c = collection.size() + this.f19442c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        a(collection.size() + this.f19442c);
        a(c(this.f19440a + this.f19442c), collection);
        return true;
    }
}
