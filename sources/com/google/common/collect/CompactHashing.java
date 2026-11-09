package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    private CompactHashing() {
    }

    public static Object createTable(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(com.airbnb.lottie.model.layer.d.g(52, i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i7 <= 256) {
            return new byte[i7];
        }
        return i7 <= SHORT_MAX_SIZE ? new short[i7] : new int[i7];
    }

    public static int getHashPrefix(int i7, int i10) {
        return i7 & (~i10);
    }

    public static int getNext(int i7, int i10) {
        return i7 & i10;
    }

    public static int maskCombine(int i7, int i10, int i11) {
        return (i7 & (~i11)) | (i10 & i11);
    }

    public static int newCapacity(int i7) {
        return (i7 + 1) * (i7 < 32 ? 4 : 2);
    }

    public static int remove(@CheckForNull Object obj, @CheckForNull Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int i10 = iSmearedHash & i7;
        int iTableGet = tableGet(obj3, i10);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(iSmearedHash, i7);
        int i11 = -1;
        while (true) {
            int i12 = iTableGet - 1;
            int i13 = iArr[i12];
            if (getHashPrefix(i13, i7) == hashPrefix && Objects.equal(obj, objArr[i12]) && (objArr2 == null || Objects.equal(obj2, objArr2[i12]))) {
                int next = getNext(i13, i7);
                if (i11 == -1) {
                    tableSet(obj3, i10, next);
                    return i12;
                }
                iArr[i11] = maskCombine(iArr[i11], next, i7);
                return i12;
            }
            int next2 = getNext(i13, i7);
            if (next2 == 0) {
                return -1;
            }
            i11 = i12;
            iTableGet = next2;
        }
    }

    public static void tableClear(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int tableGet(Object obj, int i7) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & UnsignedBytes.MAX_VALUE;
        }
        return obj instanceof short[] ? ((short[]) obj)[i7] & SHORT_MASK : ((int[]) obj)[i7];
    }

    public static void tableSet(Object obj, int i7, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }

    public static int tableSize(int i7) {
        return Math.max(4, Hashing.closedTableSize(i7 + 1, 1.0d));
    }
}
