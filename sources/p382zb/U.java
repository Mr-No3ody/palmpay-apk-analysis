package p382zb;

import Gb.y;
import Pa.i0;
import Rd.C0595k;
import android.content.Context;
import android.text.TextUtils;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.CLCreateDownPaymentWalletOrderData;
import com.transsnet.palmpay.credit.bean.resp.CLCreateDownPaymentWalletOrderResp;
import com.transsnet.palmpay.credit.bean.resp.TemporaryUnlockResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryDataInfoResp;
import com.transsnet.palmpay.credit.ui.dialog.CLTemporaryUnlockDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLTemporaryUnlockErrorDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44550c;

    public /* synthetic */ U(OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment, OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment2, int i7) {
        this.f44548a = i7;
        this.f44549b = ocHomeMobileInstalmentTabFragment;
        this.f44550c = ocHomeMobileInstalmentTabFragment2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String respMsg;
        String str;
        Context context;
        switch (this.f44548a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment = this.f44549b;
                if (z3) {
                    ocHomeMobileInstalmentTabFragment.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment2 = this.f44550c;
                    if (z8) {
                        ocHomeMobileInstalmentTabFragment.showLoadingDialog(false, true);
                        QueryDataInfoResp queryDataInfoResp = (QueryDataInfoResp) ((p) it).f27360a;
                        SwipeRefreshLayout swipeRefreshLayoutW = ocHomeMobileInstalmentTabFragment2.w();
                        if (swipeRefreshLayoutW != null) {
                            swipeRefreshLayoutW.setRefreshing(false);
                        }
                        if (queryDataInfoResp.isSuccess()) {
                            ocHomeMobileInstalmentTabFragment2.x().e(queryDataInfoResp.getData());
                        } else {
                            String respMsg2 = queryDataInfoResp.getRespMsg();
                            if (respMsg2 != null) {
                                if (respMsg2.length() <= 0) {
                                    respMsg2 = null;
                                }
                                if (respMsg2 != null) {
                                    h.y(ocHomeMobileInstalmentTabFragment2, respMsg2);
                                }
                            }
                            ocHomeMobileInstalmentTabFragment2.x().e(null);
                        }
                    } else if (it instanceof m) {
                        ocHomeMobileInstalmentTabFragment.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ocHomeMobileInstalmentTabFragment.showLoadingDialog(false, true);
                        ((n) it).getClass();
                        SwipeRefreshLayout swipeRefreshLayoutW2 = ocHomeMobileInstalmentTabFragment2.w();
                        if (swipeRefreshLayoutW2 != null) {
                            swipeRefreshLayoutW2.setRefreshing(false);
                        }
                        ocHomeMobileInstalmentTabFragment2.x().e(null);
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment3 = this.f44549b;
                if (z10) {
                    ocHomeMobileInstalmentTabFragment3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment4 = this.f44550c;
                    if (z11) {
                        ocHomeMobileInstalmentTabFragment3.showLoadingDialog(false, true);
                        CLCreateDownPaymentWalletOrderResp cLCreateDownPaymentWalletOrderResp = (CLCreateDownPaymentWalletOrderResp) ((p) it2).f27360a;
                        if (cLCreateDownPaymentWalletOrderResp.isSuccess()) {
                            CLCreateDownPaymentWalletOrderData data = cLCreateDownPaymentWalletOrderResp.getData();
                            if (TextUtils.isEmpty(data != null ? data.getPayToken() : null)) {
                                respMsg = cLCreateDownPaymentWalletOrderResp.getRespMsg();
                                if (respMsg != null) {
                                    if (TextUtils.isEmpty(respMsg)) {
                                    }
                                    if (str != null) {
                                        h.y(ocHomeMobileInstalmentTabFragment4, str);
                                    }
                                }
                            } else {
                                Postcard postcardBuild = ARouter.getInstance().build("/main/merchant_payment");
                                CLCreateDownPaymentWalletOrderData data2 = cLCreateDownPaymentWalletOrderResp.getData();
                                postcardBuild.withString("token", data2 != null ? data2.getPayToken() : null).navigation();
                            }
                        } else {
                            respMsg = cLCreateDownPaymentWalletOrderResp.getRespMsg();
                            if (respMsg != null) {
                                str = TextUtils.isEmpty(respMsg) ? null : respMsg;
                                if (str != null) {
                                    h.y(ocHomeMobileInstalmentTabFragment4, str);
                                }
                            }
                        }
                    } else if (it2 instanceof m) {
                        ocHomeMobileInstalmentTabFragment3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ocHomeMobileInstalmentTabFragment3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        h.y(ocHomeMobileInstalmentTabFragment4, ((n) it2).f27358a);
                    }
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z12 = it3 instanceof o;
                OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment5 = this.f44549b;
                if (z12) {
                    ocHomeMobileInstalmentTabFragment5.showLoadingDialog(true, true);
                } else {
                    boolean z13 = it3 instanceof p;
                    OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment6 = this.f44550c;
                    if (z13) {
                        ocHomeMobileInstalmentTabFragment5.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it3).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            y yVar = ocHomeMobileInstalmentTabFragment6.f30444w;
                            if (yVar != null) {
                                T data3 = commonBeanResult.data;
                                Intrinsics.checkNotNullExpressionValue(data3, "data");
                                TemporaryUnlockResp data4 = (TemporaryUnlockResp) data3;
                                Intrinsics.checkNotNullParameter(data4, "data");
                                CLTemporaryUnlockDialog cLTemporaryUnlockDialog = yVar.f3319j;
                                if (cLTemporaryUnlockDialog != null && cLTemporaryUnlockDialog.isShowing()) {
                                    CLTemporaryUnlockDialog cLTemporaryUnlockDialog2 = yVar.f3319j;
                                    if (cLTemporaryUnlockDialog2 != null) {
                                        cLTemporaryUnlockDialog2.dismiss();
                                    }
                                    yVar.f3319j = null;
                                }
                                C0595k c0595k = yVar.f3310a;
                                if (c0595k != null && (context = c0595k.f8367b.getContext()) != null) {
                                    CLTemporaryUnlockDialog cLTemporaryUnlockDialog3 = new CLTemporaryUnlockDialog(context, data4);
                                    yVar.f3319j = cLTemporaryUnlockDialog3;
                                    cLTemporaryUnlockDialog3.show();
                                }
                            }
                            OcHomeFinanceViewModel ocHomeFinanceViewModelX = ocHomeMobileInstalmentTabFragment6.x();
                            if (ocHomeFinanceViewModelX != null) {
                                ocHomeFinanceViewModelX.d();
                            }
                        } else {
                            String respCode = commonBeanResult.getRespCode();
                            if (Intrinsics.c(respCode, TemporaryUnlockResp.ERROR_CODE_TMP_UNLOCK_DAY_LIMIT) || Intrinsics.c(respCode, TemporaryUnlockResp.ERROR_CODE_TMP_UNLOCK_OVER_DUE_OVER_15_DAYS)) {
                                Context context2 = ocHomeMobileInstalmentTabFragment6.getContext();
                                if (context2 != null) {
                                    Context context3 = i0.X(context2) ? context2 : null;
                                    if (context3 != null) {
                                        new CLTemporaryUnlockErrorDialog(context3, commonBeanResult.getRespMsg()).show();
                                    }
                                }
                            } else {
                                h.y(ocHomeMobileInstalmentTabFragment6, commonBeanResult.getRespMsg());
                            }
                        }
                    } else if (it3 instanceof m) {
                        ocHomeMobileInstalmentTabFragment5.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ocHomeMobileInstalmentTabFragment5.showLoadingDialog(false, true);
                        h.y(ocHomeMobileInstalmentTabFragment6, ((n) it3).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}
