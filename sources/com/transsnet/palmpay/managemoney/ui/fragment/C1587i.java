package com.transsnet.palmpay.managemoney.ui.fragment;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1587i extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxDepositFragment f32618b;

    public /* synthetic */ C1587i(CashBoxDepositFragment cashBoxDepositFragment, int i7) {
        this.f32617a = i7;
        this.f32618b = cashBoxDepositFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        String strG;
        switch (this.f32617a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Pa.i0.b0("/#/protocol/partner/agreement?version=BMFB-Privacy-Policy&title=Privacy%20Policy&ignoreRouter");
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                CashBoxDepositFragment cashBoxDepositFragment = this.f32618b;
                GetAutoTransferConfigResp getAutoTransferConfigResp = cashBoxDepositFragment.f32366Y;
                if (TextUtils.isEmpty(getAutoTransferConfigResp != null ? getAutoTransferConfigResp.agreementUrl : null)) {
                    strG = com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/auto-transfer");
                } else {
                    GetAutoTransferConfigResp getAutoTransferConfigResp2 = cashBoxDepositFragment.f32366Y;
                    strG = com.transsnet.palmpay.core.config.d.g(getAutoTransferConfigResp2 != null ? getAutoTransferConfigResp2.agreementUrl : null);
                }
                com.palmpay.lib.apm.launchcounter.util.d.R(strG, cashBoxDepositFragment.getString(Jc.f.mm_terms_and_conditions));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f32617a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32618b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32618b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
        }
    }
}
