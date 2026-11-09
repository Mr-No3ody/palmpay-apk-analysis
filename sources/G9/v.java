package G9;

import Pa.r0;
import android.text.Editable;
import com.transsnet.palmpay.cash_in.bean.request.CreateCashInOutOrderReqV2;
import com.transsnet.palmpay.cash_in.bean.request.ExtendField;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements DigitalKeyboardView.DigitalKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WithdrawV2Fragment f3191a;

    public v(WithdrawV2Fragment withdrawV2Fragment) {
        this.f3191a = withdrawV2Fragment;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onActionClick() {
        WithdrawV2Fragment withdrawV2Fragment = this.f3191a;
        StateAmountEditText stateAmountEditTextU = withdrawV2Fragment.u();
        long jF = r0.f(stateAmountEditTextU != null ? stateAmountEditTextU.getDouble() : 0.0d);
        withdrawV2Fragment.f27053Q = jF;
        if (!(jF > 0)) {
            ToastUtils.showShort("Input error", new Object[0]);
            return;
        }
        if (withdrawV2Fragment.f27054X == null) {
            ToastUtils.showShort("Please Add a withdrawal account", new Object[0]);
            return;
        }
        if (withdrawV2Fragment.f27061p0 < jF) {
            ToastUtils.showShort(withdrawV2Fragment.getString(p366y9.d.ci_out_of_balance), new Object[0]);
            return;
        }
        QueryLimitAmountResp.DataBean dataBean = withdrawV2Fragment.f27058k0;
        if (dataBean != null) {
            if (dataBean.getMaxAmount() < withdrawV2Fragment.f27053Q) {
                ToastUtils.showShort(withdrawV2Fragment.getString(p025ba.k.core_msg_amount_below_desc, r0.B(dataBean.getMaxAmount(), true)), new Object[0]);
                return;
            } else if (dataBean.getMinAmount() > withdrawV2Fragment.f27053Q) {
                ToastUtils.showShort(withdrawV2Fragment.getString(p025ba.k.core_msg_amount_above_desc, r0.B(dataBean.getMinAmount(), true)), new Object[0]);
                return;
            }
        }
        if (r0.U0()) {
            return;
        }
        CreateCashInOutOrderReqV2 req = new CreateCashInOutOrderReqV2();
        StateAmountEditText stateAmountEditTextU2 = withdrawV2Fragment.u();
        req.amount = r0.f(stateAmountEditTextU2 != null ? stateAmountEditTextU2.getDouble() : 0.0d);
        req.transType = "02";
        BankCardInfo bankCardInfo = withdrawV2Fragment.f27054X;
        ExtendField extendField = new ExtendField(null, null, null, 7, null);
        extendField.payerBankCode = bankCardInfo != null ? bankCardInfo.bankCode : null;
        extendField.payerBankAccNo = bankCardInfo != null ? bankCardInfo.bankAccountNo : null;
        extendField.payerBankName = bankCardInfo != null ? bankCardInfo.bankName : null;
        req.extendField = extendField;
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) withdrawV2Fragment.f27333i;
        if (withdrawViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            p140j8.f.s(withdrawViewModel, new J9.v(req, null), withdrawViewModel.f27112f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDeleteClick() {
        StateAmountEditText stateAmountEditTextU;
        WithdrawV2Fragment withdrawV2Fragment = this.f3191a;
        StateAmountEditText stateAmountEditTextU2 = withdrawV2Fragment.u();
        if (stateAmountEditTextU2 != null && !stateAmountEditTextU2.isFocused() && (stateAmountEditTextU = withdrawV2Fragment.u()) != null) {
            stateAmountEditTextU.requestFocus();
        }
        StateAmountEditText stateAmountEditTextU3 = withdrawV2Fragment.u();
        Editable text = stateAmountEditTextU3 != null ? stateAmountEditTextU3.getText() : null;
        StateAmountEditText stateAmountEditTextU4 = withdrawV2Fragment.u();
        int selectionStart = stateAmountEditTextU4 != null ? stateAmountEditTextU4.getSelectionStart() : 0;
        if (text == null || text.length() <= 0 || selectionStart <= 0) {
            return;
        }
        text.delete(selectionStart - 1, selectionStart);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView.DigitalKeyboardClickListener
    public final void onDigitalClick(CharSequence digital) {
        Editable text;
        StateAmountEditText stateAmountEditTextU;
        Intrinsics.checkNotNullParameter(digital, "digital");
        WithdrawV2Fragment withdrawV2Fragment = this.f3191a;
        StateAmountEditText stateAmountEditTextU2 = withdrawV2Fragment.u();
        if (stateAmountEditTextU2 != null && !stateAmountEditTextU2.isFocused() && (stateAmountEditTextU = withdrawV2Fragment.u()) != null) {
            stateAmountEditTextU.requestFocus();
        }
        StateAmountEditText stateAmountEditTextU3 = withdrawV2Fragment.u();
        int selectionStart = stateAmountEditTextU3 != null ? stateAmountEditTextU3.getSelectionStart() : 0;
        StateAmountEditText stateAmountEditTextU4 = withdrawV2Fragment.u();
        if (stateAmountEditTextU4 == null || (text = stateAmountEditTextU4.getText()) == null) {
            return;
        }
        text.insert(selectionStart, digital);
    }
}
