package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;

    @CheckForNull
    volatile transient Cell[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    public static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        volatile long f22787p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        volatile long f22788p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        volatile long f22789p2;
        volatile long p3;

        /* JADX INFO: renamed from: p4, reason: collision with root package name */
        volatile long f22790p4;

        /* JADX INFO: renamed from: p5, reason: collision with root package name */
        volatile long f22791p5;

        /* JADX INFO: renamed from: p6, reason: collision with root package name */
        volatile long f22792p6;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        volatile long f22793q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        volatile long f22794q1;

        /* JADX INFO: renamed from: q2, reason: collision with root package name */
        volatile long f22795q2;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        volatile long f22796q3;

        /* JADX INFO: renamed from: q4, reason: collision with root package name */
        volatile long f22797q4;

        /* JADX INFO: renamed from: q5, reason: collision with root package name */
        volatile long f22798q5;

        /* JADX INFO: renamed from: q6, reason: collision with root package name */
        volatile long f22799q6;
        volatile long value;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        public Cell(long j6) {
            this.value = j6;
        }

        public final boolean cas(long j6, long j10) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, j6, j10);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("base"));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
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

    public final boolean casBase(long j6, long j10) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j6, j10);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    public abstract long fn(long j6, long j10);

    public final void internalReset(long j6) {
        Cell[] cellArr = this.cells;
        this.base = j6;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = j6;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    public final void retryUpdate(long j6, @CheckForNull int[] iArr, boolean z3) {
        int iNextInt;
        int[] iArr2;
        boolean z8;
        int length;
        boolean z10;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            threadHashCode.set(iArr2);
            iNextInt = rng.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z11 = false;
        int i7 = iNextInt;
        boolean z12 = z3;
        while (true) {
            Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                Cell cell = cellArr[(length - 1) & i7];
                if (cell == null) {
                    if (this.busy == 0) {
                        Cell cell2 = new Cell(j6);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                Cell[] cellArr2 = this.cells;
                                if (cellArr2 == null || (length2 = cellArr2.length) <= 0) {
                                    z10 = false;
                                } else {
                                    int i10 = (length2 - 1) & i7;
                                    if (cellArr2[i10] == null) {
                                        cellArr2[i10] = cell2;
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                }
                                this.busy = 0;
                                if (z10) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.busy = 0;
                                throw th;
                            }
                        }
                    }
                    z11 = false;
                    int i11 = i7 ^ (i7 << 13);
                    int i12 = i11 ^ (i11 >>> 17);
                    i7 = i12 ^ (i12 << 5);
                    iArr2[0] = i7;
                } else {
                    if (z12) {
                        long j10 = cell.value;
                        if (cell.cas(j10, fn(j10, j6))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != cellArr) {
                            z11 = false;
                        } else if (!z11) {
                            z11 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cellArr) {
                                    Cell[] cellArr3 = new Cell[length << 1];
                                    for (int i13 = 0; i13 < length; i13++) {
                                        cellArr3[i13] = cellArr[i13];
                                    }
                                    this.cells = cellArr3;
                                }
                                this.busy = 0;
                                z11 = false;
                            } catch (Throwable th2) {
                                this.busy = 0;
                                throw th2;
                            }
                        }
                    } else {
                        z12 = true;
                    }
                    int i14 = i7 ^ (i7 << 13);
                    int i15 = i14 ^ (i14 >>> 17);
                    i7 = i15 ^ (i15 << 5);
                    iArr2[0] = i7;
                }
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        Cell[] cellArr4 = new Cell[2];
                        cellArr4[i7 & 1] = new Cell(j6);
                        this.cells = cellArr4;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.busy = 0;
                    if (z8) {
                        return;
                    }
                } catch (Throwable th3) {
                    this.busy = 0;
                    throw th3;
                }
            } else {
                long j11 = this.base;
                if (casBase(j11, fn(j11, j6))) {
                    return;
                }
            }
        }
    }
}
