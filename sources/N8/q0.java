package N8;

import android.os.Parcel;
import androidx.fragment.app.C1161a;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q0 {
    public static double a(double d2, double d10, double d11, double d12) {
        return ((d2 - d10) * d11) + d12;
    }

    public static int b(int i7, int i10, long j6) {
        return (Long.hashCode(j6) + i7) * i10;
    }

    public static long c(Calendar calendar, int i7, int i10, int i11, int i12) {
        calendar.set(i7, i10);
        calendar.set(i11, i12);
        return calendar.getTimeInMillis();
    }

    public static Wc.p d(ArrayList arrayList, Wc.p pVar) {
        arrayList.add(pVar);
        return new Wc.p();
    }

    public static C1161a e(androidx.fragment.app.Z z3, androidx.fragment.app.Z z8) {
        z3.getClass();
        return new C1161a(z8);
    }

    public static BaseStyleConfig f(String str) {
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        baseStyleConfig.setBgColor(str);
        return baseStyleConfig;
    }

    public static TextStyleConfig g(String str) {
        TextStyleConfig textStyleConfig = new TextStyleConfig();
        textStyleConfig.setTextColor(str);
        return textStyleConfig;
    }

    public static TextStyleConfig h(String str, Float f10) {
        TextStyleConfig textStyleConfig = new TextStyleConfig();
        textStyleConfig.setTextColor(str);
        textStyleConfig.setTextSize(f10);
        return textStyleConfig;
    }

    public static Object i(int i7, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i7);
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(StringBuilder sb2, int i7, char c6) {
        sb2.append(i7);
        sb2.append(c6);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, long j6) {
        sb2.append(j6);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder p(int i7, String str, int i10, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void r(Parcel parcel, int i7, Boolean bool) {
        parcel.writeInt(i7);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void s(Parcel parcel, int i7, Integer num) {
        parcel.writeInt(i7);
        parcel.writeInt(num.intValue());
    }

    public static void t(Parcel parcel, int i7, Long l5) {
        parcel.writeInt(i7);
        parcel.writeLong(l5.longValue());
    }

    public static void u(String str) {
        ARouter.getInstance().build(str).navigation();
    }

    public static void v(String str, String str2, String str3) {
        ARouter.getInstance().build(str).withString(str2, str3).navigation();
    }

    public static void w(StringBuilder sb2, Long l5, String str, Long l6, String str2) {
        sb2.append(l5);
        sb2.append(str);
        sb2.append(l6);
        sb2.append(str2);
    }

    public static double x(double d2, double d10, double d11, double d12) {
        return (d2 * d10 * d11) + d12;
    }

    public static String y(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String z(int i7) {
        switch (i7) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
