package V9;

import Pa.r0;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0715d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddNewFaveActivity f10194b;

    public /* synthetic */ ViewOnClickListenerC0715d(AddNewFaveActivity addNewFaveActivity, int i7) {
        this.f10193a = i7;
        this.f10194b = addNewFaveActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        AddNewFaveActivity addNewFaveActivity = this.f10194b;
        switch (this.f10193a) {
            case 0:
                int i7 = AddNewFaveActivity.f27138o;
                Intrinsics.e(view);
                if (Intrinsics.c(addNewFaveActivity.f27144i, "0") && r0.q(view.getTag().toString()) != 0) {
                    ToastUtils.showLong(addNewFaveActivity.getString(R9.f.ct_must_choose_lover), new Object[0]);
                } else if (Intrinsics.c(addNewFaveActivity.f27144i, "3") && r0.q(view.getTag().toString()) != 3) {
                    ToastUtils.showLong(addNewFaveActivity.getString(R9.f.ct_must_choose_parent), new Object[0]);
                } else {
                    int iQ = r0.q(view.getTag().toString());
                    if (addNewFaveActivity.f27139c != iQ) {
                        addNewFaveActivity.o(false);
                        addNewFaveActivity.f27139c = iQ;
                        addNewFaveActivity.o(true);
                    }
                }
                break;
            case 1:
                int i10 = AddNewFaveActivity.f27138o;
                addNewFaveActivity.p();
                break;
            case 2:
                int i11 = AddNewFaveActivity.f27138o;
                if (view.getId() == R9.d.tvSubmit) {
                    Bc.i iVar = addNewFaveActivity.f27145j;
                    if (TextUtils.isEmpty((iVar == null || (text = ((EditText) iVar.f726d).getText()) == null) ? null : text.toString())) {
                        ToastUtils.showLong(addNewFaveActivity.getString(R9.f.ct_please_input_nick_name), new Object[0]);
                    } else if (addNewFaveActivity.n().length() != 11) {
                        ToastUtils.showLong(addNewFaveActivity.getString(R9.f.ct_please_enter_11_digits), new Object[0]);
                    } else if (addNewFaveActivity.f27139c != -1) {
                        PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) addNewFaveActivity.l();
                        if (palmPayFriendsViewModel != null) {
                            String phone = r0.K() + addNewFaveActivity.n();
                            Intrinsics.checkNotNullParameter(phone, "phone");
                            p140j8.f.s(palmPayFriendsViewModel, new Z9.h(phone, null), palmPayFriendsViewModel.f27308p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    } else {
                        ToastUtils.showLong(addNewFaveActivity.getString(R9.f.ct_please_select_link_faves), new Object[0]);
                    }
                }
                break;
            default:
                int i12 = AddNewFaveActivity.f27138o;
                ARouter.getInstance().build("/contact/local").navigation(addNewFaveActivity, addNewFaveActivity.f27140d);
                break;
        }
    }
}
