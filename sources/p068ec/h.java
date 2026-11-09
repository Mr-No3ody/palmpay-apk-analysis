package p068ec;

import Hb.A;
import N8.q0;
import O6.c;
import Pa.r0;
import Pd.f;
import Rd.C0599o;
import Vd.a;
import Wd.C0751z;
import Xd.o;
import Yd.u;
import android.text.TextUtils;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.airtime.bean.rsp.AvailableOrderParamsInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.TopUpRecordItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.DataBundleGroupParams;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DataBundleParams;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36260b;

    public /* synthetic */ h(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36259a = i7;
        this.f36260b = buyBundleHomePageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AvailableOrderParamsInfo availableOrderParamsInfo;
        ArrayList<DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean> data;
        MobileWalletResp.MobileWallet mobileWalletR;
        String str;
        String str2;
        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean;
        String itemName;
        String billerName;
        String description;
        DataBundleWalletItemBean paymentItem;
        String description2;
        DataBundleWalletItemBean paymentItem2;
        DataBundleWalletItemBean paymentItem3;
        String operatorCode = "";
        BuyBundleHomePageActivity context = this.f36260b;
        switch (this.f36259a) {
            case 0:
                String str3 = (String) obj;
                CommonBeanResult rsp = (CommonBeanResult) obj2;
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                if (rsp.isSuccess() && (availableOrderParamsInfo = (AvailableOrderParamsInfo) rsp.data) != null) {
                    DataBundleWalletItemBean dataBundleWalletItemBean = new DataBundleWalletItemBean();
                    dataBundleWalletItemBean.setValidity(availableOrderParamsInfo.getValidity());
                    dataBundleWalletItemBean.setBillerName(availableOrderParamsInfo.getBillerName());
                    dataBundleWalletItemBean.setBillerId(availableOrderParamsInfo.getBillerId());
                    dataBundleWalletItemBean.setCategoryId(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE);
                    dataBundleWalletItemBean.setItemId(availableOrderParamsInfo.getItemId());
                    dataBundleWalletItemBean.setVolume(availableOrderParamsInfo.getVolume());
                    dataBundleWalletItemBean.setVolumeUnit(availableOrderParamsInfo.getVolumeUnit());
                    dataBundleWalletItemBean.setItemName(availableOrderParamsInfo.getItemName());
                    dataBundleWalletItemBean.setDescription(availableOrderParamsInfo.getDescription());
                    long amount = availableOrderParamsInfo.getAmount();
                    if (amount == null) {
                        amount = 0L;
                    }
                    dataBundleWalletItemBean.setPrice(amount);
                    dataBundleWalletItemBean.setInstitutionLogo(availableOrderParamsInfo.getBillerIcon());
                    dataBundleWalletItemBean.setCouponCode(availableOrderParamsInfo.getCouponCode());
                    context.p(dataBundleWalletItemBean, r0.w0(str3), dataBundleWalletItemBean.getPrice(), true, (24 & 16) != 0 ? null : TransType.TRANS_TYPE_CASH_LOAN);
                }
                return Unit.f38893a;
            case 1:
                DataBundleGroupParams dataBundleGroupParams = (DataBundleGroupParams) obj;
                DataBundleListByCategoryIdResp result = (DataBundleListByCategoryIdResp) obj2;
                KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(result, "result");
                context.y(false);
                if (result.isSuccess() && result.getData() != null && (data = result.getData()) != null && (!data.isEmpty()) && (mobileWalletR = context.r()) != null && (str = mobileWalletR.operatorCode) != null) {
                    ArrayList<DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean> data2 = result.getData();
                    if (str.equalsIgnoreCase((data2 == null || (dataBundleWalletCategoryBean = (DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) CollectionsKt.F(data2)) == null) ? null : dataBundleWalletCategoryBean.getBillerId())) {
                        ArrayList<DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean> data3 = result.getData();
                        if (data3 != null) {
                            context.f31759s0 = data3;
                        }
                        o oVar = context.f31745L;
                        if (oVar != null) {
                            MobileWalletResp.MobileWallet mobileWalletR2 = context.r();
                            if (mobileWalletR2 != null && (str2 = mobileWalletR2.operatorCode) != null) {
                                operatorCode = str2;
                            }
                            ArrayList list = context.f31759s0;
                            boolean zC = dataBundleGroupParams != null ? Intrinsics.c(dataBundleGroupParams.getForceRefresh(), Boolean.TRUE) : false;
                            Intrinsics.checkNotNullParameter(operatorCode, "operatorCode");
                            Intrinsics.checkNotNullParameter(list, "list");
                            if (!Intrinsics.c(oVar.f11162o, operatorCode) || zC) {
                                oVar.t++;
                            }
                            oVar.f11162o = operatorCode;
                            List listY = CollectionsKt.Y(list);
                            oVar.f11164v = listY;
                            List list2 = listY;
                            ArrayList arrayList = new ArrayList(r.l(list2, 10));
                            Iterator it = list2.iterator();
                            int i7 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i10 = i7 + 1;
                                if (i7 < 0) {
                                    C1850q.k();
                                    throw null;
                                }
                                long jHashCode = ((long) oVar.f11162o.hashCode()) & 1048575;
                                Integer bundleCategoryId = ((DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) next).getBundleCategoryId();
                                Iterator it2 = it;
                                arrayList.add(Long.valueOf((((long) (bundleCategoryId != null ? bundleCategoryId.intValue() : 0)) & 1048575) | ((((long) i7) & 255) << 40) | ((oVar.t & 65535) << 48) | (jHashCode << 20)));
                                it = it2;
                                i7 = i10;
                            }
                            oVar.f11163p = arrayList;
                            oVar.notifyDataSetChanged();
                        }
                        C0599o c0599o = (C0599o) context.f27334c;
                        if (c0599o != null) {
                            c0599o.f8431f.viewPager2.setCurrentItem(0, false);
                        }
                    }
                }
                return Unit.f38893a;
            case 2:
                DataBundleParams dataBundleParams = (DataBundleParams) obj;
                CreateTellerOrderRsp result2 = (CreateTellerOrderRsp) obj2;
                KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean zIsSuccess = result2.isSuccess();
                BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36260b;
                if (zIsSuccess) {
                    DataBundleWalletItemBean paymentItem4 = dataBundleParams != null ? dataBundleParams.getPaymentItem() : null;
                    String volume = paymentItem4 != null ? paymentItem4.getVolume() : null;
                    String volumeUnit = paymentItem4 != null ? paymentItem4.getVolumeUnit() : null;
                    String validity = paymentItem4 != null ? paymentItem4.getValidity() : null;
                    if (volume == null || volumeUnit == null || validity == null) {
                        itemName = paymentItem4 != null ? paymentItem4.getItemName() : null;
                        if (itemName == null) {
                            itemName = "";
                        }
                    } else {
                        itemName = q0.l(volume, volumeUnit, " - ", validity);
                    }
                    C0751z c0751z = new C0751z(buyBundleHomePageActivity, 7);
                    c0751z.f4971b = result2.data.orderNo;
                    c0751z.c(Long.valueOf(dataBundleParams != null ? dataBundleParams.getAmount() : 0L));
                    c0751z.f4972c = TransType.TRANS_TYPE_BUNDLE;
                    c0751z.f4978i = result2.data.calculationExtInfo;
                    c0751z.f4974e = "5";
                    ArrayList arrayList2 = new ArrayList();
                    String string = buyBundleHomePageActivity.getString(f.qt_biller_name);
                    if (dataBundleParams == null || (paymentItem3 = dataBundleParams.getPaymentItem()) == null || (billerName = paymentItem3.getBillerName()) == null) {
                        billerName = "";
                    }
                    arrayList2.add(new CoreCashierPaymentExtra(string, billerName));
                    arrayList2.add(new CoreCashierPaymentExtra(buyBundleHomePageActivity.getString(a.qt_bundle_bills), itemName));
                    String string2 = buyBundleHomePageActivity.getString(f.qt_recipient_mobile_number);
                    String strL0 = r0.L0(dataBundleParams != null ? dataBundleParams.getMobileNumber() : null);
                    if (strL0 == null) {
                        strL0 = "";
                    }
                    arrayList2.add(new CoreCashierPaymentExtra(string2, strL0));
                    if (dataBundleParams == null || (paymentItem2 = dataBundleParams.getPaymentItem()) == null || (description = paymentItem2.getDescription()) == null) {
                        description = "";
                    }
                    if (!TextUtils.isEmpty(description)) {
                        String string3 = buyBundleHomePageActivity.getString(a.qt_bundle_details);
                        if (dataBundleParams != null && (paymentItem = dataBundleParams.getPaymentItem()) != null && (description2 = paymentItem.getDescription()) != null) {
                            operatorCode = description2;
                        }
                        arrayList2.add(new CoreCashierPaymentExtra(string3, operatorCode));
                    }
                    c0751z.b(arrayList2);
                    c0751z.d();
                } else if (Intrinsics.c(result2.getRespCode(), "CFRONT_800101")) {
                    n.O(buyBundleHomePageActivity, 0, Integer.valueOf(f.qt_confirm_mobile_information), null, null, null, null, result2.getRespMsg(), Integer.valueOf(k.core_continue), null, new p054dd.n(2, dataBundleParams, buyBundleHomePageActivity), Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                } else {
                    ToastUtils.showLong(result2.getRespMsg(), new Object[0]);
                }
                return Unit.f38893a;
            case 3:
                List items = (List) obj;
                Function0 callback = (Function0) obj2;
                KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(callback, "callback");
                A onConfirm = new A(context, 6, items, callback);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
                c cVar = new c(context);
                cVar.b(f.qt_delete_all_topup_numbers_message);
                cVar.c(k.core_cancel, null);
                cVar.d(k.core_confirm, new u(onConfirm, 0));
                cVar.g();
                return Unit.f38893a;
            default:
                TopUpRecordItem item = (TopUpRecordItem) obj;
                Function0 callback2 = (Function0) obj2;
                KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                b.U(context, item.getShortCustomerId(), new A(context, 5, item, callback2));
                return Unit.f38893a;
        }
    }
}
