package p340wc;

import N8.q0;
import Ua.C0615a;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.h;
import p025ba.k;
import p284sb.C2025x;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithdrawListFragment f43398a;

    public g(ReferEarnWithdrawListFragment referEarnWithdrawListFragment) {
        this.f43398a = referEarnWithdrawListFragment;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (!z3) {
            q0.u("/main/statement");
            return;
        }
        ReferEarnWithdrawListFragment.a aVar = ReferEarnWithdrawListFragment.f31960w;
        ReferEarnWithdrawListFragment referEarnWithdrawListFragment = this.f43398a;
        referEarnWithdrawListFragment.getClass();
        String string = referEarnWithdrawListFragment.getString(k.ad_refer_rate_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new InterstitialAdView(string, 1, new C2025x(17), new h(9)).show(referEarnWithdrawListFragment.requireContext(), new C0615a(referEarnWithdrawListFragment, 3));
    }
}
