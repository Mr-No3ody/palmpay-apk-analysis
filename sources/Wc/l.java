package Wc;

import com.transsnet.palmpay.p2pcash.bean.req.QueryAppointmentTimeBusinessCountReq;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeBusinessCountResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeResp;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f10686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ArrayList arrayList, m mVar, int i7) {
        super(arrayList);
        this.f10685a = i7;
        this.f10686b = mVar;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f10685a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean z3 = true;
                    if (!it.hasNext()) {
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        m mVar = this.f10686b;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(arrayList3, "<set-?>");
                        mVar.f10689b.setValue(mVar, m.f10687j[1], arrayList3);
                    } else {
                        QueryAppointmentTimeResp.TimeRangeListBean timeRangeListBean = (QueryAppointmentTimeResp.TimeRangeListBean) it.next();
                        Xc.d dVar = new Xc.d();
                        dVar.f11118a = timeRangeListBean.beginTime;
                        dVar.f11119b = timeRangeListBean.endTime;
                        if (timeRangeListBean.businessFlag == null) {
                            z3 = false;
                        }
                        dVar.f11120c = z3;
                        arrayList2.add(dVar);
                    }
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                ArrayList<QueryAppointmentTimeBusinessCountResp.DataBean> arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = new ArrayList(r.l(arrayList4, 10));
                for (QueryAppointmentTimeBusinessCountResp.DataBean dataBean : arrayList4) {
                    Xc.d dVar2 = new Xc.d();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(dataBean.startTime);
                    dVar2.f11118a = calendar.get(11);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(dataBean.endTime);
                    dVar2.f11119b = calendar2.get(11);
                    dVar2.f11120c = dataBean.businessFlag != null;
                    arrayList5.add(dVar2);
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                m mVar2 = this.f10686b;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(arrayList6, "<set-?>");
                mVar2.f10690c.setValue(mVar2, m.f10687j[2], arrayList6);
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                ((Number) obj2).longValue();
                ((Number) obj).longValue();
                m mVar3 = this.f10686b;
                mVar3.getClass();
                KProperty<?>[] kPropertyArr = m.f10687j;
                KProperty<?> kProperty = kPropertyArr[1];
                k kVar = mVar3.f10689b;
                if (!((ArrayList) kVar.getValue(mVar3, kProperty)).isEmpty()) {
                    ArrayList arrayList7 = (ArrayList) kVar.getValue(mVar3, kPropertyArr[1]);
                    ArrayList arrayList8 = new ArrayList(r.l(arrayList7, 10));
                    Iterator it2 = arrayList7.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        ReservationTimeDialog reservationTimeDialog = mVar3.f10696i;
                        if (!zHasNext) {
                            ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAppointmentTimeBusinessCount(arrayList8).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(reservationTimeDialog, mVar3));
                        } else {
                            Xc.d dVar3 = (Xc.d) it2.next();
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.setTimeInMillis(((Number) mVar3.f10693f.getValue(mVar3, m.f10687j[5])).longValue());
                            calendar3.set(12, 0);
                            calendar3.set(13, 0);
                            calendar3.set(14, 0);
                            calendar3.set(11, dVar3.f11118a);
                            long timeInMillis = calendar3.getTimeInMillis();
                            calendar3.set(11, dVar3.f11119b);
                            long timeInMillis2 = calendar3.getTimeInMillis();
                            QueryAppointmentTimeBusinessCountReq queryAppointmentTimeBusinessCountReq = new QueryAppointmentTimeBusinessCountReq();
                            queryAppointmentTimeBusinessCountReq.startTime = timeInMillis;
                            queryAppointmentTimeBusinessCountReq.endTime = timeInMillis2;
                            queryAppointmentTimeBusinessCountReq.shopId = reservationTimeDialog.agentShopId;
                            arrayList8.add(queryAppointmentTimeBusinessCountReq);
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(0L);
        this.f10685a = 2;
        this.f10686b = mVar;
    }
}
