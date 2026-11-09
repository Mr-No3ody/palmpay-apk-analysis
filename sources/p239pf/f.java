package p239pf;

import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f41313d;

    public final void a(Disposable disposable) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f41313d;
        int i7 = this.f41310a;
        int iHashCode = disposable.hashCode() * (-1640531527);
        int i10 = (iHashCode ^ (iHashCode >>> 16)) & i7;
        Object obj3 = objArr[i10];
        if (obj3 != null) {
            if (obj3.equals(disposable)) {
                return;
            }
            do {
                i10 = (i10 + 1) & i7;
                obj2 = objArr[i10];
                if (obj2 == null) {
                }
            } while (!obj2.equals(disposable));
            return;
        }
        objArr[i10] = disposable;
        int i11 = this.f41311b + 1;
        this.f41311b = i11;
        if (i11 < this.f41312c) {
            return;
        }
        Object[] objArr2 = this.f41313d;
        int length = objArr2.length;
        int i12 = length << 1;
        int i13 = i12 - 1;
        Object[] objArr3 = new Object[i12];
        while (true) {
            int i14 = i11 - 1;
            if (i11 == 0) {
                this.f41310a = i13;
                this.f41312c = (int) (i12 * 0.75f);
                this.f41313d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i15 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i13;
            if (objArr3[i15] != null) {
                do {
                    i15 = (i15 + 1) & i13;
                } while (objArr3[i15] != null);
            }
            objArr3[i15] = objArr2[length];
            i11 = i14;
        }
    }

    public final void b(int i7, int i10, Object[] objArr) {
        int i11;
        Object obj;
        this.f41311b--;
        while (true) {
            int i12 = i7 + 1;
            while (true) {
                i11 = i12 & i10;
                obj = objArr[i11];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i13 = (iHashCode ^ (iHashCode >>> 16)) & i10;
                    if (i7 > i11) {
                        if (i7 >= i13 && i13 > i11) {
                            break;
                        } else {
                            i12 = i11 + 1;
                        }
                    } else if (i7 >= i13 || i13 > i11) {
                        break;
                    } else {
                        i12 = i11 + 1;
                    }
                } else {
                    objArr[i7] = null;
                    return;
                }
            }
            objArr[i7] = obj;
            i7 = i11;
        }
    }
}
