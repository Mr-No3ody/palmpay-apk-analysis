package p285sc;

import N8.q0;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnResolveActivity f42239a;

    public z(ReferEarnResolveActivity referEarnResolveActivity) {
        this.f42239a = referEarnResolveActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            ReferEarnResolveActivity.m(this.f42239a);
        } else {
            q0.u("/main/statement");
        }
    }
}
