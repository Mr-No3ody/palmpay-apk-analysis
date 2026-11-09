package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class Platform {
    private Platform() {
    }

    public static void checkGwtRpcEnabled() {
    }

    public static <T> T[] copy(Object[] objArr, int i7, int i10, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i7, i10, tArr.getClass());
    }

    public static <T> T[] newArray(T[] tArr, int i7) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i7));
    }

    public static <K, V> Map<K, V> newHashMapWithExpectedSize(int i7) {
        return CompactHashMap.createWithExpectedSize(i7);
    }

    public static <E> Set<E> newHashSetWithExpectedSize(int i7) {
        return CompactHashSet.createWithExpectedSize(i7);
    }

    public static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i7) {
        return CompactLinkedHashMap.createWithExpectedSize(i7);
    }

    public static <E> Set<E> newLinkedHashSetWithExpectedSize(int i7) {
        return CompactLinkedHashSet.createWithExpectedSize(i7);
    }

    public static <E> Set<E> preservesInsertionOrderOnAddsSet() {
        return CompactHashSet.create();
    }

    public static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
        return CompactHashMap.create();
    }

    public static int reduceExponentIfGwt(int i7) {
        return i7;
    }

    public static int reduceIterationsIfGwt(int i7) {
        return i7;
    }

    public static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}
