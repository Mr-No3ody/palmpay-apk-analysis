package androidx.camera.video;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.maps.android.BuildConfig;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ String A(int i7) {
        switch (i7) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) / f13;
    }

    public static int b(int i7, int i10, int i11) {
        return (Integer.hashCode(i7) + i10) * i11;
    }

    public static int c(int i7, int i10, int i11, int i12) {
        return ((i7 * i10) / i11) + i12;
    }

    public static int d(int i7, int i10, boolean z3) {
        return (Boolean.hashCode(z3) + i7) * i10;
    }

    public static Object e(int i7, List list) {
        return list.get(list.size() - i7);
    }

    public static String f(int i7, int i10, String str) {
        return str.substring(i10, str.length() - i7);
    }

    public static String g(int i7, String str) {
        return i7 + str;
    }

    public static String h(int i7, String str, int i10, String str2) {
        return str + i7 + str2 + i10;
    }

    public static String i(long j6, String str) {
        return str + j6;
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String k(File file, String str) {
        return str + file;
    }

    public static String l(Class cls, String str) {
        return str + cls;
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String o(StringBuilder sb2, Class cls, String str) {
        sb2.append(cls);
        sb2.append(str);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, char c6) {
        sb2.append(str);
        sb2.append(c6);
        return sb2.toString();
    }

    public static String q(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static StringBuilder r(long j6, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j6);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder s(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void u(StringBuilder sb2, int i7, String str, int i10, String str2) {
        sb2.append(i7);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void v(StringBuilder sb2, String str, long j6, String str2) {
        sb2.append(str);
        sb2.append(j6);
        sb2.append(str2);
    }

    public static void w(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void x(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static int y(int i7, int i10, int i11, int i12) {
        return ((i7 / i10) * i11) + i12;
    }

    public static /* synthetic */ String z(int i7) {
        if (i7 == 1) {
            return "NOT_INITIALIZED";
        }
        if (i7 == 2) {
            return "INITIALIZING";
        }
        if (i7 == 3) {
            return "PENDING_RELEASE";
        }
        if (i7 != 4) {
            return i7 != 5 ? BuildConfig.TRAVIS : "RELEASED";
        }
        return "READY";
    }
}
