package com.google.common.hash;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final LittleEndianBytes byteArray;

    public enum JavaLittleEndianBytes implements LittleEndianBytes {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i7) {
                return Longs.fromBytes(bArr[i7 + 7], bArr[i7 + 6], bArr[i7 + 5], bArr[i7 + 4], bArr[i7 + 3], bArr[i7 + 2], bArr[i7 + 1], bArr[i7]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i7, long j6) {
                long j10 = 255;
                for (int i10 = 0; i10 < 8; i10++) {
                    bArr[i7 + i10] = (byte) ((j6 & j10) >> (i10 * 8));
                    j10 <<= 8;
                }
            }
        }
    }

    public interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i7);

        void putLongLittleEndian(byte[] bArr, int i7, long j6);
    }

    public enum UnsafeByteArray implements LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i7) {
                return UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i7) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i7, long j6) {
                UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i7) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), j6);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i7) {
                return Long.reverseBytes(UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i7) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET)));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i7, long j6) {
                UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i7) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), Long.reverseBytes(j6));
            }
        };

        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final Unsafe theUnsafe;

        static {
            Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
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
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.3
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
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        byteArray = littleEndianBytes;
    }

    private LittleEndianByteArray() {
    }

    public static int load32(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i7] & UnsignedBytes.MAX_VALUE) | ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static long load64(byte[] bArr, int i7) {
        return byteArray.getLongLittleEndian(bArr, i7);
    }

    public static long load64Safely(byte[] bArr, int i7, int i10) {
        int iMin = Math.min(i10, 8);
        long j6 = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            j6 |= (((long) bArr[i7 + i11]) & 255) << (i11 * 8);
        }
        return j6;
    }

    public static void store64(byte[] bArr, int i7, long j6) {
        byteArray.putLongLittleEndian(bArr, i7, j6);
    }

    public static boolean usingUnsafe() {
        return byteArray instanceof UnsafeByteArray;
    }
}
