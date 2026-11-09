package p144jc;

import android.view.View;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.device.ui.activity.DeviceListActivity;
import p158kc.d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceListActivity f38589b;

    public /* synthetic */ a(DeviceListActivity deviceListActivity, int i7) {
        this.f38588a = i7;
        this.f38589b = deviceListActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeviceListActivity deviceListActivity = this.f38589b;
        switch (this.f38588a) {
            case 0:
                DeviceListActivity.a aVar = DeviceListActivity.f31817g;
                deviceListActivity.n();
                break;
            case 1:
                PpButton ppButton = deviceListActivity.f31823c;
                if (ppButton != null) {
                    ppButton.setVisibility(8);
                }
                PpButton ppButton2 = deviceListActivity.f31824d;
                if (ppButton2 != null) {
                    ppButton2.setVisibility(0);
                }
                d dVar = deviceListActivity.f31825e;
                if (dVar != null) {
                    int state_edit = d.f38741i.getSTATE_EDIT();
                    if (state_edit != dVar.f38744e) {
                        dVar.f38745f = dVar.getItemCount();
                    } else {
                        dVar.f38745f = 0;
                    }
                    dVar.f38744e = state_edit;
                    dVar.notifyDataSetChanged();
                }
                break;
            case 2:
                DeviceListActivity.a aVar2 = DeviceListActivity.f31817g;
                deviceListActivity.o();
                break;
            default:
                DeviceListActivity.a aVar3 = DeviceListActivity.f31817g;
                deviceListActivity.n();
                break;
        }
    }
}
