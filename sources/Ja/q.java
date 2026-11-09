package Ja;

import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayOtpFragment;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;
import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanReq;
import com.transsnet.palmpay.credit.bean.req.ContactData;
import com.transsnet.palmpay.credit.bean.req.OcAddContactReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.resp.OcPhoneNumberValidResp;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainBean;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainResp;
import com.transsnet.palmpay.credit.bean.rsp.CLProductResp;
import com.transsnet.palmpay.credit.bean.rsp.ProductSubs;
import com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLBorrowInstallmentAccountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLUpgradeInstallmentAccountDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p294tb.C2055q;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4673g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4674i;

    public /* synthetic */ q(Object obj, int i7, int i10) {
        this.f4672f = i10;
        this.f4674i = obj;
        this.f4673g = i7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f4672f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CheckPalmPayOtpFragment) this.f4674i).f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                p171lb.c.a((p171lb.c) this.f4674i, d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLBorrowResultActivity) this.f4674i).addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcContactActivity) this.f4674i).addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        Object obj = this.f4674i;
        switch (this.f4672f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                CheckPalmPayOtpFragment.a aVar = CheckPalmPayOtpFragment.f27988o;
                CheckPalmPayOtpFragment checkPalmPayOtpFragment = (CheckPalmPayOtpFragment) obj;
                OneTimeCodeView oneTimeCodeViewT = checkPalmPayOtpFragment.t();
                if (oneTimeCodeViewT != null) {
                    oneTimeCodeViewT.setSendOtcButtonState(true);
                }
                OneTimeCodeView oneTimeCodeViewT2 = checkPalmPayOtpFragment.t();
                if (oneTimeCodeViewT2 != null) {
                    oneTimeCodeViewT2.b();
                }
                break;
            case 1:
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener = ((p171lb.c) obj).f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener.onOneTouchBorrowInfoFail();
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                ((CLBorrowResultActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ((OcContactActivity) obj).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Long maxLoanAmt;
        String str;
        int i7 = 3;
        int i10 = 2;
        int i11 = this.f4673g;
        Object obj2 = this.f4674i;
        int i12 = 1;
        switch (this.f4672f) {
            case 0:
                CommonResult response = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                CheckPalmPayOtpFragment checkPalmPayOtpFragment = (CheckPalmPayOtpFragment) obj2;
                if (response.isSuccess()) {
                    CheckPalmPayOtpFragment.a aVar = CheckPalmPayOtpFragment.f27988o;
                    if (i11 == 0) {
                        try {
                            Intrinsics.e(SmsRetriever.getClient(checkPalmPayOtpFragment.requireContext()).startSmsRetriever());
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    ToastUtils.showLong(p025ba.k.core_one_time_code_sent);
                    return;
                }
                CheckPalmPayOtpFragment.a aVar2 = CheckPalmPayOtpFragment.f27988o;
                OneTimeCodeView oneTimeCodeViewT = checkPalmPayOtpFragment.t();
                if (oneTimeCodeViewT != null) {
                    oneTimeCodeViewT.setSendOtcButtonState(true);
                }
                OneTimeCodeView oneTimeCodeViewT2 = checkPalmPayOtpFragment.t();
                if (oneTimeCodeViewT2 != null) {
                    oneTimeCodeViewT2.setError(response.getRespMsg());
                }
                OneTimeCodeView oneTimeCodeViewT3 = checkPalmPayOtpFragment.t();
                if (oneTimeCodeViewT3 != null) {
                    oneTimeCodeViewT3.b();
                    return;
                }
                return;
            case 1:
                CLProductResp response2 = (CLProductResp) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                p171lb.c cVar = (p171lb.c) obj2;
                if (!response2.isSuccess()) {
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener = cVar.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener.onOneTouchBorrowInfoFail();
                        return;
                    }
                    return;
                }
                ProductSubs data = response2.getData();
                long jLongValue = (data == null || (maxLoanAmt = data.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt.longValue();
                cVar.getClass();
                F6.d.h("OneTouchBorrowManager", 3, "productSubId = " + i11);
                if (i11 == 1) {
                    C0.G.h(p221ob.c.f40268a).clQueryCashRepaymentPlan(new CLRepaymentPlanReq(Long.valueOf(jLongValue), null, false, 4, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p171lb.b(cVar, i12));
                    return;
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        C0.G.h(p221ob.c.f40268a).clQueryCashRepaymentPlan(new CLRepaymentPlanReq(Long.valueOf(jLongValue), null, false, 4, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p171lb.b(cVar, i7));
                        return;
                    } else {
                        C0.G.h(p221ob.c.f40268a).clQueryShortCashRepaymentPlan(new CLRepaymentPlanReq(Long.valueOf(jLongValue), null, false, 4, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p171lb.b(cVar, i10));
                        return;
                    }
                }
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener2 = cVar.f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener2 != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener2.onOneTouchBorrowInfoFail();
                    return;
                }
                return;
            case 2:
                QueryCanBorrowAgainResp queryCanBorrowAgainResp = (QueryCanBorrowAgainResp) obj;
                CLBorrowResultActivity cLBorrowResultActivity = (CLBorrowResultActivity) obj2;
                cLBorrowResultActivity.showLoadingDialog(false);
                if (queryCanBorrowAgainResp == null || !queryCanBorrowAgainResp.isSuccess()) {
                    return;
                }
                QueryCanBorrowAgainBean data2 = queryCanBorrowAgainResp.getData();
                if (data2 != null ? Intrinsics.c(data2.getAvailableOpenInstallmentLoan(), Boolean.TRUE) : false) {
                    CLUpgradeInstallmentAccountDialog cLUpgradeInstallmentAccountDialog = new CLUpgradeInstallmentAccountDialog(cLBorrowResultActivity);
                    cLUpgradeInstallmentAccountDialog.show();
                    cLUpgradeInstallmentAccountDialog.fillData(queryCanBorrowAgainResp, i11);
                    return;
                } else {
                    QueryCanBorrowAgainBean data3 = queryCanBorrowAgainResp.getData();
                    if (data3 != null ? Intrinsics.c(data3.getBorrowAgainAble(), Boolean.TRUE) : false) {
                        CLBorrowInstallmentAccountDialog cLBorrowInstallmentAccountDialog = new CLBorrowInstallmentAccountDialog(cLBorrowResultActivity);
                        cLBorrowInstallmentAccountDialog.show();
                        cLBorrowInstallmentAccountDialog.fillData(queryCanBorrowAgainResp, i11);
                        return;
                    }
                    return;
                }
            default:
                OcPhoneNumberValidResp ocPhoneNumberValidResp = (OcPhoneNumberValidResp) obj;
                OcContactActivity ocContactActivity = (OcContactActivity) obj2;
                ocContactActivity.showLoadingDialog(false);
                if (ocPhoneNumberValidResp == null || !ocPhoneNumberValidResp.isSuccess()) {
                    ToastUtils.showShort(ocPhoneNumberValidResp != null ? ocPhoneNumberValidResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                if (TextUtils.isEmpty(ocPhoneNumberValidResp.getData())) {
                    if (i11 == 0) {
                        if (ocContactActivity.f29409g1 < 2) {
                            ocContactActivity.K().setText(ocContactActivity.getString(Ya.g.cs_oc_please_enter_a_valid_phone_number));
                            ocContactActivity.K().setVisibility(0);
                            ocContactActivity.I().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                            return;
                        } else {
                            ocContactActivity.M().setText(ocContactActivity.getString(Ya.g.cs_oc_please_enter_a_valid_phone_number));
                            ocContactActivity.M().setVisibility(0);
                            ocContactActivity.N().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                            return;
                        }
                    }
                    if (ocContactActivity.f29409g1 < 2) {
                        ocContactActivity.T().setText(ocContactActivity.getString(Ya.g.cs_oc_please_enter_a_valid_phone_number));
                        ocContactActivity.T().setVisibility(0);
                        ocContactActivity.R().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                        return;
                    } else {
                        ocContactActivity.V().setText(ocContactActivity.getString(Ya.g.cs_oc_please_enter_a_valid_phone_number));
                        ocContactActivity.V().setVisibility(0);
                        ocContactActivity.W().setBackgroundResource(Ya.d.cs_oc_contact_et_bg);
                        return;
                    }
                }
                if (i11 == 0) {
                    ocContactActivity.a0(1, ocContactActivity.f29409g1 < 2 ? StringsKt.V(ocContactActivity.R().getText().toString()).toString() : StringsKt.V(ocContactActivity.Q().getText().toString()).toString());
                    return;
                }
                int i13 = OcContactActivity.f29378l1;
                ocContactActivity.showLoadingDialog(true);
                ArrayList arrayList = new ArrayList();
                if (ocContactActivity.f29409g1 < 2) {
                    String string = StringsKt.V(ocContactActivity.F().getText().toString()).toString();
                    String string2 = StringsKt.V(ocContactActivity.I().getText().toString()).toString();
                    ArrayList arrayList2 = ocContactActivity.f29407c1;
                    if (arrayList2 == null) {
                        Intrinsics.n("mFirstLabelData");
                        throw null;
                    }
                    p368yb.K k2 = ocContactActivity.d1;
                    if (k2 == null) {
                        Intrinsics.n("mFirstLabelAdapter");
                        throw null;
                    }
                    arrayList.add(new ContactData(string, string2, (String) arrayList2.get(k2.f44185g)));
                    String string3 = StringsKt.V(ocContactActivity.O().getText().toString()).toString();
                    String string4 = StringsKt.V(ocContactActivity.R().getText().toString()).toString();
                    ArrayList arrayList3 = ocContactActivity.f29408e1;
                    if (arrayList3 == null) {
                        Intrinsics.n("mSecondLabelData");
                        throw null;
                    }
                    p368yb.K k8 = ocContactActivity.f1;
                    if (k8 == null) {
                        Intrinsics.n("mSecondLabelAdapter");
                        throw null;
                    }
                    arrayList.add(new ContactData(string3, string4, (String) arrayList3.get(k8.f44185g)));
                } else {
                    String string5 = StringsKt.V(ocContactActivity.G().getText().toString()).toString();
                    String string6 = StringsKt.V(ocContactActivity.H().getText().toString()).toString();
                    ArrayList arrayList4 = ocContactActivity.f29407c1;
                    if (arrayList4 == null) {
                        Intrinsics.n("mFirstLabelData");
                        throw null;
                    }
                    p368yb.K k10 = ocContactActivity.d1;
                    if (k10 == null) {
                        Intrinsics.n("mFirstLabelAdapter");
                        throw null;
                    }
                    arrayList.add(new ContactData(string5, string6, (String) arrayList4.get(k10.f44185g)));
                    String string7 = StringsKt.V(ocContactActivity.P().getText().toString()).toString();
                    String string8 = StringsKt.V(ocContactActivity.Q().getText().toString()).toString();
                    ArrayList arrayList5 = ocContactActivity.f29408e1;
                    if (arrayList5 == null) {
                        Intrinsics.n("mSecondLabelData");
                        throw null;
                    }
                    p368yb.K k11 = ocContactActivity.f1;
                    if (k11 == null) {
                        Intrinsics.n("mSecondLabelAdapter");
                        throw null;
                    }
                    arrayList.add(new ContactData(string7, string8, (String) arrayList5.get(k11.f44185g)));
                }
                if (!TextUtils.isEmpty(StringsKt.V(ocContactActivity.Y().getText().toString()).toString())) {
                    arrayList.add(new ContactData("", StringsKt.V(ocContactActivity.Y().getText().toString()).toString(), ocContactActivity.getString(Ya.g.cs_user_other_phone)));
                }
                if (TextUtils.isEmpty(ocContactActivity.f29411i1)) {
                    if (Intrinsics.c(ocContactActivity.f29249C, "oc_use_type_router")) {
                        str = Intrinsics.c(ocContactActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
                    } else {
                        str = Intrinsics.c(ocContactActivity.f29261w, "OK_CARD") ? "OK_CARD_RAISE" : "CASH_LOAN_RAISE";
                    }
                    ocContactActivity.f29411i1 = str;
                }
                OcApplyData ocApplyData = ocContactActivity.f29248B;
                OcAddContactReq ocAddContactReq = new OcAddContactReq(ocApplyData != null ? ocApplyData.getApplyId() : null, arrayList, null, ocContactActivity.f29261w, ocContactActivity.f29411i1, null);
                p221ob.c.f40268a.getInstance().getClass();
                p221ob.c.a().addContact(ocAddContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(ocContactActivity, 11));
                return;
        }
    }
}
