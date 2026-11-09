package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @VisibleForTesting
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    public class MapEntry extends Multisets.AbstractEntry<K> {

        @ParametricNullness
        final K key;
        int lastKnownIndex;

        public MapEntry(int i7) {
            this.key = (K) ObjectCountHashMap.this.keys[i7];
            this.lastKnownIndex = i7;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            int i7 = this.lastKnownIndex;
            if (i7 == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.values[i7];
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.key;
        }

        @CanIgnoreReturnValue
        public int setCount(int i7) {
            updateLastKnownIndex();
            int i10 = this.lastKnownIndex;
            if (i10 == -1) {
                ObjectCountHashMap.this.put(this.key, i7);
                return 0;
            }
            int[] iArr = ObjectCountHashMap.this.values;
            int i11 = iArr[i10];
            iArr[i10] = i7;
            return i11;
        }

        public void updateLastKnownIndex() {
            int i7 = this.lastKnownIndex;
            if (i7 == -1 || i7 >= ObjectCountHashMap.this.size() || !Objects.equal(this.key, ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = ObjectCountHashMap.this.indexOf(this.key);
            }
        }
    }

    public ObjectCountHashMap() {
        init(3, 1.0f);
    }

    public static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap<>();
    }

    public static <K> ObjectCountHashMap<K> createWithExpectedSize(int i7) {
        return new ObjectCountHashMap<>(i7);
    }

    private static int getHash(long j6) {
        return (int) (j6 >>> 32);
    }

    private static int getNext(long j6) {
        return (int) j6;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long[] newEntries(int i7) {
        long[] jArr = new long[i7];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int i7) {
        int[] iArr = new int[i7];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void resizeMeMaybe(int i7) {
        int length = this.entries.length;
        if (i7 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    private void resizeTable(int i7) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i10 = ((int) (i7 * this.loadFactor)) + 1;
        int[] iArrNewTable = newTable(i7);
        long[] jArr = this.entries;
        int length = iArrNewTable.length - 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            int hash = getHash(jArr[i11]);
            int i12 = hash & length;
            int i13 = iArrNewTable[i12];
            iArrNewTable[i12] = i11;
            jArr[i11] = (((long) hash) << 32) | (((long) i13) & NEXT_MASK);
        }
        this.threshold = i10;
        this.table = iArrNewTable;
    }

    private static long swapNext(long j6, int i7) {
        return (j6 & HASH_MASK) | (NEXT_MASK & ((long) i7));
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i7) {
        if (i7 > this.entries.length) {
            resizeEntries(i7);
        }
        if (i7 >= this.threshold) {
            resizeTable(Math.max(2, Integer.highestOneBit(i7 - 1) << 1));
        }
    }

    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(@CheckForNull Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        return this.values[iIndexOf];
    }

    public Multiset.Entry<K> getEntry(int i7) {
        Preconditions.checkElementIndex(i7, this.size);
        return new MapEntry(i7);
    }

    @ParametricNullness
    public K getKey(int i7) {
        Preconditions.checkElementIndex(i7, this.size);
        return (K) this.keys[i7];
    }

    public int getValue(int i7) {
        Preconditions.checkElementIndex(i7, this.size);
        return this.values[i7];
    }

    public int indexOf(@CheckForNull Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int next = this.table[hashTableMask() & iSmearedHash];
        while (next != -1) {
            long j6 = this.entries[next];
            if (getHash(j6) == iSmearedHash && Objects.equal(obj, this.keys[next])) {
                return next;
            }
            next = getNext(j6);
        }
        return -1;
    }

    public void init(int i7, float f10) {
        Preconditions.checkArgument(i7 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f10 > 0.0f, "Illegal load factor");
        int iClosedTableSize = Hashing.closedTableSize(i7, f10);
        this.table = newTable(iClosedTableSize);
        this.loadFactor = f10;
        this.keys = new Object[i7];
        this.values = new int[i7];
        this.entries = newEntries(i7);
        this.threshold = Math.max(1, (int) (iClosedTableSize * f10));
    }

    public void insertEntry(int i7, @ParametricNullness K k2, int i10, int i11) {
        this.entries[i7] = (((long) i11) << 32) | NEXT_MASK;
        this.keys[i7] = k2;
        this.values[i7] = i10;
    }

    public void moveLastEntry(int i7) {
        int size = size() - 1;
        if (i7 >= size) {
            this.keys[i7] = null;
            this.values[i7] = 0;
            this.entries[i7] = -1;
            return;
        }
        Object[] objArr = this.keys;
        objArr[i7] = objArr[size];
        int[] iArr = this.values;
        iArr[i7] = iArr[size];
        objArr[size] = null;
        iArr[size] = 0;
        long[] jArr = this.entries;
        long j6 = jArr[size];
        jArr[i7] = j6;
        jArr[size] = -1;
        int hash = getHash(j6) & hashTableMask();
        int[] iArr2 = this.table;
        int i10 = iArr2[hash];
        if (i10 == size) {
            iArr2[hash] = i7;
            return;
        }
        while (true) {
            long j10 = this.entries[i10];
            int next = getNext(j10);
            if (next == size) {
                this.entries[i10] = swapNext(j10, i7);
                return;
            }
            i10 = next;
        }
    }

    public int nextIndex(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.size) {
            return i10;
        }
        return -1;
    }

    public int nextIndexAfterRemove(int i7, int i10) {
        return i7 - 1;
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k2, int i7) {
        CollectPreconditions.checkPositive(i7, CodePushConstants.LATEST_ROLLBACK_COUNT_KEY);
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int iSmearedHash = Hashing.smearedHash(k2);
        int iHashTableMask = hashTableMask() & iSmearedHash;
        int i10 = this.size;
        int[] iArr2 = this.table;
        int i11 = iArr2[iHashTableMask];
        if (i11 == -1) {
            iArr2[iHashTableMask] = i10;
        } else {
            while (true) {
                long j6 = jArr[i11];
                if (getHash(j6) == iSmearedHash && Objects.equal(k2, objArr[i11])) {
                    int i12 = iArr[i11];
                    iArr[i11] = i7;
                    return i12;
                }
                int next = getNext(j6);
                if (next == -1) {
                    jArr[i11] = swapNext(j6, i10);
                    break;
                }
                i11 = next;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i13 = i10 + 1;
        resizeMeMaybe(i13);
        insertEntry(i10, k2, i7, iSmearedHash);
        this.size = i13;
        if (i10 >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    @CanIgnoreReturnValue
    public int removeEntry(int i7) {
        return remove(this.keys[i7], getHash(this.entries[i7]));
    }

    public void resizeEntries(int i7) {
        this.keys = Arrays.copyOf(this.keys, i7);
        this.values = Arrays.copyOf(this.values, i7);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i7);
        if (i7 > length) {
            Arrays.fill(jArrCopyOf, length, i7, -1L);
        }
        this.entries = jArrCopyOf;
    }

    public void setValue(int i7, int i10) {
        Preconditions.checkElementIndex(i7, this.size);
        this.values[i7] = i10;
    }

    public int size() {
        return this.size;
    }

    private int remove(@CheckForNull Object obj, int i7) {
        int iHashTableMask = hashTableMask() & i7;
        int i10 = this.table[iHashTableMask];
        if (i10 == -1) {
            return 0;
        }
        int i11 = -1;
        while (true) {
            if (getHash(this.entries[i10]) == i7 && Objects.equal(obj, this.keys[i10])) {
                int i12 = this.values[i10];
                if (i11 == -1) {
                    this.table[iHashTableMask] = getNext(this.entries[i10]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i11] = swapNext(jArr[i11], getNext(jArr[i10]));
                }
                moveLastEntry(i10);
                this.size--;
                this.modCount++;
                return i12;
            }
            int next = getNext(this.entries[i10]);
            if (next == -1) {
                return 0;
            }
            i11 = i10;
            i10 = next;
        }
    }

    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }

    public ObjectCountHashMap(int i7) {
        this(i7, 1.0f);
    }

    public ObjectCountHashMap(int i7, float f10) {
        init(i7, f10);
    }
}
