package androidx.biometric;

/* JADX INFO: renamed from: androidx.biometric.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0904h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f13078b;

    public /* synthetic */ RunnableC0904h(BiometricFragment biometricFragment, int i7) {
        this.f13077a = i7;
        this.f13078b = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13077a) {
            case 0:
                this.f13078b.f13058a.f13043Z = false;
                break;
            default:
                A a3 = this.f13078b.f13058a;
                if (a3.f13045e == null) {
                    a3.f13045e = new x(9);
                }
                a3.f13045e.Q();
                break;
        }
    }
}
