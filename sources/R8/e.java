package R8;

import android.view.View;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7942b;

    public /* synthetic */ e(VerifyFingerPrintFragment verifyFingerPrintFragment, int i7) {
        this.f7941a = i7;
        this.f7942b = verifyFingerPrintFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VerifyFingerPrintFragment verifyFingerPrintFragment = this.f7942b;
        switch (this.f7941a) {
            case 0:
                int i7 = VerifyFingerPrintFragment.f26112C;
                verifyFingerPrintFragment.I(false);
                break;
            case 1:
                io.fastkv.n.M(false);
                int i10 = VerifyFingerPrintFragment.f26112C;
                verifyFingerPrintFragment.I(false);
                break;
            default:
                int i11 = VerifyFingerPrintFragment.f26112C;
                verifyFingerPrintFragment.I(true);
                break;
        }
    }
}
