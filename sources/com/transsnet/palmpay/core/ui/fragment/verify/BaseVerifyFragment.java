package com.transsnet.palmpay.core.ui.fragment.verify;

import Ha.d;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseVerifyFragment<VM extends BaseViewModel> extends BaseMvvmFragment<VM> {
    public void onBackPressed() {
    }

    public final PayVerificationActivity t() {
        if (getActivity() instanceof PayVerificationActivity) {
            return (PayVerificationActivity) getActivity();
        }
        return null;
    }

    public final PayVerificationCallback u() {
        if (getActivity() instanceof PayVerificationCallback) {
            return (PayVerificationCallback) getActivity();
        }
        return null;
    }

    public boolean v() {
        return this instanceof CheckFraudAlertFragment;
    }

    public final void x(View view) {
        view.setOnClickListener(new d(this, 21));
    }

    public final void y(ImageView imageView, TextView textView) {
        PayVerificationActivity payVerificationActivityT = t();
        CashierPaymentMethodBean cashierPaymentMethodBean = payVerificationActivityT == null ? null : payVerificationActivityT.f27695e;
        if (cashierPaymentMethodBean == null) {
            return;
        }
        r0.o1(cashierPaymentMethodBean.bankUrl, imageView);
        if (!TextUtils.isEmpty(cashierPaymentMethodBean.bankAccountNo)) {
            textView.setText(r0.A0(cashierPaymentMethodBean.bankName, cashierPaymentMethodBean.bankAccountNo));
        } else {
            if (TextUtils.isEmpty(cashierPaymentMethodBean.cardNo)) {
                return;
            }
            textView.setText(r0.A0(cashierPaymentMethodBean.bankName, cashierPaymentMethodBean.cardNo));
        }
    }

    public void w() {
    }
}
