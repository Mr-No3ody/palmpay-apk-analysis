package com.horcrux.svg;

import Pa.C0525w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.local.dao.AdDao;
import com.transsnet.adsdk.data.local.database.AdDatabase;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d0 {
    public static /* synthetic */ int a(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 8;
        }
        if (i7 == 3) {
            return 99;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i7) {
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                if (i7 == 3) {
                    return 3;
                }
                throw null;
            }
        }
        return i10;
    }

    public static /* synthetic */ long c(int i7) {
        switch (i7) {
            case 1:
                return 67324752L;
            case 2:
                return 134695760L;
            case 3:
                return 33639248L;
            case 4:
                return 101010256L;
            case 5:
                return 808471376L;
            case 6:
                return 84233040L;
            case 7:
                return 134630224L;
            case 8:
                return 134695760L;
            case 9:
                return 117853008L;
            case 10:
                return 101075792L;
            case 11:
                return 1L;
            case 12:
                return 39169L;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int d(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        throw null;
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static View f(LayoutInflater layoutInflater, int i7, ViewGroup viewGroup, String str, O6.f fVar) {
        View viewInflate = layoutInflater.inflate(i7, viewGroup);
        Intrinsics.checkNotNullExpressionValue(viewInflate, str);
        fVar.setContentView(viewInflate);
        return viewInflate;
    }

    public static Postcard g(int i7, String str, String str2) {
        return ARouter.getInstance().build(str).withInt(str2, i7);
    }

    public static AdDao h() {
        return AdDatabase.getInstance(AdManager.get().getApp()).adDao();
    }

    public static SpanUtils i(Context context, int i7, SpanUtils spanUtils, String str) {
        return spanUtils.setForegroundColor(context.getColor(i7)).append(str);
    }

    public static SpanUtils j(String str, String str2, SpanUtils spanUtils) {
        return spanUtils.append(str + str2);
    }

    public static SpanUtils k(String str, String str2, String str3, SpanUtils spanUtils) {
        return spanUtils.append(str + str2 + str3);
    }

    public static Object l(Class cls, String str) {
        C0525w.f().getClass();
        return C0525w.d(str, cls);
    }

    public static Object m(String str, String str2) {
        Object objNavigation = ARouter.getInstance().build(str).navigation();
        Intrinsics.f(objNavigation, str2);
        return objNavigation;
    }

    public static String n(int i7, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i7);
        return sb2.toString();
    }

    public static String o(LanguageManager$Companion languageManager$Companion, String str) {
        languageManager$Companion.getInstance().getClass();
        return p280s6.a.a(str);
    }

    public static String p(String str) {
        return Pa.H.c(BaseApplication.get()).d(str);
    }

    public static String q(String str, boolean z3) {
        return str + z3;
    }

    public static void r(int i7, String str, String str2) {
        Pa.H.c(BaseApplication.get()).f(i7, str, str2);
    }

    public static void s(org.aspectj.runtime.reflect.c cVar) {
        P4.f.a().getClass();
        P4.f.b(cVar);
    }

    public static boolean t() {
        return BaseApplication.get().getUser().isTier0User();
    }

    public static /* synthetic */ String u(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return com.google.maps.android.BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("sharp")) {
            return 1;
        }
        if (str.equals("smooth")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMidLine.".concat(str));
    }
}
