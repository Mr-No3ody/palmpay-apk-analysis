package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    long edgeCount;
    private final boolean isDirected;
    final MapIteratorCache<N, GraphConnections<N, V>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    public StandardValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        this(abstractGraphBuilder, abstractGraphBuilder.nodeOrder.createMap(abstractGraphBuilder.expectedNodeCount.or(10).intValue()), 0L);
    }

    private final GraphConnections<N, V> checkedConnections(N n10) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n10);
        if (graphConnections != null) {
            return graphConnections;
        }
        Preconditions.checkNotNull(n10);
        String strValueOf = String.valueOf(n10);
        throw new IllegalArgumentException(com.airbnb.lottie.model.layer.d.i(strValueOf.length() + 38, "Node ", strValueOf, " is not an element of this graph."));
    }

    @CheckForNull
    private final V edgeValueOrDefaultInternal(N n10, N n11, @CheckForNull V v3) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n10);
        V vValue = graphConnections == null ? null : graphConnections.value(n11);
        return vValue == null ? v3 : vValue;
    }

    private final boolean hasEdgeConnectingInternal(N n10, N n11) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n10);
        return graphConnections != null && graphConnections.successors().contains(n11);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n10) {
        return checkedConnections(n10).adjacentNodes();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    public final boolean containsNode(@CheckForNull N n10) {
        return this.nodeConnections.containsKey(n10);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    public long edgeCount() {
        return this.edgeCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public V edgeValueOrDefault(N n10, N n11, @CheckForNull V v3) {
        return (V) edgeValueOrDefaultInternal(Preconditions.checkNotNull(n10), Preconditions.checkNotNull(n11), v3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n10, N n11) {
        return hasEdgeConnectingInternal(Preconditions.checkNotNull(n10), Preconditions.checkNotNull(n11));
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n10) {
        final GraphConnections<N, V> graphConnectionsCheckedConnections = checkedConnections(n10);
        return new IncidentEdgeSet<N>(this, this, n10) { // from class: com.google.common.graph.StandardValueGraph.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return graphConnectionsCheckedConnections.incidentEdgeIterator(this.node);
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @CheckForNull
    public V edgeValueOrDefault(EndpointPair<N> endpointPair, @CheckForNull V v3) {
        validateEndpoints(endpointPair);
        return edgeValueOrDefaultInternal(endpointPair.nodeU(), endpointPair.nodeV(), v3);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        return isOrderingCompatible(endpointPair) && hasEdgeConnectingInternal(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n10) {
        return checkedConnections(n10).predecessors();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n10) {
        return checkedConnections(n10).successors();
    }

    public StandardValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder, Map<N, GraphConnections<N, V>> map, long j6) {
        MapIteratorCache<N, GraphConnections<N, V>> mapIteratorCache;
        this.isDirected = abstractGraphBuilder.directed;
        this.allowsSelfLoops = abstractGraphBuilder.allowsSelfLoops;
        this.nodeOrder = (ElementOrder<N>) abstractGraphBuilder.nodeOrder.cast();
        if (map instanceof TreeMap) {
            mapIteratorCache = new MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeCount = Graphs.checkNonNegative(j6);
    }
}
