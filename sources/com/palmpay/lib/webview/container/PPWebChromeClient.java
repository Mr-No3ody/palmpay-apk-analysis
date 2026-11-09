package com.palmpay.lib.webview.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.E;
import com.luck.picture.lib.config.SelectMimeType;
import com.palmpay.lib.webview.R;
import com.palmpay.lib.webview.util.PermissionUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class PPWebChromeClient extends WebChromeClient {
    private static final int RESULT_CODE_FILE_CHOOSER = 1;
    private static final int RESULT_CODE_FILE_CHOOSER_FOR_ANDROID_5 = 2;
    private boolean isFixScreenLandscape = false;
    private boolean isFixScreenPortrait = false;
    private final WeakReference<Activity> mActivityWeakReference;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private View mProgressVideo;
    private ValueCallback<Uri> mUploadMessage;
    private ValueCallback<Uri[]> mUploadMessageForAndroid5;
    private WebChromeCallback mWebChromeCallback;
    private final WebViewConfig mWebView;
    private WebFullscreenHolder videoFullView;

    public PPWebChromeClient(Activity activity, WebViewConfig webViewConfig) {
        this.mActivityWeakReference = new WeakReference<>(activity);
        this.mWebView = webViewConfig;
    }

    private void openFileChooserImpl(ValueCallback<Uri> valueCallback) {
        Activity activity = this.mActivityWeakReference.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mUploadMessage = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(SelectMimeType.SYSTEM_IMAGE);
        activity.startActivityForResult(Intent.createChooser(intent, "select file"), 1);
    }

    private void openFileChooserImplForAndroid5(ValueCallback<Uri[]> valueCallback) {
        Activity activity = this.mActivityWeakReference.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mUploadMessageForAndroid5 = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(SelectMimeType.SYSTEM_IMAGE);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", intent);
        intent2.putExtra("android.intent.extra.TITLE", "select image");
        activity.startActivityForResult(intent2, 2);
    }

    @SuppressLint({"NewApi"})
    private void uploadMessage(Intent intent, int i7) {
        if (this.mUploadMessage == null) {
            return;
        }
        this.mUploadMessage.onReceiveValue((intent == null || i7 != -1) ? null : intent.getData());
        this.mUploadMessage = null;
    }

    @SuppressLint({"NewApi"})
    private void uploadMessageForAndroid5(Intent intent, int i7) {
        if (this.mUploadMessageForAndroid5 == null) {
            return;
        }
        Uri data = (intent == null || i7 != -1) ? null : intent.getData();
        if (data != null) {
            this.mUploadMessageForAndroid5.onReceiveValue(new Uri[]{data});
        } else {
            this.mUploadMessageForAndroid5.onReceiveValue(new Uri[0]);
        }
        this.mUploadMessageForAndroid5 = null;
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster() == null ? BitmapFactory.decodeResource(this.mWebView.getWebView().getResources(), R.drawable.lib_web_icon_video) : super.getDefaultVideoPoster();
    }

    public WebFullscreenHolder getVideoFullView() {
        return this.videoFullView;
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        if (this.mProgressVideo == null) {
            this.mProgressVideo = LayoutInflater.from(this.mWebView.getWebView().getContext()).inflate(R.layout.lib_web_video_loading_progress, (ViewGroup) null);
        }
        return this.mProgressVideo;
    }

    public void handleFileChooser(int i7, int i10, Intent intent) {
        if (i7 == 1) {
            uploadMessage(intent, i10);
        } else if (i7 == 2) {
            uploadMessageForAndroid5(intent, i10);
        }
    }

    public boolean inCustomView() {
        return this.mCustomView != null;
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"SourceLockedOrientationActivity", "NewApi"})
    public void onHideCustomView() {
        WebChromeCallback webChromeCallback;
        Activity activity = this.mActivityWeakReference.get();
        if (activity == null || activity.isFinishing() || this.mCustomView == null) {
            return;
        }
        if (!this.isFixScreenPortrait && ((webChromeCallback = this.mWebChromeCallback) == null || !webChromeCallback.onHandleScreenOrientation(false))) {
            activity.setRequestedOrientation(1);
        }
        this.mCustomView.setVisibility(8);
        WebFullscreenHolder webFullscreenHolder = this.videoFullView;
        if (webFullscreenHolder != null) {
            webFullscreenHolder.removeView(this.mCustomView);
            this.videoFullView.setVisibility(8);
        }
        this.mCustomView = null;
        this.mCustomViewCallback.onCustomViewHidden();
        this.mWebView.getWebView().setVisibility(0);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        WebChromeCallback webChromeCallback = this.mWebChromeCallback;
        if (webChromeCallback != null && webChromeCallback.onJsAlert(webView, str, str2, jsResult)) {
            return true;
        }
        new AlertDialog.Builder(webView.getContext()).setMessage(str2).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.container.PPWebChromeClient.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                dialogInterface.dismiss();
                jsResult.confirm();
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        WebChromeCallback webChromeCallback = this.mWebChromeCallback;
        if (webChromeCallback != null && webChromeCallback.onJsConfirm(webView, str, str2, jsResult)) {
            return true;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.container.PPWebChromeClient.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                if (i7 == -1) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
            }
        };
        new AlertDialog.Builder(webView.getContext()).setMessage(str2).setCancelable(false).setPositiveButton(android.R.string.ok, onClickListener).setNegativeButton(android.R.string.cancel, onClickListener).show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(final WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String str4;
        String str5;
        JsPromptResult jsPromptResult2;
        WebChromeCallback webChromeCallback = this.mWebChromeCallback;
        if (webChromeCallback != null) {
            str4 = str2;
            str5 = str3;
            jsPromptResult2 = jsPromptResult;
            if (webChromeCallback.onJsPrompt(webView, str, str4, str5, jsPromptResult2)) {
                return true;
            }
        } else {
            str4 = str2;
            str5 = str3;
            jsPromptResult2 = jsPromptResult;
        }
        final JsPromptResult jsPromptResult3 = jsPromptResult2;
        final String str6 = str4;
        final String str7 = str5;
        webView.post(new Runnable() { // from class: com.palmpay.lib.webview.container.PPWebChromeClient.3
            @Override // java.lang.Runnable
            public void run() {
                final EditText editText = new EditText(webView.getContext());
                editText.setText(str7);
                String str8 = str7;
                if (str8 != null) {
                    editText.setSelection(str8.length());
                }
                float f10 = webView.getContext().getResources().getDisplayMetrics().density;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.container.PPWebChromeClient.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i7) {
                        if (i7 == -1) {
                            jsPromptResult3.confirm(editText.getText().toString());
                        } else {
                            jsPromptResult3.cancel();
                        }
                    }
                };
                new AlertDialog.Builder(webView.getContext()).setTitle(str6).setView(editText).setCancelable(false).setPositiveButton(android.R.string.ok, onClickListener).setNegativeButton(android.R.string.cancel, onClickListener).show();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                int i7 = (int) (16.0f * f10);
                layoutParams.setMargins(i7, 0, i7, 0);
                layoutParams.gravity = 1;
                editText.setLayoutParams(layoutParams);
                int i10 = (int) (15.0f * f10);
                editText.setPadding(i10 - ((int) (f10 * 5.0f)), i10, i10, i10);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = 21)
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        Activity activity = this.mActivityWeakReference.get();
        if (activity == null || activity.isFinishing()) {
            super.onPermissionRequest(permissionRequest);
        } else {
            PermissionUtil.requestByMostEffort((E) activity, permissionRequest, new PermissionUtil.PermissionCallback() { // from class: com.palmpay.lib.webview.container.PPWebChromeClient.4
                @Override // com.palmpay.lib.webview.util.PermissionUtil.PermissionCallback
                public void onPermissionDenied() {
                    permissionRequest.deny();
                }

                @Override // com.palmpay.lib.webview.util.PermissionUtil.PermissionCallback
                public void onPermissionGranted() {
                    try {
                        PermissionRequest permissionRequest2 = permissionRequest;
                        permissionRequest2.grant(permissionRequest2.getResources());
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i7) {
        super.onProgressChanged(webView, i7);
        if (this.mWebView.getProgressBar() != null) {
            this.mWebView.getProgressBar().setWebProgress(i7);
        }
        if (this.mWebView.getWebView() != null && this.mWebView.getWebView().getVisibility() == 4 && ((this.mWebView.getErrorView() == null || this.mWebView.getErrorView().getVisibility() == 8) && i7 == 100)) {
            this.mWebView.getWebView().setVisibility(0);
        }
        WebChromeCallback webChromeCallback = this.mWebChromeCallback;
        if (webChromeCallback != null) {
            webChromeCallback.onProgressChanged(i7);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (this.mWebChromeCallback != null) {
            if (this.mWebView.getErrorView() == null || this.mWebView.getErrorView().getVisibility() != 0) {
                this.mWebChromeCallback.onReceivedTitle(str);
            } else {
                this.mWebChromeCallback.onReceivedTitle(TextUtils.isEmpty(this.mWebView.getErrorTitle()) ? "Error Page" : this.mWebView.getErrorTitle());
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeCallback webChromeCallback;
        Activity activity = this.mActivityWeakReference.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (!this.isFixScreenLandscape && ((webChromeCallback = this.mWebChromeCallback) == null || !webChromeCallback.onHandleScreenOrientation(true))) {
            activity.setRequestedOrientation(0);
        }
        this.mWebView.getWebView().setVisibility(4);
        if (this.mCustomView != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        if (this.videoFullView == null) {
            FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
            WebFullscreenHolder webFullscreenHolder = new WebFullscreenHolder(activity);
            this.videoFullView = webFullscreenHolder;
            frameLayout.addView(webFullscreenHolder);
        }
        this.videoFullView.addView(view);
        this.mCustomView = view;
        this.mCustomViewCallback = customViewCallback;
        this.videoFullView.setVisibility(0);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebChromeCallback webChromeCallback = this.mWebChromeCallback;
        if (webChromeCallback != null ? webChromeCallback.onShowFileChooser(webView, valueCallback, fileChooserParams) : false) {
            return true;
        }
        openFileChooserImplForAndroid5(valueCallback);
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        openFileChooserImpl(valueCallback);
    }

    public void setFixScreenLandscape(boolean z3) {
        this.isFixScreenLandscape = z3;
    }

    public void setFixScreenPortrait(boolean z3) {
        this.isFixScreenPortrait = z3;
    }

    public void setWebChromeCallback(WebChromeCallback webChromeCallback) {
        this.mWebChromeCallback = webChromeCallback;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        openFileChooserImpl(valueCallback);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        openFileChooserImpl(valueCallback);
    }
}
