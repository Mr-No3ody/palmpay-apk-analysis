package Wc;

import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReservationTimeDialog f10684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Serializable serializable, ReservationTimeDialog reservationTimeDialog, int i7) {
        super(serializable);
        this.f10683a = i7;
        this.f10684b = reservationTimeDialog;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f10683a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                ((Number) obj2).longValue();
                ((Number) obj).longValue();
                this.f10684b.getMU().b();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                this.f10684b.getMU().b();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                ReservationTimeDialog reservationTimeDialog = this.f10684b.getMU().f10698a;
                AppointmentTimeSelectorView p2p_time_selector = reservationTimeDialog.getP2p_time_selector();
                m md2 = reservationTimeDialog.getMD();
                p2p_time_selector.setTimeQuantum((ArrayList) md2.f10690c.getValue(md2, m.f10687j[2]));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                ((Number) obj2).longValue();
                ((Number) obj).longValue();
                this.f10684b.getMU().a();
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                ((Number) obj2).longValue();
                ((Number) obj).longValue();
                this.f10684b.getMU().a();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReservationTimeDialog reservationTimeDialog, int i7) {
        super(0L);
        this.f10683a = i7;
        switch (i7) {
            case 4:
                this.f10684b = reservationTimeDialog;
                super(0L);
                break;
            default:
                this.f10684b = reservationTimeDialog;
                break;
        }
    }
}
