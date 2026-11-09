package Uc;

import android.content.Intent;
import android.view.KeyEvent;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f9532c;

    public /* synthetic */ B(int i7, KeyEvent.Callback callback, Object obj) {
        this.f9530a = i7;
        this.f9531b = obj;
        this.f9532c = callback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KeyEvent.Callback callback = this.f9532c;
        Object obj3 = this.f9531b;
        switch (this.f9530a) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                ((ReservationTimeDialog) obj3).dismiss();
                D d2 = (D) ((BookingNotesPage) callback).f32843w.getValue();
                d2.getClass();
                BookingNotesPage bookingNotesPage = d2.f9536a;
                Intrinsics.checkNotNullParameter(bookingNotesPage, "<this>");
                Intent intent = new Intent(bookingNotesPage, (Class<?>) CashierDeskPage.class);
                intent.putExtra("TYPE", 3);
                int i7 = BookingNotesPage.f32830A;
                intent.putExtra("AGENT_ID", bookingNotesPage.n().a().agentId);
                intent.putExtra("AGENT_SHOP_ID", bookingNotesPage.n().a().shopId);
                C0681z c0681zN = bookingNotesPage.n();
                intent.putExtra("BOOKING_AMOUNT", ((Number) c0681zN.f9745c.getValue(c0681zN, C0681z.f9742f[1])).longValue());
                intent.putExtra("START_TIME", jLongValue);
                intent.putExtra("END_TIME", jLongValue2);
                intent.putExtra("NOTES_FLAG", bookingNotesPage.n().f9746d);
                bookingNotesPage.startActivity(intent);
                return Unit.f38893a;
            default:
                return ModelMobileWithIconInputLayout.initModelInputRegexData$lambda$22$lambda$21((Function2) obj3, (ModelMobileWithIconInputLayout) callback, (List) obj, (Function0) obj2);
        }
    }
}
