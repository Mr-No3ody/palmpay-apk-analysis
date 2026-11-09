package p141j9;

import Hb.A;
import N8.q0;
import O6.c;
import Pa.i0;
import Pa.r0;
import Vd.a;
import Wd.C0751z;
import Yd.u;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.airtime.bean.AirtimeDownTimeOrderBean;
import com.transsnet.palmpay.airtime.bean.AirtimeExtraItemInfoBean;
import com.transsnet.palmpay.airtime.bean.AirtimeOrderStatusRsp;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.req.AirtimeOrderAddReq;
import com.transsnet.palmpay.airtime.bean.req.GroupPurchaseReq;
import com.transsnet.palmpay.airtime.bean.rsp.AvailableOrderParamsInfo;
import com.transsnet.palmpay.airtime.bean.rsp.CreateGroupPurchaseRsp;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.TopUpRecordItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.DataBundleParams;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p054dd.d;
import p155k9.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38438b;

    public /* synthetic */ x(TopupAirtimeActivity topupAirtimeActivity, int i7) {
        this.f38437a = i7;
        this.f38438b = topupAirtimeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long itemPrice;
        Long businessAmount;
        Long groupNumber;
        AvailableOrderParamsInfo availableOrderParamsInfo;
        AvailableOrderParamsInfo availableOrderParamsInfo2;
        String billerName;
        String volume;
        String volumeUnit;
        String validity;
        String mobileNumber;
        String description;
        DataBundleWalletItemBean paymentItem;
        String description2;
        DataBundleWalletItemBean paymentItem2;
        DataBundleWalletItemBean paymentItem3;
        DataBundleWalletItemBean paymentItem4;
        DataBundleWalletItemBean paymentItem5;
        DataBundleWalletItemBean paymentItem6;
        String str;
        final int i7 = 1;
        String str2 = "";
        long jLongValue = 0;
        final int i10 = 0;
        TopupAirtimeActivity context = this.f38438b;
        switch (this.f38437a) {
            case 0:
                String str3 = (String) obj;
                CommonBeanResult rsp = (CommonBeanResult) obj2;
                int i11 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                if (rsp.isSuccess() && str3 != null) {
                    QueryAirtimeV2Rsp.DataBean dataBean = context.f26505Z;
                    if (str3.equals(dataBean != null ? dataBean.getNetwork() : null)) {
                        context.f26496A.put(str3, rsp.data);
                        f fVar = context.f26500L;
                        if (fVar != null) {
                            fVar.g(((AirtimeExtraItemInfoBean) rsp.data).getAirtimeCustomizedSpotVO(), ((AirtimeExtraItemInfoBean) rsp.data).getItemTipsList());
                        }
                    }
                }
                break;
            case 1:
                GroupPurchaseReq groupPurchaseReq = (GroupPurchaseReq) obj;
                CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                int i12 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(rsp2, "rsp");
                boolean zIsSuccess = rsp2.isSuccess();
                TopupAirtimeActivity topupAirtimeActivity = this.f38438b;
                if (zIsSuccess) {
                    C1802j c1802j = new C1802j(topupAirtimeActivity);
                    c1802j.f38409l = Long.valueOf((groupPurchaseReq == null || (groupNumber = groupPurchaseReq.getGroupNumber()) == null) ? 0L : groupNumber.longValue());
                    CreateGroupPurchaseRsp createGroupPurchaseRsp = (CreateGroupPurchaseRsp) rsp2.data;
                    c1802j.f4971b = createGroupPurchaseRsp != null ? createGroupPurchaseRsp.getOrderNo() : null;
                    CreateGroupPurchaseRsp createGroupPurchaseRsp2 = (CreateGroupPurchaseRsp) rsp2.data;
                    c1802j.c(Long.valueOf((createGroupPurchaseRsp2 == null || (businessAmount = createGroupPurchaseRsp2.getBusinessAmount()) == null) ? 0L : businessAmount.longValue()));
                    c1802j.f4972c = TransType.TRANS_TYPE_AIRTIME_GROUP_PURCHASE;
                    CreateGroupPurchaseRsp createGroupPurchaseRsp3 = (CreateGroupPurchaseRsp) rsp2.data;
                    c1802j.f4978i = createGroupPurchaseRsp3 != null ? createGroupPurchaseRsp3.getCalculationExtInfo() : null;
                    c1802j.f4974e = "999";
                    ArrayList arrayList = new ArrayList();
                    String string = topupAirtimeActivity.getString(Pd.f.qt_top_up_amount);
                    CreateGroupPurchaseRsp createGroupPurchaseRsp4 = (CreateGroupPurchaseRsp) rsp2.data;
                    if (createGroupPurchaseRsp4 != null && (itemPrice = createGroupPurchaseRsp4.getItemPrice()) != null) {
                        jLongValue = itemPrice.longValue();
                    }
                    arrayList.add(new CoreCashierPaymentExtra(string, r0.B(jLongValue, false)));
                    arrayList.add(new CoreCashierPaymentExtra(topupAirtimeActivity.getString(Pd.f.qt_recipient_number), i0.n(i0.D(groupPurchaseReq != null ? groupPurchaseReq.getPhone() : null), false)));
                    c1802j.b(arrayList);
                    c1802j.d();
                } else if (Intrinsics.c(rsp2.getRespCode(), "CFRONT_800101")) {
                    int i13 = Pd.f.qt_confirm_mobile_information;
                    String respMsg = rsp2.getRespMsg();
                    n.O(topupAirtimeActivity, 0, Integer.valueOf(i13), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new p054dd.n(10, groupPurchaseReq, topupAirtimeActivity), Integer.valueOf(k.core_change), null, new d(18), null, false, 0, 8376957);
                } else {
                    ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                }
                break;
            case 2:
                String str4 = (String) obj;
                CommonBeanResult rsp3 = (CommonBeanResult) obj2;
                int i14 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(rsp3, "rsp");
                if (rsp3.isSuccess() && (availableOrderParamsInfo = (AvailableOrderParamsInfo) rsp3.data) != null) {
                    AirtimeOrderAddReq airtimeOrderAddReq = new AirtimeOrderAddReq();
                    Long amount = availableOrderParamsInfo.getAmount();
                    airtimeOrderAddReq.amount = amount != null ? amount.longValue() : 0L;
                    airtimeOrderAddReq.itemId = availableOrderParamsInfo.getItemId();
                    airtimeOrderAddReq.transType = "04";
                    airtimeOrderAddReq.billerName = availableOrderParamsInfo.getBillerName();
                    airtimeOrderAddReq.network = availableOrderParamsInfo.getBillerId();
                    airtimeOrderAddReq.icon = availableOrderParamsInfo.getBillerIcon();
                    airtimeOrderAddReq.couponCode = availableOrderParamsInfo.getCouponCode();
                    airtimeOrderAddReq.phone = str4;
                    context.r(airtimeOrderAddReq, true);
                }
                break;
            case 3:
                String str5 = (String) obj;
                CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                int i15 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(rsp4, "rsp");
                if (rsp4.isSuccess() && (availableOrderParamsInfo2 = (AvailableOrderParamsInfo) rsp4.data) != null) {
                    AirtimeOrderAddReq airtimeOrderAddReq2 = new AirtimeOrderAddReq();
                    Long amount2 = availableOrderParamsInfo2.getAmount();
                    airtimeOrderAddReq2.amount = amount2 != null ? amount2.longValue() : 0L;
                    airtimeOrderAddReq2.itemId = availableOrderParamsInfo2.getItemId();
                    airtimeOrderAddReq2.transType = "04";
                    airtimeOrderAddReq2.billerName = availableOrderParamsInfo2.getBillerName();
                    airtimeOrderAddReq2.network = availableOrderParamsInfo2.getBillerId();
                    airtimeOrderAddReq2.icon = availableOrderParamsInfo2.getBillerIcon();
                    airtimeOrderAddReq2.phone = str5;
                    context.r(airtimeOrderAddReq2, true);
                }
                break;
            case 4:
                DataBundleParams dataBundleParams = (DataBundleParams) obj;
                CreateTellerOrderRsp result = (CreateTellerOrderRsp) obj2;
                int i16 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zIsSuccess2 = result.isSuccess();
                TopupAirtimeActivity topupAirtimeActivity2 = this.f38438b;
                if (zIsSuccess2) {
                    C0751z c0751z = new C0751z(topupAirtimeActivity2, 7);
                    c0751z.f4971b = result.data.orderNo;
                    c0751z.c(Long.valueOf(dataBundleParams != null ? dataBundleParams.getAmount() : 0L));
                    c0751z.f4972c = TransType.TRANS_TYPE_BUNDLE;
                    c0751z.f4978i = result.data.calculationExtInfo;
                    c0751z.f4974e = "5";
                    ArrayList arrayList2 = new ArrayList();
                    String string2 = topupAirtimeActivity2.getString(Pd.f.qt_biller_name);
                    if (dataBundleParams == null || (paymentItem6 = dataBundleParams.getPaymentItem()) == null || (billerName = paymentItem6.getBillerName()) == null) {
                        billerName = "";
                    }
                    arrayList2.add(new CoreCashierPaymentExtra(string2, billerName));
                    String string3 = topupAirtimeActivity2.getString(a.qt_bundle_bills);
                    if (dataBundleParams == null || (paymentItem5 = dataBundleParams.getPaymentItem()) == null || (volume = paymentItem5.getVolume()) == null) {
                        volume = "";
                    }
                    if (dataBundleParams == null || (paymentItem4 = dataBundleParams.getPaymentItem()) == null || (volumeUnit = paymentItem4.getVolumeUnit()) == null) {
                        volumeUnit = "";
                    }
                    if (dataBundleParams == null || (paymentItem3 = dataBundleParams.getPaymentItem()) == null || (validity = paymentItem3.getValidity()) == null) {
                        validity = "";
                    }
                    arrayList2.add(new CoreCashierPaymentExtra(string3, q0.l(volume, volumeUnit, " - ", validity)));
                    String string4 = topupAirtimeActivity2.getString(Pd.f.qt_recipient_mobile_number);
                    if (dataBundleParams == null || (mobileNumber = dataBundleParams.getMobileNumber()) == null) {
                        mobileNumber = "";
                    }
                    arrayList2.add(new CoreCashierPaymentExtra(string4, mobileNumber));
                    if (dataBundleParams == null || (paymentItem2 = dataBundleParams.getPaymentItem()) == null || (description = paymentItem2.getDescription()) == null) {
                        description = "";
                    }
                    if (!TextUtils.isEmpty(description)) {
                        String string5 = topupAirtimeActivity2.getString(a.qt_bundle_details);
                        if (dataBundleParams != null && (paymentItem = dataBundleParams.getPaymentItem()) != null && (description2 = paymentItem.getDescription()) != null) {
                            str2 = description2;
                        }
                        arrayList2.add(new CoreCashierPaymentExtra(string5, str2));
                    }
                    c0751z.b(arrayList2);
                    c0751z.d();
                } else if (Intrinsics.c(result.getRespCode(), "CFRONT_800101")) {
                    n.O(topupAirtimeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_mobile_information), null, null, null, null, result.getRespMsg(), Integer.valueOf(k.core_continue), null, new p054dd.n(11, dataBundleParams, topupAirtimeActivity2), Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                } else {
                    ToastUtils.showLong(result.getRespMsg(), new Object[0]);
                }
                break;
            case 5:
                final AirtimeOrderAddReq airtimeOrderAddReq3 = (AirtimeOrderAddReq) obj;
                AirtimeOrderStatusRsp rsp5 = (AirtimeOrderStatusRsp) obj2;
                int i17 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(rsp5, "rsp");
                AirtimeOrderStatusRsp.DataBean dataBean2 = rsp5.data;
                if (dataBean2 != null) {
                    dataBean2.mobileNo = airtimeOrderAddReq3 != null ? airtimeOrderAddReq3.phone : null;
                }
                boolean zIsSuccess3 = rsp5.isSuccess();
                final TopupAirtimeActivity topupAirtimeActivity3 = this.f38438b;
                if (zIsSuccess3) {
                    if (Intrinsics.c(airtimeOrderAddReq3 != null ? airtimeOrderAddReq3.orderType : null, "03")) {
                        AirtimeOrderStatusRsp.DataBean data = rsp5.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        Postcard postcardBuild = ARouter.getInstance().build("/airtime/down_time_top_up_airtime");
                        AirtimeDownTimeOrderBean airtimeDownTimeOrderBean = new AirtimeDownTimeOrderBean();
                        airtimeDownTimeOrderBean.setOrderNo(data.orderNo);
                        airtimeDownTimeOrderBean.setMobileNo(data.mobileNo);
                        airtimeDownTimeOrderBean.setNetwork(airtimeOrderAddReq3.network);
                        airtimeDownTimeOrderBean.setBillerName(airtimeOrderAddReq3.billerName);
                        airtimeDownTimeOrderBean.setTransType(airtimeOrderAddReq3.transType);
                        airtimeDownTimeOrderBean.setOrderType(airtimeOrderAddReq3.orderType);
                        airtimeDownTimeOrderBean.setAmount(airtimeOrderAddReq3.amount);
                        Unit unit = Unit.f38893a;
                        postcardBuild.withSerializable("extra_data", airtimeDownTimeOrderBean).navigation();
                    } else {
                        AirtimeOrderStatusRsp.DataBean dataBean3 = rsp5.data;
                        if (dataBean3 != null) {
                            String str6 = topupAirtimeActivity3.f26508k0 != null ? "64" : "0";
                            C0751z c0751z2 = new C0751z(topupAirtimeActivity3, 8);
                            c0751z2.f4971b = dataBean3.orderNo;
                            c0751z2.c(Long.valueOf(airtimeOrderAddReq3 != null ? airtimeOrderAddReq3.amount : 0L));
                            c0751z2.f4972c = airtimeOrderAddReq3 != null ? airtimeOrderAddReq3.transType : null;
                            c0751z2.f4978i = dataBean3.calculationExtInfo;
                            c0751z2.f4974e = str6;
                            ArrayList arrayList3 = new ArrayList();
                            String string6 = topupAirtimeActivity3.getString(Pd.f.qt_airtime_provider);
                            if (airtimeOrderAddReq3 != null && (str = airtimeOrderAddReq3.billerName) != null) {
                                str2 = str;
                            }
                            arrayList3.add(new CoreCashierPaymentExtra(string6, str2));
                            arrayList3.add(new CoreCashierPaymentExtra(topupAirtimeActivity3.getString(Pd.f.qt_airtime_mobile_number), i0.n(i0.D(dataBean3.mobileNo), false)));
                            c0751z2.b(arrayList3);
                            c0751z2.d();
                        }
                    }
                } else {
                    String respCode = rsp5.getRespCode();
                    if (Intrinsics.c(respCode, "CFRONT_800101")) {
                        int i18 = Pd.f.qt_confirm_mobile_information;
                        String respMsg2 = rsp5.getRespMsg();
                        n.O(topupAirtimeActivity3, 0, Integer.valueOf(i18), null, null, null, null, respMsg2 == null ? "" : respMsg2, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: j9.z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                TopupAirtimeActivity topupAirtimeActivity4 = topupAirtimeActivity3;
                                AirtimeOrderAddReq airtimeOrderAddReq4 = airtimeOrderAddReq3;
                                switch (i10) {
                                    case 0:
                                        int i19 = TopupAirtimeActivity.f26495x0;
                                        if (airtimeOrderAddReq4 != null) {
                                            topupAirtimeActivity4.r(airtimeOrderAddReq4, false);
                                        }
                                        break;
                                    default:
                                        int i20 = TopupAirtimeActivity.f26495x0;
                                        if (airtimeOrderAddReq4 != null) {
                                            long j6 = 100;
                                            airtimeOrderAddReq4.amount = (airtimeOrderAddReq4.amount / j6) * j6;
                                            topupAirtimeActivity4.r(airtimeOrderAddReq4, airtimeOrderAddReq4.verifyNetwork);
                                        }
                                        break;
                                }
                            }
                        }, Integer.valueOf(k.core_change), null, new d(19), null, false, 0, 8376957);
                    } else if (Intrinsics.c(respCode, "A000009")) {
                        int i19 = Pd.f.qt_confirm_top_up_amount;
                        String respMsg3 = rsp5.getRespMsg();
                        n.O(topupAirtimeActivity3, 0, Integer.valueOf(i19), null, null, null, null, respMsg3 == null ? "" : respMsg3, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: j9.z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                TopupAirtimeActivity topupAirtimeActivity4 = topupAirtimeActivity3;
                                AirtimeOrderAddReq airtimeOrderAddReq4 = airtimeOrderAddReq3;
                                switch (i7) {
                                    case 0:
                                        int i110 = TopupAirtimeActivity.f26495x0;
                                        if (airtimeOrderAddReq4 != null) {
                                            topupAirtimeActivity4.r(airtimeOrderAddReq4, false);
                                        }
                                        break;
                                    default:
                                        int i20 = TopupAirtimeActivity.f26495x0;
                                        if (airtimeOrderAddReq4 != null) {
                                            long j6 = 100;
                                            airtimeOrderAddReq4.amount = (airtimeOrderAddReq4.amount / j6) * j6;
                                            topupAirtimeActivity4.r(airtimeOrderAddReq4, airtimeOrderAddReq4.verifyNetwork);
                                        }
                                        break;
                                }
                            }
                        }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                    } else {
                        ToastUtils.showLong(rsp5.getRespMsg(), new Object[0]);
                    }
                }
                break;
            case 6:
                List items = (List) obj;
                Function0 callback = (Function0) obj2;
                int i20 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(callback, "callback");
                A onConfirm = new A(context, 9, items, callback);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
                c cVar = new c(context);
                cVar.b(Pd.f.qt_delete_all_topup_numbers_message);
                cVar.c(k.core_cancel, null);
                cVar.d(k.core_confirm, new u(onConfirm, 0));
                cVar.g();
                break;
            default:
                TopUpRecordItem item = (TopUpRecordItem) obj;
                Function0 callback2 = (Function0) obj2;
                int i21 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                b.U(context, item.getShortCustomerId(), new A(context, 8, item, callback2));
                break;
        }
        return Unit.f38893a;
    }
}
