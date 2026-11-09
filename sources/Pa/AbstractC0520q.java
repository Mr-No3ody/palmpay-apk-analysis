package Pa;

import android.os.Build;
import com.adjust.sdk.Constants;

/* JADX INFO: renamed from: Pa.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0520q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f7140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f7141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f7142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f7143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f7144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f7145k;

    static {
        String str = Build.BRAND;
        f7135a = str;
        String str2 = Build.MODEL;
        f7136b = str2;
        f7137c = Build.DEVICE;
        String str3 = Build.MANUFACTURER;
        f7138d = Build.VERSION.SDK_INT;
        boolean zEqualsIgnoreCase = "TECNO".equalsIgnoreCase(str);
        f7139e = zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2 = "Infinix".equalsIgnoreCase(str);
        f7140f = zEqualsIgnoreCase2;
        f7141g = "Redmi".equalsIgnoreCase(str);
        f7142h = Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str);
        f7143i = Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str3);
        f7144j = Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str3);
        f7145k = (zEqualsIgnoreCase2 && "Infinix X6525D".equalsIgnoreCase(str2)) || (zEqualsIgnoreCase && "TECNO BG6m".equalsIgnoreCase(str2)) || ((zEqualsIgnoreCase2 && "Infinix X6531B".equalsIgnoreCase(str2)) || ((zEqualsIgnoreCase2 && "Infinix X6516".equalsIgnoreCase(str2)) || (zEqualsIgnoreCase && "TECNO BF6".equalsIgnoreCase(str2))));
    }

    public static boolean a() {
        int i7 = f7138d;
        if (i7 <= 33 || i7 == 34 || i7 == 35) {
            return false;
        }
        String[] strArr = {"TECNO BF7", "TECNO BF6", "TECNO KC8", "TECNO CG6", "TECNO KG5k", "TECNO LK7k", "TECNO CN5C", "TECNO KM5", "TECNO KM4", "TECNO BG6m"};
        String[] strArr2 = {"Infinix X6525", "Infinix X6525D", "Infinix X6516", "Infinix X6528", "Infinix X657", "Infinix X6887"};
        String[] strArr3 = {"2409BRN2CL", "2409BRN2CA", "23106RN0DA"};
        String[] strArr4 = {"SM-A135F", "SM-A055F"};
        boolean z3 = f7139e;
        String str = f7136b;
        if (z3) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (strArr[i10].equalsIgnoreCase(str)) {
                    return false;
                }
            }
            return true;
        }
        if (f7140f) {
            for (int i11 = 0; i11 < 6; i11++) {
                if (strArr2[i11].equalsIgnoreCase(str)) {
                    return false;
                }
            }
            return true;
        }
        if (f7141g) {
            for (int i12 = 0; i12 < 3; i12++) {
                if (strArr3[i12].equalsIgnoreCase(str)) {
                    return false;
                }
            }
            return true;
        }
        if (!f7142h) {
            return true;
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (strArr4[i13].equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
