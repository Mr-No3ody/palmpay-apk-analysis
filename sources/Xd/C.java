package Xd;

import androidx.recyclerview.widget.DiffUtil;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        TvListByCategoryIdResp.TvItemChildBean oldItem = (TvListByCategoryIdResp.TvItemChildBean) obj;
        TvListByCategoryIdResp.TvItemChildBean newItem = (TvListByCategoryIdResp.TvItemChildBean) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.c(oldItem.getPrice(), newItem.getPrice()) && Intrinsics.c(oldItem.getVolume(), newItem.getVolume()) && Intrinsics.c(oldItem.getRemark(), newItem.getRemark()) && Intrinsics.c(oldItem.getValidity(), newItem.getValidity()) && Intrinsics.c(oldItem.getValidityExtDesc(), newItem.getValidityExtDesc()) && Intrinsics.c(oldItem.getVolumeUnit(), newItem.getVolumeUnit()) && Intrinsics.c(oldItem.getDescription(), newItem.getDescription()) && Intrinsics.c(oldItem.getColor(), newItem.getColor()) && Intrinsics.c(oldItem.getImage(), newItem.getImage()) && Intrinsics.c(oldItem.getItemName(), newItem.getItemName()) && Intrinsics.c(oldItem.getItemId(), newItem.getItemId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        TvListByCategoryIdResp.TvItemChildBean oldItem = (TvListByCategoryIdResp.TvItemChildBean) obj;
        TvListByCategoryIdResp.TvItemChildBean newItem = (TvListByCategoryIdResp.TvItemChildBean) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        F6.d.h("DataBundleDiffCallBack-areContentsTheSame", 3, d0.q("result = ", Intrinsics.c(oldItem.getItemId(), newItem.getItemId())));
        return Intrinsics.c(oldItem.getItemId(), newItem.getItemId());
    }
}
