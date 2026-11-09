package p141j9;

import C0.G;
import M1.j;
import Pa.F;
import Pa.n0;
import Pa.r0;
import Rd.C0587c;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.a;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.modules.core.PermissionListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import com.transsnet.palmpay.airtime.bean.AirtimeOrderList;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.ui.USSDTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.betting.ui.activity.BettingHistoryActivity;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.bean.ShareAppInfo;
import com.transsnet.palmpay.core.bean.cashier.CashierCouponItem;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.CashierCouponListDialog;
import com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog;
import com.transsnet.palmpay.core.dialog.RemindTimeSelectDialog;
import com.transsnet.palmpay.core.dialog.ShareImgDialog;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.ModelNewEarlyRefundItem;
import com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecord;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.main.export.bean.rsp.MinorAccountBean;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeBean;
import com.transsnet.palmpay.send_money.ui.activity.CashierTransferPreviewActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToMobileActivity;
import com.transsnet.palmpay.send_money.ui.view.TransferSpecialReceipt;
import com.transsnet.palmpay.ui.activity.me.MeBalanceAccountActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountListActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.D;
import kotlin.text.y;
import mh.e;
import p051d9.C1605b;
import p143jb.h;
import p203na.c;
import p236pc.d;
import p265r7.b;
import p285sc.C2035i;
import p328ve.q;

