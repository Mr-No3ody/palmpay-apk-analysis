package T8;

import android.view.View;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianResubmitFragment;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import p097g9.C1708f;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddGuardianResubmitFragment f9056b;

    public /* synthetic */ m(AddGuardianResubmitFragment addGuardianResubmitFragment, int i7) {
        this.f9055a = i7;
        this.f9056b = addGuardianResubmitFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9055a) {
            case 0:
                AddGuardianResubmitFragment addGuardianResubmitFragment = this.f9056b;
                AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) addGuardianResubmitFragment.f27333i;
                if (addGuardianViewModel != null) {
                    AddGuardianActivity addGuardianActivityV = addGuardianResubmitFragment.v();
                    p140j8.f.s(addGuardianViewModel, new C1708f(addGuardianActivityV != null ? addGuardianActivityV.f25813b : null, null), addGuardianViewModel.f26408f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            case 1:
                this.f9056b.z();
                break;
            default:
                this.f9056b.z();
                break;
        }
    }
}
