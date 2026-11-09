package Na;

import Ad.c0;
import Je.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.ui.widget.FlowLayoutManager;
import com.transsnet.palmpay.core.ui.widget.e;
import com.transsnet.palmpay.custom_view.dialog.BasePopupWindow;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.g;
import p025ba.k;
import p052da.A;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends BasePopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f6293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p279s5.d f6294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6296d;

    public d(Context context, p279s5.d builder) {
        String str;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f6295c = new ArrayList();
        this.mContext = context;
        this.f6294b = builder;
        View viewInflate = LayoutInflater.from(context).inflate(g.core_choose_multi_item_pop_window, (ViewGroup) null, false);
        this.mContentView = viewInflate;
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-2);
        setFocusable(true);
        ArrayList arrayList = new ArrayList();
        this.f6296d = arrayList;
        arrayList.add(this.mContext.getResources().getString(k.core_quick_filter_title));
        ArrayList arrayList2 = this.f6296d;
        if (arrayList2 != null) {
            arrayList2.add(this.mContext.getResources().getString(k.core_bill_category_title));
        }
        ArrayList arrayList3 = this.f6296d;
        if (arrayList3 != null) {
            arrayList3.add(this.mContext.getResources().getString(k.core_other_title));
        }
        ArrayList arrayList4 = new ArrayList();
        String[] strArr = {"All", TransType.BILL_TYPE_TRANSFER, "01", TransType.BILL_TYPE_REFUND, TransType.TRANS_TYPE_INTERBANK_CASH_IN, "02", TransType.BILL_TYPE_DEBIT_CARD};
        for (int i7 = 0; i7 < 7; i7++) {
            BillType billType = new BillType();
            String strTranslateTransType = "All";
            if ("All".equals(strArr[i7])) {
                str = "All";
            } else {
                str = strArr[i7];
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            }
            billType.type = str;
            if (!"All".equals(strArr[i7])) {
                strTranslateTransType = TransTypeUtils.translateTransType(billType.type);
            }
            billType.typeName = strTranslateTransType;
            arrayList4.add(billType);
        }
        this.f6295c.add(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        String[] strArr2 = {"04", TransType.TRANS_TYPE_BUNDLE, TransType.TRANS_TYPE_BILLER_BETTING, "17", "16", "15", "29", TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE, TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS, TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_TRANSPORT, TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS, TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS, TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS, TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS, TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS, TransType.TRANS_TYPE_BILLER_RELIGIOUS, TransType.TRANS_TYPE_BILLER_EDUCATION, TransType.TRANS_TYPE_AGENT_COMMISSION};
        for (int i10 = 0; i10 < 22; i10++) {
            BillType billType2 = new BillType();
            String str2 = strArr2[i10];
            billType2.type = str2;
            billType2.typeName = TransTypeUtils.translateTransType(str2);
            arrayList5.add(billType2);
        }
        this.f6295c.add(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        String[] strArr3 = {TransType.BILL_TYPE_CASHBOX, TransType.TRANS_TYPE_OPERATING, TransType.TRANS_TYPE_P2P_CASH_IN, TransType.TRANS_TYPE_P2P_CASH_OUT, TransType.BILL_TYPE_COMBINE_MERCHANT, TransType.TRANS_TYPE_COMMISSION, TransType.TRANS_TYPE_AUTO_DEDUCT, TransType.BILL_TYPE_REPAY_LOAN, TransType.BILL_TYPE_LUCKY_MONEY, TransType.BILL_TYPE_DISBURSEMENT, TransType.TRANS_TYPE_GROUP_BUY, TransType.TRANS_TYPE_PALMBUY, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE, TransType.TRANS_TYPE_FIXED_SAVING, TransType.TRANS_TYPE_FIXED_SAVING_PAID, TransType.BILL_TYPE_QRCODE_PAYMENT};
        for (int i11 = 0; i11 < 18; i11++) {
            BillType billType3 = new BillType();
            String str3 = strArr3[i11];
            billType3.type = str3;
            billType3.typeName = TransTypeUtils.translateTransType(str3);
            arrayList6.add(billType3);
        }
        this.f6295c.add(arrayList6);
        initViews();
    }

    public static void a(d dVar) {
        super.dismiss();
    }

    public static void b(d dVar, A a3, BillType billType) {
        e eVar;
        p279s5.d dVar2 = dVar.f6294b;
        if (dVar2 != null) {
            String type = billType.type;
            Intrinsics.checkNotNullExpressionValue(type, "type");
            Intrinsics.checkNotNullParameter(type, "<set-?>");
            dVar2.f42026c = type;
        }
        a3.f35671e = billType.type;
        a3.notifyDataSetChanged();
        dVar.initViews();
        p279s5.d dVar3 = dVar.f6294b;
        if (dVar3 != null && (eVar = (e) dVar3.f42025b) != null) {
            eVar.onItemSelect(billType);
        }
        super.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void initViews() {
        LinearLayout linearLayout = (LinearLayout) this.mContentView.findViewById(p025ba.e.ll_all_container);
        linearLayout.removeAllViews();
        ArrayList arrayList = this.f6295c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = null;
            View viewInflate = View.inflate(this.mContext, g.core_item_list_module, null);
            TextView textView = (TextView) viewInflate.findViewById(p025ba.e.tv_title);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(p025ba.e.rcv_choose_list);
            ArrayList arrayList2 = this.f6296d;
            if (arrayList2 != null) {
                str = (String) arrayList2.get(i7);
            }
            textView.setText(str);
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            recyclerView.setLayoutManager(new FlowLayoutManager(mContext));
            A a3 = new A(this.mContext);
            recyclerView.setAdapter(a3);
            a3.f4985b = (List) arrayList.get(i7);
            p279s5.d dVar = this.f6294b;
            Intrinsics.e(dVar);
            a3.f35671e = (String) dVar.f42026c;
            recyclerView.addItemDecoration(new c());
            a3.f4986c = new c0(26, this, a3);
            linearLayout.addView(viewInflate);
        }
        this.mContentView.setOnClickListener(new l(this, 27));
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        FrameLayout frameLayout = this.f6293a;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                FrameLayout frameLayout2 = this.f6293a;
                Intrinsics.e(frameLayout2);
                View childAt = frameLayout2.getChildAt(i7);
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView != null) {
                    textView.setSelected(true);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void init() {
    }
}
