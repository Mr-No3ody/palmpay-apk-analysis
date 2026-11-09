package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Function<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    public FunctionalEquivalence(Function<? super F, ? extends T> function, Equivalence<T> equivalence) {
        this.function = (Function) Preconditions.checkNotNull(function);
        this.resultEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(F f10, F f11) {
        return this.resultEquivalence.equivalent(this.function.apply(f10), this.function.apply(f11));
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(F f10) {
        return this.resultEquivalence.hash(this.function.apply(f10));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionalEquivalence) {
            FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
            if (this.function.equals(functionalEquivalence.function) && this.resultEquivalence.equals(functionalEquivalence.resultEquivalence)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.function, this.resultEquivalence);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.resultEquivalence);
        String strValueOf2 = String.valueOf(this.function);
        return d.k(strValueOf, strValueOf2.length() + strValueOf.length() + 13, ".onResultOf(", strValueOf2, ")");
    }
}
