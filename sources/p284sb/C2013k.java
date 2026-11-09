package p284sb;

import Pa.r0;
import Ya.g;
import android.text.Editable;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: sb.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2013k implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputAmountActivity f42169a;

    public C2013k(InputAmountActivity inputAmountActivity) {
        this.f42169a = inputAmountActivity;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        InputAmountActivity inputAmountActivity = this.f42169a;
        if (inputAmountActivity.f28676L == null) {
            return;
        }
        long jF = r0.f(inputAmountActivity.p().getDouble());
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = inputAmountActivity.f28676L;
        if (jF < (balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L)) {
            ToastUtils.showLong(inputAmountActivity.getString(g.cs_amount_must_be_above_, r0.B(balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L, false)), new Object[0]);
            return;
        }
        long jF2 = r0.f(inputAmountActivity.p().getDouble());
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = inputAmountActivity.f28676L;
        if (jF2 > (balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L)) {
            ToastUtils.showLong(inputAmountActivity.getString(g.cs_amount_must_be_below_, r0.B(balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L, false)), new Object[0]);
        } else {
            inputAmountActivity.r();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
        InputAmountActivity inputAmountActivity = this.f42169a;
        if (!inputAmountActivity.p().isFocused()) {
            inputAmountActivity.p().requestFocus();
        }
        Editable text = inputAmountActivity.p().getText();
        int selectionStart = inputAmountActivity.p().getSelectionStart();
        if (text == null || text.length() <= 0 || selectionStart <= 0) {
            return;
        }
        text.delete(selectionStart - 1, selectionStart);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Intrinsics.checkNotNullParameter(digital, "digital");
        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
        InputAmountActivity inputAmountActivity = this.f42169a;
        if (!inputAmountActivity.p().isFocused()) {
            inputAmountActivity.p().requestFocus();
        }
        int selectionStart = inputAmountActivity.p().getSelectionStart();
        Editable text = inputAmountActivity.p().getText();
        if (text != null) {
            text.insert(selectionStart, digital);
        }
    }
}
