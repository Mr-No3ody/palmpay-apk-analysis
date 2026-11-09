package p285sc;

import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import p383zc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42230a;

    public r(ReferEarnHomePageActivity referEarnHomePageActivity) {
        this.f42230a = referEarnHomePageActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        ReferEarnHomePageActivity referEarnHomePageActivity = this.f42230a;
        if (z3) {
            ReferEarnHomePageActivity.q(referEarnHomePageActivity, null, 7);
        } else {
            ((m) referEarnHomePageActivity.f27350a).referEarnWithDrawCreate(referEarnHomePageActivity.f31894p0);
        }
    }
}
