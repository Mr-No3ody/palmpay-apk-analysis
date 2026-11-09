package com.microsoft.codepush.react;

import N8.q0;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushTelemetryManager {
    private final String APP_VERSION_KEY = RemoteConfigConstants.RequestFieldKey.APP_VERSION;
    private final String DEPLOYMENT_FAILED_STATUS = "DeploymentFailed";
    private final String DEPLOYMENT_KEY_KEY = "deploymentKey";
    private final String DEPLOYMENT_SUCCEEDED_STATUS = "DeploymentSucceeded";
    private final String LABEL_KEY = Constants.ScionAnalytics.PARAM_LABEL;
    private final String LAST_DEPLOYMENT_REPORT_KEY = "CODE_PUSH_LAST_DEPLOYMENT_REPORT";
    private final String PACKAGE_KEY = "package";
    private final String PREVIOUS_DEPLOYMENT_KEY_KEY = "previousDeploymentKey";
    private final String PREVIOUS_LABEL_OR_APP_VERSION_KEY = "previousLabelOrAppVersion";
    private final String RETRY_DEPLOYMENT_REPORT_KEY = "CODE_PUSH_RETRY_DEPLOYMENT_REPORT";
    private final String STATUS_KEY = "status";
    private SharedPreferences mSettings;

    public CodePushTelemetryManager(Context context) {
        this.mSettings = context.getSharedPreferences("CodePush", 0);
    }

    private void clearRetryStatusReport() {
        this.mSettings.edit().remove("CODE_PUSH_RETRY_DEPLOYMENT_REPORT").commit();
    }

    private String getDeploymentKeyFromStatusReportIdentifier(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length > 0) {
            return strArrSplit[0];
        }
        return null;
    }

    private String getPackageStatusReportIdentifier(ReadableMap readableMap) {
        String strTryGetString = CodePushUtils.tryGetString(readableMap, "deploymentKey");
        String strTryGetString2 = CodePushUtils.tryGetString(readableMap, Constants.ScionAnalytics.PARAM_LABEL);
        if (strTryGetString == null || strTryGetString2 == null) {
            return null;
        }
        return q0.y(strTryGetString, ":", strTryGetString2);
    }

    private String getPreviousStatusReportIdentifier() {
        return this.mSettings.getString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", null);
    }

    private String getVersionLabelFromStatusReportIdentifier(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length > 1) {
            return strArrSplit[1];
        }
        return null;
    }

    private boolean isStatusReportIdentifierCodePushLabel(String str) {
        return str != null && str.contains(":");
    }

    private void saveStatusReportedForIdentifier(String str) {
        this.mSettings.edit().putString("CODE_PUSH_LAST_DEPLOYMENT_REPORT", str).commit();
    }

    public WritableMap getBinaryUpdateReport(String str) {
        String previousStatusReportIdentifier = getPreviousStatusReportIdentifier();
        if (previousStatusReportIdentifier == null) {
            clearRetryStatusReport();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            return writableMapCreateMap;
        }
        if (previousStatusReportIdentifier.equals(str)) {
            return null;
        }
        clearRetryStatusReport();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (!isStatusReportIdentifierCodePushLabel(previousStatusReportIdentifier)) {
            writableMapCreateMap2.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            writableMapCreateMap2.putString("previousLabelOrAppVersion", previousStatusReportIdentifier);
            return writableMapCreateMap2;
        }
        String deploymentKeyFromStatusReportIdentifier = getDeploymentKeyFromStatusReportIdentifier(previousStatusReportIdentifier);
        String versionLabelFromStatusReportIdentifier = getVersionLabelFromStatusReportIdentifier(previousStatusReportIdentifier);
        writableMapCreateMap2.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
        writableMapCreateMap2.putString("previousDeploymentKey", deploymentKeyFromStatusReportIdentifier);
        writableMapCreateMap2.putString("previousLabelOrAppVersion", versionLabelFromStatusReportIdentifier);
        return writableMapCreateMap2;
    }

    public WritableMap getRetryStatusReport() {
        String string = this.mSettings.getString("CODE_PUSH_RETRY_DEPLOYMENT_REPORT", null);
        if (string != null) {
            clearRetryStatusReport();
            try {
                return CodePushUtils.convertJsonObjectToWritable(new JSONObject(string));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public WritableMap getRollbackReport(WritableMap writableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("package", writableMap);
        writableMapCreateMap.putString("status", "DeploymentFailed");
        return writableMapCreateMap;
    }

    public WritableMap getUpdateReport(WritableMap writableMap) {
        String packageStatusReportIdentifier = getPackageStatusReportIdentifier(writableMap);
        String previousStatusReportIdentifier = getPreviousStatusReportIdentifier();
        if (packageStatusReportIdentifier == null) {
            return null;
        }
        if (previousStatusReportIdentifier == null) {
            clearRetryStatusReport();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("package", writableMap);
            writableMapCreateMap.putString("status", "DeploymentSucceeded");
            return writableMapCreateMap;
        }
        if (previousStatusReportIdentifier.equals(packageStatusReportIdentifier)) {
            return null;
        }
        clearRetryStatusReport();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (!isStatusReportIdentifierCodePushLabel(previousStatusReportIdentifier)) {
            writableMapCreateMap2.putMap("package", writableMap);
            writableMapCreateMap2.putString("status", "DeploymentSucceeded");
            writableMapCreateMap2.putString("previousLabelOrAppVersion", previousStatusReportIdentifier);
            return writableMapCreateMap2;
        }
        String deploymentKeyFromStatusReportIdentifier = getDeploymentKeyFromStatusReportIdentifier(previousStatusReportIdentifier);
        String versionLabelFromStatusReportIdentifier = getVersionLabelFromStatusReportIdentifier(previousStatusReportIdentifier);
        writableMapCreateMap2.putMap("package", writableMap);
        writableMapCreateMap2.putString("status", "DeploymentSucceeded");
        writableMapCreateMap2.putString("previousDeploymentKey", deploymentKeyFromStatusReportIdentifier);
        writableMapCreateMap2.putString("previousLabelOrAppVersion", versionLabelFromStatusReportIdentifier);
        return writableMapCreateMap2;
    }

    public void recordStatusReported(ReadableMap readableMap) {
        if (readableMap.hasKey("status") && "DeploymentFailed".equals(readableMap.getString("status"))) {
            return;
        }
        if (readableMap.hasKey(RemoteConfigConstants.RequestFieldKey.APP_VERSION)) {
            saveStatusReportedForIdentifier(readableMap.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
        } else if (readableMap.hasKey("package")) {
            saveStatusReportedForIdentifier(getPackageStatusReportIdentifier(readableMap.getMap("package")));
        }
    }

    public void saveStatusReportForRetry(ReadableMap readableMap) {
        this.mSettings.edit().putString("CODE_PUSH_RETRY_DEPLOYMENT_REPORT", CodePushUtils.convertReadableToJsonObject(readableMap).toString()).commit();
    }
}
