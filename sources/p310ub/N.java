package p310ub;

import Ya.g;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import kotlin.jvm.internal.Intrinsics;
import p368yb.C2157z;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcFeedbackActivity f42776a;

    public N(OcFeedbackActivity ocFeedbackActivity) {
        this.f42776a = ocFeedbackActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i7, int i10) {
        super.onItemRangeRemoved(i7, i10);
        int i11 = OcFeedbackActivity.f29425H;
        OcFeedbackActivity ocFeedbackActivity = this.f42776a;
        Object value = ocFeedbackActivity.f29431f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        int i12 = g.cs_max_screen;
        C2157z c2157z = ocFeedbackActivity.f29438w;
        if (c2157z != null) {
            textView.setText(ocFeedbackActivity.getString(i12, Integer.valueOf(c2157z.f44274b.size())));
        } else {
            Intrinsics.n("mSelectedImgAdapter");
            throw null;
        }
    }
}
