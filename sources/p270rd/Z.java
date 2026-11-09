package p270rd;

import android.text.Editable;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBaseActivity f41716a;

    public Z(TransferToBaseActivity transferToBaseActivity) {
        this.f41716a = transferToBaseActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        this.f41716a.w();
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        TransferToBaseActivity transferToBaseActivity = this.f41716a;
        if (!transferToBaseActivity.t().isFocused()) {
            transferToBaseActivity.m();
            transferToBaseActivity.t().requestFocus();
        }
        Editable text = transferToBaseActivity.t().getText();
        int selectionStart = transferToBaseActivity.t().getSelectionStart();
        if (text == null || text.length() <= 0 || selectionStart <= 0) {
            return;
        }
        text.delete(selectionStart - 1, selectionStart);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Intrinsics.checkNotNullParameter(digital, "digital");
        TransferToBaseActivity transferToBaseActivity = this.f41716a;
        if (!transferToBaseActivity.t().isFocused()) {
            transferToBaseActivity.m();
            transferToBaseActivity.t().requestFocus();
        }
        Editable text = transferToBaseActivity.t().getText();
        int selectionStart = transferToBaseActivity.t().getSelectionStart();
        if (text != null) {
            text.insert(selectionStart, digital);
        }
    }
}
