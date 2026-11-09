package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @VisibleForTesting
    @CheckForNull
    transient Object[] elements;

    @CheckForNull
    private transient int[] entries;
    private transient int metadata;
    private transient int size;

    @CheckForNull
    private transient Object table;

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    private Set<E> createHashFloodingResistantDelegate(int i7) {
        return new LinkedHashSet(i7, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i7) {
        return new CompactHashSet<>(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i7) {
        return (E) requireElements()[i7];
    }

    private int entry(int i7) {
        return requireEntries()[i7];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i7 = objectInputStream.readInt();
        if (i7 < 0) {
            throw new InvalidObjectException(com.airbnb.lottie.model.layer.d.g(25, i7, "Invalid size: "));
        }
        init(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            add(objectInputStream.readObject());
        }
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void resizeMeMaybe(int i7) {
        int iMin;
        int length = requireEntries().length;
        if (i7 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i7, int i10, int i11, int i12) {
        Object objCreateTable = CompactHashing.createTable(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            CompactHashing.tableSet(objCreateTable, i11 & i13, i12 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i14 = 0; i14 <= i7; i14++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i14);
            while (iTableGet != 0) {
                int i15 = iTableGet - 1;
                int i16 = iArrRequireEntries[i15];
                int hashPrefix = CompactHashing.getHashPrefix(i16, i7) | i14;
                int i17 = hashPrefix & i13;
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i17);
                CompactHashing.tableSet(objCreateTable, i17, iTableGet);
                iArrRequireEntries[i15] = CompactHashing.maskCombine(hashPrefix, iTableGet2, i13);
                iTableGet = CompactHashing.getNext(i16, i7);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i13);
        return i13;
    }

    private void setElement(int i7, E e10) {
        requireElements()[i7] = e10;
    }

    private void setEntry(int i7, int i10) {
        requireEntries()[i7] = i10;
    }

    private void setHashTableMask(int i7) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i7), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e10) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(e10);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int i7 = this.size;
        int i10 = i7 + 1;
        int iSmearedHash = Hashing.smearedHash(e10);
        int iHashTableMask = hashTableMask();
        int i11 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i11);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i12 = 0;
            while (true) {
                int i13 = iTableGet - 1;
                int i14 = iArrRequireEntries[i13];
                if (CompactHashing.getHashPrefix(i14, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(e10, objArrRequireElements[i13])) {
                    return false;
                }
                int next = CompactHashing.getNext(i14, iHashTableMask);
                i12++;
                if (next != 0) {
                    iTableGet = next;
                } else {
                    if (i12 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e10);
                    }
                    if (i10 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i7);
                    } else {
                        iArrRequireEntries[i13] = CompactHashing.maskCombine(i14, i10, iHashTableMask);
                    }
                }
            }
        } else if (i10 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i7);
        } else {
            CompactHashing.tableSet(requireTable(), i11, i10);
        }
        resizeMeMaybe(i10);
        insertEntry(i7, e10, iSmearedHash, iHashTableMask);
        this.size = i10;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i7, int i10) {
        return i7 - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i7 = this.metadata;
        int iTableSize = CompactHashing.tableSize(i7);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i7];
        this.elements = new Object[i7];
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            setDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return false;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i7 = iTableGet - 1;
            int iEntry = entry(i7);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(obj, element(i7))) {
                return true;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return false;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setCreateHashFloodingResistantDelegate.add(element(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = setCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return setCreateHashFloodingResistantDelegate;
    }

    @VisibleForTesting
    @CheckForNull
    public Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public int getSuccessor(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.size) {
            return i10;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i7) {
        Preconditions.checkArgument(i7 >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i7, 1, 1073741823);
    }

    public void insertEntry(int i7, @ParametricNullness E e10, int i10, int i11) {
        setEntry(i7, CompactHashing.maskCombine(i10, 0, i11));
        setElement(i7, e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @VisibleForTesting
    public boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.iterator() : new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1
            int currentIndex;
            int expectedMetadata;
            int indexToRemove = -1;

            {
                this.expectedMetadata = CompactHashSet.this.metadata;
                this.currentIndex = CompactHashSet.this.firstEntryIndex();
            }

            private void checkForConcurrentModification() {
                if (CompactHashSet.this.metadata != this.expectedMetadata) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            public void incrementExpectedModCount() {
                this.expectedMetadata += 32;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                checkForConcurrentModification();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.currentIndex;
                this.indexToRemove = i7;
                E e10 = (E) CompactHashSet.this.element(i7);
                this.currentIndex = CompactHashSet.this.getSuccessor(this.currentIndex);
                return e10;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForConcurrentModification();
                CollectPreconditions.checkRemove(this.indexToRemove >= 0);
                incrementExpectedModCount();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.element(this.indexToRemove));
                this.currentIndex = CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
                this.indexToRemove = -1;
            }
        };
    }

    public void moveLastEntry(int i7, int i10) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int size = size();
        int i11 = size - 1;
        if (i7 >= i11) {
            objArrRequireElements[i7] = null;
            iArrRequireEntries[i7] = 0;
            return;
        }
        Object obj = objArrRequireElements[i11];
        objArrRequireElements[i7] = obj;
        objArrRequireElements[i11] = null;
        iArrRequireEntries[i7] = iArrRequireEntries[i11];
        iArrRequireEntries[i11] = 0;
        int iSmearedHash = Hashing.smearedHash(obj) & i10;
        int iTableGet = CompactHashing.tableGet(objRequireTable, iSmearedHash);
        if (iTableGet == size) {
            CompactHashing.tableSet(objRequireTable, iSmearedHash, i7 + 1);
            return;
        }
        while (true) {
            int i12 = iTableGet - 1;
            int i13 = iArrRequireEntries[i12];
            int next = CompactHashing.getNext(i13, i10);
            if (next == size) {
                iArrRequireEntries[i12] = CompactHashing.maskCombine(i13, i7 + 1, i10);
                return;
            }
            iTableGet = next;
        }
    }

    @VisibleForTesting
    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(obj, null, iHashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (iRemove == -1) {
            return false;
        }
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i7) {
        this.entries = Arrays.copyOf(requireEntries(), i7);
        this.elements = Arrays.copyOf(requireElements(), i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            setCreateHashFloodingResistantDelegate.addAll(setDelegateOrNull);
            this.table = setCreateHashFloodingResistantDelegate;
            return;
        }
        int i7 = this.size;
        if (i7 < requireEntries().length) {
            resizeEntries(i7);
        }
        int iTableSize = CompactHashing.tableSize(i7);
        int iHashTableMask = hashTableMask();
        if (iTableSize < iHashTableMask) {
            resizeTable(iHashTableMask, iTableSize, 0, 0);
        }
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    public CompactHashSet(int i7) {
        init(i7);
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return (T[]) setDelegateOrNull.toArray(tArr);
        }
        return (T[]) ObjectArrays.toArrayImpl(requireElements(), 0, this.size, tArr);
    }
}
