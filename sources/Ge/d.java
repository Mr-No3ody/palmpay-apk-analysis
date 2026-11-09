package Ge;

import Ad.c0;
import He.x;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.core.ui.widget.FlowLayoutManager;
import com.transsnet.palmpay.custom_view.dialog.BasePopupWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p052da.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends BasePopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f3386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionFilterResp f3387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f3388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f3390e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3391f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f3392g = new ArrayList();

    public d(Context context, top.zibin.luban.io.a aVar) {
        ArrayList<TransactionFilterResp.FilterBean> conditions;
        ArrayList<TransactionFilterResp.FilterBean> conditions2;
        ArrayList<TransactionFilterResp.FilterBean> childTypeParam;
        ArrayList<TransactionFilterResp.FilterBean> childTypeParam2;
        this.f3389d = new HashMap();
        this.mContext = context;
        ViewGroup viewGroup = null;
        int i7 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(Ac.f.main_choose_multi_item_pop_window_v2, (ViewGroup) null, false);
        this.mContentView = viewInflate;
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-2);
        boolean z3 = true;
        setFocusable(true);
        this.f3388c = (x) aVar.f42645b;
        this.f3389d = (HashMap) aVar.f42647d;
        TransactionFilterResp transactionFilterResp = (TransactionFilterResp) aVar.f42646c;
        this.f3387b = transactionFilterResp;
        if (transactionFilterResp != null) {
            ArrayList<TransactionFilterResp.FilterBean> conditions3 = transactionFilterResp.getConditions();
            if (conditions3 != null) {
                for (TransactionFilterResp.FilterBean filterBean : conditions3) {
                    ArrayList arrayList = (ArrayList) this.f3389d.get(filterBean.getName());
                    if (arrayList != null && !arrayList.isEmpty() && (childTypeParam2 = filterBean.getChildTypeParam()) != null) {
                        for (TransactionFilterResp.FilterBean filterBean2 : childTypeParam2) {
                            filterBean2.setSelected(CollectionsKt.A(arrayList, filterBean2.getCode()));
                        }
                    }
                }
            }
            TransactionFilterResp.PaymentTypeBean paymentType = transactionFilterResp.getPaymentType();
            if (paymentType != null && (conditions2 = paymentType.getConditions()) != null) {
                for (TransactionFilterResp.FilterBean filterBean3 : conditions2) {
                    HashMap map = this.f3389d;
                    if (map != null && !map.isEmpty() && (childTypeParam = filterBean3.getChildTypeParam()) != null) {
                        for (TransactionFilterResp.FilterBean filterBean4 : childTypeParam) {
                            filterBean4.setSelected(this.f3389d.containsKey(filterBean4.getName()));
                        }
                    }
                }
            }
            ArrayList<TransactionFilterResp.FilterBean> conditions4 = transactionFilterResp.getConditions();
            LinearLayout linearLayout = (LinearLayout) this.mContentView.findViewById(Ac.e.llTopFilter);
            if (conditions4 != null && !conditions4.isEmpty()) {
                int size = conditions4.size();
                int i10 = 0;
                while (i10 < size) {
                    View viewInflate2 = View.inflate(this.mContext, Ac.f.main_item_top_filter_module, viewGroup);
                    TransactionFilterResp.FilterBean filterBean5 = conditions4.get(i10);
                    ArrayList<TransactionFilterResp.FilterBean> childTypeParam3 = filterBean5.getChildTypeParam();
                    if (!TextUtils.isEmpty(filterBean5.getName()) && childTypeParam3 != null && (childTypeParam3.isEmpty() ^ z3) == z3) {
                        String name = filterBean5.getName();
                        Intrinsics.e(name);
                        this.f3390e.put(name, childTypeParam3);
                        ArrayList arrayList2 = (ArrayList) this.f3389d.get(filterBean5.getName());
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int size2 = childTypeParam3.size();
                            while (i7 < size2) {
                                TransactionFilterResp.FilterBean filterBean6 = childTypeParam3.get(i7);
                                Intrinsics.checkNotNullExpressionValue(filterBean6, "get(...)");
                                TransactionFilterResp.FilterBean filterBean7 = filterBean6;
                                if (CollectionsKt.A(arrayList2, filterBean7.getCode())) {
                                    filterBean7.setSelected(true);
                                }
                                i7++;
                            }
                        }
                    }
                    ((TextView) viewInflate2.findViewById(Ac.e.tvTitle)).setText(filterBean5.getName());
                    RecyclerView recyclerView = (RecyclerView) viewInflate2.findViewById(Ac.e.rvTopFilterList);
                    recyclerView.setHasFixedSize(true);
                    Context mContext = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    recyclerView.setLayoutManager(new FlowLayoutManager(mContext));
                    b0 b0Var = new b0();
                    recyclerView.setAdapter(b0Var);
                    recyclerView.addItemDecoration(new c());
                    b0Var.setOnItemClickListener(new Dg.a(b0Var, 17));
                    b0Var.setList(filterBean5.getChildTypeParam());
                    linearLayout.addView(viewInflate2);
                    i10++;
                    z3 = true;
                    viewGroup = null;
                    i7 = 0;
                }
            }
            TransactionFilterResp.PaymentTypeBean paymentType2 = transactionFilterResp.getPaymentType();
            LinearLayout linearLayout2 = (LinearLayout) this.mContentView.findViewById(Ac.e.llPaymentType);
            TextView textView = (TextView) this.mContentView.findViewById(Ac.e.tvPaymentTypeTitle);
            if (paymentType2 != null && (conditions = paymentType2.getConditions()) != null && !conditions.isEmpty()) {
                textView.setText(TextUtils.isEmpty(paymentType2.getName()) ? "Payment Type" : paymentType2.getName());
                ArrayList<TransactionFilterResp.FilterBean> conditions5 = paymentType2.getConditions();
                if (conditions5 != null && !conditions5.isEmpty()) {
                    ArrayList<TransactionFilterResp.FilterBean> conditions6 = paymentType2.getConditions();
                    conditions6 = conditions6 == null ? new ArrayList<>() : conditions6;
                    int size3 = conditions6.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        View viewInflate3 = View.inflate(this.mContext, Ac.f.main_item_payment_type_filter_module, null);
                        TransactionFilterResp.FilterBean filterBean8 = conditions6.get(i11);
                        Intrinsics.checkNotNullExpressionValue(filterBean8, "get(...)");
                        TransactionFilterResp.FilterBean filterBean9 = filterBean8;
                        ArrayList<TransactionFilterResp.FilterBean> childTypeParam4 = filterBean9.getChildTypeParam();
                        if (!TextUtils.isEmpty(filterBean9.getName()) && childTypeParam4 != null && (!childTypeParam4.isEmpty())) {
                            String name2 = filterBean9.getName();
                            Intrinsics.e(name2);
                            this.f3391f.put(name2, childTypeParam4);
                            ArrayList arrayList3 = (ArrayList) this.f3389d.get(filterBean9.getName());
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                int size4 = childTypeParam4.size();
                                for (int i12 = 0; i12 < size4; i12++) {
                                    TransactionFilterResp.FilterBean filterBean10 = childTypeParam4.get(i12);
                                    Intrinsics.checkNotNullExpressionValue(filterBean10, "get(...)");
                                    TransactionFilterResp.FilterBean filterBean11 = filterBean10;
                                    if (CollectionsKt.A(arrayList3, filterBean11.getCode())) {
                                        filterBean11.setSelected(true);
                                    }
                                }
                            }
                        }
                        ((TextView) viewInflate3.findViewById(Ac.e.tvTitle)).setText(filterBean9.getName());
                        RecyclerView recyclerView2 = (RecyclerView) viewInflate3.findViewById(Ac.e.rvPaymentFilterList);
                        recyclerView2.setHasFixedSize(true);
                        Context mContext2 = this.mContext;
                        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                        recyclerView2.setLayoutManager(new FlowLayoutManager(mContext2));
                        b0 b0Var2 = new b0();
                        recyclerView2.setAdapter(b0Var2);
                        recyclerView2.addItemDecoration(new b());
                        b0Var2.setOnItemClickListener(new c0(20, b0Var2, this));
                        b0Var2.setList(filterBean9.getChildTypeParam());
                        this.f3392g.add(b0Var2);
                        linearLayout2.addView(viewInflate3);
                    }
                }
            }
        }
        TextView textView2 = (TextView) this.mContentView.findViewById(Ac.e.tvCancel);
        if (textView2 != null) {
            final int i13 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: Ge.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f3385b;

                {
                    this.f3385b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f3385b.dismiss();
                            break;
                        default:
                            HashMap map2 = new HashMap();
                            d dVar = this.f3385b;
                            for (Map.Entry entry : dVar.f3390e.entrySet()) {
                                String str = (String) entry.getKey();
                                ArrayList arrayList4 = (ArrayList) entry.getValue();
                                ArrayList<TransactionFilterResp.FilterBean> arrayList5 = new ArrayList();
                                for (Object obj : arrayList4) {
                                    if (((TransactionFilterResp.FilterBean) obj).getIsSelected()) {
                                        arrayList5.add(obj);
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    for (TransactionFilterResp.FilterBean filterBean12 : arrayList5) {
                                        Object arrayList6 = map2.get(str);
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                            map2.put(str, arrayList6);
                                        }
                                        ArrayList arrayList7 = (ArrayList) arrayList6;
                                        arrayList7.clear();
                                        String code = filterBean12.getCode();
                                        if (code == null) {
                                            code = "";
                                        }
                                        arrayList7.add(code);
                                    }
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (Map.Entry entry2 : dVar.f3391f.entrySet()) {
                                ArrayList arrayList9 = (ArrayList) entry2.getValue();
                                ArrayList<TransactionFilterResp.FilterBean> arrayList10 = new ArrayList();
                                for (Object obj2 : arrayList9) {
                                    if (((TransactionFilterResp.FilterBean) obj2).getIsSelected()) {
                                        arrayList10.add(obj2);
                                    }
                                }
                                if (!arrayList10.isEmpty()) {
                                    for (TransactionFilterResp.FilterBean filterBean13 : arrayList10) {
                                        String name3 = filterBean13.getName();
                                        if (name3 == null) {
                                            name3 = "";
                                        }
                                        Object arrayList11 = map2.get(name3);
                                        if (arrayList11 == null) {
                                            arrayList11 = new ArrayList();
                                            map2.put(name3, arrayList11);
                                        }
                                        ArrayList arrayList12 = (ArrayList) arrayList11;
                                        String code2 = filterBean13.getCode();
                                        if (code2 == null) {
                                            code2 = "";
                                        }
                                        arrayList12.add(code2);
                                        String name4 = filterBean13.getName();
                                        if (name4 == null) {
                                            name4 = "";
                                        }
                                        arrayList8.add(name4);
                                    }
                                }
                            }
                            x xVar = dVar.f3388c;
                            if (xVar != null) {
                                xVar.onItemSelect(map2, arrayList8);
                            }
                            dVar.dismiss();
                            break;
                    }
                }
            });
        }
        TextView textView3 = (TextView) this.mContentView.findViewById(Ac.e.tvConfirm);
        if (textView3 != null) {
            final int i14 = 1;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: Ge.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f3385b;

                {
                    this.f3385b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.f3385b.dismiss();
                            break;
                        default:
                            HashMap map2 = new HashMap();
                            d dVar = this.f3385b;
                            for (Map.Entry entry : dVar.f3390e.entrySet()) {
                                String str = (String) entry.getKey();
                                ArrayList arrayList4 = (ArrayList) entry.getValue();
                                ArrayList<TransactionFilterResp.FilterBean> arrayList5 = new ArrayList();
                                for (Object obj : arrayList4) {
                                    if (((TransactionFilterResp.FilterBean) obj).getIsSelected()) {
                                        arrayList5.add(obj);
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    for (TransactionFilterResp.FilterBean filterBean12 : arrayList5) {
                                        Object arrayList6 = map2.get(str);
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                            map2.put(str, arrayList6);
                                        }
                                        ArrayList arrayList7 = (ArrayList) arrayList6;
                                        arrayList7.clear();
                                        String code = filterBean12.getCode();
                                        if (code == null) {
                                            code = "";
                                        }
                                        arrayList7.add(code);
                                    }
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (Map.Entry entry2 : dVar.f3391f.entrySet()) {
                                ArrayList arrayList9 = (ArrayList) entry2.getValue();
                                ArrayList<TransactionFilterResp.FilterBean> arrayList10 = new ArrayList();
                                for (Object obj2 : arrayList9) {
                                    if (((TransactionFilterResp.FilterBean) obj2).getIsSelected()) {
                                        arrayList10.add(obj2);
                                    }
                                }
                                if (!arrayList10.isEmpty()) {
                                    for (TransactionFilterResp.FilterBean filterBean13 : arrayList10) {
                                        String name3 = filterBean13.getName();
                                        if (name3 == null) {
                                            name3 = "";
                                        }
                                        Object arrayList11 = map2.get(name3);
                                        if (arrayList11 == null) {
                                            arrayList11 = new ArrayList();
                                            map2.put(name3, arrayList11);
                                        }
                                        ArrayList arrayList12 = (ArrayList) arrayList11;
                                        String code2 = filterBean13.getCode();
                                        if (code2 == null) {
                                            code2 = "";
                                        }
                                        arrayList12.add(code2);
                                        String name4 = filterBean13.getName();
                                        if (name4 == null) {
                                            name4 = "";
                                        }
                                        arrayList8.add(name4);
                                    }
                                }
                            }
                            x xVar = dVar.f3388c;
                            if (xVar != null) {
                                xVar.onItemSelect(map2, arrayList8);
                            }
                            dVar.dismiss();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        FrameLayout frameLayout = this.f3386a;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                FrameLayout frameLayout2 = this.f3386a;
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

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void initViews() {
    }
}
