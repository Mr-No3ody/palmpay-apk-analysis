package p294tb;

import C0.G;
import L6.i;
import N8.q0;
import O6.c;
import O6.d;
import Pa.C0525w;
import Ya.e;
import Ya.g;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideCashOpenFragment;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: renamed from: tb.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2057t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLMainActivity f42511b;

    public /* synthetic */ C2057t(CLMainActivity cLMainActivity, int i7) {
        this.f42510a = i7;
        this.f42511b = cLMainActivity;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:73:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CLMainResp cLMainResp;
        CLMainData cLMainData;
        Integer applyStatus;
        OcGuideCashOpenFragment ocGuideCashOpenFragment;
        Integer num;
        Integer num2;
        CLMainFragment cLMainFragment;
        Integer applyStatus2;
        Integer remainingDays;
        InstallmentLoanMainPageData data;
        Integer applyStatus3;
        CLMainActivity cLMainActivity = this.f42511b;
        switch (this.f42510a) {
            case 0:
                Pair pair = (Pair) obj;
                int i7 = CLMainActivity.f28940q0;
                int iIntValue = 0;
                cLMainActivity.showLoadingDialog(false);
                if ((pair != null ? (CLMainResp) pair.f38891a : null) != null && pair != null && (cLMainResp = (CLMainResp) pair.f38891a) != null && cLMainResp.isSuccess()) {
                    cLMainActivity.f28941M = cLMainResp.getData();
                    CLInstallmentLoanMainPageResp cLInstallmentLoanMainPageResp = (CLInstallmentLoanMainPageResp) pair.f38892b;
                    cLMainActivity.f28942Q = cLInstallmentLoanMainPageResp != null ? cLInstallmentLoanMainPageResp.getData() : null;
                    boolean z3 = (cLInstallmentLoanMainPageResp == null || (data = cLInstallmentLoanMainPageResp.getData()) == null || (applyStatus3 = data.getApplyStatus()) == null || applyStatus3.intValue() != 1) ? false : true;
                    CLMainData cLMainData2 = cLMainActivity.f28941M;
                    if (cLMainData2 != null && (remainingDays = cLMainData2.getRemainingDays()) != null) {
                        iIntValue = remainingDays.intValue();
                    }
                    if (iIntValue <= 0 || !cLMainActivity.f28947p0) {
                        CLMainData cLMainData3 = cLMainActivity.f28941M;
                        if ((cLMainData3 != null && (applyStatus2 = cLMainData3.getApplyStatus()) != null && applyStatus2.intValue() == 1) || ((cLMainData = cLMainActivity.f28941M) != null && (applyStatus = cLMainData.getApplyStatus()) != null && applyStatus.intValue() == 0)) {
                            CLMainData cLMainData4 = cLMainActivity.f28941M;
                            if (!Intrinsics.c(cLMainData4 != null ? cLMainData4.getUserTag() : null, CLMainData.CL_STATUS_RE_ACTIVE)) {
                                CLMainData cLMainData5 = cLMainActivity.f28941M;
                                if (!Intrinsics.c(cLMainData5 != null ? cLMainData5.getUserTag() : null, CLMainData.CL_RETRY_TIME_TAG)) {
                                    if (cLMainActivity.f28943X == null) {
                                        CLMainFragment cLMainFragment2 = new CLMainFragment();
                                        cLMainActivity.f28943X = cLMainFragment2;
                                        cLMainFragment2.f30277h1 = new C2058u(cLMainActivity);
                                    }
                                    num = cLMainActivity.f28945Z;
                                    if (num == null) {
                                        cLMainFragment = cLMainActivity.f28943X;
                                        if (cLMainFragment != null) {
                                            CLMainData cLMainData6 = cLMainActivity.f28941M;
                                            InstallmentLoanMainPageData installmentLoanMainPageData = cLMainActivity.f28942Q;
                                            cLMainFragment.f30266W0 = cLMainData6;
                                            cLMainFragment.f30268X0 = installmentLoanMainPageData;
                                            cLMainFragment.G();
                                        }
                                    } else {
                                        cLMainFragment = cLMainActivity.f28943X;
                                        if (cLMainFragment != null) {
                                            CLMainData cLMainData7 = cLMainActivity.f28941M;
                                            InstallmentLoanMainPageData installmentLoanMainPageData2 = cLMainActivity.f28942Q;
                                            cLMainFragment.f30266W0 = cLMainData7;
                                            cLMainFragment.f30268X0 = installmentLoanMainPageData2;
                                            cLMainFragment.G();
                                        }
                                    }
                                } else if (z3) {
                                    if (cLMainActivity.f28943X == null) {
                                        CLMainFragment cLMainFragment3 = new CLMainFragment();
                                        cLMainActivity.f28943X = cLMainFragment3;
                                        cLMainFragment3.f30277h1 = new C2058u(cLMainActivity);
                                    }
                                    num = cLMainActivity.f28945Z;
                                    if (num == null) {
                                        cLMainFragment = cLMainActivity.f28943X;
                                        if (cLMainFragment != null) {
                                            CLMainData cLMainData8 = cLMainActivity.f28941M;
                                            InstallmentLoanMainPageData installmentLoanMainPageData3 = cLMainActivity.f28942Q;
                                            cLMainFragment.f30266W0 = cLMainData8;
                                            cLMainFragment.f30268X0 = installmentLoanMainPageData3;
                                            cLMainFragment.G();
                                        }
                                    } else {
                                        cLMainFragment = cLMainActivity.f28943X;
                                        if (cLMainFragment != null) {
                                            CLMainData cLMainData9 = cLMainActivity.f28941M;
                                            InstallmentLoanMainPageData installmentLoanMainPageData4 = cLMainActivity.f28942Q;
                                            cLMainFragment.f30266W0 = cLMainData9;
                                            cLMainFragment.f30268X0 = installmentLoanMainPageData4;
                                            cLMainFragment.G();
                                        }
                                    }
                                } else {
                                    if (cLMainActivity.f28944Y == null) {
                                        cLMainActivity.f28944Y = OcGuideCashOpenFragment.f30411s0.newInstance(true);
                                    }
                                    ocGuideCashOpenFragment = cLMainActivity.f28944Y;
                                    if (ocGuideCashOpenFragment != null) {
                                        Z supportFragmentManager = cLMainActivity.getSupportFragmentManager();
                                        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
                                        c1161aE.e(e.cl_main_root_fl, ocGuideCashOpenFragment, null);
                                        c1161aE.h(true);
                                    }
                                }
                            } else if (z3) {
                                if (cLMainActivity.f28943X == null) {
                                    CLMainFragment cLMainFragment4 = new CLMainFragment();
                                    cLMainActivity.f28943X = cLMainFragment4;
                                    cLMainFragment4.f30277h1 = new C2058u(cLMainActivity);
                                }
                                num = cLMainActivity.f28945Z;
                                if (num == null) {
                                    cLMainFragment = cLMainActivity.f28943X;
                                    if (cLMainFragment != null) {
                                        CLMainData cLMainData10 = cLMainActivity.f28941M;
                                        InstallmentLoanMainPageData installmentLoanMainPageData5 = cLMainActivity.f28942Q;
                                        cLMainFragment.f30266W0 = cLMainData10;
                                        cLMainFragment.f30268X0 = installmentLoanMainPageData5;
                                        cLMainFragment.G();
                                    }
                                } else {
                                    cLMainFragment = cLMainActivity.f28943X;
                                    if (cLMainFragment != null) {
                                        CLMainData cLMainData11 = cLMainActivity.f28941M;
                                        InstallmentLoanMainPageData installmentLoanMainPageData6 = cLMainActivity.f28942Q;
                                        cLMainFragment.f30266W0 = cLMainData11;
                                        cLMainFragment.f30268X0 = installmentLoanMainPageData6;
                                        cLMainFragment.G();
                                    }
                                }
                            } else {
                                if (cLMainActivity.f28944Y == null) {
                                    cLMainActivity.f28944Y = OcGuideCashOpenFragment.f30411s0.newInstance(true);
                                }
                                ocGuideCashOpenFragment = cLMainActivity.f28944Y;
                                if (ocGuideCashOpenFragment != null) {
                                    Z supportFragmentManager2 = cLMainActivity.getSupportFragmentManager();
                                    C1161a c1161aE2 = q0.e(supportFragmentManager2, supportFragmentManager2);
                                    c1161aE2.e(e.cl_main_root_fl, ocGuideCashOpenFragment, null);
                                    c1161aE2.h(true);
                                }
                            }
                        } else if (z3) {
                            if (cLMainActivity.f28943X == null) {
                                CLMainFragment cLMainFragment5 = new CLMainFragment();
                                cLMainActivity.f28943X = cLMainFragment5;
                                cLMainFragment5.f30277h1 = new C2058u(cLMainActivity);
                            }
                            num = cLMainActivity.f28945Z;
                            if ((num == null && num.intValue() == 1) || ((num2 = cLMainActivity.f28945Z) != null && num2.intValue() == 0)) {
                                cLMainFragment = cLMainActivity.f28943X;
                                if (cLMainFragment != null) {
                                    CLMainData cLMainData12 = cLMainActivity.f28941M;
                                    InstallmentLoanMainPageData installmentLoanMainPageData7 = cLMainActivity.f28942Q;
                                    cLMainFragment.f30266W0 = cLMainData12;
                                    cLMainFragment.f30268X0 = installmentLoanMainPageData7;
                                    cLMainFragment.G();
                                }
                            } else {
                                CLMainFragment cLMainFragment6 = cLMainActivity.f28943X;
                                if (cLMainFragment6 != null) {
                                    CLMainData cLMainData13 = cLMainActivity.f28941M;
                                    InstallmentLoanMainPageData installmentLoanMainPageData8 = cLMainActivity.f28942Q;
                                    cLMainFragment6.f30266W0 = cLMainData13;
                                    cLMainFragment6.f30268X0 = installmentLoanMainPageData8;
                                }
                                if (cLMainFragment6 != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("source", cLMainActivity.getIntent().getStringExtra("source"));
                                    cLMainFragment6.setArguments(bundle);
                                    Z supportFragmentManager3 = cLMainActivity.getSupportFragmentManager();
                                    supportFragmentManager3.getClass();
                                    C1161a c1161a = new C1161a(supportFragmentManager3);
                                    c1161a.e(e.cl_main_root_fl, cLMainFragment6, null);
                                    c1161a.h(true);
                                }
                            }
                        } else {
                            if (cLMainActivity.f28944Y == null) {
                                cLMainActivity.f28944Y = OcGuideCashOpenFragment.f30411s0.newInstance(true);
                            }
                            ocGuideCashOpenFragment = cLMainActivity.f28944Y;
                            if (ocGuideCashOpenFragment != null) {
                                Z supportFragmentManager4 = cLMainActivity.getSupportFragmentManager();
                                C1161a c1161aE3 = q0.e(supportFragmentManager4, supportFragmentManager4);
                                c1161aE3.e(e.cl_main_root_fl, ocGuideCashOpenFragment, null);
                                c1161aE3.h(true);
                            }
                        }
                        CLMainData cLMainData14 = cLMainActivity.f28941M;
                        cLMainActivity.f28945Z = cLMainData14 != null ? cLMainData14.getApplyStatus() : null;
                        if (!SPUtils.getInstance().getBoolean("has_show_company_dialog_cash")) {
                            c cVar = new c(cLMainActivity);
                            cVar.f6615v = i.ppFlexiCashDialogTheme;
                            cVar.f6596b = d.f(cLMainActivity.getString(g.cs_oc_disclaimer));
                            cVar.f6598d = cLMainActivity.getString(g.cs_oc_company_dialog_content);
                            cVar.d(k.core_got_it, null);
                            cVar.a().show();
                            SPUtils.getInstance().put("has_show_company_dialog_cash", true);
                        }
                    } else {
                        CLMainData cLMainData15 = cLMainActivity.f28941M;
                        ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(new OcApplyResultData("", 2, 0L, 0L, 0L, "Please try again after " + (cLMainData15 != null ? cLMainData15.getRemainingDays() : null) + " days", 2, "", null))).navigation();
                        cLMainActivity.finish();
                    }
                }
                break;
            default:
                int i10 = CLMainActivity.f28940q0;
                F6.d.h(cLMainActivity.TAG, 3, G.o("getData: ", ((Throwable) obj).getMessage()));
                break;
        }
        return Unit.f38893a;
    }
}
