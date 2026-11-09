package com.transsnet.palmpay.credit.ui.dialog;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcOpenProtocolDialog f29969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ApplyProtoContent f29970c;

    public /* synthetic */ F0(OcOpenProtocolDialog ocOpenProtocolDialog, ApplyProtoContent applyProtoContent, int i7) {
        this.f29968a = i7;
        this.f29969b = ocOpenProtocolDialog;
        this.f29970c = applyProtoContent;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f29968a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.f29969b.jump2ProtoPageDetail(this.f29970c.clickType);
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.f29969b.jump2CashProtoPageDetail(this.f29970c.clickType);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f29968a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f29969b.getContext().getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f29969b.getContext().getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
        }
    }
}
