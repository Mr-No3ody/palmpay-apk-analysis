package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C0995o;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13137a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

    public static /* synthetic */ boolean a(int i7, int i10) {
        if (i7 != 0) {
            return i7 == i10;
        }
        throw null;
    }

    public static androidx.camera.core.impl.L0 b(ArrayList arrayList, androidx.camera.core.impl.L0 l5) {
        arrayList.add(l5);
        return new androidx.camera.core.impl.L0();
    }

    public static String c(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String d(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder e(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder f(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void g(int i7, androidx.camera.core.impl.M0 m7, long j6, androidx.camera.core.impl.L0 l5) {
        l5.a(new C0995o(i7, m7, j6));
    }

    public static /* synthetic */ String h(int i7) {
        switch (i7) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int i(int i7) {
        if (i7 != 0) {
            return i7 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String j(int i7) {
        switch (i7) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ String k(int i7) {
        switch (i7) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ int[] l(int i7) {
        int[] iArr = new int[i7];
        System.arraycopy(f13137a, 0, iArr, 0, i7);
        return iArr;
    }
}
