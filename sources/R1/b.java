package R1;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends G8.a {
    @Override // G8.a
    public final View A(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(L1.a.load_more_load_end_view);
    }

    @Override // G8.a
    public final View B(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(L1.a.load_more_load_fail_view);
    }

    @Override // G8.a
    public final View C(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(L1.a.load_more_loading_view);
    }

    @Override // G8.a
    public final View D(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return G8.a.y(parent, L1.b.brvah_quick_view_load_more);
    }

    @Override // G8.a
    public final View z(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getView(L1.a.load_more_load_complete_view);
    }
}
