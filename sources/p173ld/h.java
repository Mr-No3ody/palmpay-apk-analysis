package p173ld;

import M1.j;
import Pa.i0;
import Pa.r0;
import S1.c;
import S1.e;
import android.widget.ImageView;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import kotlin.jvm.internal.Intrinsics;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends j implements LoadMoreModule {
    public h() {
        super(f.sm_item_schedule_transfer_for_bank_unstable, null);
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final c addLoadMoreModule(j jVar) {
        return e.a(this, jVar);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        ScheduleTransferForBankUnstableOrderResp item = (ScheduleTransferForBankUnstableOrderResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (((ImageView) holder.getViewOrNull(p159kd.e.iv_bank)) != null) {
            r0.l1(item.getPayeeBankUrl(), (ImageView) holder.getView(p159kd.e.iv_bank));
        }
        ImageView imageView = (ImageView) holder.getViewOrNull(p159kd.e.iv_status);
        if (imageView != null) {
            r0.l1(item.getPayStatusUrl(), imageView);
        }
        BaseViewHolder text = holder.setText(p159kd.e.tv_bank_account_name, "To " + item.getPayeeFullName()).setText(p159kd.e.tv_bank_name, item.getPayeeBankName()).setText(p159kd.e.tv_bank_account, " | " + i0.o(item.getPayeeBankCardNo()));
        int i7 = p159kd.e.tv_create_time;
        Long updateTime = item.getUpdateTime();
        BaseViewHolder text2 = text.setText(i7, r0.R(updateTime != null ? updateTime.longValue() : 0L));
        int i10 = p159kd.e.tv_amount;
        Long amount = item.getAmount();
        text2.setText(i10, r0.B(amount != null ? amount.longValue() : 0L, false));
    }
}
