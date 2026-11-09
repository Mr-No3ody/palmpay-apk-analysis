package p173ld;

import M1.j;
import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferHomeResp;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends j {
    public f() {
        super(p159kd.f.sm_item_schedule_transfer_create_payment, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        ScheduleTransferHomeResp.Payment item = (ScheduleTransferHomeResp.Payment) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        r0.l1(item.getPaymentIcon(), (ImageView) holder.getView(e.iv_icon));
        int i7 = e.tv_payment_name_balance;
        SpanUtils spanUtils = new SpanUtils();
        String paymentTypeDesc = item.getPaymentTypeDesc();
        if (paymentTypeDesc == null) {
            paymentTypeDesc = "";
        }
        holder.setText(i7, spanUtils.append(paymentTypeDesc).create()).setVisible(e.iv_check, Intrinsics.c(item.getDefaultOption(), Boolean.TRUE));
    }
}
