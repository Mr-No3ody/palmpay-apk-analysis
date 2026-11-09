package Y9;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.contacts.ui.fragment.PalmPayContactsListFragment;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayContactsListFragment f11320a;

    public d(PalmPayContactsListFragment palmPayContactsListFragment) {
        this.f11320a = palmPayContactsListFragment;
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String str) {
        PalmPayContactsListFragment palmPayContactsListFragment = this.f11320a;
        int iD = palmPayContactsListFragment.f27282p.d(str);
        if (iD >= 0) {
            if (palmPayContactsListFragment.f27279i.getRecyclerView().getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) palmPayContactsListFragment.f27279i.getRecyclerView().getLayoutManager()).scrollToPositionWithOffset(iD, 0);
            } else {
                palmPayContactsListFragment.f27279i.getRecyclerView().getLayoutManager().scrollToPosition(iD);
            }
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
