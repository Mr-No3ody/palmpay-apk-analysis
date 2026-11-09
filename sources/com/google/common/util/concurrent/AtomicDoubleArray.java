package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int i7) {
        this.longs = new AtomicLongArray(i7);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i7 = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i10 = 0; i10 < i7; i10++) {
            builder.add(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.longs = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i7 = 0; i7 < length; i7++) {
            objectOutputStream.writeDouble(get(i7));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i7, double d2) {
        while (true) {
            long j6 = this.longs.get(i7);
            double dLongBitsToDouble = Double.longBitsToDouble(j6) + d2;
            int i10 = i7;
            if (this.longs.compareAndSet(i10, j6, Double.doubleToRawLongBits(dLongBitsToDouble))) {
                return dLongBitsToDouble;
            }
            i7 = i10;
        }
    }

    public final boolean compareAndSet(int i7, double d2, double d10) {
        return this.longs.compareAndSet(i7, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d10));
    }

    public final double get(int i7) {
        return Double.longBitsToDouble(this.longs.get(i7));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i7, double d2) {
        while (true) {
            long j6 = this.longs.get(i7);
            double dLongBitsToDouble = Double.longBitsToDouble(j6);
            int i10 = i7;
            if (this.longs.compareAndSet(i10, j6, Double.doubleToRawLongBits(dLongBitsToDouble + d2))) {
                return dLongBitsToDouble;
            }
            i7 = i10;
        }
    }

    public final double getAndSet(int i7, double d2) {
        return Double.longBitsToDouble(this.longs.getAndSet(i7, Double.doubleToRawLongBits(d2)));
    }

    public final void lazySet(int i7, double d2) {
        this.longs.lazySet(i7, Double.doubleToRawLongBits(d2));
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int i7, double d2) {
        this.longs.set(i7, Double.doubleToRawLongBits(d2));
    }

    public String toString() {
        int length = length();
        int i7 = length - 1;
        if (i7 == -1) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length * 19);
        sb2.append('[');
        int i10 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.longs.get(i10)));
            if (i10 == i7) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            i10++;
        }
    }

    public final boolean weakCompareAndSet(int i7, double d2, double d10) {
        return this.longs.weakCompareAndSet(i7, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d10));
    }

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            jArr[i7] = Double.doubleToRawLongBits(dArr[i7]);
        }
        this.longs = new AtomicLongArray(jArr);
    }
}
