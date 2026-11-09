package com.transsnet.palmpay.credit.ui.dialog;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLOpenProtocolDialog f30029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ApplyProtoContent f30030c;

    public /* synthetic */ T(CLOpenProtocolDialog cLOpenProtocolDialog, ApplyProtoContent applyProtoContent, int i7) {
        this.f30028a = i7;
        this.f30029b = cLOpenProtocolDialog;
        this.f30030c = applyProtoContent;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f30028a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.f30029b.jump2ProtoPageDetail(this.f30030c.clickType);
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.f30029b.jump2FlexiProtoPageDetail(this.f30030c.clickType);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f30028a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f30029b.getContext().getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f30029b.getContext().getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
        }
    }
}