/* JADX INFO: renamed from: j9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1794b implements OnOrderDetailItemClickListener, BaseRecyclerViewAdapter$ItemViewOnClickListener, PpAmountEditText.OnTextInputListener, OnClaimRewardListener, OnItemClickListener, Consumer, Function, WheelView.OnWheelItemSelectedListener, MTNButton.a, OnSuccessListener, PermissionListener, ModelNewEarlyRefundItem.OnCheckedChangeListener, ResultCallback, TabLayoutMediator.TabConfigurationStrategy, ReadOnlyProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38394b;

    public /* synthetic */ C1794b(Object obj, int i7) {
        this.f38393a = i7;
        this.f38394b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        Object obj2 = this.f38394b;
        switch (this.f38393a) {
            case 1:
                AirtimeOrderList.OrderData orderData = (AirtimeOrderList.OrderData) obj;
                if (orderData == null) {
                    TopUpRecordActivity.a aVar = TopUpRecordActivity.f26486p;
                } else {
                    a aVar2 = ((TopUpRecordActivity) obj2).f26493j;
                    String orderNo = orderData.orderNo;
                    Intrinsics.checkNotNullExpressionValue(orderNo, "orderNo");
                    aVar2.a(orderNo);
                }
                break;
            case 9:
                AccountFlowBean.DataBean.ListBean data = (AccountFlowBean.DataBean.ListBean) obj;
                int i7 = MeBalanceAccountActivity.f34737j;
                Intrinsics.checkNotNullParameter(data, "data");
                MeBalanceAccountActivity meBalanceAccountActivity = (MeBalanceAccountActivity) obj2;
                meBalanceAccountActivity.f34742g = data.redirect;
                String payId = data.getPayId();
                if ((payId != null ? y.m(payId, "R_", false) : false) && !"03".equals(data.getTransType())) {
                    ARouter.getInstance().build("/main/refund_billdetail").withString("orderNo", data.getRemark()).withString("extra_data", data.getTransType()).navigation();
                } else if (!TextUtils.isEmpty(data.getPayId())) {
                    BalanceViewModel balanceViewModel = (BalanceViewModel) meBalanceAccountActivity.l();
                    String payId2 = data.getPayId();
                    Intrinsics.checkNotNullExpressionValue(payId2, "getPayId(...)");
                    balanceViewModel.e(payId2, data.getAmount(), data.getCreateTime());
                }
                break;
            case 11:
                CashierCouponListDialog.initViews$lambda$1((CashierCouponListDialog) obj2, view, (CashierCouponItem) obj, viewHolder);
                break;
            case 12:
                ((CoreSelectCouponForPaymentDialog) obj2).lambda$initViews$0(view, (CouponItem) obj, viewHolder);
                break;
            case 14:
                ((ShareImgDialog) obj2).lambda$initViews$1(view, (ShareAppInfo) obj, viewHolder);
                break;
            default:
                ReferEarnRecord referEarnRecord = (ReferEarnRecord) obj;
                int i10 = ReferEarnResolveActivity.f31917C;
                if (view.getId() == d.jp_invitees_status) {
                    ((p383zc.y) ((ReferEarnResolveActivity) obj2).f27350a).remindFriendsBySms(referEarnRecord.phone);
                }
                break;
        }
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        TextView textView;
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.f38394b;
        PpAmountEditText ppAmountEditText = topupAirtimeActivity.f26507j;
        if (ppAmountEditText != null && (textView = ppAmountEditText.f24371i) != null) {
            textView.setEnabled(true);
        }
        topupAirtimeActivity.E("");
    }

    @Override // com.transsnet.mtn.sdk.ui.view.MTNButton.a
    public void a() {
        e eVar = (e) this.f38394b;
        if (eVar.f39783o != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.set(1, eVar.f39782j.f39772a);
            calendar.set(2, eVar.f39782j.f39773b - 1);
            calendar.set(5, eVar.f39782j.f39774c);
            eVar.f39783o.a(calendar);
        }
        eVar.dismiss();
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ((h) this.f38394b).invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.Function
    public Object apply(Object p3) throws c {
        Object obj = this.f38394b;
        switch (this.f38393a) {
            case 6:
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (ObservableSource) ((h) obj).invoke(p3);
            case 7:
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (ObservableSource) ((h) obj).invoke(p3);
            case 8:
                CommonBeanResult commonBeanResult = (CommonBeanResult) p3;
                p156ka.a aVar = (p156ka.a) obj;
                aVar.getClass();
                commonBeanResult.getClass();
                if (commonBeanResult.data == 0) {
                    return new User();
                }
                if (!commonBeanResult.isSuccess()) {
                    throw new c(commonBeanResult.getRespCode(), commonBeanResult.getRespMsg());
                }
                aVar.d((MemberInfo) commonBeanResult.data, true);
                return aVar.b();
            case 27:
                int i7 = ReferEarnHomePageActivity.f31872z0;
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (String) ((C2035i) obj).invoke(p3);
            default:
                ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (Long) ((D) obj).invoke(p3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty kProperty) {
        int i7;
        String str;
        KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
        Intrinsics.checkNotNullParameter((InputAmountActivity) obj, "<unused var>");
        Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
        InputAmountActivity inputAmountActivity = (InputAmountActivity) this.f38394b;
        String str2 = inputAmountActivity.f28674C;
        if ((str2 != null ? str2.length() : 0) > 8 && (str = inputAmountActivity.f28674C) != null) {
            i7 = !y.m(str, "M010001", false) ? 2 : 1;
        }
        return Integer.valueOf(i7);
    }

    @Override // com.transsnet.palmpay.core.viewmodel.ModelNewEarlyRefundItem.OnCheckedChangeListener
    public void onCheckedChanged(boolean z3) {
        CashierTransferPreviewActivity cashierTransferPreviewActivity = (CashierTransferPreviewActivity) this.f38394b;
        cashierTransferPreviewActivity.f33153g1 = z3;
        CashierPaymentMethodBean cashierPaymentMethodBean = cashierTransferPreviewActivity.f27504O0;
        if (cashierPaymentMethodBean != null) {
            CoreCashierPreviewActivity.a0(cashierTransferPreviewActivity, cashierPaymentMethodBean, null, 6);
        }
        if (z3) {
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = (ClickEvent) G.f("PalmPayCashierPreview_EarlyRefund_Click", "module_name", "Cashier");
            String str = cashierTransferPreviewActivity.f27454d;
            if (str == null) {
                str = "";
            }
            ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
            String str2 = cashierTransferPreviewActivity.f27455e;
            if (str2 == null) {
                str2 = "";
            }
            ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", str2);
            String str3 = cashierTransferPreviewActivity.f27456f;
            n0VarG.k(clickEventAdd2.add("SubTransType", str3 != null ? str3 : ""));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener
    public void onClick(OrderDetailItemBean it) {
        int i7 = AirtimeBillDetailActivity.f26454i;
        Intrinsics.checkNotNullParameter(it, "it");
        Integer style = it.getStyle();
        if (style != null && style.intValue() == 1004) {
            ActivityUtils.startActivity(F.a((AirtimeBillDetailActivity) this.f38394b, it.getAndroidUrl()));
        }
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = TransferToMobileActivity.f33282v0;
        if (zBooleanValue) {
            ((TransferToMobileActivity) this.f38394b).x();
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        View viewInflate;
        int i10 = BettingHistoryActivity.f26658e;
        Intrinsics.checkNotNullParameter(tab, "tab");
        BettingHistoryActivity bettingHistoryActivity = (BettingHistoryActivity) this.f38394b;
        if (i7 == 1) {
            viewInflate = LayoutInflater.from(bettingHistoryActivity).inflate(Pd.d.qt_layout_betting_tab_view_withdraw, (ViewGroup) null);
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(50)));
        } else {
            viewInflate = LayoutInflater.from(bettingHistoryActivity).inflate(Pd.d.qt_layout_betting_tab_view_desposit, (ViewGroup) null);
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(50)));
        }
        tab.setCustomView(viewInflate);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        Object obj = this.f38394b;
        switch (this.f38393a) {
            case 4:
                int i10 = USSDTopUpHomeActivity.f26542o;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                USSDTopUpHomeActivity uSSDTopUpHomeActivity = (USSDTopUpHomeActivity) obj;
                long jLongValue = ((Number) uSSDTopUpHomeActivity.n().getItem(i7)).longValue();
                C0587c c0587c = (C0587c) uSSDTopUpHomeActivity.f27334c;
                if (c0587c != null && (ppAmountEditText2 = c0587c.f8218f) != null) {
                    ppAmountEditText2.setAmount(r0.n0(jLongValue));
                }
                C0587c c0587c2 = (C0587c) uSSDTopUpHomeActivity.f27334c;
                if (c0587c2 != null && (ppAmountEditText = c0587c2.f8218f) != null) {
                    ppAmountEditText.setError("");
                }
                uSSDTopUpHomeActivity.n().notifyDataSetChanged();
                return;
            case 10:
                KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                if (r0.U0()) {
                    return;
                }
                ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = (ScheduleTopUpEditTaskFragment) obj;
                p155k9.j jVarV = scheduleTopUpEditTaskFragment.v();
                if (jVarV != null) {
                    jVarV.a(i7);
                }
                p155k9.j jVarV2 = scheduleTopUpEditTaskFragment.v();
                scheduleTopUpEditTaskFragment.f26571L = jVarV2 != null ? (ScheduleTopUpAmountItemBean) jVarV2.getItem(i7) : null;
                n0.g().l("Schedule_Top_Up_Airtime_Modify_Page_Choose_Item");
                return;
            case 16:
                DailyFlashSalesView.c((DailyFlashSalesView) obj, jVar, view, i7);
                return;
            case 17:
                int i11 = MinorAccountListActivity.f34767f;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Postcard postcardBuild = ARouter.getInstance().build("/main/minor_account_detail");
                q qVar = ((MinorAccountListActivity) obj).f34769d;
                if (qVar != null) {
                    postcardBuild.withString("teenMemberId", ((MinorAccountBean) qVar.getData().get(i7)).teenMemberId).navigation();
                    return;
                } else {
                    Intrinsics.n("mAccountHistoryAdapter");
                    throw null;
                }
            case 22:
                TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                TransReceiptActivity transReceiptActivity = (TransReceiptActivity) obj;
                TransReceiptTypeBean transReceiptTypeBean = transReceiptActivity.f33232j;
                if (transReceiptTypeBean != null) {
                    transReceiptTypeBean.setCheck(false);
                }
                TransReceiptTypeBean transReceiptTypeBean2 = (TransReceiptTypeBean) transReceiptActivity.m().getItem(i7);
                transReceiptActivity.f33232j = transReceiptTypeBean2;
                if (transReceiptTypeBean2 != null) {
                    transReceiptTypeBean2.setCheck(true);
                }
                TransReceiptTypeBean transReceiptTypeBean3 = transReceiptActivity.f33232j;
                if (TextUtils.isEmpty(transReceiptTypeBean3 != null ? transReceiptTypeBean3.getName() : null)) {
                    transReceiptActivity.q();
                } else {
                    TransReceiptTypeBean transReceiptTypeBean4 = transReceiptActivity.f33232j;
                    transReceiptActivity.n().removeAllViews();
                    transReceiptActivity.o().removeAllViews();
                    TradeRecordDetailResp.RecordDetail recordDetail = transReceiptActivity.t;
                    if (recordDetail != null) {
                        TransferSpecialReceipt transferSpecialReceipt = new TransferSpecialReceipt(transReceiptActivity, null, 0, 14);
                        transferSpecialReceipt.setData(transReceiptActivity.t);
                        transferSpecialReceipt.setSkin(transReceiptTypeBean4);
                        transReceiptActivity.f33233o = transferSpecialReceipt;
                        TransferSpecialReceipt transferSpecialReceipt2 = new TransferSpecialReceipt(transReceiptActivity, null, 0, 6);
                        transferSpecialReceipt2.setData(recordDetail);
                        transferSpecialReceipt2.setSkin(transReceiptTypeBean4);
                        transReceiptActivity.f33234p = transferSpecialReceipt2;
                        transReceiptActivity.n().addView(transReceiptActivity.f33233o);
                        transReceiptActivity.o().addView(transReceiptActivity.f33234p);
                    }
                }
                transReceiptActivity.m().notifyDataSetChanged();
                return;
            default:
                int i12 = PayShopHomeActivity.f28705p0;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                n0.g().l("PayshopHomepageRecently");
                PayShopHomeActivity payShopHomeActivity = (PayShopHomeActivity) obj;
                payShopHomeActivity.v(((QueryRecentlyMerchantResp.Data) ((p339wb.q) payShopHomeActivity.f28720k0.getValue()).getData().get(i7)).getSnNo(), true);
                return;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public void onItemSelected(int i7, Object obj) {
        RemindTimeSelectDialog.initViews$lambda$3((RemindTimeSelectDialog) this.f38394b, i7, (String) obj);
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        GeolocationPermissions.Callback callback;
        String str;
        b bVar = (b) this.f38394b;
        bVar.f41598i = false;
        boolean z3 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            boolean z8 = iArr[i10] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = bVar.f41596f) != null && (str = bVar.f41597g) != null) {
                if (z8) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                bVar.f41596f = null;
                bVar.f41597g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z8 && (arrayList4 = bVar.f41595e) != null) {
                    arrayList4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z3 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z8 && (arrayList3 = bVar.f41595e) != null) {
                    arrayList3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z3 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z8 && (arrayList2 = bVar.f41595e) != null) {
                    arrayList2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z3 = true;
            }
        }
        if (z3 && (permissionRequest = bVar.f41594d) != null && (arrayList = bVar.f41595e) != null) {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
            bVar.f41594d = null;
            bVar.f41595e = null;
        }
        ArrayList arrayList5 = bVar.f41599j;
        if (arrayList5.isEmpty()) {
            return true;
        }
        bVar.a(arrayList5);
        return false;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener
    public void onShowLoading(boolean z3) {
        int i7 = TopupResultActivityV2.f26521k0;
        ((TopupResultActivityV2) this.f38394b).showLoadingDialog(z3);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f38393a) {
            case 18:
                ((C1605b) this.f38394b).invoke(obj);
                break;
            default:
                ((D) this.f38394b).invoke(obj);
                break;
        }
    }
}
