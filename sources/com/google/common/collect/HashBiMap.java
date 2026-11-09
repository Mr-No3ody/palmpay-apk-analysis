package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;

        public EntryForKey(int i7) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i7]);
            this.index = i7;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            int i7 = this.index;
            return i7 == -1 ? (V) NullnessCasts.unsafeNull() : (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i7]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v3) {
            updateIndex();
            int i7 = this.index;
            if (i7 == -1) {
                HashBiMap.this.put(this.key, v3);
                return (V) NullnessCasts.unsafeNull();
            }
            V v4 = (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i7]);
            if (Objects.equal(v4, v3)) {
                return v3;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v3, false);
            return v4;
        }

        public void updateIndex() {
            int i7 = this.index;
            if (i7 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i7 <= hashBiMap.size && Objects.equal(hashBiMap.keys[i7], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i7) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i7]);
            this.index = i7;
        }

        private void updateIndex() {
            int i7 = this.index;
            if (i7 != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i7 <= hashBiMap.size && Objects.equal(this.value, hashBiMap.values[i7])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            int i7 = this.index;
            return i7 == -1 ? (K) NullnessCasts.unsafeNull() : (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i7]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k2) {
            updateIndex();
            int i7 = this.index;
            if (i7 == -1) {
                this.biMap.putInverse(this.value, k2, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k8 = (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i7]);
            if (Objects.equal(k8, k2)) {
                return k2;
            }
            this.biMap.replaceKeyInEntry(this.index, k2, false);
            return k8;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (iFindEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int i7) {
            return new EntryForKey(i7);
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K forcePut(@ParametricNullness V v3, @ParametricNullness K k2) {
            return this.forward.putInverse(v3, k2, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K put(@ParametricNullness V v3, @ParametricNullness K k2) {
            return this.forward.putInverse(v3, k2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @CheckForNull
        public K remove(@CheckForNull Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByValue = this.biMap.findEntryByValue(key);
                if (iFindEntryByValue != -1 && Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int i7) {
            return new EntryForValue(this.biMap, i7);
        }
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public K forEntry(int i7) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i7]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iSmearedHash);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public V forEntry(int i7) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i7]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iSmearedHash);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        public View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        @ParametricNullness
        public abstract T forEntry(int i7);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                private void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t = (T) View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    int i7 = this.index;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    if (i7 == hashBiMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = hashBiMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }
    }

    private HashBiMap(int i7) {
        init(i7);
    }

    private int bucket(int i7) {
        return i7 & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int i7) {
        int[] iArr = new int[i7];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i7, int i10) {
        Preconditions.checkArgument(i7 != -1);
        int iBucket = bucket(i10);
        int[] iArr = this.hashTableKToV;
        int i11 = iArr[iBucket];
        if (i11 == i7) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[i7];
            iArr2[i7] = -1;
            return;
        }
        int i12 = this.nextInBucketKToV[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                String strValueOf = String.valueOf(this.keys[i7]);
                throw new AssertionError(com.airbnb.lottie.model.layer.d.h(strValueOf.length() + 32, "Expected to find entry with key ", strValueOf));
            }
            if (i11 == i7) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i13] = iArr3[i7];
                iArr3[i7] = -1;
                return;
            }
            i12 = this.nextInBucketKToV[i11];
        }
    }

    private void deleteFromTableVToK(int i7, int i10) {
        Preconditions.checkArgument(i7 != -1);
        int iBucket = bucket(i10);
        int[] iArr = this.hashTableVToK;
        int i11 = iArr[iBucket];
        if (i11 == i7) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[i7];
            iArr2[i7] = -1;
            return;
        }
        int i12 = this.nextInBucketVToK[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                String strValueOf = String.valueOf(this.values[i7]);
                throw new AssertionError(com.airbnb.lottie.model.layer.d.h(strValueOf.length() + 34, "Expected to find entry with value ", strValueOf));
            }
            if (i11 == i7) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i13] = iArr3[i7];
                iArr3[i7] = -1;
                return;
            }
            i12 = this.nextInBucketVToK[i11];
        }
    }

    private void ensureCapacity(int i7) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i7) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i7);
            this.keys = (K[]) Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i7) {
            int iClosedTableSize = Hashing.closedTableSize(i7, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i10 = 0; i10 < this.size; i10++) {
                int iBucket = bucket(Hashing.smearedHash(this.keys[i10]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i10] = iArr3[iBucket];
                iArr3[iBucket] = i10;
                int iBucket2 = bucket(Hashing.smearedHash(this.values[i10]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i10] = iArr5[iBucket2];
                iArr5[iBucket2] = i10;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i7) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
        Arrays.fill(iArrCopyOf, length, i7, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int i7, int i10) {
        Preconditions.checkArgument(i7 != -1);
        int iBucket = bucket(i10);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i7] = iArr2[iBucket];
        iArr2[iBucket] = i7;
    }

    private void insertIntoTableVToK(int i7, int i10) {
        Preconditions.checkArgument(i7 != -1);
        int iBucket = bucket(i10);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i7] = iArr2[iBucket];
        iArr2[iBucket] = i7;
    }

    private void moveEntryToIndex(int i7, int i10) {
        int i11;
        int i12;
        if (i7 == i10) {
            return;
        }
        int i13 = this.prevInInsertionOrder[i7];
        int i14 = this.nextInInsertionOrder[i7];
        setSucceeds(i13, i10);
        setSucceeds(i10, i14);
        K[] kArr = this.keys;
        K k2 = kArr[i7];
        V[] vArr = this.values;
        V v3 = vArr[i7];
        kArr[i10] = k2;
        vArr[i10] = v3;
        int iBucket = bucket(Hashing.smearedHash(k2));
        int[] iArr = this.hashTableKToV;
        int i15 = iArr[iBucket];
        if (i15 == i7) {
            iArr[iBucket] = i10;
        } else {
            int i16 = this.nextInBucketKToV[i15];
            while (true) {
                i11 = i15;
                i15 = i16;
                if (i15 == i7) {
                    break;
                } else {
                    i16 = this.nextInBucketKToV[i15];
                }
            }
            this.nextInBucketKToV[i11] = i10;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i10] = iArr2[i7];
        iArr2[i7] = -1;
        int iBucket2 = bucket(Hashing.smearedHash(v3));
        int[] iArr3 = this.hashTableVToK;
        int i17 = iArr3[iBucket2];
        if (i17 == i7) {
            iArr3[iBucket2] = i10;
        } else {
            int i18 = this.nextInBucketVToK[i17];
            while (true) {
                i12 = i17;
                i17 = i18;
                if (i17 == i7) {
                    break;
                } else {
                    i18 = this.nextInBucketVToK[i17];
                }
            }
            this.nextInBucketVToK[i12] = i10;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i10] = iArr4[i7];
        iArr4[i7] = -1;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        init(16);
        Serialization.populateMap(this, objectInputStream, count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i7, @ParametricNullness K k2, boolean z3) {
        int i10;
        Preconditions.checkArgument(i7 != -1);
        int iSmearedHash = Hashing.smearedHash(k2);
        int iFindEntryByKey = findEntryByKey(k2, iSmearedHash);
        int i11 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i10 = -2;
        } else {
            if (!z3) {
                String strValueOf = String.valueOf(k2);
                throw new IllegalArgumentException(com.airbnb.lottie.model.layer.d.h(strValueOf.length() + 28, "Key already present in map: ", strValueOf));
            }
            i11 = this.prevInInsertionOrder[iFindEntryByKey];
            i10 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (i7 == this.size) {
                i7 = iFindEntryByKey;
            }
        }
        if (i11 == i7) {
            i11 = this.prevInInsertionOrder[i7];
        } else if (i11 == this.size) {
            i11 = iFindEntryByKey;
        }
        if (i10 == i7) {
            iFindEntryByKey = this.nextInInsertionOrder[i7];
        } else if (i10 != this.size) {
            iFindEntryByKey = i10;
        }
        setSucceeds(this.prevInInsertionOrder[i7], this.nextInInsertionOrder[i7]);
        deleteFromTableKToV(i7, Hashing.smearedHash(this.keys[i7]));
        this.keys[i7] = k2;
        insertIntoTableKToV(i7, Hashing.smearedHash(k2));
        setSucceeds(i11, i7);
        setSucceeds(i7, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i7, @ParametricNullness V v3, boolean z3) {
        Preconditions.checkArgument(i7 != -1);
        int iSmearedHash = Hashing.smearedHash(v3);
        int iFindEntryByValue = findEntryByValue(v3, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (!z3) {
                String strValueOf = String.valueOf(v3);
                throw new IllegalArgumentException(com.airbnb.lottie.model.layer.d.h(strValueOf.length() + 30, "Value already present in map: ", strValueOf));
            }
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            if (i7 == this.size) {
                i7 = iFindEntryByValue;
            }
        }
        deleteFromTableVToK(i7, Hashing.smearedHash(this.values[i7]));
        this.values[i7] = v3;
        insertIntoTableVToK(i7, iSmearedHash);
    }

    private void setSucceeds(int i7, int i10) {
        if (i7 == -2) {
            this.firstInInsertionOrder = i10;
        } else {
            this.nextInInsertionOrder[i7] = i10;
        }
        if (i10 == -2) {
            this.lastInInsertionOrder = i7;
        } else {
            this.prevInInsertionOrder[i10] = i7;
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMap(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public int findEntry(@CheckForNull Object obj, int i7, int[] iArr, int[] iArr2, Object[] objArr) {
        int i10 = iArr[bucket(i7)];
        while (i10 != -1) {
            if (Objects.equal(objArr[i10], obj)) {
                return i10;
            }
            i10 = iArr2[i10];
        }
        return -1;
    }

    public int findEntryByKey(@CheckForNull Object obj) {
        return findEntryByKey(obj, Hashing.smearedHash(obj));
    }

    public int findEntryByValue(@CheckForNull Object obj) {
        return findEntryByValue(obj, Hashing.smearedHash(obj));
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V forcePut(@ParametricNullness K k2, @ParametricNullness V v3) {
        return put(k2, v3, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    @CheckForNull
    public K getInverse(@CheckForNull Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    public void init(int i7) {
        CollectPreconditions.checkNonnegative(i7, "expectedSize");
        int iClosedTableSize = Hashing.closedTableSize(i7, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i7];
        this.values = (V[]) new Object[i7];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i7);
        this.nextInBucketVToK = createFilledWithAbsent(i7);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i7);
        this.nextInInsertionOrder = createFilledWithAbsent(i7);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k2, @ParametricNullness V v3) {
        return put(k2, v3, false);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public K putInverse(@ParametricNullness V v3, @ParametricNullness K k2, boolean z3) {
        int iSmearedHash = Hashing.smearedHash(v3);
        int iFindEntryByValue = findEntryByValue(v3, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k8 = this.keys[iFindEntryByValue];
            if (Objects.equal(k8, k2)) {
                return k2;
            }
            replaceKeyInEntry(iFindEntryByValue, k2, z3);
            return k8;
        }
        int i7 = this.lastInInsertionOrder;
        int iSmearedHash2 = Hashing.smearedHash(k2);
        int iFindEntryByKey = findEntryByKey(k2, iSmearedHash2);
        if (!z3) {
            Preconditions.checkArgument(iFindEntryByKey == -1, "Key already present: %s", k2);
        } else if (iFindEntryByKey != -1) {
            i7 = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i10 = this.size;
        kArr[i10] = k2;
        this.values[i10] = v3;
        insertIntoTableKToV(i10, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        int i11 = i7 == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i7];
        setSucceeds(i7, this.size);
        setSucceeds(this.size, i11);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByKey = findEntryByKey(obj, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v3 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v3;
    }

    public void removeEntry(int i7) {
        removeEntryKeyHashKnown(i7, Hashing.smearedHash(this.keys[i7]));
    }

    public void removeEntryKeyHashKnown(int i7, int i10) {
        removeEntry(i7, i10, Hashing.smearedHash(this.values[i7]));
    }

    public void removeEntryValueHashKnown(int i7, int i10) {
        removeEntry(i7, Hashing.smearedHash(this.keys[i7]), i10);
    }

    @CheckForNull
    public K removeInverse(@CheckForNull Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByValue = findEntryByValue(obj, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k2 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i7) {
        return new HashBiMap<>(i7);
    }

    private void removeEntry(int i7, int i10, int i11) {
        Preconditions.checkArgument(i7 != -1);
        deleteFromTableKToV(i7, i10);
        deleteFromTableVToK(i7, i11);
        setSucceeds(this.prevInInsertionOrder[i7], this.nextInInsertionOrder[i7]);
        moveEntryToIndex(this.size - 1, i7);
        K[] kArr = this.keys;
        int i12 = this.size;
        kArr[i12 - 1] = null;
        this.values[i12 - 1] = null;
        this.size = i12 - 1;
        this.modCount++;
    }

    public int findEntryByKey(@CheckForNull Object obj, int i7) {
        return findEntry(obj, i7, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(@CheckForNull Object obj, int i7) {
        return findEntry(obj, i7, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @CheckForNull
    public V put(@ParametricNullness K k2, @ParametricNullness V v3, boolean z3) {
        int iSmearedHash = Hashing.smearedHash(k2);
        int iFindEntryByKey = findEntryByKey(k2, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v4 = this.values[iFindEntryByKey];
            if (Objects.equal(v4, v3)) {
                return v3;
            }
            replaceValueInEntry(iFindEntryByKey, v3, z3);
            return v4;
        }
        int iSmearedHash2 = Hashing.smearedHash(v3);
        int iFindEntryByValue = findEntryByValue(v3, iSmearedHash2);
        if (!z3) {
            Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", v3);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i7 = this.size;
        kArr[i7] = k2;
        this.values[i7] = v3;
        insertIntoTableKToV(i7, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }
}
