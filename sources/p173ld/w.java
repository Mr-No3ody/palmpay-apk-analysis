package p173ld;

import M1.j;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BankInfo;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39339a;

    public w(boolean z3) {
        super(f.sm_item_transfer_matched_bank, null);
        this.f39339a = z3;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BankInfo item = (BankInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        r0.o1(item.bankUrl, (ImageView) holder.getView(e.iv_bank));
        holder.setText(e.tv_bank_name, item.bankName);
        String str = (!this.f39339a || TextUtils.isEmpty(item.bankDarkMark)) ? item.bankMark : item.bankDarkMark;
        if (TextUtils.isEmpty(str)) {
            holder.setGone(e.iv_requester, true);
        } else {
            holder.setGone(e.iv_requester, false);
            r0.l1(str, (ImageView) holder.getView(e.iv_requester));
        }
    }
}
