package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f17338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observer f17339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17340c = -1;

    public C(B b7, Observer observer) {
        this.f17338a = b7;
        this.f17339b = observer;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i7 = this.f17340c;
        int i10 = this.f17338a.f17334g;
        if (i7 != i10) {
            this.f17340c = i10;
            this.f17339b.onChanged(obj);
        }
    }
}
