package p285sc;

import android.os.Bundle;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import p383zc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42232b;

    public t(ReferEarnHomePageActivity referEarnHomePageActivity, String str) {
        this.f42231a = referEarnHomePageActivity;
        this.f42232b = str;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            Bundle bundle = new Bundle();
            bundle.putString("orderNo", this.f42232b);
            bundle.putString("COMMENT_TYPE", "ReferEarn");
            d.E(bundle, "/coreImpl/comment_add");
            ((m) this.f42231a.f27350a).queryReferEarnHome();
        }
    }
}
