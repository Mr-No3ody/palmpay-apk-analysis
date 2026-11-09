package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class L implements ReportFragment.ActivityInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f17351a;

    public L(M m7) {
        this.f17351a = m7;
    }

    @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
    public final void onCreate() {
    }

    @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
    public final void onResume() {
        this.f17351a.a();
    }

    @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
    public final void onStart() {
        M m7 = this.f17351a;
        int i7 = m7.f17360a + 1;
        m7.f17360a = i7;
        if (i7 == 1 && m7.f17363d) {
            m7.f17365f.e(EnumC1203m.ON_START);
            m7.f17363d = false;
        }
    }
}
