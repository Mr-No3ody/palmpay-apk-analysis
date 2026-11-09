package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
interface NetworkConnections<N, E> {
    void addInEdge(E e10, N n10, boolean z3);

    void addOutEdge(E e10, N n10);

    N adjacentNode(E e10);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n10);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    @CheckForNull
    N removeInEdge(E e10, boolean z3);

    @CanIgnoreReturnValue
    N removeOutEdge(E e10);

    Set<N> successors();
}
