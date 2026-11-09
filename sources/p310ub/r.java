package p310ub;

import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements OpenResultTaskView.taskAllDoneInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcApplyResultActivity f42910a;

    public r(OcApplyResultActivity ocApplyResultActivity) {
        this.f42910a = ocApplyResultActivity;
    }

    @Override // com.transsnet.palmpay.credit.view.OpenResultTaskView.taskAllDoneInterface
    public final void taskAllDone(boolean z3) {
        int i7 = OcApplyResultActivity.f29276O0;
        OcApplyResultActivity ocApplyResultActivity = this.f42910a;
        Object value = ocApplyResultActivity.f29322z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        OcApplyResultData ocApplyResultData = ocApplyResultActivity.f29283D0;
        h.s(textView, !TextUtils.isEmpty(ocApplyResultData != null ? ocApplyResultData.getErrorContent() : null) && z3);
    }
}
