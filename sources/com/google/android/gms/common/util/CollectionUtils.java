package com.google.android.gms.common.util;

import M.f;
import M.g;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k2, @NonNull V v3, @NonNull K k8, @NonNull V v4, @NonNull K k10, @NonNull V v10) {
        Map mapZzb = zzb(3, false);
        mapZzb.put(k2, v3);
        mapZzb.put(k8, v4);
        mapZzb.put(k10, v10);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb2.append("Key and values array lengths not equal: ");
            sb2.append(length);
            sb2.append(" != ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZzb = zzb(length, false);
        for (int i7 = 0; i7 < kArr.length; i7++) {
            mapZzb.put(kArr[i7], vArr[i7]);
        }
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i7) {
        return i7 == 0 ? new g(0) : zza(i7, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t, @NonNull T t3, @NonNull T t8) {
        Set setZza = zza(3, false);
        setZza.add(t);
        setZza.add(t3);
        setZza.add(t8);
        return Collections.unmodifiableSet(setZza);
    }

    private static Set zza(int i7, boolean z3) {
        if (i7 <= (true != z3 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128)) {
            return new g(i7);
        }
        return new HashSet(i7, true != z3 ? 1.0f : 0.75f);
    }

    private static Map zzb(int i7, boolean z3) {
        return i7 <= 256 ? new f(i7) : new HashMap(i7, 1.0f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k2, @NonNull V v3, @NonNull K k8, @NonNull V v4, @NonNull K k10, @NonNull V v10, @NonNull K k11, @NonNull V v11, @NonNull K k12, @NonNull V v12, @NonNull K k13, @NonNull V v13) {
        Map mapZzb = zzb(6, false);
        mapZzb.put(k2, v3);
        mapZzb.put(k8, v4);
        mapZzb.put(k10, v10);
        mapZzb.put(k11, v11);
        mapZzb.put(k12, v12);
        mapZzb.put(k13, v13);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t3 = tArr[1];
            Set setZza = zza(2, false);
            setZza.add(t);
            setZza.add(t3);
            return Collections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZza2 = zza(length, false);
            Collections.addAll(setZza2, tArr);
            return Collections.unmodifiableSet(setZza2);
        }
        T t8 = tArr[0];
        T t10 = tArr[1];
        T t11 = tArr[2];
        T t12 = tArr[3];
        Set setZza3 = zza(4, false);
        setZza3.add(t8);
        setZza3.add(t10);
        setZza3.add(t11);
        setZza3.add(t12);
        return Collections.unmodifiableSet(setZza3);
    }
}
