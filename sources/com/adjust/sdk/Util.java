package com.adjust.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.adjust.sdk.scheduler.SingleThreadFutureScheduler;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Util {
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static volatile SingleThreadFutureScheduler googleAdIdScheduler = null;

    public static AdjustAttribution attributionFromJson(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        adjustAttribution.jsonResponse = jSONObject.toString();
        if ("unity".equals(str)) {
            adjustAttribution.trackerToken = jSONObject.optString("tracker_token", "");
            adjustAttribution.trackerName = jSONObject.optString("tracker_name", "");
            adjustAttribution.network = jSONObject.optString("network", "");
            adjustAttribution.campaign = jSONObject.optString("campaign", "");
            adjustAttribution.adgroup = jSONObject.optString("adgroup", "");
            adjustAttribution.creative = jSONObject.optString("creative", "");
            adjustAttribution.clickLabel = jSONObject.optString("click_label", "");
            adjustAttribution.costType = jSONObject.optString("cost_type", "");
            adjustAttribution.costAmount = Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            adjustAttribution.costCurrency = jSONObject.optString("cost_currency", "");
            adjustAttribution.fbInstallReferrer = jSONObject.optString("fb_install_referrer", "");
            return adjustAttribution;
        }
        adjustAttribution.trackerToken = jSONObject.optString("tracker_token");
        adjustAttribution.trackerName = jSONObject.optString("tracker_name");
        adjustAttribution.network = jSONObject.optString("network");
        adjustAttribution.campaign = jSONObject.optString("campaign");
        adjustAttribution.adgroup = jSONObject.optString("adgroup");
        adjustAttribution.creative = jSONObject.optString("creative");
        adjustAttribution.clickLabel = jSONObject.optString("click_label");
        adjustAttribution.costType = jSONObject.optString("cost_type");
        adjustAttribution.costAmount = Double.valueOf(jSONObject.optDouble("cost_amount"));
        adjustAttribution.costCurrency = jSONObject.optString("cost_currency");
        adjustAttribution.fbInstallReferrer = jSONObject.optString("fb_install_referrer");
        return adjustAttribution;
    }

    public static boolean checkPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e10) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e10.getMessage());
            return false;
        }
    }

    public static String convertToHex(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return formatString(C0.G.n(bArr.length << 1, "x", new StringBuilder("%0")), bigInteger);
    }

    public static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(Enum r3, Enum r10) {
        return equalObject(r3, r10);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(Long l5, Long l6) {
        return equalObject(l5, l6);
    }

    public static boolean equalObject(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(Double d2, Double d10) {
        if (d2 == null || d10 == null) {
            return d2 == null && d10 == null;
        }
        return Double.doubleToLongBits(d2.doubleValue()) == Double.doubleToLongBits(d10.doubleValue());
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String getAdidFromActivityStateFile(Context context) {
        ActivityState activityState = (ActivityState) readObject(context, Constants.ACTIVITY_STATE_FILENAME, "Activity state", ActivityState.class);
        if (activityState == null) {
            return null;
        }
        return activityState.adid;
    }

    public static Object getAdvertisingInfoObject(Context context, long j6) {
        return runSyncInGoogleAdIdSchedulerWithTimeout(context, new W(context), j6);
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    public static AdjustAttribution getAttributionFromAttributionFile(Context context) {
        return (AdjustAttribution) readObject(context, Constants.ATTRIBUTION_FILENAME, "Attribution", AdjustAttribution.class);
    }

    public static String getCpuAbi() {
        return null;
    }

    public static String getGoogleAdId(Context context, Object obj, long j6) {
        return (String) runSyncInGoogleAdIdSchedulerWithTimeout(context, new X(obj, context, 0), j6);
    }

    public static Locale getLocale(Configuration configuration) {
        LocaleList locales = configuration.getLocales();
        if (locales == null || locales.isEmpty()) {
            return null;
        }
        return locales.get(0);
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String getReasonString(String str, Throwable th) {
        return th != null ? formatString("%s: %s", str, th) : formatString("%s", str);
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        int iIndexOf = string.indexOf("Caused by:");
        return string.substring(iIndexOf, string.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, iIndexOf));
    }

    private static String getSdkPrefix(String str) {
        String[] strArrSplit;
        if (str != null && str.contains("@") && (strArrSplit = str.split("@")) != null && strArrSplit.length == 2) {
            return strArrSplit[0];
        }
        return null;
    }

    public static String getSdkPrefixPlatform(String str) {
        String[] strArrSplit;
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (strArrSplit = sdkPrefix.split("\\d+", 2)) == null || strArrSplit.length == 0) {
            return null;
        }
        return strArrSplit[0];
    }

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }

    public static long getWaitingTime(int i7, BackoffStrategy backoffStrategy) {
        int i10 = backoffStrategy.minRetries;
        if (i7 < i10) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i7 - i10)) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String hash(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return convertToHex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(Boolean bool, int i7) {
        int i10 = i7 * 37;
        return bool == null ? i10 : bool.hashCode() + i10;
    }

    public static int hashDouble(Double d2, int i7) {
        int i10 = i7 * 37;
        return d2 == null ? i10 : d2.hashCode() + i10;
    }

    public static int hashEnum(Enum r3, int i7) {
        int i10 = i7 * 37;
        return r3 == null ? i10 : r3.hashCode() + i10;
    }

    public static int hashLong(Long l5, int i7) {
        int i10 = i7 * 37;
        return l5 == null ? i10 : l5.hashCode() + i10;
    }

    public static int hashObject(Object obj, int i7) {
        int i10 = i7 * 37;
        return obj == null ? i10 : obj.hashCode() + i10;
    }

    public static int hashString(String str, int i7) {
        int i10 = i7 * 37;
        return str == null ? i10 : str.hashCode() + i10;
    }

    public static boolean isAdjustUninstallDetectionPayload(Map<String, String> map) {
        return map != null && map.size() == 1 && Objects.equals(map.get(Constants.FCM_PAYLOAD_KEY), Constants.FCM_PAYLOAD_VALUE);
    }

    public static boolean isAndroidIdReadingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
            return false;
        }
        return adjustConfig.isAndroidIdReadingEnabled;
    }

    public static boolean isAppSetIdReadingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
            return false;
        }
        return adjustConfig.isAppSetIdReadingEnabled;
    }

    public static boolean isDeviceIdsFromPluginsReadingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
            return false;
        }
        return adjustConfig.isDeviceIdsFromPluginsReadingEnabled;
    }

    public static boolean isEnabledFromActivityStateFile(Context context) {
        ActivityState activityState = (ActivityState) readObject(context, Constants.ACTIVITY_STATE_FILENAME, "Activity state", ActivityState.class);
        if (activityState == null) {
            return true;
        }
        return activityState.enabled;
    }

    private static boolean isEqualGoogleReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }

    private static boolean isEqualMetaReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeMeta && equalString(referrerDetails.installReferrer, activityState.installReferrerMeta) && equalBoolean(referrerDetails.isClick, activityState.isClickMeta);
    }

    public static boolean isEqualReferrerDetails(ReferrerDetails referrerDetails, String str, ActivityState activityState) {
        if (str.equals(Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_SAMSUNG)) {
            return isEqualSamsungReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_VIVO)) {
            return isEqualVivoReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_META)) {
            return isEqualMetaReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualSamsungReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeSamsung && referrerDetails.installBeginTimestampSeconds == activityState.installBeginSamsung && equalString(referrerDetails.installReferrer, activityState.installReferrerSamsung);
    }

    private static boolean isEqualVivoReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeVivo && referrerDetails.installBeginTimestampSeconds == activityState.installBeginVivo && equalString(referrerDetails.installReferrer, activityState.installReferrerVivo) && equalString(referrerDetails.installVersion, activityState.installVersionVivo);
    }

    private static boolean isEqualXiaomiReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi) && equalString(referrerDetails.installVersion, activityState.installVersionXiaomi);
    }

    public static boolean isFbIdReadingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
            return false;
        }
        return adjustConfig.isFbIdReadingEnabled;
    }

    public static boolean isFireAdIdReadingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
            return false;
        }
        return adjustConfig.isFireAdIdReadingEnabled;
    }

    public static boolean isGoogleAdIdReadingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) {
            return false;
        }
        return adjustConfig.isGoogleAdIdReadingEnabled;
    }

    public static Boolean isGoogleAdIdTrackingEnabled(Context context, Object obj, long j6) {
        return (Boolean) runSyncInGoogleAdIdSchedulerWithTimeout(context, new X(obj, context, 1), j6);
    }

    public static boolean isGooglePlayGamesForPC(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
    }

    public static boolean isUrlFilteredOut(Uri uri) {
        String string;
        return uri == null || (string = uri.toString()) == null || string.length() == 0 || string.matches(Constants.FB_AUTH_REGEX);
    }

    public static boolean isUrlWithTrackerQueryParam(Uri uri) {
        try {
            return (uri.getQueryParameter("adj_t") == null && uri.getQueryParameter("adjust_t") == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        }
        if (!str.equals("")) {
            return true;
        }
        getLogger().error("%s parameter %s is empty", str3, str2);
        return false;
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        ILogger logger = getLogger();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) map3.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return map3;
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME, new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        return !Pattern.compile("\\s").matcher(str).find() ? str : formatString("'%s'", str);
    }

    private static double randomInRange(double d2, double d10) {
        return (new Random().nextDouble() * (d10 - d2)) + d2;
    }

    public static boolean readBooleanField(ObjectInputStream.GetField getField, String str, boolean z3) {
        try {
            return getField.get(str, z3);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return z3;
        }
    }

    public static double readDoubleField(ObjectInputStream.GetField getField, String str, double d2) {
        try {
            return getField.get(str, d2);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return d2;
        }
    }

    public static int readIntField(ObjectInputStream.GetField getField, String str, int i7) {
        try {
            return getField.get(str, i7);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return i7;
        }
    }

    public static long readLongField(ObjectInputStream.GetField getField, String str, long j6) {
        try {
            return getField.get(str, j6);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return j6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.adjust.sdk.ObjectInputFilterStream, java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static <T> T readObject(Context context, String str, String str2, Class<T> cls) {
        T t;
        T t3;
        Exception e10;
        ?? bufferedInputStream;
        ?? r10;
        ?? OpenFileInput;
        T tCast = null;
        try {
            OpenFileInput = context.openFileInput(str);
            try {
                bufferedInputStream = new BufferedInputStream(OpenFileInput);
                try {
                    OpenFileInput = new ObjectInputFilterStream(bufferedInputStream);
                    try {
                        tCast = cls.cast(OpenFileInput.readObject());
                        getLogger().debug("Read %s: %s", str2, tCast);
                    } catch (InvalidClassException e11) {
                        getLogger().error("Failed to validate %s class (%s)", str2, e11.getMessage());
                    } catch (ClassCastException e12) {
                        getLogger().error("Failed to cast %s object (%s)", str2, e12.getMessage());
                    } catch (ClassNotFoundException e13) {
                        getLogger().error("Failed to find %s class (%s)", str2, e13.getMessage());
                    } catch (Exception e14) {
                        getLogger().error("Failed to read %s object (%s)", str2, e14.getMessage());
                    }
                } catch (FileNotFoundException unused) {
                    getLogger().debug("%s file not found", str2);
                    r10 = bufferedInputStream;
                    OpenFileInput = r10;
                } catch (Exception e15) {
                    e10 = e15;
                    getLogger().error("Failed to open %s file for reading (%s)", str2, e10);
                    r10 = bufferedInputStream;
                    OpenFileInput = r10;
                }
            } catch (FileNotFoundException unused2) {
                T t8 = tCast;
                tCast = (T) OpenFileInput;
                t3 = t8;
                bufferedInputStream = tCast;
                tCast = t3;
                getLogger().debug("%s file not found", str2);
                r10 = bufferedInputStream;
                OpenFileInput = r10;
                if (OpenFileInput != 0) {
                    try {
                        OpenFileInput.close();
                    } catch (Exception e16) {
                        getLogger().error("Failed to close %s file for reading (%s)", str2, e16);
                    }
                }
                return tCast;
            } catch (Exception e17) {
                e = e17;
                T t10 = tCast;
                tCast = (T) OpenFileInput;
                t = t10;
                T t11 = tCast;
                tCast = t;
                e10 = e;
                bufferedInputStream = t11;
                getLogger().error("Failed to open %s file for reading (%s)", str2, e10);
                r10 = bufferedInputStream;
                OpenFileInput = r10;
                if (OpenFileInput != 0) {
                    OpenFileInput.close();
                }
                return tCast;
            }
        } catch (FileNotFoundException unused3) {
            t3 = null;
        } catch (Exception e18) {
            e = e18;
            t = null;
        }
        if (OpenFileInput != 0) {
            OpenFileInput.close();
        }
        return tCast;
    }

    public static <T> T readObjectField(ObjectInputStream.GetField getField, String str, T t) {
        try {
            return (T) getField.get(str, t);
        } catch (Exception e10) {
            getLogger().debug(fieldReadErrorMessage, str, e10.getMessage());
            return t;
        }
    }

    public static String readStringField(ObjectInputStream.GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(Context context, String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (Exception unused) {
        }
    }

    private static <R> R runSyncInGoogleAdIdSchedulerWithTimeout(Context context, Callable<R> callable, long j6) {
        if (googleAdIdScheduler == null) {
            synchronized (Util.class) {
                try {
                    if (googleAdIdScheduler == null) {
                        googleAdIdScheduler = new SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            return (R) googleAdIdScheduler.scheduleFutureWithReturn(callable, 0L).get(j6, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    public static <T> void writeObject(T t, Context context, String str, String str2) {
        ?? OpenFileOutput;
        ?? bufferedOutputStream;
        try {
            OpenFileOutput = context.openFileOutput(str, 0);
            try {
                bufferedOutputStream = new BufferedOutputStream(OpenFileOutput);
                try {
                    OpenFileOutput = new ObjectOutputStream(bufferedOutputStream);
                    try {
                        OpenFileOutput.writeObject(t);
                        getLogger().debug("Wrote %s: %s", str2, t);
                    } catch (NotSerializableException unused) {
                        getLogger().error("Failed to serialize %s", str2);
                    }
                } catch (Exception e10) {
                    e = e10;
                    getLogger().error("Failed to open %s for writing (%s)", str2, e);
                    OpenFileOutput = bufferedOutputStream;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = OpenFileOutput;
                getLogger().error("Failed to open %s for writing (%s)", str2, e);
                OpenFileOutput = bufferedOutputStream;
                if (OpenFileOutput != 0) {
                    try {
                        OpenFileOutput.close();
                    } catch (Exception e12) {
                        getLogger().error("Failed to close %s file for writing (%s)", str2, e12);
                        return;
                    }
                }
            }
        } catch (Exception e13) {
            e = e13;
            OpenFileOutput = 0;
        }
        if (OpenFileOutput != 0) {
            OpenFileOutput.close();
        }
    }

    public static void getGoogleAdId(Context context, OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
        new F(onGoogleAdIdReadListener, 2).execute(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getGoogleAdId(Context context) {
        String gpsAdid;
        Object advertisingInfoObject;
        try {
            GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, 11000L);
            gpsAdid = googlePlayServicesInfo != null ? googlePlayServicesInfo.getGpsAdid() : null;
        } catch (Exception unused) {
        }
        return (gpsAdid != null || (advertisingInfoObject = getAdvertisingInfoObject(context, 11000L)) == null) ? gpsAdid : getGoogleAdId(context, advertisingInfoObject, 1000L);
    }
}
