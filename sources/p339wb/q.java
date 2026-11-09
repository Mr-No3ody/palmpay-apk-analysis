package p339wb;

import M1.j;
import Pa.i0;
import Pa.r0;
import S1.c;
import S1.e;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends j implements LoadMoreModule {
    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final c addLoadMoreModule(j jVar) {
        return e.a(this, jVar);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        QueryRecentlyMerchantResp.Data item = (QueryRecentlyMerchantResp.Data) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = holder.setText(Ya.e.tv_merchant, item.getMerchantName());
        int i7 = Ya.e.tv_account_date;
        String snNo = item.getSnNo();
        text.setText(i7, "Account No. " + ((snNo == null || !y.m(snNo, "M010001", false)) ? i0.o(item.getSnNo()) : r0.T1(item.getSnNo())));
    }
}
