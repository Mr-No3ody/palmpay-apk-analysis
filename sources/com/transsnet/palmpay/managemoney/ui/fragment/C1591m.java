package com.transsnet.palmpay.managemoney.ui.fragment;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1591m extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxIntroductionFragment f32640b;

    public /* synthetic */ C1591m(CashBoxIntroductionFragment cashBoxIntroductionFragment, int i7) {
        this.f32639a = i7;
        this.f32640b = cashBoxIntroductionFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f32639a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), this.f32640b.getString(Jc.f.mm_terms_and_conditions));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Pa.i0.b0("/#/protocol/partner/agreement?version=BMFB-Privacy-Policy&title=Privacy%20Policy&ignoreRouter");
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/auto-transfer"), this.f32640b.getString(Jc.f.mm_terms_and_conditions));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f32639a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32640b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32640b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32640b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
        }
    }
}
