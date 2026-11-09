package Wd;

import N8.q0;
import Pa.i0;
import Pa.r0;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.viewmodel.BillerTransctionResultViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p086fe.K0;

/* JADX INFO: renamed from: Wd.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0743q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerTransactionResultActivity f10777b;

    public /* synthetic */ ViewOnClickListenerC0743q(BillerTransactionResultActivity billerTransactionResultActivity, int i7) {
        this.f10776a = i7;
        this.f10777b = billerTransactionResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String icon;
        Integer orderStatus;
        Object objNavigation;
        HashMap<String, String> payResultExtParam;
        boolean z3 = true;
        OrderInfoForCustomerService orderInfoForCustomerServiceA = null;
        str = null;
        String str = null;
        BillerTransactionResultActivity billerTransactionResultActivity = this.f10777b;
        switch (this.f10776a) {
            case 0:
                int i7 = BillerTransactionResultActivity.f34181Y;
                billerTransactionResultActivity.getOnBackPressedDispatcher().d();
                break;
            case 1:
                int i10 = BillerTransactionResultActivity.f34181Y;
                billerTransactionResultActivity.o("CustomerService");
                BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = billerTransactionResultActivity.t;
                if (billPaymentOrderDetailRsp != null && (orderInfoForCustomerServiceA = p070ee.c.a(billPaymentOrderDetailRsp)) != null) {
                    Integer payerAccountType = billPaymentOrderDetailRsp.getPayerAccountType();
                    orderInfoForCustomerServiceA.paymentMethod = r0.q0(payerAccountType != null ? payerAccountType.intValue() : 0, billPaymentOrderDetailRsp.getBankName(), billPaymentOrderDetailRsp.getPayerCardNo());
                }
                if (orderInfoForCustomerServiceA != null) {
                    i0.M(billerTransactionResultActivity, orderInfoForCustomerServiceA);
                }
                break;
            case 2:
                billerTransactionResultActivity.f34188Q = true;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                break;
            case 3:
                int i11 = BillerTransactionResultActivity.f34181Y;
                int id2 = view.getId();
                if (id2 == Pd.c.tv_complete_btn) {
                    billerTransactionResultActivity.o("Complete");
                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = billerTransactionResultActivity.t;
                    if (billPaymentOrderDetailRsp2 != null && (orderStatus = billPaymentOrderDetailRsp2.getOrderStatus()) != null) {
                        int iIntValue = orderStatus.intValue();
                        if (iIntValue != 8 && iIntValue != 9) {
                            z3 = false;
                        }
                        if (z3 || iIntValue == 2 || iIntValue == 7 || iIntValue == 6) {
                            ActivityUtils.finishToActivity((Class<?>) BillerTransactionResultActivity.class, false);
                            billerTransactionResultActivity.finish();
                            objNavigation = Unit.f38893a;
                        } else {
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = billerTransactionResultActivity.t;
                            if (billPaymentOrderDetailRsp3 != null && (payResultExtParam = billPaymentOrderDetailRsp3.getPayResultExtParam()) != null) {
                                str = payResultExtParam.get("returnType");
                            }
                            if (Intrinsics.c(str, "1")) {
                                ActivityUtils.finishToActivity((Class<?>) BillerTransactionResultActivity.class, false);
                                billerTransactionResultActivity.finish();
                                objNavigation = Unit.f38893a;
                            } else {
                                objNavigation = ARouter.getInstance().build("/main/home").navigation();
                            }
                        }
                        if (objNavigation != null) {
                        }
                    }
                    q0.u("/main/home");
                } else if (id2 == Pd.c.tv_btn_again) {
                    billerTransactionResultActivity.o("BottomRight");
                    billerTransactionResultActivity.n();
                } else if (id2 == Pd.c.tv_btn_view_receipt) {
                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp4 = billerTransactionResultActivity.t;
                    if (billPaymentOrderDetailRsp4 != null) {
                        String str2 = "";
                        if (!Intrinsics.c(billPaymentOrderDetailRsp4.getCategoryId(), TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT) ? (icon = billPaymentOrderDetailRsp4.getIcon()) != null : (icon = billPaymentOrderDetailRsp4.getBillerLogo()) != null) {
                            str2 = icon;
                        }
                        p070ee.c.k(str2, billPaymentOrderDetailRsp4);
                    }
                } else if (id2 == Pd.c.tv_view_detail || id2 == Pd.c.iv_view_detail) {
                    billerTransactionResultActivity.o("ViewDetail");
                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp5 = billerTransactionResultActivity.t;
                    if (billPaymentOrderDetailRsp5 != null) {
                        Ea.a.e(billPaymentOrderDetailRsp5.getTransType(), billPaymentOrderDetailRsp5.getOrderNo(), "");
                    }
                }
                break;
            default:
                int i12 = BillerTransactionResultActivity.f34181Y;
                billerTransactionResultActivity.getClass();
                if (!r0.U0() && i0.W(billerTransactionResultActivity)) {
                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp6 = billerTransactionResultActivity.t;
                    String orderNo = billPaymentOrderDetailRsp6 != null ? billPaymentOrderDetailRsp6.getOrderNo() : null;
                    if (orderNo == null || StringsKt.F(orderNo)) {
                        billerTransactionResultActivity.s();
                    } else {
                        BillerTransctionResultViewModel billerTransctionResultViewModel = (BillerTransctionResultViewModel) billerTransactionResultActivity.l();
                        billerTransctionResultViewModel.getClass();
                        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
                        p140j8.f.s(billerTransctionResultViewModel, new K0(orderNo, null), billerTransctionResultViewModel.f34419e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                    break;
                }
                break;
        }
    }
}
