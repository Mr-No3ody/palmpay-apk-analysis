package com.microsoft.codepush.react;

import C0.G;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.camera.camera2.internal.F;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CodePush implements ReactPackage {
    private static final Object LOCK = new Object();
    private static volatile CodePush mCurrentInstance = null;
    private static String mPublicKey = null;
    private static ReactHostHolder mReactHostHolder = null;
    private static String mServerUrl = "https://codepush.appcenter.ms/";
    private static String sAppVersion = null;
    private static boolean sIsRunningBinaryVersion = false;
    private static boolean sNeedToReportRollback = false;
    private static boolean sTestConfigurationFlag = false;
    private String mAssetsBundleFileName;
    private Context mContext;
    private String mDeploymentKey;
    private boolean mDidUpdate;
    private final boolean mIsDebugMode;
    private SettingsManager mSettingsManager;
    private CodePushTelemetryManager mTelemetryManager;
    private CodePushUpdateManager mUpdateManager;

    public CodePush(String str, Context context) {
        this(str, context, false);
    }

    @Deprecated
    public static String getBundleUrl() {
        return getJSBundleFile();
    }

    private String getCustomPropertyFromStringsIfExist(String str) {
        String packageName = this.mContext.getPackageName();
        int identifier = this.mContext.getResources().getIdentifier("CodePush" + str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        String string = this.mContext.getString(identifier);
        if (!string.isEmpty()) {
            return string;
        }
        CodePushUtils.log("Specified " + str + " is empty");
        return null;
    }

    public static CodePush getInstance(String str, Context context, boolean z3) {
        if (mCurrentInstance == null) {
            synchronized (LOCK) {
                try {
                    if (mCurrentInstance == null) {
                        mCurrentInstance = new CodePush(str, context, z3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mCurrentInstance;
    }

    public static String getJSBundleFile() {
        return getJSBundleFile(CodePushConstants.DEFAULT_JS_BUNDLE_NAME);
    }

    private String getPublicKeyByResourceDescriptor(int i7) {
        try {
            String string = this.mContext.getString(i7);
            if (string.isEmpty()) {
                throw new CodePushInvalidPublicKeyException("Specified public key is empty");
            }
            return string;
        } catch (Resources.NotFoundException e10) {
            throw new CodePushInvalidPublicKeyException(F.c(i7, "Unable to get public key, related resource descriptor ", " can not be found"), e10);
        }
    }

    public static ReactHost getReactHost() {
        ReactHostHolder reactHostHolder = mReactHostHolder;
        if (reactHostHolder == null) {
            return null;
        }
        return reactHostHolder.getReactHost();
    }

    public static String getServiceUrl() {
        return mServerUrl;
    }

    private boolean hasBinaryVersionChanged(JSONObject jSONObject) {
        return !sAppVersion.equals(jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, null));
    }

    private boolean isPackageBundleLatest(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString(CodePushConstants.BINARY_MODIFIED_TIME_KEY, null);
            Long lValueOf = strOptString != null ? Long.valueOf(Long.parseLong(strOptString)) : null;
            String strOptString2 = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, null);
            long binaryResourcesModifiedTime = getBinaryResourcesModifiedTime();
            if (lValueOf == null || lValueOf.longValue() != binaryResourcesModifiedTime) {
                return false;
            }
            return isUsingTestConfiguration() || sAppVersion.equals(strOptString2);
        } catch (NumberFormatException e10) {
            throw new CodePushUnknownException("Error in reading binary modified date from package metadata", e10);
        }
    }

    public static boolean isUsingTestConfiguration() {
        return sTestConfigurationFlag;
    }

    public static void overrideAppVersion(String str) {
        sAppVersion = str;
    }

    private void rollbackPackage() throws Throwable {
        this.mSettingsManager.saveFailedUpdate(this.mUpdateManager.getCurrentPackage());
        this.mUpdateManager.rollbackPackage();
        this.mSettingsManager.removePendingUpdate();
    }

    public static void setReactHost(ReactHostHolder reactHostHolder) {
        mReactHostHolder = reactHostHolder;
    }

    public static void setUsingTestConfiguration(boolean z3) {
        sTestConfigurationFlag = z3;
    }

    public void clearDebugCacheIfNeeded(boolean z3) {
        if (this.mIsDebugMode && this.mSettingsManager.isPendingUpdate(null) && !z3) {
            File file = new File(this.mContext.getFilesDir(), "ReactNativeDevBundle.js");
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public void clearUpdates() {
        this.mUpdateManager.clearUpdates();
        this.mSettingsManager.removePendingUpdate();
        this.mSettingsManager.removeFailedUpdates();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        CodePushNativeModule codePushNativeModule = new CodePushNativeModule(reactApplicationContext, this, this.mUpdateManager, this.mTelemetryManager, this.mSettingsManager);
        CodePushDialog codePushDialog = new CodePushDialog(reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        arrayList.add(codePushNativeModule);
        arrayList.add(codePushDialog);
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    public boolean didUpdate() {
        return this.mDidUpdate;
    }

    public String getAppVersion() {
        return sAppVersion;
    }

    public String getAssetsBundleFileName() {
        return this.mAssetsBundleFileName;
    }

    public long getBinaryResourcesModifiedTime() {
        try {
            return Long.parseLong(this.mContext.getResources().getString(this.mContext.getResources().getIdentifier(CodePushConstants.CODE_PUSH_APK_BUILD_TIME_KEY, "string", this.mContext.getPackageName())).replaceAll("\"", ""));
        } catch (Exception e10) {
            throw new CodePushUnknownException("Error in getting binary resources modified time", e10);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeploymentKey() {
        return this.mDeploymentKey;
    }

    public String getJSBundleFileInternal(String str) {
        String currentPackageBundlePath;
        this.mAssetsBundleFileName = str;
        String strO = G.o(CodePushConstants.ASSETS_BUNDLE_PREFIX, str);
        try {
            currentPackageBundlePath = this.mUpdateManager.getCurrentPackageBundlePath(this.mAssetsBundleFileName);
        } catch (CodePushMalformedDataException e10) {
            CodePushUtils.log(e10.getMessage());
            clearUpdates();
            currentPackageBundlePath = null;
        }
        if (currentPackageBundlePath == null) {
            CodePushUtils.logBundleUrl(strO);
            sIsRunningBinaryVersion = true;
            return strO;
        }
        JSONObject currentPackage = this.mUpdateManager.getCurrentPackage();
        if (isPackageBundleLatest(currentPackage)) {
            CodePushUtils.logBundleUrl(currentPackageBundlePath);
            sIsRunningBinaryVersion = false;
            return currentPackageBundlePath;
        }
        this.mDidUpdate = false;
        if (!this.mIsDebugMode || hasBinaryVersionChanged(currentPackage)) {
            clearUpdates();
        }
        CodePushUtils.logBundleUrl(strO);
        sIsRunningBinaryVersion = true;
        return strO;
    }

    public String getPackageFolder() {
        JSONObject currentPackage = this.mUpdateManager.getCurrentPackage();
        if (currentPackage == null) {
            return null;
        }
        return this.mUpdateManager.getPackageFolderPath(currentPackage.optString("packageHash"));
    }

    public String getPublicKey() {
        return mPublicKey;
    }

    public String getServerUrl() {
        return mServerUrl;
    }

    public void initializeUpdateAfterRestart() {
        this.mDidUpdate = false;
        JSONObject pendingUpdate = this.mSettingsManager.getPendingUpdate();
        if (pendingUpdate != null) {
            try {
                JSONObject currentPackage = this.mUpdateManager.getCurrentPackage();
                if (currentPackage == null || (!isPackageBundleLatest(currentPackage) && hasBinaryVersionChanged(currentPackage))) {
                    CodePushUtils.log("Skipping initializeUpdateAfterRestart(), binary version is newer");
                    return;
                }
                try {
                    if (!pendingUpdate.getBoolean(CodePushConstants.PENDING_UPDATE_IS_LOADING_KEY)) {
                        this.mDidUpdate = true;
                        this.mSettingsManager.savePendingUpdate(pendingUpdate.getString(CodePushConstants.PENDING_UPDATE_HASH_KEY), true);
                    } else {
                        CodePushUtils.log("Update did not finish loading the last time, rolling back to a previous version.");
                        sNeedToReportRollback = true;
                        rollbackPackage();
                    }
                } catch (JSONException e10) {
                    throw new CodePushUnknownException("Unable to read pending update metadata stored in SharedPreferences", e10);
                }
            } catch (CodePushMalformedDataException e11) {
                CodePushUtils.log(e11);
                clearUpdates();
            }
        }
    }

    public void invalidateCurrentInstance() {
        mCurrentInstance = null;
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    public boolean isRunningBinaryVersion() {
        return sIsRunningBinaryVersion;
    }

    public boolean needToReportRollback() {
        return sNeedToReportRollback;
    }

    public void setDeploymentKey(String str) {
        this.mDeploymentKey = str;
    }

    public void setNeedToReportRollback(boolean z3) {
        sNeedToReportRollback = z3;
    }

    private CodePush(String str, Context context, boolean z3) {
        this.mDidUpdate = false;
        this.mContext = context.getApplicationContext();
        this.mUpdateManager = new CodePushUpdateManager(context.getFilesDir().getAbsolutePath());
        this.mTelemetryManager = new CodePushTelemetryManager(this.mContext);
        this.mDeploymentKey = str;
        this.mIsDebugMode = z3;
        this.mSettingsManager = new SettingsManager(this.mContext);
        if (sAppVersion == null) {
            try {
                sAppVersion = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new CodePushUnknownException("Unable to get package info for " + this.mContext.getPackageName(), e10);
            }
        }
        mCurrentInstance = this;
        String customPropertyFromStringsIfExist = getCustomPropertyFromStringsIfExist("PublicKey");
        if (customPropertyFromStringsIfExist != null) {
            mPublicKey = customPropertyFromStringsIfExist;
        }
        String customPropertyFromStringsIfExist2 = getCustomPropertyFromStringsIfExist("ServerUrl");
        if (customPropertyFromStringsIfExist2 != null) {
            mServerUrl = customPropertyFromStringsIfExist2;
        }
        clearDebugCacheIfNeeded(false);
        initializeUpdateAfterRestart();
    }

    @Deprecated
    public static String getBundleUrl(String str) {
        return getJSBundleFile(str);
    }

    public static String getJSBundleFile(String str) {
        if (mCurrentInstance != null) {
            return mCurrentInstance.getJSBundleFileInternal(str);
        }
        throw new CodePushNotInitializedException("A CodePush instance has not been created yet. Have you added it to your app's list of ReactPackages?");
    }

    private CodePush(String str, Context context, boolean z3, String str2) {
        this(str, context, z3);
        mServerUrl = str2;
    }

    private CodePush(String str, Context context, boolean z3, int i7) {
        this(str, context, z3);
        mPublicKey = getPublicKeyByResourceDescriptor(i7);
    }

    private CodePush(String str, Context context, boolean z3, String str2, Integer num) {
        this(str, context, z3);
        if (num != null) {
            mPublicKey = getPublicKeyByResourceDescriptor(num.intValue());
        }
        mServerUrl = str2;
    }
}
