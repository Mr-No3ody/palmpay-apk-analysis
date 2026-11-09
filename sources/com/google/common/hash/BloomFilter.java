package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.horcrux.svg.d0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private final BloomFilterStrategies.LockFreeBitArray bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final Funnel<? super T> funnel;
        final int numHashFunctions;
        final Strategy strategy;

        public SerialForm(BloomFilter<T> bloomFilter) {
            this.data = BloomFilterStrategies.LockFreeBitArray.toPlainArray(((BloomFilter) bloomFilter).bits.data);
            this.numHashFunctions = ((BloomFilter) bloomFilter).numHashFunctions;
            this.funnel = ((BloomFilter) bloomFilter).funnel;
            this.strategy = ((BloomFilter) bloomFilter).strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    public interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i7, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i7, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i7, double d2) {
        return create(funnel, i7, d2);
    }

    @VisibleForTesting
    public static long optimalNumOfBits(long j6, double d2) {
        if (d2 == 0.0d) {
            d2 = Double.MIN_VALUE;
        }
        return (long) ((Math.log(d2) * (-j6)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @VisibleForTesting
    public static int optimalNumOfHashFunctions(long j6, long j10) {
        return Math.max(1, (int) Math.round(Math.log(2.0d) * (j10 / j6)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i7;
        int i10;
        Preconditions.checkNotNull(inputStream, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        int i11 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte b7 = dataInputStream.readByte();
            try {
                i10 = UnsignedBytes.toInt(dataInputStream.readByte());
                try {
                    i11 = dataInputStream.readInt();
                    BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[b7];
                    BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new BloomFilterStrategies.LockFreeBitArray(LongMath.checkedMultiply(i11, 64L));
                    for (int i12 = 0; i12 < i11; i12++) {
                        lockFreeBitArray.putData(i12, dataInputStream.readLong());
                    }
                    return new BloomFilter<>(lockFreeBitArray, i10, funnel, bloomFilterStrategies);
                } catch (RuntimeException e10) {
                    e = e10;
                    int i13 = i11;
                    i11 = b7;
                    i7 = i13;
                    StringBuilder sb2 = new StringBuilder(134);
                    sb2.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                    sb2.append(i11);
                    sb2.append(" numHashFunctions: ");
                    sb2.append(i10);
                    throw new IOException(d0.n(i7, " dataLength: ", sb2), e);
                }
            } catch (RuntimeException e11) {
                e = e11;
                i10 = -1;
                i11 = b7;
                i7 = -1;
            }
        } catch (RuntimeException e12) {
            e = e12;
            i7 = -1;
            i10 = -1;
        }
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t) {
        return mightContain(t);
    }

    public long approximateElementCount() {
        double dBitSize = this.bits.bitSize();
        return DoubleMath.roundToLong(((-Math.log1p(-(this.bits.bitCount() / dBitSize))) * dBitSize) / ((double) this.numHashFunctions), RoundingMode.HALF_UP);
    }

    @VisibleForTesting
    public long bitSize() {
        return this.bits.bitSize();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.copy(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) obj;
            if (this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy)) {
                return true;
            }
        }
        return false;
    }

    public double expectedFpp() {
        return Math.pow(this.bits.bitCount() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(@ParametricNullness T t) {
        return this.strategy.mightContain(t, this.funnel, this.numHashFunctions, this.bits);
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness T t) {
        return this.strategy.put(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        Preconditions.checkArgument(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i7 = this.numHashFunctions;
        int i10 = bloomFilter.numHashFunctions;
        Preconditions.checkArgument(i7 == i10, "BloomFilters must have the same number of hash functions (%s != %s)", i7, i10);
        Preconditions.checkArgument(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        Preconditions.checkArgument(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        Preconditions.checkArgument(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.putAll(bloomFilter.bits);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.checkedCast(this.strategy.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.checkedCast(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.data.length());
        for (int i7 = 0; i7 < this.bits.data.length(); i7++) {
            dataOutputStream.writeLong(this.bits.data.get(i7));
        }
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i7, Funnel<? super T> funnel, Strategy strategy) {
        Preconditions.checkArgument(i7 > 0, "numHashFunctions (%s) must be > 0", i7);
        Preconditions.checkArgument(i7 <= 255, "numHashFunctions (%s) must be <= 255", i7);
        this.bits = (BloomFilterStrategies.LockFreeBitArray) Preconditions.checkNotNull(lockFreeBitArray);
        this.numHashFunctions = i7;
        this.funnel = (Funnel) Preconditions.checkNotNull(funnel);
        this.strategy = (Strategy) Preconditions.checkNotNull(strategy);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j6, double d2) {
        return create(funnel, j6, d2, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    @VisibleForTesting
    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j6, double d2, Strategy strategy) {
        Preconditions.checkNotNull(funnel);
        Preconditions.checkArgument(j6 >= 0, "Expected insertions (%s) must be >= 0", j6);
        Preconditions.checkArgument(d2 > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d2));
        Preconditions.checkArgument(d2 < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d2));
        Preconditions.checkNotNull(strategy);
        if (j6 == 0) {
            j6 = 1;
        }
        long jOptimalNumOfBits = optimalNumOfBits(j6, d2);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.LockFreeBitArray(jOptimalNumOfBits), optimalNumOfHashFunctions(j6, jOptimalNumOfBits), funnel, strategy);
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Could not create BloomFilter of ");
            sb2.append(jOptimalNumOfBits);
            sb2.append(" bits");
            throw new IllegalArgumentException(sb2.toString(), e10);
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i7) {
        return create(funnel, i7);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j6) {
        return create(funnel, j6, 0.03d);
    }
}
