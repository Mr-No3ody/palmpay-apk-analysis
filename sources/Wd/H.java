package Wd;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdRsp;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditBeneficiaryActivity f10717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditBeneficiaryActivity f10718c;

    public /* synthetic */ H(EditBeneficiaryActivity editBeneficiaryActivity, EditBeneficiaryActivity editBeneficiaryActivity2, int i7) {
        this.f10716a = i7;
        this.f10717b = editBeneficiaryActivity;
        this.f10718c = editBeneficiaryActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String number;
        switch (this.f10716a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                EditBeneficiaryActivity editBeneficiaryActivity = this.f10717b;
                if (z3) {
                    editBeneficiaryActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    editBeneficiaryActivity.showLoadingDialog(false, true);
                    CheckCustomerIdRsp checkCustomerIdRsp = (CheckCustomerIdRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (checkCustomerIdRsp.isSuccess()) {
                        CheckCustomerIdRsp.DataBean dataBean = checkCustomerIdRsp.data;
                        if (dataBean != null) {
                            EditBeneficiaryActivity editBeneficiaryActivity2 = this.f10718c;
                            if (TransType.TRANS_TYPE_AIRTIME_LOAN.equals(editBeneficiaryActivity2.f34212i)) {
                                if (TextUtils.isEmpty(dataBean.fullName)) {
                                    number = editBeneficiaryActivity2.r() != null ? editBeneficiaryActivity2.r().getNumber() : "";
                                } else {
                                    number = dataBean.fullName;
                                }
                                dataBean.fullName = number;
                            }
                            if (TextUtils.isEmpty(dataBean.fullName)) {
                                String strO = editBeneficiaryActivity2.o(editBeneficiaryActivity2.f34205C);
                                if (dataBean.available) {
                                    String string = editBeneficiaryActivity2.getString(Pd.f.qt_msg_customer_id_unverified, strO);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    editBeneficiaryActivity2.r().setErrorMessage(string);
                                    EditBeneficiaryActivity.n(editBeneficiaryActivity2, false, string);
                                } else {
                                    String string2 = editBeneficiaryActivity2.getString(Pd.f.qt_msg_customer_id_invalid, strO);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    editBeneficiaryActivity2.r().setErrorMessage(string2);
                                    EditBeneficiaryActivity.n(editBeneficiaryActivity2, false, string2);
                                }
                            } else {
                                EditBeneficiaryActivity.n(editBeneficiaryActivity2, true, "");
                                editBeneficiaryActivity2.v();
                            }
                        }
                    } else {
                        ToastUtils.showLong(checkCustomerIdRsp.getRespMsg(), new Object[0]);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    editBeneficiaryActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    editBeneficiaryActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                EditBeneficiaryActivity editBeneficiaryActivity3 = this.f10717b;
                if (z8) {
                    editBeneficiaryActivity3.showLoadingDialog(true, true);
                } else {
                    boolean z10 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    EditBeneficiaryActivity editBeneficiaryActivity4 = this.f10718c;
                    if (z10) {
                        editBeneficiaryActivity3.showLoadingDialog(false, true);
                        CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonResult.isSuccess()) {
                            String respMsg = commonResult.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            EditBeneficiaryActivity.n(editBeneficiaryActivity4, true, respMsg);
                        } else {
                            String respMsg2 = commonResult.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                            EditBeneficiaryActivity.n(editBeneficiaryActivity4, false, respMsg2);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        editBeneficiaryActivity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        editBeneficiaryActivity3.showLoadingDialog(false, true);
                        EditBeneficiaryActivity.n(editBeneficiaryActivity4, false, ((com.transsnet.palmpay.core.base.n) it2).f27358a);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z11 = it3 instanceof com.transsnet.palmpay.core.base.o;
                EditBeneficiaryActivity editBeneficiaryActivity5 = this.f10717b;
                if (z11) {
                    editBeneficiaryActivity5.showLoadingDialog(true, true);
                } else {
                    boolean z12 = it3 instanceof com.transsnet.palmpay.core.base.p;
                    EditBeneficiaryActivity editBeneficiaryActivity6 = this.f10718c;
                    if (z12) {
                        editBeneficiaryActivity5.showLoadingDialog(false, true);
                        CommonResult commonResult2 = (CommonResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonResult2.isSuccess()) {
                            String respMsg3 = commonResult2.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg3, "getRespMsg(...)");
                            EditBeneficiaryActivity.n(editBeneficiaryActivity6, true, respMsg3);
                        } else {
                            String respMsg4 = commonResult2.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg4, "getRespMsg(...)");
                            EditBeneficiaryActivity.n(editBeneficiaryActivity6, false, respMsg4);
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        editBeneficiaryActivity5.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        editBeneficiaryActivity5.showLoadingDialog(false, true);
                        EditBeneficiaryActivity.n(editBeneficiaryActivity6, false, ((com.transsnet.palmpay.core.base.n) it3).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}
