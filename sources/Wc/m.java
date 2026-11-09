package Wc;

import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import java.util.ArrayList;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f10687j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f10688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f10689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f10690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f10691d = new l(new ArrayList(), this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f10692e = new l(new ArrayList(), this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f10693f = new l(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f10694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f10695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ReservationTimeDialog f10696i;

    static {
        r rVar = new r("serverTime", "getServerTime()J", m.class);
        G.f38952a.getClass();
        f10687j = new KProperty[]{rVar, new r("timeQuantumData", "getTimeQuantumData()Ljava/util/ArrayList;", m.class), new r("timeQuantumData2", "getTimeQuantumData2()Ljava/util/ArrayList;", m.class), new r("timeRangeData", "getTimeRangeData()Ljava/util/ArrayList;", m.class), new r("busyStatusData", "getBusyStatusData()Ljava/util/ArrayList;", m.class), new r("selectDateStamp", "getSelectDateStamp()J", m.class), new r("startTimestamp", "getStartTimestamp()J", m.class), new r("endTimestamp", "getEndTimestamp()J", m.class)};
    }

    public m(ReservationTimeDialog reservationTimeDialog) {
        this.f10696i = reservationTimeDialog;
        this.f10688a = new k(Long.valueOf(System.currentTimeMillis()), reservationTimeDialog, 0);
        this.f10689b = new k(new ArrayList(), reservationTimeDialog, 1);
        this.f10690c = new k(new ArrayList(), reservationTimeDialog, 2);
        this.f10694g = new k(reservationTimeDialog, 3);
        this.f10695h = new k(reservationTimeDialog, 4);
    }
}
