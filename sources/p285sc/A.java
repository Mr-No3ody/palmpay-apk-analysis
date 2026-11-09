package p285sc;

import N8.q0;
import Ua.C0615a;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.h;
import p025ba.k;
import p284sb.C2025x;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnResolveActivity f42196a;

    public A(ReferEarnResolveActivity referEarnResolveActivity) {
        this.f42196a = referEarnResolveActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (!z3) {
            q0.u("/main/statement");
            return;
        }
        int i7 = ReferEarnResolveActivity.f31917C;
        ReferEarnResolveActivity referEarnResolveActivity = this.f42196a;
        String string = referEarnResolveActivity.getString(k.ad_refer_rate_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new InterstitialAdView(string, 1, new C2025x(4), new h(9)).show(referEarnResolveActivity, new C0615a(referEarnResolveActivity, 2));
    }
}
