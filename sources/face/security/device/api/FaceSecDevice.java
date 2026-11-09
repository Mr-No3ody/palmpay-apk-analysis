package face.security.device.api;

import android.app.Activity;
import android.content.Context;
import com.didiglobal.booster.instrument.ShadowThread;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FaceSecDevice {
    public static int NO_BASIC_DEVICE_DATA = 4;
    public static int NO_EXTRA_DEVICE_DATA = 8;
    public static int NO_IDENTIFY_DEVICE_DATA = 2;
    public static int NO_PRIVACY_DATA = 16;
    public static int NO_UNIQUE_DEVICE_DATA = 1;
    private static FaceSecDevice s_instance;
    private String userProductKey;
    private Context ctx = null;
    private FaceSecInitListener securityInitListener = null;
    private boolean isInited = false;
    private Thread initThread = null;
    private Thread otherThread = null;
    private Thread mpThread = null;

    public enum DataSwitch {
        INIT_COLLECT_DATA,
        TOKEN_COLLECT_DATA
    }

    static {
        System.loadLibrary("facedevice");
        s_instance = new FaceSecDevice();
    }

    public static native void ascRaw(Activity activity);

    private FaceSecSessionId createSessionIdWithCode(int i7, String str) {
        FaceSecSessionId faceSecSessionId = new FaceSecSessionId();
        faceSecSessionId.code = i7;
        faceSecSessionId.sessionId = str;
        return faceSecSessionId;
    }

    private native FaceSecSession getBizSessionRaw(String str);

    private Context getCtx() {
        return this.ctx;
    }

    public static FaceSecDevice getInstance() {
        return s_instance;
    }

    public static Map<String, String> getRegIdByAppKey(String str, Map<String, String> map) {
        if (!map.isEmpty() && map.containsKey("Intl")) {
            return map;
        }
        String strSubstring = str.substring(0, 2);
        String strSubstring2 = str.substring(10, 12);
        if ("sh".equals(strSubstring) && "hs".equals(strSubstring2)) {
            map.put("Intl", "0");
            return map;
        }
        if ("sg".equals(strSubstring) && "gs".equals(strSubstring2)) {
            map.put("Intl", "1");
            return map;
        }
        map.put("Intl", "0");
        return map;
    }

    private native FaceSecSessionId getSessionIdRaw();

    private native FaceSecSession getSessionRaw();

    private static native String getVersionRaw();

    public static native String gsRaw(String str);

    private static long gtam() {
        try {
            return SecurityUtil.getArtMethod(FaceSecDevice.class.getDeclaredMethod("reserved0", new Class[0]));
        } catch (Exception unused) {
            return 0L;
        }
    }

    private void initCommonEx(Context context, String str, Map<String, String> map, FaceSecInitListener faceSecInitListener) {
        if (context == null || str == null || str.length() != 32) {
            if (faceSecInitListener != null) {
                faceSecInitListener.onInitFinish(FaceSecCode.SC_PARAMS_ERROR);
                return;
            }
            return;
        }
        if (this.isInited) {
            if (faceSecInitListener != null) {
                faceSecInitListener.onInitFinish(FaceSecCode.SC_SUCCESS);
                return;
            }
            return;
        }
        this.isInited = true;
        this.userProductKey = str;
        this.ctx = context.getApplicationContext();
        this.securityInitListener = faceSecInitListener;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> regIdByAppKey = getRegIdByAppKey(str, map);
        regIdByAppKey.put("AppKey", str);
        try {
            setOptionsRaw(this.ctx, regIdByAppKey);
            SecurityUtil.utilInit();
            ShadowThread shadowThread = new ShadowThread(new Runnable() { // from class: face.security.device.api.FaceSecDevice.1
                @Override // java.lang.Runnable
                public void run() {
                    FaceSecDevice.getInstance().runInitEx();
                }
            }, "\u200bface.security.device.api.FaceSecDevice");
            this.initThread = shadowThread;
            ShadowThread.setThreadName(shadowThread, "\u200bface.security.device.api.FaceSecDevice").start();
            if (this.otherThread == null) {
                ShadowThread shadowThread2 = new ShadowThread(new Runnable() { // from class: face.security.device.api.FaceSecDevice.2
                    @Override // java.lang.Runnable
                    public void run() {
                        FaceSecDevice.getInstance().otherThreadRun();
                    }
                }, "\u200bface.security.device.api.FaceSecDevice");
                this.otherThread = shadowThread2;
                ShadowThread.setThreadName(shadowThread2, "\u200bface.security.device.api.FaceSecDevice").start();
            }
            isActiveMpThread(regIdByAppKey);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private native int initExFirstRaw(Context context);

    private native int initExSecondRaw(Context context);

    private void initIDs() {
        try {
            Class<?> cls = Class.forName("face.security.device.api.SecurityID");
            cls.getMethod("init", Context.class).invoke(cls, this.ctx);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    private void isActiveMpThread(Map<String, String> map) {
        if (String.valueOf(DataSwitch.TOKEN_COLLECT_DATA.ordinal()).equals(map.get("DataSwitch"))) {
            return;
        }
        mp();
    }

    private native void lpRaw(int i7, String str);

    private native void lxRaw();

    private native void mpRaw(Context context);

    /* JADX INFO: Access modifiers changed from: private */
    public void mpThreadRun() {
        try {
            mpRaw(getCtx());
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void otherThreadRun() {
        try {
            otiRaw(getCtx());
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private native void otiRaw(Context context);

    private native void reportUserDataRaw(String str, String str2);

    public static native void reserved0();

    public static native void reserved1();

    /* JADX INFO: Access modifiers changed from: private */
    public void runInitEx() {
        try {
            int iInitExFirstRaw = initExFirstRaw(this.ctx);
            FaceSecInitListener faceSecInitListener = this.securityInitListener;
            if (faceSecInitListener != null) {
                faceSecInitListener.onInitFinish(iInitExFirstRaw);
            }
            switch (iInitExFirstRaw) {
                case FaceSecCode.SC_APPKEY_EMPTY /* 10009 */:
                case FaceSecCode.SC_PARAMS_ERROR /* 10010 */:
                case FaceSecCode.SC_FGKEY_ERROR /* 10011 */:
                case FaceSecCode.SC_APPKEY_ERROR /* 10012 */:
                    this.isInited = false;
                    break;
                default:
                    initExSecondRaw(this.ctx);
                    this.isInited = false;
                    break;
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private native void setOptionsRaw(Context context, Map<String, String> map);

    public void asc(Activity activity) {
        try {
            if (this.ctx == null && activity != null) {
                this.ctx = activity.getApplicationContext();
            }
            ascRaw(activity);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public FaceSecToken getDeviceToken() {
        try {
            FaceSecSession sessionRaw = getSessionRaw();
            FaceSecToken faceSecToken = new FaceSecToken();
            faceSecToken.code = sessionRaw.code;
            faceSecToken.token = sessionRaw.session;
            return faceSecToken;
        } catch (UnsatisfiedLinkError unused) {
            FaceSecToken faceSecToken2 = new FaceSecToken();
            faceSecToken2.code = FaceSecCode.SC_LIBRARY_ERROR;
            faceSecToken2.token = "";
            return faceSecToken2;
        }
    }

    public FaceSecSession getSession() {
        try {
            return getSessionRaw();
        } catch (UnsatisfiedLinkError unused) {
            FaceSecSession faceSecSession = new FaceSecSession();
            faceSecSession.code = FaceSecCode.SC_LIBRARY_ERROR;
            faceSecSession.session = "";
            return faceSecSession;
        }
    }

    public FaceSecSessionId getSessionId() {
        try {
            return !this.isInited ? createSessionIdWithCode(FaceSecCode.SC_NOT_INIT, "") : getSessionIdRaw();
        } catch (UnsatisfiedLinkError unused) {
            return createSessionIdWithCode(FaceSecCode.SC_LIBRARY_ERROR, "");
        }
    }

    public String getVersion() {
        try {
            return getVersionRaw();
        } catch (UnsatisfiedLinkError unused) {
            return String.valueOf(FaceSecCode.SC_LIBRARY_ERROR);
        }
    }

    public void init(Context context, String str, FaceSecInitListener faceSecInitListener) {
        initCommonEx(context, str, null, faceSecInitListener);
    }

    public void initWithOptions(Context context, String str, Map<String, String> map, FaceSecInitListener faceSecInitListener) {
        initCommonEx(context, str, map, faceSecInitListener);
    }

    public void lp(int i7, String str) {
        try {
            lpRaw(i7, str);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public void lx() {
        lxRaw();
    }

    public void mp() {
        Thread thread = this.mpThread;
        if (thread == null || !thread.isAlive()) {
            ShadowThread shadowThread = new ShadowThread(new Runnable() { // from class: face.security.device.api.FaceSecDevice.3
                @Override // java.lang.Runnable
                public void run() {
                    FaceSecDevice.getInstance().mpThreadRun();
                }
            }, "\u200bface.security.device.api.FaceSecDevice");
            this.mpThread = shadowThread;
            ShadowThread.setThreadName(shadowThread, "\u200bface.security.device.api.FaceSecDevice").start();
        }
    }

    public void reportUserData(int i7, String str) {
        reportUserDataRaw(String.valueOf(i7 + FaceSecCode.SC_SUCCESS), str);
    }

    public FaceSecToken getDeviceToken(String str) {
        try {
            FaceSecSession bizSessionRaw = getBizSessionRaw(str);
            FaceSecToken faceSecToken = new FaceSecToken();
            faceSecToken.code = bizSessionRaw.code;
            faceSecToken.token = bizSessionRaw.session;
            return faceSecToken;
        } catch (UnsatisfiedLinkError unused) {
            FaceSecToken faceSecToken2 = new FaceSecToken();
            faceSecToken2.code = FaceSecCode.SC_LIBRARY_ERROR;
            faceSecToken2.token = "";
            return faceSecToken2;
        }
    }
}
