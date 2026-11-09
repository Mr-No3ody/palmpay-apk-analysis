package com.google.common.collect;

import C0.G;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<K> keySet;

    @CheckForNull
    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableCollection<V> values;

    @DoNotMock
    public static class Builder<K, V> {
        Object[] alternatingKeysAndValues;
        DuplicateKey duplicateKey;
        boolean entriesUsed;
        int size;

        @CheckForNull
        Comparator<? super V> valueComparator;

        public static final class DuplicateKey {
            private final Object key;
            private final Object value1;
            private final Object value2;

            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.key = obj;
                this.value1 = obj2;
                this.value2 = obj3;
            }

            public IllegalArgumentException exception() {
                String strValueOf = String.valueOf(this.key);
                String strValueOf2 = String.valueOf(this.value1);
                String strValueOf3 = String.valueOf(this.key);
                String strValueOf4 = String.valueOf(this.value2);
                return new IllegalArgumentException(G.s(com.airbnb.lottie.model.layer.d.p("Multiple entries with same key: ", strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39, strValueOf, "=", strValueOf2), " and ", strValueOf3, "=", strValueOf4));
            }
        }

        public Builder() {
            this(4);
        }

        private ImmutableMap<K, V> build(boolean z3) {
            Object[] objArrLastEntryForEachKey;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z3 && (duplicateKey2 = this.duplicateKey) != null) {
                throw duplicateKey2.exception();
            }
            int length = this.size;
            if (this.valueComparator == null) {
                objArrLastEntryForEachKey = this.alternatingKeysAndValues;
            } else {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, length * 2);
                }
                objArrLastEntryForEachKey = this.alternatingKeysAndValues;
                if (!z3) {
                    objArrLastEntryForEachKey = lastEntryForEachKey(objArrLastEntryForEachKey, this.size);
                    if (objArrLastEntryForEachKey.length < this.alternatingKeysAndValues.length) {
                        length = objArrLastEntryForEachKey.length >>> 1;
                    }
                }
                sortEntries(objArrLastEntryForEachKey, length, this.valueComparator);
            }
            this.entriesUsed = true;
            RegularImmutableMap regularImmutableMapCreate = RegularImmutableMap.create(length, objArrLastEntryForEachKey, this);
            if (!z3 || (duplicateKey = this.duplicateKey) == null) {
                return regularImmutableMapCreate;
            }
            throw duplicateKey.exception();
        }

        private void ensureCapacity(int i7) {
            int i10 = i7 * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            if (i10 > objArr.length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, ImmutableCollection.Builder.expandedCapacity(objArr.length, i10));
                this.entriesUsed = false;
            }
        }

        private Object[] lastEntryForEachKey(Object[] objArr, int i7) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i10 = i7 - 1; i10 >= 0; i10--) {
                Object obj = objArr[i10 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i10);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i7 - bitSet.cardinality()) * 2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i7 * 2) {
                if (bitSet.get(i11 >>> 1)) {
                    i11 += 2;
                } else {
                    int i13 = i12 + 1;
                    int i14 = i11 + 1;
                    Object obj2 = objArr[i11];
                    Objects.requireNonNull(obj2);
                    objArr2[i12] = obj2;
                    i12 += 2;
                    i11 += 2;
                    Object obj3 = objArr[i14];
                    Objects.requireNonNull(obj3);
                    objArr2[i13] = obj3;
                }
            }
            return objArr2;
        }

        public static <V> void sortEntries(Object[] objArr, int i7, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i10 * 2;
                Object obj = objArr[i11];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i11 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i10] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i7, Ordering.from(comparator).onResultOf(Maps.valueFunction()));
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = i12 * 2;
                objArr[i13] = entryArr[i12].getKey();
                objArr[i13 + 1] = entryArr[i12].getValue();
            }
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return build(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return build(true);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> combine(Builder<K, V> builder) {
            Preconditions.checkNotNull(builder);
            ensureCapacity(this.size + builder.size);
            System.arraycopy(builder.alternatingKeysAndValues, 0, this.alternatingKeysAndValues, this.size * 2, builder.size * 2);
            this.size += builder.size;
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            Preconditions.checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k2, V v3) {
            ensureCapacity(this.size + 1);
            CollectPreconditions.checkEntryNotNull(k2, v3);
            Object[] objArr = this.alternatingKeysAndValues;
            int i7 = this.size;
            objArr[i7 * 2] = k2;
            objArr[(i7 * 2) + 1] = v3;
            this.size = i7 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public Builder(int i7) {
            this.alternatingKeysAndValues = new Object[i7 * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                ensureCapacity(((Collection) iterable).size() + this.size);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }
    }

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            final UnmodifiableIterator<Map.Entry<K, V>> it = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public ImmutableSet<V> get(@CheckForNull Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i7] = next.getKey();
                objArr2[i7] = next.getValue();
                i7++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            Builder<K, V> builderMakeBuilder = makeBuilder(objArr.length);
            for (int i7 = 0; i7 < objArr.length; i7++) {
                builderMakeBuilder.put(objArr[i7], objArr2[i7]);
            }
            return builderMakeBuilder.buildOrThrow();
        }

        public Builder<K, V> makeBuilder(int i7) {
            return new Builder<>(i7);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            Builder<K, V> builderMakeBuilder = makeBuilder(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                builderMakeBuilder.put(it.next(), it2.next());
            }
            return builderMakeBuilder.buildOrThrow();
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i7) {
        CollectPreconditions.checkNonnegative(i7, "expectedSize");
        return new Builder<>(i7);
    }

    public static void checkNoConflict(boolean z3, String str, Object obj, Object obj2) {
        if (!z3) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(G.r(com.airbnb.lottie.model.layer.d.p("Multiple entries with same ", strValueOf2.length() + strValueOf.length() + com.airbnb.lottie.model.layer.d.c(34, str), str, ": ", strValueOf), " and ", strValueOf2));
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k2, V v3) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        return new AbstractMap.SimpleImmutableEntry(k2, v3);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v3) {
        V v4 = get(obj);
        return v4 != null ? v4 : v3;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public UnmodifiableIterator<K> keyIterator() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k2, V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        return RegularImmutableMap.create(1, new Object[]{k2, v3});
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        return RegularImmutableMap.create(2, new Object[]{k2, v3, k8, v4});
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        return RegularImmutableMap.create(3, new Object[]{k2, v3, k8, v4, k10, v10});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        return RegularImmutableMap.create(4, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        return RegularImmutableMap.create(5, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        return RegularImmutableMap.create(6, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        return RegularImmutableMap.create(7, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        return RegularImmutableMap.create(8, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        return RegularImmutableMap.create(9, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> ImmutableMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        CollectPreconditions.checkEntryNotNull(k2, v3);
        CollectPreconditions.checkEntryNotNull(k8, v4);
        CollectPreconditions.checkEntryNotNull(k10, v10);
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        return RegularImmutableMap.create(10, new Object[]{k2, v3, k8, v4, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }
}
