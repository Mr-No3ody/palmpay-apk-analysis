package com.transsnet.palmpay.main.export.ui.view;

import C9.V;
import L6.b;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f31998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelNewCustomerSavings.OnInvestBtnClickListener f31999b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f31998a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        String strValueOf;
        Ec.a holder = (Ec.a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f31998a;
        SavingProduct savingProduct = list != null ? (SavingProduct) list.get(i7) : null;
        holder.itemView.setOnClickListener(new V(holder, 9, savingProduct, false));
        RoundedTextView roundedTextView = holder.f2304f;
        if (savingProduct != null) {
            holder.f2299a.setText(savingProduct.getIntroduction());
            r0.h1(holder.f2300b, savingProduct.getProductIcon(), r.cv_fixed_saving);
            holder.f2301c.setText(r0.z0(r0.w1(String.valueOf(savingProduct.getAnnualizedIncomeRatio()), "100").toPlainString()));
            if (savingProduct.getDurationDay() != savingProduct.getMaxDurationDay()) {
                strValueOf = savingProduct.getDurationDay() + "-" + savingProduct.getMaxDurationDay();
            } else {
                strValueOf = String.valueOf(savingProduct.getDurationDay());
            }
            holder.f2302d.setText(strValueOf);
            holder.f2303e.setText(savingProduct.getDurationDay() > 1 ? "Days" : "Day");
            roundedTextView.setTextColor((savingProduct.getProductStatus() == 7 || savingProduct.getProductStatus() == 1) ? roundedTextView.getContext().getColor(p.cv_color_ffffff) : roundedTextView.getContext().getColor(b.ppColorTextPrimary));
            roundedTextView.setRoundedBackgroundColor((savingProduct.getProductStatus() == 7 || savingProduct.getProductStatus() == 1) ? roundedTextView.getContext().getColor(p.cv_color_dcdde0) : roundedTextView.getContext().getColor(b.ppColorFlexiCashAssist));
        }
        roundedTextView.setOnClickListener(new Ad.V(this, i7, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(t.cv_layout_new_customer_savings_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Ec.a aVar = new Ec.a(itemView);
        View viewFindViewById = itemView.findViewById(s.tvIntroduction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        aVar.f2299a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(s.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        aVar.f2300b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(s.tvInterestAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        aVar.f2301c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(s.tvDurationNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        aVar.f2302d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(s.tvDurationDay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        aVar.f2303e = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(s.rtvInvest);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        aVar.f2304f = (RoundedTextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(s.layoutBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        return aVar;
    }
}
