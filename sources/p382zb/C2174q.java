package p382zb;

import android.widget.TextView;
import com.transsnet.palmpay.credit.ui.fragment.DoubleOpenBanFragment;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import p220oa.h;

/* JADX INFO: renamed from: zb.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2174q implements OpenResultTaskView.taskAllDoneInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleOpenBanFragment f44612a;

    public C2174q(DoubleOpenBanFragment doubleOpenBanFragment) {
        this.f44612a = doubleOpenBanFragment;
    }

    @Override // com.transsnet.palmpay.credit.view.OpenResultTaskView.taskAllDoneInterface
    public final void taskAllDone(boolean z3) {
        TextView textView = (TextView) this.f44612a.f30332o.getValue();
        if (textView != null) {
            h.s(textView, z3);
        }
    }
}
