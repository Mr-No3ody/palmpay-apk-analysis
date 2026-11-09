package Uc;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PDashLine;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0670n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9687c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S3.c f9688a = new S3.c(new ArrayList(), this, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookingHistoryPage f9689b;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData()Ljava/util/ArrayList;", C0670n.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9687c = new KProperty[]{rVar};
    }

    public C0670n(BookingHistoryPage bookingHistoryPage) {
        this.f9689b = bookingHistoryPage;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f9688a.getValue(this, f9687c[0])).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C0669m holder = (C0669m) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        C0670n c0670n = holder.t;
        final BookingHistoryPage bookingHistoryPage = c0670n.f9689b;
        M3.f fVar = new M3.f(holder, 23);
        Object obj = ((ArrayList) c0670n.f9688a.getValue(c0670n, f9687c[0])).get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final Vc.c cVar = (Vc.c) obj;
        fVar.invoke();
        int iQ = cVar.q();
        p355xf.t tVar = holder.f9673a;
        if (iQ != 1) {
            p355xf.t tVar2 = holder.f9677e;
            if (iQ == 2) {
                boolean zT = cVar.t();
                p355xf.t tVar3 = holder.f9683p;
                if (zT) {
                    Object value = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    p220oa.h.C((CardView) value);
                } else {
                    Object value2 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    p220oa.h.c((CardView) value2);
                }
                holder.a().setText(bookingHistoryPage.getString(Sc.e.p2p_str_awaiting_withdrawal));
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                p220oa.h.C((P2PDashLine) value3);
                Object value4 = holder.f9675c.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                p220oa.h.C((LinearLayout) value4);
            } else if (iQ != 3) {
                p355xf.t tVar4 = holder.f9680i;
                if (iQ == 4) {
                    Object value5 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((CardView) value5).setCardBackgroundColor(bookingHistoryPage.getColor(L6.b.ppColorBackgroundDark));
                    holder.a().setTextColor(Color.parseColor("#858A8F"));
                    holder.a().setText(bookingHistoryPage.getString(p025ba.k.core_completed));
                } else if (iQ == 5) {
                    Object value6 = tVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    ((CardView) value6).setCardBackgroundColor(bookingHistoryPage.getColor(L6.b.ppColorBackgroundDark));
                    holder.a().setTextColor(Color.parseColor("#858A8F"));
                    holder.a().setText(bookingHistoryPage.getString(p025ba.k.core_cancelled));
                }
            } else {
                boolean zS = cVar.s();
                p355xf.t tVar5 = holder.f9676d;
                if (zS) {
                    Object value7 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    p220oa.h.C((CardView) value7);
                } else {
                    Object value8 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    p220oa.h.c((CardView) value8);
                }
                holder.a().setText(bookingHistoryPage.getString(Sc.e.p2p_str_awaiting_payment));
                Object value9 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                p220oa.h.C((P2PDashLine) value9);
                Object value10 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                p220oa.h.C((CardView) value10);
            }
        } else {
            holder.a().setText(bookingHistoryPage.getString(Sc.e.p2p_str_awaiting_confirmation));
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(cVar.p());
        cVar.L(calendar.get(11));
        calendar.setTimeInMillis(cVar.m());
        cVar.G(calendar.get(11));
        String strN = androidx.camera.video.u.n(androidx.camera.core.impl.utils.executor.g.m(cVar.j(), cVar.c()), " ", cVar.o() <= 12 ? androidx.camera.video.u.g(cVar.o(), "am") : androidx.camera.video.u.g(cVar.o() - 12, "pm"), "-", cVar.l() <= 12 ? androidx.camera.video.u.g(cVar.l(), "am") : androidx.camera.video.u.g(cVar.l() - 12, "pm"));
        Object value11 = holder.f9682o.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        ((TextView) value11).setText(strN);
        Object value12 = holder.f9681j.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        ((TextView) value12).setText(cVar.a());
        Object value13 = holder.f9678f.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        ((TextView) value13).setText(Pa.r0.B(cVar.b(), false));
        Object value14 = holder.f9674b.getValue();
        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
        ((TextView) value14).setText(cVar.e());
        Object value15 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
        final int i10 = 0;
        ((CardView) value15).setOnClickListener(new View.OnClickListener() { // from class: Uc.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        C0676u c0676u = (C0676u) bookingHistoryPage.f32829p.getValue();
                        String bookingId = cVar.r();
                        c0676u.getClass();
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        BookingHistoryPage bookingHistoryPage2 = c0676u.f9726a;
                        Intrinsics.checkNotNullParameter(bookingHistoryPage2, "<this>");
                        Intent intent = new Intent(bookingHistoryPage2, (Class<?>) CashierDeskPage.class);
                        intent.putExtra("TYPE", 2);
                        intent.putExtra("BOOKING_ID", bookingId);
                        bookingHistoryPage2.startActivity(intent);
                        break;
                    default:
                        C0676u c0676u2 = (C0676u) bookingHistoryPage.f32829p.getValue();
                        String id2 = cVar.r();
                        c0676u2.getClass();
                        Intrinsics.checkNotNullParameter(id2, "id");
                        BookingHistoryPage bookingHistoryPage3 = c0676u2.f9726a;
                        Intrinsics.checkNotNullParameter(bookingHistoryPage3, "<this>");
                        Intent intent2 = new Intent(bookingHistoryPage3, (Class<?>) BookingDetailPage.class);
                        intent2.putExtra("APPOINTMENT_ORDER_ID", id2);
                        bookingHistoryPage3.startActivity(intent2);
                        break;
                }
            }
        });
        final int i11 = 1;
        view.setOnClickListener(new View.OnClickListener() { // from class: Uc.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        C0676u c0676u = (C0676u) bookingHistoryPage.f32829p.getValue();
                        String bookingId = cVar.r();
                        c0676u.getClass();
                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                        BookingHistoryPage bookingHistoryPage2 = c0676u.f9726a;
                        Intrinsics.checkNotNullParameter(bookingHistoryPage2, "<this>");
                        Intent intent = new Intent(bookingHistoryPage2, (Class<?>) CashierDeskPage.class);
                        intent.putExtra("TYPE", 2);
                        intent.putExtra("BOOKING_ID", bookingId);
                        bookingHistoryPage2.startActivity(intent);
                        break;
                    default:
                        C0676u c0676u2 = (C0676u) bookingHistoryPage.f32829p.getValue();
                        String id2 = cVar.r();
                        c0676u2.getClass();
                        Intrinsics.checkNotNullParameter(id2, "id");
                        BookingHistoryPage bookingHistoryPage3 = c0676u2.f9726a;
                        Intrinsics.checkNotNullParameter(bookingHistoryPage3, "<this>");
                        Intent intent2 = new Intent(bookingHistoryPage3, (Class<?>) BookingDetailPage.class);
                        intent2.putExtra("APPOINTMENT_ORDER_ID", id2);
                        bookingHistoryPage3.startActivity(intent2);
                        break;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BookingHistoryPage bookingHistoryPage = this.f9689b;
        Intrinsics.checkNotNullParameter(bookingHistoryPage, "<this>");
        View viewInflate = LayoutInflater.from(bookingHistoryPage).inflate(Sc.c.p2p_booking_history_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new C0669m(this, viewInflate);
    }
}
