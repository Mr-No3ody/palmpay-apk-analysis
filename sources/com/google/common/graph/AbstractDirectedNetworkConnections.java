package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> inEdgeMap;
    final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    public AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i7) {
        this.inEdgeMap = (Map) Preconditions.checkNotNull(map);
        this.outEdgeMap = (Map) Preconditions.checkNotNull(map2);
        this.selfLoopCount = Graphs.checkNonNegative(i7);
        Preconditions.checkState(i7 <= map.size() && i7 <= map2.size());
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e10, N n10, boolean z3) {
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(n10);
        if (z3) {
            int i7 = this.selfLoopCount + 1;
            this.selfLoopCount = i7;
            Graphs.checkPositive(i7);
        }
        Preconditions.checkState(this.inEdgeMap.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e10, N n10) {
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(n10);
        Preconditions.checkState(this.outEdgeMap.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e10) {
        N n10 = this.outEdgeMap.get(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.union(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return AbstractDirectedNetworkConnections.this.inEdgeMap.containsKey(obj) || AbstractDirectedNetworkConnections.this.outEdgeMap.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return IntMath.saturatedAdd(AbstractDirectedNetworkConnections.this.inEdgeMap.size(), AbstractDirectedNetworkConnections.this.outEdgeMap.size() - AbstractDirectedNetworkConnections.this.selfLoopCount);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return Iterators.unmodifiableIterator((AbstractDirectedNetworkConnections.this.selfLoopCount == 0 ? Iterables.concat(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet()) : Sets.union(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet())).iterator());
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e10, boolean z3) {
        if (z3) {
            int i7 = this.selfLoopCount - 1;
            this.selfLoopCount = i7;
            Graphs.checkNonNegative(i7);
        }
        N nRemove = this.inEdgeMap.remove(e10);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e10) {
        N nRemove = this.outEdgeMap.remove(e10);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }
}
