package com.transsnet.palmpay.managemoney.ui.activity;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.SimpleTextWatcher;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxDepositFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxWithdrawFragment;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements SimpleTextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32141b;

    public /* synthetic */ P(Object obj, int i7) {
        this.f32140a = i7;
        this.f32141b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.SimpleTextWatcher, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f32140a;
    }

    @Override // com.transsnet.palmpay.custom_view.SimpleTextWatcher, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f32140a;
    }

    @Override // com.transsnet.palmpay.custom_view.SimpleTextWatcher, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        RoundedTextView roundedTextView;
        CashBoxViewModel cashBoxViewModel;
        Object obj = this.f32141b;
        switch (this.f32140a) {
            case 0:
                int i12 = SelectStateActivity.f32186i;
                ((SelectStateActivity) obj).m().setEnabled(!TextUtils.isEmpty(charSequence));
                break;
            case 1:
                CashBoxDepositFragment.a aVar = CashBoxDepositFragment.f32357p0;
                CashBoxDepositFragment cashBoxDepositFragment = (CashBoxDepositFragment) obj;
                cashBoxDepositFragment.x();
                p355xf.t tVar = cashBoxDepositFragment.f32363M;
                TextView textView = (TextView) tVar.getValue();
                if (textView != null) {
                    textView.setVisibility(!TextUtils.isEmpty(null) ? 0 : 8);
                }
                TextView textView2 = (TextView) tVar.getValue();
                if (textView2 != null) {
                    textView2.setText((CharSequence) null);
                }
                CheckBox checkBox = (CheckBox) cashBoxDepositFragment.t.getValue();
                if (checkBox != null && (roundedTextView = (RoundedTextView) cashBoxDepositFragment.f32370o.getValue()) != null) {
                    roundedTextView.setEnabled(checkBox.isChecked() && !TextUtils.isEmpty(charSequence));
                }
                AmountEditText amountEditTextT = cashBoxDepositFragment.t();
                if (amountEditTextT != null) {
                    CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) cashBoxDepositFragment.f27333i;
                    if (cashBoxViewModel2 != null) {
                        cashBoxViewModel2.e(amountEditTextT.getLong());
                    }
                    CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV = cashBoxDepositFragment.v();
                    if (cashBoxEstimatedInterestViewV != null) {
                        long j6 = amountEditTextT.getLong();
                        GetUserAssetsAmountResp.Balance balance = cashBoxEstimatedInterestViewV.f32687A;
                        long j10 = balance != null ? balance.availableBalance : 0L;
                        ConstraintLayout constraintLayout = cashBoxEstimatedInterestViewV.f32696f;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(j6 > j10 ? 0 : 8);
                        }
                    }
                }
                break;
            case 2:
                CashBoxWithdrawFragment.a aVar2 = CashBoxWithdrawFragment.f32442H;
                CashBoxWithdrawFragment cashBoxWithdrawFragment = (CashBoxWithdrawFragment) obj;
                RoundedTextView roundedTextView2 = (RoundedTextView) cashBoxWithdrawFragment.f32446j.getValue();
                if (roundedTextView2 != null) {
                    roundedTextView2.setEnabled(!TextUtils.isEmpty(charSequence));
                }
                p355xf.t tVar2 = cashBoxWithdrawFragment.t;
                TextView textView3 = (TextView) tVar2.getValue();
                if (textView3 != null) {
                    textView3.setVisibility(TextUtils.isEmpty(null) ? 8 : 0);
                }
                TextView textView4 = (TextView) tVar2.getValue();
                if (textView4 != null) {
                    textView4.setText((CharSequence) null);
                }
                AmountEditText amountEditTextT2 = cashBoxWithdrawFragment.t();
                if (amountEditTextT2 != null && (cashBoxViewModel = (CashBoxViewModel) cashBoxWithdrawFragment.f27333i) != null) {
                    cashBoxViewModel.e(amountEditTextT2.getLong());
                    break;
                }
                break;
            default:
                CashBoxEstimatedInterestView cashBoxEstimatedInterestView = (CashBoxEstimatedInterestView) obj;
                AmountEditText amountEditText = cashBoxEstimatedInterestView.f32698i;
                if (amountEditText != null) {
                    amountEditText.setTypeface(TextUtils.isEmpty(charSequence != null ? charSequence.toString() : null) ? Typeface.create("sans-serif", 0) : Typeface.create("sans-serif-medium", 0));
                }
                AmountEditText amountEditText2 = cashBoxEstimatedInterestView.f32698i;
                if (amountEditText2 != null) {
                    amountEditText2.setTextSize(TextUtils.isEmpty(charSequence != null ? charSequence.toString() : null) ? 16.0f : 32.0f);
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void f(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void g(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void h(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
