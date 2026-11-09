package com.transsnet.palmpay.core.ui.fragment;

import La.A;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.RiskControlResult;
import com.transsnet.palmpay.core.bean.req.VerifyRiskControlSmsReq;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements OnSendCodeListener, PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RiskControlCheckOtcFragment f27922a;

    public /* synthetic */ i(RiskControlCheckOtcFragment riskControlCheckOtcFragment) {
        this.f27922a = riskControlCheckOtcFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String str) {
        RiskControlCheckOtcFragment riskControlCheckOtcFragment = this.f27922a;
        riskControlCheckOtcFragment.getClass();
        if (TextUtils.isEmpty(str) || str.length() < 6) {
            return;
        }
        KeyboardUtils.hideSoftInput(riskControlCheckOtcFragment.getActivity());
        VerifyRiskControlSmsReq verifyRiskControlSmsReq = new VerifyRiskControlSmsReq();
        verifyRiskControlSmsReq.code = str;
        RiskControlResult riskControlResult = riskControlCheckOtcFragment.f27869o;
        verifyRiskControlSmsReq.businessRiskType = riskControlResult.businessRiskType;
        verifyRiskControlSmsReq.disposal = riskControlResult.disposal;
        verifyRiskControlSmsReq.flowId = riskControlResult.flowId;
        ((A) riskControlCheckOtcFragment.f27328i).checkSms(verifyRiskControlSmsReq);
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        RiskControlCheckOtcFragment riskControlCheckOtcFragment = this.f27922a;
        ((A) riskControlCheckOtcFragment.f27328i).sendSms(riskControlCheckOtcFragment.f27869o.getSmsSceneByBusinessRiskType(), i7);
    }
}
