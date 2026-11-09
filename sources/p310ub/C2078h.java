package p310ub;

import C0.G;
import Ce.T;
import F6.d;
import Pa.C0525w;
import Pa.i0;
import Ya.g;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultResp;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentRaiseAmountRsp;
import com.transsnet.palmpay.credit.bean.resp.OcOneLoopDataResp;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusData;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.credit.bean.resp.OcSkipOneLoopResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLLastProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.b;
import com.transsnet.palmpay.credit.ui.dialog.OcALiFaceSuccessDialog;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import p025ba.k;
import p143jb.j;
import p185ma.e;
import p220oa.h;
import p355xf.l;

/* JADX INFO: renamed from: ub.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2078h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcApplyBaseActivity f42859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OcApplyBaseActivity f42860c;

    public /* synthetic */ C2078h(OcApplyBaseActivity ocApplyBaseActivity, OcApplyBaseActivity ocApplyBaseActivity2, int i7) {
        this.f42858a = i7;
        this.f42859b = ocApplyBaseActivity;
        this.f42860c = ocApplyBaseActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i7;
        Integer applyStatus;
        int i10;
        Integer sceneType;
        Integer sceneType2;
        Integer type;
        switch (this.f42858a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity = this.f42859b;
                if (z3) {
                    ocApplyBaseActivity.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity2 = this.f42860c;
                    if (z8) {
                        ocApplyBaseActivity.showLoadingDialog(false, true);
                        OcApplyResultResp ocApplyResultResp = (OcApplyResultResp) ((p) it).f27360a;
                        if (ocApplyResultResp.isSuccess()) {
                            OcApplyResultData data = ocApplyResultResp.getData();
                            if (data != null && (applyStatus = data.getApplyStatus()) != null && applyStatus.intValue() == 0) {
                                ToastUtils.showLong(ocApplyBaseActivity2.getString(g.cs_oc_activiting_tips), new Object[0]);
                            }
                            if (ocApplyResultResp.getData() != null) {
                                ARouter.getInstance().build("/credit_score/oc_apply_result_activity").withString("oc_apply_result", ((Gson) C0525w.f().f7166b).toJson(ocApplyResultResp.getData())).navigation();
                                ocApplyBaseActivity2.finish();
                            } else {
                                ToastUtils.showShort("apply result is null", new Object[0]);
                            }
                        } else {
                            String respMsg = ocApplyResultResp.getRespMsg();
                            OcApplyData ocApplyData = ocApplyBaseActivity2.f29248B;
                            ARouter.getInstance().build("/credit_score/oc_apply_result_activity").withString("oc_apply_result", ((Gson) C0525w.f().f7166b).toJson(new OcApplyResultData("", 2, 0L, 0L, 0L, respMsg, ocApplyData != null ? ocApplyData.getApplySource() : null, "", null))).navigation();
                            ocApplyBaseActivity2.finish();
                        }
                        i7 = ocApplyBaseActivity2.t;
                    } else if (it instanceof m) {
                        ocApplyBaseActivity.showLoadingDialog(false, true);
                        i7 = ocApplyBaseActivity2.t;
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        i7 = ocApplyBaseActivity2.t;
                    }
                    ocApplyBaseActivity2.t = i7 - 1;
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity3 = this.f42859b;
                if (z10) {
                    ocApplyBaseActivity3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity4 = this.f42860c;
                    if (z11) {
                        ocApplyBaseActivity3.showLoadingDialog(false, true);
                        CLOpenAccountResp cLOpenAccountResp = (CLOpenAccountResp) ((p) it2).f27360a;
                        d.h(ocApplyBaseActivity4.TAG, 3, "openCashLoanRsp >>>");
                        if (!cLOpenAccountResp.isSuccess()) {
                            if (ocApplyBaseActivity4 instanceof CLLastProtocolActivity) {
                                ocApplyBaseActivity4.finish();
                            }
                            h.w(ocApplyBaseActivity4, cLOpenAccountResp);
                        } else if (cLOpenAccountResp.getData() != null) {
                            OcApplyData ocApplyData2 = ocApplyBaseActivity4.f29248B;
                            if (ocApplyData2 == null || (sceneType = ocApplyData2.getSceneType()) == null || sceneType.intValue() != 1) {
                                CLOpenAccountData data2 = cLOpenAccountResp.getData();
                                j jVar = p143jb.o.f38542z;
                                Boolean bool = jVar.getInstance().f38556n;
                                d.h(ocApplyBaseActivity4.TAG, 3, "gotoApplyResultPage >>> mBusinessType=" + ocApplyBaseActivity4.f29261w + ", jumpRnApplyResult=" + bool);
                                if (Intrinsics.c(ocApplyBaseActivity4.f29261w, "PALMPAY_CARD")) {
                                    OcApplyData ocApplyData3 = ocApplyBaseActivity4.f29248B;
                                    String applyId = ocApplyData3 != null ? ocApplyData3.getApplyId() : null;
                                    String str = jVar.getInstance().f38561s;
                                    d.h("CreditRouterManager", 3, G.o("gotoApplyResultPage >>> pendingUrl=", str));
                                    if (TextUtils.isEmpty(applyId) || TextUtils.isEmpty(str)) {
                                        ToastUtils.showLong(G.p("Service error, applyId=", applyId, ", pendingUrl=", str), new Object[0]);
                                    } else {
                                        i0.c0(com.transsnet.palmpay.core.config.d.g(str) + "&applyId=" + applyId);
                                        jVar.getInstance().getClass();
                                        p143jb.o.d();
                                    }
                                } else {
                                    Bundle bundle = new Bundle();
                                    OcApplyData ocApplyData4 = ocApplyBaseActivity4.f29248B;
                                    bundle.putString("creditApplyId", ocApplyData4 != null ? ocApplyData4.getApplyId() : null);
                                    bundle.putString("loanProduct", ocApplyBaseActivity4.f29261w);
                                    bundle.putString("submitData", ((Gson) C0525w.f().f7166b).toJson(data2));
                                    bundle.putString("successUrl", jVar.getInstance().f38560r);
                                    bundle.putString("errorUrl", jVar.getInstance().f38559q);
                                    bundle.putString("pendingUrl", jVar.getInstance().f38561s);
                                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanCreditResult");
                                }
                                ocApplyBaseActivity4.finish();
                            } else {
                                com.palmpay.lib.apm.launchcounter.util.d.x(null, "CreditBindSuccess");
                            }
                        }
                        i10 = ocApplyBaseActivity4.t;
                    } else if (it2 instanceof m) {
                        ocApplyBaseActivity3.showLoadingDialog(false, true);
                        i10 = ocApplyBaseActivity4.t;
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        if (ocApplyBaseActivity4 instanceof CLLastProtocolActivity) {
                            ocApplyBaseActivity4.finish();
                        }
                        i10 = ocApplyBaseActivity4.t;
                    }
                    ocApplyBaseActivity4.t = i10 - 1;
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z12 = it3 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity5 = this.f42859b;
                if (z12) {
                    ocApplyBaseActivity5.showLoadingDialog(true, true);
                } else {
                    boolean z13 = it3 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity6 = this.f42860c;
                    if (z13) {
                        ocApplyBaseActivity5.showLoadingDialog(false, true);
                        OcInstallmentRaiseAmountRsp ocInstallmentRaiseAmountRsp = (OcInstallmentRaiseAmountRsp) ((p) it3).f27360a;
                        String str2 = ocApplyBaseActivity6.f29261w;
                        if (Intrinsics.c(str2, "INSTALLMENT_RAISE_AMOUNT")) {
                            if (ocInstallmentRaiseAmountRsp.isSuccess()) {
                                c.b().f(new MessageEvent(MessageEvent.EVENT_OC_RAISE_COMPLETED));
                                ocApplyBaseActivity6.finish();
                            } else {
                                ocApplyBaseActivity6.showErrorMessageDialog(ocInstallmentRaiseAmountRsp.getRespMsg(), ocApplyBaseActivity6.getString(k.core_confirm), new e(ocApplyBaseActivity6, 16));
                            }
                        } else if (Intrinsics.c(str2, "CASH_INSTALLMENT_RAISE_AMOUNT")) {
                            if (ocInstallmentRaiseAmountRsp.isSuccess()) {
                                ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(ocInstallmentRaiseAmountRsp.data)).withString("cl_loan_product_type", "CASH_INSTALLMENT_RAISE_AMOUNT").navigation();
                                ocApplyBaseActivity6.finish();
                            } else {
                                h.w(ocApplyBaseActivity6, ocInstallmentRaiseAmountRsp);
                            }
                        }
                    } else if (it3 instanceof m) {
                        ocApplyBaseActivity5.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity5.showLoadingDialog(false, true);
                        String str3 = ((n) it3).f27358a;
                        String str4 = ocApplyBaseActivity6.f29261w;
                        if (Intrinsics.c(str4, "INSTALLMENT_RAISE_AMOUNT")) {
                            h.x(ocApplyBaseActivity6, str3);
                            ocApplyBaseActivity6.finish();
                        } else if (Intrinsics.c(str4, "CASH_INSTALLMENT_RAISE_AMOUNT")) {
                            ocApplyBaseActivity6.t--;
                        }
                    }
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                boolean z14 = it4 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity7 = this.f42859b;
                if (z14) {
                    ocApplyBaseActivity7.showLoadingDialog(true, true);
                } else {
                    boolean z15 = it4 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity8 = this.f42860c;
                    if (z15) {
                        ocApplyBaseActivity7.showLoadingDialog(false, true);
                        CLInstallmentLoanMainPageResp cLInstallmentLoanMainPageResp = (CLInstallmentLoanMainPageResp) ((p) it4).f27360a;
                        if (cLInstallmentLoanMainPageResp.isSuccess()) {
                            ARouter.getInstance().build("/credit_score/ol_upgrade_installment_result_activity").withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(cLInstallmentLoanMainPageResp)).navigation();
                            ocApplyBaseActivity8.finish();
                        } else {
                            h.w(ocApplyBaseActivity8, cLInstallmentLoanMainPageResp);
                        }
                    } else if (it4 instanceof m) {
                        ocApplyBaseActivity7.showLoadingDialog(false, true);
                    } else {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity7.showLoadingDialog(false, true);
                        String str5 = ((n) it4).f27358a;
                        String str6 = ocApplyBaseActivity8.f29261w;
                        if (Intrinsics.c(str6, "INSTALLMENT_RAISE_AMOUNT")) {
                            h.x(ocApplyBaseActivity8, str5);
                            ocApplyBaseActivity8.finish();
                        } else if (Intrinsics.c(str6, "CASH_INSTALLMENT_RAISE_AMOUNT")) {
                            ocApplyBaseActivity8.t--;
                        }
                    }
                }
                return Unit.f38893a;
            case 4:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                boolean z16 = it5 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity9 = this.f42859b;
                if (z16) {
                    ocApplyBaseActivity9.showLoadingDialog(true, true);
                } else {
                    boolean z17 = it5 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity10 = this.f42860c;
                    if (z17) {
                        ocApplyBaseActivity9.showLoadingDialog(false, true);
                        AllAuthInfoRsp allAuthInfoRsp = (AllAuthInfoRsp) ((p) it5).f27360a;
                        if (allAuthInfoRsp.isSuccess()) {
                            OcApplyBaseActivity.VerifyInfoCallback verifyInfoCallback = ocApplyBaseActivity10.f29254f;
                            if (verifyInfoCallback != null) {
                                verifyInfoCallback.verifySuccess(allAuthInfoRsp.data);
                            }
                        } else {
                            h.x(ocApplyBaseActivity10, allAuthInfoRsp.getRespMsg());
                            OcApplyBaseActivity.VerifyInfoCallback verifyInfoCallback2 = ocApplyBaseActivity10.f29254f;
                            if (verifyInfoCallback2 != null) {
                                verifyInfoCallback2.verifyFailed(allAuthInfoRsp.getRespMsg());
                            }
                        }
                    } else if (it5 instanceof m) {
                        ocApplyBaseActivity9.showLoadingDialog(false, true);
                    } else {
                        if (!(it5 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity9.showLoadingDialog(false, true);
                        String str7 = ((n) it5).f27358a;
                        h.x(ocApplyBaseActivity10, str7);
                        OcApplyBaseActivity.VerifyInfoCallback verifyInfoCallback3 = ocApplyBaseActivity10.f29254f;
                        if (verifyInfoCallback3 != null) {
                            verifyInfoCallback3.verifyFailed(str7);
                        }
                    }
                }
                return Unit.f38893a;
            case 5:
                q it6 = (q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                boolean z18 = it6 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity11 = this.f42859b;
                if (z18) {
                    ocApplyBaseActivity11.showLoadingDialog(true, true);
                } else {
                    boolean z19 = it6 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity12 = this.f42860c;
                    if (z19) {
                        ocApplyBaseActivity11.showLoadingDialog(false, true);
                        OcOneLoopDataResp ocOneLoopDataResp = (OcOneLoopDataResp) ((p) it6).f27360a;
                        if (ocOneLoopDataResp.isSuccess()) {
                            com.transsnet.palmpay.credit.ui.activity.okcard.h hVar = ocApplyBaseActivity12.f29255g;
                            if (hVar != null) {
                                hVar.onSuccess(ocOneLoopDataResp.getData());
                            }
                        } else {
                            h.x(ocApplyBaseActivity12, ocOneLoopDataResp.getRespMsg());
                            com.transsnet.palmpay.credit.ui.activity.okcard.h hVar2 = ocApplyBaseActivity12.f29255g;
                            if (hVar2 != null) {
                                hVar2.onFailed(ocOneLoopDataResp.getRespMsg());
                            }
                        }
                    } else if (it6 instanceof m) {
                        ocApplyBaseActivity11.showLoadingDialog(false, true);
                    } else {
                        if (!(it6 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity11.showLoadingDialog(false, true);
                        String str8 = ((n) it6).f27358a;
                        h.x(ocApplyBaseActivity12, str8);
                        com.transsnet.palmpay.credit.ui.activity.okcard.h hVar3 = ocApplyBaseActivity12.f29255g;
                        if (hVar3 != null) {
                            hVar3.onFailed(str8);
                        }
                    }
                }
                return Unit.f38893a;
            case 6:
                q it7 = (q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                boolean z20 = it7 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity13 = this.f42859b;
                if (z20) {
                    ocApplyBaseActivity13.showLoadingDialog(true, true);
                } else {
                    boolean z21 = it7 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity14 = this.f42860c;
                    if (z21) {
                        ocApplyBaseActivity13.showLoadingDialog(false, true);
                        CommonResult commonResult = (CommonResult) ((p) it7).f27360a;
                        if (commonResult.isSuccess()) {
                            if (!ocApplyBaseActivity14.getClass().getName().equals(ocApplyBaseActivity14.f29252M) && !ocApplyBaseActivity14.getClass().getName().equals(ocApplyBaseActivity14.f29253Q)) {
                                ocApplyBaseActivity14.t++;
                            }
                            OcALiFaceSuccessDialog ocALiFaceSuccessDialog = new OcALiFaceSuccessDialog(ocApplyBaseActivity14);
                            ocALiFaceSuccessDialog.setOnDismissListener(new T(ocApplyBaseActivity14, 10));
                            ocALiFaceSuccessDialog.show();
                        } else if (TextUtils.equals("LOAN0000051", commonResult.getRespCode())) {
                            O6.c cVar = new O6.c(ocApplyBaseActivity14);
                            cVar.f6607m = Ya.d.cs_failed_sorry_icon;
                            cVar.f6596b = O6.d.f("Sorry");
                            cVar.f6598d = commonResult.getRespMsg();
                            cVar.d(g.cs_confirm, null);
                            cVar.g();
                        } else if (!TextUtils.isEmpty(commonResult.getRespMsg())) {
                            h.x(ocApplyBaseActivity14, commonResult.getRespMsg());
                        }
                    } else if (it7 instanceof m) {
                        ocApplyBaseActivity13.showLoadingDialog(false, true);
                    } else {
                        if (!(it7 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity13.showLoadingDialog(false, true);
                        h.x(ocApplyBaseActivity14, ((n) it7).f27358a);
                    }
                }
                return Unit.f38893a;
            case 7:
                q it8 = (q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z22 = it8 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity15 = this.f42859b;
                if (z22) {
                    ocApplyBaseActivity15.showLoadingDialog(true, true);
                } else {
                    boolean z23 = it8 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity16 = this.f42860c;
                    if (z23) {
                        ocApplyBaseActivity15.showLoadingDialog(false, true);
                        OcSkipOneLoopResp ocSkipOneLoopResp = (OcSkipOneLoopResp) ((p) it8).f27360a;
                        if (ocSkipOneLoopResp.isSuccess()) {
                            b bVar = ocApplyBaseActivity16.f29256i;
                            if (bVar != null) {
                                bVar.onSuccess(ocSkipOneLoopResp);
                            }
                        } else {
                            h.x(ocApplyBaseActivity16, ocSkipOneLoopResp.getRespMsg());
                            b bVar2 = ocApplyBaseActivity16.f29256i;
                            if (bVar2 != null) {
                                bVar2.onFailed(ocSkipOneLoopResp.getRespMsg());
                            }
                        }
                    } else if (it8 instanceof m) {
                        ocApplyBaseActivity15.showLoadingDialog(false, true);
                    } else {
                        if (!(it8 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity15.showLoadingDialog(false, true);
                        String str9 = ((n) it8).f27358a;
                        h.x(ocApplyBaseActivity16, str9);
                        b bVar3 = ocApplyBaseActivity16.f29256i;
                        if (bVar3 != null) {
                            bVar3.onFailed(str9);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                q it9 = (q) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                boolean z24 = it9 instanceof o;
                OcApplyBaseActivity ocApplyBaseActivity17 = this.f42859b;
                if (z24) {
                    ocApplyBaseActivity17.showLoadingDialog(true, true);
                } else {
                    boolean z25 = it9 instanceof p;
                    OcApplyBaseActivity ocApplyBaseActivity18 = this.f42860c;
                    if (z25) {
                        ocApplyBaseActivity17.showLoadingDialog(false, true);
                        OcSignStatusResp ocSignStatusResp = (OcSignStatusResp) ((p) it9).f27360a;
                        if (!ocSignStatusResp.isSuccess() || ocSignStatusResp.getData() == null) {
                            h.x(ocApplyBaseActivity18, ocSignStatusResp.getRespMsg());
                        } else {
                            OcSignStatusData data3 = ocSignStatusResp.getData();
                            if (data3 == null || (type = data3.getType()) == null || type.intValue() != 0) {
                                OcApplyData ocApplyData5 = ocApplyBaseActivity18.f29248B;
                                if (ocApplyData5 == null || (sceneType2 = ocApplyData5.getSceneType()) == null || sceneType2.intValue() != 1) {
                                    ocApplyBaseActivity18.s("/credit_score/cl_last_protocol_activity", null);
                                } else {
                                    ocApplyBaseActivity18.u();
                                }
                            } else {
                                ocApplyBaseActivity18.u();
                            }
                        }
                    } else if (it9 instanceof m) {
                        ocApplyBaseActivity17.showLoadingDialog(false, true);
                    } else {
                        if (!(it9 instanceof n)) {
                            throw new l();
                        }
                        ocApplyBaseActivity17.showLoadingDialog(false, true);
                        h.x(ocApplyBaseActivity18, ((n) it9).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}
