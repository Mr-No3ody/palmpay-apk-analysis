package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    @CheckForNull
    transient long[] links;

    public CompactLinkedHashMap() {
        this(3);
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i7) {
        return new CompactLinkedHashMap<>(i7);
    }

    private int getPredecessor(int i7) {
        return ((int) (link(i7) >>> 32)) - 1;
    }

    private long link(int i7) {
        return requireLinks()[i7];
    }

    private long[] requireLinks() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void setLink(int i7, long j6) {
        requireLinks()[i7] = j6;
    }

    private void setPredecessor(int i7, int i10) {
        setLink(i7, (link(i7) & 4294967295L) | (((long) (i10 + 1)) << 32));
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
        setLink(i7, (link(i7) & (-4294967296L)) | (((long) (i10 + 1)) & 4294967295L));
    }

    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i7) {
        if (this.accessOrder) {
            setSucceeds(getPredecessor(i7), getSuccessor(i7));
            setSucceeds(this.lastEntry, i7);
            setSucceeds(i7, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i7, int i10) {
        return i7 >= size() ? i10 : i7;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> createHashFloodingResistantDelegate(int i7) {
        return new LinkedHashMap(i7, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i7) {
        return ((int) link(i7)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void init(int i7) {
        super.init(i7);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i7, @ParametricNullness K k2, @ParametricNullness V v3, int i10, int i11) {
        super.insertEntry(i7, k2, v3, i10, i11);
        setSucceeds(this.lastEntry, i7);
        setSucceeds(i7, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i7, int i10) {
        int size = size() - 1;
        super.moveLastEntry(i7, i10);
        setSucceeds(getPredecessor(i7), getSuccessor(i7));
        if (i7 < size) {
            setSucceeds(getPredecessor(size), i7);
            setSucceeds(i7, getSuccessor(size));
        }
        setLink(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i7) {
        super.resizeEntries(i7);
        this.links = Arrays.copyOf(requireLinks(), i7);
    }

    public CompactLinkedHashMap(int i7) {
        this(i7, false);
    }

    public CompactLinkedHashMap(int i7, boolean z3) {
        super(i7);
        this.accessOrder = z3;
    }
}
