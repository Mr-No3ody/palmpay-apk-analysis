package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    public StandardMutableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @CanIgnoreReturnValue
    private NetworkConnections<N, E> addNodeInternal(N n10) {
        NetworkConnections<N, E> networkConnectionsNewConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n10, networkConnectionsNewConnections) == null);
        return networkConnectionsNewConnections;
    }

    private NetworkConnections<N, E> newConnections() {
        if (isDirected()) {
            return allowsParallelEdges() ? DirectedMultiNetworkConnections.of() : DirectedNetworkConnections.of();
        }
        return allowsParallelEdges() ? UndirectedMultiNetworkConnections.of() : UndirectedNetworkConnections.of();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n10, N n11, E e10) {
        Preconditions.checkNotNull(n10, "nodeU");
        Preconditions.checkNotNull(n11, "nodeV");
        Preconditions.checkNotNull(e10, "edge");
        if (containsEdge(e10)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e10);
            EndpointPair endpointPairOf = EndpointPair.of(this, n10, n11);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairOf), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e10, endpointPairIncidentNodes, endpointPairOf);
            return false;
        }
        NetworkConnections<N, E> networkConnectionsAddNodeInternal = this.nodeConnections.get(n10);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnectionsAddNodeInternal == null || !networkConnectionsAddNodeInternal.successors().contains(n11), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n10, n11);
        }
        boolean zEquals = n10.equals(n11);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n10);
        }
        if (networkConnectionsAddNodeInternal == null) {
            networkConnectionsAddNodeInternal = addNodeInternal(n10);
        }
        networkConnectionsAddNodeInternal.addOutEdge(e10, n11);
        NetworkConnections<N, E> networkConnectionsAddNodeInternal2 = this.nodeConnections.get(n11);
        if (networkConnectionsAddNodeInternal2 == null) {
            networkConnectionsAddNodeInternal2 = addNodeInternal(n11);
        }
        networkConnectionsAddNodeInternal2.addInEdge(e10, n10, zEquals);
        this.edgeToReferenceNode.put(e10, n10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n10) {
        Preconditions.checkNotNull(n10, "node");
        if (containsNode(n10)) {
            return false;
        }
        addNodeInternal(n10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e10) {
        Preconditions.checkNotNull(e10, "edge");
        N n10 = this.edgeToReferenceNode.get(e10);
        boolean z3 = false;
        if (n10 == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n10);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N nAdjacentNode = networkConnections2.adjacentNode(e10);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(nAdjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e10);
        if (allowsSelfLoops() && n10.equals(nAdjacentNode)) {
            z3 = true;
        }
        networkConnections4.removeInEdge(e10, z3);
        this.edgeToReferenceNode.remove(e10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n10) {
        Preconditions.checkNotNull(n10, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n10);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(n10);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpointPair, E e10) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e10);
    }
}
