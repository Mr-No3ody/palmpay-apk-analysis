package p102ge;

import Ac.h;
import Fe.J;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.main.export.bean.req.InviteeListReq;
import com.transsnet.palmpay.ui.activity.InviteeListActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InviteeListActivity f37238a;

    public x(InviteeListActivity inviteeListActivity) {
        this.f37238a = inviteeListActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        InviteeListActivity inviteeListActivity = this.f37238a;
        if (inviteeListActivity.f34482c >= inviteeListActivity.f34483d) {
            inviteeListActivity.f34484e.c();
            inviteeListActivity.f34484e.b(inviteeListActivity.getString(h.main_list_end));
        } else {
            inviteeListActivity.f34484e.a();
            ((J) inviteeListActivity.f27350a).queryInviteeList(new InviteeListReq(inviteeListActivity.f34482c + 1, 10));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        InviteeListActivity inviteeListActivity = this.f37238a;
        inviteeListActivity.f34482c = 1;
        ((J) inviteeListActivity.f27350a).queryInviteeList(new InviteeListReq(1, 10));
    }
}
