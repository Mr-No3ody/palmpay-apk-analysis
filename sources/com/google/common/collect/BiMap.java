package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends Map<K, V> {
    @CanIgnoreReturnValue
    @CheckForNull
    V forcePut(@ParametricNullness K k2, @ParametricNullness V v3);

    BiMap<V, K> inverse();

    @CanIgnoreReturnValue
    @CheckForNull
    V put(@ParametricNullness K k2, @ParametricNullness V v3);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.BiMap
    Set<V> values();
}
