package com.transsnet.palmpay.managemoney.ui.fragment;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1581c extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxAutoSaveFragment f32596b;

    public /* synthetic */ C1581c(CashBoxAutoSaveFragment cashBoxAutoSaveFragment, int i7) {
        this.f32595a = i7;
        this.f32596b = cashBoxAutoSaveFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f32595a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(widget, "widget");
                CashBoxAutoSaveFragment cashBoxAutoSaveFragment = this.f32596b;
                GetAutoTransferConfigResp getAutoTransferConfigResp = cashBoxAutoSaveFragment.f32350Q;
                String str = null;
                if (TextUtils.isEmpty(getAutoTransferConfigResp != null ? getAutoTransferConfigResp.agreementUrl : null)) {
                    str = "/h5/conditions/ng/auto-transfer";
                } else {
                    GetAutoTransferConfigResp getAutoTransferConfigResp2 = cashBoxAutoSaveFragment.f32350Q;
                    if (getAutoTransferConfigResp2 != null) {
                        str = getAutoTransferConfigResp2.agreementUrl;
                    }
                }
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g(str), cashBoxAutoSaveFragment.getString(Jc.f.mm_terms_and_conditions));
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f32595a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32596b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32596b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.linkColor = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                ds.setColor(this.f32596b.requireContext().getColor(Jc.a.mm_color_6306b2));
                ds.setUnderlineText(false);
                break;
        }
    }
}
