package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class LiveData$LifecycleBoundObserver extends A implements LifecycleEventObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LifecycleOwner f17356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f17357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(B b7, LifecycleOwner lifecycleOwner, Observer observer) {
        super(b7, observer);
        this.f17357f = b7;
        this.f17356e = lifecycleOwner;
    }

    @Override // androidx.lifecycle.A
    public final void b() {
        this.f17356e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.A
    public final boolean c(LifecycleOwner lifecycleOwner) {
        return this.f17356e == lifecycleOwner;
    }

    @Override // androidx.lifecycle.A
    public final boolean d() {
        return ((C1212w) this.f17356e.getLifecycle()).f17478d.a(EnumC1204n.f17463d);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
        LifecycleOwner lifecycleOwner2 = this.f17356e;
        EnumC1204n enumC1204n = ((C1212w) lifecycleOwner2.getLifecycle()).f17478d;
        if (enumC1204n == EnumC1204n.f17460a) {
            this.f17357f.j(this.f17323a);
            return;
        }
        EnumC1204n enumC1204n2 = null;
        while (enumC1204n2 != enumC1204n) {
            a(d());
            enumC1204n2 = enumC1204n;
            enumC1204n = ((C1212w) lifecycleOwner2.getLifecycle()).f17478d;
        }
    }
}
