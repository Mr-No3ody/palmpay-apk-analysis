package Me;

import Pa.n0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5986a;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 == 1) {
            this.f5986a = true;
        }
        if (i7 == 0 && this.f5986a) {
            this.f5986a = false;
            n0.g().l("new_reward_hub_slide");
        }
    }
}
