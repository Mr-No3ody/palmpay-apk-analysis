package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1vSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 320319342;
    private static byte[] AFInAppEventType = {-94, 125, -101, 120, 7};
    private static short[] AFKeystoreWrapper = null;
    private static int AFLogger = 1618272529;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f20391d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f20392e = 0;
    private static int registerClient = -801456921;
    private final AFg1vSDK copy;
    private final String copydefault;
    private final AFc1pSDK equals;
    private final AFc1eSDK hashCode;

    public AFf1vSDK(@NonNull String str, @NonNull AFd1zSDK aFd1zSDK) {
        super(new AFf1bSDK(), aFd1zSDK, str);
        this.equals = aFd1zSDK.getMonetizationNetwork();
        this.hashCode = aFd1zSDK.AFInAppEventParameterName();
        this.copydefault = str;
        this.copy = aFd1zSDK.component3();
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i7, int i10, int i11) {
        int i12 = ((i10 | i11) * 140) + (i10 * (-279)) + (i7 * 141);
        int i13 = (~i7) | i10;
        int i14 = ~i13;
        int i15 = ~i11;
        if ((((~(i7 | i15)) | (~((~i10) | i7)) | (~(i13 | i11))) * 140) + ((i14 | (~(i15 | i10))) * (-280)) + i12 == 1) {
            return getRevenue(objArr);
        }
        f20392e = (f20391d + 35) % 128;
        return null;
    }

    private static void a(short s3, byte b7, int i7, int i10, int i11, Object[] objArr) {
        int i12;
        boolean z3;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        StringBuilder sb2 = new StringBuilder();
        int i13 = i10 + ((int) (((long) AFInAppEventParameterName) ^ (-6574295418780799225L)));
        if (i13 == -1) {
            $10 = ($11 + 47) % 128;
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i12 != 0) {
            $11 = ($10 + 35) % 128;
            byte[] bArr = AFInAppEventType;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i14 = 0; i14 < length; i14++) {
                    bArr2[i14] = (byte) (((long) bArr[i14]) ^ (-6574295418780799225L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i15 = $11 + 19;
                $10 = i15 % 128;
                i13 = (byte) (i15 % 2 != 0 ? ((byte) (((long) AFInAppEventType[i11 - ((int) (((long) AFLogger) - (-6574295418780799225L)))]) * (-6574295418780799225L))) % ((int) (((long) AFInAppEventParameterName) / (-6574295418780799225L))) : ((byte) (((long) AFInAppEventType[i11 + ((int) (((long) AFLogger) ^ (-6574295418780799225L)))]) ^ (-6574295418780799225L))) + ((int) (((long) AFInAppEventParameterName) ^ (-6574295418780799225L))));
            } else {
                i13 = (short) (((short) (((long) AFKeystoreWrapper[i11 + ((int) (((long) AFLogger) ^ (-6574295418780799225L)))]) ^ (-6574295418780799225L))) + ((int) (((long) AFInAppEventParameterName) ^ (-6574295418780799225L))));
            }
        }
        if (i13 > 0) {
            aFk1mSDK.getMediationNetwork = ((i11 + i13) - 2) + ((int) (((long) AFLogger) ^ (-6574295418780799225L))) + i12;
            char c6 = (char) (i7 + ((int) (((long) registerClient) ^ (-6574295418780799225L))));
            aFk1mSDK.AFAdRevenueData = c6;
            sb2.append(c6);
            aFk1mSDK.getRevenue = aFk1mSDK.AFAdRevenueData;
            byte[] bArr3 = AFInAppEventType;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i16 = 0; i16 < length2; i16++) {
                    bArr4[i16] = (byte) (((long) bArr3[i16]) ^ (-6574295418780799225L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $10 = ($11 + 105) % 128;
                z3 = true;
            } else {
                z3 = false;
            }
            aFk1mSDK.getCurrencyIso4217Code = 1;
            while (aFk1mSDK.getCurrencyIso4217Code < i13) {
                int i17 = $11 + 55;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
                if (z3) {
                    byte[] bArr5 = AFInAppEventType;
                    int i18 = aFk1mSDK.getMediationNetwork;
                    aFk1mSDK.getMediationNetwork = i18 - 1;
                    aFk1mSDK.AFAdRevenueData = (char) (aFk1mSDK.getRevenue + (((byte) (((byte) (((long) bArr5[i18]) ^ (-6574295418780799225L))) + s3)) ^ b7));
                } else {
                    short[] sArr = AFKeystoreWrapper;
                    int i19 = aFk1mSDK.getMediationNetwork;
                    aFk1mSDK.getMediationNetwork = i19 - 1;
                    aFk1mSDK.AFAdRevenueData = (char) (aFk1mSDK.getRevenue + (((short) (((short) (((long) sArr[i19]) ^ (-6574295418780799225L))) + s3)) ^ b7));
                }
                sb2.append(aFk1mSDK.AFAdRevenueData);
                aFk1mSDK.getRevenue = aFk1mSDK.AFAdRevenueData;
                aFk1mSDK.getCurrencyIso4217Code++;
                $10 = ($11 + 37) % 128;
            }
        }
        objArr[0] = sb2.toString();
    }

    private void equals() {
        f20392e = (f20391d + 61) % 128;
        ((AFf1rSDK) this).component3.AFAdRevenueData("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i7 = f20392e + 105;
        f20391d = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 47 / 0;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i7 = f20391d + 3;
        f20392e = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @NonNull
    private String s_(PackageManager packageManager) {
        ApplicationInfo applicationInfo = this.equals.n_().applicationInfo;
        if (applicationInfo == null) {
            f20391d = (f20392e + 125) % 128;
            return "";
        }
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        int i7 = f20392e + 93;
        f20391d = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 78 / 0;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void component1(AFh1qSDK aFh1qSDK) {
        int i7 = f20392e + 97;
        f20391d = i7 % 128;
        if (i7 % 2 == 0) {
            this.equals.getMediationNetwork();
            throw null;
        }
        String mediationNetwork = this.equals.getMediationNetwork();
        if (mediationNetwork != null) {
            aFh1qSDK.getMediationNetwork("advertiserId", mediationNetwork);
            f20392e = (f20391d + 39) % 128;
        }
        f20391d = (f20392e + 27) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        int i7 = f20391d;
        int i10 = i7 + 17;
        f20392e = i10 % 128;
        boolean z3 = i10 % 2 != 0;
        int i11 = i7 + 25;
        f20392e = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 82 / 0;
        }
        return z3;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getCurrencyIso4217Code(AFh1qSDK aFh1qSDK) {
        int i7 = f20392e + 13;
        f20391d = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        ResponseNetwork responseNetwork = this.areAllFieldsValid;
        if (responseNetwork != null) {
            f20392e = (f20391d + 123) % 128;
            if (responseNetwork.isSuccessful()) {
                f20392e = (f20391d + 37) % 128;
                equals();
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMonetizationNetwork(AFh1qSDK aFh1qSDK) {
        AFAdRevenueData(new Object[]{this, aFh1qSDK}, 1096149227, -1096149227, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getRevenue(AFh1qSDK aFh1qSDK) {
        f20392e = (f20391d + 41) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(AFh1qSDK aFh1qSDK) {
        super.AFAdRevenueData(aFh1qSDK);
        Context context = this.hashCode.getRevenue;
        AFa1uSDK aFa1uSDK = (AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis());
        if (context != null) {
            if (!aFa1uSDK.getCurrencyIso4217Code()) {
                try {
                    aFh1qSDK.getMediationNetwork("app_version_code", Integer.toString(this.equals.n_().versionCode));
                    aFh1qSDK.getMediationNetwork("app_version_name", this.equals.n_().versionName);
                    aFh1qSDK.getMediationNetwork("app_name", s_(context.getPackageManager()));
                    aFh1qSDK.getMediationNetwork("installDate", AFa1uSDK.getRevenue(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), this.equals.n_().firstInstallTime));
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", th);
                }
                this.copy.AFAdRevenueData(aFh1qSDK.getMediationNetwork);
                aFh1qSDK.getMediationNetwork.remove("ivc");
                String strAFAdRevenueData = AFa1uSDK.AFAdRevenueData();
                if (strAFAdRevenueData != null) {
                    f20391d = (f20392e + 55) % 128;
                    aFh1qSDK.getMediationNetwork("appUserId", strAFAdRevenueData);
                }
                try {
                    aFh1qSDK.getMediationNetwork("model", Build.MODEL);
                    Object[] objArr = new Object[1];
                    a((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 114), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 31), 1020456066 - TextUtils.getOffsetAfter("", 0), (-99) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-1935887894) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                    aFh1qSDK.getMediationNetwork(((String) objArr[0]).intern(), Build.BRAND);
                    f20391d = (f20392e + 113) % 128;
                } catch (Throwable th2) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
                }
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                    aFh1qSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                }
                AFb1lSDK aFb1lSDKL_ = AFb1iSDK.l_(context.getContentResolver());
                if (aFb1lSDKL_ != null) {
                    aFh1qSDK.getMediationNetwork("amazon_aid", aFb1lSDKL_.getRevenue);
                    aFh1qSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(aFb1lSDKL_.getMediationNetwork));
                }
                aFh1qSDK.getMediationNetwork("devkey", ((AFe1eSDK) this).component2.getRevenue());
                aFh1qSDK.getMediationNetwork("uid", AFb1mSDK.getMonetizationNetwork(this.equals.AFAdRevenueData));
                aFh1qSDK.getMediationNetwork("af_gcm_token", this.copydefault);
                aFh1qSDK.getMediationNetwork("launch_counter", Integer.toString(((AFf1rSDK) this).component3.getMonetizationNetwork("appsFlyerCount", 0)));
                aFh1qSDK.getMediationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
                String strComponent2 = this.equals.component2();
                if (strComponent2 != null) {
                    f20392e = (f20391d + 31) % 128;
                    aFh1qSDK.getMediationNetwork(AppsFlyerProperties.CHANNEL, strComponent2);
                    f20392e = (f20391d + 67) % 128;
                    return;
                }
                return;
            }
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        throw new IllegalStateException("Context is not provided, can't send register request");
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMediationNetwork(AFh1qSDK aFh1qSDK) {
        AFAdRevenueData(new Object[]{this, aFh1qSDK}, 1308368782, -1308368781, System.identityHashCode(this));
    }
}
