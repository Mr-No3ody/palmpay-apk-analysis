package p382zb;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.credit.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.sidebar.SideBarView;
import java.util.List;
import p059e1.a;
import p339wb.m;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileContactsListFragment f44518a;

    public B(MobileContactsListFragment mobileContactsListFragment) {
        this.f44518a = mobileContactsListFragment;
    }

    @Override // com.transsnet.palmpay.sidebar.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String str) {
        int i7;
        MobileContactsListFragment mobileContactsListFragment = this.f44518a;
        m mVar = mobileContactsListFragment.f30365v;
        List list = mVar.f4985b;
        if (list == null || list.isEmpty()) {
            i7 = -1;
        } else {
            i7 = "★".equals(str) ? 0 : -2;
            for (int i10 = 0; i10 < mVar.f4985b.size(); i10++) {
                if (a.t(((PalmPayContact) mVar.f4985b.get(i10)).getFullName()).equals(str)) {
                    i7 = i10;
                    break;
                }
            }
        }
        if (i7 >= 0) {
            if (mobileContactsListFragment.f30364p.getRecyclerView().getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) mobileContactsListFragment.f30364p.getRecyclerView().getLayoutManager()).scrollToPositionWithOffset(i7, 0);
            } else {
                mobileContactsListFragment.f30364p.getRecyclerView().getLayoutManager().scrollToPosition(i7);
            }
        }
    }

    @Override // com.transsnet.palmpay.sidebar.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
