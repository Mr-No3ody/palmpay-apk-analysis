package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f18335b;

    public /* synthetic */ a(Set set, int i7) {
        this.f18334a = i7;
        this.f18335b = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f18334a) {
            case 0:
                return EmbeddingAdapter.m77translateIntentPredicates$lambda8(this.f18335b, (Intent) obj);
            default:
                return EmbeddingAdapter.m76translateActivityPredicates$lambda6(this.f18335b, (Activity) obj);
        }
    }
}
