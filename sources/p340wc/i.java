package p340wc;

import N8.q0;
import com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements RichTextDialog.ConfirmInterface {
    @Override // com.transsnet.palmpay.jara_packet.ui.dialog.RichTextDialog.ConfirmInterface
    public final void confirm(boolean z3) {
        if (z3) {
            q0.u("/main/bankCardAndAccount");
        }
    }
}
