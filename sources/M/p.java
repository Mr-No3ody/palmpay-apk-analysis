package M;

import kotlin.collections.C;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f5701b;

    public p(o oVar) {
        this.f5701b = oVar;
    }

    @Override // kotlin.collections.C
    public final int a() {
        int i7 = this.f5700a;
        this.f5700a = i7 + 1;
        return this.f5701b.c(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5700a < this.f5701b.e();
    }
}
