package Xd;

import Pa.r0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BaseDataBundleItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemTipsBean;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends M1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11175b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p010a9.m f11177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DataBundleWalletAdapter$OnDataBundleItemClickListener f11178e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f11180g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11176c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11179f = new ArrayList();

    static {
        new s(null);
    }

    public v(boolean z3) {
        this.f11175b = z3;
        a(new t(this, new q(this, 0)));
        a(new u(this, new q(this, 1)));
    }

    public static final void d(v vVar, BaseViewHolder baseViewHolder, DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean) {
        vVar.getClass();
        int i7 = Pd.c.data_bundle_size_tv;
        String volume = dataBundleWalletItemChildBean.getVolume();
        if (volume == null) {
            volume = "";
        }
        String volumeUnit = dataBundleWalletItemChildBean.getVolumeUnit();
        if (volumeUnit == null) {
            volumeUnit = "";
        }
        baseViewHolder.setText(i7, volume.concat(volumeUnit));
        AppCompatTextView appCompatTextView = (AppCompatTextView) baseViewHolder.getView(Pd.c.amount_tv);
        String strB = r0.B(dataBundleWalletItemChildBean.getPrice(), true);
        Intrinsics.checkNotNullExpressionValue(strB, "getAmountStringWithCurrency(...)");
        appCompatTextView.setText(kotlin.text.y.k(strB, ".00", ""));
        int i10 = Pd.c.data_bundle_date_tv;
        String validity = dataBundleWalletItemChildBean.getValidity();
        baseViewHolder.setText(i10, validity != null ? validity : "");
        String remark = dataBundleWalletItemChildBean.getRemark();
        if (remark == null || remark.length() == 0) {
            baseViewHolder.setVisible(Pd.c.set_meal_promotion_tv, false);
        } else {
            baseViewHolder.setGone(Pd.c.set_meal_promotion_tv, false).setText(Pd.c.set_meal_promotion_tv, dataBundleWalletItemChildBean.getRemark()).setTextColor(Pd.c.set_meal_promotion_tv, CommonViewExtKt.colorInt(L6.b.ppColorWarning, vVar.getContext()));
        }
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.f11176c == 0 ? 1 : 2;
    }

    public final void e() {
        DataBundleWalletItemTipsBean dataBundleWalletItemTipsBean;
        String remark;
        Object next;
        for (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean : this.f11179f) {
            List list = this.f11180g;
            Long deductionAmount = null;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.c(((DataBundleWalletItemTipsBean) next).getPaymentItemId(), dataBundleWalletItemChildBean.getItemId()));
                dataBundleWalletItemTipsBean = (DataBundleWalletItemTipsBean) next;
            } else {
                dataBundleWalletItemTipsBean = null;
            }
            if (dataBundleWalletItemTipsBean == null || (remark = dataBundleWalletItemTipsBean.getRemark()) == null) {
                remark = "";
            }
            dataBundleWalletItemChildBean.setRemark(remark);
            if (dataBundleWalletItemTipsBean != null) {
                deductionAmount = dataBundleWalletItemTipsBean.getDeductionAmount();
            }
            dataBundleWalletItemChildBean.setDeductionAmount(deductionAmount);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    public final void f(List items, List list) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f11180g = list;
        ArrayList arrayList = this.f11179f;
        arrayList.clear();
        arrayList.addAll(items);
        e();
        ?? arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) it.next());
        }
        boolean z3 = this.f11175b && arrayList2.size() > 6;
        if (z3) {
            arrayList2 = CollectionsKt.U(arrayList2, 6);
        }
        setList((Collection) arrayList2);
        p010a9.m mVar = this.f11177d;
        if (mVar != null) {
            mVar.invoke(Boolean.valueOf(z3));
        }
    }

    public final void g(List list) {
        if (Intrinsics.c(this.f11180g, list)) {
            return;
        }
        this.f11180g = list;
        e();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : getData()) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            if (((BaseDataBundleItemBean) obj) instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) {
                arrayList.add(Integer.valueOf(i7));
            }
            i7 = i10;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int iIntValue = ((Number) CollectionsKt.F(arrayList)).intValue();
        int size = arrayList.size();
        int i11 = iIntValue;
        int i12 = 1;
        while (i12 < size) {
            int iIntValue2 = ((Number) arrayList.get(i12)).intValue();
            if (iIntValue2 != i11 + 1) {
                notifyItemRangeChanged(iIntValue, (i11 - iIntValue) + 1);
                iIntValue = iIntValue2;
            }
            i12++;
            i11 = iIntValue2;
        }
        notifyItemRangeChanged(iIntValue, (i11 - iIntValue) + 1);
    }

    @Override // M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemAnimator(null);
    }
}
