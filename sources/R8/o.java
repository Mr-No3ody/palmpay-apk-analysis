package R8;

import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifySafePinFragment f7962b;

    public /* synthetic */ o(VerifySafePinFragment verifySafePinFragment, int i7) {
        this.f7961a = i7;
        this.f7962b = verifySafePinFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7961a) {
            case 0:
                this.f7962b.C();
                break;
            default:
                this.f7962b.C();
                break;
        }
    }
}
