package com.transsnet.palmpay.managemoney.ui.fragment;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1586h extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxDepositFragment f32616a;

    public C1586h(CashBoxDepositFragment cashBoxDepositFragment) {
        this.f32616a = cashBoxDepositFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        String strG;
        Intrinsics.checkNotNullParameter(widget, "widget");
        CashBoxDepositFragment cashBoxDepositFragment = this.f32616a;
        GetCashBoxBeforeOrderConfigResp.CashBoxBeforeOrderConfig cashBoxBeforeOrderConfig = cashBoxDepositFragment.f32365X;
        if (TextUtils.isEmpty(cashBoxBeforeOrderConfig != null ? cashBoxBeforeOrderConfig.getProtocolUrl() : null)) {
            strG = com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox");
        } else {
            GetCashBoxBeforeOrderConfigResp.CashBoxBeforeOrderConfig cashBoxBeforeOrderConfig2 = cashBoxDepositFragment.f32365X;
            strG = com.transsnet.palmpay.core.config.d.g(cashBoxBeforeOrderConfig2 != null ? cashBoxBeforeOrderConfig2.getProtocolUrl() : null);
        }
        com.palmpay.lib.apm.launchcounter.util.d.R(strG, cashBoxDepositFragment.getString(Jc.f.mm_terms_and_conditions));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
        ds.setColor(this.f32616a.requireContext().getColor(Jc.a.mm_color_6306b2));
        ds.setUnderlineText(false);
    }
}
