package p285sc;

import Ua.C0615a;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.h;
import p025ba.k;
import p284sb.C2025x;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnHomePageActivity f42225a;

    public m(ReferEarnHomePageActivity referEarnHomePageActivity) {
        this.f42225a = referEarnHomePageActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        int i7 = 1;
        if (!z3) {
            d.F("/main/statement");
            return;
        }
        int i10 = ReferEarnHomePageActivity.f31872z0;
        ReferEarnHomePageActivity referEarnHomePageActivity = this.f42225a;
        referEarnHomePageActivity.getClass();
        String string = referEarnHomePageActivity.getString(k.ad_refer_rate_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new InterstitialAdView(string, 1, new C2025x(3), new h(9)).show(referEarnHomePageActivity, new C0615a(referEarnHomePageActivity, i7));
    }
}
