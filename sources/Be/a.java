package Be;

import Ac.e;
import C0.G;
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
public final class a extends M1.b {
    public static void b(TextView textView, long j6) {
        r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
        textView.setText(r0.M(20, 20, j6));
    }

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
        PpButton ppButton = (PpButton) holder.getView(e.btnAction);
        ImageView imageView = (ImageView) holder.getView(e.ivBg);
        View view = holder.getView(e.btnAction);
        int i7 = item.prizeStatus;
        h.s(view, i7 == 1 || i7 == 0);
        h.s(holder.getView(e.tvFailed), item.prizeStatus == 2);
        h.s(holder.getView(e.tvPending), false);
        holder.setText(e.tvLine1, item.itemName);
        int i10 = item.itemType;
        if (i10 != 1) {
            if (i10 == 2) {
                imageView.setImageResource(Ac.d.main_reward_bg_coupon);
                b((TextView) holder.getView(e.tvAmount), item.nominalValue);
                ppButton.setText(CommonViewExtKt.string(k.core_use, holder.itemView.getContext()));
                h.C(ppButton);
                TextView textView = (TextView) holder.getView(e.tvLine2);
                long j6 = item.limitAmt;
                textView.setText(j6 > 0 ? G.o("Purchase ≥ ", r0.B(j6, false)) : CommonViewExtKt.string(Ac.h.main_no_limited, holder.itemView.getContext()));
                return;
            }
            if (i10 == 3) {
                imageView.setImageResource(Ac.d.main_reward_bg_points);
                b((TextView) holder.getView(e.tvAmount), item.nominalValue * 100);
                ppButton.setText(CommonViewExtKt.string(k.core_view, holder.itemView.getContext()));
                h.C(ppButton);
                return;
            }
            if (i10 != 100) {
                imageView.setImageResource(Ac.d.main_reward_bg_cash);
                b((TextView) holder.getView(e.tvAmount), item.nominalValue);
                ppButton.setVisibility(4);
                return;
            }
        }
        if (i10 == 1) {
            h.s(holder.getView(e.tvPending), item.prizeStatus == 4);
            imageView.setImageResource(Ac.d.main_reward_bg_cash);
            ppButton.setText(CommonViewExtKt.string(k.core_view, holder.itemView.getContext()));
        } else {
            imageView.setImageResource(Ac.d.main_reward_bg_trialcash);
            ppButton.setText(CommonViewExtKt.string(k.core_use, holder.itemView.getContext()));
        }
        h.C(ppButton);
        b((TextView) holder.getView(e.tvAmount), item.nominalValue);
    }
}
