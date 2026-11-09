package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f18338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f18339c;

    public /* synthetic */ c(EmbeddingAdapter embeddingAdapter, Set set, int i7) {
        this.f18337a = i7;
        this.f18338b = embeddingAdapter;
        this.f18339c = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Pair pair = (Pair) obj;
        switch (this.f18337a) {
            case 0:
                return EmbeddingAdapter.m75translateActivityPairPredicates$lambda1(this.f18338b, this.f18339c, pair);
            default:
                return EmbeddingAdapter.m74translateActivityIntentPredicates$lambda3(this.f18338b, this.f18339c, pair);
        }
    }
}
