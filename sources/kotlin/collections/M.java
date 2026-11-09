package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends AbstractC1836c implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f38908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38911e;

    public M(Object[] buffer, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f38908b = buffer;
        if (i7 < 0) {
            throw new IllegalArgumentException(C0.G.m(i7, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i7 <= buffer.length) {
            this.f38909c = buffer.length;
            this.f38911e = i7;
        } else {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbE.append(buffer.length);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        return this.f38911e;
    }

    public final void b(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(C0.G.m(i7, "n shouldn't be negative but it is ").toString());
        }
        if (i7 > this.f38911e) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbE.append(this.f38911e);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        if (i7 > 0) {
            int i10 = this.f38910d;
            int i11 = this.f38909c;
            int i12 = (i10 + i7) % i11;
            Object[] objArr = this.f38908b;
            if (i10 > i12) {
                C1846m.i(objArr, null, i10, i11);
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Arrays.fill(objArr, 0, i12, (Object) null);
            } else {
                C1846m.i(objArr, null, i10, i12);
            }
            this.f38910d = i12;
            this.f38911e -= i7;
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final Object get(int i7) {
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, a());
        return this.f38908b[(this.f38910d + i7) % this.f38909c];
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new L(this);
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i7 = this.f38911e;
        if (length < i7) {
            array = Arrays.copyOf(array, i7);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i10 = this.f38911e;
        int i11 = this.f38910d;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f38908b;
            if (i13 >= i10 || i11 >= this.f38909c) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        C1849p.d(i10, array);
        return array;
    }
}
