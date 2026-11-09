package V9;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayContactsListActivity f10177a;

    public B(PalmPayContactsListActivity palmPayContactsListActivity) {
        this.f10177a = palmPayContactsListActivity;
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String str) {
        PalmPayContactsListActivity palmPayContactsListActivity = this.f10177a;
        int iD = palmPayContactsListActivity.f27236c.d(str);
        if (iD >= 0) {
            if (palmPayContactsListActivity.f27234a.getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) palmPayContactsListActivity.f27234a.getLayoutManager()).scrollToPositionWithOffset(iD, 0);
            } else {
                palmPayContactsListActivity.f27234a.getLayoutManager().scrollToPosition(iD);
            }
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
