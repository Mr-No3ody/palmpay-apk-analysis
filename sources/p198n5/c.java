package p198n5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39837b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f39839d;

    public c(d dVar) {
        this.f39839d = dVar;
        this.f39836a = dVar.f39841b;
        this.f39838c = dVar.f39843d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39838c || this.f39836a != this.f39839d.f39842c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39838c = false;
        int i7 = this.f39836a;
        this.f39837b = i7;
        int i10 = i7 + 1;
        d dVar = this.f39839d;
        this.f39836a = i10 < dVar.f39844e ? i10 : 0;
        return dVar.f39840a[i7];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        int i10 = this.f39837b;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        d dVar = this.f39839d;
        int i11 = dVar.f39841b;
        if (i10 == i11) {
            dVar.remove();
            this.f39837b = -1;
            return;
        }
        int i12 = i10 + 1;
        int i13 = dVar.f39844e;
        if (i11 >= i10 || i12 >= (i7 = dVar.f39842c)) {
            while (i12 != dVar.f39842c) {
                if (i12 >= i13) {
                    Object[] objArr = dVar.f39840a;
                    objArr[i12 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = dVar.f39840a;
                    int i14 = i12 - 1;
                    if (i14 < 0) {
                        i14 = i13 - 1;
                    }
                    objArr2[i14] = objArr2[i12];
                    i12++;
                    if (i12 >= i13) {
                    }
                }
                i12 = 0;
            }
        } else {
            Object[] objArr3 = dVar.f39840a;
            System.arraycopy(objArr3, i12, objArr3, i10, i7 - i12);
        }
        this.f39837b = -1;
        int i15 = dVar.f39842c - 1;
        if (i15 < 0) {
            i15 = i13 - 1;
        }
        dVar.f39842c = i15;
        dVar.f39840a[i15] = null;
        dVar.f39843d = false;
        int i16 = this.f39836a - 1;
        if (i16 < 0) {
            i16 = i13 - 1;
        }
        this.f39836a = i16;
    }
}
