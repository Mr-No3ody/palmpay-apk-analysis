package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @CheckForNull
    private transient int[] predecessor;

    @CheckForNull
    private transient int[] successor;

    public CompactLinkedHashSet() {
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i7) {
        return new CompactLinkedHashSet<>(i7);
    }

    private int getPredecessor(int i7) {
        return requirePredecessors()[i7] - 1;
    }

    private int[] requirePredecessors() {
        int[] iArr = this.predecessor;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] requireSuccessors() {
        int[] iArr = this.successor;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void setPredecessor(int i7, int i10) {
        requirePredecessors()[i7] = i10 + 1;
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
        requireSuccessors()[i7] = i10 + 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int adjustAfterRemove(int i7, int i10) {
        return i7 >= size() ? i10 : i7;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.predecessor = new int[iAllocArrays];
        this.successor = new int[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        int[] iArr = this.predecessor;
        if (iArr != null && this.successor != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.successor, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.predecessor = null;
        this.successor = null;
        return setConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int getSuccessor(int i7) {
        return requireSuccessors()[i7] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void init(int i7) {
        super.init(i7);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void insertEntry(int i7, @ParametricNullness E e10, int i10, int i11) {
        super.insertEntry(i7, e10, i10, i11);
        setSucceeds(this.lastEntry, i7);
        setSucceeds(i7, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void moveLastEntry(int i7, int i10) {
        int size = size() - 1;
        super.moveLastEntry(i7, i10);
        setSucceeds(getPredecessor(i7), getSuccessor(i7));
        if (i7 < size) {
            setSucceeds(getPredecessor(size), i7);
            setSucceeds(i7, getSuccessor(size));
        }
        requirePredecessors()[size] = 0;
        requireSuccessors()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void resizeEntries(int i7) {
        super.resizeEntries(i7);
        this.predecessor = Arrays.copyOf(requirePredecessors(), i7);
        this.successor = Arrays.copyOf(requireSuccessors(), i7);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return ObjectArrays.toArrayImpl(this);
    }

    public CompactLinkedHashSet(int i7) {
        super(i7);
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactLinkedHashSetCreateWithExpectedSize.addAll(collection);
        return compactLinkedHashSetCreateWithExpectedSize;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.toArrayImpl(this, tArr);
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactLinkedHashSetCreateWithExpectedSize, eArr);
        return compactLinkedHashSetCreateWithExpectedSize;
    }
}
