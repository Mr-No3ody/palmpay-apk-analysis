package p173ld;

import Jd.b;
import M1.j;
import Pa.r0;
import S1.c;
import S1.e;
import android.content.Context;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferSubOrderResp;
import com.transsnet.palmpay.util.SpanUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends j implements LoadMoreModule {
    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final c addLoadMoreModule(j jVar) {
        return e.a(this, jVar);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        CharSequence charSequenceCreate;
        ScheduleTransferSubOrderResp item = (ScheduleTransferSubOrderResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = p159kd.e.tv_time;
        Long gmtModified = item.getGmtModified();
        BaseViewHolder text = holder.setText(i7, new SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.ENGLISH).format(Long.valueOf(gmtModified != null ? gmtModified.longValue() : 0L)));
        int i10 = p159kd.e.tv_amount;
        Long businessAmount = item.getBusinessAmount();
        BaseViewHolder text2 = text.setText(i10, "-" + r0.B(businessAmount != null ? businessAmount.longValue() : 0L, false));
        int i11 = p159kd.e.tv_status;
        SimpleDateFormat simpleDateFormat = b.f4773a;
        Context context = getContext();
        Integer executeStatus = item.getExecuteStatus();
        int iIntValue = executeStatus != null ? executeStatus.intValue() : 0;
        Intrinsics.checkNotNullParameter(context, "context");
        if (iIntValue == 1) {
            charSequenceCreate = "";
        } else if (iIntValue != 2) {
            charSequenceCreate = new SpanUtils().append(context.getString(p025ba.k.core_pending)).setForegroundColor(context.getColor(p.cv_color_ffb800)).create();
            Intrinsics.e(charSequenceCreate);
        } else {
            charSequenceCreate = new SpanUtils().append(context.getString(p025ba.k.core_failed)).setForegroundColor(context.getColor(L6.b.ppColorError)).create();
            Intrinsics.e(charSequenceCreate);
        }
        text2.setText(i11, charSequenceCreate).setBackgroundResource(p159kd.e.ll_root, holder.getAbsoluteAdapterPosition() != getData().size() ? L6.b.ppColorBackgroundLight : r.cv_rect_corner_bl_br_12_bg_white);
    }
}
