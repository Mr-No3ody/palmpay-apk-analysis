package N8;

import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.account.ui.dialog.SignUpInviteSuccDialog;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements SignUpInviteSuccDialog.SignUpInviteJumpCoupon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpSuccessActivity f6219a;

    public h0(SignUpSuccessActivity signUpSuccessActivity) {
        this.f6219a = signUpSuccessActivity;
    }

    @Override // com.transsnet.palmpay.account.ui.dialog.SignUpInviteSuccDialog.SignUpInviteJumpCoupon
    public final void jumpCoupon() {
        this.f6219a.finish();
    }
}
