package p353xd;

import android.text.Editable;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AmountEditText f43849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43850b;

    public A(AmountEditText amountEditText, TransferToBankInputAmountActivity transferToBankInputAmountActivity) {
        this.f43849a = amountEditText;
        this.f43850b = transferToBankInputAmountActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43850b;
        transferToBankInputAmountActivity.getClass();
        transferToBankInputAmountActivity.s();
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        AmountEditText amountEditText = this.f43849a;
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
        AmountEditText amountEditText = this.f43849a;
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
