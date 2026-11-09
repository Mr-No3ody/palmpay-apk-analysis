package com.microsoft.codepush.react;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.OptIn;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@OptIn(markerClass = {UnstableReactNativeAPI.class})
public class CodePushNativeModule extends BaseJavaModule {
    private boolean _allowed;
    private boolean _restartInProgress;
    private ArrayList<Boolean> _restartQueue;
    private String mBinaryContentsHash;
    private String mClientUniqueId;
    private CodePush mCodePush;
    private LifecycleEventListener mLifecycleEventListener;
    private int mMinimumBackgroundDuration;
    private SettingsManager mSettingsManager;
    private CodePushTelemetryManager mTelemetryManager;
    private CodePushUpdateManager mUpdateManager;

    /* JADX INFO: renamed from: com.microsoft.codepush.react.CodePushNativeModule$5, reason: invalid class name */
    public class AnonymousClass5 extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ int val$installMode;
        final /* synthetic */ int val$minimumBackgroundDuration;
        final /* synthetic */ Promise val$promise;
        final /* synthetic */ ReadableMap val$updatePackage;

        public AnonymousClass5(ReadableMap readableMap, int i7, int i10, Promise promise) {
            this.val$updatePackage = readableMap;
            this.val$installMode = i7;
            this.val$minimumBackgroundDuration = i10;
            this.val$promise = promise;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            try {
                CodePushNativeModule.this.mUpdateManager.installPackage(CodePushUtils.convertReadableToJsonObject(this.val$updatePackage), CodePushNativeModule.this.mSettingsManager.isPendingUpdate(null));
                String strTryGetString = CodePushUtils.tryGetString(this.val$updatePackage, "packageHash");
                if (strTryGetString == null) {
                    throw new CodePushUnknownException("Update package to be installed has no hash.");
                }
                CodePushNativeModule.this.mSettingsManager.savePendingUpdate(strTryGetString, false);
                if (this.val$installMode == CodePushInstallMode.ON_NEXT_RESUME.getValue() || this.val$installMode == CodePushInstallMode.IMMEDIATE.getValue() || this.val$installMode == CodePushInstallMode.ON_NEXT_SUSPEND.getValue()) {
                    CodePushNativeModule.this.mMinimumBackgroundDuration = this.val$minimumBackgroundDuration;
                    if (CodePushNativeModule.this.mLifecycleEventListener == null) {
                        CodePushNativeModule.this.mLifecycleEventListener = new LifecycleEventListener() { // from class: com.microsoft.codepush.react.CodePushNativeModule.5.1
                            private Date lastPausedDate = null;
                            private Handler appSuspendHandler = new Handler(Looper.getMainLooper());
                            private Runnable loadBundleRunnable = new Runnable() { // from class: com.microsoft.codepush.react.CodePushNativeModule.5.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    CodePushUtils.log("Loading bundle on suspend");
                                    CodePushNativeModule.this.restartAppInternal(false);
                                }
                            };

                            @Override // com.facebook.react.bridge.LifecycleEventListener
                            public void onHostDestroy() {
                            }

                            @Override // com.facebook.react.bridge.LifecycleEventListener
                            public void onHostPause() {
                                this.lastPausedDate = new Date();
                                if (AnonymousClass5.this.val$installMode == CodePushInstallMode.ON_NEXT_SUSPEND.getValue() && CodePushNativeModule.this.mSettingsManager.isPendingUpdate(null)) {
                                    this.appSuspendHandler.postDelayed(this.loadBundleRunnable, AnonymousClass5.this.val$minimumBackgroundDuration * 1000);
                                }
                            }

                            @Override // com.facebook.react.bridge.LifecycleEventListener
                            public void onHostResume() {
                                this.appSuspendHandler.removeCallbacks(this.loadBundleRunnable);
                                if (this.lastPausedDate != null) {
                                    long time = (new Date().getTime() - this.lastPausedDate.getTime()) / 1000;
                                    if (AnonymousClass5.this.val$installMode == CodePushInstallMode.IMMEDIATE.getValue() || time >= CodePushNativeModule.this.mMinimumBackgroundDuration) {
                                        CodePushUtils.log("Loading bundle on resume");
                                        CodePushNativeModule.this.restartAppInternal(false);
                                    }
                                }
                            }
                        };
                        CodePushNativeModule.this.getReactApplicationContext().addLifecycleEventListener(CodePushNativeModule.this.mLifecycleEventListener);
                    }
                }
                this.val$promise.resolve("");
                return null;
            } catch (CodePushUnknownException e10) {
                CodePushUtils.log(e10);
                this.val$promise.reject(e10);
                return null;
            }
        }
    }

    public CodePushNativeModule(ReactApplicationContext reactApplicationContext, CodePush codePush, CodePushUpdateManager codePushUpdateManager, CodePushTelemetryManager codePushTelemetryManager, SettingsManager settingsManager) {
        super(reactApplicationContext);
        this.mBinaryContentsHash = null;
        this.mClientUniqueId = null;
        this.mLifecycleEventListener = null;
        this.mMinimumBackgroundDuration = 0;
        this._allowed = true;
        this._restartInProgress = false;
        this._restartQueue = new ArrayList<>();
        this.mCodePush = codePush;
        this.mSettingsManager = settingsManager;
        this.mTelemetryManager = codePushTelemetryManager;
        this.mUpdateManager = codePushUpdateManager;
        this.mBinaryContentsHash = CodePushUpdateUtils.getHashForBinaryContents(reactApplicationContext, codePush.isDebugMode());
        SharedPreferences sharedPreferences = codePush.getContext().getSharedPreferences("CodePush", 0);
        String string = sharedPreferences.getString(CodePushConstants.CLIENT_UNIQUE_ID_KEY, null);
        this.mClientUniqueId = string;
        if (string == null) {
            this.mClientUniqueId = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(CodePushConstants.CLIENT_UNIQUE_ID_KEY, this.mClientUniqueId).apply();
        }
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    private Field findBundleLoaderField(Class<?> cls) {
        while (cls != null) {
            try {
                try {
                    return cls.getDeclaredField("jsBundleLoader");
                } catch (NoSuchFieldException unused) {
                    return cls.getDeclaredField("_jsBundleLoader");
                }
            } catch (NoSuchFieldException unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    private boolean isLiveReloadEnabled(DevSupportManager devSupportManager) {
        if (devSupportManager != null) {
            DeveloperSettings devSettings = devSupportManager.getDevSettings();
            for (Method method : devSettings.getClass().getMethods()) {
                if (method.getName().equals("isReloadOnJSChangeEnabled")) {
                    try {
                        return ((Boolean) method.invoke(devSettings, new Object[0])).booleanValue();
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.microsoft.codepush.react.CodePush] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:39:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0098 -> B:39:0x00a2). Please report as a decompilation issue!!! */
    private void loadBundle() {
        String str = "Exception during the reflective setJSBundle block: ";
        clearLifecycleEventListener();
        try {
            ReactHost reactHostResolveReactHost = resolveReactHost();
            this.mCodePush.clearDebugCacheIfNeeded(isLiveReloadEnabled(reactHostResolveReactHost != null ? reactHostResolveReactHost.getDevSupportManager() : null));
        } catch (Exception unused) {
            this.mCodePush.clearDebugCacheIfNeeded(false);
        }
        try {
            ReactHost reactHostResolveReactHost2 = resolveReactHost();
            if (reactHostResolveReactHost2 == null) {
                loadBundleLegacy();
                return;
            }
            CodePush codePush = this.mCodePush;
            String jSBundleFileInternal = codePush.getJSBundleFileInternal(codePush.getAssetsBundleFileName());
            CodePushUtils.log("[MyDebug] Latest JS bundle for New Arch: " + jSBundleFileInternal);
            try {
                try {
                    if (reactHostResolveReactHost2 instanceof ReactHostImpl) {
                        ReactHostDelegate reactHostDelegate = getReactHostDelegate((ReactHostImpl) reactHostResolveReactHost2);
                        if (reactHostDelegate != null) {
                            setJSBundle(reactHostDelegate, jSBundleFileInternal);
                        } else {
                            CodePushUtils.log("Could not get ReactHostDelegate from ReactHostImpl.");
                        }
                    } else {
                        CodePushUtils.log("ReactHost is not a direct ReactHostImpl instance (" + reactHostResolveReactHost2.getClass().getName() + "), skipping direct setJSBundle reflection attempt. This is expected with Expo.");
                    }
                } catch (Exception e10) {
                    CodePushUtils.log(str + e10.getMessage());
                }
            } catch (ClassCastException e11) {
                CodePushUtils.log(new Exception("ClassCastException trying to get/use ReactHostDelegate. Skipping reflection call to setJSBundle. This is expected for Expo.", e11));
            }
            try {
                reactHostResolveReactHost2.reload("CodePush triggers reload");
                str = this.mCodePush;
                str.initializeUpdateAfterRestart();
            } catch (Exception unused2) {
                loadBundleLegacy();
            }
        } catch (Exception e12) {
            CodePushUtils.log("Failed to load the bundle, falling back to restarting the Activity (if it exists). " + e12.getMessage());
            loadBundleLegacy();
        }
    }

    private void loadBundleLegacy() {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mCodePush.invalidateCurrentInstance();
        currentActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.codepush.react.CodePushNativeModule.1
            @Override // java.lang.Runnable
            public void run() {
                currentActivity.recreate();
            }
        });
    }

    private ReactHost resolveReactHost() throws IllegalAccessException, NoSuchFieldException {
        ReactHost reactHost = CodePush.getReactHost();
        if (reactHost != null) {
            return reactHost;
        }
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((ReactApplication) currentActivity.getApplication()).getReactHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartAppInternal(boolean z3) {
        if (this._restartInProgress) {
            CodePushUtils.log("Restart request queued until the current restart is completed");
            this._restartQueue.add(Boolean.valueOf(z3));
            return;
        }
        if (!this._allowed) {
            CodePushUtils.log("Restart request queued until restarts are re-allowed");
            this._restartQueue.add(Boolean.valueOf(z3));
            return;
        }
        this._restartInProgress = true;
        if (!z3 || this.mSettingsManager.isPendingUpdate(null)) {
            loadBundle();
            CodePushUtils.log("Restarting app");
            return;
        }
        this._restartInProgress = false;
        if (this._restartQueue.size() > 0) {
            boolean zBooleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(zBooleanValue);
        }
    }

    private void setJSBundle(ReactHostDelegate reactHostDelegate, String str) throws IllegalAccessException {
        try {
            JSBundleLoader jSBundleLoaderCreateAssetLoader = str.toLowerCase().startsWith(CodePushConstants.ASSETS_BUNDLE_PREFIX) ? JSBundleLoader.createAssetLoader(getReactApplicationContext(), str, false) : JSBundleLoader.createFileLoader(str);
            Field fieldFindBundleLoaderField = findBundleLoaderField(reactHostDelegate.getClass());
            if (fieldFindBundleLoaderField == null) {
                throw new NoSuchFieldException("jsBundleLoader");
            }
            fieldFindBundleLoaderField.setAccessible(true);
            fieldFindBundleLoaderField.set(reactHostDelegate, jSBundleLoaderCreateAssetLoader);
        } catch (NoSuchFieldException unused) {
            StringBuilder sb2 = new StringBuilder("Field 'jsBundleLoader' NOT FOUND on ");
            sb2.append(reactHostDelegate != null ? reactHostDelegate.getClass().getName() : com.google.maps.android.BuildConfig.TRAVIS);
            sb2.append(". This is an EXPECTED and IGNORED failure with ExpoReactHostDelegate. Will rely on reactHost.reload(). Original log: Unable to set JSBundle of ReactHostDelegate - CodePush may not support this version of React Native");
            CodePushUtils.log(sb2.toString());
        } catch (Exception unused2) {
            CodePushUtils.log("Unable to set JSBundle of ReactHostDelegate - CodePush may not support this version of React Native");
            throw new IllegalAccessException("Could not setJSBundle");
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void allow(Promise promise) {
        CodePushUtils.log("Re-allowing restarts");
        this._allowed = true;
        if (this._restartQueue.size() > 0) {
            CodePushUtils.log("Executing pending restart");
            boolean zBooleanValue = this._restartQueue.get(0).booleanValue();
            this._restartQueue.remove(0);
            restartAppInternal(zBooleanValue);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void clearPendingRestart(Promise promise) {
        this._restartQueue.clear();
        promise.resolve(null);
    }

    @ReactMethod
    public void clearUpdates() {
        CodePushUtils.log("Clearing updates.");
        this.mCodePush.clearUpdates();
    }

    @ReactMethod
    public void disallow(Promise promise) {
        CodePushUtils.log("Disallowing restarts");
        this._allowed = false;
        promise.resolve(null);
    }

    @ReactMethod
    public void downloadAndReplaceCurrentBundle(String str) {
        try {
            if (CodePush.isUsingTestConfiguration()) {
                try {
                    this.mUpdateManager.downloadAndReplaceCurrentBundle(str, this.mCodePush.getAssetsBundleFileName());
                } catch (IOException e10) {
                    throw new CodePushUnknownException("Unable to replace current bundle", e10);
                }
            }
        } catch (CodePushMalformedDataException | CodePushUnknownException e11) {
            CodePushUtils.log(e11);
        }
    }

    @ReactMethod
    public void downloadUpdate(final ReadableMap readableMap, final boolean z3, final Promise promise) {
        new AsyncTask<Void, Void, Void>() { // from class: com.microsoft.codepush.react.CodePushNativeModule.2

            /* JADX INFO: renamed from: com.microsoft.codepush.react.CodePushNativeModule$2$1, reason: invalid class name */
            public class AnonymousClass1 implements DownloadProgressCallback {
                private boolean hasScheduledNextFrame = false;
                private DownloadProgress latestDownloadProgress = null;

                public AnonymousClass1() {
                }

                @Override // com.microsoft.codepush.react.DownloadProgressCallback
                public void call(DownloadProgress downloadProgress) {
                    if (z3) {
                        this.latestDownloadProgress = downloadProgress;
                        if (downloadProgress.isCompleted()) {
                            dispatchDownloadProgressEvent();
                        } else {
                            if (this.hasScheduledNextFrame) {
                                return;
                            }
                            this.hasScheduledNextFrame = true;
                            CodePushNativeModule.this.getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.microsoft.codepush.react.CodePushNativeModule.2.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, new Choreographer.FrameCallback() { // from class: com.microsoft.codepush.react.CodePushNativeModule.2.1.1.1
                                        @Override // android.view.Choreographer.FrameCallback
                                        public void doFrame(long j6) {
                                            if (!AnonymousClass1.this.latestDownloadProgress.isCompleted()) {
                                                AnonymousClass1.this.dispatchDownloadProgressEvent();
                                            }
                                            AnonymousClass1.this.hasScheduledNextFrame = false;
                                        }
                                    });
                                }
                            });
                        }
                    }
                }

                public void dispatchDownloadProgressEvent() {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) CodePushNativeModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(CodePushConstants.DOWNLOAD_PROGRESS_EVENT_NAME, this.latestDownloadProgress.createWritableMap());
                }
            }

            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                try {
                    JSONObject jSONObjectConvertReadableToJsonObject = CodePushUtils.convertReadableToJsonObject(readableMap);
                    CodePushUtils.setJSONValueForKey(jSONObjectConvertReadableToJsonObject, CodePushConstants.BINARY_MODIFIED_TIME_KEY, "" + CodePushNativeModule.this.mCodePush.getBinaryResourcesModifiedTime());
                    CodePushNativeModule.this.mUpdateManager.downloadPackage(jSONObjectConvertReadableToJsonObject, CodePushNativeModule.this.mCodePush.getAssetsBundleFileName(), new AnonymousClass1(), CodePushNativeModule.this.mCodePush.getPublicKey());
                    promise.resolve(CodePushUtils.convertJsonObjectToWritable(CodePushNativeModule.this.mUpdateManager.getPackage(CodePushUtils.tryGetString(readableMap, "packageHash"))));
                    return null;
                } catch (CodePushInvalidUpdateException e10) {
                    CodePushUtils.log(e10);
                    CodePushNativeModule.this.mSettingsManager.saveFailedUpdate(CodePushUtils.convertReadableToJsonObject(readableMap));
                    promise.reject(e10);
                    return null;
                } catch (CodePushUnknownException e11) {
                    e = e11;
                    CodePushUtils.log(e);
                    promise.reject(e);
                    return null;
                } catch (IOException e12) {
                    e = e12;
                    CodePushUtils.log(e);
                    promise.reject(e);
                    return null;
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getConfiguration(Promise promise) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, this.mCodePush.getAppVersion());
            writableMapCreateMap.putString(CodePushConstants.CLIENT_UNIQUE_ID_KEY, this.mClientUniqueId);
            writableMapCreateMap.putString("deploymentKey", this.mCodePush.getDeploymentKey());
            writableMapCreateMap.putString("serverUrl", this.mCodePush.getServerUrl());
            String str = this.mBinaryContentsHash;
            if (str != null) {
                writableMapCreateMap.putString("packageHash", str);
            }
            promise.resolve(writableMapCreateMap);
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("codePushInstallModeImmediate", Integer.valueOf(CodePushInstallMode.IMMEDIATE.getValue()));
        map.put("codePushInstallModeOnNextRestart", Integer.valueOf(CodePushInstallMode.ON_NEXT_RESTART.getValue()));
        map.put("codePushInstallModeOnNextResume", Integer.valueOf(CodePushInstallMode.ON_NEXT_RESUME.getValue()));
        map.put("codePushInstallModeOnNextSuspend", Integer.valueOf(CodePushInstallMode.ON_NEXT_SUSPEND.getValue()));
        map.put("codePushUpdateStateRunning", Integer.valueOf(CodePushUpdateState.RUNNING.getValue()));
        map.put("codePushUpdateStatePending", Integer.valueOf(CodePushUpdateState.PENDING.getValue()));
        map.put("codePushUpdateStateLatest", Integer.valueOf(CodePushUpdateState.LATEST.getValue()));
        return map;
    }

    @ReactMethod
    public void getLatestRollbackInfo(Promise promise) {
        try {
            JSONObject latestRollbackInfo = this.mSettingsManager.getLatestRollbackInfo();
            if (latestRollbackInfo != null) {
                promise.resolve(CodePushUtils.convertJsonObjectToWritable(latestRollbackInfo));
            } else {
                promise.resolve(null);
            }
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CodePush";
    }

    @ReactMethod
    public void getNewStatusReport(final Promise promise) {
        new AsyncTask<Void, Void, Void>() { // from class: com.microsoft.codepush.react.CodePushNativeModule.4
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                WritableMap updateReport;
                try {
                    if (CodePushNativeModule.this.mCodePush.needToReportRollback()) {
                        CodePushNativeModule.this.mCodePush.setNeedToReportRollback(false);
                        JSONArray failedUpdates = CodePushNativeModule.this.mSettingsManager.getFailedUpdates();
                        if (failedUpdates != null && failedUpdates.length() > 0) {
                            try {
                                WritableMap rollbackReport = CodePushNativeModule.this.mTelemetryManager.getRollbackReport(CodePushUtils.convertJsonObjectToWritable(failedUpdates.getJSONObject(failedUpdates.length() - 1)));
                                if (rollbackReport != null) {
                                    promise.resolve(rollbackReport);
                                    return null;
                                }
                            } catch (JSONException e10) {
                                throw new CodePushUnknownException("Unable to read failed updates information stored in SharedPreferences.", e10);
                            }
                        }
                    } else if (CodePushNativeModule.this.mCodePush.didUpdate()) {
                        JSONObject currentPackage = CodePushNativeModule.this.mUpdateManager.getCurrentPackage();
                        if (currentPackage != null && (updateReport = CodePushNativeModule.this.mTelemetryManager.getUpdateReport(CodePushUtils.convertJsonObjectToWritable(currentPackage))) != null) {
                            promise.resolve(updateReport);
                            return null;
                        }
                    } else if (CodePushNativeModule.this.mCodePush.isRunningBinaryVersion()) {
                        WritableMap binaryUpdateReport = CodePushNativeModule.this.mTelemetryManager.getBinaryUpdateReport(CodePushNativeModule.this.mCodePush.getAppVersion());
                        if (binaryUpdateReport != null) {
                            promise.resolve(binaryUpdateReport);
                            return null;
                        }
                    } else {
                        WritableMap retryStatusReport = CodePushNativeModule.this.mTelemetryManager.getRetryStatusReport();
                        if (retryStatusReport != null) {
                            promise.resolve(retryStatusReport);
                            return null;
                        }
                    }
                    promise.resolve("");
                } catch (CodePushUnknownException e11) {
                    CodePushUtils.log(e11);
                    promise.reject(e11);
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ReactHostDelegate getReactHostDelegate(ReactHostImpl reactHostImpl) {
        try {
            Field declaredField = reactHostImpl.getClass().getDeclaredField("reactHostDelegate");
            declaredField.setAccessible(true);
            return (ReactHostDelegate) declaredField.get(reactHostImpl);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @ReactMethod
    public void getUpdateMetadata(final int i7, final Promise promise) {
        new AsyncTask<Void, Void, Void>() { // from class: com.microsoft.codepush.react.CodePushNativeModule.3
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                try {
                    JSONObject currentPackage = CodePushNativeModule.this.mUpdateManager.getCurrentPackage();
                    if (currentPackage == null) {
                        promise.resolve(null);
                        return null;
                    }
                    Boolean boolValueOf = Boolean.FALSE;
                    if (currentPackage.has("packageHash")) {
                        boolValueOf = Boolean.valueOf(CodePushNativeModule.this.mSettingsManager.isPendingUpdate(currentPackage.optString("packageHash", null)));
                    }
                    if (i7 == CodePushUpdateState.PENDING.getValue() && !boolValueOf.booleanValue()) {
                        promise.resolve(null);
                    } else if (i7 == CodePushUpdateState.RUNNING.getValue() && boolValueOf.booleanValue()) {
                        JSONObject previousPackage = CodePushNativeModule.this.mUpdateManager.getPreviousPackage();
                        if (previousPackage == null) {
                            promise.resolve(null);
                            return null;
                        }
                        promise.resolve(CodePushUtils.convertJsonObjectToWritable(previousPackage));
                    } else {
                        if (CodePushNativeModule.this.mCodePush.isRunningBinaryVersion()) {
                            CodePushUtils.setJSONValueForKey(currentPackage, "_isDebugOnly", Boolean.TRUE);
                        }
                        CodePushUtils.setJSONValueForKey(currentPackage, "isPending", boolValueOf);
                        promise.resolve(CodePushUtils.convertJsonObjectToWritable(currentPackage));
                    }
                    return null;
                } catch (CodePushMalformedDataException e10) {
                    CodePushUtils.log(e10.getMessage());
                    CodePushNativeModule.this.clearUpdates();
                    promise.resolve(null);
                } catch (CodePushUnknownException e11) {
                    CodePushUtils.log(e11);
                    promise.reject(e11);
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void installUpdate(ReadableMap readableMap, int i7, int i10, Promise promise) {
        new AnonymousClass5(readableMap, i7, i10, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void isFailedUpdate(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mSettingsManager.isFailedHash(str)));
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void isFirstRun(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.mCodePush.didUpdate() && str != null && str.length() > 0 && str.equals(this.mUpdateManager.getCurrentPackageHash())));
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void notifyApplicationReady(Promise promise) {
        try {
            this.mSettingsManager.removePendingUpdate();
            promise.resolve("");
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void recordStatusReported(ReadableMap readableMap) {
        try {
            this.mTelemetryManager.recordStatusReported(readableMap);
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void restartApp(boolean z3, Promise promise) {
        try {
            restartAppInternal(z3);
            promise.resolve(null);
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void saveStatusReportForRetry(ReadableMap readableMap) {
        try {
            this.mTelemetryManager.saveStatusReportForRetry(readableMap);
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
        }
    }

    @ReactMethod
    public void setLatestRollbackInfo(String str, Promise promise) {
        try {
            this.mSettingsManager.setLatestRollbackInfo(str);
            promise.resolve(null);
        } catch (CodePushUnknownException e10) {
            CodePushUtils.log(e10);
            promise.reject(e10);
        }
    }
}
