package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    public class AnonymousClass2 extends IncidentEdgeSet<N> {
        public AnonymousClass2(AbstractBaseGraph abstractBaseGraph, BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
            return EndpointPair.ordered(obj, this.node);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$1(Object obj) {
            return EndpointPair.ordered(this.node, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$2(Object obj) {
            return EndpointPair.unordered(this.node, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            if (!this.graph.isDirected()) {
                final int i7 = 2;
                return Iterators.unmodifiableIterator(Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new Function(this) { // from class: com.google.common.graph.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f22819b;

                    {
                        this.f22819b = this;
                    }

                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        switch (i7) {
                            case 0:
                                return this.f22819b.lambda$iterator$0(obj);
                            case 1:
                                return this.f22819b.lambda$iterator$1(obj);
                            default:
                                return this.f22819b.lambda$iterator$2(obj);
                        }
                    }
                }));
            }
            final int i10 = 0;
            final int i11 = 1;
            return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.graph.predecessors((Object) this.node).iterator(), new Function(this) { // from class: com.google.common.graph.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f22819b;

                {
                    this.f22819b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    switch (i10) {
                        case 0:
                            return this.f22819b.lambda$iterator$0(obj);
                        case 1:
                            return this.f22819b.lambda$iterator$1(obj);
                        default:
                            return this.f22819b.lambda$iterator$2(obj);
                    }
                }
            }), Iterators.transform(Sets.difference(this.graph.successors((Object) this.node), ImmutableSet.of(this.node)).iterator(), new Function(this) { // from class: com.google.common.graph.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f22819b;

                {
                    this.f22819b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    switch (i11) {
                        case 0:
                            return this.f22819b.lambda$iterator$0(obj);
                        case 1:
                            return this.f22819b.lambda$iterator$1(obj);
                        default:
                            return this.f22819b.lambda$iterator$2(obj);
                    }
                }
            })));
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n10) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n10).size(), successors((Object) n10).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n10);
        return IntMath.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(n10)) ? 1 : 0);
    }

    public long edgeCount() {
        Iterator<N> it = nodes().iterator();
        long jDegree = 0;
        while (it.hasNext()) {
            jDegree += (long) degree(it.next());
        }
        Preconditions.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.of(AbstractBaseGraph.this);
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n10, N n11) {
        Preconditions.checkNotNull(n10);
        Preconditions.checkNotNull(n11);
        return nodes().contains(n10) && successors((Object) n10).contains(n11);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n10) {
        return isDirected() ? predecessors((Object) n10).size() : degree(n10);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n10) {
        Preconditions.checkNotNull(n10);
        Preconditions.checkArgument(nodes().contains(n10), "Node %s is not an element of this graph.", n10);
        return new AnonymousClass2(this, this, n10);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() || !isDirected();
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n10) {
        return isDirected() ? successors((Object) n10).size() : degree(n10);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nNodeU = endpointPair.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpointPair.nodeV());
    }
}
