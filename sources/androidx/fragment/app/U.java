package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class U implements FragmentOnAttachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f17040a;

    public U(Fragment fragment) {
        this.f17040a = fragment;
    }

    @Override // androidx.fragment.app.FragmentOnAttachListener
    public final void onAttachFragment(Z z3, Fragment fragment) {
        this.f17040a.onAttachFragment(fragment);
    }
}
