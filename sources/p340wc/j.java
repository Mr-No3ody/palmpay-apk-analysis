package p340wc;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f43400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithdrawListFragment f43401b;

    public j(String str, ReferEarnWithdrawListFragment referEarnWithdrawListFragment) {
        this.f43400a = str;
        this.f43401b = referEarnWithdrawListFragment;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            ARouter.getInstance().build("/coreImpl/comment_add").withString("orderNo", this.f43400a).withString("COMMENT_TYPE", "ReferEarn").navigation();
            ReferEarnWithdrawListFragment referEarnWithdrawListFragment = this.f43401b;
            referEarnWithdrawListFragment.f31963o = 1;
            referEarnWithdrawListFragment.u();
        }
    }
}
