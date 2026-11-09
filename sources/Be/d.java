package Be;

import Ac.e;
import Pa.r0;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardPrizeItem;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends M1.b {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String string;
        HomeRewardPrizeItem item = (HomeRewardPrizeItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.endTime <= 0) {
            string = "No validity period";
        } else {
            string = holder.itemView.getContext().getString(k.core_valid_until, r0.S(item.endTime));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        holder.setText(e.tvLine2, string);
        View view = holder.getView(e.btnAction);
        int i7 = item.prizeStatus;
        h.s(view, i7 == 1 || i7 == 0);
        h.s(holder.getView(e.tvFailed), item.prizeStatus == 2);
        h.s(holder.getView(e.tvPending), false);
        holder.setText(e.tvLine1, item.itemName);
        int i10 = item.itemType;
        if (i10 != 1) {
            if (i10 == 2) {
                ((ImageView) holder.getView(e.ivBg)).setImageResource(Ac.d.main_reward_bg_coupon);
                TextView textView = (TextView) holder.getView(e.tvAmount);
                long j6 = item.nominalValue;
                r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
                textView.setText(r0.M(12, 28, j6));
                ((PpButton) holder.getView(e.btnAction)).setText(CommonViewExtKt.string(k.core_use, holder.itemView.getContext()));
                return;
            }
            if (i10 == 3) {
                ((ImageView) holder.getView(e.ivBg)).setImageResource(Ac.d.main_reward_bg_points);
                TextView textView2 = (TextView) holder.getView(e.tvAmount);
                textView2.setText(String.valueOf(item.nominalValue));
                r0.R1(textView2, "fonts/PalmPayNum-Bold.ttf");
                ((PpButton) holder.getView(e.btnAction)).setText(CommonViewExtKt.string(k.core_view, holder.itemView.getContext()));
                return;
            }
            if (i10 != 100) {
                return;
            }
        }
        if (i10 == 1) {
            h.s(holder.getView(e.tvPending), item.prizeStatus == 4);
            ((ImageView) holder.getView(e.ivBg)).setImageResource(Ac.d.main_reward_bg_cash);
            ((PpButton) holder.getView(e.btnAction)).setText(CommonViewExtKt.string(k.core_view, holder.itemView.getContext()));
        } else {
            ((ImageView) holder.getView(e.ivBg)).setImageResource(Ac.d.main_reward_bg_trialcash);
            ((PpButton) holder.getView(e.btnAction)).setText(CommonViewExtKt.string(k.core_use, holder.itemView.getContext()));
        }
        TextView textView3 = (TextView) holder.getView(e.tvAmount);
        long j10 = item.nominalValue;
        r0.R1(textView3, "fonts/PalmPayNum-Bold.ttf");
        textView3.setText(r0.M(12, 28, j10));
    }
}
