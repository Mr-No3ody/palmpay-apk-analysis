package M1;

import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends b {
    public k(int i7) {
        a(-99, i7);
    }

    public abstract void b(BaseViewHolder baseViewHolder, SectionEntity sectionEntity);

    @Override // M1.j
    public final boolean isFixedViewType(int i7) {
        return super.isFixedViewType(i7) || i7 == -99;
    }

    public k(int i7, int i10) {
        this(i7);
        a(-100, i10);
    }

    @Override // M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(BaseViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.getItemViewType() == -99) {
            b(holder, (SectionEntity) getItem(i7 - getHeaderLayoutCount()));
        } else {
            super.onBindViewHolder(holder, i7);
        }
    }

    @Override // M1.j, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(BaseViewHolder helper, int i7, List payloads) {
        Intrinsics.checkNotNullParameter(helper, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(helper, i7);
            return;
        }
        if (helper.getItemViewType() == -99) {
            SectionEntity item = (SectionEntity) getItem(i7 - getHeaderLayoutCount());
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            return;
        }
        super.onBindViewHolder(helper, i7, (List<Object>) payloads);
    }
}
