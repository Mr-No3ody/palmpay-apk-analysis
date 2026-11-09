package Ce;

import android.view.View;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeMeFragment f1432b;

    public /* synthetic */ K(HomeMeFragment homeMeFragment, int i7) {
        this.f1431a = i7;
        this.f1432b = homeMeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1431a) {
            case 0:
                HomeMeFragment homeMeFragment = this.f1432b;
                O6.c cVar = new O6.c(homeMeFragment.getActivity());
                cVar.e(Ac.h.main_log_out);
                cVar.b(Ac.h.main_msg_log_out);
                cVar.d(Ac.h.main_ok, new K(homeMeFragment, 1));
                cVar.c(Ac.h.main_cancel, null);
                cVar.g();
                break;
            default:
                Pa.A.a();
                Pa.i0.K(null, null);
                androidx.fragment.app.E activity = this.f1432b.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
        }
    }
}
