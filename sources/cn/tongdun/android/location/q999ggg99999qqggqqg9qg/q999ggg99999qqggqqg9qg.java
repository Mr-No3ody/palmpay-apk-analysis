package cn.tongdun.android.location.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q999ggg99999qqggqqg9qg {
    private static Handler gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static C0005q999ggg99999qqggqqg9qg f19068q999ggg99999qqggqqg9qg;
    private static qgq9qg99 qgq9qg99;
    private static HandlerThread qqggggg9g9q99q9gq;

    /* JADX INFO: renamed from: cn.tongdun.android.location.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
    public static final class C0005q999ggg99999qqggqqg9qg implements LocationListener {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private final LocationManager f19069q999ggg99999qqggqqg9qg;

        private C0005q999ggg99999qqggqqg9qg(LocationManager locationManager) {
            this.f19069q999ggg99999qqggqqg9qg = locationManager;
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(int i7) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.f19069q999ggg99999qqggqqg9qg);
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.f19069q999ggg99999qqggqqg9qg);
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i7, Bundle bundle) {
        }

        public /* synthetic */ C0005q999ggg99999qqggqqg9qg(LocationManager locationManager, byte b7) {
            this(locationManager);
        }
    }

    public static final class qgq9qg99 implements LocationListener {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private final LocationManager f19070q999ggg99999qqggqqg9qg;

        private qgq9qg99(LocationManager locationManager) {
            this.f19070q999ggg99999qqggqqg9qg = locationManager;
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(int i7) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.f19070q999ggg99999qqggqqg9qg);
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.f19070q999ggg99999qqggqqg9qg);
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i7, Bundle bundle) {
        }

        public /* synthetic */ qgq9qg99(LocationManager locationManager, byte b7) {
            this(locationManager);
        }
    }

    static {
        q999ggg99999qqggqqg9qg("543b3e222932397e6a21232b302e342e3235745b36343222343828383a2735222e2737383621293235", 66);
        q999ggg99999qqggqqg9qg("5432372b203b307763282a2239273d273b3c7d523f3d3b2b3d3124323a36272e3e313f28203b3c", 75);
        qqggggg9g9q99q9gq = null;
        gqgg9q99qg9 = null;
    }

    public static String q999ggg99999qqggqqg9qg(Context context, LocationManager locationManager, boolean z3, int i7) {
        if (z3 && (cn.tongdun.android.location.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("5452574b405b501703484a4259475d475b5c1d325f5d5b4b5d5144525a56474e5e515f48405b5c", 43)) || cn.tongdun.android.location.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("547a7f636873783f2b60626a716f756f7374351a77757363757969797b6674636f6676797760687374", 3)))) {
            JSONObject jSONObject = new JSONObject();
            if (qgq9qg99(locationManager) == null) {
                return "";
            }
            String[] strArr = {q999ggg99999qqggqqg9qg("521d09", 124), q999ggg99999qqggqqg9qg("5b4852405b5e5a", 53)};
            String str = null;
            Location lastKnownLocation = null;
            for (int i10 = 0; i10 < 2; i10++) {
                String str2 = strArr[i10];
                try {
                    lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        str = str2;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (lastKnownLocation == null) {
                qgq9qg99(locationManager, context);
                return "";
            }
            boolean zQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(lastKnownLocation, str, i7);
            if (zQ999ggg99999qqggqqg9qg) {
                qgq9qg99(locationManager, context);
            }
            try {
                jSONObject.put(q999ggg99999qqggqqg9qg("41080c10", 115), lastKnownLocation.getProvider());
                jSONObject.put(q999ggg99999qqggqqg9qg("595e46", 37), lastKnownLocation.getLatitude());
                jSONObject.put(q999ggg99999qqggqqg9qg("5926242c", 83), lastKnownLocation.getLongitude());
                jSONObject.put(q999ggg99999qqggqqg9qg("547d7f", 9), lastKnownLocation.getAccuracy());
                if (zQ999ggg99999qqggqqg9qg) {
                    jSONObject.put(q999ggg99999qqggqqg9qg("58303e3a", 68), 1);
                }
                return jSONObject.toString();
            } catch (JSONException unused2) {
            }
        }
        return "";
    }

    private static List qgq9qg99(LocationManager locationManager) {
        if (locationManager == null) {
            return null;
        }
        try {
            return locationManager.getProviders(true);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String q999ggg99999qqggqqg9qg(WifiInfo wifiInfo) {
        return wifiInfo != null ? wifiInfo.getSSID() : "";
    }

    private static synchronized void qgq9qg99(LocationManager locationManager, Context context) {
        try {
            if (qqggggg9g9q99q9gq == null) {
                HandlerThread handlerThread = new HandlerThread(q999ggg99999qqggqqg9qg("41051f171d0f052f2d06", 104));
                qqggggg9g9q99q9gq = handlerThread;
                handlerThread.start();
                gqgg9q99qg9 = new Handler(qqggggg9g9q99q9gq.getLooper());
            }
            gqgg9q99qg9.post(new cn.tongdun.android.location.q999ggg99999qqggqqg9qg.qgq9qg99(locationManager, context));
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String q999ggg99999qqggqqg9qg(WifiManager wifiManager) {
        int size;
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults == null || (size = scanResults.size()) <= 0) {
                return null;
            }
            if (size > 10) {
                size = 10;
            }
            JSONArray jSONArray = new JSONArray();
            for (int i7 = 0; i7 < size; i7++) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(scanResults.get(i7).BSSID);
                jSONArray2.put(scanResults.get(i7).SSID);
                jSONArray2.put(scanResults.get(i7).level);
                jSONArray.put(jSONArray2);
            }
            return jSONArray.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 118);
            byte b10 = (byte) (bArr[0] ^ 53);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static boolean q999ggg99999qqggqqg9qg(Location location, String str, int i7) {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("565a170d4c565e54464c1718585d414a515a1d0a4c5a5e57151a5b5557555617317a5e4b42406f5350", 33));
            objInvoke = cls.getDeclaredMethod(q999ggg99999qqggqqg9qg("5b01", 41), Integer.TYPE, Object.class).invoke(cls, Integer.valueOf(i7), new Object[]{location, str});
        } catch (Throwable unused) {
            objInvoke = null;
        }
        if (objInvoke != null) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }

    public static int q999ggg99999qqggqqg9qg(Context context, LocationManager locationManager, boolean z3) {
        if (!z3) {
            return -1;
        }
        String[] strArr = {q999ggg99999qqggqqg9qg("542e2b373c272c6b7f34363e253b213b2720614e23212737212d3d2d2f3220373b32222d23343c2720", 87), q999ggg99999qqggqqg9qg("547c79656e757e392d66646c776973697572331c71737565737f6a7c74786960707f71666e7572", 5)};
        boolean z8 = false;
        for (int i7 = 0; i7 < 2; i7++) {
            if (context.checkPermission(strArr[i7], Process.myPid(), Process.myUid()) == 0) {
                z8 = true;
            }
        }
        int i10 = (locationManager.isProviderEnabled(q999ggg99999qqggqqg9qg("527e6a", 31)) || locationManager.isProviderEnabled(q999ggg99999qqggqqg9qg("5b13091b000501", HomeDialogState.PRIORITY_HIGHEST))) ? 1 : 0;
        int i11 = Build.VERSION.SDK_INT;
        if (z8) {
            i10 |= 2;
        }
        return (i11 <= 28 || !cn.tongdun.android.location.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("5440455952494205115a58504b554f55494e0f204d4f49594f43524c4d47435a52555445545c4c434d5a52494e", 57))) ? i10 : i10 | 4;
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(LocationManager locationManager, Context context) {
        LocationManager locationManager2;
        if (locationManager == null || qgq9qg99(locationManager) == null) {
            return;
        }
        byte b7 = 0;
        try {
            if (locationManager.isProviderEnabled(q999ggg99999qqggqqg9qg("52081c", 105))) {
                if (f19068q999ggg99999qqggqqg9qg == null) {
                    f19068q999ggg99999qqggqqg9qg = new C0005q999ggg99999qqggqqg9qg(locationManager, b7);
                }
                locationManager2 = locationManager;
                try {
                    locationManager2.requestLocationUpdates(q999ggg99999qqggqqg9qg("522d39", 76), 0L, 1.0f, f19068q999ggg99999qqggqqg9qg);
                } catch (Throwable unused) {
                }
            } else {
                locationManager2 = locationManager;
            }
        } catch (Throwable unused2) {
        }
        try {
            if (locationManager2.isProviderEnabled(q999ggg99999qqggqqg9qg("5b2c36243f3a3e", 81))) {
                if (qgq9qg99 == null) {
                    qgq9qg99 = new qgq9qg99(locationManager2, b7);
                }
                locationManager2.requestLocationUpdates(q999ggg99999qqggqqg9qg("5b0e14061d181c", 115), 0L, 1.0f, qgq9qg99);
            }
        } catch (Throwable unused3) {
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(LocationManager locationManager) {
        if (locationManager != null) {
            qgq9qg99 qgq9qg99Var = qgq9qg99;
            if (qgq9qg99Var != null) {
                locationManager.removeUpdates(qgq9qg99Var);
                qgq9qg99 = null;
            }
            C0005q999ggg99999qqggqqg9qg c0005q999ggg99999qqggqqg9qg = f19068q999ggg99999qqggqqg9qg;
            if (c0005q999ggg99999qqggqqg9qg != null) {
                locationManager.removeUpdates(c0005q999ggg99999qqggqqg9qg);
                f19068q999ggg99999qqggqqg9qg = null;
            }
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg() {
        synchronized (q999ggg99999qqggqqg9qg.class) {
            try {
                if (qqggggg9g9q99q9gq != null) {
                    gqgg9q99qg9.removeCallbacksAndMessages(null);
                    qqggggg9g9q99q9gq.quit();
                    qqggggg9g9q99q9gq = null;
                    gqgg9q99qg9 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
