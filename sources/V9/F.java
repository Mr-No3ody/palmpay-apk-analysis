package V9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayLinkFavesFriendsActivity;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayLinkFavesFriendsActivity f10182a;

    public F(PalmPayLinkFavesFriendsActivity palmPayLinkFavesFriendsActivity) {
        this.f10182a = palmPayLinkFavesFriendsActivity;
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter) {
        int i7;
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(letter, "letter");
        PalmPayLinkFavesFriendsActivity palmPayLinkFavesFriendsActivity = this.f10182a;
        W9.A a3 = palmPayLinkFavesFriendsActivity.f27247d;
        Intrinsics.e(a3);
        List list = a3.f4985b;
        if (list == null || list.isEmpty()) {
            i7 = -1;
        } else {
            i7 = "★".equals(letter) ? 0 : -2;
            for (int i10 = 0; i10 < a3.f4985b.size(); i10++) {
                if (((PalmPayContact) a3.f4985b.get(i10)).getFavouriteType() != 1 && Z4.e.m(((PalmPayContact) a3.f4985b.get(i10)).getAlias()).equals(letter)) {
                    i7 = i10;
                    break;
                }
            }
            if (a3.f10600e) {
                i7++;
            }
        }
        if (i7 >= 0) {
            Bc.p pVar = palmPayLinkFavesFriendsActivity.f27246c;
            if ((pVar != null ? ((RecyclerView) pVar.f812c).getLayoutManager() : null) instanceof LinearLayoutManager) {
                Bc.p pVar2 = palmPayLinkFavesFriendsActivity.f27246c;
                RecyclerView.LayoutManager layoutManager2 = pVar2 != null ? ((RecyclerView) pVar2.f812c).getLayoutManager() : null;
                Intrinsics.f(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(i7, 0);
                return;
            }
            Bc.p pVar3 = palmPayLinkFavesFriendsActivity.f27246c;
            if (pVar3 == null || (layoutManager = ((RecyclerView) pVar3.f812c).getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(i7);
        }
    }

    @Override // com.transsnet.palmpay.contacts.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
