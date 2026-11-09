package p270rd;

import android.text.Editable;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rd.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1974q implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AmountEditText f41768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayShopInputAmountActivity f41769b;

    public C1974q(AmountEditText amountEditText, PayShopInputAmountActivity payShopInputAmountActivity) {
        this.f41768a = amountEditText;
        this.f41769b = payShopInputAmountActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        int i7 = PayShopInputAmountActivity.f33176p;
        PayShopInputAmountActivity payShopInputAmountActivity = this.f41769b;
        if (payShopInputAmountActivity.o()) {
            payShopInputAmountActivity.q();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        AmountEditText amountEditText = this.f41768a;
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
        AmountEditText amountEditText = this.f41768a;
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
