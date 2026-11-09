package p285sc;

import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import p383zc.y;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnResolveActivity f42197a;

    public C(ReferEarnResolveActivity referEarnResolveActivity) {
        this.f42197a = referEarnResolveActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        ReferEarnResolveActivity referEarnResolveActivity = this.f42197a;
        if (z3) {
            ReferEarnResolveActivity.m(referEarnResolveActivity);
        } else {
            ((y) referEarnResolveActivity.f27350a).referEarnWithDrawCreate(referEarnResolveActivity.f31929p);
        }
    }
}
