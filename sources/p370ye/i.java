package p370ye;

import Ac.e;
import L6.b;
import M1.j;
import Pa.r0;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PalmPrizeItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        PalmPrizeItem item = (PalmPrizeItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(e.ivPalmPrize);
        if (!TextUtils.isEmpty(item.prizeImg)) {
            r0.l1(item.prizeImg, imageView);
        }
        int i7 = e.tvPalmPrize;
        String str = item.prizeName;
        if (str == null) {
            str = "";
        }
        holder.setText(i7, str);
        int i10 = e.tvPalmPrizeAmount;
        Long l5 = item.registrationAmount;
        holder.setText(i10, r0.F(l5 != null ? l5.longValue() : 0L));
        int i11 = e.ivPalmPrizeTag;
        Integer num = item.lotteryType;
        holder.setGone(i11, num == null || num.intValue() != 2);
        Integer num2 = item.lotteryType;
        if (num2 != null && num2.intValue() == 2) {
            holder.setTextColor(e.tvPalmPrizeAmount, Color.parseColor("#DEAE55"));
        } else {
            holder.setTextColor(e.tvPalmPrizeAmount, CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
        }
    }
}
