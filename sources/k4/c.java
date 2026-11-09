package k4;

import com.flexibank.sdk.core.viewmodel.FlexiBankModelDayPick;
import com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView;

/* JADX INFO: loaded from: classes.dex */
public final class c implements FlexiBankWheelView.OnWheelItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlexiBankModelDayPick f38665a;

    public c(FlexiBankModelDayPick flexiBankModelDayPick) {
        this.f38665a = flexiBankModelDayPick;
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView.OnWheelItemSelectedListener
    public final void onItemSelected(int i7, Object obj) {
        FlexiBankModelDayPick flexiBankModelDayPick = this.f38665a;
        flexiBankModelDayPick.t = (String) obj;
        FlexiBankModelDayPick.b(flexiBankModelDayPick);
        FlexiBankModelDayPick.a(flexiBankModelDayPick);
    }
}
