package com.transsnet.palmpay.core.ui.activity;

import Rd.C0592h;
import Wf.AbstractC0780y;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService;
import com.transsnet.palmpay.core.ui.mvvm.FlexiPayOneClickOpenViewModel;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SDCardUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/FlexiPayOneClickOpenActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/ui/mvvm/FlexiPayOneClickOpenViewModel;", "LRd/h;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiPayOneClickOpenActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiPayOneClickOpenActivity.kt\ncom/transsnet/palmpay/core/ui/activity/FlexiPayOneClickOpenActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n260#2,10:421\n296#2:431\n188#3,3:432\n37#4:435\n36#4,3:436\n1#5:439\n*S KotlinDebug\n*F\n+ 1 FlexiPayOneClickOpenActivity.kt\ncom/transsnet/palmpay/core/ui/activity/FlexiPayOneClickOpenActivity\n*L\n77#1:421,10\n77#1:431\n115#1:432,3\n137#1:435\n137#1:436,3\n*E\n"})
public final class FlexiPayOneClickOpenActivity extends BaseMvvmVBActivity<FlexiPayOneClickOpenViewModel, C0592h> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27632e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.activity.result.a f27633d = registerForActivityResult(new p177m.j(), new G9.i(this, 6));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static void o(FlexiPayOneClickOpenActivity flexiPayOneClickOpenActivity, int i7, String str, String str2, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        boolean z3 = (i10 & 8) == 0;
        flexiPayOneClickOpenActivity.getClass();
        flexiPayOneClickOpenActivity.setResult(-1, new Intent().putExtra("flexi_pay_open_result", i7).putExtra("flexi_pay_account_id", str).putExtra("flexi_pay_error_text", str2).putExtra("flexi_pay_silent_auth_interrupt", z3));
        flexiPayOneClickOpenActivity.finish();
    }

    public static int p(Function0 function0) {
        Object objF;
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            objF = (Integer) function0.invoke();
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        if (objF instanceof p355xf.p) {
            objF = null;
        }
        Integer num = (Integer) objF;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static String q(Function0 function0) {
        Object objF;
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            objF = (String) function0.invoke();
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        if (objF instanceof p355xf.p) {
            objF = null;
        }
        String str = (String) objF;
        return (str == null || StringsKt.F(str)) ? FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE : str;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((FlexiPayOneClickOpenViewModel) l()).f28069e;
        if (lVar != null) {
            lVar.e(this, new p054dd.q(new V8.w(5, this, this), 2));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(p025ba.g.core_activity_flexi_pay_one_click_open, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        C0592h c0592h = new C0592h((ConstraintLayout) viewInflate, 1);
        Intrinsics.checkNotNullExpressionValue(c0592h, "inflate(...)");
        return c0592h;
    }

    public final FlexiOneClickOpenReq n() {
        Object objConcat;
        Object objF;
        Object objF2;
        Object objF3;
        Object objF4;
        Object objF5;
        Object objF6;
        Object objF7;
        Object objF8;
        Object objF9;
        String string;
        Object objF10;
        Object objF11;
        Object objF12;
        Object objF13;
        Object objF14;
        Object objF15;
        Object objF16;
        Object objF17;
        Object objF18;
        Object objF19;
        Object objF20;
        Object objF21;
        Object objF22;
        Object objF23;
        Object objF24;
        Object objF25;
        Object objF26;
        Object objF27;
        final int i7 = 1;
        final Context applicationContext = getApplicationContext();
        FlexiOneClickOpenReq.Device device = new FlexiOneClickOpenReq.Device();
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            String sDKVersionName = DeviceUtils.getSDKVersionName();
            objConcat = (sDKVersionName == null || StringsKt.F(sDKVersionName)) ? null : "Android".concat(sDKVersionName);
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objConcat = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        boolean z3 = objConcat instanceof p355xf.p;
        Object obj = objConcat;
        if (z3) {
            obj = null;
        }
        String str = (String) obj;
        String str2 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        if (str == null || StringsKt.F(str)) {
            str = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.os_version = str;
        try {
            p355xf.o oVar3 = p355xf.q.f43977a;
            objF = Integer.valueOf(BaseApplication.get().getVersionCode());
        } catch (Throwable th2) {
            p355xf.o oVar4 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th2);
        }
        boolean z8 = objF instanceof p355xf.p;
        Object obj2 = objF;
        if (z8) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        device.app_version = Integer.valueOf(num != null ? num.intValue() : -1);
        try {
            objF2 = Build.HARDWARE;
        } catch (Throwable th3) {
            p355xf.o oVar5 = p355xf.q.f43977a;
            objF2 = androidx.camera.core.impl.utils.executor.g.f(th3);
        }
        boolean z10 = objF2 instanceof p355xf.p;
        Object obj3 = objF2;
        if (z10) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        if (str3 == null || StringsKt.F(str3)) {
            str3 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.cpu_architecture = str3;
        try {
            objF3 = Integer.valueOf(DeviceUtils.isDeviceRooted() ? 1 : 0);
        } catch (Throwable th4) {
            p355xf.o oVar6 = p355xf.q.f43977a;
            objF3 = androidx.camera.core.impl.utils.executor.g.f(th4);
        }
        boolean z11 = objF3 instanceof p355xf.p;
        Object obj4 = objF3;
        if (z11) {
            obj4 = null;
        }
        Integer num2 = (Integer) obj4;
        device.device_root = Integer.valueOf(num2 != null ? num2.intValue() : -1);
        try {
            objF4 = DeviceUtils.getAndroidID();
        } catch (Throwable th5) {
            p355xf.o oVar7 = p355xf.q.f43977a;
            objF4 = androidx.camera.core.impl.utils.executor.g.f(th5);
        }
        boolean z12 = objF4 instanceof p355xf.p;
        Object obj5 = objF4;
        if (z12) {
            obj5 = null;
        }
        String str4 = (String) obj5;
        if (str4 == null || StringsKt.F(str4)) {
            str4 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.deviceID = str4;
        device.imei = q(new T(1));
        try {
            objF5 = Integer.valueOf(PermissionUtils.isGranted("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0);
        } catch (Throwable th6) {
            p355xf.o oVar8 = p355xf.q.f43977a;
            objF5 = androidx.camera.core.impl.utils.executor.g.f(th6);
        }
        boolean z13 = objF5 instanceof p355xf.p;
        Object obj6 = objF5;
        if (z13) {
            obj6 = null;
        }
        Integer num3 = (Integer) obj6;
        device.is_gps_permission_opened = Integer.valueOf(num3 != null ? num3.intValue() : -1);
        final boolean z14 = false ? 1 : 0;
        device.is_gps_switch_opened = Integer.valueOf(p(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiPayOneClickOpenActivity f27712b;

            {
                this.f27712b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIsCharging = 0;
                int iIsProviderEnabled = 0;
                FlexiPayOneClickOpenActivity flexiPayOneClickOpenActivity = this.f27712b;
                Context context = applicationContext;
                switch (z14) {
                    case 0:
                        int i10 = FlexiPayOneClickOpenActivity.f27632e;
                        Intrinsics.e(context);
                        flexiPayOneClickOpenActivity.getClass();
                        try {
                            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                            Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                            iIsProviderEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
                            break;
                        } catch (Exception unused) {
                        }
                        return Integer.valueOf(iIsProviderEnabled);
                    default:
                        int i11 = FlexiPayOneClickOpenActivity.f27632e;
                        Intrinsics.e(context);
                        flexiPayOneClickOpenActivity.getClass();
                        try {
                            Object systemService2 = context.getSystemService("batterymanager");
                            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.os.BatteryManager");
                            iIsCharging = ((BatteryManager) systemService2).isCharging();
                            break;
                        } catch (Exception unused2) {
                        }
                        return Integer.valueOf(iIsCharging);
                }
            }
        }));
        device.is_phone_charge = Integer.valueOf(p(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiPayOneClickOpenActivity f27712b;

            {
                this.f27712b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIsCharging = 0;
                int iIsProviderEnabled = 0;
                FlexiPayOneClickOpenActivity flexiPayOneClickOpenActivity = this.f27712b;
                Context context = applicationContext;
                switch (i7) {
                    case 0:
                        int i10 = FlexiPayOneClickOpenActivity.f27632e;
                        Intrinsics.e(context);
                        flexiPayOneClickOpenActivity.getClass();
                        try {
                            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                            Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                            iIsProviderEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
                            break;
                        } catch (Exception unused) {
                        }
                        return Integer.valueOf(iIsProviderEnabled);
                    default:
                        int i11 = FlexiPayOneClickOpenActivity.f27632e;
                        Intrinsics.e(context);
                        flexiPayOneClickOpenActivity.getClass();
                        try {
                            Object systemService2 = context.getSystemService("batterymanager");
                            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.os.BatteryManager");
                            iIsCharging = ((BatteryManager) systemService2).isCharging();
                            break;
                        } catch (Exception unused2) {
                        }
                        return Integer.valueOf(iIsCharging);
                }
            }
        }));
        try {
            objF6 = p367ya.a.d().f();
        } catch (Throwable th7) {
            p355xf.o oVar9 = p355xf.q.f43977a;
            objF6 = androidx.camera.core.impl.utils.executor.g.f(th7);
        }
        boolean z15 = objF6 instanceof p355xf.p;
        Object obj7 = objF6;
        if (z15) {
            obj7 = null;
        }
        LocationRecord locationRecord = (LocationRecord) obj7;
        if (locationRecord != null) {
            try {
                objF7 = Double.valueOf(locationRecord.getLatitude());
            } catch (Throwable th8) {
                p355xf.o oVar10 = p355xf.q.f43977a;
                objF7 = androidx.camera.core.impl.utils.executor.g.f(th8);
            }
        } else {
            objF7 = null;
        }
        boolean z16 = objF7 instanceof p355xf.p;
        Object obj8 = objF7;
        if (z16) {
            obj8 = null;
        }
        Double d2 = (Double) obj8;
        device.latitude = Double.valueOf(d2 != null ? d2.doubleValue() : -1.0d);
        if (locationRecord != null) {
            try {
                objF8 = Double.valueOf(locationRecord.getLongitude());
            } catch (Throwable th9) {
                p355xf.o oVar11 = p355xf.q.f43977a;
                objF8 = androidx.camera.core.impl.utils.executor.g.f(th9);
            }
        } else {
            objF8 = null;
        }
        boolean z17 = objF8 instanceof p355xf.p;
        Object obj9 = objF8;
        if (z17) {
            obj9 = null;
        }
        Double d10 = (Double) obj9;
        device.longitude = Double.valueOf(d10 != null ? d10.doubleValue() : -1.0d);
        try {
            objF9 = DeviceUtils.getManufacturer();
        } catch (Throwable th10) {
            p355xf.o oVar12 = p355xf.q.f43977a;
            objF9 = androidx.camera.core.impl.utils.executor.g.f(th10);
        }
        boolean z18 = objF9 instanceof p355xf.p;
        Object obj10 = objF9;
        if (z18) {
            obj10 = null;
        }
        String str5 = (String) obj10;
        if (str5 == null || StringsKt.F(str5)) {
            str5 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.phone_brand = str5;
        Intrinsics.e(applicationContext);
        try {
            Object systemService = applicationContext.getSystemService("batterymanager");
            BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
            Integer numValueOf = batteryManager != null ? Integer.valueOf(batteryManager.getIntProperty(4)) : null;
            string = (numValueOf == null || numValueOf.intValue() < 0) ? FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE : numValueOf.toString();
        } catch (Exception unused) {
        }
        device.phone_electric_quantity = string;
        try {
            p355xf.o oVar13 = p355xf.q.f43977a;
            objF10 = DeviceUtils.getModel();
        } catch (Throwable th11) {
            p355xf.o oVar14 = p355xf.q.f43977a;
            objF10 = androidx.camera.core.impl.utils.executor.g.f(th11);
        }
        boolean z19 = objF10 instanceof p355xf.p;
        Object obj11 = objF10;
        if (z19) {
            obj11 = null;
        }
        String str6 = (String) obj11;
        if (str6 == null || StringsKt.F(str6)) {
            str6 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.phone_model = str6;
        try {
            objF11 = Integer.valueOf(PhoneUtils.getSimType());
        } catch (Throwable th12) {
            p355xf.o oVar15 = p355xf.q.f43977a;
            objF11 = androidx.camera.core.impl.utils.executor.g.f(th12);
        }
        boolean z20 = objF11 instanceof p355xf.p;
        Object obj12 = objF11;
        if (z20) {
            obj12 = null;
        }
        Integer num4 = (Integer) obj12;
        device.phone_type = Integer.valueOf(num4 != null ? num4.intValue() : -1);
        device.screen_resolution = q(new p041ce.o(29));
        try {
            objF12 = Long.valueOf(SDCardUtils.getSDTotalSize());
        } catch (Throwable th13) {
            p355xf.o oVar16 = p355xf.q.f43977a;
            objF12 = androidx.camera.core.impl.utils.executor.g.f(th13);
        }
        boolean z21 = objF12 instanceof p355xf.p;
        Object obj13 = objF12;
        if (z21) {
            obj13 = null;
        }
        Long l5 = (Long) obj13;
        long jLongValue = l5 != null ? l5.longValue() : -1L;
        try {
            objF13 = Long.valueOf(SDCardUtils.getSDFreeSize());
        } catch (Throwable th14) {
            p355xf.o oVar17 = p355xf.q.f43977a;
            objF13 = androidx.camera.core.impl.utils.executor.g.f(th14);
        }
        boolean z22 = objF13 instanceof p355xf.p;
        Object obj14 = objF13;
        if (z22) {
            obj14 = null;
        }
        Long l6 = (Long) obj14;
        long jLongValue2 = l6 != null ? l6.longValue() : -1L;
        device.sdcard_total_capacity = Long.valueOf(jLongValue);
        device.sdcard_used_capacity = (jLongValue == -1 || jLongValue2 == -1) ? -1L : Long.valueOf(jLongValue - jLongValue2);
        try {
            objF14 = Integer.valueOf(PhoneUtils.getSimState());
        } catch (Throwable th15) {
            p355xf.o oVar18 = p355xf.q.f43977a;
            objF14 = androidx.camera.core.impl.utils.executor.g.f(th15);
        }
        boolean z23 = objF14 instanceof p355xf.p;
        Object obj15 = objF14;
        if (z23) {
            obj15 = null;
        }
        Integer num5 = (Integer) obj15;
        device.sim_card_status = Integer.valueOf(num5 != null ? num5.intValue() : -1);
        device.total_storage = Long.valueOf(jLongValue);
        device.upload_node = "cashier_flexi_one_click_open";
        device.uploadNode = "cashier_flexi_one_click_open";
        device.uploadNodeDetail = "cashier_flexi_one_click_open";
        try {
            objF15 = NetworkUtils.getConnectWifiSSID();
        } catch (Throwable th16) {
            p355xf.o oVar19 = p355xf.q.f43977a;
            objF15 = androidx.camera.core.impl.utils.executor.g.f(th16);
        }
        boolean z24 = objF15 instanceof p355xf.p;
        Object obj16 = objF15;
        if (z24) {
            obj16 = null;
        }
        String str7 = (String) obj16;
        if (str7 == null || StringsKt.F(str7)) {
            str7 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.wifi = str7;
        try {
            objF16 = Integer.valueOf(NetworkUtils.isWifiConnected() ? 1 : 0);
        } catch (Throwable th17) {
            p355xf.o oVar20 = p355xf.q.f43977a;
            objF16 = androidx.camera.core.impl.utils.executor.g.f(th17);
        }
        boolean z25 = objF16 instanceof p355xf.p;
        Object obj17 = objF16;
        if (z25) {
            obj17 = null;
        }
        Integer num6 = (Integer) obj17;
        device.wifi_conneted = Integer.valueOf(num6 != null ? num6.intValue() : -1);
        device.disk_free_total_space = Long.valueOf(jLongValue2);
        try {
            objF17 = String.valueOf(ScreenUtils.getScreenBrightness());
        } catch (Throwable th18) {
            p355xf.o oVar21 = p355xf.q.f43977a;
            objF17 = androidx.camera.core.impl.utils.executor.g.f(th18);
        }
        boolean z26 = objF17 instanceof p355xf.p;
        Object obj18 = objF17;
        if (z26) {
            obj18 = null;
        }
        String str8 = (String) obj18;
        if (str8 == null || StringsKt.F(str8)) {
            str8 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.screen_brightness = str8;
        try {
            objF18 = PhoneUtils.getSimOperatorName();
        } catch (Throwable th19) {
            p355xf.o oVar22 = p355xf.q.f43977a;
            objF18 = androidx.camera.core.impl.utils.executor.g.f(th19);
        }
        boolean z27 = objF18 instanceof p355xf.p;
        Object obj19 = objF18;
        if (z27) {
            obj19 = null;
        }
        String str9 = (String) obj19;
        if (str9 == null || StringsKt.F(str9)) {
            str9 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.get_net_carrier = str9;
        try {
            objF19 = DeviceUtils.isDeviceRooted() ? "1" : "0";
        } catch (Throwable th20) {
            p355xf.o oVar23 = p355xf.q.f43977a;
            objF19 = androidx.camera.core.impl.utils.executor.g.f(th20);
        }
        boolean z28 = objF19 instanceof p355xf.p;
        Object obj20 = objF19;
        if (z28) {
            obj20 = null;
        }
        String str10 = (String) obj20;
        if (str10 == null || StringsKt.F(str10)) {
            str10 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.is_it_breakout_equipment = str10;
        try {
            objF20 = String.valueOf(SubscriptionManager.from(applicationContext).getActiveSubscriptionInfoCount());
        } catch (Throwable th21) {
            p355xf.o oVar24 = p355xf.q.f43977a;
            objF20 = androidx.camera.core.impl.utils.executor.g.f(th21);
        }
        boolean z29 = objF20 instanceof p355xf.p;
        Object obj21 = objF20;
        if (z29) {
            obj21 = null;
        }
        String str11 = (String) obj21;
        if (str11 == null || StringsKt.F(str11)) {
            str11 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        device.sim_cnt = str11;
        device.data_type = "credit";
        device.deviceId1 = q(new T(0));
        device.operationSystem = "Android";
        try {
            objF21 = Boolean.valueOf(NetworkUtils.isConnected());
        } catch (Throwable th22) {
            p355xf.o oVar25 = p355xf.q.f43977a;
            objF21 = androidx.camera.core.impl.utils.executor.g.f(th22);
        }
        boolean z30 = objF21 instanceof p355xf.p;
        Object obj22 = objF21;
        if (z30) {
            obj22 = null;
        }
        device.isEquipmentBreakout = (Boolean) obj22;
        try {
            objF22 = Integer.valueOf(DeviceUtils.isEmulator() ? 1 : 0);
        } catch (Throwable th23) {
            p355xf.o oVar26 = p355xf.q.f43977a;
            objF22 = androidx.camera.core.impl.utils.executor.g.f(th23);
        }
        boolean z31 = objF22 instanceof p355xf.p;
        Object obj23 = objF22;
        if (z31) {
            obj23 = null;
        }
        Integer num7 = (Integer) obj23;
        device.isSimulator = Integer.valueOf(num7 != null ? num7.intValue() : -1);
        try {
            Object systemService2 = applicationContext.getSystemService("activity");
            objF23 = systemService2 instanceof ActivityManager ? (ActivityManager) systemService2 : null;
        } catch (Throwable th24) {
            p355xf.o oVar27 = p355xf.q.f43977a;
            objF23 = androidx.camera.core.impl.utils.executor.g.f(th24);
        }
        boolean z32 = objF23 instanceof p355xf.p;
        Object obj24 = objF23;
        if (z32) {
            obj24 = null;
        }
        ActivityManager activityManager = (ActivityManager) obj24;
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                activityManager.getMemoryInfo(memoryInfo);
                objF25 = Unit.f38893a;
            } catch (Throwable th25) {
                p355xf.o oVar28 = p355xf.q.f43977a;
                objF25 = androidx.camera.core.impl.utils.executor.g.f(th25);
            }
            if (!(objF25 instanceof p355xf.p)) {
                try {
                    long j6 = 1024;
                    objF26 = String.valueOf((memoryInfo.totalMem / j6) / j6);
                } catch (Throwable th26) {
                    p355xf.o oVar29 = p355xf.q.f43977a;
                    objF26 = androidx.camera.core.impl.utils.executor.g.f(th26);
                }
                boolean z33 = objF26 instanceof p355xf.p;
                Object obj25 = objF26;
                if (z33) {
                    obj25 = null;
                }
                String str12 = (String) obj25;
                if (str12 != null && !StringsKt.F(str12)) {
                    str2 = str12;
                }
                device.total_memory = str2;
                try {
                    long j10 = memoryInfo.totalMem - memoryInfo.availMem;
                    long j11 = 1024;
                    objF27 = Long.valueOf((j10 / j11) / j11);
                } catch (Throwable th27) {
                    p355xf.o oVar30 = p355xf.q.f43977a;
                    objF27 = androidx.camera.core.impl.utils.executor.g.f(th27);
                }
                boolean z34 = objF27 instanceof p355xf.p;
                Object obj26 = objF27;
                if (z34) {
                    obj26 = null;
                }
                Long l8 = (Long) obj26;
                device.used_memory = Long.valueOf(l8 != null ? l8.longValue() : -1L);
            }
        }
        try {
            objF24 = p367ya.a.d().f();
        } catch (Throwable th28) {
            p355xf.o oVar31 = p355xf.q.f43977a;
            objF24 = androidx.camera.core.impl.utils.executor.g.f(th28);
        }
        boolean z35 = objF24 instanceof p355xf.p;
        Object obj27 = objF24;
        if (z35) {
            obj27 = null;
        }
        LocationRecord locationRecord2 = (LocationRecord) obj27;
        FlexiOneClickOpenReq.LocationInfo locationInfo = new FlexiOneClickOpenReq.LocationInfo();
        locationInfo.longitude = locationRecord2 != null ? Double.valueOf(locationRecord2.getLongitude()).toString() : null;
        locationInfo.latitude = locationRecord2 != null ? Double.valueOf(locationRecord2.getLatitude()).toString() : null;
        locationInfo.live = Boolean.valueOf(locationRecord2 != null);
        locationInfo.uploadNode = "palmpay";
        locationInfo.uploadNodeDetail = "cashier_flexi_one_click_open";
        return new FlexiOneClickOpenReq(device, locationInfo);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        if (!PermissionUtils.isGranted("android.permission.READ_PHONE_STATE")) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (!PermissionUtils.isGranted("android.permission.ACCESS_FINE_LOCATION") && !PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            arrayList.add(com.transsnet.palmpay.core.config.d.j());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (strArr.length != 0) {
            this.f27633d.a(strArr);
            return;
        }
        Object objNavigation = ARouter.getInstance().build("/credit_score/loan_bank_silent_auth_service").navigation();
        ILoanBankSilentAuthService iLoanBankSilentAuthService = objNavigation instanceof ILoanBankSilentAuthService ? (ILoanBankSilentAuthService) objNavigation : null;
        if (iLoanBankSilentAuthService == null) {
            r();
            return;
        }
        Wf.V v3 = Wf.V.f10828a;
        p042cg.f fVar = Wf.I.f10809a;
        AbstractC0780y.m(v3, p015ag.o.f11960a, null, new W(this, iLoanBankSilentAuthService, null), 2);
    }

    public final void r() {
        showLoadingDialog(true);
        try {
            FlexiOneClickOpenReq req = n();
            FlexiPayOneClickOpenViewModel flexiPayOneClickOpenViewModel = (FlexiPayOneClickOpenViewModel) l();
            flexiPayOneClickOpenViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            p140j8.f.s(flexiPayOneClickOpenViewModel, new Ma.o(req, null), flexiPayOneClickOpenViewModel.f28069e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        } catch (Exception e10) {
            F6.d.c("FlexiPayOneClickOpen", "build flexi one click open request failed", e10);
            showLoadingDialog(false);
            o(this, 0, null, null, 14);
        }
    }
}
