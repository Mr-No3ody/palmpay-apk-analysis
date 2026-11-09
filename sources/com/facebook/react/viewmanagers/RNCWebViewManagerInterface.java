package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNCWebViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void clearCache(T t, boolean z3);

    void clearFormData(T t);

    void clearHistory(T t);

    void goBack(T t);

    void goForward(T t);

    void injectJavaScript(T t, String str);

    void loadUrl(T t, String str);

    void postMessage(T t, String str);

    void reload(T t);

    void requestFocus(T t);

    void setAllowFileAccess(T t, boolean z3);

    void setAllowFileAccessFromFileURLs(T t, boolean z3);

    void setAllowUniversalAccessFromFileURLs(T t, boolean z3);

    void setAllowingReadAccessToURL(T t, @Nullable String str);

    void setAllowsAirPlayForMediaPlayback(T t, boolean z3);

    void setAllowsBackForwardNavigationGestures(T t, boolean z3);

    void setAllowsFullscreenVideo(T t, boolean z3);

    void setAllowsInlineMediaPlayback(T t, boolean z3);

    void setAllowsLinkPreview(T t, boolean z3);

    void setAllowsPictureInPictureMediaPlayback(T t, boolean z3);

    void setAllowsProtectedMedia(T t, boolean z3);

    void setAndroidLayerType(T t, @Nullable String str);

    void setApplicationNameForUserAgent(T t, @Nullable String str);

    void setAutoManageStatusBarEnabled(T t, boolean z3);

    void setAutomaticallyAdjustContentInsets(T t, boolean z3);

    void setBasicAuthCredential(T t, @Nullable ReadableMap readableMap);

    void setBounces(T t, boolean z3);

    void setCacheEnabled(T t, boolean z3);

    void setCacheMode(T t, @Nullable String str);

    void setContentInset(T t, @Nullable ReadableMap readableMap);

    void setContentInsetAdjustmentBehavior(T t, @Nullable String str);

    void setContentMode(T t, @Nullable String str);

    void setDataDetectorTypes(T t, @Nullable ReadableArray readableArray);

    void setDecelerationRate(T t, double d2);

    void setDirectionalLockEnabled(T t, boolean z3);

    void setDomStorageEnabled(T t, boolean z3);

    void setDownloadingMessage(T t, @Nullable String str);

    void setEnableApplePay(T t, boolean z3);

    void setForceDarkOn(T t, boolean z3);

    void setFraudulentWebsiteWarningEnabled(T t, boolean z3);

    void setGeolocationEnabled(T t, boolean z3);

    void setHasOnFileDownload(T t, boolean z3);

    void setHasOnOpenWindowEvent(T t, boolean z3);

    void setHasOnScroll(T t, boolean z3);

    void setHideKeyboardAccessoryView(T t, boolean z3);

    void setIncognito(T t, boolean z3);

    void setIndicatorStyle(T t, @Nullable String str);

    void setInjectedJavaScript(T t, @Nullable String str);

    void setInjectedJavaScriptBeforeContentLoaded(T t, @Nullable String str);

    void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(T t, boolean z3);

    void setInjectedJavaScriptForMainFrameOnly(T t, boolean z3);

    void setInjectedJavaScriptObject(T t, @Nullable String str);

    void setJavaScriptCanOpenWindowsAutomatically(T t, boolean z3);

    void setJavaScriptEnabled(T t, boolean z3);

    void setKeyboardDisplayRequiresUserAction(T t, boolean z3);

    void setLackPermissionToDownloadMessage(T t, @Nullable String str);

    void setLimitsNavigationsToAppBoundDomains(T t, boolean z3);

    void setMediaCapturePermissionGrantType(T t, @Nullable String str);

    void setMediaPlaybackRequiresUserAction(T t, boolean z3);

    void setMenuItems(T t, @Nullable ReadableArray readableArray);

    void setMessagingEnabled(T t, boolean z3);

    void setMessagingModuleName(T t, @Nullable String str);

    void setMinimumFontSize(T t, int i7);

    void setMixedContentMode(T t, @Nullable String str);

    void setNestedScrollEnabled(T t, boolean z3);

    void setNewSource(T t, @Nullable ReadableMap readableMap);

    void setOverScrollMode(T t, @Nullable String str);

    void setPagingEnabled(T t, boolean z3);

    void setPaymentRequestEnabled(T t, boolean z3);

    void setPullToRefreshEnabled(T t, boolean z3);

    void setRefreshControlLightMode(T t, boolean z3);

    void setSaveFormDataDisabled(T t, boolean z3);

    void setScalesPageToFit(T t, boolean z3);

    void setScrollEnabled(T t, boolean z3);

    void setSetBuiltInZoomControls(T t, boolean z3);

    void setSetDisplayZoomControls(T t, boolean z3);

    void setSetSupportMultipleWindows(T t, boolean z3);

    void setSharedCookiesEnabled(T t, boolean z3);

    void setShowsHorizontalScrollIndicator(T t, boolean z3);

    void setShowsVerticalScrollIndicator(T t, boolean z3);

    void setSuppressMenuItems(T t, @Nullable ReadableArray readableArray);

    void setTextInteractionEnabled(T t, boolean z3);

    void setTextZoom(T t, int i7);

    void setThirdPartyCookiesEnabled(T t, boolean z3);

    void setUseSharedProcessPool(T t, boolean z3);

    void setUserAgent(T t, @Nullable String str);

    void setWebviewDebuggingEnabled(T t, boolean z3);

    void stopLoading(T t);
}
