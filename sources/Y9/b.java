package Y9;

import W9.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.contacts.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileContactsListFragment f11318a;

    public b(MobileContactsListFragment mobileContactsListFragment) {
        this.f11318a = mobileContactsListFragment;
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String str) {
        int i7;
        MobileContactsListFragment mobileContactsListFragment = this.f11318a;
        t tVar = mobileContactsListFragment.t;
        List list = tVar.f4985b;
        if (list == null || list.isEmpty()) {
            i7 = -1;
        } else {
            i7 = "★".equals(str) ? 0 : -2;
            for (int i10 = 0; i10 < tVar.f4985b.size(); i10++) {
                if (Z4.e.m(((PalmPayContact) tVar.f4985b.get(i10)).getFullName()).equals(str)) {
                    i7 = i10;
                    break;
                }
            }
        }
        if (i7 >= 0) {
            if (mobileContactsListFragment.f27275o.getRecyclerView().getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) mobileContactsListFragment.f27275o.getRecyclerView().getLayoutManager()).scrollToPositionWithOffset(i7, 0);
            } else {
                mobileContactsListFragment.f27275o.getRecyclerView().getLayoutManager().scrollToPosition(i7);
            }
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
