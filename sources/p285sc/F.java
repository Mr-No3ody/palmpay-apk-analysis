package p285sc;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f42199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnResolveActivity f42200b;

    public F(String str, ReferEarnResolveActivity referEarnResolveActivity) {
        this.f42199a = str;
        this.f42200b = referEarnResolveActivity;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            ARouter.getInstance().build("/coreImpl/comment_add").withString("orderNo", this.f42199a).withString("COMMENT_TYPE", "ReferEarn").navigation();
            this.f42200b.n();
        }
    }
}
