package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081b2 extends AbstractC1082c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1081b2 f16587d = new C1081b2(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16589c;

    public C1081b2(Object[] objArr, int i7, boolean z3) {
        super(z3);
        this.f16588b = objArr;
        this.f16589c = i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f16589c;
        Object[] objArr = this.f16588b;
        if (i7 == objArr.length) {
            this.f16588b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16588b;
        int i10 = this.f16589c;
        this.f16589c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f16589c) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Index:", ", Size:");
            sbE.append(this.f16589c);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b(i7);
        return this.f16588b[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal$ProtobufList mutableCopyWithCapacity2(int i7) {
        if (i7 >= this.f16589c) {
            return new C1081b2(Arrays.copyOf(this.f16588b, i7), this.f16589c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1082c, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        Object[] objArr = this.f16588b;
        Object obj = objArr[i7];
        int i10 = this.f16589c;
        if (i7 < i10 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i10 - i7) - 1);
        }
        this.f16589c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        b(i7);
        Object[] objArr = this.f16588b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16589c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        a();
        if (i7 >= 0 && i7 <= (i10 = this.f16589c)) {
            Object[] objArr = this.f16588b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
            } else {
                Object[] objArr2 = new Object[androidx.camera.video.u.c(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f16588b, i7, objArr2, i7 + 1, this.f16589c - i7);
                this.f16588b = objArr2;
            }
            this.f16588b[i7] = obj;
            this.f16589c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Index:", ", Size:");
        sbE.append(this.f16589c);
        throw new IndexOutOfBoundsException(sbE.toString());
    }
}
