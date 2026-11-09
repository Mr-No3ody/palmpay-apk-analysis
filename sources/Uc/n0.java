package Uc;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(ArrayList arrayList, NearbyAgent2Page nearbyAgent2Page, int i7) {
        super(arrayList);
        this.f9690a = i7;
        this.f9691b = nearbyAgent2Page;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        final int i7 = 1;
        NearbyAgent2Page nearbyAgent2Page = this.f9691b;
        final int i10 = 0;
        int i11 = this.f9690a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i11) {
            case 0:
                ((C0664j0) nearbyAgent2Page.f32899Z.getValue()).notifyDataSetChanged();
                break;
            default:
                int i12 = NearbyAgent2Page.f32889k0;
                w0 w0VarP = nearbyAgent2Page.p();
                w0VarP.getClass();
                final NearbyAgent2Page nearbyAgent2Page2 = w0VarP.f9734b;
                o0 o0VarN = nearbyAgent2Page2.n();
                o0VarN.getClass();
                KProperty<?>[] kPropertyArr = o0.f9695j;
                boolean zIsEmpty = ((ArrayList) o0VarN.f9702g.getValue(o0VarN, kPropertyArr[2])).isEmpty();
                p355xf.t tVar = nearbyAgent2Page2.f32905f;
                p355xf.t tVar2 = nearbyAgent2Page2.t;
                if (!zIsEmpty) {
                    Object value = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    p220oa.h.c((CardView) value);
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    p220oa.h.c((CardView) value2);
                    o0 o0VarN2 = nearbyAgent2Page2.n();
                    o0VarN2.getClass();
                    Object obj3 = ((ArrayList) o0VarN2.f9702g.getValue(o0VarN2, kPropertyArr[2])).get(0);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    final Vc.c cVar = (Vc.c) obj3;
                    if (cVar.q() != 9) {
                        Object value3 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        final CardView cardView = (CardView) value3;
                        p220oa.h.C(cardView);
                        new t0(nearbyAgent2Page2, i10).invoke(Long.valueOf(cVar.j()), Long.valueOf(cVar.p()), Long.valueOf(cVar.m()));
                        p355xf.t tVar3 = nearbyAgent2Page2.f32908j;
                        Object value4 = tVar3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((TextView) value4).setText(cVar.e());
                        Object value5 = tVar3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        Pa.r0.R1((TextView) value5, "fonts/PalmPayNum-Bold.ttf");
                        boolean zT = cVar.t();
                        p355xf.t tVar4 = nearbyAgent2Page2.f32910p;
                        if (zT) {
                            Object value6 = tVar4.getValue();
                            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                            p220oa.h.C((CardView) value6);
                        } else {
                            Object value7 = tVar4.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            p220oa.h.c((CardView) value7);
                        }
                        Object value8 = nearbyAgent2Page2.f32907i.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ((CardView) value8).setOnClickListener(new View.OnClickListener() { // from class: Uc.r0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Vc.c cVar2 = cVar;
                                NearbyAgent2Page nearbyAgent2Page3 = nearbyAgent2Page2;
                                switch (i7) {
                                    case 0:
                                        int i13 = NearbyAgent2Page.f32889k0;
                                        x0 x0VarQ = nearbyAgent2Page3.q();
                                        String bookingId = cVar2.r();
                                        x0VarQ.getClass();
                                        Intrinsics.checkNotNullParameter("", "agentName");
                                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                                        NearbyAgent2Page nearbyAgent2Page4 = x0VarQ.f9737a;
                                        Intrinsics.checkNotNullParameter(nearbyAgent2Page4, "<this>");
                                        Intent intent = new Intent(nearbyAgent2Page4, (Class<?>) CashierDeskPage.class);
                                        intent.putExtra("BOOKING_ID", bookingId);
                                        intent.putExtra("TYPE", 2);
                                        intent.putExtra("AGENT_NAME", "");
                                        intent.putExtra("AMOUNT", 0L);
                                        intent.putExtra("IS_SHOW_CHANGE_LABEL", false);
                                        nearbyAgent2Page4.startActivity(intent);
                                        break;
                                    default:
                                        int i14 = NearbyAgent2Page.f32889k0;
                                        x0 x0VarQ2 = nearbyAgent2Page3.q();
                                        String id2 = cVar2.r();
                                        x0VarQ2.getClass();
                                        Intrinsics.checkNotNullParameter(id2, "id");
                                        NearbyAgent2Page nearbyAgent2Page5 = x0VarQ2.f9737a;
                                        Intrinsics.checkNotNullParameter(nearbyAgent2Page5, "<this>");
                                        Intent intent2 = new Intent(nearbyAgent2Page5, (Class<?>) BookingDetailPage.class);
                                        intent2.putExtra("APPOINTMENT_ORDER_ID", id2);
                                        nearbyAgent2Page5.startActivity(intent2);
                                        break;
                                }
                            }
                        });
                        Object value9 = nearbyAgent2Page2.f32906g.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        ((ImageView) value9).setOnClickListener(new View.OnClickListener() { // from class: Uc.s0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        p220oa.h.c(cardView);
                                        break;
                                    default:
                                        p220oa.h.c(cardView);
                                        break;
                                }
                            }
                        });
                    } else {
                        Object value10 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        final CardView cardView2 = (CardView) value10;
                        p220oa.h.C(cardView2);
                        Object value11 = nearbyAgent2Page2.f32904e.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ((TextView) value11).setText(Pa.r0.B(cVar.d(), false));
                        boolean zS = cVar.s();
                        p355xf.t tVar5 = nearbyAgent2Page2.f32901b;
                        if (zS) {
                            Object value12 = tVar5.getValue();
                            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                            p220oa.h.C((CardView) value12);
                        } else {
                            Object value13 = tVar5.getValue();
                            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                            p220oa.h.c((CardView) value13);
                        }
                        Object value14 = nearbyAgent2Page2.f32903d.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ((CardView) value14).setOnClickListener(new View.OnClickListener() { // from class: Uc.r0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Vc.c cVar2 = cVar;
                                NearbyAgent2Page nearbyAgent2Page3 = nearbyAgent2Page2;
                                switch (i10) {
                                    case 0:
                                        int i13 = NearbyAgent2Page.f32889k0;
                                        x0 x0VarQ = nearbyAgent2Page3.q();
                                        String bookingId = cVar2.r();
                                        x0VarQ.getClass();
                                        Intrinsics.checkNotNullParameter("", "agentName");
                                        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                                        NearbyAgent2Page nearbyAgent2Page4 = x0VarQ.f9737a;
                                        Intrinsics.checkNotNullParameter(nearbyAgent2Page4, "<this>");
                                        Intent intent = new Intent(nearbyAgent2Page4, (Class<?>) CashierDeskPage.class);
                                        intent.putExtra("BOOKING_ID", bookingId);
                                        intent.putExtra("TYPE", 2);
                                        intent.putExtra("AGENT_NAME", "");
                                        intent.putExtra("AMOUNT", 0L);
                                        intent.putExtra("IS_SHOW_CHANGE_LABEL", false);
                                        nearbyAgent2Page4.startActivity(intent);
                                        break;
                                    default:
                                        int i14 = NearbyAgent2Page.f32889k0;
                                        x0 x0VarQ2 = nearbyAgent2Page3.q();
                                        String id2 = cVar2.r();
                                        x0VarQ2.getClass();
                                        Intrinsics.checkNotNullParameter(id2, "id");
                                        NearbyAgent2Page nearbyAgent2Page5 = x0VarQ2.f9737a;
                                        Intrinsics.checkNotNullParameter(nearbyAgent2Page5, "<this>");
                                        Intent intent2 = new Intent(nearbyAgent2Page5, (Class<?>) BookingDetailPage.class);
                                        intent2.putExtra("APPOINTMENT_ORDER_ID", id2);
                                        nearbyAgent2Page5.startActivity(intent2);
                                        break;
                                }
                            }
                        });
                        Object value15 = nearbyAgent2Page2.f32902c.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ((ImageView) value15).setOnClickListener(new View.OnClickListener() { // from class: Uc.s0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        p220oa.h.c(cardView2);
                                        break;
                                    default:
                                        p220oa.h.c(cardView2);
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    Object value16 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                    p220oa.h.c((CardView) value16);
                    Object value17 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                    p220oa.h.c((CardView) value17);
                }
                break;
        }
    }
}
