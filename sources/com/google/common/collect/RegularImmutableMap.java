package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;

    @VisibleForTesting
    final transient Object[] alternatingKeysAndValues;

    @CheckForNull
    private final transient Object hashTable;
    private final transient int size;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i7, int i10) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i7;
            this.size = i10;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i7) {
            return asList().copyIntoArray(objArr, i7);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.size;
                }

                @Override // java.util.List
                public Map.Entry<K, V> get(int i7) {
                    Preconditions.checkElementIndex(i7, EntrySet.this.size);
                    int i10 = i7 * 2;
                    Object obj = EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.alternatingKeysAndValues[i10 + (EntrySet.this.keyOffset ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i7) {
            return asList().copyIntoArray(objArr, i7);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        public KeysOrValuesAsList(Object[] objArr, int i7, int i10) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i7;
            this.size = i10;
        }

        @Override // java.util.List
        public Object get(int i7) {
            Preconditions.checkElementIndex(i7, this.size);
            Object obj = this.alternatingKeysAndValues[(i7 * 2) + this.offset];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }
    }

    private RegularImmutableMap(@CheckForNull Object obj, Object[] objArr, int i7) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i7;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i7, Object[] objArr) {
        return create(i7, objArr, null);
    }

    @CheckForNull
    private static Object createHashTable(Object[] objArr, int i7, int i10, int i11) {
        int i12;
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        int i13 = 1;
        if (i7 == 1) {
            Object obj = objArr[i11];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return null;
        }
        int i14 = i10 - 1;
        if (i10 <= 128) {
            byte[] bArr = new byte[i10];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i7; i16++) {
                int i17 = (i16 * 2) + i11;
                int i18 = (i15 * 2) + i11;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                CollectPreconditions.checkEntryNotNull(obj3, obj4);
                int iSmear = Hashing.smear(obj3.hashCode());
                while (true) {
                    int i19 = iSmear & i14;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                        break;
                    }
                    if (obj3.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj5 = objArr[i21];
                        Objects.requireNonNull(obj5);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj3, obj4, obj5);
                        objArr[i21] = obj4;
                        break;
                    }
                    iSmear = i19 + 1;
                }
            }
            return i15 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i15), duplicateKey};
        }
        if (i10 <= SHORT_MAX_SIZE) {
            short[] sArr = new short[i10];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i7; i23++) {
                int i24 = (i23 * 2) + i11;
                int i25 = (i22 * 2) + i11;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                CollectPreconditions.checkEntryNotNull(obj6, obj7);
                int iSmear2 = Hashing.smear(obj6.hashCode());
                while (true) {
                    int i26 = iSmear2 & i14;
                    int i27 = sArr[i26] & SHORT_MASK;
                    if (i27 == SHORT_MASK) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                        break;
                    }
                    if (obj6.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj8 = objArr[i28];
                        Objects.requireNonNull(obj8);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj6, obj7, obj8);
                        objArr[i28] = obj7;
                        break;
                    }
                    iSmear2 = i26 + 1;
                }
            }
            return i22 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i22), duplicateKey};
        }
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i7) {
            int i31 = (i29 * 2) + i11;
            int i32 = (i30 * 2) + i11;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ i13];
            Objects.requireNonNull(obj10);
            CollectPreconditions.checkEntryNotNull(obj9, obj10);
            int iSmear3 = Hashing.smear(obj9.hashCode());
            while (true) {
                int i33 = iSmear3 & i14;
                int i34 = iArr[i33];
                if (i34 == -1) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                    i12 = i13;
                    break;
                }
                i12 = i13;
                if (obj9.equals(objArr[i34])) {
                    int i35 = i34 ^ 1;
                    Object obj11 = objArr[i35];
                    Objects.requireNonNull(obj11);
                    duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj9, obj10, obj11);
                    objArr[i35] = obj10;
                    break;
                }
                iSmear3 = i33 + 1;
                i13 = i12;
            }
            i29++;
            i13 = i12;
        }
        int i36 = i13;
        if (i30 == i7) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i36] = Integer.valueOf(i30);
        objArr2[2] = duplicateKey;
        return objArr2;
    }

    @CheckForNull
    public static Object createHashTableOrThrow(Object[] objArr, int i7, int i10, int i11) {
        Object objCreateHashTable = createHashTable(objArr, i7, i10, i11);
        if (objCreateHashTable instanceof Object[]) {
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objCreateHashTable)[2]).exception();
        }
        return objCreateHashTable;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v3 = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v3 == null) {
            return null;
        }
        return v3;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i7, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i7 == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i7, objArr.length >> 1);
        Object objCreateHashTable = createHashTable(objArr, i7, ImmutableSet.chooseTableSize(i7), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) objCreateHashTable;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objCreateHashTable = obj3;
            i7 = iIntValue;
        }
        return new RegularImmutableMap<>(objCreateHashTable, objArr, i7);
    }

    @CheckForNull
    public static Object get(@CheckForNull Object obj, Object[] objArr, int i7, int i10, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i10];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iSmear = Hashing.smear(obj2.hashCode());
            while (true) {
                int i11 = iSmear & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iSmear = i11 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iSmear2 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i13 = iSmear2 & length2;
                int i14 = sArr[i13] & SHORT_MASK;
                if (i14 == SHORT_MASK) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iSmear2 = i13 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iSmear3 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i15 = iSmear3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iSmear3 = i15 + 1;
            }
        }
    }
}
