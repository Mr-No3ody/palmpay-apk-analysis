package N8;

import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountActivity f6245b;

    public /* synthetic */ n0(VerifyAccountActivity verifyAccountActivity, int i7) {
        this.f6244a = i7;
        this.f6245b = verifyAccountActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6244a) {
            case 0:
                this.f6245b.finish();
                break;
            default:
                this.f6245b.finish();
                break;
        }
    }
}
