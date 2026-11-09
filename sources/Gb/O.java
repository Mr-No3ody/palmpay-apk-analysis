package Gb;

import Hb.C0302d;
import Hb.C0307i;
import Hb.C0309k;
import Pa.n0;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends M1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductContentListView f3254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProductContentListAdapter$OnApplyClickListener f3255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N f3244d = new N(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f3245e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3246f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f3247g = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f3248i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f3249j = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3250o = 6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3251p = 12;
    public static final int t = 7;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f3252v = 11;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f3253w = 9;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f3243A = 10;

    public O(ProductContentListView productContentListView) {
        Intrinsics.checkNotNullParameter(productContentListView, "productContentListView");
        this.f3254b = productContentListView;
        a(new C0309k());
        a(new C0307i());
        a(new Hb.K());
        Hb.r rVar = new Hb.r();
        rVar.f3847e = true;
        a(rVar);
        Hb.H h7 = new Hb.H();
        h7.f3803e = true;
        a(h7);
        a(new Hb.t());
        a(new C0302d());
        a(new Hb.E());
        a(new Hb.x());
        a(new Hb.z());
        a(new Hb.P());
        a(new Hb.S());
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String str = ((ProductContentInfo) data.get(i7)).style;
        String str2 = ((ProductContentInfo) data.get(i7)).loanProduct;
        try {
            if (TextUtils.equals(str, "normal")) {
                F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + str2 + " ITEM_VIEW_TYPE_LOAN_PRODUCT");
                return f3253w;
            }
            if (TextUtils.equals(str, "simple_single_line")) {
                F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + str2 + " ITEM_VIEW_TYPE_SIMPLE_LOAN_PRODUCT");
                return f3243A;
            }
            if (!TextUtils.equals(str, "simple") && !TextUtils.equals(str, "simpleWithButton") && !TextUtils.equals(str, "simpleWithFrozen")) {
                if (!TextUtils.equals(str, "buttonOnBottom") && !TextUtils.equals(str, "buttonOnBottomWithFrozen") && !TextUtils.equals(str, "expanded")) {
                    if (TextUtils.equals(str, "buttonOnBottomV2")) {
                        F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_INSTALLMENT_LOAN_V2");
                        return f3250o;
                    }
                    if (TextUtils.equals(str, "buttonOnBottomV3")) {
                        F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_INSTALLMENT_LOAN_V3");
                        return f3251p;
                    }
                    if (!TextUtils.equals(str, "extraWithButtonV2") && !TextUtils.equals(str, "extraWithAppointedDayV2")) {
                        if (!TextUtils.equals(str, "extraWithButtonV3") && !TextUtils.equals(str, "extraWithAppointedDayV3")) {
                            if (!TextUtils.equals(str, "buttonOnRight") && !TextUtils.equals(str, "buttonOnRightWithFrozen")) {
                                if (!TextUtils.equals(str, "buttonOnRightWithApply") && !TextUtils.equals(str, "buttonOnBottomWithApply") && !TextUtils.equals(str, "titleWithProcessing") && !TextUtils.equals(str, "titleWithDeclined")) {
                                    if (TextUtils.equals(str, "buttonOnRightWithInfo")) {
                                        F6.d.h("getItemType", 3, "curStyle=" + str + " ITEM_VIEW_TYPE_BUSINESS_LOAN_UNCREDIT");
                                        return f3249j;
                                    }
                                    F6.d.h("getItemType", 3, C0.G.q("curStyle=", str, " product=", ((ProductContentInfo) data.get(i7)).loanProduct, " ITEM_VIEW_TYPE_CASH_LOAN"));
                                    return f3245e;
                                }
                                F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_INSTALLMENT_LOAN_UNCREDIT");
                                return f3248i;
                            }
                            F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_MULTIPLE_CASH_LOAN");
                            return f3246f;
                        }
                        F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_INSTALLMENT_LOAN_UNCREDIT_V3");
                        return f3252v;
                    }
                    F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_INSTALLMENT_LOAN_UNCREDIT_V2");
                    return t;
                }
                F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_INSTALLMENT_LOAN");
                return f3247g;
            }
            F6.d.h("getItemType", 3, "curStyle=" + str + " product=" + ((ProductContentInfo) data.get(i7)).loanProduct + " ITEM_VIEW_TYPE_FLEXI");
            return 0;
        } catch (Exception e10) {
            F6.d.c("getItemType", e10);
        }
    }

    @Override // M1.d, M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(BaseViewHolder holder) {
        Context baseContext;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        ProductContentInfo item = (ProductContentInfo) getItem(bindingAdapterPosition);
        Set set = Eb.b.f2269a;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String providerTag = "vt_" + holder.getItemViewType();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(providerTag, "providerTag");
        Integer num = item.accountType;
        if (num != null && num.intValue() == 14) {
            ViewEvent viewEventAdd = new ViewEvent("BusinessLoanShow").add("loanProduct", item.loanProduct);
            Intrinsics.checkNotNullExpressionValue(viewEventAdd, "add(...)");
            n0.g().u(viewEventAdd);
            return;
        }
        Integer num2 = item.accountType;
        String str = item.loanProduct;
        String dedupeKey = providerTag + "_" + str + "_" + num2 + "_" + bindingAdapterPosition;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dedupeKey, "dedupeKey");
        if (!Eb.b.c(num2, str)) {
            F6.d.h("LoanHomeTrack", 3, "card show skip §2.1 product=" + str + " accountType=" + num2 + " key=" + dedupeKey);
            return;
        }
        if (!Eb.b.f2269a.add(dedupeKey)) {
            F6.d.h("LoanHomeTrack", 3, C0.G.o("card show skip dedupe key=", dedupeKey));
            return;
        }
        Boolean bool = p118hf.a.f37382e;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Intrinsics.checkNotNullParameter(context, "context");
            while (true) {
                baseContext = null;
                if (context == null) {
                    break;
                }
                if (context instanceof LoanHomeActivity) {
                    baseContext = (LoanHomeActivity) context;
                    break;
                }
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
                context = baseContext;
            }
            zBooleanValue = baseContext != null ? true : ActivityUtils.getTopActivity() instanceof LoanHomeActivity;
        }
        String str2 = zBooleanValue ? "PersonalLoanShow" : "Old_Personal_Loan_Show";
        ViewEvent viewEvent = new ViewEvent(str2);
        if (str != null) {
            viewEvent.add("loanProduct", str);
        }
        if (num2 != null) {
            viewEvent.add("accountType", String.valueOf(num2.intValue()));
        }
        for (Map.Entry entry : Eb.b.a().entrySet()) {
            viewEvent.add((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder sbF = androidx.camera.camera2.internal.F.f("card show fire ", str2, " product=", str, " accountType=");
        sbF.append(num2);
        sbF.append(" onNew=");
        sbF.append(zBooleanValue);
        F6.d.h("LoanHomeTrack", 3, sbF.toString());
        n0.g().u(viewEvent);
    }
}
