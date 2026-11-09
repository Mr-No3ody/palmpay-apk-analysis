package com.transsnet.palmpay.managemoney.ui.view;

import Ac.f;
import N8.q0;
import Xd.v;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import com.flexibank.sdk.k;
import com.google.api.Service;
import com.palmpay.lib.webview.cache.service.DelegateManager;
import com.palmpay.lib.webview.cache.service.WebCacheMaster;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.USSDTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.core.ui.activity.Z;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashRecordActivity;
import com.transsnet.palmpay.ui.activity.AllFuncationActivityV2;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterTypeActivity;
import com.transsnet.palmpay.util.PerfTimer;
import j4.s;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p052da.C1650w;
import p077f4.l;
import p077f4.n;
import p155k9.r;
import p328ve.e;
import p328ve.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32713a;

    public /* synthetic */ c(int i7) {
        this.f32713a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.f32713a) {
            case 0:
                return Unit.f38893a;
            case 1:
                ScreenDummyLayoutHelper.a aVar = ScreenDummyLayoutHelper.f25479o;
                return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
            case 2:
                return G8.a.t().getIdIdentityList("0");
            case 3:
                int i7 = C1650w.f35819w;
                return 0L;
            case 4:
                ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                p069ed.a aVar2 = new p069ed.a(Pd.d.qt_airtime_item_r2c_amount, null);
                aVar2.f36284a = -1;
                return aVar2;
            case 5:
                int i10 = Recharge2CashRecordActivity.f33127g;
                p069ed.c cVar = new p069ed.c();
                cVar.a(new N3.c(6));
                cVar.a(new N3.c(5));
                cVar.setOnItemClickListener(new Z(cVar, 22));
                return cVar;
            case 6:
                return new l().f36397a;
            case 7:
                if (k.k()) {
                    k kVar = k.f22317a;
                    str = k.o().f21930b.f21937a;
                } else {
                    str = "https://app.flexi-bank.com";
                }
                return new n(str);
            case 8:
                return new v(true);
            case 9:
                int i11 = AllFuncationActivityV2.f34434e;
                return new ArrayList();
            case 10:
                int i12 = BillPaymentEditActivity.f34439j;
                return new g(f.main_edit_bill_like_menu_item, null);
            case 11:
                int i13 = BillPaymentEditActivity.f34439j;
                p328ve.f fVar = new p328ve.f(f.main_item_edit_bill_home_group, f.main_layout_edit_bills_item);
                fVar.f43183b = true;
                return fVar;
            case 12:
                HomeActivity.a aVar3 = HomeActivity.f34463H;
                return new PerfTimer();
            case 13:
                int i14 = LifeBillsHomeActivity.f34485A;
                return new e(f.main_bill_like_menu_item, null);
            case 14:
                int i15 = LifeBillsHomeActivity.f34485A;
                return new p328ve.k(f.main_item_bill_home_group, f.main_layout_life_bills_item);
            case 15:
                int i16 = LifeBillsHomeActivity.f34485A;
                return ValueAnimator.ofFloat(0.8f, 1.0f);
            case 16:
                int i17 = MyAssetsActivity.f34499i;
                return new Handler(Looper.getMainLooper());
            case 17:
                TransactionHistoryDownloadFilterTypeActivity.a aVar4 = TransactionHistoryDownloadFilterTypeActivity.f34594f;
                return new ArrayList();
            case 18:
                return DelegateManager.delegateMap_delegate$lambda$0();
            case 19:
                return WebCacheMaster.loaderMap_delegate$lambda$0();
            case 20:
                return new HashMap();
            case 21:
                return s.f38311a;
            case 22:
                int i18 = ScheduleTopUpHomeActivity.f26471i;
                q0.u("/main/set_payment_method");
                return Unit.f38893a;
            case 23:
                int i19 = USSDTopUpHomeActivity.f26542o;
                return new r(Pd.d.qt_airtime_item_ussd_rechagre_amount, null);
            case 24:
                return new p143jb.b();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                p143jb.g gVar = new p143jb.g();
                gVar.f38513a = "OTHER";
                gVar.f38514b = "CASH_LOAN";
                gVar.f38518f = new ArrayList();
                gVar.f38519g = new ArrayList();
                gVar.f38524l = -1;
                return gVar;
            case 26:
                return new p103gf.a();
            case 27:
                return new p103gf.a();
            case 28:
                return WeekAndDaySelectDialog.dayListAdapter_delegate$lambda$2();
            default:
                p171lb.c cVar2 = new p171lb.c();
                cVar2.f39299b = new ArrayList();
                return cVar2;
        }
    }
}
