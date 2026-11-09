package W8;

import Bc.C0105b;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithTouchIdFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInWithTouchIdFragment f10598b;

    public /* synthetic */ p(LogInWithTouchIdFragment logInWithTouchIdFragment, int i7) {
        this.f10597a = i7;
        this.f10598b = logInWithTouchIdFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView;
        PpButton ppButton;
        LogInWithTouchIdFragment logInWithTouchIdFragment = this.f10598b;
        switch (this.f10597a) {
            case 0:
                logInWithTouchIdFragment.f26236v = false;
                C0105b c0105b = logInWithTouchIdFragment.f26232B;
                if (c0105b != null && (ppButton = (PpButton) c0105b.f666f) != null) {
                    p220oa.h.s(ppButton, false);
                }
                C0105b c0105b2 = logInWithTouchIdFragment.f26232B;
                if (c0105b2 != null && (textView = (TextView) c0105b2.f663c) != null) {
                    p220oa.h.s(textView, false);
                }
                logInWithTouchIdFragment.z();
                logInWithTouchIdFragment.A(true);
                break;
            case 1:
                int i7 = LogInWithTouchIdFragment.f26230C;
                logInWithTouchIdFragment.x();
                break;
            case 2:
                int i10 = LogInWithTouchIdFragment.f26230C;
                E activity = logInWithTouchIdFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 3:
                int i11 = LogInWithTouchIdFragment.f26230C;
                logInWithTouchIdFragment.x();
                break;
            default:
                int i12 = LogInWithTouchIdFragment.f26230C;
                p145jd.a.a(logInWithTouchIdFragment.getContext());
                LogInActivity logInActivityV = logInWithTouchIdFragment.v();
                io.fastkv.n.L(logInActivityV != null ? logInActivityV.f25879B : null, false);
                logInWithTouchIdFragment.x();
                break;
        }
    }
}
