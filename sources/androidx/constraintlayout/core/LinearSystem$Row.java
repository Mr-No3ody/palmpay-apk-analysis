package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
interface LinearSystem$Row {
    void addError(g gVar);

    void clear();

    g getKey();

    g getPivotCandidate(c cVar, boolean[] zArr);

    void initFromRow(LinearSystem$Row linearSystem$Row);

    boolean isEmpty();

    void updateFromFinalVariable(c cVar, g gVar, boolean z3);

    void updateFromRow(c cVar, b bVar, boolean z3);

    void updateFromSystem(c cVar);
}
