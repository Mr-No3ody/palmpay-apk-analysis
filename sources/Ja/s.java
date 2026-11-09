package Ja;

import android.view.View;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayPinWithTouchFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckPalmPayPinWithTouchFragment f4678b;

    public /* synthetic */ s(CheckPalmPayPinWithTouchFragment checkPalmPayPinWithTouchFragment, int i7) {
        this.f4677a = i7;
        this.f4678b = checkPalmPayPinWithTouchFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CheckPalmPayPinWithTouchFragment checkPalmPayPinWithTouchFragment = this.f4678b;
        switch (this.f4677a) {
            case 0:
                int i7 = CheckPalmPayPinWithTouchFragment.f27995Z;
                checkPalmPayPinWithTouchFragment.D();
                break;
            case 1:
                int i10 = CheckPalmPayPinWithTouchFragment.f27995Z;
                checkPalmPayPinWithTouchFragment.A();
                break;
            case 2:
                int i11 = CheckPalmPayPinWithTouchFragment.f27995Z;
                checkPalmPayPinWithTouchFragment.D();
                break;
            case 3:
                int i12 = CheckPalmPayPinWithTouchFragment.f27995Z;
                checkPalmPayPinWithTouchFragment.F();
                break;
            default:
                int i13 = CheckPalmPayPinWithTouchFragment.f27995Z;
                p145jd.a.a(checkPalmPayPinWithTouchFragment.getContext());
                io.fastkv.n.N(false);
                androidx.fragment.app.E activity = checkPalmPayPinWithTouchFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
        }
    }
}
