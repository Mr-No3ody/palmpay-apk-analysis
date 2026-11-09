package p285sc;

import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements RichTextDialog.ConfirmInterface {
    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            d.F("/main/bankCardAndAccount");
        }
    }
}
