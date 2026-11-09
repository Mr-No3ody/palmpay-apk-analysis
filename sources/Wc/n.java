package Wc;

import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements AppointmentTimeSelectorView.SelectDateListener, AppointmentTimeSelectorView.SelectTimeQuantumListener, P2PButton.OnP2PButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReservationTimeDialog f10697a;

    public /* synthetic */ n(ReservationTimeDialog reservationTimeDialog) {
        this.f10697a = reservationTimeDialog;
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton.OnP2PButtonClickListener
    public void onClick() {
        ReservationTimeDialog reservationTimeDialog = this.f10697a;
        Function2 function2 = reservationTimeDialog.mListener;
        m md2 = reservationTimeDialog.getMD();
        md2.getClass();
        KProperty<?>[] kPropertyArr = m.f10687j;
        Long lValueOf = Long.valueOf(((Number) md2.f10694g.getValue(md2, kPropertyArr[6])).longValue());
        m md3 = reservationTimeDialog.getMD();
        md3.getClass();
        function2.invoke(lValueOf, Long.valueOf(((Number) md3.f10695h.getValue(md3, kPropertyArr[7])).longValue()));
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView.SelectDateListener
    public void onSelect(long j6) {
        m md2 = this.f10697a.getMD();
        md2.f10693f.setValue(md2, m.f10687j[5], Long.valueOf(j6));
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView.SelectTimeQuantumListener
    public void onSelect(long j6, long j10) {
        ReservationTimeDialog reservationTimeDialog = this.f10697a;
        m md2 = reservationTimeDialog.getMD();
        k kVar = md2.f10694g;
        KProperty<?>[] kPropertyArr = m.f10687j;
        kVar.setValue(md2, kPropertyArr[6], Long.valueOf(j6));
        m md3 = reservationTimeDialog.getMD();
        md3.f10695h.setValue(md3, kPropertyArr[7], Long.valueOf(j10));
    }
}
