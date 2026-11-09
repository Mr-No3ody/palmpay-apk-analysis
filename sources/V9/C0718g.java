package V9;

import com.transsnet.palmpay.contacts.bean.req.QueryLastRelationShipReq;
import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0718g implements ModelEnterPhoneNumber1.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddNewFaveActivity f10199a;

    public C0718g(AddNewFaveActivity addNewFaveActivity) {
        this.f10199a = addNewFaveActivity;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1.CallBack
    public final void onNumberEditing(String num) {
        Intrinsics.checkNotNullParameter(num, "num");
    }

    @Override // com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1.CallBack
    public final void onNumberInputComplete(String num) {
        Intrinsics.checkNotNullParameter(num, "num");
        int i7 = AddNewFaveActivity.f27138o;
        AddNewFaveActivity addNewFaveActivity = this.f10199a;
        PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) addNewFaveActivity.l();
        QueryLastRelationShipReq req = new QueryLastRelationShipReq();
        req.phone = addNewFaveActivity.n();
        req.needHistoryRelationship = 1;
        palmPayFriendsViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(palmPayFriendsViewModel, new Z9.g(req, null), palmPayFriendsViewModel.f27306j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
