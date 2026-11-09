package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    final Equivalence<E> elementEquivalence;

    public PairwiseEquivalence(Equivalence<E> equivalence) {
        this.elementEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.elementEquivalence.equals(((PairwiseEquivalence) obj).elementEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.elementEquivalence);
        return d.h(strValueOf.length() + 11, strValueOf, ".pairwise()");
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.elementEquivalence.hash(it.next());
        }
        return iHash;
    }
}
