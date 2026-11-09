package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();

    @VisibleForTesting
    @CheckForNull
    transient int[] entries;

    @CheckForNull
    private transient Set<Map.Entry<K, V>> entrySetView;

    @CheckForNull
    private transient Set<K> keySetView;

    @VisibleForTesting
    @CheckForNull
    transient Object[] keys;
    private transient int metadata;
    private transient int size;

    @CheckForNull
    private transient Object table;

    @VisibleForTesting
    @CheckForNull
    transient Object[] values;

    @CheckForNull
    private transient Collection<V> valuesView;

    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iIndexOf = CompactHashMap.this.indexOf(entry.getKey());
                if (iIndexOf != -1 && Objects.equal(CompactHashMap.this.value(iIndexOf), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iHashTableMask;
            int iRemove;
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.needsAllocArrays() || (iRemove = CompactHashing.remove(entry.getKey(), entry.getValue(), (iHashTableMask = CompactHashMap.this.hashTableMask()), CompactHashMap.this.requireTable(), CompactHashMap.this.requireEntries(), CompactHashMap.this.requireKeys(), CompactHashMap.this.requireValues())) == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iRemove, iHashTableMask);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        private Itr() {
            this.expectedMetadata = CompactHashMap.this.metadata;
            this.currentIndex = CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        private void checkForConcurrentModification() {
            if (CompactHashMap.this.metadata != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }

        @ParametricNullness
        public abstract T getOutput(int i7);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        public void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i7 = this.currentIndex;
            this.indexToRemove = i7;
            T output = getOutput(i7);
            this.currentIndex = CompactHashMap.this.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.indexToRemove));
            this.currentIndex = CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }
    }

    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.keySet().remove(obj);
            }
            return CompactHashMap.this.removeHelper(obj) != CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class MapEntry extends AbstractMapEntry<K, V> {

        @ParametricNullness
        private final K key;
        private int lastKnownIndex;

        public MapEntry(int i7) {
            this.key = (K) CompactHashMap.this.key(i7);
            this.lastKnownIndex = i7;
        }

        private void updateLastKnownIndex() {
            int i7 = this.lastKnownIndex;
            if (i7 == -1 || i7 >= CompactHashMap.this.size() || !Objects.equal(this.key, CompactHashMap.this.key(this.lastKnownIndex))) {
                this.lastKnownIndex = CompactHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i7 = this.lastKnownIndex;
            return i7 == -1 ? (V) NullnessCasts.unsafeNull() : (V) CompactHashMap.this.value(i7);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v3) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.put(this.key, v3));
            }
            updateLastKnownIndex();
            int i7 = this.lastKnownIndex;
            if (i7 == -1) {
                CompactHashMap.this.put(this.key, v3);
                return (V) NullnessCasts.unsafeNull();
            }
            V v4 = (V) CompactHashMap.this.value(i7);
            CompactHashMap.this.setValue(this.lastKnownIndex, v3);
            return v4;
        }
    }

    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i7 = compactHashMap.size;
        compactHashMap.size = i7 - 1;
        return i7;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i7) {
        return new CompactHashMap<>(i7);
    }

    private int entry(int i7) {
        return requireEntries()[i7];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i7 = iTableGet - 1;
            int iEntry = entry(i7);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && Objects.equal(obj, key(i7))) {
                return i7;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i7) {
        return (K) requireKeys()[i7];
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
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(obj, null, iHashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (iRemove == -1) {
            return NOT_FOUND;
        }
        V vValue = value(iRemove);
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return vValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
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

    private void setEntry(int i7, int i10) {
        requireEntries()[i7] = i10;
    }

    private void setHashTableMask(int i7) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i7), 31);
    }

    private void setKey(int i7, K k2) {
        requireKeys()[i7] = k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i7, V v3) {
        requireValues()[i7] = v3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i7) {
        return (V) requireValues()[i7];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public void accessEntry(int i7) {
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
        this.keys = new Object[i7];
        this.values = new Object[i7];
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsKey(obj);
        }
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.size; i7++) {
            if (Objects.equal(obj, value(i7))) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new EntrySetView();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i7) {
        return new LinkedHashMap(i7, 1.0f);
    }

    public Set<K> createKeySet() {
        return new KeySetView();
    }

    public Collection<V> createValues() {
        return new ValuesView();
    }

    @VisibleForTesting
    @CheckForNull
    public Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            @Override // com.google.common.collect.CompactHashMap.Itr
            public Map.Entry<K, V> getOutput(int i7) {
                return new MapEntry(i7);
            }
        };
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
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

    public void insertEntry(int i7, @ParametricNullness K k2, @ParametricNullness V v3, int i10, int i11) {
        setEntry(i7, CompactHashing.maskCombine(i10, 0, i11));
        setKey(i7, k2);
        setValue(i7, v3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            public K getOutput(int i7) {
                return (K) CompactHashMap.this.key(i7);
            }
        };
    }

    public void moveLastEntry(int i7, int i10) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i11 = size - 1;
        if (i7 >= i11) {
            objArrRequireKeys[i7] = null;
            objArrRequireValues[i7] = null;
            iArrRequireEntries[i7] = 0;
            return;
        }
        Object obj = objArrRequireKeys[i11];
        objArrRequireKeys[i7] = obj;
        objArrRequireValues[i7] = objArrRequireValues[i11];
        objArrRequireKeys[i11] = null;
        objArrRequireValues[i11] = null;
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

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k2, @ParametricNullness V v3) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k2, v3);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i7 = this.size;
        int i10 = i7 + 1;
        int iSmearedHash = Hashing.smearedHash(k2);
        int iHashTableMask = hashTableMask();
        int i11 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i11);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i12 = 0;
            while (true) {
                int i13 = iTableGet - 1;
                int i14 = iArrRequireEntries[i13];
                if (CompactHashing.getHashPrefix(i14, iHashTableMask) == hashPrefix && Objects.equal(k2, objArrRequireKeys[i13])) {
                    V v4 = (V) objArrRequireValues[i13];
                    objArrRequireValues[i13] = v3;
                    accessEntry(i13);
                    return v4;
                }
                int next = CompactHashing.getNext(i14, iHashTableMask);
                i12++;
                if (next == 0) {
                    if (i12 < 9) {
                        if (i10 <= iHashTableMask) {
                            iArrRequireEntries[i13] = CompactHashing.maskCombine(i14, i10, iHashTableMask);
                            break;
                        }
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i7);
                        break;
                    }
                    return convertToHashFloodingResistantImplementation().put(k2, v3);
                }
                k2 = k2;
                v3 = v3;
                iTableGet = next;
            }
        } else if (i10 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i7);
        } else {
            CompactHashing.tableSet(requireTable(), i11, i10);
        }
        int i15 = iHashTableMask;
        resizeMeMaybe(i10);
        insertEntry(i7, k2, v3, iSmearedHash, i15);
        this.size = i10;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v3 = (V) removeHelper(obj);
        if (v3 == NOT_FOUND) {
            return null;
        }
        return v3;
    }

    public void resizeEntries(int i7) {
        this.entries = Arrays.copyOf(requireEntries(), i7);
        this.keys = Arrays.copyOf(requireKeys(), i7);
        this.values = Arrays.copyOf(requireValues(), i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.size;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.table = mapCreateHashFloodingResistantDelegate;
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

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            public V getOutput(int i7) {
                return (V) CompactHashMap.this.value(i7);
            }
        };
    }

    public CompactHashMap(int i7) {
        init(i7);
    }
}
