package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelMonthPick;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;

/* JADX INFO: renamed from: Ua.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0616a0 implements WheelView.OnWheelItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelMonthPick f9381a;

    public C0616a0(ModelMonthPick modelMonthPick) {
        this.f9381a = modelMonthPick;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public final void onItemSelected(int i7, Object obj) {
        ModelMonthPick modelMonthPick = this.f9381a;
        modelMonthPick.f28381p = (String) obj;
        modelMonthPick.e();
    }
}
