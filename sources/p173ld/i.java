package p173ld;

import C0.G;
import Jd.b;
import M1.j;
import N8.q0;
import Pa.r0;
import S1.c;
import S1.e;
import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferOrderResp;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;
import p159kd.f;
import p237pd.a;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j implements LoadMoreModule {
    public i() {
        super(f.sm_item_schedule_transfer_home, null);
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final c addLoadMoreModule(j jVar) {
        return e.a(this, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String strY;
        int i7;
        ScheduleTransferOrderResp item = (ScheduleTransferOrderResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i10 = p159kd.e.tv_schedule_type_name;
        SimpleDateFormat simpleDateFormat = b.f4773a;
        Integer taskType = item.getTaskType();
        int iIntValue = taskType != null ? taskType.intValue() : 0;
        Long taskStartDate = item.getTaskStartDate();
        BaseViewHolder text = holder.setText(i10, b.g(iIntValue, taskStartDate != null ? taskStartDate.longValue() : 0L, false));
        int i11 = p159kd.e.tv_schedule_end_date;
        Integer taskType2 = item.getTaskType();
        int iIntValue2 = taskType2 != null ? taskType2.intValue() : 0;
        Integer transferNum = item.getTransferNum();
        int iIntValue3 = transferNum != null ? transferNum.intValue() : 0;
        Long taskStartDate2 = item.getTaskStartDate();
        Long lValueOf = Long.valueOf(taskStartDate2 != null ? taskStartDate2.longValue() : 0L);
        Long taskEndDate = item.getTaskEndDate();
        Long lValueOf2 = Long.valueOf(taskEndDate != null ? taskEndDate.longValue() : 0L);
        if (iIntValue2 == 1) {
            strY = "";
        } else if (iIntValue2 == 3) {
            if (iIntValue3 > 0) {
                strY = G.o("End at ", b.b(lValueOf2));
            } else {
                strY = "No End";
            }
        } else if (iIntValue2 != 4) {
            strY = q0.y(b.b(lValueOf), "-", b.b(lValueOf2));
        } else if (iIntValue3 > 0) {
            strY = G.o("End at ", b.b(lValueOf2));
        } else {
            strY = "No End";
        }
        BaseViewHolder text2 = text.setText(i11, strY);
        int i12 = p159kd.e.tv_schedule_amount;
        Long businessAmount = item.getBusinessAmount();
        BaseViewHolder text3 = text2.setText(i12, r0.B(businessAmount != null ? businessAmount.longValue() : 0L, false)).setText(p159kd.e.tv_schedule_name, "To " + item.getPayeeName());
        int i13 = p159kd.e.groupNextTransfer;
        Long nextExecuteDate = item.getNextExecuteDate();
        BaseViewHolder gone = text3.setGone(i13, (nextExecuteDate != null ? nextExecuteDate.longValue() : 0L) <= 0);
        int i14 = p159kd.e.tvNextTransfer;
        Long nextExecuteDate2 = item.getNextExecuteDate();
        gone.setText(i14, "Upcoming Transfer on " + r0.S(nextExecuteDate2 != null ? nextExecuteDate2.longValue() : 0L));
        ImageView imageView = (ImageView) holder.getView(p159kd.e.iv_status);
        Context context = getContext();
        Integer taskStatus = item.getTaskStatus();
        int iIntValue4 = taskStatus != null ? taskStatus.intValue() : 0;
        if (iIntValue4 == 1) {
            i7 = a.sm_ic_schedule_transfer_active;
        } else {
            i7 = iIntValue4 == 3 ? a.sm_ic_schedule_transfer_cancelled : a.sm_ic_schedule_transfer_complete;
        }
        r0.e1(imageView, context.getDrawable(i7));
    }
}
