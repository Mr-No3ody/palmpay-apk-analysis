package p294tb;

import android.text.Editable;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.custom_view.AmountEditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentActivity f42441a;

    public Y(CLRepaymentActivity cLRepaymentActivity) {
        this.f42441a = cLRepaymentActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        int i7 = CLRepaymentActivity.f29036w0;
        this.f42441a.m();
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        Editable text;
        int i7 = CLRepaymentActivity.f29036w0;
        CLRepaymentActivity cLRepaymentActivity = this.f42441a;
        if (cLRepaymentActivity.q() != null) {
            AmountEditText amountEditTextQ = cLRepaymentActivity.q();
            int selectionStart = amountEditTextQ != null ? amountEditTextQ.getSelectionStart() : 0;
            AmountEditText amountEditTextQ2 = cLRepaymentActivity.q();
            int selectionEnd = amountEditTextQ2 != null ? amountEditTextQ2.getSelectionEnd() : 0;
            AmountEditText amountEditTextQ3 = cLRepaymentActivity.q();
            Editable text2 = amountEditTextQ3 != null ? amountEditTextQ3.getText() : null;
            Intrinsics.e(text2);
            if (text2.length() <= 0 || selectionStart <= 0) {
                return;
            }
            if (selectionStart == selectionEnd) {
                AmountEditText amountEditTextQ4 = cLRepaymentActivity.q();
                text = amountEditTextQ4 != null ? amountEditTextQ4.getText() : null;
                Intrinsics.e(text);
                text.delete(selectionStart - 1, selectionStart);
                return;
            }
            AmountEditText amountEditTextQ5 = cLRepaymentActivity.q();
            text = amountEditTextQ5 != null ? amountEditTextQ5.getText() : null;
            Intrinsics.e(text);
            text.delete(selectionStart, selectionEnd);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Editable text;
        Intrinsics.checkNotNullParameter(digital, "digital");
        int i7 = CLRepaymentActivity.f29036w0;
        CLRepaymentActivity cLRepaymentActivity = this.f42441a;
        AmountEditText amountEditTextQ = cLRepaymentActivity.q();
        if (amountEditTextQ == null || (text = amountEditTextQ.getText()) == null) {
            return;
        }
        AmountEditText amountEditTextQ2 = cLRepaymentActivity.q();
        text.insert(amountEditTextQ2 != null ? amountEditTextQ2.getSelectionStart() : 0, digital);
    }
}
