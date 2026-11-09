package kotlin.collections;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AbstractC1835b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f38907e;

    public L(M m7) {
        this.f38907e = m7;
        this.f38905c = m7.f38911e;
        this.f38906d = m7.f38910d;
    }

    @Override // kotlin.collections.AbstractC1835b
    public final void a() {
        int i7 = this.f38905c;
        if (i7 == 0) {
            this.f38920a = 2;
            return;
        }
        M m7 = this.f38907e;
        int i10 = this.f38906d;
        this.f38921b = m7.f38908b[i10];
        this.f38920a = 1;
        this.f38906d = (i10 + 1) % m7.f38909c;
        this.f38905c = i7 - 1;
    }
}
