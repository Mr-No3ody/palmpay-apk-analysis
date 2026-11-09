package Oc;

import Pa.i0;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserOpenDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0502e extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxNewUserOpenDialogFragment f6762b;

    public /* synthetic */ C0502e(CashBoxNewUserOpenDialogFragment cashBoxNewUserOpenDialogFragment, int i7) {
        this.f6761a = i7;
        this.f6762b = cashBoxNewUserOpenDialogFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f6761a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), this.f6762b.getString(Jc.f.mm_terms_and_conditions));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/#/protocol/partner/agreement?version=BMFB-Privacy-Policy&title=Privacy%20Policy&ignoreRouter");
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/auto-transfer"), this.f6762b.getString(Jc.f.mm_terms_and_conditions));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f6761a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f6762b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f6762b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f6762b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
        }
    }
}
