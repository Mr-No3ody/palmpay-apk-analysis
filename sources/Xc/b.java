package Xc;

import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.DateItemView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.TimeItemView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements TimeItemView.Listener, DateItemView.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppointmentTimeSelectorView f11115a;

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.DateItemView.Listener
    public void onSelect(Calendar calendar) {
        AppointmentTimeSelectorView appointmentTimeSelectorView = this.f11115a;
        if (appointmentTimeSelectorView.f32961g == calendar) {
            return;
        }
        appointmentTimeSelectorView.f32961g = calendar;
        AppointmentTimeSelectorView.SelectDateListener selectDateListener = appointmentTimeSelectorView.f32962i;
        if (selectDateListener != null) {
            selectDateListener.onSelect(calendar.getTimeInMillis());
        }
        AppointmentTimeSelectorView.SelectTimeQuantumListener selectTimeQuantumListener = appointmentTimeSelectorView.f32963j;
        if (selectTimeQuantumListener != null) {
            selectTimeQuantumListener.onSelect(0L, 0L);
        }
        appointmentTimeSelectorView.a();
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.TimeItemView.Listener
    public void onSelect(long j6, long j10) {
        AppointmentTimeSelectorView.SelectTimeQuantumListener selectTimeQuantumListener = this.f11115a.f32963j;
        if (selectTimeQuantumListener != null) {
            selectTimeQuantumListener.onSelect(j6, j10);
        }
    }
}
