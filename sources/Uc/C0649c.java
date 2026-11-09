package Uc;

import Pa.r0;
import android.graphics.Color;
import android.os.Handler;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentHistoryResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AgentItemView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointDetailView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.BookingDetailView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.TimeCountView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Uc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0649c extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9620a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649c(C0651d c0651d, BookingDetailPage bookingDetailPage) {
        super(null);
        this.f9621b = c0651d;
        this.f9622c = bookingDetailPage;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        int i7;
        String string;
        SpannableString spannableString;
        int i10;
        int i11 = 9;
        Object obj3 = this.f9622c;
        Object obj4 = this.f9621b;
        int i12 = 1;
        int i13 = this.f9620a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i13) {
            case 0:
                QueryAppointmentDetailResp.DataBean dataBean = (QueryAppointmentDetailResp.DataBean) obj2;
                Intrinsics.f(dataBean, "null cannot be cast to non-null type com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp.DataBean");
                Vc.c cVar = new Vc.c();
                int i14 = dataBean.orderStatus;
                C0651d c0651d = (C0651d) obj4;
                c0651d.getClass();
                if (i14 == 1) {
                    i7 = 1;
                } else if (i14 == 4) {
                    i7 = 2;
                } else if (i14 != 9) {
                    i7 = i14 != 13 ? 5 : 4;
                } else {
                    i7 = 3;
                }
                cVar.N(i7);
                cVar.E(dataBean.systemTime);
                cVar.J(System.currentTimeMillis());
                cVar.M(dataBean.bookingStartTime);
                cVar.H(dataBean.bookingEndTime);
                cVar.K(dataBean.missType);
                cVar.F(dataBean.depositMoney);
                cVar.v(dataBean.bookingMoney);
                cVar.z(dataBean.changeAmountType);
                cVar.y(dataBean.bookingCode);
                cVar.D(dataBean.createTime);
                cVar.I(dataBean.finishTime);
                cVar.C(dataBean.completionTime);
                cVar.A(dataBean.chronologyBeginTime);
                cVar.B(dataBean.chronologyEndTime);
                String orderNo = dataBean.orderNo;
                Intrinsics.checkNotNullExpressionValue(orderNo, "orderNo");
                cVar.O(orderNo);
                Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                c0651d.f9626b = cVar;
                Vc.a aVar = new Vc.a();
                aVar.s(dataBean.merchantName);
                aVar.m(dataBean.networkAddress);
                aVar.u(dataBean.merchantPhone);
                aVar.q(dataBean.latitude);
                aVar.r(dataBean.longitude);
                Intrinsics.checkNotNullParameter(aVar, "<set-?>");
                c0651d.f9627c = aVar;
                int i15 = BookingDetailPage.f32801H;
                C0659h c0659hR = ((BookingDetailPage) obj3).r();
                BookingDetailPage bookingDetailPage = c0659hR.f9648a;
                Object value = bookingDetailPage.f32812i.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                p220oa.h.C((ImageView) value);
                p355xf.t tVar = bookingDetailPage.f32810f;
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                AppointDetailView appointDetailView = (AppointDetailView) value2;
                appointDetailView.f32948c.setVisibility(0);
                appointDetailView.f32953i.setVisibility(0);
                p355xf.t tVar2 = bookingDetailPage.f32809e;
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                AgentItemView agentItemView = (AgentItemView) value3;
                agentItemView.f32938d.setVisibility(0);
                agentItemView.f32939e.setVisibility(0);
                int iQ = bookingDetailPage.q().b().q();
                if (iQ == 1) {
                    p220oa.h.C(bookingDetailPage.s());
                    TimeCountView timeCountViewS = bookingDetailPage.s();
                    long jF = bookingDetailPage.q().b().f();
                    long jG = bookingDetailPage.q().b().g();
                    timeCountViewS.f33056e = jF;
                    timeCountViewS.f33057f = jG;
                    TimeCountView timeCountViewS2 = bookingDetailPage.s();
                    long j6 = bookingDetailPage.q().b().j();
                    long jN = bookingDetailPage.q().b().n();
                    timeCountViewS2.f33058g = j6;
                    timeCountViewS2.f33059i = jN;
                    He.a aVar2 = bookingDetailPage.s().f33060j;
                    ((Handler) aVar2.f3865c).removeCallbacksAndMessages(null);
                    aVar2.f3864b = false;
                    He.a aVar3 = bookingDetailPage.s().f33060j;
                    ((Handler) aVar3.f3865c).post(new W8.o(aVar3, 5));
                } else if (iQ != 3) {
                    p220oa.h.c(bookingDetailPage.s());
                } else {
                    p220oa.h.C(bookingDetailPage.s());
                    TimeCountView timeCountViewS3 = bookingDetailPage.s();
                    long jF2 = bookingDetailPage.q().b().f();
                    long jG2 = bookingDetailPage.q().b().g();
                    timeCountViewS3.f33056e = jF2;
                    timeCountViewS3.f33057f = jG2;
                    TimeCountView timeCountViewS4 = bookingDetailPage.s();
                    long j10 = bookingDetailPage.q().b().j();
                    long jN2 = bookingDetailPage.q().b().n();
                    timeCountViewS4.f33058g = j10;
                    timeCountViewS4.f33059i = jN2;
                    He.a aVar4 = bookingDetailPage.s().f33060j;
                    ((Handler) aVar4.f3865c).removeCallbacksAndMessages(null);
                    aVar4.f3864b = false;
                    He.a aVar5 = bookingDetailPage.s().f33060j;
                    ((Handler) aVar5.f3865c).post(new W8.o(aVar5, 5));
                }
                p355xf.t tVar3 = bookingDetailPage.f32813j;
                Object value4 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView = (TextView) value4;
                int iQ2 = bookingDetailPage.q().b().q();
                CharSequence charSequence = "";
                if (iQ2 == 1) {
                    string = bookingDetailPage.getString(Sc.e.p2p_str_awaiting_confirmation);
                } else if (iQ2 == 2) {
                    string = bookingDetailPage.getString(Sc.e.p2p_str_awaiting_withdrawal);
                } else if (iQ2 == 3) {
                    string = bookingDetailPage.getString(Sc.e.p2p_str_awaiting_payment);
                } else if (iQ2 != 4) {
                    string = iQ2 != 5 ? "" : bookingDetailPage.getString(p025ba.k.core_cancelled);
                } else {
                    string = bookingDetailPage.getString(p025ba.k.core_completed);
                }
                textView.setText(string);
                Object value5 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((TextView) value5).setOnClickListener(new R8.d(c0659hR, 25));
                int iQ3 = bookingDetailPage.q().b().q();
                if (iQ3 == 1) {
                    charSequence = "Booking deposit payment completed. Kindly wait for the Agent to confirm booking to receive your booking code";
                } else if (iQ3 == 2) {
                    if (bookingDetailPage.q().b().t()) {
                        spannableString = new SpannableString("Appointment has been extended by 4 hours. Please go as soon as possible");
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE5455")), 0, 71, 33);
                    } else {
                        int i16 = 0;
                        spannableString = new SpannableString("Please visit the Agent location at the appointment time with your Booking Code to pick up your notes. Fund balance in advance to reduce the waiting time at location");
                        int iE = StringsKt.E("Please visit the Agent location at the appointment time with your Booking Code to pick up your notes. Fund balance in advance to reduce the waiting time at location", "Fund balance", 0, false, 6);
                        int i17 = iE + 12;
                        if (iE >= 0) {
                            spannableString.setSpan(new C0657g(bookingDetailPage, i16), iE, i17, 33);
                        }
                    }
                    charSequence = spannableString;
                } else if (iQ3 == 3) {
                    charSequence = "The system has initiated a payment request. Booking will be cancelled if payment is not made within 10 minutes and the booking fee will not be refunded";
                } else if (iQ3 == 4) {
                    charSequence = "Payment Completed, please collect your notes from the Agent";
                } else if (iQ3 == 5) {
                    QueryAppointmentDetailResp.DataBean dataBeanC = bookingDetailPage.q().c();
                    Integer numValueOf = dataBeanC != null ? Integer.valueOf(dataBeanC.orderStatus) : null;
                    if ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 5)) {
                        charSequence = "You canceled the reservation order, the deposit you paid will be refunded in the same way you paid it";
                    } else if (numValueOf != null && numValueOf.intValue() == 3) {
                        charSequence = "Sorry, the Agent declined your booking. The booking deposit will be refunded into your PalmPay Balance";
                    } else if ((numValueOf != null && numValueOf.intValue() == 6) || ((numValueOf != null && numValueOf.intValue() == 7) || ((numValueOf != null && numValueOf.intValue() == 8) || (numValueOf != null && numValueOf.intValue() == 10)))) {
                        charSequence = "Your booking has been cancelled however, the booking deposit will not be refunded";
                    } else if ((numValueOf != null && numValueOf.intValue() == 14) || (numValueOf != null && numValueOf.intValue() == 15)) {
                        charSequence = "Sorry, this withdrawal booking has been cancelled by the agent. Your booking deposit will be refunded to the payment method you used. Kindly try again with another location";
                    }
                }
                int color = Color.parseColor("#99202046");
                int color2 = Color.parseColor("#FE5455");
                if (bookingDetailPage.q().b().q() == 2 && bookingDetailPage.q().b().t()) {
                    BookingDetailPage.o(bookingDetailPage).setTextColor(color2);
                } else {
                    BookingDetailPage.o(bookingDetailPage).setTextColor(color);
                }
                BookingDetailPage.o(bookingDetailPage).setText(charSequence);
                try {
                    BookingDetailPage.o(bookingDetailPage).setMovementMethod(LinkMovementMethod.getInstance());
                    BookingDetailPage.o(bookingDetailPage).setHighlightColor(0);
                    break;
                } catch (Exception unused) {
                }
                Object value6 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((AppointDetailView) value6).b(bookingDetailPage.q().b().q(), bookingDetailPage.q().b().j(), bookingDetailPage.q().b().p(), bookingDetailPage.q().b().m(), bookingDetailPage.q().b().t(), bookingDetailPage.q().b().e());
                Object value7 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                final AgentItemView agentItemView2 = (AgentItemView) value7;
                agentItemView2.setName(bookingDetailPage.q().a().g());
                agentItemView2.setAddress(bookingDetailPage.q().a().b());
                agentItemView2.setPhone(bookingDetailPage.q().a().i());
                final double dE = bookingDetailPage.q().a().e();
                final double dF = bookingDetailPage.q().a().f();
                agentItemView2.f32939e.setOnClickListener(new View.OnClickListener() { // from class: Xc.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r0.P0(agentItemView2.f32935a, dE, dF);
                    }
                });
                Object value8 = bookingDetailPage.f32808d.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                BookingDetailView bookingDetailView = (BookingDetailView) value8;
                bookingDetailView.setBookAmount(bookingDetailPage.q().b().b());
                long jK = bookingDetailPage.q().b().k();
                bookingDetailView.f32966b.setName("Booking Deposit");
                bookingDetailView.f32966b.setValue(Pa.r0.B(jK, false));
                if (bookingDetailPage.q().b().q() == 4) {
                    bookingDetailView.setPaymentAmount(bookingDetailPage.q().b().b() - bookingDetailPage.q().b().k());
                } else {
                    bookingDetailView.setPaymentAmount(0L);
                }
                bookingDetailView.f32972i.setVisibility(bookingDetailPage.q().b().s() ? 0 : 8);
                QueryAppointmentDetailResp.DataBean dataBeanC2 = bookingDetailPage.q().c();
                Intrinsics.e(dataBeanC2);
                boolean z3 = dataBeanC2.payStatus == 21;
                M7.s sVar = new M7.s(bookingDetailPage, 18);
                bookingDetailView.f32968d.f33021e.setVisibility(z3 ? 0 : 8);
                bookingDetailView.f32968d.setName("Payment Detail");
                bookingDetailView.f32968d.setAction(sVar);
                bookingDetailView.setBookingID(bookingDetailPage.q().b().r());
                bookingDetailView.setStartTime(bookingDetailPage.q().b().i());
                if (bookingDetailPage.q().b().q() == 4 || bookingDetailPage.q().b().q() == 5) {
                    bookingDetailView.setCompletedTime(bookingDetailPage.q().b().h());
                } else {
                    bookingDetailView.setCompletedTime(0L);
                }
                int iQ4 = bookingDetailPage.q().b().q();
                if (iQ4 == 1 || iQ4 == 2) {
                    p220oa.h.C(BookingDetailPage.m(bookingDetailPage));
                    p220oa.h.C(BookingDetailPage.n(bookingDetailPage));
                    p220oa.h.c(BookingDetailPage.p(bookingDetailPage));
                } else if (iQ4 == 3) {
                    p220oa.h.C(BookingDetailPage.m(bookingDetailPage));
                    p220oa.h.C(BookingDetailPage.n(bookingDetailPage));
                    p220oa.h.C(BookingDetailPage.p(bookingDetailPage));
                } else if (iQ4 == 4 || iQ4 == 5) {
                    p220oa.h.c(BookingDetailPage.m(bookingDetailPage));
                }
                BookingDetailPage.n(bookingDetailPage).setOnP2PButtonClickListener(new C0655f(bookingDetailPage, i12));
                BookingDetailPage.p(bookingDetailPage).setOnP2PButtonClickListener(new C0655f(bookingDetailPage, 2));
                break;
            default:
                ArrayList<QueryAppointmentHistoryResp.ListBean> arrayList = (ArrayList) obj2;
                BookingHistoryPage bookingHistoryPage = (BookingHistoryPage) obj4;
                C0670n c0670n = (C0670n) bookingHistoryPage.t.getValue();
                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(arrayList, 10));
                for (QueryAppointmentHistoryResp.ListBean listBean : arrayList) {
                    Vc.c cVar2 = new Vc.c();
                    int i18 = listBean.orderStatus;
                    ((C0672p) obj3).getClass();
                    if (i18 == 1) {
                        i10 = 1;
                    } else if (i18 == 4) {
                        i10 = 2;
                    } else if (i18 != i11) {
                        i10 = i18 != 13 ? 5 : 4;
                    } else {
                        i10 = 3;
                    }
                    cVar2.N(i10);
                    cVar2.E(listBean.systemTime);
                    cVar2.w(listBean.bookingStartTime);
                    cVar2.L(0);
                    cVar2.G(0);
                    cVar2.M(listBean.bookingStartTime);
                    cVar2.H(listBean.bookingEndTime);
                    cVar2.K(listBean.missType);
                    cVar2.u(listBean.merchantName);
                    cVar2.v(listBean.bookingMoney);
                    cVar2.y(listBean.bookingCode);
                    cVar2.z(listBean.changeAmountType);
                    String orderNo2 = listBean.orderNo;
                    Intrinsics.checkNotNullExpressionValue(orderNo2, "orderNo");
                    cVar2.O(orderNo2);
                    arrayList2.add(cVar2);
                    i11 = 9;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                c0670n.getClass();
                Intrinsics.checkNotNullParameter(arrayList3, "<set-?>");
                c0670n.f9688a.setValue(c0670n, C0670n.f9687c[0], arrayList3);
                if (arrayList.isEmpty()) {
                    Object value9 = bookingHistoryPage.n().f9723a.f32826i.getValue();
                    Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                    p220oa.h.c((FrameLayout) value9);
                } else {
                    Object value10 = bookingHistoryPage.n().f9723a.f32826i.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    p220oa.h.C((FrameLayout) value10);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649c(ArrayList arrayList, BookingHistoryPage bookingHistoryPage, C0672p c0672p) {
        super(arrayList);
        this.f9621b = bookingHistoryPage;
        this.f9622c = c0672p;
    }
}
