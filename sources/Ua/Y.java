package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelDayPick;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;

/* JADX INFO: loaded from: classes3.dex */
public final class Y implements WheelView.OnWheelItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelDayPick f9377a;

    public Y(ModelDayPick modelDayPick) {
        this.f9377a = modelDayPick;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public final void onItemSelected(int i7, Object obj) {
        ModelDayPick modelDayPick = this.f9377a;
        modelDayPick.f28323A = (String) obj;
        modelDayPick.g();
    }
}
