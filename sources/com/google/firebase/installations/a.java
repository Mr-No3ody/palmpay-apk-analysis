package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f22993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22994c;

    public /* synthetic */ a(FirebaseInstallations firebaseInstallations, boolean z3, int i7) {
        this.f22992a = i7;
        this.f22993b = firebaseInstallations;
        this.f22994c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22992a) {
            case 0:
                this.f22993b.lambda$doRegistrationOrRefresh$3(this.f22994c);
                break;
            default:
                this.f22993b.lambda$getToken$2(this.f22994c);
                break;
        }
    }
}
