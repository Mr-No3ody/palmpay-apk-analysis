package p285sc;

import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42228a;

    public p(ReferEarnHomePageActivity referEarnHomePageActivity) {
        this.f42228a = referEarnHomePageActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        ReferEarnHomePageActivity referEarnHomePageActivity = this.f42228a;
        if (z3) {
            ReferEarnHomePageActivity.q(referEarnHomePageActivity, null, 7);
        } else {
            referEarnHomePageActivity.finish();
        }
    }
}
