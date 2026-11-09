package Ad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends Zb.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f177g;

    @Override // Zb.a
    public final View a(int i7, View view, ViewGroup parent) {
        View viewInflate;
        K k2;
        String str;
        View viewInflate2;
        e0 e0Var;
        View viewInflate3;
        Kb.e eVar;
        View viewInflate4;
        Kb.i iVar;
        View viewInflate5;
        Nc.i iVar2;
        switch (this.f176f) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                if (view == null) {
                    k2 = new K();
                    viewInflate = LayoutInflater.from(this.f177g).inflate(com.transsnet.palmpay.custom_view.t.cv_item_pick_time, (ViewGroup) null);
                    View viewFindViewById = viewInflate.findViewById(com.transsnet.palmpay.custom_view.s.item_name);
                    Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                    k2.f175a = (TextView) viewFindViewById;
                    viewInflate.setTag(k2);
                } else {
                    Object tag = view.getTag();
                    Intrinsics.f(tag, "null cannot be cast to non-null type com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog.ScheduleWheelAdapter.ViewHolder");
                    K k8 = (K) tag;
                    viewInflate = view;
                    k2 = k8;
                }
                Jd.a aVar = (Jd.a) this.f11606a.get(i7);
                TextView textView = k2.f175a;
                if (textView != null) {
                    int i10 = aVar.f4769a;
                    if (i10 > 0) {
                        str = aVar.f4770b + ", " + i10 + " times in total";
                    } else {
                        str = "No End";
                    }
                    textView.setText(str);
                }
                return viewInflate;
            case 1:
                Intrinsics.checkNotNullParameter(parent, "parent");
                if (view == null) {
                    e0Var = new e0();
                    viewInflate2 = LayoutInflater.from(this.f177g).inflate(com.transsnet.palmpay.custom_view.t.cv_item_pick_time, (ViewGroup) null);
                    View viewFindViewById2 = viewInflate2.findViewById(com.transsnet.palmpay.custom_view.s.item_name);
                    Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    e0Var.f216a = (TextView) viewFindViewById2;
                    viewInflate2.setTag(e0Var);
                } else {
                    Object tag2 = view.getTag();
                    Intrinsics.f(tag2, "null cannot be cast to non-null type com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog.ScheduleWeekWheelAdapter.ViewHolder");
                    e0 e0Var2 = (e0) tag2;
                    viewInflate2 = view;
                    e0Var = e0Var2;
                }
                f0 f0Var = (f0) this.f11606a.get(i7);
                TextView textView2 = e0Var.f216a;
                if (textView2 != null) {
                    textView2.setText(f0Var.f218a);
                }
                return viewInflate2;
            case 2:
                if (view == null) {
                    eVar = new Kb.e();
                    viewInflate3 = LayoutInflater.from(this.f177g).inflate(com.transsnet.palmpay.custom_view.t.cv_item_pick_time, (ViewGroup) null);
                    eVar.f4990a = (TextView) viewInflate3.findViewById(com.transsnet.palmpay.custom_view.s.item_name);
                    viewInflate3.setTag(eVar);
                } else {
                    viewInflate3 = view;
                    eVar = (Kb.e) view.getTag();
                }
                eVar.f4990a.setText((CharSequence) this.f11606a.get(i7));
                return viewInflate3;
            case 3:
                if (view == null) {
                    iVar = new Kb.i();
                    viewInflate4 = LayoutInflater.from(this.f177g).inflate(com.transsnet.palmpay.custom_view.t.cv_state_pick_item, (ViewGroup) null);
                    iVar.f4994a = (TextView) viewInflate4.findViewById(com.transsnet.palmpay.custom_view.s.item_name);
                    viewInflate4.setTag(iVar);
                } else {
                    viewInflate4 = view;
                    iVar = (Kb.i) view.getTag();
                }
                iVar.f4994a.setText(this.f11606a.get(i7).toString());
                return viewInflate4;
            default:
                if (view == null) {
                    iVar2 = new Nc.i();
                    viewInflate5 = LayoutInflater.from(this.f177g).inflate(Jc.d.mm_state_pick_item, (ViewGroup) null);
                    iVar2.f6329a = (TextView) viewInflate5.findViewById(Jc.c.item_name);
                    viewInflate5.setTag(iVar2);
                    viewInflate5.setLayoutParams(new ViewGroup.LayoutParams(-1, DensityUtil.dp2px(36.0f)));
                } else {
                    viewInflate5 = view;
                    iVar2 = (Nc.i) view.getTag();
                }
                iVar2.f6329a.setText((CharSequence) this.f11606a.get(i7));
                return viewInflate5;
        }
    }

    public /* synthetic */ L(Context context, int i7, boolean z3) {
        this.f176f = i7;
        this.f177g = context;
    }

    public L(Context context, int i7) {
        this.f176f = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f177g = context;
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f177g = context;
                break;
        }
    }
}
