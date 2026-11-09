package t9;

import Pa.r0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Xd.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42358c;

    public /* synthetic */ c(int i7) {
        this.f42358c = i7;
    }

    @Override // Xd.j
    public void d(BaseViewHolder holder, BillerHistoryItemBean item) {
        switch (this.f42358c) {
            case 1:
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                super.d(holder, item);
                int i7 = Pd.c.tv_history_pay_amount;
                Long payAmount = item.getPayAmount();
                holder.setText(i7, "+" + r0.A(payAmount != null ? payAmount.longValue() : 0L));
                int i10 = Pd.c.tv_history_content;
                String string = getContext().getString(Pd.f.qt_s_account_withdraw, item.getBillerName());
                if (string == null) {
                    string = "";
                }
                holder.setText(i10, string);
                break;
            default:
                super.d(holder, item);
                break;
        }
    }

    @Override // Xd.j
    public final boolean e() {
        switch (this.f42358c) {
        }
        return false;
    }
}
