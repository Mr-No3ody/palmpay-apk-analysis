package Uc;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.p2pcash.bean.rsp.CommonMoneyListResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0680y extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookingNotesPage f9739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680y(BookingNotesPage bookingNotesPage, int i7) {
        super(null);
        this.f9738a = i7;
        switch (i7) {
            case 1:
                this.f9739b = bookingNotesPage;
                super(0L);
                break;
            default:
                this.f9739b = bookingNotesPage;
                break;
        }
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        BookingNotesPage bookingNotesPage = this.f9739b;
        int i7 = this.f9738a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i7) {
            case 0:
                int i10 = BookingNotesPage.f32830A;
                BookingNotesPage bookingNotesPage2 = bookingNotesPage.o().f9534a;
                P2PInputAmountView p2PInputAmountViewM = BookingNotesPage.m(bookingNotesPage2);
                C0681z c0681zN = bookingNotesPage2.n();
                C0680y c0680y = c0681zN.f9744b;
                KProperty<?>[] kPropertyArr = C0681z.f9742f;
                CommonMoneyListResp.DataBean dataBean = (CommonMoneyListResp.DataBean) c0680y.getValue(c0681zN, kPropertyArr[0]);
                Intrinsics.e(dataBean);
                p2PInputAmountViewM.setData(dataBean.commontMoey);
                BookingNotesPage.m(bookingNotesPage2).setListener(new A(bookingNotesPage2));
                P2PInputAmountView p2PInputAmountViewM2 = BookingNotesPage.m(bookingNotesPage2);
                C0681z c0681zN2 = bookingNotesPage2.n();
                CommonMoneyListResp.DataBean dataBean2 = (CommonMoneyListResp.DataBean) c0681zN2.f9744b.getValue(c0681zN2, kPropertyArr[0]);
                Intrinsics.e(dataBean2);
                long j6 = dataBean2.startMoney;
                C0681z c0681zN3 = bookingNotesPage2.n();
                CommonMoneyListResp.DataBean dataBean3 = (CommonMoneyListResp.DataBean) c0681zN3.f9744b.getValue(c0681zN3, kPropertyArr[0]);
                Intrinsics.e(dataBean3);
                long j10 = dataBean3.endMoney;
                p2PInputAmountViewM2.f33014o = j6;
                p2PInputAmountViewM2.f33015p = j10;
                String strE = Pa.r0.E(j6);
                p2PInputAmountViewM2.f33007c.setHint(String.format("%1$s~%2$s", strE, Pa.r0.E(j10)));
                p2PInputAmountViewM2.f33009e.setText(String.format("Amount should be above %1$s%2$s", BaseApplication.getCurrencySymbol(), strE));
                break;
            default:
                ((Number) obj2).longValue();
                ((Number) obj).longValue();
                int i11 = BookingNotesPage.f32830A;
                C cO = bookingNotesPage.o();
                cO.getClass();
                BookingNotesPage bookingNotesPage3 = cO.f9534a;
                C0681z c0681zN4 = bookingNotesPage3.n();
                long jLongValue = ((Number) c0681zN4.f9745c.getValue(c0681zN4, C0681z.f9742f[1])).longValue();
                p355xf.t tVar = bookingNotesPage3.f32832b;
                if (jLongValue == 0) {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((P2PButton) value).setStatus(2);
                } else {
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((P2PButton) value2).setStatus(1);
                }
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((P2PButton) value3).setOnP2PButtonClickListener(new A(bookingNotesPage3));
                break;
        }
    }
}
