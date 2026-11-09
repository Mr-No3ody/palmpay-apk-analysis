package U8;

import C0.G;
import C9.ViewOnClickListenerC0146m;
import Ce.T;
import Pa.i0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.bean.AccountHistoryListRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.bean.rsp.VerifyAccountHistoryRsp;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountHistoryActivity;
import com.transsnet.palmpay.account.ui.fragment.history.VerifyAccountHistoryFragment;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyAccountHistoryViewModel;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountHistoryFragment f9287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountHistoryFragment f9288c;

    public /* synthetic */ d(VerifyAccountHistoryFragment verifyAccountHistoryFragment, VerifyAccountHistoryFragment verifyAccountHistoryFragment2, int i7) {
        this.f9286a = i7;
        this.f9287b = verifyAccountHistoryFragment;
        this.f9288c = verifyAccountHistoryFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VerifyAccountHistoryFragment verifyAccountHistoryFragment = this.f9288c;
        VerifyAccountHistoryFragment verifyAccountHistoryFragment2 = this.f9287b;
        switch (this.f9286a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    verifyAccountHistoryFragment2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    verifyAccountHistoryFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        T data = commonBeanResult.data;
                        if (data == 0) {
                            GetSecurityFlowRsp getSecurityFlowRsp = verifyAccountHistoryFragment.f26153p;
                            if (getSecurityFlowRsp == null || verifyAccountHistoryFragment.f26152o == null) {
                                i0.b0("/h5/help/service");
                            } else {
                                getSecurityFlowRsp.nextStep(verifyAccountHistoryFragment.requireActivity(), GetSecurityFlowRsp.VERIFY_TYPE_ACCOUNT_HISTORY);
                            }
                            E activity = verifyAccountHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                        } else if (verifyAccountHistoryFragment.f26152o != null) {
                            AccountHistoryListRsp accountHistoryListRsp = (AccountHistoryListRsp) data;
                            if (verifyAccountHistoryFragment.getActivity() instanceof VerifyAccountHistoryActivity) {
                                E activity2 = verifyAccountHistoryFragment.getActivity();
                                Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.VerifyAccountHistoryActivity");
                                ((VerifyAccountHistoryActivity) activity2).m(accountHistoryListRsp);
                            }
                        } else {
                            AccountHistoryListRsp accountHistoryListRsp2 = (AccountHistoryListRsp) data;
                            verifyAccountHistoryFragment.f26152o = accountHistoryListRsp2;
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            verifyAccountHistoryFragment.t(accountHistoryListRsp2);
                        }
                    } else {
                        h.y(verifyAccountHistoryFragment, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    verifyAccountHistoryFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    verifyAccountHistoryFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    verifyAccountHistoryFragment2.showLoadingDialog(true, true);
                } else {
                    if (it2 instanceof p) {
                        verifyAccountHistoryFragment2.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            VerifyAccountHistoryRsp verifyAccountHistoryRsp = (VerifyAccountHistoryRsp) commonBeanResult2.data;
                            if (!verifyAccountHistoryRsp.result) {
                                t tVar = new t(verifyAccountHistoryFragment.requireContext());
                                tVar.f31309h = 102;
                                tVar.a();
                                tVar.f31303b = tVar.f31302a.getString(F8.h.ac_wrong_answer);
                                tVar.d(1500).setOnDismissListener(new T(verifyAccountHistoryFragment, 5));
                            } else if (verifyAccountHistoryRsp.endFlag) {
                                GetSecurityFlowRsp getSecurityFlowRsp2 = verifyAccountHistoryFragment.f26153p;
                                if (getSecurityFlowRsp2 != null) {
                                    getSecurityFlowRsp2.securityVerifyToken = verifyAccountHistoryRsp.securityVerifyToken;
                                }
                                if (getSecurityFlowRsp2 != null) {
                                    getSecurityFlowRsp2.nextStep(verifyAccountHistoryFragment.getActivity(), GetSecurityFlowRsp.VERIFY_TYPE_ACCOUNT_HISTORY);
                                }
                            } else {
                                VerifyAccountHistoryFragment.a aVar = VerifyAccountHistoryFragment.f26150v;
                                VerifyAccountHistoryViewModel verifyAccountHistoryViewModel = (VerifyAccountHistoryViewModel) verifyAccountHistoryFragment.f27333i;
                                if (verifyAccountHistoryViewModel != null) {
                                    GetSecurityFlowRsp getSecurityFlowRsp3 = verifyAccountHistoryFragment.f26153p;
                                    verifyAccountHistoryViewModel.d(getSecurityFlowRsp3 != null ? getSecurityFlowRsp3.flowId : null, getSecurityFlowRsp3 != null ? getSecurityFlowRsp3.mobile : null);
                                }
                            }
                        } else if ("SA0001".equals(commonBeanResult2.getRespCode()) || "CFRONT_800115".equals(commonBeanResult2.getRespCode())) {
                            Context contextRequireContext = verifyAccountHistoryFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            int i7 = F8.h.ac_wrong_answer;
                            String respMsg = commonBeanResult2.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            int i10 = F8.h.ac_contact_customer_care;
                            ViewOnClickListenerC0146m viewOnClickListenerC0146m = new ViewOnClickListenerC0146m(verifyAccountHistoryFragment, 8);
                            O6.c cVar = new O6.c(contextRequireContext);
                            cVar.f6614u = 1;
                            cVar.e(i7);
                            cVar.f6598d = respMsg;
                            cVar.d(i10, viewOnClickListenerC0146m);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            G.v(cVar, false, false);
                        } else {
                            Context contextRequireContext2 = verifyAccountHistoryFragment.requireContext();
                            String respMsg2 = commonBeanResult2.getRespMsg();
                            ToastDialog toastDialog = new ToastDialog(contextRequireContext2, com.transsnet.palmpay.custom_view.t.cv_toast_dialog);
                            toastDialog.setMessage(respMsg2);
                            toastDialog.setTitle((String) null);
                            toastDialog.setIcon(0);
                            toastDialog.setIcon((Drawable) null);
                            toastDialog.setBackground(0);
                            toastDialog.show(2000L);
                        }
                    } else if (it2 instanceof m) {
                        verifyAccountHistoryFragment2.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        verifyAccountHistoryFragment2.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                    verifyAccountHistoryFragment.showLoadingDialog(false);
                }
                return Unit.f38893a;
        }
    }
}
