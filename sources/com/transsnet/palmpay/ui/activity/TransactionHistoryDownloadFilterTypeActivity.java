package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.p;
import L6.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.ui.view.FlowLayoutManager;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.g;
import p052da.A;
import p052da.ViewOnClickListenerC1649v;
import p102ge.Q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadFilterTypeActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionHistoryDownloadFilterTypeActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34594f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f34595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f34596b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34597c = C2131j.b(new c(17));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34598d = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34599e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startAct(@NotNull TransactionHistoryDownloadFilterActivity context, int i7, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intent intent = new Intent(context, (Class<?>) TransactionHistoryDownloadFilterTypeActivity.class);
            intent.putExtras(bundle);
            context.startActivityForResult(intent, i7, null);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            this.f34599e = extras != null ? extras.getString("key") : null;
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null && extras2.get("value") != null) {
                Bundle extras3 = getIntent().getExtras();
                this.f34598d = String.valueOf(extras3 != null ? extras3.get("value") : null);
            }
        }
        t tVar = this.f34597c;
        ((ArrayList) tVar.getValue()).add(getResources().getString(h.main_quick_filter_title));
        ((ArrayList) tVar.getValue()).add(getResources().getString(h.main_bill_category_title));
        ((ArrayList) tVar.getValue()).add(getResources().getString(h.main_other_title));
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"All", "03", "01", "99", TransType.TRANS_TYPE_INTERBANK_CASH_IN, "02"};
        for (int i7 = 0; i7 < 6; i7++) {
            BillType billType = new BillType();
            String strTranslateTransType = "All";
            billType.type = "All".equals(strArr[i7]) ? "All" : strArr[i7];
            if (!"All".equals(strArr[i7])) {
                strTranslateTransType = TransTypeUtils.translateTransType(billType.type);
            }
            billType.typeName = strTranslateTransType;
            arrayList.add(billType);
        }
        ArrayList arrayList2 = this.f34596b;
        arrayList2.add(arrayList);
        ArrayList arrayList3 = new ArrayList();
        String[] strArr2 = {"04", TransType.TRANS_TYPE_BUNDLE, TransType.TRANS_TYPE_BILLER_BETTING, "17", "16", "15", "29", TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE, TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS, TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_TRANSPORT, TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS, TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS, TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS, TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS, TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS, TransType.TRANS_TYPE_BILLER_RELIGIOUS, TransType.TRANS_TYPE_BILLER_EDUCATION, TransType.TRANS_TYPE_AGENT_COMMISSION};
        for (int i10 = 0; i10 < 22; i10++) {
            BillType billType2 = new BillType();
            String str = strArr2[i10];
            billType2.type = str;
            billType2.typeName = TransTypeUtils.translateTransType(str);
            arrayList3.add(billType2);
        }
        arrayList2.add(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        String[] strArr3 = {TransType.BILL_TYPE_CASHBOX, TransType.TRANS_TYPE_OPERATING, TransType.TRANS_TYPE_P2P_CASH_IN, TransType.TRANS_TYPE_P2P_CASH_OUT, TransType.BILL_TYPE_COMBINE_MERCHANT, TransType.TRANS_TYPE_COMMISSION, TransType.TRANS_TYPE_AUTO_DEDUCT, TransType.BILL_TYPE_REPAY_LOAN, TransType.BILL_TYPE_LUCKY_MONEY, TransType.BILL_TYPE_DISBURSEMENT, TransType.TRANS_TYPE_GROUP_BUY, TransType.TRANS_TYPE_PALMBUY, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE, TransType.TRANS_TYPE_FIXED_SAVING, TransType.TRANS_TYPE_FIXED_SAVING_PAID, TransType.BILL_TYPE_QRCODE_PAYMENT};
        for (int i11 = 0; i11 < 18; i11++) {
            BillType billType3 = new BillType();
            String str2 = strArr3[i11];
            billType3.type = str2;
            billType3.typeName = TransTypeUtils.translateTransType(str2);
            arrayList4.add(billType3);
        }
        arrayList2.add(arrayList4);
        l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
        BarUtils.setStatusBarLightMode((Activity) this, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_transaction_download_filter_type, (ViewGroup) null, false);
        int i7 = e.titleBar;
        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.tvNext;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = e.viewContainer;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                if (linearLayout != null) {
                    p pVar = new p((LinearLayout) viewInflate, ppButton, linearLayout, 4);
                    this.f34595a = pVar;
                    return pVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        p pVar = this.f34595a;
        if (pVar != null) {
            ((LinearLayout) pVar.f813d).removeAllViews();
        }
        ArrayList arrayList = this.f34596b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View viewInflate = View.inflate(this, g.core_item_list_module, null);
            View viewFindViewById = viewInflate.findViewById(e.tv_title);
            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById2 = viewInflate.findViewById(e.rcv_choose_list);
            Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
            ((TextView) viewFindViewById).setText((CharSequence) ((ArrayList) this.f34597c.getValue()).get(i7));
            Intrinsics.checkNotNullParameter(this, "context");
            FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
            flowLayoutManager.f35292a = this;
            recyclerView.setLayoutManager(flowLayoutManager);
            F f10 = new F();
            A a3 = new A(this);
            f10.f38951a = a3;
            recyclerView.setAdapter(a3);
            ((A) f10.f38951a).f4985b = (List) arrayList.get(i7);
            ((A) f10.f38951a).f35671e = this.f34598d;
            recyclerView.addItemDecoration(new Q());
            ((A) f10.f38951a).f4986c = new com.transsnet.adsdk.b(9, this, f10);
            p pVar2 = this.f34595a;
            if (pVar2 != null) {
                ((LinearLayout) pVar2.f813d).addView(viewInflate);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        p pVar = this.f34595a;
        if (pVar != null) {
            ((PpButton) pVar.f812c).setEnabled(false);
        }
        p pVar2 = this.f34595a;
        if (pVar2 != null) {
            ((PpButton) pVar2.f812c).setOnClickListener(new ViewOnClickListenerC1649v(this, 7));
        }
    }
}
