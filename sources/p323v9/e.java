package p323v9;

import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog2;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements TipsDialog2.TipsDialogCallback {
    @Override // com.transsnet.palmpay.custom_view.dialog.TipsDialog2.TipsDialogCallback
    public final void confirmClick() {
        d.F("/account/palmpayLevel");
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.TipsDialog2.TipsDialogCallback
    public final void opposeClick() {
    }
}
