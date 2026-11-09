package p369yd;

import android.text.Editable;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AmountEditText f44306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayInputAmountActivity f44307b;

    public o(AmountEditText amountEditText, TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity) {
        this.f44306a = amountEditText;
        this.f44307b = transferToPalmPayInputAmountActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
        TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = this.f44307b;
        if (transferToPalmPayInputAmountActivity.f33619v == null) {
            return;
        }
        transferToPalmPayInputAmountActivity.s();
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        AmountEditText amountEditText = this.f44306a;
        if (amountEditText != null && !amountEditText.isFocused() && amountEditText != null) {
            amountEditText.requestFocus();
        }
        Editable text = amountEditText != null ? amountEditText.getText() : null;
        int selectionStart = amountEditText != null ? amountEditText.getSelectionStart() : 0;
        if (text == null || text.length() == 0 || selectionStart <= 0) {
            return;
        }
        text.delete(selectionStart - 1, selectionStart);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Intrinsics.checkNotNullParameter(digital, "digital");
        AmountEditText amountEditText = this.f44306a;
        if (amountEditText != null && !amountEditText.isFocused() && amountEditText != null) {
            amountEditText.requestFocus();
        }
        Editable text = amountEditText != null ? amountEditText.getText() : null;
        int selectionStart = amountEditText != null ? amountEditText.getSelectionStart() : 0;
        if (text != null) {
            text.insert(selectionStart, digital);
        }
    }
}
