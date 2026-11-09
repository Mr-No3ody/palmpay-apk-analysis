package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1148v1 extends AbstractC1082c implements Internal$IntList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1148v1 f16787d = new C1148v1(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16789c;

    public C1148v1(int[] iArr, int i7, boolean z3) {
        super(z3);
        this.f16788b = iArr;
        this.f16789c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i7 < 0 || i7 > (i10 = this.f16789c)) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Index:", ", Size:");
            sbE.append(this.f16789c);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        int[] iArr = this.f16788b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i10 - i7);
        } else {
            int[] iArr2 = new int[androidx.camera.video.u.c(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f16788b, i7, iArr2, i7 + 1, this.f16789c - i7);
            this.f16788b = iArr2;
        }
        this.f16788b[i7] = iIntValue;
        this.f16789c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1082c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1154x1.f16808a;
        collection.getClass();
        if (!(collection instanceof C1148v1)) {
            return super.addAll(collection);
        }
        C1148v1 c1148v1 = (C1148v1) collection;
        int i7 = c1148v1.f16789c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f16789c;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.f16788b;
        if (i11 > iArr.length) {
            this.f16788b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(c1148v1.f16788b, 0, this.f16788b, this.f16789c, c1148v1.f16789c);
        this.f16789c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$IntList
    public final void addInt(int i7) {
        a();
        int i10 = this.f16789c;
        int[] iArr = this.f16788b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[androidx.camera.video.u.c(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f16788b = iArr2;
        }
        int[] iArr3 = this.f16788b;
        int i11 = this.f16789c;
        this.f16789c = i11 + 1;
        iArr3[i11] = i7;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f16789c) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Index:", ", Size:");
            sbE.append(this.f16789c);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1082c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148v1)) {
            return super.equals(obj);
        }
        C1148v1 c1148v1 = (C1148v1) obj;
        if (this.f16789c != c1148v1.f16789c) {
            return false;
        }
        int[] iArr = c1148v1.f16788b;
        for (int i7 = 0; i7 < this.f16789c; i7++) {
            if (this.f16788b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return Integer.valueOf(getInt(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$IntList
    public final int getInt(int i7) {
        b(i7);
        return this.f16788b[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1082c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.f16789c; i10++) {
            i7 = (i7 * 31) + this.f16788b[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f16789c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f16788b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1082c, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        int[] iArr = this.f16788b;
        int i10 = iArr[i7];
        int i11 = this.f16789c;
        if (i7 < i11 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i11 - i7) - 1);
        }
        this.f16789c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        a();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f16788b;
        System.arraycopy(iArr, i10, iArr, i7, this.f16789c - i10);
        this.f16789c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        return Integer.valueOf(setInt(i7, ((Integer) obj).intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$IntList
    public final int setInt(int i7, int i10) {
        a();
        b(i7);
        int[] iArr = this.f16788b;
        int i11 = iArr[i7];
        iArr[i7] = i10;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16789c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal$ProtobufList<Integer> mutableCopyWithCapacity2(int i7) {
        if (i7 >= this.f16789c) {
            return new C1148v1(Arrays.copyOf(this.f16788b, i7), this.f16789c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
