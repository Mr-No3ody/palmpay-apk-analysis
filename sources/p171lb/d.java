package p171lb;

import C0.G;
import G8.a;
import N3.c;
import android.os.Handler;
import android.os.Looper;
import com.facebook.imageutils.BitmapUtil;
import com.google.api.Service;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.ui.activity.me.MeBalanceStatementActivity;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p155k9.h;
import p155k9.j;
import p155k9.l;
import p155k9.m;
import p155k9.n;
import p176lg.g;
import p176lg.o;
import p176lg.q;
import p176lg.u;
import p176lg.x;
import p186mb.b;
import p324va.e;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39303a;

    public /* synthetic */ d(int i7) {
        this.f39303a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39303a) {
            case 0:
                f fVar = new f();
                fVar.f39306a = Boolean.FALSE;
                return fVar;
            case 1:
                return a.t().queryDevice("");
            case 2:
                int i7 = MeBalanceStatementActivity.f34744g;
                return new ArrayList();
            case 3:
                int i10 = MeBalanceStatementActivity.f34744g;
                return new ArrayList();
            case 4:
                return x.f39401b;
            case 5:
                return q.f39393b;
            case 6:
                return o.f39391b;
            case 7:
                return u.f39399b;
            case 8:
                return g.f39378b;
            case 9:
                KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                return G.k();
            case 10:
                KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                return new j();
            case 11:
                KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                l lVar = new l();
                lVar.a(new c(8));
                lVar.a(new c(7));
                return lVar;
            case 12:
                KProperty[] kPropertyArr4 = ScheduleTopUpAddTaskFragment.f26549q0;
                return Unit.f38893a;
            case 13:
                KProperty[] kPropertyArr5 = ScheduleTopUpEditTaskFragment.f26566Y;
                return new j();
            case 14:
                return new n();
            case 15:
                return new n();
            case 16:
                m mVar = new m(Pd.d.qt_airtime_schedule_manager_list_item, null);
                mVar.addChildClickViewIds(Pd.c.tvTagName, Pd.c.ivEdit);
                return mVar;
            case 17:
                return CashierPayMethodRetryDialog.adapter_delegate$lambda$1();
            case 18:
                return CashierSelectPayMethodDialog.mAdapter_delegate$lambda$0();
            case 19:
                return CashierSelectPayMethodDialog.mPayMethods_delegate$lambda$1();
            case 20:
                b bVar = new b();
                bVar.f39633a = -1;
                return bVar;
            case 21:
                return new p186mb.d();
            case 22:
                int i11 = NotificationListV2Activity.f34749i;
                return new Handler(Looper.getMainLooper());
            case 23:
                int i12 = DailyFlashSalesView.f26582d;
                return new h(Pd.d.qt_item_rechagre_amount4, null);
            case 24:
                return (IApiCreditService) e.a().f43145a.b(IApiCreditService.class);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return (IApiCreditService) p077f4.n.f36398b.getInstance().a(IApiCreditService.class);
            case 26:
                Object objNewProxyInstance = Proxy.newProxyInstance(IApiCreditService.class.getClassLoader(), new Class[]{IApiCreditService.class}, new p221ob.d());
                Intrinsics.f(objNewProxyInstance, "null cannot be cast to non-null type com.transsnet.palmpay.credit.network.IApiCreditService");
                return (IApiCreditService) objNewProxyInstance;
            case 27:
                BitmapUtil bitmapUtil = BitmapUtil.INSTANCE;
                return new p058e0.b(12);
            case 28:
                int i13 = SelectBankActivity.f33187A;
                return new p173ld.n();
            default:
                int i14 = SelectBankActivity.f33187A;
                return new CopyOnWriteArrayList();
        }
    }
}
