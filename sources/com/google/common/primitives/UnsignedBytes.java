package com.google.common.primitives;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    @VisibleForTesting
    public static class LexicographicalComparatorHolder {
        static final String UNSAFE_COMPARATOR_NAME = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i7 = 0; i7 < iMin; i7++) {
                    int iCompare = UnsignedBytes.compare(bArr[i7], bArr2[i7]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        @VisibleForTesting
        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e10) {
                        throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i7 = iMin & (-8);
                int i10 = 0;
                while (i10 < i7) {
                    Unsafe unsafe = theUnsafe;
                    int i11 = BYTE_ARRAY_BASE_OFFSET;
                    long j6 = i10;
                    long j10 = unsafe.getLong(bArr, ((long) i11) + j6);
                    long j11 = unsafe.getLong(bArr2, ((long) i11) + j6);
                    if (j10 != j11) {
                        if (BIG_ENDIAN) {
                            return UnsignedLongs.compare(j10, j11);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10 ^ j11) & (-8);
                        return ((int) ((j10 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j11 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i10 += 8;
                }
                while (i10 < iMin) {
                    int iCompare = UnsignedBytes.compare(bArr[i10], bArr2[i10]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i10++;
                }
                return bArr.length - bArr2.length;
            }
        }

        public static Comparator<byte[]> getBestComparator() {
            try {
                Object[] enumConstants = Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    private UnsignedBytes() {
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j6) {
        Preconditions.checkArgument((j6 >> 8) == 0, "out of range: %s", j6);
        return (byte) j6;
    }

    public static int compare(byte b7, byte b10) {
        return toInt(b7) - toInt(b10);
    }

    private static byte flip(byte b7) {
        return (byte) (b7 ^ MAX_POWER_OF_TWO);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((str.length() + 3) * bArr.length);
        sb2.append(toInt(bArr[0]));
        for (int i7 = 1; i7 < bArr.length; i7++) {
            sb2.append(str);
            sb2.append(toString(bArr[i7]));
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    @VisibleForTesting
    public static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i7 = toInt(bArr[0]);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            int i11 = toInt(bArr[i10]);
            if (i11 > i7) {
                i7 = i11;
            }
        }
        return (byte) i7;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i7 = toInt(bArr[0]);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            int i11 = toInt(bArr[i10]);
            if (i11 < i7) {
                i7 = i11;
            }
        }
        return (byte) i7;
    }

    @CanIgnoreReturnValue
    @Beta
    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte saturatedCast(long j6) {
        if (j6 > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j6 < 0) {
            return (byte) 0;
        }
        return (byte) j6;
    }

    public static void sort(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static int toInt(byte b7) {
        return b7 & MAX_VALUE;
    }

    @Beta
    public static String toString(byte b7) {
        return toString(b7, 10);
    }

    @CanIgnoreReturnValue
    @Beta
    public static byte parseUnsignedByte(String str, int i7) {
        int i10 = Integer.parseInt((String) Preconditions.checkNotNull(str), i7);
        if ((i10 >> 8) == 0) {
            return (byte) i10;
        }
        throw new NumberFormatException(d.g(25, i10, "out of range: "));
    }

    @Beta
    public static String toString(byte b7, int i7) {
        Preconditions.checkArgument(i7 >= 2 && i7 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i7);
        return Integer.toString(toInt(b7), i7);
    }

    public static void sort(byte[] bArr, int i7, int i10) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i7, i10, bArr.length);
        for (int i11 = i7; i11 < i10; i11++) {
            bArr[i11] = flip(bArr[i11]);
        }
        Arrays.sort(bArr, i7, i10);
        while (i7 < i10) {
            bArr[i7] = flip(bArr[i7]);
            i7++;
        }
    }

    public static void sortDescending(byte[] bArr, int i7, int i10) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i7, i10, bArr.length);
        for (int i11 = i7; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ Ascii.DEL);
        }
        Arrays.sort(bArr, i7, i10);
        while (i7 < i10) {
            bArr[i7] = (byte) (bArr[i7] ^ Ascii.DEL);
            i7++;
        }
    }
}
