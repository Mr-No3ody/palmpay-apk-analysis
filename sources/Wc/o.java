package Wc;

import android.widget.LinearLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.DateItemView;
import com.transsnet.palmpay.util.SizeUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReservationTimeDialog f10698a;

    public o(ReservationTimeDialog reservationTimeDialog) {
        this.f10698a = reservationTimeDialog;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    public final void a() {
        ReservationTimeDialog reservationTimeDialog = this.f10698a;
        m md2 = reservationTimeDialog.getMD();
        md2.getClass();
        KProperty<?>[] kPropertyArr = m.f10687j;
        if (((Number) md2.f10694g.getValue(md2, kPropertyArr[6])).longValue() > 0) {
            m md3 = reservationTimeDialog.getMD();
            md3.getClass();
            if (((Number) md3.f10695h.getValue(md3, kPropertyArr[7])).longValue() > 0) {
                reservationTimeDialog.getP2p_confirm().setStatus(1);
            } else {
                reservationTimeDialog.getP2p_confirm().setStatus(2);
            }
        } else {
            reservationTimeDialog.getP2p_confirm().setStatus(2);
        }
        reservationTimeDialog.getP2p_confirm().setOnP2PButtonClickListener(new n(reservationTimeDialog));
    }

    public final void b() {
        ReservationTimeDialog reservationTimeDialog = this.f10698a;
        final AppointmentTimeSelectorView p2p_time_selector = reservationTimeDialog.getP2p_time_selector();
        m md2 = reservationTimeDialog.getMD();
        k kVar = md2.f10688a;
        KProperty<?>[] kPropertyArr = m.f10687j;
        long jLongValue = ((Number) kVar.getValue(md2, kPropertyArr[0])).longValue();
        m md3 = reservationTimeDialog.getMD();
        md3.getClass();
        ArrayList arrayList = (ArrayList) md3.f10689b.getValue(md3, kPropertyArr[1]);
        p2p_time_selector.f32958d = jLongValue;
        ArrayList arrayList2 = p2p_time_selector.f32959e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = p2p_time_selector.f32960f;
        arrayList3.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(p2p_time_selector.f32958d);
            calendar.add(5, i7);
            arrayList3.add(calendar);
        }
        p2p_time_selector.f32956b.removeAllViews();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            Calendar calendar2 = (Calendar) arrayList3.get(i10);
            DateItemView dateItemView = new DateItemView(p2p_time_selector.f32955a);
            long j6 = p2p_time_selector.f32958d;
            dateItemView.f32978e = calendar2;
            String str = androidx.camera.core.impl.utils.executor.g.B(j6, calendar2.getTimeInMillis()) ? "Today" : new SimpleDateFormat("E").format(new Date(dateItemView.f32978e.getTimeInMillis()));
            String str2 = new SimpleDateFormat("MMM d").format(new Date(dateItemView.f32978e.getTimeInMillis()));
            dateItemView.f32976c.setText(str);
            dateItemView.f32977d.setText(str2);
            dateItemView.setListener(new Xc.b(p2p_time_selector));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i10 == 0) {
                layoutParams.leftMargin = SizeUtils.dp2px(12.0f);
            } else if (i10 == arrayList3.size() - 1) {
                layoutParams.leftMargin = SizeUtils.dp2px(16.0f);
                layoutParams.rightMargin = SizeUtils.dp2px(12.0f);
            } else {
                layoutParams.leftMargin = SizeUtils.dp2px(16.0f);
            }
            p2p_time_selector.f32956b.addView(dateItemView, layoutParams);
        }
        if (!arrayList.isEmpty()) {
            Xc.d dVar = (Xc.d) arrayList.get(arrayList.size() - 1);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(p2p_time_selector.f32958d);
            calendar3.set(11, dVar.f11118a);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
            calendar3.add(12, -10);
            if (p2p_time_selector.f32958d < calendar3.getTimeInMillis()) {
                final int i11 = 0;
                p2p_time_selector.post(new Runnable() { // from class: Xc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p2p_time_selector.f32956b.getChildAt(0).performClick();
                                break;
                            default:
                                p2p_time_selector.f32956b.getChildAt(1).performClick();
                                break;
                        }
                    }
                });
            } else {
                ((DateItemView) p2p_time_selector.f32956b.getChildAt(0)).setEnable(false);
                final int i12 = 1;
                p2p_time_selector.post(new Runnable() { // from class: Xc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                p2p_time_selector.f32956b.getChildAt(0).performClick();
                                break;
                            default:
                                p2p_time_selector.f32956b.getChildAt(1).performClick();
                                break;
                        }
                    }
                });
            }
        }
        reservationTimeDialog.getP2p_time_selector().setSelectDateListener(new n(reservationTimeDialog));
        reservationTimeDialog.getP2p_time_selector().setSelectTimeQuantumListener(new n(reservationTimeDialog));
    }
}
