package V9;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.contacts.ui.activity.LocalPalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalPalmPayContactsListActivity f10231a;

    public y(LocalPalmPayContactsListActivity localPalmPayContactsListActivity) {
        this.f10231a = localPalmPayContactsListActivity;
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String str) {
        int i7;
        LocalPalmPayContactsListActivity localPalmPayContactsListActivity = this.f10231a;
        W9.p pVar = localPalmPayContactsListActivity.f27231f;
        List list = pVar.f4985b;
        if (list == null || list.isEmpty()) {
            i7 = -1;
        } else {
            i7 = "★".equals(str) ? 0 : -2;
            for (int i10 = 0; i10 < pVar.f4985b.size(); i10++) {
                if (Z4.e.m(((PalmPayContact) pVar.f4985b.get(i10)).getFullName()).equals(str)) {
                    i7 = i10;
                    break;
                }
            }
        }
        if (i7 >= 0) {
            if (localPalmPayContactsListActivity.f27229d.getRecyclerView().getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) localPalmPayContactsListActivity.f27229d.getRecyclerView().getLayoutManager()).scrollToPositionWithOffset(i7, 0);
            } else {
                localPalmPayContactsListActivity.f27229d.getRecyclerView().getLayoutManager().scrollToPosition(i7);
            }
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
