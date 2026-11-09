package p143jb;

import C0.G;
import Eb.b;
import F6.d;
import Pa.i0;
import Z4.e;
import android.text.TextUtils;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.JumpLinkInfo;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfoV2;
import com.transsnet.palmpay.credit.bean.resp.CalcManagementFee;
import com.transsnet.palmpay.credit.bean.resp.CanCredit;
import com.transsnet.palmpay.credit.bean.resp.LoanPreCheck;
import com.transsnet.palmpay.credit.bean.resp.MoveCashAppResp;
import com.transsnet.palmpay.credit.bean.resp.QueryWithDrawData;
import com.transsnet.palmpay.credit.bean.resp.QueryWithdrawPreCheckResp;
import com.transsnet.palmpay.credit.bean.resp.SignItem;
import com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialog;
import com.transsnet.palmpay.credit.ui.dialog.BorrowPreCheckRepaymentDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLManagementFeeDialogFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SPUtils;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p039cb.c;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f38537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f38538g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ JumpLinkInfo f38539i;

    public n(o oVar, String str, JumpLinkInfo jumpLinkInfo) {
        this.f38537f = oVar;
        this.f38538g = str;
        this.f38539i = jumpLinkInfo;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f38537f.i().add(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        d.c("CreditRouterManager", G.o("startBorrow preCheck onFail >>> ", str));
        if (str != null) {
            if ((!TextUtils.isEmpty(str) ? str : null) != null) {
                o.b(this.f38537f, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        String respMsg;
        SignItem signItem;
        Object[] objArr;
        Object next;
        Integer signStatus;
        Integer signStatus2;
        LoanPreCheck loanPreCheck;
        LoanPreCheck loanPreCheck2;
        CanCredit canCredit;
        CanCredit canCredit2;
        E activity;
        CanCredit canCredit3;
        CanCredit canCredit4;
        E activity2;
        LoanPreCheck loanPreCheck3;
        Z parentFragmentManager;
        CalcManagementFee calcManagementFee;
        Integer managementMode;
        MoveCashAppResp moveCashApp;
        Integer downloadOpenType;
        MoveCashAppResp moveCashApp2;
        MoveCashAppResp moveCashApp3;
        Integer downloadOpenType2;
        MoveCashAppResp moveCashApp4;
        MoveCashAppResp moveCashApp5;
        E activity3;
        MoveCashAppResp moveCashApp6;
        CalcManagementFee calcManagementFee2;
        MoveCashAppResp moveCashApp7;
        CanCredit canCredit5;
        LoanPreCheck loanPreCheck4;
        QueryWithdrawPreCheckResp queryWithdrawPreCheckResp = (QueryWithdrawPreCheckResp) obj;
        o oVar = this.f38537f;
        downloadUrl = null;
        String downloadUrl = null;
        downloadUrl = null;
        String downloadUrl2 = null;
        msg = null;
        String msg = null;
        Object obj2 = null;
        SignItem signItem2 = null;
        if (queryWithdrawPreCheckResp != null) {
            QueryWithdrawPreCheckResp queryWithdrawPreCheckResp2 = (!queryWithdrawPreCheckResp.isSuccess() || queryWithdrawPreCheckResp.getData() == null) ? null : queryWithdrawPreCheckResp;
            if (queryWithdrawPreCheckResp2 != null) {
                QueryWithDrawData data = queryWithdrawPreCheckResp.getData();
                oVar.f38550h = (data == null || (loanPreCheck4 = data.getLoanPreCheck()) == null) ? null : loanPreCheck4.getAccountType();
                QueryWithDrawData data2 = queryWithdrawPreCheckResp2.getData();
                LoanPreCheck loanPreCheck5 = data2 != null ? data2.getLoanPreCheck() : null;
                Integer num = oVar.f38550h;
                Boolean needRoute = loanPreCheck5 != null ? loanPreCheck5.getNeedRoute() : null;
                QueryWithDrawData data3 = queryWithdrawPreCheckResp2.getData();
                Boolean can = (data3 == null || (canCredit5 = data3.getCanCredit()) == null) ? null : canCredit5.getCan();
                QueryWithDrawData data4 = queryWithdrawPreCheckResp2.getData();
                Boolean moveStrategy = (data4 == null || (moveCashApp7 = data4.getMoveCashApp()) == null) ? null : moveCashApp7.getMoveStrategy();
                QueryWithDrawData data5 = queryWithdrawPreCheckResp2.getData();
                d.h("CreditRouterManager", 3, "startBorrow preCheck onSuccess >>> mAccountType=" + num + ", needRoute=" + needRoute + ", canCredit.can=" + can + ", moveStrategy=" + moveStrategy + ", managementMode=" + ((data5 == null || (calcManagementFee2 = data5.getCalcManagementFee()) == null) ? null : calcManagementFee2.getManagementMode()));
                QueryWithDrawData data6 = queryWithdrawPreCheckResp2.getData();
                boolean z3 = false;
                if ((data6 == null || (moveCashApp6 = data6.getMoveCashApp()) == null) ? false : Intrinsics.c(moveCashApp6.getMoveStrategy(), Boolean.TRUE)) {
                    d.h("CreditRouterManager", 3, "startBorrow preCheck branch >>> MOVE_CASH_APP");
                    if (AppUtils.isAppInstalled("com.legend.cash")) {
                        WeakReference weakReference = oVar.f38544b;
                        if (weakReference == null) {
                            Intrinsics.n("mLoanCreditFragmentRef");
                            throw null;
                        }
                        LoanCreditFragment loanCreditFragment = (LoanCreditFragment) weakReference.get();
                        if (loanCreditFragment == null || (activity3 = loanCreditFragment.getActivity()) == null) {
                            return;
                        }
                        i0.Z(activity3);
                        return;
                    }
                    QueryWithDrawData data7 = queryWithdrawPreCheckResp2.getData();
                    if (TextUtils.isEmpty((data7 == null || (moveCashApp5 = data7.getMoveCashApp()) == null) ? null : moveCashApp5.getDownloadUrl())) {
                        return;
                    }
                    QueryWithDrawData data8 = queryWithdrawPreCheckResp2.getData();
                    if (data8 != null && (moveCashApp3 = data8.getMoveCashApp()) != null && (downloadOpenType2 = moveCashApp3.getDownloadOpenType()) != null && downloadOpenType2.intValue() == 3) {
                        QueryWithDrawData data9 = queryWithdrawPreCheckResp2.getData();
                        if (data9 != null && (moveCashApp4 = data9.getMoveCashApp()) != null) {
                            downloadUrl = moveCashApp4.getDownloadUrl();
                        }
                        ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(downloadUrl, true));
                        return;
                    }
                    QueryWithDrawData data10 = queryWithdrawPreCheckResp2.getData();
                    if (data10 == null || (moveCashApp = data10.getMoveCashApp()) == null || (downloadOpenType = moveCashApp.getDownloadOpenType()) == null || downloadOpenType.intValue() != 4) {
                        return;
                    }
                    QueryWithDrawData data11 = queryWithdrawPreCheckResp2.getData();
                    if (data11 != null && (moveCashApp2 = data11.getMoveCashApp()) != null) {
                        downloadUrl2 = moveCashApp2.getDownloadUrl();
                    }
                    i0.c0(downloadUrl2);
                    return;
                }
                QueryWithDrawData data12 = queryWithdrawPreCheckResp2.getData();
                if (((data12 == null || (calcManagementFee = data12.getCalcManagementFee()) == null || (managementMode = calcManagementFee.getManagementMode()) == null) ? -1 : managementMode.intValue()) == 1) {
                    d.h("CreditRouterManager", 3, "startBorrow preCheck branch >>> MANAGEMENT_FEE");
                    if (!SPUtils.getInstance().getBoolean(BaseApplication.get().getUser().getMemberId(), true)) {
                        i0.c0("https://h5.fleximfb.com/cash/download-guide?source=CashHome&m=" + G.k());
                        return;
                    }
                    WeakReference weakReference2 = oVar.f38544b;
                    if (weakReference2 == null) {
                        Intrinsics.n("mLoanCreditFragmentRef");
                        throw null;
                    }
                    LoanCreditFragment loanCreditFragment2 = (LoanCreditFragment) weakReference2.get();
                    if (loanCreditFragment2 == null || (parentFragmentManager = loanCreditFragment2.getParentFragmentManager()) == null) {
                        return;
                    }
                    CLManagementFeeDialogFragment.f29947C.newInstance().show(parentFragmentManager, "showCLManagementFeeDialog");
                    SPUtils.getInstance().put(BaseApplication.get().getUser().getMemberId(), false);
                    return;
                }
                QueryWithDrawData data13 = queryWithdrawPreCheckResp2.getData();
                List<SignItem> signList = (data13 == null || (loanPreCheck3 = data13.getLoanPreCheck()) == null) ? null : loanPreCheck3.getSignList();
                d.h("CreditRouterManager", 3, "needSignedWithholdProtocol >>>");
                if (signList == null || signList.size() != 0) {
                    if (signList != null) {
                        Iterator<T> it = signList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            SignItem signItem3 = (SignItem) next;
                            Integer signType = signItem3.getSignType();
                            if (signType != null && signType.intValue() == 1 && (signStatus = signItem3.getSignStatus()) != null && signStatus.intValue() == 1) {
                                break;
                            }
                        }
                        signItem = (SignItem) next;
                    } else {
                        signItem = null;
                    }
                    if (signItem != null) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                } else {
                    objArr = false;
                }
                if (objArr == true) {
                    d.h("CreditRouterManager", 3, "startBorrow preCheck branch >>> WITHHOLD_PROTOCOL_DIALOG");
                    WeakReference weakReference3 = oVar.f38544b;
                    if (weakReference3 == null) {
                        Intrinsics.n("mLoanCreditFragmentRef");
                        throw null;
                    }
                    LoanCreditFragment loanCreditFragment3 = (LoanCreditFragment) weakReference3.get();
                    if (loanCreditFragment3 == null || (activity2 = loanCreditFragment3.getActivity()) == null) {
                        return;
                    }
                    new AgentAutoRepaymentDialog(activity2, new c(10, oVar, queryWithdrawPreCheckResp2)).show();
                    return;
                }
                QueryWithDrawData data14 = queryWithdrawPreCheckResp2.getData();
                boolean zC = (data14 == null || (canCredit4 = data14.getCanCredit()) == null) ? false : Intrinsics.c(canCredit4.getCan(), Boolean.FALSE);
                String str = this.f38538g;
                if (zC) {
                    d.h("CreditRouterManager", 3, "startBorrow preCheck branch >>> CANNOT_BORROW");
                    QueryWithDrawData data15 = queryWithdrawPreCheckResp2.getData();
                    OutstandingContentInfoV2 outstandingContentInfo = (data15 == null || (canCredit3 = data15.getCanCredit()) == null) ? null : canCredit3.getOutstandingContentInfo();
                    if (outstandingContentInfo != null && BorrowPreCheckRepaymentDialog.INSTANCE.canShow(outstandingContentInfo)) {
                        WeakReference weakReference4 = oVar.f38544b;
                        if (weakReference4 == null) {
                            Intrinsics.n("mLoanCreditFragmentRef");
                            throw null;
                        }
                        LoanCreditFragment loanCreditFragment4 = (LoanCreditFragment) weakReference4.get();
                        if (loanCreditFragment4 != null && (activity = loanCreditFragment4.getActivity()) != null) {
                            new BorrowPreCheckRepaymentDialog(activity, outstandingContentInfo).show();
                            z3 = true;
                        }
                    }
                    if (z3) {
                        d.h("CreditRouterManager", 3, "startBorrow preCheck >>> showBorrowPreCheckRepaymentDialog");
                        b.d("fail", str);
                        return;
                    }
                    QueryWithDrawData data16 = queryWithdrawPreCheckResp2.getData();
                    d.h("CreditRouterManager", 3, G.o("startBorrow preCheck >>> toast ", (data16 == null || (canCredit2 = data16.getCanCredit()) == null) ? null : canCredit2.getMsg()));
                    b.d("fail", str);
                    QueryWithDrawData data17 = queryWithdrawPreCheckResp2.getData();
                    if (data17 != null && (canCredit = data17.getCanCredit()) != null) {
                        msg = canCredit.getMsg();
                    }
                    androidx.camera.core.impl.utils.n.u(msg);
                    return;
                }
                QueryWithDrawData data18 = queryWithdrawPreCheckResp2.getData();
                if (!((data18 == null || (loanPreCheck2 = data18.getLoanPreCheck()) == null) ? false : Intrinsics.c(loanPreCheck2.getNeedRoute(), Boolean.TRUE))) {
                    b.d("success", str);
                    String str2 = oVar.f38551i;
                    JumpLinkInfo jumpLinkInfo = this.f38539i;
                    d.h("CreditRouterManager", 3, "startBorrow preCheck branch >>> TRIAL_NAV (borrowRoutePath=" + str2 + ", jumpLinkInfo=" + (jumpLinkInfo != null) + ")");
                    oVar.e(jumpLinkInfo);
                    return;
                }
                d.h("CreditRouterManager", 3, "startBorrow preCheck branch >>> NEED_ROUTE_START_APPLY");
                b.d("success", str);
                WeakReference weakReference5 = oVar.f38544b;
                if (weakReference5 == null) {
                    Intrinsics.n("mLoanCreditFragmentRef");
                    throw null;
                }
                LoanCreditFragment loanCreditFragment5 = (LoanCreditFragment) weakReference5.get();
                if (loanCreditFragment5 != null) {
                    QueryWithDrawData data19 = queryWithdrawPreCheckResp2.getData();
                    List<SignItem> signList2 = (data19 == null || (loanPreCheck = data19.getLoanPreCheck()) == null) ? null : loanPreCheck.getSignList();
                    d.h("CreditRouterManager", 3, "needSignedSilentProtocol >>>");
                    if (signList2 == null || signList2.size() != 0) {
                        if (signList2 != null) {
                            for (Object obj3 : signList2) {
                                SignItem signItem4 = (SignItem) obj3;
                                Integer signType2 = signItem4.getSignType();
                                if (signType2 != null && signType2.intValue() == 0 && (signStatus2 = signItem4.getSignStatus()) != null && signStatus2.intValue() == 1) {
                                    obj2 = obj3;
                                    break;
                                }
                            }
                            signItem2 = (SignItem) obj2;
                        }
                        if (signItem2 != null) {
                            z3 = true;
                        }
                    }
                    o.z(oVar, loanCreditFragment5, null, "LOAN_WITHDRAW", z3 ? 1 : 2, null, 18);
                    return;
                }
                return;
            }
        }
        d.c("CreditRouterManager", G.o("startBorrow preCheck empty/invalid data >>> respMsg=", queryWithdrawPreCheckResp != null ? queryWithdrawPreCheckResp.getRespMsg() : null));
        if (queryWithdrawPreCheckResp == null || (respMsg = queryWithdrawPreCheckResp.getRespMsg()) == null) {
            return;
        }
        String str3 = TextUtils.isEmpty(respMsg) ? null : respMsg;
        if (str3 != null) {
            o.b(oVar, str3);
        }
    }
}
