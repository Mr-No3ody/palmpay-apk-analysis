package p284sb;

import O6.c;
import Ya.g;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.core.bean.rsp.RegisterAccountResp;
import com.transsnet.palmpay.credit.bean.BindStatusEnum;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p270rd.ViewOnClickListenerC1968k;
import p355xf.l;

/* JADX INFO: renamed from: sb.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2022u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayShopHomeActivity f42186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayShopHomeActivity f42187c;

    public /* synthetic */ C2022u(PayShopHomeActivity payShopHomeActivity, PayShopHomeActivity payShopHomeActivity2, int i7) {
        this.f42185a = i7;
        this.f42186b = payShopHomeActivity;
        this.f42187c = payShopHomeActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42185a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                PayShopHomeActivity payShopHomeActivity = this.f42186b;
                if (z3) {
                    payShopHomeActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    payShopHomeActivity.showLoadingDialog(false, true);
                    ParseInstalmentsQrcodeRsp parseInstalmentsQrcodeRsp = (ParseInstalmentsQrcodeRsp) ((p) it).f27360a;
                    boolean zIsSuccess = parseInstalmentsQrcodeRsp.isSuccess();
                    PayShopHomeActivity payShopHomeActivity2 = this.f42187c;
                    if (zIsSuccess) {
                        ParseInstalmentsQrcodeRsp.DataBean dataBean = parseInstalmentsQrcodeRsp.data;
                        if (dataBean != null) {
                            if (dataBean.isMine) {
                                h.x(payShopHomeActivity2, payShopHomeActivity2.getString(g.cs_you_cant_pay_to));
                            } else {
                                String str = "/credit_score/input_amount";
                                if (dataBean.type == 1) {
                                    switch (dataBean.status) {
                                        case -1:
                                            payShopHomeActivity2.x(payShopHomeActivity2.getString(g.cs_merchant_id_not_find));
                                            break;
                                        case 0:
                                        case 3:
                                            ARouter.getInstance().build("/credit_score/input_amount").withString("sn_no", dataBean.snNo).navigation();
                                            break;
                                        case 1:
                                        case 2:
                                        case 4:
                                        case 5:
                                            payShopHomeActivity2.x(payShopHomeActivity2.getString(g.cs_merchant_not_support));
                                            break;
                                        default:
                                            payShopHomeActivity2.x(payShopHomeActivity2.getString(g.cs_merchant_id_not_find));
                                            break;
                                    }
                                } else {
                                    int i7 = dataBean.soNoType;
                                    if (i7 == BindStatusEnum.CAN_PARTICIPATE.getStatusCode() || i7 == BindStatusEnum.CAN_NOT_PARTICIPATE.getStatusCode()) {
                                        ARouter aRouter = ARouter.getInstance();
                                        String str2 = dataBean.transType;
                                        if (Intrinsics.c(str2, TransType.TRANS_TYPE_PAY_SHOP)) {
                                            str = "/sm/pay_shop_input_amount";
                                        } else if (Intrinsics.c(str2, TransType.TRANS_TYPE_WITHDRAW_TO_AGENT)) {
                                            str = "/sm/withdraw_input_amount";
                                        }
                                        aRouter.build(str).withString("sn_no", dataBean.snNo).withString("core_order_source_type", "PAYSHOP").navigation();
                                    } else if (i7 == BindStatusEnum.UNBOUND.getStatusCode()) {
                                        c cVar = new c(payShopHomeActivity2);
                                        cVar.f6598d = payShopHomeActivity2.getString(g.cs_merchant_no_activated, dataBean.snNo);
                                        cVar.f6601g = payShopHomeActivity2.getString(g.cs_no_type_it_wrong);
                                        cVar.f6603i = null;
                                        String string = payShopHomeActivity2.getString(g.cs_yes_activate);
                                        ViewOnClickListenerC1968k viewOnClickListenerC1968k = new ViewOnClickListenerC1968k(dataBean, 3);
                                        cVar.f6600f = string;
                                        cVar.f6602h = viewOnClickListenerC1968k;
                                        cVar.g();
                                    }
                                }
                            }
                        }
                    } else {
                        h.x(payShopHomeActivity2, parseInstalmentsQrcodeRsp.getRespMsg());
                    }
                } else if (it instanceof m) {
                    payShopHomeActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    payShopHomeActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof o;
                PayShopHomeActivity payShopHomeActivity3 = this.f42186b;
                if (z8) {
                    payShopHomeActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    payShopHomeActivity3.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        RegisterAccountResp registerAccountResp = (RegisterAccountResp) commonBeanResult.data;
                        if (registerAccountResp != null && !TextUtils.isEmpty(registerAccountResp.accountNo)) {
                            ARouter.getInstance().build("/sm/pay_shop_input_amount").withString("sn_no", registerAccountResp.accountNo).navigation();
                        }
                    } else {
                        h.x(this.f42187c, commonBeanResult.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    payShopHomeActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    payShopHomeActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    ((n) it2).getClass();
                }
                return Unit.f38893a;
        }
    }
}
