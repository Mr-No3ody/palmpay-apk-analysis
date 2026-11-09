package p226og;

import E.AbstractC0198c;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConnectivityManager f40544a;

    static {
        Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
        Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
    }

    public static boolean a() {
        return b(1) || b(2) || b(3);
    }

    public static boolean b(int i7) {
        if (f40544a == null) {
            synchronized (c.class) {
                try {
                    if (f40544a == null) {
                        AbstractC0198c.b();
                        f40544a = (ConnectivityManager) AbstractC0198c.f1997f.f11208a.getSystemService("connectivity");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c(i7, f40544a.getActiveNetworkInfo());
    }

    public static boolean c(int i7, NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return false;
        }
        if (i7 == 0) {
            throw null;
        }
        int i10 = i7 - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (c(3, networkInfo)) {
                            return d(4, networkInfo);
                        }
                        return false;
                    }
                    if (i10 == 4) {
                        if (c(3, networkInfo)) {
                            return d(5, networkInfo);
                        }
                        return false;
                    }
                    if (i10 == 5 && c(3, networkInfo)) {
                        return d(6, networkInfo);
                    }
                    return false;
                }
                if (!networkInfo.isAvailable() || !networkInfo.isConnected() || networkInfo.getType() != 0) {
                    return false;
                }
            } else if (!networkInfo.isAvailable() || !networkInfo.isConnected() || networkInfo.getType() != 9) {
                return false;
            }
        } else if (!networkInfo.isAvailable() || !networkInfo.isConnected() || networkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    public static boolean d(int i7, NetworkInfo networkInfo) {
        switch (networkInfo.getType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return i7 == 4;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return i7 == 5;
            case 13:
            case 18:
                return i7 == 6;
            default:
                String subtypeName = networkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) && i7 == 5;
        }
    }
}
