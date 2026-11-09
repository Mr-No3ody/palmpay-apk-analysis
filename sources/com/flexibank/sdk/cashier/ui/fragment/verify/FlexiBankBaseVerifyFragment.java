package com.flexibank.sdk.cashier.ui.fragment.verify;

import E.AbstractC0198c;
import J3.a;
import Nc.x;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.base.FlexiBankBaseFragment;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierVerifyViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/flexibank/sdk/base/FlexiBankBaseFragment;", "Lcom/flexibank/sdk/cashier/viewmodel/FlexiBankCashierVerifyViewModel;", "<init>", "()V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FlexiBankBaseVerifyFragment<B extends ViewBinding> extends FlexiBankBaseFragment<FlexiBankCashierVerifyViewModel, B> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f22001o = 0;

    public FlexiBankBaseVerifyFragment() {
        super(FlexiBankCashierVerifyViewModel.class);
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int f() {
        return 0;
    }

    public final FlexiBankPayVerificationActivity n() {
        if (!(getActivity() instanceof FlexiBankPayVerificationActivity)) {
            return null;
        }
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity");
        return (FlexiBankPayVerificationActivity) activity;
    }

    public final FlexiBankPayVerificationCallback o() {
        if (!(getActivity() instanceof FlexiBankPayVerificationCallback)) {
            return null;
        }
        KeyEventDispatcher$Component activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback");
        return (FlexiBankPayVerificationCallback) activity;
    }

    public final void p(View view) {
        if (view != null) {
            view.setOnClickListener(new x(this, 20));
        }
    }

    public final void q(ImageView imageView, TextView textView) {
        FlexiBankPayVerificationActivity flexiBankPayVerificationActivityN = n();
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = flexiBankPayVerificationActivityN != null ? flexiBankPayVerificationActivityN.f21975H : null;
        if (flexiBankCashierPaymentMethodBean == null) {
            return;
        }
        if (imageView != null) {
            AbstractC0198c.M(flexiBankCashierPaymentMethodBean.getBankUrl(), imageView);
        }
        if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getBankAccountNo())) {
            if (textView != null) {
                textView.setText(a.v(flexiBankCashierPaymentMethodBean.getBankName(), flexiBankCashierPaymentMethodBean.getBankAccountNo()));
            }
        } else {
            if (TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getCardNo()) || textView == null) {
                return;
            }
            textView.setText(a.v(flexiBankCashierPaymentMethodBean.getBankName(), flexiBankCashierPaymentMethodBean.getCardNo()));
        }
    }
}
