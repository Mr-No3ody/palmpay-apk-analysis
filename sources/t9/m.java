package t9;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.betting.bean.BettingSportItem;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BettingSportItem item = (BettingSportItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = Pd.c.tvBookingCode;
        String bookingCode = item.getBookingCode();
        if (bookingCode == null) {
            bookingCode = "";
        }
        holder.setText(i7, bookingCode);
        SpanUtils spanUtilsAppend = new SpanUtils().append("Folds: ");
        String count = item.getCount();
        if (count == null) {
            count = "--";
        }
        holder.setText(Pd.c.tvFolds, spanUtilsAppend.append(" ".concat(count)).setFontFamily("sans-serif-medium").setFontSize(14, true).create());
        SpanUtils spanUtilsAppend2 = new SpanUtils().append("Odds: ");
        String odds = item.getOdds();
        holder.setText(Pd.c.tvOdds, spanUtilsAppend2.append(" ".concat(odds != null ? odds : "--")).setFontSize(14, true).setFontFamily("sans-serif-medium").create());
        Double reward = item.getReward();
        if ((reward != null ? reward.doubleValue() : 0.0d) <= 0.0d) {
            holder.setGone(Pd.c.ivReward, true);
            holder.setGone(Pd.c.tvReward, true);
            return;
        }
        holder.setGone(Pd.c.ivReward, false);
        holder.setGone(Pd.c.tvReward, false);
        int i10 = Pd.c.tvReward;
        Double reward2 = item.getReward();
        holder.setText(i10, ((reward2 != null ? reward2.doubleValue() : 0.0d) * ((double) 100)) + "%");
    }
}
