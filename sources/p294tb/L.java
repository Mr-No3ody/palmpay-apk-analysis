package p294tb;

import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements OpenResultTaskView.taskAllDoneInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42417a;

    public L(CLOpenResultActivity cLOpenResultActivity) {
        this.f42417a = cLOpenResultActivity;
    }

    @Override // com.transsnet.palmpay.credit.view.OpenResultTaskView.taskAllDoneInterface
    public final void taskAllDone(boolean z3) {
        int i7 = CLOpenResultActivity.f28955V0;
        CLOpenResultActivity cLOpenResultActivity = this.f42417a;
        TextView textView = (TextView) cLOpenResultActivity.f29003x0.getValue();
        if (textView != null) {
            CLOpenAccountData cLOpenAccountData = cLOpenResultActivity.f28967H0;
            h.s(textView, !TextUtils.isEmpty(cLOpenAccountData != null ? cLOpenAccountData.getErrorContent() : null) && z3);
        }
    }
}
