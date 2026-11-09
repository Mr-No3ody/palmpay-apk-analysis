package p340wc;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements RichTextDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f43399a;

    public h(String str) {
        this.f43399a = str;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            ARouter.getInstance().build("/refer_earn/resolve").withString("extra_data", String.valueOf(this.f43399a)).navigation();
        }
    }
}
