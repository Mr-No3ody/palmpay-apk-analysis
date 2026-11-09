package com.transsnet.palmpay.core.ui.fragment;

import La.A;
import Pa.C0525w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.RiskControlResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.VerifyRiskControlSmsRsp;
import com.transsnet.palmpay.core.ui.activity.RiskControlVerifyActivity;
import com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class RiskControlCheckOtcFragment extends BaseMVPFragment<A> implements RiskControlCheckOtcContact.View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OneTimeCodeView f27868j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RiskControlResult f27869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f27870p;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return L9.b.core_fragment_risk_control_check_otc;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact.View
    public final void handleCheckResult(VerifyRiskControlSmsRsp verifyRiskControlSmsRsp) {
        E activity = getActivity();
        if (verifyRiskControlSmsRsp == null || verifyRiskControlSmsRsp.data == null || !(activity instanceof RiskControlVerifyActivity)) {
            return;
        }
        RiskControlVerifyActivity riskControlVerifyActivity = (RiskControlVerifyActivity) activity;
        C0525w c0525wF = C0525w.f();
        String json = ((Gson) c0525wF.f7166b).toJson(verifyRiskControlSmsRsp.data);
        riskControlVerifyActivity.getClass();
        if (TextUtils.isEmpty(json)) {
            riskControlVerifyActivity.setResult(0);
        } else {
            Intent intent = new Intent();
            intent.putExtra("extra_data", json);
            riskControlVerifyActivity.setResult(-1, intent);
        }
        riskControlVerifyActivity.finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        RiskControlResult riskControlResult = this.f27869o;
        if (riskControlResult == null) {
            return 0;
        }
        if (TransType.TRANS_TYPE_BIND_REPAY_CARD.equalsIgnoreCase(riskControlResult.businessRiskType)) {
            this.f27870p.setText(k.core_msg_verify_otp_for_risk_control_1);
            return 0;
        }
        this.f27870p.setText(k.core_msg_verify_otp_for_risk_control_2);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        this.f27868j.c();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27869o = (RiskControlResult) arguments.getParcelable("result");
        }
        this.f27870p = (TextView) this.f27318b.findViewById(L9.a.textViewMessage);
        OneTimeCodeView oneTimeCodeView = (OneTimeCodeView) this.f27318b.findViewById(L9.a.viewOtc);
        this.f27868j = oneTimeCodeView;
        oneTimeCodeView.setSendCodeListener(new i(this));
        this.f27868j.setCodeEnteredListener(new i(this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact.View
    public final void showErrorMessage(String str) {
        OneTimeCodeView oneTimeCodeView = this.f27868j;
        if (oneTimeCodeView != null) {
            oneTimeCodeView.setError(str);
            PinEntryView pinEntryView = this.f27868j.f28509c;
            if (pinEntryView != null) {
                pinEntryView.setText("");
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new A();
    }
}
