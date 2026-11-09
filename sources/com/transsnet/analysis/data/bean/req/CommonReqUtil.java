package com.transsnet.analysis.data.bean.req;

import android.text.TextUtils;
import com.transsnet.analysis.AnalysisManager;
import com.transsnet.analysis.BuildConfig;
import com.transsnet.analysis.utils.AnalysisUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CommonReqUtil {
    private static String packageName;

    public static CommonReqHead getCommonHead(String appId) {
        CommonReqHead commonReqHead = new CommonReqHead();
        commonReqHead.gaid = AnalysisManager.getGaId();
        commonReqHead.imei = "";
        commonReqHead.macAddress = "02:00:00:00:00:00";
        commonReqHead.operSystem = "Android";
        commonReqHead.ip = "0.0.0.0";
        long jCurrentTimeMillis = System.currentTimeMillis();
        commonReqHead.createTime = jCurrentTimeMillis;
        commonReqHead.eventTime = jCurrentTimeMillis;
        commonReqHead.applicationId = appId;
        commonReqHead.appVersion = AnalysisUtils.getAppVersionName(getPackageName());
        commonReqHead.appVersionCode = AnalysisUtils.getAppVersionCode(getPackageName());
        commonReqHead.appIdentifier = getPackageName();
        commonReqHead.SDKVersion = BuildConfig.VERSION_NAME;
        return commonReqHead;
    }

    public static String getPackageName() {
        if (TextUtils.isEmpty(packageName)) {
            packageName = AnalysisManager.getContext().getPackageName();
        }
        return packageName;
    }

    public static AnalysisBody getReqBody() {
        AnalysisBody analysisBody = new AnalysisBody();
        analysisBody.userId = AnalysisManager.getUserId();
        analysisBody.wifi = AnalysisUtils.isWifiConnected();
        analysisBody.countryCode = AnalysisManager.getCountryCode();
        analysisBody.operator = AnalysisUtils.getSimOperatorName(AnalysisManager.getContext());
        return analysisBody;
    }
}
