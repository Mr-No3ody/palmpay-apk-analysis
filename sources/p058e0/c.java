package p058e0;

import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f35987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f35988c;

    public /* synthetic */ c(Predicate predicate, Predicate predicate2, int i7) {
        this.f35986a = i7;
        this.f35987b = predicate;
        this.f35988c = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f35986a) {
            case 0:
                return this.f35987b.lambda$or$2(this.f35988c, obj);
            default:
                return this.f35987b.lambda$and$0(this.f35988c, obj);
        }
    }
}
