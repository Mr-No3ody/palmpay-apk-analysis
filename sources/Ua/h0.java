package Ua;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.viewmodel.ModelProgressListView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelProgressListView f9408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ModelProgressListView modelProgressListView) {
        super(p025ba.g.core_layout_item_progress_list, null);
        this.f9408a = modelProgressListView;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String item = (String) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(p025ba.e.tv_name, item);
        holder.setGone(p025ba.e.iv_done, true);
        holder.setGone(p025ba.e.cpi_loading, true);
        holder.setTextColor(p025ba.e.tv_name, getContext().getColor(L6.b.ppColorTextDisable));
        ModelProgressListView modelProgressListView = this.f9408a;
        if (modelProgressListView.getCom.facebook.react.views.progressbar.ReactProgressBarViewManager.PROP_PROGRESS java.lang.String() == holder.getBindingAdapterPosition()) {
            holder.setGone(p025ba.e.cpi_loading, false);
            holder.setTextColor(p025ba.e.tv_name, getContext().getColor(L6.b.ppColorTextPrimary));
        } else if (modelProgressListView.getCom.facebook.react.views.progressbar.ReactProgressBarViewManager.PROP_PROGRESS java.lang.String() > holder.getBindingAdapterPosition()) {
            holder.setGone(p025ba.e.iv_done, false);
            holder.setTextColor(p025ba.e.tv_name, getContext().getColor(L6.b.ppColorTextPrimary));
        }
    }
}
