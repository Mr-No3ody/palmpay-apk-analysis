package p285sc;

import C0.G;
import Jb.B;
import Jb.C0348g;
import N8.q0;
import O6.c;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import V9.C0714c;
import Wf.AbstractC0780y;
import Ya.e;
import Ya.g;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.core.impl.utils.n;
import androidx.camera.video.u;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.SelectBillTypeDialog;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.resp.OcCommonJumpData;
import com.transsnet.palmpay.credit.bean.resp.OcDefaultPayMethodStatusData;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryDetail;
import com.transsnet.palmpay.credit.bean.rsp.CLMainConfig;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainOkCardBill;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLAutoRepaymentExplainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOcBillActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLPenaltyPeriodActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLUpGradeInstallmentAccountActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAuthActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInviteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnHistoryActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSetDefaultPayMethodActivity;
import com.transsnet.palmpay.credit.ui.dialog.AutomaticDebitDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLRepayExitDialog;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.credit.viewmodel.OcSetDefaultPayMethodViewModel;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRankActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferNotificationSettingsActivity;
import com.transsnet.palmpay.ui.activity.settings.AboutActivity;
import com.transsnet.palmpay.ui.activity.settings.AccountNumberActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.EncodeUtils;
import com.transsnet.palmpay.util.FileIOUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SystemProperties;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p002a.a;
import p025ba.k;
import p071ef.b;
import p185ma.t;
import p235pb.p;
import p236pc.d;
import p236pc.f;
import p294tb.C2055q;
import p383zc.y;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42236b;

    public /* synthetic */ x(Object obj, int i7) {
        this.f42235a = i7;
        this.f42236b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CLMainData cLMainData;
        CLMainConfig config;
        Long id2;
        OcCommonJumpData linkConfig;
        OcCommonJumpData linkConfig2;
        OcCommonJumpData linkConfig3;
        int i7 = 16;
        long jLongValue = 0;
        Object obj = this.f42236b;
        switch (this.f42235a) {
            case 0:
                int i10 = ReferEarnRankActivity.f31906v;
                if (view.getId() == d.rlInvite) {
                    ReferEarnRankActivity referEarnRankActivity = (ReferEarnRankActivity) obj;
                    if (com.transsnet.palmpay.core.config.d.t()) {
                        t tVar = new t(referEarnRankActivity);
                        tVar.f39628d = referEarnRankActivity.f31915o;
                        tVar.f39627c = referEarnRankActivity.getString(f.jp_share_title);
                        tVar.s(16);
                    } else {
                        ShareDialog shareDialog = new ShareDialog(referEarnRankActivity);
                        shareDialog.setShareBusinessType(16);
                        shareDialog.setReferEarnId(referEarnRankActivity.f31915o);
                        shareDialog.show();
                        shareDialog.setTitle(referEarnRankActivity.getString(f.jp_share_title));
                    }
                }
                break;
            case 1:
                int i11 = ReferEarnResolveActivity.f31917C;
                int id3 = view.getId();
                ReferEarnResolveActivity referEarnResolveActivity = (ReferEarnResolveActivity) obj;
                if (id3 != d.jp_cash_invite_btn && id3 != d.tvWithdraw) {
                    if (id3 == d.ivExpand) {
                        int i12 = referEarnResolveActivity.f31918A + 1;
                        referEarnResolveActivity.f31918A = i12;
                        ((y) referEarnResolveActivity.f27350a).queryReferEarnRecords(referEarnResolveActivity.f31929p, i12);
                    }
                    break;
                } else if (!TextUtils.isEmpty(referEarnResolveActivity.f31929p)) {
                    if (referEarnResolveActivity.t == 5) {
                        com.transsnet.palmpay.custom_view.dialog.y yVar = new com.transsnet.palmpay.custom_view.dialog.y(referEarnResolveActivity);
                        yVar.f31323a = referEarnResolveActivity.getString(f.jp_withdraw_has_submitted);
                        yVar.h();
                    } else {
                        ((y) referEarnResolveActivity.f27350a).queryReferEarnWithDrawEnable(referEarnResolveActivity.f31929p);
                    }
                    break;
                }
                break;
            case 2:
                ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = (ReferEarnRewardDialogActivity) obj;
                referEarnRewardDialogActivity.n().setImageAssetsFolder("images");
                int id4 = view.getId();
                if (id4 == d.jarrd_pick_1) {
                    ReferEarnHomeResp referEarnHomeResp = referEarnRewardDialogActivity.f31953p0;
                    if (referEarnHomeResp != null) {
                        if (referEarnHomeResp.isDialog1Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_Earn300_pick", "");
                            referEarnRewardDialogActivity.n().setAnimation("jp_lottie_invitation_left.json");
                        } else if (referEarnHomeResp.isDialog2Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_cash_pick", "");
                            referEarnRewardDialogActivity.n().setAnimation("jp_lottie_cash_left.json");
                        }
                    }
                    referEarnRewardDialogActivity.p();
                } else if (id4 == d.jarrd_pick_2) {
                    ReferEarnHomeResp referEarnHomeResp2 = referEarnRewardDialogActivity.f31953p0;
                    if (referEarnHomeResp2 != null) {
                        if (referEarnHomeResp2.isDialog1Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_Earn300_pick", "");
                            referEarnRewardDialogActivity.n().setAnimation("jp_lottie_invitation_center.json");
                        } else if (referEarnHomeResp2.isDialog2Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_cash_pick", "");
                            referEarnRewardDialogActivity.n().setAnimation("jp_lottie_cash_center.json");
                        }
                    }
                    referEarnRewardDialogActivity.p();
                } else if (id4 == d.jarrd_pick_3) {
                    ReferEarnHomeResp referEarnHomeResp3 = referEarnRewardDialogActivity.f31953p0;
                    if (referEarnHomeResp3 != null) {
                        if (referEarnHomeResp3.isDialog1Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_Earn300_pick", "");
                            referEarnRewardDialogActivity.n().setAnimation("jp_lottie_invitation_right.json");
                        } else if (referEarnHomeResp3.isDialog2Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_cash_pick", "");
                            referEarnRewardDialogActivity.n().setAnimation("jp_lottie_cash_right.json");
                        }
                    }
                    referEarnRewardDialogActivity.p();
                } else if (id4 == d.ivClose) {
                    referEarnRewardDialogActivity.finish();
                } else if (id4 == d.jarrd_action_btn) {
                    ReferEarnHomeResp referEarnHomeResp4 = referEarnRewardDialogActivity.f31953p0;
                    if (referEarnHomeResp4 != null) {
                        if (referEarnHomeResp4.isDialog1Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_Earn300_Invite", "");
                        } else if (referEarnHomeResp4.isDialog2Type()) {
                            n0.g().m("refer_earn_page_element_click", "Popwindow_cash_Claim", "");
                        }
                    }
                    referEarnRewardDialogActivity.finish();
                } else if (id4 == d.jarrd_case_three) {
                    n0.g().m("refer_earn_page_element_click", "Popwindow_cash_still_earnmore", "");
                    referEarnRewardDialogActivity.finish();
                }
                break;
            case 3:
                AboutActivity aboutActivity = (AboutActivity) obj;
                aboutActivity.f34943a++;
                Disposable disposable = aboutActivity.f34944b;
                if (disposable != null) {
                    disposable.dispose();
                }
                aboutActivity.f34944b = null;
                if (aboutActivity.f34943a < 5) {
                    df.d.h(Boolean.TRUE).e(1000L, TimeUnit.MILLISECONDS, p298tf.f.f42628a).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(aboutActivity, 26));
                } else {
                    aboutActivity.f34943a = 0;
                    try {
                        String str = SystemProperties.get("ro.prebuilt.path", "");
                        if (!TextUtils.isEmpty(str)) {
                            File file = new File(str, AppUtils.getAppPackageName() + ".txt");
                            if (file.exists()) {
                                String file2String = FileIOUtils.readFile2String(file);
                                if (!TextUtils.isEmpty(file2String)) {
                                    c cVar = new c(aboutActivity);
                                    cVar.e(k.core_title_message);
                                    cVar.f6598d = file2String;
                                    cVar.d(k.core_confirm, null);
                                    cVar.g();
                                }
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 4:
                AccountNumberActivity.a aVar2 = AccountNumberActivity.f34946b;
                ClipboardUtils.copyText(r0.w0(((User) obj).getPhoneNumber()));
                n.w("Account number copied");
                break;
            case 5:
                int i13 = CLAutoRepaymentExplainActivity.f28799i;
                ARouter.getInstance().build("/credit_score/oc_repayment_date_activity").navigation((CLAutoRepaymentExplainActivity) obj);
                break;
            case 6:
                int i14 = CLBorrowActivity.f28871g;
                CLBorrowActivity cLBorrowActivity = (CLBorrowActivity) obj;
                n0.g().m("PalmpayLoanTrialElementClick_Return", "mtb_back_iv", cLBorrowActivity.f28873e);
                if (TextUtils.equals((String) cLBorrowActivity.f28874f.getValue(), "LOAN_WITHDRAW")) {
                    q0.u("/main/home");
                } else {
                    cLBorrowActivity.finish();
                }
                break;
            case 7:
                int i15 = CLBorrowPreviewActivity.d1;
                n0.g().q(new ClickEvent("QuotaBalanceErrorDialogCancel_Click"));
                ((CLBorrowPreviewActivity) obj).finish();
                break;
            case 8:
                CLBorrowResultActivity cLBorrowResultActivity = (CLBorrowResultActivity) obj;
                com.palmpay.lib.apm.launchcounter.util.d.x(a.e(new Pair("applyId", cLBorrowResultActivity.f28882M)), "LoanAmountDetails");
                cLBorrowResultActivity.finish();
                break;
            case 9:
                int i16 = CLOcBillActivity.f28948o;
                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                CLOcBillActivity cLOcBillActivity = (CLOcBillActivity) obj;
                CLMainOkCardBill cLMainOkCardBill = cLOcBillActivity.f28954j;
                postcardBuild.withString("oc_card_no", cLMainOkCardBill != null ? cLMainOkCardBill.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                cLOcBillActivity.finish();
                break;
            case 10:
                int i17 = CLPenaltyPeriodActivity.f29006g;
                ((CLPenaltyPeriodActivity) obj).finish();
                break;
            case 11:
                int i18 = CLRepaymentActivity.f29036w0;
                ((CLRepayExitDialog) obj).dismiss();
                break;
            case 12:
                int i19 = CLRepaymentResultActivity.f29111q0;
                int id5 = view.getId();
                CLRepaymentResultActivity cLRepaymentResultActivity = (CLRepaymentResultActivity) obj;
                if (id5 == e.backBtn) {
                    cLRepaymentResultActivity.finish();
                } else if (id5 == e.repay_complete_bt || id5 == e.cl_borrow_tv) {
                    cLRepaymentResultActivity.getClass();
                    ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                    cLRepaymentResultActivity.finish();
                } else if (id5 == e.borrow_other_amount_tv) {
                    cLRepaymentResultActivity.getClass();
                    ARouter.getInstance().build("/credit_score/cl_borrow_activity").withInt("cl_product_type", cLRepaymentResultActivity.f29119X).navigation();
                }
                break;
            case 13:
                int i20 = CLUpGradeInstallmentAccountActivity.f29173v0;
                int id6 = view.getId();
                CLUpGradeInstallmentAccountActivity activity = (CLUpGradeInstallmentAccountActivity) obj;
                if (id6 == e.ccuial_apply) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    LoanCreditService loanCreditService = new LoanCreditService();
                    Z supportFragmentManager = activity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    loanCreditService.a(supportFragmentManager);
                    Z supportFragmentManager2 = activity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    n.y(loanCreditService, supportFragmentManager2, "INSTALLMENT_LOAN", null, null, 12);
                    break;
                } else if (id6 == e.ccuial_learn_more && (cLMainData = activity.f29185u0) != null && (config = cLMainData.getConfig()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("amount", 500000L);
                    Integer term = config.getTerm() == null ? 0 : config.getTerm();
                    if (term != null) {
                        bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                    }
                    Integer termSpan = config.getTermSpan() == null ? 0 : config.getTermSpan();
                    if (termSpan != null) {
                        bundle.putInt("termSpan", termSpan.intValue());
                    }
                    String termSpanUnit = TextUtils.isEmpty(config.getTermSpanUnit()) ? "" : config.getTermSpanUnit();
                    if (termSpanUnit != null) {
                        bundle.putString("termSpanUnit", termSpanUnit);
                    }
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AboutInstallmentLoan");
                    break;
                }
                break;
            case 14:
                O6.d dVar = ((UpgradeInstallmentTransParentActivity) obj).f29191p0;
                if (dVar != null) {
                    dVar.dismiss();
                }
                break;
            case 15:
                int i21 = PayMeActivity.t;
                ((PayMeActivity) obj).p();
                break;
            case 16:
                int i22 = ThirdPartyMerchantActivity.f34991g;
                ((ThirdPartyMerchantActivity) obj).finish();
                break;
            case 17:
                int i23 = OcAuthActivity.f29323g;
                OcAuthActivity ocAuthActivity = (OcAuthActivity) obj;
                ArrayList arrayList = new ArrayList();
                if (!PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                }
                if (!PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j())) {
                    arrayList.add(com.transsnet.palmpay.core.config.d.j());
                }
                if (!PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (!PermissionUtils.isGranted("android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                }
                if (arrayList.size() == 0) {
                    ocAuthActivity.m();
                } else {
                    AbstractC1032a.g(ocAuthActivity, (String[]) arrayList.toArray(new String[0]), 1000);
                }
                break;
            case 18:
                OcCurBillData ocCurBillData = ((OcBillDetailActivity) obj).f29343A;
                if (ocCurBillData != null && (id2 = ocCurBillData.getId()) != null) {
                    jLongValue = id2.longValue();
                }
                StringBuilder sbR = u.r(jLongValue, "/#/okcard/contract?billid=", "&fullName=");
                sbR.append(EncodeUtils.urlEncode(BaseApplication.getInstance().getUser().getFullName()));
                i0.c0(com.transsnet.palmpay.core.config.d.g(sbR.toString()));
                break;
            case 19:
                int i24 = OcFeedbackDetailActivity.f29439L;
                OcFeedbackDetailActivity ocFeedbackDetailActivity = (OcFeedbackDetailActivity) obj;
                Object systemService = ocFeedbackDetailActivity.getSystemService("clipboard");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                OcFeedbackHistoryDetail ocFeedbackHistoryDetail = ocFeedbackDetailActivity.f29443H;
                String feedbackNo = ocFeedbackHistoryDetail != null ? ocFeedbackHistoryDetail.getFeedbackNo() : null;
                OcFeedbackHistoryDetail ocFeedbackHistoryDetail2 = ocFeedbackDetailActivity.f29443H;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(feedbackNo, ocFeedbackHistoryDetail2 != null ? ocFeedbackHistoryDetail2.getFeedbackNo() : null));
                ToastUtils.showShort("Copied", new Object[0]);
                break;
            case 20:
                OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity = (OcGetInstallmentCreditActivity) obj;
                OcRouterReq req = new OcRouterReq(Boolean.FALSE, "INSTALLMENT_RAISE_AMOUNT", 7, ocGetInstallmentCreditActivity.f29467u0, null, null, ocGetInstallmentCreditActivity.f29466t0, 48, null);
                OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) ocGetInstallmentCreditActivity.l();
                ocApplyBaseViewModel.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                Intrinsics.checkNotNullParameter("OTHER", "enterPoint");
                AbstractC0780y.m(V.h(ocApplyBaseViewModel), null, null, new C0348g(req, ocApplyBaseViewModel, null), 3);
                n0.g().m("OcGetInstallmentCreditActivity_element_click", "tvNext", "");
                break;
            case 21:
                int i25 = OcInviteActivity.f29551f;
                OcInviteActivity ocInviteActivity = (OcInviteActivity) obj;
                ocInviteActivity.showLoadingDialog(true);
                IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
                Object value = ocInviteActivity.f29553e.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                iApiCreditServiceH.ocSubmitInviteCode(((PinEntryView) value).getText().toString()).k(p298tf.f.f42629b).i(b.a()).subscribe(new C2055q(ocInviteActivity, i7));
                break;
            case 22:
                OcProtocolActivity.a aVar3 = OcProtocolActivity.f29647H;
                ((OcProtocolActivity) obj).onBackPressed();
                n0.g().m("OcProtocolActivity_element_click", "mtb_back_iv", "");
                break;
            case 23:
                int i26 = OcReferEarnActivity.f29672M;
                int id7 = view.getId();
                OcReferEarnActivity ocReferEarnActivity = (OcReferEarnActivity) obj;
                if (id7 != e.inviteAll) {
                    if (id7 == e.tvWithdraw) {
                        if (ocReferEarnActivity.f29689w == 0) {
                            String strJ = q0.j(BaseApplication.getCurrencySymbol(), r0.n0(ocReferEarnActivity.f29688v));
                            com.transsnet.palmpay.custom_view.dialog.y yVar2 = new com.transsnet.palmpay.custom_view.dialog.y(ocReferEarnActivity);
                            yVar2.f31323a = ocReferEarnActivity.getString(g.cs_oc_withdraw_toast, strJ);
                            yVar2.f31324b = ocReferEarnActivity.getString(g.cs_oc_withdraw_toast_title, strJ);
                            yVar2.h();
                        } else {
                            ((p) ocReferEarnActivity.f27350a).withdraw();
                        }
                    } else if (id7 == e.tvMore) {
                        ocReferEarnActivity.f29675C = !ocReferEarnActivity.f29675C;
                        ocReferEarnActivity.m().f44202f = ocReferEarnActivity.f29675C;
                        ocReferEarnActivity.m().notifyDataSetChanged();
                        if (ocReferEarnActivity.f29675C) {
                            ocReferEarnActivity.n().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, Ya.d.cs_refer_earn_arrow_up, 0);
                        } else {
                            ocReferEarnActivity.n().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, Ya.d.cs_refer_earn_arrow_down, 0);
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList2 = ocReferEarnActivity.f29676H;
                    if (arrayList2.size() != 0) {
                        ((p) ocReferEarnActivity.f27350a).inviteSms(ocReferEarnActivity, arrayList2);
                        break;
                    }
                }
                break;
            case 24:
                int i27 = OcReferEarnHistoryActivity.f29690i;
                int id8 = view.getId();
                OcReferEarnHistoryActivity ocReferEarnHistoryActivity = (OcReferEarnHistoryActivity) obj;
                if (id8 == e.tvReward) {
                    ocReferEarnHistoryActivity.p(true);
                    ocReferEarnHistoryActivity.o().setCurrentItem(0);
                } else if (id8 == e.tvWithdraw) {
                    ocReferEarnHistoryActivity.p(false);
                    ocReferEarnHistoryActivity.o().setCurrentItem(1);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                OcRepaidListActivity ocRepaidListActivity = (OcRepaidListActivity) obj;
                if (ocRepaidListActivity.f29701j == null) {
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr = {"2,4", "2", "4"};
                    int[] iArr = {k.core_all, g.cs_oc_manual, g.cs_oc_auto_repayment};
                    for (int i28 = 0; i28 < 3; i28++) {
                        BillType billType = new BillType();
                        billType.type = strArr[i28];
                        billType.typeName = BaseApplication.getContext().getString(iArr[i28]);
                        arrayList3.add(billType);
                    }
                    SelectBillTypeDialog selectBillTypeDialog = new SelectBillTypeDialog(ocRepaidListActivity, arrayList3);
                    ocRepaidListActivity.f29701j = selectBillTypeDialog;
                    selectBillTypeDialog.setCallBack(new p287se.d(ocRepaidListActivity, 15));
                }
                SelectBillTypeDialog selectBillTypeDialog2 = ocRepaidListActivity.f29701j;
                if (selectBillTypeDialog2 != null) {
                    selectBillTypeDialog2.show();
                }
                break;
            case 26:
                int i29 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                new AutomaticDebitDialog((OcRepayOrderDetailInPalmPayActivity) obj).show();
                break;
            case 27:
                int i30 = OcRepayResultActivity.f29829u0;
                OcRepayResultActivity ocRepayResultActivity = (OcRepayResultActivity) obj;
                ocRepayResultActivity.getClass();
                if (ActivityUtils.isActivityExistsInStack((Class<?>) OcRepayActivity.class)) {
                    ActivityUtils.finishToActivity((Class<?>) OcRepayActivity.class, false);
                    ocRepayResultActivity.finish();
                } else {
                    i0.H(null);
                }
                break;
            case 28:
                OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity = (OcSetDefaultPayMethodActivity) obj;
                OcDefaultPayMethodStatusData ocDefaultPayMethodStatusData = ocSetDefaultPayMethodActivity.f29868i;
                if (ocDefaultPayMethodStatusData != null ? Intrinsics.c(ocDefaultPayMethodStatusData.getFlexiFlag(), Boolean.TRUE) : false) {
                    OcDefaultPayMethodStatusData ocDefaultPayMethodStatusData2 = ocSetDefaultPayMethodActivity.f29868i;
                    String jumpType = (ocDefaultPayMethodStatusData2 == null || (linkConfig3 = ocDefaultPayMethodStatusData2.getLinkConfig()) == null) ? null : linkConfig3.getJumpType();
                    OcDefaultPayMethodStatusData ocDefaultPayMethodStatusData3 = ocSetDefaultPayMethodActivity.f29868i;
                    String jumpPath = (ocDefaultPayMethodStatusData3 == null || (linkConfig2 = ocDefaultPayMethodStatusData3.getLinkConfig()) == null) ? null : linkConfig2.getJumpPath();
                    OcDefaultPayMethodStatusData ocDefaultPayMethodStatusData4 = ocSetDefaultPayMethodActivity.f29868i;
                    org.chromium.support_lib_boundary.util.b.Q(jumpType, jumpPath, (ocDefaultPayMethodStatusData4 == null || (linkConfig = ocDefaultPayMethodStatusData4.getLinkConfig()) == null) ? null : linkConfig.getJumpParams(), null);
                } else {
                    OcSetDefaultPayMethodViewModel ocSetDefaultPayMethodViewModel = (OcSetDefaultPayMethodViewModel) ocSetDefaultPayMethodActivity.l();
                    ocSetDefaultPayMethodViewModel.getClass();
                    p140j8.f.s(ocSetDefaultPayMethodViewModel, new B(1, null), ocSetDefaultPayMethodViewModel.f30923f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            default:
                int i31 = TransferNotificationSettingsActivity.f33423d;
                ((TransferNotificationSettingsActivity) obj).finish();
                break;
        }
    }
}
