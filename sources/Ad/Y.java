package Ad;

import android.text.TextUtils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TradeRecordDetailResp.RecordDetail.SubTax item = (TradeRecordDetailResp.RecordDetail.SubTax) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int iColorInt = holder.getLayoutPosition() == 0 ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
        holder.setText(p159kd.e.tvName, item.getTaxName()).setTextColor(p159kd.e.tvName, iColorInt);
        SpanUtils spanUtils = new SpanUtils();
        Long underlineTax = item.getUnderlineTax();
        if ((underlineTax != null ? underlineTax.longValue() : 0L) > 0) {
            Long underlineTax2 = item.getUnderlineTax();
            spanUtils.append(Jd.c.a(underlineTax2 != null ? underlineTax2.longValue() : 0L)).setStrikethrough().setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(" ");
        }
        Long tax = item.getTax();
        spanUtils.append(Jd.c.a(tax != null ? tax.longValue() : 0L)).setForegroundColor(iColorInt);
        holder.setText(p159kd.e.tvAmount, spanUtils.create());
        if (TextUtils.isEmpty(item.getTaxDesc())) {
            holder.setGone(p159kd.e.tvDetail, true);
        } else {
            holder.setText(p159kd.e.tvDetail, item.getTaxDesc()).setGone(p159kd.e.tvDetail, false);
        }
    }
}
