package p270rd;

import Pa.r0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.RiskControlResult;
import com.transsnet.palmpay.send_money.bean.SendMobileReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferCashierExtend;
import com.transsnet.palmpay.send_money.bean.resp.TransferOrderCreateResp;
import com.transsnet.palmpay.send_money.ui.activity.TransferToMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.RequestMoneyResultActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmPaymentInfoDialog;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1794b;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToMobileActivity f41727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToMobileActivity f41728c;

    public /* synthetic */ b0(TransferToMobileActivity transferToMobileActivity, TransferToMobileActivity transferToMobileActivity2, int i7) {
        this.f41726a = i7;
        this.f41727b = transferToMobileActivity;
        this.f41728c = transferToMobileActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String accountNo;
        String strW = null;
        TransferToMobileActivity transferToMobileActivity = this.f41728c;
        TransferToMobileActivity transferToMobileActivity2 = this.f41727b;
        switch (this.f41726a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    transferToMobileActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        MemberDetailResp memberDetailResp = (MemberDetailResp) commonBeanResult.data;
                        if (memberDetailResp != null) {
                            if (transferToMobileActivity.f33283X == null) {
                                transferToMobileActivity.f33283X = new SendMobileReq();
                            }
                            SendMobileReq sendMobileReq = transferToMobileActivity.f33283X;
                            if (sendMobileReq != null) {
                                sendMobileReq.setRecipientNickname(TextUtils.isEmpty(memberDetailResp.getNickName()) ? memberDetailResp.getFullName() : memberDetailResp.getNickName());
                                sendMobileReq.setRecipientFirstName(memberDetailResp.getFirstName());
                                sendMobileReq.setRecipientLastName(memberDetailResp.getLastName());
                                sendMobileReq.setRecipientFullName(memberDetailResp.getFullName());
                                sendMobileReq.setRecipientAvatar(memberDetailResp.getHeadPortrait());
                                sendMobileReq.setRecipientEmail(memberDetailResp.getUserEmail());
                                sendMobileReq.setRecipientMemberId(memberDetailResp.getMemberId());
                                sendMobileReq.setMember(true);
                                sendMobileReq.setRecipientPhone(memberDetailResp.getPhone());
                                Boolean authen = memberDetailResp.getAuthen();
                                Boolean bool = Boolean.TRUE;
                                sendMobileReq.setAuthed(Intrinsics.c(authen, bool));
                                sendMobileReq.setMobileMoneyAccountTier(memberDetailResp.getMobileMoneyAccountTier());
                                sendMobileReq.setAccountTierTips(memberDetailResp.getAccountTierTips());
                                sendMobileReq.setPalmPayTag(memberDetailResp.getPalmPayTag());
                                sendMobileReq.setFacebookName(memberDetailResp.getFacebookName());
                                sendMobileReq.setMobileMoneyAccountTier(memberDetailResp.getMobileMoneyAccountTier());
                                sendMobileReq.setAgent(Intrinsics.c(memberDetailResp.getAgent(), bool));
                                sendMobileReq.setAccountNo(memberDetailResp.getAccountNo());
                                sendMobileReq.setBusinessTypeTemp(transferToMobileActivity.f33288q0);
                                sendMobileReq.setRelationship(memberDetailResp.getRelationship());
                                sendMobileReq.setRelationshipPic(memberDetailResp.getRelationshipPic());
                            }
                            transferToMobileActivity.z();
                        }
                    } else {
                        h.x(transferToMobileActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    transferToMobileActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((p) it2).f27360a;
                    if (balanceAndLimitResp.isSuccess()) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        if (balanceAndLimitData != null) {
                            transferToMobileActivity.f33284Y = balanceAndLimitData;
                            if (!transferToMobileActivity.f33290s0 || balanceAndLimitData.firstTransfer || transferToMobileActivity.f33288q0 == 5) {
                                transferToMobileActivity.n().setVisibility(8);
                                transferToMobileActivity.o().setVisibility(0);
                                transferToMobileActivity.o().setText(transferToMobileActivity.getString(p159kd.h.sm_available_balance, r0.B(balanceAndLimitData.balanceAmount, false)));
                            } else {
                                transferToMobileActivity.o().setVisibility(8);
                                transferToMobileActivity.n().setVisibility(0);
                                transferToMobileActivity.n().setText(transferToMobileActivity.getString(p159kd.h.sm_available_balance_one_format, r0.B(balanceAndLimitData.balanceAmount, false), r0.B(balanceAndLimitData.cashBox, false)));
                                transferToMobileActivity.n().setChecked(true);
                            }
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.B(balanceAndLimitData.minAmount, false) + "-" + r0.B(balanceAndLimitData.maxAmount, false)).setFontSize(18, true).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            transferToMobileActivity.t().setHint(spannableStringBuilderCreate);
                            transferToMobileActivity.t().setCurrency(BaseApplication.getCurrencySymbol());
                        }
                    } else {
                        h.x(transferToMobileActivity, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    ((n) it2).getClass();
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    transferToMobileActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((p) it3).f27360a;
                    if (verifyPaymentInfoRsp.isSuccess()) {
                        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
                        if (dataBean != null) {
                            int i7 = TransferToMobileActivity.f33282v0;
                            if (dataBean.status <= 0 || TextUtils.isEmpty(dataBean.statusDesc)) {
                                transferToMobileActivity.x();
                            } else {
                                ConfirmPaymentInfoDialog confirmPaymentInfoDialog = new ConfirmPaymentInfoDialog(transferToMobileActivity);
                                confirmPaymentInfoDialog.setResultCallback(new C1794b(transferToMobileActivity, 23));
                                confirmPaymentInfoDialog.show();
                                String str = dataBean.accountName;
                                if (transferToMobileActivity.f33288q0 == 10) {
                                    SendMobileReq sendMobileReq2 = transferToMobileActivity.f33283X;
                                    if (sendMobileReq2 != null && (accountNo = sendMobileReq2.getAccountNo()) != null) {
                                        strW = r0.w(accountNo);
                                    }
                                } else {
                                    String recipientPhone = dataBean.recipientPhone;
                                    Intrinsics.checkNotNullExpressionValue(recipientPhone, "recipientPhone");
                                    strW = r0.w(recipientPhone);
                                }
                                confirmPaymentInfoDialog.updateUi(str, strW, transferToMobileActivity.y(), dataBean.statusDesc);
                            }
                        }
                    } else {
                        h.x(transferToMobileActivity, verifyPaymentInfoRsp.getRespMsg());
                    }
                } else if (it3 instanceof m) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    ((n) it3).getClass();
                }
                return Unit.f38893a;
            default:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    transferToMobileActivity2.showLoadingDialog(true, true);
                } else if (it4 instanceof p) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    TransferOrderCreateResp transferOrderCreateResp = (TransferOrderCreateResp) ((p) it4).f27360a;
                    int i10 = TransferToMobileActivity.f33282v0;
                    if (transferOrderCreateResp.isSuccess()) {
                        TransferOrderCreateResp.Data data = transferOrderCreateResp.data;
                        if (data != null) {
                            TransferCashierExtend transferCashierExtend = data.cashierExtendFiled;
                            String businessRiskType = transferCashierExtend != null ? transferCashierExtend.getBusinessRiskType() : null;
                            TransferCashierExtend transferCashierExtend2 = data.cashierExtendFiled;
                            String disposal = transferCashierExtend2 != null ? transferCashierExtend2.getDisposal() : null;
                            TransferCashierExtend transferCashierExtend3 = data.cashierExtendFiled;
                            RiskControlResult riskControlResult = new RiskControlResult(businessRiskType, disposal, transferCashierExtend3 != null ? transferCashierExtend3.getFlowId() : null);
                            if (riskControlResult.isNeedAction()) {
                                ARouter.getInstance().build("/coreImpl/risk_control_verify").withParcelable("extra_data", riskControlResult).navigation(transferToMobileActivity, 100);
                            } else {
                                RequestMoneyResultActivity.f33579f.startActivity(transferToMobileActivity, transferOrderCreateResp.data);
                            }
                        }
                    } else {
                        ToastUtils.showShort(transferOrderCreateResp.getRespMsg(), new Object[0]);
                    }
                } else if (it4 instanceof m) {
                    transferToMobileActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof n)) {
                        throw new l();
                    }
                    transferToMobileActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                    ((n) it4).getClass();
                }
                return Unit.f38893a;
        }
    }
}
