package p285sc;

import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import p383zc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42227b;

    public n(ReferEarnHomePageActivity referEarnHomePageActivity, String str) {
        this.f42226a = referEarnHomePageActivity;
        this.f42227b = str;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        ReferEarnHomePageActivity referEarnHomePageActivity = this.f42226a;
        if (z3) {
            ReferEarnHomePageActivity.q(referEarnHomePageActivity, null, 7);
        } else {
            ((m) referEarnHomePageActivity.f27350a).queryReferEarnWithDrawEnable(this.f42227b);
        }
    }
}
