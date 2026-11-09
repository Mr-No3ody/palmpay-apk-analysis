package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    public ObjectCountLinkedHashMap() {
        this(3);
    }

    public static <K> ObjectCountLinkedHashMap<K> create() {
        return new ObjectCountLinkedHashMap<>();
    }

    public static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i7) {
        return new ObjectCountLinkedHashMap<>(i7);
    }

    private int getPredecessor(int i7) {
        return (int) (this.links[i7] >>> 32);
    }

    private int getSuccessor(int i7) {
        return (int) this.links[i7];
    }

    private void setPredecessor(int i7, int i10) {
        long[] jArr = this.links;
        jArr[i7] = (jArr[i7] & 4294967295L) | (((long) i10) << 32);
    }

    private void setSucceeds(int i7, int i10) {
        if (i7 == -2) {
            this.firstEntry = i10;
        } else {
            setSuccessor(i7, i10);
        }
        if (i10 == -2) {
            this.lastEntry = i7;
        } else {
            setPredecessor(i10, i7);
        }
    }

    private void setSuccessor(int i7, int i10) {
        long[] jArr = this.links;
        jArr[i7] = (jArr[i7] & (-4294967296L)) | (((long) i10) & 4294967295L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
        int i7 = this.firstEntry;
        if (i7 == -2) {
            return -1;
        }
        return i7;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int i7, float f10) {
        super.init(i7, f10);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i7];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int i7, @ParametricNullness K k2, int i10, int i11) {
        super.insertEntry(i7, k2, i10, i11);
        setSucceeds(this.lastEntry, i7);
        setSucceeds(i7, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int i7) {
        int size = size() - 1;
        setSucceeds(getPredecessor(i7), getSuccessor(i7));
        if (i7 < size) {
            setSucceeds(getPredecessor(size), i7);
            setSucceeds(i7, getSuccessor(size));
        }
        super.moveLastEntry(i7);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int i7) {
        int successor = getSuccessor(i7);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int i7, int i10) {
        return i7 == size() ? i10 : i7;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int i7) {
        super.resizeEntries(i7);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i7);
        this.links = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i7, -1L);
    }

    public ObjectCountLinkedHashMap(int i7) {
        this(i7, 1.0f);
    }

    public ObjectCountLinkedHashMap(int i7, float f10) {
        super(i7, f10);
    }

    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }
}
