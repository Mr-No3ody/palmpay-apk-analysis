package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelMonthPick;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;

/* JADX INFO: loaded from: classes3.dex */
public final class Z implements WheelView.OnWheelItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelMonthPick f9378a;

    public Z(ModelMonthPick modelMonthPick) {
        this.f9378a = modelMonthPick;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public final void onItemSelected(int i7, Object obj) {
        ModelMonthPick modelMonthPick = this.f9378a;
        modelMonthPick.t = (String) obj;
        modelMonthPick.e();
    }
}
