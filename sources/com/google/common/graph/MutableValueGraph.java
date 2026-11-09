package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N n10);

    @CanIgnoreReturnValue
    @CheckForNull
    V putEdgeValue(EndpointPair<N> endpointPair, V v3);

    @CanIgnoreReturnValue
    @CheckForNull
    V putEdgeValue(N n10, N n11, V v3);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeEdge(N n10, N n11);

    @CanIgnoreReturnValue
    boolean removeNode(N n10);
}
