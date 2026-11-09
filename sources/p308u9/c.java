package p308u9;

import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PickBettingBillerDialog f42722a;

    public c(PickBettingBillerDialog pickBettingBillerDialog) {
        this.f42722a = pickBettingBillerDialog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i7, i10);
        this.f42722a.updateSideBarSelection();
    }
}
