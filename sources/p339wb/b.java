package p339wb;

import Kb.c;
import Pa.r0;
import Ya.f;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.CLTaskResp;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p294tb.W;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        int i7 = r.cv_shape_rect_corner_12_bg_white;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43362e = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CLTaskResp.CLTaskData.CLTask it = (CLTaskResp.CLTaskData.CLTask) this.f4985b.get(i7);
        if (it != null) {
            a aVar = (a) holder;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(it, "it");
            b bVar = aVar.f43361j;
            aVar.f43353a.setBackgroundResource(bVar.f43362e);
            r0.l1(it.getTaskPicture(), aVar.f43354b);
            aVar.f43355c.setText(it.getTaskName());
            int taskType = it.getTaskType();
            TextView textView = aVar.f43359g;
            switch (taskType) {
                case 1:
                    textView.setText("once/day");
                    break;
                case 2:
                    textView.setText("once/week");
                    break;
                case 3:
                    textView.setText("once");
                    break;
                case 4:
                    textView.setText("once");
                    break;
                case 5:
                    textView.setText("once");
                    break;
                case 6:
                    textView.setText("once/month");
                    break;
            }
            Integer sign = it.getSign();
            boolean z3 = sign != null && sign.intValue() == 0;
            TextView textGo = aVar.f43360i;
            textGo.setEnabled(z3);
            TextView text3 = aVar.f43358f;
            Intrinsics.checkNotNullExpressionValue(text3, "text3");
            h.s(text3, !TextUtils.isEmpty(it.getSubtaskName()));
            text3.setText(it.getSubtaskName());
            Intrinsics.checkNotNullExpressionValue(textGo, "textGo");
            h.l(new W(11, bVar, it), textGo);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.cs_item_anniversary_task, parent, false);
        Intrinsics.e(viewInflate);
        return new a(this, viewInflate);
    }
}
