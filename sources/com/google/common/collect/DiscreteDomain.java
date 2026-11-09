package com.google.common.collect;

import N8.q0;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {
    final boolean supportsFastOffset;

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {
        private static final long serialVersionUID = 0;
        private static final BigIntegerDomain INSTANCE = new BigIntegerDomain();
        private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
        private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);

        public BigIntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger offset(BigInteger bigInteger, long j6) {
            CollectPreconditions.checkNonnegative(j6, "distance");
            return bigInteger.add(BigInteger.valueOf(j6));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        private static final IntegerDomain INSTANCE = new IntegerDomain();
        private static final long serialVersionUID = 0;

        public IntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer offset(Integer num, long j6) {
            CollectPreconditions.checkNonnegative(j6, "distance");
            return Integer.valueOf(Ints.checkedCast(num.longValue() + j6));
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        private static final LongDomain INSTANCE = new LongDomain();
        private static final long serialVersionUID = 0;

        public LongDomain() {
            super(true);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Long l5, Long l6) {
            long jLongValue = l6.longValue() - l5.longValue();
            if (l6.longValue() > l5.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l6.longValue() >= l5.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public Long next(Long l5) {
            long jLongValue = l5.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long offset(Long l5, long j6) {
            CollectPreconditions.checkNonnegative(j6, "distance");
            long jLongValue = l5.longValue() + j6;
            if (jLongValue < 0) {
                Preconditions.checkArgument(l5.longValue() < 0, ViewProps.OVERFLOW);
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @CheckForNull
        public Long previous(Long l5) {
            long jLongValue = l5.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.INSTANCE;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.INSTANCE;
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.INSTANCE;
    }

    public abstract long distance(C c6, C c10);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    @CheckForNull
    public abstract C next(C c6);

    public C offset(C c6, long j6) {
        CollectPreconditions.checkNonnegative(j6, "distance");
        C c10 = c6;
        for (long j10 = 0; j10 < j6; j10++) {
            c10 = (C) next(c10);
            if (c10 == null) {
                String strValueOf = String.valueOf(c6);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 51);
                sb2.append("overflowed computing offset(");
                sb2.append(strValueOf);
                sb2.append(", ");
                throw new IllegalArgumentException(q0.n(sb2, ")", j6));
            }
        }
        return c10;
    }

    @CheckForNull
    public abstract C previous(C c6);

    public DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z3) {
        this.supportsFastOffset = z3;
    }
}
