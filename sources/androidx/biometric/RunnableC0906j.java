package androidx.biometric;

/* JADX INFO: renamed from: androidx.biometric.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0906j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f13082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CharSequence f13084d;

    public /* synthetic */ RunnableC0906j(BiometricFragment biometricFragment, int i7, CharSequence charSequence, int i10) {
        this.f13081a = i10;
        this.f13082b = biometricFragment;
        this.f13083c = i7;
        this.f13084d = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13081a) {
            case 0:
                A a3 = this.f13082b.f13058a;
                if (a3.f13045e == null) {
                    a3.f13045e = new x(9);
                }
                a3.f13045e.P(this.f13083c, this.f13084d);
                break;
            default:
                this.f13082b.k(this.f13083c, this.f13084d);
                break;
        }
    }
}
