package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
abstract class ImmutableSortedMapFauxverideShim<K, V> extends ImmutableMap<K, V> {
    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <K, V> ImmutableSortedMap.Builder<K, V> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> ImmutableSortedMap.Builder<K, V> builderWithExpectedSize(int i7) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass a key of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k2, V v3, K k8, V v4, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        throw new UnsupportedOperationException();
    }
}
