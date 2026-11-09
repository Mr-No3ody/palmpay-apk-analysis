package G8;

import C0.C0127t;
import C0.G;
import C0.J;
import E.AbstractC0198c;
import Ef.f;
import H5.b;
import Ja.z;
import L6.e;
import M.h;
import M.m;
import N8.q0;
import W3.i;
import Wf.C0765i;
import Y.j;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.n;
import androidx.concurrent.futures.p;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.flexibank.sdk.k;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.maps.android.BuildConfig;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.credit.bean.req.CLSaveCashierContextOrderExtend;
import com.transsnet.palmpay.credit.bean.req.CLSaveCashierContextReq;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SizeUtils;
import j4.u;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.collections.AbstractC1840g;
import kotlin.collections.C;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p279s5.d;
import p377z5.l;
import t0.c;
import t0.r;
import t0.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile IApiAccountService f3159a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3160b = false;

    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    public static void E(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        i iVar = new i();
        String packageName = context.getPackageName();
        Intent intentA = null;
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.e(str);
            if (y.m(str, "http://", false) || y.m(str, "https://", false)) {
                intentA = u.a(str);
            } else {
                if (y.m(str, packageName + ".action", false)) {
                    intentA = new Intent(str);
                } else {
                    if (y.m(str, packageName + ".intent", false)) {
                        intentA = new Intent(str);
                    } else {
                        if (y.m(str, "flexibank://" + packageName, false)) {
                            if (!TextUtils.isEmpty(str)) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                Context contextG = k.g();
                                if (contextG != null) {
                                    List<ResolveInfo> listQueryIntentActivities = contextG.getPackageManager().queryIntentActivities(intent, 0);
                                    Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                                    if (listQueryIntentActivities.size() > 0) {
                                        intentA = intent;
                                    }
                                }
                            }
                            if (intentA != null) {
                                intentA.setPackage(context.getPackageName());
                            }
                        } else if (y.m(str, "market://", false)) {
                            if (!TextUtils.isEmpty(str)) {
                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                intent2.setData(Uri.parse(str));
                                Context contextG2 = k.g();
                                if (contextG2 != null) {
                                    List<ResolveInfo> listQueryIntentActivities2 = contextG2.getPackageManager().queryIntentActivities(intent2, 0);
                                    Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
                                    if (listQueryIntentActivities2.size() > 0) {
                                        intentA = intent2;
                                    }
                                }
                            }
                        } else if (y.m(str, "system://", false)) {
                            String strSubstring = str.substring(9);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            intentA = new Intent(strSubstring);
                            if ("android.settings.APPLICATION_DETAILS_SETTINGS".equalsIgnoreCase(strSubstring)) {
                                intentA.setData(Uri.parse("package:" + context.getPackageName()));
                            }
                        }
                    }
                }
            }
        }
        iVar.b(intentA);
        if (iVar.getIntent() != null) {
            ActivityUtils.startActivity(iVar.getIntent());
        }
    }

    public static void F(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        n.s(application);
        b.f3698d = true;
        S6.b font = S6.b.f8814a;
        Intrinsics.checkNotNullParameter(font, "font");
        M5.a aVar = M5.a.f5768a;
        Intrinsics.checkNotNullParameter(font, "font");
        HashMap map = M5.a.f5770c;
        Intrinsics.checkNotNullParameter("pay", "s");
        map.put("pay", font);
        org.sufficientlysecure.htmltextview.b.a("pp-number-bold", j.a(e.lib_ui_palmpaynum_bold_ttf, application), 400);
        org.sufficientlysecure.htmltextview.b.a("pp-number-regular", j.a(e.lib_ui_palmpaynum_regular_ttf, application), 400);
        org.sufficientlysecure.htmltextview.b.a("pp-number-medium", j.a(e.lib_ui_palmpaynum_bold_ttf, application), 500);
    }

    public static boolean G() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean H(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static final void J(int i7, int i10, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i7 < i10) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i7] = null;
            i7++;
        }
    }

    public static final /* synthetic */ d K(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new d(obj, new C0127t(view, 4));
    }

    public static final t a(int i7, float f10, c rounding, List list) {
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float[] fArr = new float[i7 * 2];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            long jS = AbstractC0198c.S(t0.u.e(f10, (t0.u.f42312b / i7) * 2 * i11), h.a(0.0f, 0.0f));
            int i12 = i10 + 1;
            fArr[i10] = AbstractC0198c.F(jS);
            i10 += 2;
            fArr[i12] = AbstractC0198c.G(jS);
        }
        return b(fArr, rounding, list, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t b(float[] vertices, c rounding, List list, float f10, float f11) {
        float f12;
        long jA;
        int i7;
        List listC;
        c cVar;
        int i10 = 1;
        int i11 = 2;
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (vertices.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        if (vertices.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != vertices.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList = new ArrayList();
        int length = vertices.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            c cVar2 = (list == null || (cVar = (c) list.get(i13)) == null) ? rounding : cVar;
            int i14 = (((i13 + length) - 1) % length) * 2;
            int i15 = i13 + 1;
            int i16 = (i15 % length) * 2;
            int i17 = i13 * 2;
            arrayList2.add(new r(h.a(vertices[i14], vertices[i14 + 1]), h.a(vertices[i17], vertices[i17 + 1]), h.a(vertices[i16], vertices[i16 + 1]), cVar2));
            i13 = i15;
        }
        IntRange intRangeF = kotlin.ranges.b.f(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.l(intRangeF, 10));
        Iterator it = intRangeF.iterator();
        while (true) {
            f12 = 0.0f;
            if (!((Rf.b) it).f8613c) {
                break;
            }
            int iA = ((C) it).a();
            int i18 = (iA + 1) % length;
            float f13 = ((r) arrayList2.get(iA)).f42304h + ((r) arrayList2.get(i18)).f42304h;
            float fC = ((r) arrayList2.get(i18)).c() + ((r) arrayList2.get(iA)).c();
            int i19 = iA * 2;
            float f14 = vertices[i19];
            float f15 = vertices[i19 + 1];
            int i20 = i18 * 2;
            float f16 = f14 - vertices[i20];
            float f17 = f15 - vertices[i20 + 1];
            float f18 = t0.u.f42312b;
            float fSqrt = (float) Math.sqrt((f17 * f17) + (f16 * f16));
            arrayList3.add(f13 > fSqrt ? new Pair(Float.valueOf(fSqrt / f13), Float.valueOf(0.0f)) : fC > fSqrt ? new Pair(Float.valueOf(1.0f), Float.valueOf((fSqrt - f13) / (fC - f13))) : new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f)));
        }
        int i21 = 0;
        while (i21 < length) {
            m mVar = new m(i11);
            for (int i22 = i12; i22 < i11; i22 += i10) {
                Pair pair = (Pair) arrayList3.get((((i21 + length) - i10) + i22) % length);
                mVar.a(((((r) arrayList2.get(i21)).c() - ((r) arrayList2.get(i21)).f42304h) * ((Number) pair.f38892b).floatValue()) + (((r) arrayList2.get(i21)).f42304h * ((Number) pair.f38891a).floatValue()));
            }
            r rVar = (r) arrayList2.get(i21);
            float fB = mVar.b(i12);
            float fB2 = mVar.b(i10);
            rVar.getClass();
            float fMin = Math.min(fB, fB2);
            float f19 = rVar.f42304h;
            int i23 = i10;
            int i24 = i11;
            long j6 = rVar.f42298b;
            if (f19 < 1.0E-4f || fMin < 1.0E-4f) {
                i7 = i12;
            } else {
                i7 = i12;
                float f20 = rVar.f42302f;
                if (f20 >= 1.0E-4f) {
                    float fMin2 = Math.min(fMin, f19);
                    float fA = rVar.a(fB);
                    float fA2 = rVar.a(fB2);
                    float f21 = (f20 * fMin2) / f19;
                    float f22 = t0.u.f42312b;
                    float fSqrt2 = (float) Math.sqrt((fMin2 * fMin2) + (f21 * f21));
                    long j10 = rVar.f42300d;
                    long j11 = rVar.f42301e;
                    i21 = i21;
                    arrayList3 = arrayList3;
                    rVar.f42305i = AbstractC0198c.S(j6, AbstractC0198c.f0(AbstractC0198c.w(AbstractC0198c.m(AbstractC0198c.S(j10, j11), 2.0f)), fSqrt2));
                    long jS = AbstractC0198c.S(j6, AbstractC0198c.f0(j10, fMin2));
                    long jS2 = AbstractC0198c.S(j6, AbstractC0198c.f0(j11, fMin2));
                    t0.e eVarB = r.b(fMin2, fA, rVar.f42298b, rVar.f42297a, jS, jS2, rVar.f42305i, f21);
                    t0.e eVarB2 = r.b(fMin2, fA2, rVar.f42298b, rVar.f42299c, jS2, jS, rVar.f42305i, f21);
                    float fA3 = eVarB2.a();
                    float fB3 = eVarB2.b();
                    float[] fArr = eVarB2.f42277a;
                    t0.e eVarA = l.a(fA3, fB3, fArr[4], fArr[5], fArr[i24], fArr[3], fArr[i7], fArr[i23]);
                    t0.d dVar = t0.e.f42276b;
                    float F10 = AbstractC0198c.F(rVar.f42305i);
                    float fG = AbstractC0198c.G(rVar.f42305i);
                    float fA4 = eVarB.a();
                    float fB4 = eVarB.b();
                    float[] fArr2 = eVarA.f42277a;
                    listC = C1850q.h(eVarB, dVar.circularArc(F10, fG, fA4, fB4, fArr2[i7], fArr2[i23]), eVarA);
                }
                arrayList.add(listC);
                i21++;
                f12 = f12;
                i12 = i7;
                i10 = i23;
                i11 = i24;
                arrayList3 = arrayList3;
            }
            rVar.f42305i = j6;
            listC = C1849p.c(t0.e.f42276b.straightLine(AbstractC0198c.F(j6), AbstractC0198c.G(j6), AbstractC0198c.F(j6), AbstractC0198c.G(j6)));
            arrayList.add(listC);
            i21++;
            f12 = f12;
            i12 = i7;
            i10 = i23;
            i11 = i24;
            arrayList3 = arrayList3;
        }
        int i25 = i10;
        int i26 = i11;
        int i27 = i12;
        float f23 = f12;
        ArrayList arrayList4 = new ArrayList();
        int i28 = i27;
        while (i28 < length) {
            int i29 = i28 + 1;
            int i30 = i29 % length;
            int i31 = i28 * 2;
            long jA2 = h.a(vertices[i31], vertices[i31 + 1]);
            int i32 = (((i28 + length) - 1) % length) * 2;
            long jA3 = h.a(vertices[i32], vertices[i32 + 1]);
            int i33 = i30 * 2;
            long jA4 = h.a(vertices[i33], vertices[i33 + 1]);
            long jO = AbstractC0198c.O(jA2, jA3);
            long jO2 = AbstractC0198c.O(jA4, jA2);
            arrayList4.add(new t0.h((List) arrayList.get(i28), jA2, ((r) arrayList2.get(i28)).f42305i, (AbstractC0198c.G(jO2) * AbstractC0198c.F(jO)) - (AbstractC0198c.F(jO2) * AbstractC0198c.G(jO)) > f23 ? i25 : i27));
            arrayList4.add(new t0.i(C1849p.c(t0.e.f42276b.straightLine(((t0.e) CollectionsKt.K((List) arrayList.get(i28))).a(), ((t0.e) CollectionsKt.K((List) arrayList.get(i28))).b(), ((t0.e) CollectionsKt.F((List) arrayList.get(i30))).f42277a[i27], ((t0.e) CollectionsKt.F((List) arrayList.get(i30))).f42277a[i25]))));
            i28 = i29;
        }
        if (f10 == Float.MIN_VALUE || f11 == Float.MIN_VALUE) {
            float f24 = f23;
            float f25 = f24;
            int i34 = i27;
            while (i34 < vertices.length) {
                int i35 = i34 + 1;
                f25 += vertices[i34];
                i34 += 2;
                f24 += vertices[i35];
            }
            float f26 = i26;
            jA = h.a((f25 / vertices.length) / f26, (f24 / vertices.length) / f26);
        } else {
            jA = h.a(f10, f11);
        }
        return new t(arrayList4, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    public static void c(Exception exc) {
        e("e", "", exc);
    }

    public static void d(String str, String str2) {
        try {
            Method method = Log.class.getMethod(str, String.class, String.class);
            method.setAccessible(true);
            method.invoke(null, "[ONELOOP]", str2);
        } catch (Exception unused) {
            System.out.println("[ONELOOP]: " + str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        String string = str2 == null ? BuildConfig.TRAVIS : str2.toString();
        if (f3160b) {
            try {
                Method method = Log.class.getMethod(str, String.class, String.class, Throwable.class);
                method.setAccessible(true);
                method.invoke(null, "[ONELOOP]", string, th);
            } catch (Exception unused) {
                System.out.println("[ONELOOP]: " + string);
            }
        }
    }

    public static final boolean f(Object[] objArr, int i7, int i10, List list) {
        if (i10 == list.size()) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (Intrinsics.c(objArr[i7 + i11], list.get(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String g(Object[] objArr, int i7, int i10, AbstractC1840g abstractC1840g) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i7 + i11];
            if (obj == abstractC1840g) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final Object h(ListenableFuture listenableFuture, Ff.c frame) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return androidx.concurrent.futures.j.getUninterruptibly(listenableFuture);
            }
            C0765i c0765i = new C0765i(1, f.b(frame));
            listenableFuture.addListener(new p(listenableFuture, c0765i, 0), androidx.concurrent.futures.n.f15067a);
            c0765i.invokeOnCancellation(new J(listenableFuture, 5));
            Object objM = c0765i.m();
            if (objM == Ef.a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objM;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                Intrinsics.l();
            }
            throw cause;
        }
    }

    public static void i(String str, String str2) {
        String string = str == null ? BuildConfig.TRAVIS : str.toString();
        if (!f3160b) {
            return;
        }
        int length = string.length();
        if (length == 0) {
            d(str2, string);
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= (length / 3000) + (length % 3000 > 0 ? 1 : 0)) {
                return;
            }
            i7++;
            int i10 = i7 * 3000;
            d(str2, length >= i10 ? string.substring(i10 - 3000, i10) : string.substring(i10 - 3000));
        }
    }

    public static final boolean j(p081f8.b before, p081f8.b calendarDay) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Intrinsics.checkNotNullParameter(calendarDay, "calendarDay");
        int i7 = before.f36414b;
        int i10 = calendarDay.f36414b;
        if (i7 < i10) {
            return true;
        }
        if (i7 > i10) {
            return false;
        }
        int i11 = before.f36415c;
        int i12 = calendarDay.f36415c;
        if (i11 < i12) {
            return true;
        }
        return i11 <= i12 && before.f36416d < calendarDay.f36416d;
    }

    public static CLSaveCashierContextReq k(TransferByLoanOpenParams params, String cardNo, CLRepaymentPlanData plan) {
        Long repaymentDate;
        RepaymentPlan repaymentPlan;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(cardNo, "cardNo");
        Intrinsics.checkNotNullParameter(plan, "plan");
        List<RepaymentPlan> repaymentPlanList = plan.getRepaymentPlanList();
        if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.L(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
            repaymentDate = plan.getRepaymentDate();
        }
        String cashierContextId = params.getCashierContextId();
        if (repaymentDate == null || repaymentDate.longValue() <= 0) {
            repaymentDate = null;
        } else if (repaymentDate.longValue() < 10000000000L) {
            repaymentDate = Long.valueOf(repaymentDate.longValue() * ((long) 1000));
        }
        String term = plan.getTerm();
        if (term == null) {
            Integer loanTerm = plan.getLoanTerm();
            term = loanTerm != null ? loanTerm.toString() : null;
        }
        List<RepaymentPlan> repaymentPlanList2 = plan.getRepaymentPlanList();
        Boolean bool = Boolean.FALSE;
        Long managementFeeSum = plan.getManagementFeeSum();
        CLSaveCashierContextOrderExtend cLSaveCashierContextOrderExtend = new CLSaveCashierContextOrderExtend(term, repaymentPlanList2, null, bool, Long.valueOf(managementFeeSum != null ? managementFeeSum.longValue() : 0L));
        Integer reductionWay = plan.getReductionWay();
        return new CLSaveCashierContextReq(cashierContextId, cardNo, "INSTALLMENT_LOAN", 9, repaymentDate, 1, cLSaveCashierContextOrderExtend, Integer.valueOf(reductionWay != null ? reductionWay.intValue() : 0), Long.valueOf(params.getLoanAmount()));
    }

    public static WritableArray m(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                writableArrayCreateArray.pushDouble(((Long) obj).doubleValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(n((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(m((JSONArray) obj));
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap n(JSONObject jSONObject) throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            } else if (obj instanceof Integer) {
                writableMapCreateMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof Long) {
                writableMapCreateMap.putDouble(next, ((Long) obj).doubleValue());
            } else if (obj instanceof Double) {
                writableMapCreateMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Boolean) {
                writableMapCreateMap.putBoolean(next, jSONObject.getBoolean(next));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, n(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, m(jSONObject.getJSONArray(next)));
            }
        }
        return writableMapCreateMap;
    }

    public static final File o(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), G.o("datastore/", fileName));
    }

    public static G5.a p(FileChannel fileChannel) throws G5.b, IOException {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
        long j6 = size - 22;
        long jMin = Math.min(j6, 65535L);
        int i7 = 0;
        while (true) {
            long j10 = i7;
            if (j10 > jMin) {
                throw new IOException("ZIP End of Central Directory (EOCD) record not found");
            }
            long j11 = j6 - j10;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            fileChannel.position(j11);
            fileChannel.read(byteBufferAllocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            if (byteBufferAllocate.getInt(0) == 101010256) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j11 + 20);
                fileChannel.read(byteBufferAllocate2);
                byteBufferAllocate2.order(byteOrder);
                short s3 = byteBufferAllocate2.getShort(0);
                if (s3 == i7) {
                    ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                    byteBufferAllocate3.order(byteOrder);
                    fileChannel.position((fileChannel.size() - ((long) s3)) - 6);
                    fileChannel.read(byteBufferAllocate3);
                    long j12 = byteBufferAllocate3.getInt(0);
                    if (j12 < 32) {
                        throw new G5.b(androidx.camera.video.u.i(j12, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                    }
                    fileChannel.position(j12 - 24);
                    ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(24);
                    fileChannel.read(byteBufferAllocate4);
                    byteBufferAllocate4.order(byteOrder);
                    if (byteBufferAllocate4.getLong(8) != 2334950737559900225L || byteBufferAllocate4.getLong(16) != 3617552046287187010L) {
                        throw new G5.b("No APK Signing Block before ZIP Central Directory");
                    }
                    long j13 = byteBufferAllocate4.getLong(0);
                    if (j13 < byteBufferAllocate4.capacity() || j13 > 2147483639) {
                        throw new G5.b(androidx.camera.video.u.i(j13, "APK Signing Block size out of range: "));
                    }
                    int i10 = (int) (8 + j13);
                    long j14 = j12 - ((long) i10);
                    if (j14 < 0) {
                        throw new G5.b(androidx.camera.video.u.i(j14, "APK Signing Block offset out of range: "));
                    }
                    fileChannel.position(j14);
                    ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(i10);
                    fileChannel.read(byteBufferAllocate5);
                    byteBufferAllocate5.order(byteOrder);
                    long j15 = byteBufferAllocate5.getLong(0);
                    if (j15 == j13) {
                        return new G5.a(byteBufferAllocate5, Long.valueOf(j14));
                    }
                    StringBuilder sbR = androidx.camera.video.u.r(j15, "APK Signing Block sizes in header and footer do not match: ", " vs ");
                    sbR.append(j13);
                    throw new G5.b(sbR.toString());
                }
            }
            i7++;
        }
    }

    public static LinkedHashMap q(ByteBuffer byteBuffer) throws G5.b {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        int iCapacity = byteBuffer.capacity() - 24;
        if (iCapacity < 8) {
            throw new IllegalArgumentException(F.c(iCapacity, "end < start: ", " < 8"));
        }
        int iCapacity2 = byteBuffer.capacity();
        if (iCapacity > byteBuffer.capacity()) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(iCapacity, "end > capacity: ", iCapacity2, " > "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i7 = 0;
        try {
            byteBuffer.position(0);
            byteBuffer.limit(iCapacity);
            byteBuffer.position(8);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (byteBufferSlice.hasRemaining()) {
                i7++;
                if (byteBufferSlice.remaining() < 8) {
                    throw new G5.b(G.m(i7, "Insufficient data to read size of APK Signing Block entry #"));
                }
                long j6 = byteBufferSlice.getLong();
                if (j6 < 4 || j6 > 2147483647L) {
                    throw new G5.b("APK Signing Block entry #" + i7 + " size out of range: " + j6);
                }
                int i10 = (int) j6;
                int iPosition2 = byteBufferSlice.position() + i10;
                if (i10 > byteBufferSlice.remaining()) {
                    StringBuilder sbP = q0.p(i7, "APK Signing Block entry #", i10, " size out of range: ", ", available: ");
                    sbP.append(byteBufferSlice.remaining());
                    throw new G5.b(sbP.toString());
                }
                Integer numValueOf = Integer.valueOf(byteBufferSlice.getInt());
                int i11 = i10 - 4;
                if (i11 < 0) {
                    throw new IllegalArgumentException(G.m(i11, "size: "));
                }
                int iLimit2 = byteBufferSlice.limit();
                int iPosition3 = byteBufferSlice.position();
                int i12 = i11 + iPosition3;
                if (i12 < iPosition3 || i12 > iLimit2) {
                    throw new BufferUnderflowException();
                }
                byteBufferSlice.limit(i12);
                try {
                    ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
                    byteBufferSlice2.order(byteBufferSlice.order());
                    byteBufferSlice.position(i12);
                    byteBufferSlice.limit(iLimit2);
                    linkedHashMap.put(numValueOf, byteBufferSlice2);
                    byteBufferSlice.position(iPosition2);
                } catch (Throwable th) {
                    byteBufferSlice.limit(iLimit2);
                    throw th;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
            throw th2;
        }
    }

    public static TextView r(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (view instanceof ViewGroup) {
            return r(((ViewGroup) view).getChildAt(0));
        }
        return null;
    }

    public static final IconicsDrawable s(Context context) {
        if (context == null) {
            return null;
        }
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, S6.a.pay_AddFill);
        iconicsDrawable.a(new z(context, 2));
        return iconicsDrawable;
    }

    public static IApiAccountService t() {
        if (f3159a == null) {
            synchronized (a.class) {
                try {
                    if (f3159a == null) {
                        f3159a = (IApiAccountService) p324va.e.a().f43145a.b(IApiAccountService.class);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3159a;
    }

    public static int u(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        throw new IllegalArgumentException(F.c(i7, "The given lens facing integer: ", " can not be recognized."));
    }

    public static Set v() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final IconicsDrawable w(Context context, IIcon icon, Integer num, Integer num2, float f10, float f11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context);
        iconicsDrawable.i(icon);
        int iDp2px = SizeUtils.dp2px(f10);
        iconicsDrawable.j(p059e1.a.j(context, f11));
        iconicsDrawable.k(iDp2px);
        iconicsDrawable.l(iDp2px);
        if (num != null) {
            iconicsDrawable.setTint(num.intValue());
            return iconicsDrawable;
        }
        if (num2 != null) {
            iconicsDrawable.setTint(context.getColor(num2.intValue()));
        }
        return iconicsDrawable;
    }

    public static /* synthetic */ IconicsDrawable x(Context context, IIcon iIcon, Integer num, Integer num2, float f10, int i7) {
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        return w(context, iIcon, num, num2, f10, (i7 & 64) != 0 ? 0.0f : 18.0f);
    }

    public static final View y(ViewGroup viewGroup, int i7) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i7, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return viewInflate;
    }

    public abstract View A(BaseViewHolder baseViewHolder);

    public abstract View B(BaseViewHolder baseViewHolder);

    public abstract View C(BaseViewHolder baseViewHolder);

    public abstract View D(ViewGroup viewGroup);

    public void l(BaseViewHolder holder, R1.a loadMoreStatus) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(loadMoreStatus, "loadMoreStatus");
        int iOrdinal = loadMoreStatus.ordinal();
        if (iOrdinal == 0) {
            C(holder).setVisibility(8);
            z(holder).setVisibility(0);
            B(holder).setVisibility(8);
            A(holder).setVisibility(8);
            return;
        }
        if (iOrdinal == 1) {
            C(holder).setVisibility(0);
            z(holder).setVisibility(8);
            B(holder).setVisibility(8);
            A(holder).setVisibility(8);
            return;
        }
        if (iOrdinal == 2) {
            C(holder).setVisibility(8);
            z(holder).setVisibility(8);
            B(holder).setVisibility(0);
            A(holder).setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        C(holder).setVisibility(8);
        z(holder).setVisibility(8);
        B(holder).setVisibility(8);
        A(holder).setVisibility(0);
    }

    public abstract View z(BaseViewHolder baseViewHolder);
}
