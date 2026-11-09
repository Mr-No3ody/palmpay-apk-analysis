package com.adjust.sdk;

import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkClickHandler f19350a;

    public V(SdkClickHandler sdkClickHandler) {
        this.f19350a = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SdkClickHandler sdkClickHandler = this.f19350a;
        IActivityHandler iActivityHandler = (IActivityHandler) sdkClickHandler.activityHandlerWeakRef.get();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
        try {
            JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
            boolean z3 = false;
            for (int i7 = 0; i7 < rawReferrerArray.length(); i7++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i7);
                if (jSONArray.optInt(2, -1) == 0) {
                    String strOptString = jSONArray.optString(0, null);
                    z3 = true;
                    long jOptLong = jSONArray.optLong(1, -1L);
                    jSONArray.put(2, 1);
                    sdkClickHandler.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(strOptString, jOptLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                }
            }
            if (z3) {
                defaultInstance.saveRawReferrerArray(rawReferrerArray);
            }
        } catch (JSONException e10) {
            sdkClickHandler.logger.error("Send saved raw referrers error (%s)", e10.getMessage());
        }
    }
}
