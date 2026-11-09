package p270rd;

import android.text.Editable;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AmountEditText f41749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawInputAmountActivity f41750b;

    public h0(AmountEditText amountEditText, WithdrawInputAmountActivity withdrawInputAmountActivity) {
        this.f41749a = amountEditText;
        this.f41750b = withdrawInputAmountActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        int i7 = WithdrawInputAmountActivity.f33293p;
        WithdrawInputAmountActivity withdrawInputAmountActivity = this.f41750b;
        if (withdrawInputAmountActivity.o()) {
            withdrawInputAmountActivity.q();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        AmountEditText amountEditText = this.f41749a;
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
        AmountEditText amountEditText = this.f41749a;
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
