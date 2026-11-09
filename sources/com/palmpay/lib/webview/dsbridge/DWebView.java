package com.palmpay.lib.webview.dsbridge;

import N8.q0;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.appcompat.app.C0833k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DWebView extends WebView {
    private static final String BRIDGE_NAME = "_dsbridge";
    private static final String LOG_TAG = "dsBridge";
    private static boolean isDebug = false;
    private String APP_CACHE_DIRNAME;
    private volatile boolean alertBoxBlock;
    private int callID;
    private ArrayList<CallInfo> callInfoList;
    Map<Integer, OnReturnValue> handlerMap;
    private final InnerJavascriptInterface innerJavascriptInterface;
    private final Map<String, Object> javaScriptNamespaceInterfaces;
    private JavascriptCloseWindowListener javascriptCloseWindowListener;
    private WebChromeClient mWebChromeClient;
    private final Handler mainHandler;
    private WebChromeClient webChromeClient;

    public static class CallInfo {
        private int callbackId;
        private String data;
        private String method;

        public CallInfo(String str, int i7, Object[] objArr) {
            this.data = new JSONArray((Collection) Arrays.asList(objArr == null ? new Object[0] : objArr)).toString();
            this.callbackId = i7;
            this.method = str;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(FirebaseAnalytics.Param.METHOD, this.method);
                jSONObject.put("callbackId", this.callbackId);
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject.toString();
        }
    }

    @Deprecated
    public interface FileChooser {
        @TargetApi(11)
        void openFileChooser(ValueCallback valueCallback, String str);

        @TargetApi(16)
        void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);
    }

    public class InnerJavascriptInterface {
        public /* synthetic */ InnerJavascriptInterface(DWebView dWebView, int i7) {
            this();
        }

        private void PrintDebugInfo(String str) {
            if (DWebView.isDebug) {
                DWebView.this.evaluateJavascript("alert('" + ("DEBUG ERR MSG:\\n" + str.replaceAll("\\'", "\\\\'")) + "')");
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0078  */
        /* JADX WARN: Code duplicated, block: B:29:0x0088  */
        /* JADX WARN: Code duplicated, block: B:31:0x0092  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[Catch: Exception -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:35:0x00a7, B:40:0x00ba), top: B:49:0x00a5 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: Exception -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:35:0x00a7, B:40:0x00ba), top: B:49:0x00a5 }] */
        @JavascriptInterface
        @Keep
        public String call(String str, String str2) {
            boolean z3;
            String[] namespace = DWebView.this.parseNamespace(str.trim());
            String str3 = namespace[1];
            Object obj = DWebView.this.javaScriptNamespaceInterfaces.get(namespace[0]);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", -1);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (obj == null) {
                PrintDebugInfo("Js bridge  called, but can't find a corresponded JavascriptInterface object , please check your code!");
                return jSONObject.toString();
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                Method method = null;
                final String string = jSONObject2.has("_dscbstub") ? jSONObject2.getString("_dscbstub") : null;
                Object obj2 = jSONObject2.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) ? jSONObject2.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : null;
                Class<?> cls = obj.getClass();
                try {
                    try {
                        method = cls.getMethod(str3, Object.class, CompletionHandler.class);
                        z3 = true;
                    } catch (Exception unused) {
                        method = cls.getMethod(str3, Object.class);
                        z3 = false;
                        if (method == null) {
                            PrintDebugInfo(q0.k("Not find method \"", str3, "\" implementation! please check if the  signature or namespace of the method is right "));
                            return jSONObject.toString();
                        }
                        if (((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) == null) {
                            PrintDebugInfo(q0.k("Method ", str3, " is not invoked, since  it is not declared with JavascriptInterface annotation! "));
                            return jSONObject.toString();
                        }
                        method.setAccessible(true);
                        try {
                            if (z3) {
                                method.invoke(obj, obj2, new CompletionHandler() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.InnerJavascriptInterface.1
                                    @Override // com.palmpay.lib.webview.dsbridge.CompletionHandler
                                    public void complete(Object obj3) {
                                        complete(obj3, true);
                                    }

                                    @Override // com.palmpay.lib.webview.dsbridge.CompletionHandler
                                    public void setProgressData(Object obj3) {
                                        complete(obj3, false);
                                    }

                                    @Override // com.palmpay.lib.webview.dsbridge.CompletionHandler
                                    public void complete() {
                                        complete(null, true);
                                    }

                                    private void complete(Object obj3, boolean z8) {
                                        try {
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("code", 0);
                                            jSONObject3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj3);
                                            String str4 = string;
                                            if (str4 != null) {
                                                String str5 = str4 + "(" + jSONObject3.toString() + ".data);";
                                                if (z8) {
                                                    str5 = str5 + "delete window." + string;
                                                }
                                                DWebView.this.evaluateJavascript(str5);
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                });
                                return jSONObject.toString();
                            }
                            Object objInvoke = method.invoke(obj, obj2);
                            jSONObject.put("code", 0);
                            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, objInvoke);
                            return jSONObject.toString();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            PrintDebugInfo("Call failed：The parameter of \"" + str3 + "\" in Java is invalid.");
                            return jSONObject.toString();
                        }
                    }
                } catch (Exception unused2) {
                    z3 = false;
                }
                if (method == null) {
                    PrintDebugInfo(q0.k("Not find method \"", str3, "\" implementation! please check if the  signature or namespace of the method is right "));
                    return jSONObject.toString();
                }
                if (((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) == null) {
                    PrintDebugInfo(q0.k("Method ", str3, " is not invoked, since  it is not declared with JavascriptInterface annotation! "));
                    return jSONObject.toString();
                }
                method.setAccessible(true);
                if (z3) {
                    method.invoke(obj, obj2, new CompletionHandler() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.InnerJavascriptInterface.1
                        @Override // com.palmpay.lib.webview.dsbridge.CompletionHandler
                        public void complete(Object obj3) {
                            complete(obj3, true);
                        }

                        @Override // com.palmpay.lib.webview.dsbridge.CompletionHandler
                        public void setProgressData(Object obj3) {
                            complete(obj3, false);
                        }

                        @Override // com.palmpay.lib.webview.dsbridge.CompletionHandler
                        public void complete() {
                            complete(null, true);
                        }

                        private void complete(Object obj3, boolean z8) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", 0);
                                jSONObject3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj3);
                                String str4 = string;
                                if (str4 != null) {
                                    String str5 = str4 + "(" + jSONObject3.toString() + ".data);";
                                    if (z8) {
                                        str5 = str5 + "delete window." + string;
                                    }
                                    DWebView.this.evaluateJavascript(str5);
                                }
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                    });
                    return jSONObject.toString();
                }
                Object objInvoke2 = method.invoke(obj, obj2);
                jSONObject.put("code", 0);
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, objInvoke2);
                return jSONObject.toString();
            } catch (JSONException e12) {
                PrintDebugInfo(q0.k("The argument of \"", str3, "\" must be a JSON object string!"));
                e12.printStackTrace();
                return jSONObject.toString();
            }
        }

        private InnerJavascriptInterface() {
        }
    }

    public interface JavascriptCloseWindowListener {
        boolean onClose();
    }

    public DWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.javaScriptNamespaceInterfaces = new HashMap();
        this.callID = 0;
        this.alertBoxBlock = true;
        this.javascriptCloseWindowListener = null;
        this.innerJavascriptInterface = new InnerJavascriptInterface(this, 0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerMap = new HashMap();
        this.mWebChromeClient = new WebChromeClient() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public View getVideoLoadingProgressView() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.getVisitedHistory(valueCallback);
                } else {
                    super.getVisitedHistory(valueCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onCloseWindow(webView);
                } else {
                    super.onCloseWindow(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i7, String str2) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onConsoleMessage(str, i7, str2);
                } else {
                    super.onConsoleMessage(str, i7, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z3, boolean z8, Message message) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onCreateWindow(webView, z3, z8, message) : super.onCreateWindow(webView, z3, z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onExceededDatabaseQuota(String str, String str2, long j6, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                } else {
                    super.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                    return true;
                }
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i7) {
                        dialogInterface.dismiss();
                        if (DWebView.this.alertBoxBlock) {
                            jsResult.confirm();
                        }
                    }
                });
                c0833k.create().show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                    return true;
                }
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i7) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i7 == -1) {
                                jsResult.confirm();
                            } else {
                                jsResult.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                String str4;
                String str5;
                final JsPromptResult jsPromptResult2;
                if (!DWebView.this.alertBoxBlock) {
                    jsPromptResult.confirm();
                }
                if (DWebView.this.webChromeClient != null) {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                    if (DWebView.this.webChromeClient.onJsPrompt(webView, str, str4, str5, jsPromptResult2)) {
                        return true;
                    }
                } else {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                }
                final EditText editText = new EditText(DWebView.this.getContext());
                editText.setText(str5);
                if (str5 != null) {
                    editText.setSelection(str5.length());
                }
                float f10 = DWebView.this.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i7) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i7 == -1) {
                                jsPromptResult2.confirm(editText.getText().toString());
                            } else {
                                jsPromptResult2.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setTitle(str4);
                c0833k.setView(editText);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i7 = (int) (16.0f * f10);
                layoutParams.setMargins(i7, 0, i7, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i10 = (int) (15.0f * f10);
                editText.setPadding(i10 - ((int) (f10 * 5.0f)), i10, i10, i10);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsTimeout() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsTimeout() : super.onJsTimeout();
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i7) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onProgressChanged(webView, i7);
                } else {
                    super.onProgressChanged(webView, i7);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedIcon(webView, bitmap);
                } else {
                    super.onReceivedIcon(webView, bitmap);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTitle(webView, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z3) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTouchIconUrl(webView, str, z3);
                } else {
                    super.onReceivedTouchIconUrl(webView, str, z3);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onRequestFocus(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onRequestFocus(webView);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            @TargetApi(11)
            public void openFileChooser(ValueCallback valueCallback, String str) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str);
                }
            }

            @Keep
            @TargetApi(16)
            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (DWebView.this.webChromeClient != null) {
                    return DWebView.this.webChromeClient.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(14)
            public void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, i7, customViewCallback);
                } else {
                    super.onShowCustomView(view, i7, customViewCallback);
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _evaluateJavascript(String str) {
        super.evaluateJavascript(str, null);
    }

    @Keep
    private void addInternalJavascriptObject() {
        addJavascriptObject(new Object() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.1
            @JavascriptInterface
            @Keep
            public String closePage(Object obj) throws JSONException {
                DWebView.this.runOnMainThread(new Runnable() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DWebView.this.javascriptCloseWindowListener == null || DWebView.this.javascriptCloseWindowListener.onClose()) {
                            Context context = DWebView.this.getContext();
                            if (context instanceof Activity) {
                                ((Activity) context).onBackPressed();
                            }
                        }
                    }
                });
                return null;
            }

            @JavascriptInterface
            @Keep
            public void disableJavascriptDialogBlock(Object obj) throws JSONException {
                DWebView.this.alertBoxBlock = !((JSONObject) obj).getBoolean("disable");
            }

            @JavascriptInterface
            @Keep
            public void dsinit(Object obj) {
                DWebView.this.dispatchStartupQueue();
            }

            @JavascriptInterface
            @Keep
            public boolean hasNativeMethod(Object obj) throws JSONException {
                Method method;
                boolean z3;
                JSONObject jSONObject = (JSONObject) obj;
                String strTrim = jSONObject.getString("name").trim();
                String strTrim2 = jSONObject.getString("type").trim();
                String[] namespace = DWebView.this.parseNamespace(strTrim);
                Object obj2 = DWebView.this.javaScriptNamespaceInterfaces.get(namespace[0]);
                if (obj2 != null) {
                    Class<?> cls = obj2.getClass();
                    try {
                        try {
                            method = cls.getMethod(namespace[1], Object.class, CompletionHandler.class);
                            z3 = true;
                        } catch (Exception unused) {
                            method = cls.getMethod(namespace[1], Object.class);
                            z3 = false;
                            if (method != null) {
                                return false;
                            }
                            return false;
                        }
                    } catch (Exception unused2) {
                        method = null;
                        z3 = false;
                    }
                    if (method != null || ((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) == null) {
                        return false;
                    }
                    if ("all".equals(strTrim2) || ((z3 && "asyn".equals(strTrim2)) || (!z3 && "syn".equals(strTrim2)))) {
                        return true;
                    }
                }
                return false;
            }

            @JavascriptInterface
            @Keep
            public void returnValue(final Object obj) {
                DWebView.this.runOnMainThread(new Runnable() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject = (JSONObject) obj;
                        try {
                            int i7 = jSONObject.getInt("id");
                            boolean z3 = jSONObject.getBoolean("complete");
                            OnReturnValue onReturnValue = DWebView.this.handlerMap.get(Integer.valueOf(i7));
                            Object obj2 = jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) ? jSONObject.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : null;
                            if (onReturnValue != null) {
                                onReturnValue.onValue(obj2);
                                if (z3) {
                                    DWebView.this.handlerMap.remove(Integer.valueOf(i7));
                                }
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                });
            }
        }, "_dsb");
    }

    private void dispatchJavascriptCall(CallInfo callInfo) {
        evaluateJavascript("window._handleMessageFromNative(" + callInfo.toString() + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void dispatchStartupQueue() {
        try {
            ArrayList<CallInfo> arrayList = this.callInfoList;
            if (arrayList != null) {
                Iterator<CallInfo> it = arrayList.iterator();
                while (it.hasNext()) {
                    dispatchJavascriptCall(it.next());
                }
                this.callInfoList = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void init() {
        this.APP_CACHE_DIRNAME = getContext().getFilesDir().getAbsolutePath() + "/webcache";
        WebSettings settings = getSettings();
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        super.setWebChromeClient(this.mWebChromeClient);
        addInternalJavascriptObject();
        super.addJavascriptInterface("1.0.0", "ppUniBridge");
        super.addJavascriptInterface(this.innerJavascriptInterface, BRIDGE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] parseNamespace(String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = "";
        }
        return new String[]{strSubstring, str};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnMainThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z3) {
        WebView.setWebContentsDebuggingEnabled(z3);
        isDebug = z3;
    }

    public void addJavascriptObject(Object obj, String str) {
        if (str == null) {
            str = "";
        }
        if (obj != null) {
            this.javaScriptNamespaceInterfaces.put(str, obj);
        }
    }

    public synchronized <T> void callHandler(String str, Object[] objArr, OnReturnValue<T> onReturnValue) {
        try {
            int i7 = this.callID + 1;
            this.callID = i7;
            CallInfo callInfo = new CallInfo(str, i7, objArr);
            if (onReturnValue != null) {
                this.handlerMap.put(Integer.valueOf(callInfo.callbackId), onReturnValue);
            }
            ArrayList<CallInfo> arrayList = this.callInfoList;
            if (arrayList != null) {
                arrayList.add(callInfo);
            } else {
                dispatchJavascriptCall(callInfo);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z3) {
        super.clearCache(z3);
        CookieManager.getInstance().removeAllCookie();
        Context context = getContext();
        try {
            context.deleteDatabase("webview.db");
            context.deleteDatabase("webviewCache.db");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        File file = new File(this.APP_CACHE_DIRNAME);
        File file2 = new File(context.getCacheDir().getAbsolutePath() + "/webviewCache");
        if (file2.exists()) {
            deleteFile(file2);
        }
        if (file.exists()) {
            deleteFile(file);
        }
    }

    public void deleteFile(File file) {
        if (!file.exists()) {
            Log.e("Webview", "delete file no exists " + file.getAbsolutePath());
            return;
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFile(file2);
            }
        }
        file.delete();
    }

    public void disableJavascriptDialogBlock(boolean z3) {
        this.alertBoxBlock = !z3;
    }

    public void evaluateJavascript(final String str) {
        runOnMainThread(new Runnable() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.2
            @Override // java.lang.Runnable
            public void run() {
                DWebView.this._evaluateJavascript(str);
            }
        });
    }

    public void hasJavascriptMethod(String str, OnReturnValue<Boolean> onReturnValue) {
        callHandler("_hasJavascriptMethod", new Object[]{str}, onReturnValue);
    }

    @Override // android.webkit.WebView
    public void loadUrl(final String str) {
        runOnMainThread(new Runnable() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.3
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 != null && str2.startsWith("javascript:")) {
                    DWebView.super.loadUrl(str);
                    return;
                }
                DWebView.this.callInfoList = new ArrayList();
                DWebView.super.loadUrl(str);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllJavascriptObject();
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    @Override // android.webkit.WebView
    public void reload() {
        runOnMainThread(new Runnable() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.5
            @Override // java.lang.Runnable
            public void run() {
                DWebView.this.callInfoList = new ArrayList();
                DWebView.super.reload();
            }
        });
    }

    public void removeAllJavascriptObject() {
        this.javaScriptNamespaceInterfaces.clear();
    }

    public void removeJavascriptObject(String str) {
        if (str == null) {
            str = "";
        }
        this.javaScriptNamespaceInterfaces.remove(str);
    }

    public void setJavascriptCloseWindowListener(JavascriptCloseWindowListener javascriptCloseWindowListener) {
        this.javascriptCloseWindowListener = javascriptCloseWindowListener;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
    }

    @Override // android.webkit.WebView
    public void loadUrl(final String str, final Map<String, String> map) {
        runOnMainThread(new Runnable() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.4
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 != null && str2.startsWith("javascript:")) {
                    DWebView.super.loadUrl(str, map);
                    return;
                }
                DWebView.this.callInfoList = new ArrayList();
                DWebView.super.loadUrl(str, map);
            }
        });
    }

    public void callHandler(String str, Object[] objArr) {
        callHandler(str, objArr, null);
    }

    public <T> void callHandler(String str, OnReturnValue<T> onReturnValue) {
        callHandler(str, null, onReturnValue);
    }

    public DWebView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.javaScriptNamespaceInterfaces = new HashMap();
        this.callID = 0;
        this.alertBoxBlock = true;
        this.javascriptCloseWindowListener = null;
        this.innerJavascriptInterface = new InnerJavascriptInterface(this, 0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerMap = new HashMap();
        this.mWebChromeClient = new WebChromeClient() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public View getVideoLoadingProgressView() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.getVisitedHistory(valueCallback);
                } else {
                    super.getVisitedHistory(valueCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onCloseWindow(webView);
                } else {
                    super.onCloseWindow(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i10, String str2) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onConsoleMessage(str, i10, str2);
                } else {
                    super.onConsoleMessage(str, i10, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z3, boolean z8, Message message) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onCreateWindow(webView, z3, z8, message) : super.onCreateWindow(webView, z3, z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onExceededDatabaseQuota(String str, String str2, long j6, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                } else {
                    super.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                    return true;
                }
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                        if (DWebView.this.alertBoxBlock) {
                            jsResult.confirm();
                        }
                    }
                });
                c0833k.create().show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                    return true;
                }
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i10 == -1) {
                                jsResult.confirm();
                            } else {
                                jsResult.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                String str4;
                String str5;
                final JsPromptResult jsPromptResult2;
                if (!DWebView.this.alertBoxBlock) {
                    jsPromptResult.confirm();
                }
                if (DWebView.this.webChromeClient != null) {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                    if (DWebView.this.webChromeClient.onJsPrompt(webView, str, str4, str5, jsPromptResult2)) {
                        return true;
                    }
                } else {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                }
                final EditText editText = new EditText(DWebView.this.getContext());
                editText.setText(str5);
                if (str5 != null) {
                    editText.setSelection(str5.length());
                }
                float f10 = DWebView.this.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i10 == -1) {
                                jsPromptResult2.confirm(editText.getText().toString());
                            } else {
                                jsPromptResult2.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setTitle(str4);
                c0833k.setView(editText);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i10 = (int) (16.0f * f10);
                layoutParams.setMargins(i10, 0, i10, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i11 = (int) (15.0f * f10);
                editText.setPadding(i11 - ((int) (f10 * 5.0f)), i11, i11, i11);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsTimeout() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsTimeout() : super.onJsTimeout();
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onProgressChanged(webView, i10);
                } else {
                    super.onProgressChanged(webView, i10);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedIcon(webView, bitmap);
                } else {
                    super.onReceivedIcon(webView, bitmap);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTitle(webView, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z3) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTouchIconUrl(webView, str, z3);
                } else {
                    super.onReceivedTouchIconUrl(webView, str, z3);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onRequestFocus(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onRequestFocus(webView);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            @TargetApi(11)
            public void openFileChooser(ValueCallback valueCallback, String str) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str);
                }
            }

            @Keep
            @TargetApi(16)
            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (DWebView.this.webChromeClient != null) {
                    return DWebView.this.webChromeClient.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(14)
            public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, i10, customViewCallback);
                } else {
                    super.onShowCustomView(view, i10, customViewCallback);
                }
            }
        };
        init();
    }

    public DWebView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.javaScriptNamespaceInterfaces = new HashMap();
        this.callID = 0;
        this.alertBoxBlock = true;
        this.javascriptCloseWindowListener = null;
        this.innerJavascriptInterface = new InnerJavascriptInterface(this, 0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerMap = new HashMap();
        this.mWebChromeClient = new WebChromeClient() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public View getVideoLoadingProgressView() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.getVisitedHistory(valueCallback);
                } else {
                    super.getVisitedHistory(valueCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onCloseWindow(webView);
                } else {
                    super.onCloseWindow(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i11, String str2) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onConsoleMessage(str, i11, str2);
                } else {
                    super.onConsoleMessage(str, i11, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z3, boolean z8, Message message) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onCreateWindow(webView, z3, z8, message) : super.onCreateWindow(webView, z3, z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onExceededDatabaseQuota(String str, String str2, long j6, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                } else {
                    super.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                    return true;
                }
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        dialogInterface.dismiss();
                        if (DWebView.this.alertBoxBlock) {
                            jsResult.confirm();
                        }
                    }
                });
                c0833k.create().show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                    return true;
                }
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i11 == -1) {
                                jsResult.confirm();
                            } else {
                                jsResult.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                String str4;
                String str5;
                final JsPromptResult jsPromptResult2;
                if (!DWebView.this.alertBoxBlock) {
                    jsPromptResult.confirm();
                }
                if (DWebView.this.webChromeClient != null) {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                    if (DWebView.this.webChromeClient.onJsPrompt(webView, str, str4, str5, jsPromptResult2)) {
                        return true;
                    }
                } else {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                }
                final EditText editText = new EditText(DWebView.this.getContext());
                editText.setText(str5);
                if (str5 != null) {
                    editText.setSelection(str5.length());
                }
                float f10 = DWebView.this.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i11 == -1) {
                                jsPromptResult2.confirm(editText.getText().toString());
                            } else {
                                jsPromptResult2.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setTitle(str4);
                c0833k.setView(editText);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i11 = (int) (16.0f * f10);
                layoutParams.setMargins(i11, 0, i11, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i12 = (int) (15.0f * f10);
                editText.setPadding(i12 - ((int) (f10 * 5.0f)), i12, i12, i12);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsTimeout() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsTimeout() : super.onJsTimeout();
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i11) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onProgressChanged(webView, i11);
                } else {
                    super.onProgressChanged(webView, i11);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedIcon(webView, bitmap);
                } else {
                    super.onReceivedIcon(webView, bitmap);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTitle(webView, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z3) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTouchIconUrl(webView, str, z3);
                } else {
                    super.onReceivedTouchIconUrl(webView, str, z3);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onRequestFocus(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onRequestFocus(webView);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            @TargetApi(11)
            public void openFileChooser(ValueCallback valueCallback, String str) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str);
                }
            }

            @Keep
            @TargetApi(16)
            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (DWebView.this.webChromeClient != null) {
                    return DWebView.this.webChromeClient.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(14)
            public void onShowCustomView(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, i11, customViewCallback);
                } else {
                    super.onShowCustomView(view, i11, customViewCallback);
                }
            }
        };
        init();
    }

    public DWebView(Context context) {
        super(context);
        this.javaScriptNamespaceInterfaces = new HashMap();
        this.callID = 0;
        this.alertBoxBlock = true;
        this.javascriptCloseWindowListener = null;
        this.innerJavascriptInterface = new InnerJavascriptInterface(this, 0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.handlerMap = new HashMap();
        this.mWebChromeClient = new WebChromeClient() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public View getVideoLoadingProgressView() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.getVisitedHistory(valueCallback);
                } else {
                    super.getVisitedHistory(valueCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onCloseWindow(webView);
                } else {
                    super.onCloseWindow(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i11, String str2) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onConsoleMessage(str, i11, str2);
                } else {
                    super.onConsoleMessage(str, i11, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z3, boolean z8, Message message) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onCreateWindow(webView, z3, z8, message) : super.onCreateWindow(webView, z3, z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onExceededDatabaseQuota(String str, String str2, long j6, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                } else {
                    super.onExceededDatabaseQuota(str, str2, j6, j10, j11, quotaUpdater);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                    return true;
                }
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        dialogInterface.dismiss();
                        if (DWebView.this.alertBoxBlock) {
                            jsResult.confirm();
                        }
                    }
                });
                c0833k.create().show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                if (!DWebView.this.alertBoxBlock) {
                    jsResult.confirm();
                }
                if (DWebView.this.webChromeClient != null && DWebView.this.webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                    return true;
                }
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i11 == -1) {
                                jsResult.confirm();
                            } else {
                                jsResult.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setMessage(str2);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                String str4;
                String str5;
                final JsPromptResult jsPromptResult2;
                if (!DWebView.this.alertBoxBlock) {
                    jsPromptResult.confirm();
                }
                if (DWebView.this.webChromeClient != null) {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                    if (DWebView.this.webChromeClient.onJsPrompt(webView, str, str4, str5, jsPromptResult2)) {
                        return true;
                    }
                } else {
                    str4 = str2;
                    str5 = str3;
                    jsPromptResult2 = jsPromptResult;
                }
                final EditText editText = new EditText(DWebView.this.getContext());
                editText.setText(str5);
                if (str5 != null) {
                    editText.setSelection(str5.length());
                }
                float f10 = DWebView.this.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.dsbridge.DWebView.6.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        if (DWebView.this.alertBoxBlock) {
                            if (i11 == -1) {
                                jsPromptResult2.confirm(editText.getText().toString());
                            } else {
                                jsPromptResult2.cancel();
                            }
                        }
                    }
                };
                C0833k c0833k = new C0833k(DWebView.this.getContext());
                c0833k.setTitle(str4);
                c0833k.setView(editText);
                c0833k.setCancelable(false);
                c0833k.setPositiveButton(R.string.ok, onClickListener);
                c0833k.setNegativeButton(R.string.cancel, onClickListener);
                c0833k.show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i11 = (int) (16.0f * f10);
                layoutParams.setMargins(i11, 0, i11, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i12 = (int) (15.0f * f10);
                editText.setPadding(i12 - ((int) (f10 * 5.0f)), i12, i12, i12);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsTimeout() {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onJsTimeout() : super.onJsTimeout();
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i11) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onProgressChanged(webView, i11);
                } else {
                    super.onProgressChanged(webView, i11);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedIcon(webView, bitmap);
                } else {
                    super.onReceivedIcon(webView, bitmap);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTitle(webView, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z3) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onReceivedTouchIconUrl(webView, str, z3);
                } else {
                    super.onReceivedTouchIconUrl(webView, str, z3);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onRequestFocus(WebView webView) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onRequestFocus(webView);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(21)
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return DWebView.this.webChromeClient != null ? DWebView.this.webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            @TargetApi(11)
            public void openFileChooser(ValueCallback valueCallback, String str) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str);
                }
            }

            @Keep
            @TargetApi(16)
            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                if (DWebView.this.webChromeClient instanceof FileChooser) {
                    ((FileChooser) DWebView.this.webChromeClient).openFileChooser(valueCallback, str, str2);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (DWebView.this.webChromeClient != null) {
                    return DWebView.this.webChromeClient.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            @TargetApi(14)
            public void onShowCustomView(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
                if (DWebView.this.webChromeClient != null) {
                    DWebView.this.webChromeClient.onShowCustomView(view, i11, customViewCallback);
                } else {
                    super.onShowCustomView(view, i11, customViewCallback);
                }
            }
        };
        init();
    }
}
