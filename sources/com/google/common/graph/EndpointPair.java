package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"N"})
@Beta
@ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    public static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }

        public String toString() {
            String strValueOf = String.valueOf(source());
            String strValueOf2 = String.valueOf(target());
            StringBuilder sbP = com.airbnb.lottie.model.layer.d.p("<", strValueOf2.length() + strValueOf.length() + 6, strValueOf, " -> ", strValueOf2);
            sbP.append(">");
            return sbP.toString();
        }

        private Ordered(N n10, N n11) {
            super(n10, n11);
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            return nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeV().hashCode() + nodeU().hashCode();
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            String strValueOf = String.valueOf(nodeU());
            String strValueOf2 = String.valueOf(nodeV());
            StringBuilder sbP = com.airbnb.lottie.model.layer.d.p("[", strValueOf2.length() + strValueOf.length() + 4, strValueOf, ", ", strValueOf2);
            sbP.append("]");
            return sbP.toString();
        }

        private Unordered(N n10, N n11) {
            super(n10, n11);
        }
    }

    public static <N> EndpointPair<N> of(Graph<?> graph, N n10, N n11) {
        return graph.isDirected() ? ordered(n10, n11) : unordered(n10, n11);
    }

    public static <N> EndpointPair<N> ordered(N n10, N n11) {
        return new Ordered(n10, n11);
    }

    public static <N> EndpointPair<N> unordered(N n10, N n11) {
        return new Unordered(n11, n10);
    }

    public final N adjacentNode(N n10) {
        if (n10.equals(this.nodeU)) {
            return this.nodeV;
        }
        if (n10.equals(this.nodeV)) {
            return this.nodeU;
        }
        String strValueOf = String.valueOf(this);
        String strValueOf2 = String.valueOf(n10);
        throw new IllegalArgumentException(com.airbnb.lottie.model.layer.d.k("EndpointPair ", strValueOf2.length() + strValueOf.length() + 36, strValueOf, " does not contain node ", strValueOf2));
    }

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public final N nodeU() {
        return this.nodeU;
    }

    public final N nodeV() {
        return this.nodeV;
    }

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n10, N n11) {
        this.nodeU = (N) Preconditions.checkNotNull(n10);
        this.nodeV = (N) Preconditions.checkNotNull(n11);
    }

    public static <N> EndpointPair<N> of(Network<?, ?> network, N n10, N n11) {
        return network.isDirected() ? ordered(n10, n11) : unordered(n10, n11);
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.nodeU, this.nodeV);
    }
}
