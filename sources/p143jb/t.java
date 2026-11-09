package p143jb;

import C0.G;
import F6.d;
import Pa.F;
import Pa.T;
import Pa.r0;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import androidx.emoji2.text.j;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.credit.bean.CreditProcessInfo;
import com.transsnet.palmpay.credit.bean.HandleRouterParam;
import com.transsnet.palmpay.credit.bean.RoutePageType;
import com.transsnet.palmpay.credit.bean.RouterPageInfo;
import com.transsnet.palmpay.credit.bean.RouterPageInfoParams;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import df.i;
import io.reactivex.internal.operators.observable.K;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p071ef.b;
import p171lb.e;
import p298tf.f;
import p355xf.C2131j;
import p355xf.o;
import p355xf.p;
import p355xf.q;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p f38573n = new p(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f38574o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f38576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f38578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f38582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f38585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f38586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f38587m;

    static {
        t tVar = q.f38567a;
        f38574o = q.f38567a;
    }

    public t() {
        c.b().j(this);
        this.f38575a = C2131j.b(new com.transsnet.palmpay.managemoney.ui.view.c(27));
        this.f38578d = -1;
        this.f38582h = Boolean.FALSE;
        this.f38583i = -1;
    }

    public final void a(Integer num, String str) {
        d.h("CreditRouterManagerV2", 3, G.o("getVerifyInfo >>> routerPath = ", str));
        p221ob.c.f40268a.getInstance().getClass();
        df.d<AllAuthInfoRsp> dVarQueryAllVerifyInfo = p221ob.c.a().queryAllVerifyInfo();
        dVarQueryAllVerifyInfo.getClass();
        i iVar = f.f42629b;
        new K(dVarQueryAllVerifyInfo.k(iVar), iVar, 1).i(b.a()).subscribe(new s(this, str, num));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0299, code lost:
    
        if (r3.equals("/coreImpl/add_new_card") == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02b3, code lost:
    
        if (r3.equals("/coreImpl/bind_new_bank_account") == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03a8, code lost:
    
        if (r3.equals("/coreImpl/use_new_card") == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03f1, code lost:
    
        if (r3.equals("/credit_score/oc_all_verify_activity") == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03f4, code lost:
    
        a(r8.getRouteId(), r8.getRoutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ff, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r18) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143jb.t.b(int):void");
    }

    public final RouterPageInfo c(Integer num, String str) {
        Object objF;
        Object next;
        Object next2;
        d.h("CreditRouterManagerV2", 3, "isDynamicRnRoute >>> routeId=" + num + ", routePath=" + str);
        if (!TextUtils.isEmpty(this.f38587m)) {
            if (num == null && str == null) {
                d.c("CreditRouterManagerV2", "isDynamicRnRoute >>> routeId and routePath are null");
                return null;
            }
            try {
                o oVar = q.f43977a;
                Object objFromJson = new Gson().fromJson(this.f38587m, new TypeToken<List<? extends RouterPageInfo>>() { // from class: com.transsnet.palmpay.credit.hook.CreditRouterManagerV2$isDynamicRnRoute$1$listType$1
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                List list = (List) objFromJson;
                if (!list.isEmpty()) {
                    if (num != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            next2 = it.next();
                            RouterPageInfoParams params = ((RouterPageInfo) next2).getParams();
                            if (Intrinsics.c(params != null ? params.routeId : null, num)) {
                                return (RouterPageInfo) next2;
                            }
                        }
                        next2 = null;
                        return (RouterPageInfo) next2;
                    }
                    if (str != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            next = it2.next();
                            String name = ((RouterPageInfo) next).getName();
                            if (name != null && StringsKt.A(name, str, false)) {
                                return (RouterPageInfo) next;
                            }
                        }
                        next = null;
                        return (RouterPageInfo) next;
                    }
                    objF = Unit.f38893a;
                    Throwable thA = q.a(objF);
                    if (thA != null) {
                        d.c("CreditRouterManagerV2", "isDynamicRnRoute >>> error , " + thA);
                    }
                }
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                objF = g.f(th);
            }
        }
        return null;
    }

    public final void d() {
        d.h("CreditRouterManagerV2", 3, "routerNext >>> curRouteId=" + this.f38586l);
        Integer num = this.f38586l;
        r0.O1("NoticeCreditRouteNext", num != null ? num.toString() : null, null);
    }

    public final void e() {
        d.h("CreditRouterManagerV2", 3, "v >>> curRouteId=" + this.f38586l);
        Integer num = this.f38586l;
        r0.O1("NoticeCreditRoutePrevious", num != null ? num.toString() : null, null);
    }

    public final void f(Integer num, String str, String str2) {
        Object objF;
        d.h("CreditRouterManagerV2", 3, "routerTarget, routeId=" + num + ", routerPath=" + str + ", url=" + str2);
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null) {
            return;
        }
        String json = new Gson().toJson(new OcApplyData(this.f38579e, null, this.f38577c, null, this.f38578d, false, false, this.f38581g, this.f38580f, this.f38576b, null, 1130, null));
        try {
            o oVar = q.f43977a;
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            Postcard postcardBuild = ARouter.getInstance().build(uri.getPath());
            Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
            Postcard postcardH = F.h(postcardBuild, uri.getQuery());
            Intrinsics.checkNotNullExpressionValue(postcardH, "parseQueryString(...)");
            if (!TextUtils.isEmpty(str2)) {
                postcardH.withString("jump_url", str2);
            }
            if (TextUtils.equals(str, "/coreImpl/add_new_card")) {
                postcardH.withLong("business_type", 1L);
                postcardH.withBoolean("me_bind_bank_card", true);
            }
            Postcard postcardWithInt = postcardH.withString("applyId", this.f38577c).withString("oc_business_type", this.f38580f).withInt("key_need_sign_type", this.f38583i);
            Integer num2 = this.f38578d;
            postcardWithInt.withInt("oc_scene_type", num2 != null ? num2.intValue() : -1).withInt("oc_route_id", num != null ? num.intValue() : -1).withString("oc_apply_data", json).withString("ext_business_data", json).withString("businessType", this.f38580f).withString("jump_source", this.f38580f).withInt("extra_type", 1).navigation(topActivity, 1000);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        if (!(objF instanceof p)) {
            d.h("CreditRouterManagerV2", 3, "routerTarget >>> success");
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c("CreditRouterManagerV2", G.o("routerTarget >>> failed, ", thA.getMessage()));
            ToastUtils.showLong(thA.getMessage(), new Object[0]);
        }
    }

    public final void g(HandleRouterParam params) {
        Object objF;
        Intrinsics.checkNotNullParameter(params, "params");
        d.h("CreditRouterManagerV2", 3, "syncCreditData >>> params=" + params);
        try {
            o oVar = q.f43977a;
            this.f38577c = params.applyId;
            this.f38581g = params.customerTag;
            this.f38580f = params.loanProduct;
            this.f38579e = params.channelEnum;
            this.f38585k = params.externalParams;
            Object objFromJson = new Gson().fromJson(params.routeInfoList, new TypeToken<List<? extends OcRouterDetail>>() { // from class: com.transsnet.palmpay.credit.hook.CreditRouterManagerV2$syncCreditData$1$listType$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.f38576b = (List) objFromJson;
            e eVar = p171lb.f.f39304e;
            eVar.getInstance().f39306a = Boolean.TRUE;
            eVar.getInstance().f39307b = this.f38580f;
            p171lb.f eVar2 = eVar.getInstance();
            String str = this.f38577c;
            String str2 = this.f38580f;
            eVar2.f39309d = new CreditProcessInfo(str, str2, Intrinsics.c(str2, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY", 0, this.f38576b);
            h();
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c("CreditRouterManagerV2", thA);
        }
    }

    public final void h() {
        d.h("CreditRouterManagerV2", 3, G.o("uploadAppList >>> applyId=", this.f38577c));
        if (ActivityUtils.getTopActivity() == null || TextUtils.isEmpty(this.f38577c)) {
            return;
        }
        String str = this.f38577c;
        String str2 = TextUtils.equals(this.f38580f, "OK_CARD") ? "flexi" : "flexi cash";
        String str3 = TextUtils.equals(this.f38580f, "LOAN_WITHDRAW") ? "trade" : "credit";
        if (BaseApplication.hasLogin()) {
            T.b(-4).execute(new j(str, 25, str2, str3));
        }
    }

    public final void i() {
        d.h("CreditRouterManagerV2", 3, "uploadLocationInfo >>> mUploadLocation = " + this.f38582h);
        LocationRecord locationRecordF = a.d().f();
        if (!Intrinsics.c(this.f38582h, Boolean.FALSE) || locationRecordF == null) {
            return;
        }
        this.f38582h = Boolean.TRUE;
        u.a(this.f38577c, TextUtils.equals(this.f38580f, "OK_CARD") ? "flexi" : "flexi cash", TextUtils.equals(this.f38580f, "LOAN_WITHDRAW") ? "trade" : "credit");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        d.h("CreditRouterManagerV2", 3, G.m(event.getEventType(), "onMessageEvent = "));
        int eventType = event.getEventType();
        if (eventType != 9) {
            if (eventType == 275) {
                if (TextUtils.equals(event.getEventContent(), "1")) {
                    d();
                    return;
                }
                return;
            }
            if (eventType == 338) {
                i();
                d.h("CreditRouterManagerV2", 3, "doLocationChange >>>");
                LocationRecord locationRecordF = a.d().f();
                if (locationRecordF == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("latitude", String.valueOf(locationRecordF.getLatitude()));
                jSONObject.put("longitude", String.valueOf(locationRecordF.getLongitude()));
                r0.O1("NoticeRNCreditLocationChange", jSONObject.toString(), null);
                return;
            }
            if (eventType == 547) {
                this.f38584j = true;
                d.h("CreditRouterManagerV2", 3, "mBvnVerified >>> success");
                d();
                return;
            }
            if (eventType == 553) {
                String eventContent = event.getEventContent();
                d.h("CreditRouterManagerV2", 3, G.o("exitRNRouterPage >>> moduleName=", eventContent));
                RouterPageInfo routerPageInfoC = c(null, eventContent);
                if (routerPageInfoC != null) {
                    Integer type = routerPageInfoC.getType();
                    int code = RoutePageType.RN.getCode();
                    if (type != null && type.intValue() == code) {
                        d.h("CreditRouterManagerV2", 5, G.o("exitRNRouterPage >>> isDynamicRnRoute, routePath=", routerPageInfoC.getName()));
                        e();
                        return;
                    }
                    return;
                }
                return;
            }
            if (eventType != 560) {
                if (eventType == 566) {
                    if (TextUtils.equals(event.getEventContent(), "1")) {
                        e();
                        return;
                    }
                    return;
                } else {
                    if (eventType != 568) {
                        return;
                    }
                    if (Intrinsics.c(event.getEventObj(), 200) && this.f38584j) {
                        d.h("CreditRouterManagerV2", 5, "mBvnVerified >>> no exit");
                        return;
                    } else {
                        e();
                        return;
                    }
                }
            }
        }
        d.h("CreditRouterManagerV2", 3, G.m(event.getEventType(), "onMessageEvent routeNext= "));
        d();
    }
}
