package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.D;
import B5.c;
import Ha.d;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.req.FundSendOtpReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.custom_view.StateListTextView;
import com.transsnet.palmpay.custom_view.model.ModelSendSms;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBankAccountOtpFragment extends BaseVerifyFragment<PayVerifyViewModel> implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelSendSms f27942j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f27943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public StateListTextView f27944p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f27945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f27946w = new c(this, 8);

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_bank_account_otp;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        View view = this.f27318b;
        this.f27942j = (ModelSendSms) view.findViewById(e.send_opt_mss);
        this.f27943o = (TextView) view.findViewById(e.invalidate_otp_tip_tv);
        this.f27944p = (StateListTextView) view.findViewById(e.textViewContinue);
        x(view.findViewById(e.ivClose));
        this.f27944p.setOnClickListener(new d(this, 22));
        TextView textView = this.f27942j.f31582e;
        this.t = textView;
        textView.setOnClickListener(this);
        this.f27942j.f31581d.addTextChangedListener(this);
        this.t.setEnabled(true);
        this.t.removeCallbacks(this.f27946w);
        this.t.setText(k.core_send_code);
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f27943o.setVisibility(8);
        this.t.setEnabled(false);
        this.t.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
        this.t.post(this.f27946w);
        FundSendOtpReq fundSendOtpReq = new FundSendOtpReq();
        fundSendOtpReq.reference = this.f27945v;
        ((PayApiService) p324va.c.f43141a.f14621b).fundSendOtp(fundSendOtpReq).k(f.f42629b).i(b.a()).subscribe(new D(this, 13));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f27945v = getArguments().getString("otp_reference");
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (TextUtils.isEmpty(this.f27942j.f31581d.getText().toString())) {
            this.f27944p.setEnabled(false);
        } else {
            this.f27944p.setEnabled(true);
        }
    }
}
