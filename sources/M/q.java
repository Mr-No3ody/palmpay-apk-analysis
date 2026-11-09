package M;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC1836c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import p355xf.A;
import p355xf.D;
import p355xf.H;
import p355xf.x;

/* JADX INFO: loaded from: classes.dex */
public class q implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5704c;

    public /* synthetic */ q(Object obj, int i7) {
        this.f5702a = i7;
        this.f5704c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5702a) {
            case 0:
                return this.f5703b < ((o) this.f5704c).e();
            case 1:
                return this.f5703b < ((AbstractC1836c) this.f5704c).a();
            case 2:
                return this.f5703b < ((Object[]) this.f5704c).length;
            case 3:
                return this.f5703b < ((byte[]) this.f5704c).length;
            case 4:
                return this.f5703b < ((int[]) this.f5704c).length;
            case 5:
                return this.f5703b < ((long[]) this.f5704c).length;
            default:
                return this.f5703b < ((short[]) this.f5704c).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5702a) {
            case 0:
                int i7 = this.f5703b;
                this.f5703b = i7 + 1;
                return ((o) this.f5704c).f(i7);
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f5703b;
                this.f5703b = i10 + 1;
                return ((AbstractC1836c) this.f5704c).get(i10);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f5704c;
                    int i11 = this.f5703b;
                    this.f5703b = i11 + 1;
                    return objArr[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5703b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 3:
                int i12 = this.f5703b;
                byte[] bArr = (byte[]) this.f5704c;
                if (i12 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5703b));
                }
                this.f5703b = i12 + 1;
                return new x(bArr[i12]);
            case 4:
                int i13 = this.f5703b;
                int[] iArr = (int[]) this.f5704c;
                if (i13 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5703b));
                }
                this.f5703b = i13 + 1;
                return new A(iArr[i13]);
            case 5:
                int i14 = this.f5703b;
                long[] jArr = (long[]) this.f5704c;
                if (i14 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5703b));
                }
                this.f5703b = i14 + 1;
                return new D(jArr[i14]);
            default:
                int i15 = this.f5703b;
                short[] sArr = (short[]) this.f5704c;
                if (i15 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5703b));
                }
                this.f5703b = i15 + 1;
                return new H(sArr[i15]);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5702a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(Object[] array) {
        this.f5702a = 2;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5704c = array;
    }

    public q(byte[] array) {
        this.f5702a = 3;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5704c = array;
    }

    public q(int[] array) {
        this.f5702a = 4;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5704c = array;
    }

    public q(long[] array) {
        this.f5702a = 5;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5704c = array;
    }

    public q(short[] array) {
        this.f5702a = 6;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5704c = array;
    }
}
