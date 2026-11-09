package p385ze;

import Ac.e;
import Ac.f;
import M1.j;
import Pa.r0;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.main.export.bean.rsp.HotProductBean;
import kotlin.jvm.internal.Intrinsics;
import p327vd.c;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends j {
    public d(int i7) {
        super(i7 == 1 ? f.main_saving_fixed_item_exclusive : f.main_saving_fixed_item_product, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String strValueOf;
        HotProductBean item = (HotProductBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tvInterestAmount, r0.z0(r0.w1(String.valueOf(item.annualizedIncomeRatio), "100").toPlainString()));
        int i7 = e.tvDurationNum;
        long j6 = item.durationDay;
        int i10 = (int) j6;
        int i11 = item.maxDurationDay;
        if (i10 == i11) {
            strValueOf = String.valueOf(j6);
        } else {
            strValueOf = j6 + "-" + i11;
        }
        holder.setText(i7, strValueOf);
        holder.setText(e.tvDurationDay, item.durationDay > 1 ? "Days" : "Day");
        RoundedTextView roundedTextView = (RoundedTextView) holder.getView(e.rtvInvest);
        if (roundedTextView != null) {
            roundedTextView.setOnClickListener(new c(item, 26));
        }
        r0.R1((TextView) holder.getView(e.tvInterestAmount), "fonts/PalmPayNum-Bold.ttf");
    }
}
