package Ab;

import android.text.Editable;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentBorrowFragment f128a;

    public j(CLInstallmentBorrowFragment cLInstallmentBorrowFragment) {
        this.f128a = cLInstallmentBorrowFragment;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        this.f128a.t();
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f128a;
        cLInstallmentBorrowFragment.f30519G1 = false;
        int selectionStart = cLInstallmentBorrowFragment.x().getSelectionStart();
        int selectionEnd = cLInstallmentBorrowFragment.x().getSelectionEnd();
        Editable text = cLInstallmentBorrowFragment.x().getText();
        if (text == null || text.length() <= 0 || selectionStart <= 0) {
            return;
        }
        if (selectionStart == selectionEnd) {
            Editable text2 = cLInstallmentBorrowFragment.x().getText();
            if (text2 != null) {
                text2.delete(selectionStart - 1, selectionStart);
                return;
            }
            return;
        }
        Editable text3 = cLInstallmentBorrowFragment.x().getText();
        if (text3 != null) {
            text3.delete(selectionStart, selectionEnd);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Intrinsics.checkNotNullParameter(digital, "digital");
        CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f128a;
        Editable text = cLInstallmentBorrowFragment.x().getText();
        if (text != null) {
            text.insert(cLInstallmentBorrowFragment.x().getSelectionStart(), digital);
        }
    }
}
