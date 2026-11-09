package V9;

import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.contacts.ui.activity.LinkFavePersonalInfoActivity;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.bean.req.AddContactReq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkFavePersonalInfoActivity f10225b;

    public /* synthetic */ v(LinkFavePersonalInfoActivity linkFavePersonalInfoActivity, int i7) {
        this.f10224a = i7;
        this.f10225b = linkFavePersonalInfoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinkFavePersonalInfoActivity linkFavePersonalInfoActivity = this.f10225b;
        switch (this.f10224a) {
            case 0:
                int i7 = LinkFavePersonalInfoActivity.f27222f;
                int id2 = view.getId();
                if (id2 == R9.d.tvAdd) {
                    PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) linkFavePersonalInfoActivity.l();
                    AddContactReq req = new AddContactReq();
                    req.setContactsMemberId(linkFavePersonalInfoActivity.f27224d);
                    req.setRequestSource("4");
                    palmPayFriendsViewModel.getClass();
                    Intrinsics.checkNotNullParameter(req, "req");
                    p140j8.f.s(palmPayFriendsViewModel, new Z9.c(req, null), palmPayFriendsViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                } else if (id2 == R9.d.tvEdit) {
                    ARouter.getInstance().build("/contact/add_new_fave").withString("key_phone", linkFavePersonalInfoActivity.f27225e).withString("key_binding_memberid", linkFavePersonalInfoActivity.f27224d).withString("key_final_source", "3").navigation(linkFavePersonalInfoActivity, 10);
                } else if (id2 == R9.d.tvDelete) {
                    O6.c cVar = new O6.c(linkFavePersonalInfoActivity);
                    cVar.f6596b = O6.d.f(linkFavePersonalInfoActivity.getString(R9.f.ct_remove_fave_dialog_title));
                    cVar.f6614u = 2;
                    cVar.f6598d = linkFavePersonalInfoActivity.getString(R9.f.ct_remove_fave_dialog_content);
                    cVar.d(p025ba.k.core_cancel, null);
                    String string = linkFavePersonalInfoActivity.getString(R9.f.ct_remove_now);
                    v vVar = new v(linkFavePersonalInfoActivity, 1);
                    cVar.f6601g = string;
                    cVar.f6603i = vVar;
                    cVar.g();
                }
                break;
            default:
                int i10 = LinkFavePersonalInfoActivity.f27222f;
                ARouter.getInstance().build("/account/authentication").withInt("extra_mode", 3).navigation(linkFavePersonalInfoActivity, 101);
                break;
        }
    }
}
