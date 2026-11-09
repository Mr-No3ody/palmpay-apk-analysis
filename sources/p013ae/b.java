package p013ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11902a;

    public b(e eVar) {
        this.f11902a = eVar;
    }

    @Override // com.transsnet.palmpay.teller.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        e eVar = this.f11902a;
        int positionForSection = eVar.f11907c.getPositionForSection(i7);
        RecyclerView.Adapter adapter = eVar.f11905a.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (positionForSection < 0 || positionForSection >= itemCount) {
            return;
        }
        eVar.f11910f = true;
        eVar.f11905a.stopScroll();
        RecyclerView.LayoutManager layoutManager = eVar.f11905a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(positionForSection, 0);
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
        e eVar = this.f11902a;
        eVar.f11910f = false;
        eVar.f11905a.post(new a(eVar, 1));
    }
}
