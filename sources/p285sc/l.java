package p285sc;

import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42224a;

    public l(ReferEarnHomePageActivity referEarnHomePageActivity) {
        this.f42224a = referEarnHomePageActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            ReferEarnHomePageActivity.q(this.f42224a, null, 7);
        } else {
            d.F("/main/statement");
        }
    }
}
