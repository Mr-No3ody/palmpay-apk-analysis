package com.palmpay.lib.webview.container;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.graphics.e;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.bridgewrapper.page.IPullRefreshListener;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.palmpay.lib.webview.R;
import com.palmpay.lib.webview.cache.WebCache;
import com.palmpay.lib.webview.cache.WebCacheLoader;
import com.palmpay.lib.webview.container.dialog.MoreMenuDialog;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0017J)\u0010%\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&JA\u0010/\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'2\u0014\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b2\u00103J)\u00104\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u00010#H\u0015¢\u0006\u0004\b4\u0010&J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020+H\u0016¢\u0006\u0004\b6\u00107J!\u0010;\u001a\u00020\n2\u0006\u00108\u001a\u00020 2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010\fJ\u000f\u0010>\u001a\u00020\u0007H\u0014¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020\u0007H\u0014¢\u0006\u0004\b?\u0010\u0004J\u000f\u0010@\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010B\u001a\u00020\nH\u0002¢\u0006\u0004\bB\u0010\fJ\u001b\u0010D\u001a\u0004\u0018\u00010\u00182\b\u0010C\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010\u0004J\u0019\u0010I\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JR$\u0010H\u001a\u0004\u0018\u00010K8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bH\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010[\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010]\u001a\u0004\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010\u001a\"\u0004\b`\u0010aR$\u0010b\u001a\u0004\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bb\u0010^\u001a\u0004\bc\u0010\u001a\"\u0004\bd\u0010aR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/palmpay/lib/webview/container/PPWebActivity;", "Landroidx/appcompat/app/o;", "Lcom/palmpay/lib/bridgewrapper/page/IPullRefreshListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "isDelayAddWebView", "()Z", "", "getDelayInitWebViewTime", "()J", "Lcom/palmpay/lib/webview/container/WebViewConfig$Builder;", "builder", "configWebView", "(Lcom/palmpay/lib/webview/container/WebViewConfig$Builder;)V", "setWebTheme", "isDark", "setStatusBarTheme", "(Z)V", "", "getLoadUrl", "()Ljava/lang/String;", "getWebTitle", "isHideTitleBar", "showMenuDialog", ViewProps.ENABLED, "setPullToRefreshEnabled", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "uploadMsg", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onCustomerShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;I)Z", "intent", "handlerCustomerFileChooser", "(ILandroid/content/Intent;)V", "handleFileChooser", "uri", "shouldReceiveValue", "(Landroid/net/Uri;)Z", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "isPending", "onPause", "onResume", "onDestroy", "initView", "checkPullRefresh", "key", "getQueryParameter", "(Ljava/lang/String;)Ljava/lang/String;", "back", "Landroid/view/View;", "titleBar", "applyEdgeToEdge", "(Landroid/view/View;)V", "Lcom/palmpay/lib/ui/titlebar/PpTitleBar;", "Lcom/palmpay/lib/ui/titlebar/PpTitleBar;", "getTitleBar", "()Lcom/palmpay/lib/ui/titlebar/PpTitleBar;", "setTitleBar", "(Lcom/palmpay/lib/ui/titlebar/PpTitleBar;)V", "Lcom/palmpay/lib/webview/container/WebViewConfig;", "mWebViewConfig", "Lcom/palmpay/lib/webview/container/WebViewConfig;", "getMWebViewConfig", "()Lcom/palmpay/lib/webview/container/WebViewConfig;", "setMWebViewConfig", "(Lcom/palmpay/lib/webview/container/WebViewConfig;)V", "Lcom/palmpay/lib/webview/container/dialog/MoreMenuDialog;", "moreMenuDialog", "Lcom/palmpay/lib/webview/container/dialog/MoreMenuDialog;", "mUploadMessageForCustom", "Landroid/webkit/ValueCallback;", "mUrl", "Ljava/lang/String;", "getMUrl", "setMUrl", "(Ljava/lang/String;)V", "mTitle", "getMTitle", "setMTitle", "Landroid/os/Handler;", "mUiHandler$delegate", "Lkotlin/Lazy;", "getMUiHandler", "()Landroid/os/Handler;", "mUiHandler", "Lcom/palmpay/lib/webview/container/WebChromeCallback;", "webChromeCallback", "Lcom/palmpay/lib/webview/container/WebChromeCallback;", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPPWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PPWebActivity.kt\ncom/palmpay/lib/webview/container/PPWebActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,364:1\n1#2:365\n163#3,2:366\n*S KotlinDebug\n*F\n+ 1 PPWebActivity.kt\ncom/palmpay/lib/webview/container/PPWebActivity\n*L\n353#1:366,2\n*E\n"})
public class PPWebActivity extends AbstractActivityC0837o implements IPullRefreshListener {

    @NotNull
    public static final String KEY_WEB_NAV_BAR = "navigationBarHidden";

    @NotNull
    public static final String KEY_WEB_PULL_REFRESH = "pullRefresh";

    @NotNull
    public static final String KEY_WEB_TITLE = "title";

    @NotNull
    public static final String KEY_WEB_URL = "url";
    public static final int REQUEST_CODE_CUSTOMER = 333;

    @Nullable
    private String mTitle;

    @Nullable
    private ValueCallback<Uri[]> mUploadMessageForCustom;

    @Nullable
    private String mUrl;

    @Nullable
    private WebViewConfig mWebViewConfig;

    @Nullable
    private MoreMenuDialog moreMenuDialog;

    @Nullable
    private PpTitleBar titleBar;

    /* JADX INFO: renamed from: mUiHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mUiHandler = C2131j.b(new o(20));

    @NotNull
    private final WebChromeCallback webChromeCallback = new WebChromeCallback() { // from class: com.palmpay.lib.webview.container.PPWebActivity$webChromeCallback$1
        @Override // com.palmpay.lib.webview.container.WebChromeCallback
        public void onReceivedTitle(String title) {
            PpTitleBar titleBar;
            if (!TextUtils.isEmpty(this.this$0.getMTitle()) || (titleBar = this.this$0.getTitleBar()) == null) {
                return;
            }
            titleBar.setTitle(title);
        }

        @Override // com.palmpay.lib.webview.container.WebChromeCallback
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> uploadMsg, WebChromeClient.FileChooserParams fileChooserParams) {
            this.this$0.mUploadMessageForCustom = uploadMsg;
            return this.this$0.onCustomerShowFileChooser(webView, uploadMsg, fileChooserParams, PPWebActivity.REQUEST_CODE_CUSTOMER);
        }
    };

    private final void applyEdgeToEdge(View titleBar) {
        if (titleBar != null) {
            final int paddingTop = titleBar.getPaddingTop();
            final int paddingLeft = titleBar.getPaddingLeft();
            final int paddingRight = titleBar.getPaddingRight();
            final int paddingBottom = titleBar.getPaddingBottom();
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.palmpay.lib.webview.container.a
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final q0 onApplyWindowInsets(View view, q0 q0Var) {
                    return PPWebActivity.applyEdgeToEdge$lambda$13$lambda$12(paddingLeft, paddingTop, paddingRight, paddingBottom, view, q0Var);
                }
            };
            WeakHashMap weakHashMap = N.f16168a;
            E.n(titleBar, onApplyWindowInsetsListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 applyEdgeToEdge$lambda$13$lambda$12(int i7, int i10, int i11, int i12, View view, q0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        e eVarG = insets.f16277a.g(7);
        Intrinsics.checkNotNullExpressionValue(eVarG, "getInsets(...)");
        view.setPadding(i7 + eVarG.f16058a, i10 + eVarG.f16059b, i11 + eVarG.f16060c, i12);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void back() {
        if (isPending()) {
            return;
        }
        WebViewConfig webViewConfig = this.mWebViewConfig;
        if (webViewConfig == null || !webViewConfig.isBack()) {
            super.onBackPressed();
        }
    }

    private final boolean checkPullRefresh() {
        String queryParameter = getQueryParameter(KEY_WEB_PULL_REFRESH);
        boolean z3 = TextUtils.isEmpty(queryParameter) || "true".equals(queryParameter);
        if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(this.mUrl)) {
            try {
                Uri uri = Uri.parse(this.mUrl);
                String queryParameter2 = uri != null ? uri.getQueryParameter(KEY_WEB_PULL_REFRESH) : null;
                return TextUtils.isEmpty(queryParameter2) || "true".equals(queryParameter2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return z3;
    }

    private final Handler getMUiHandler() {
        return (Handler) this.mUiHandler.getValue();
    }

    private final String getQueryParameter(String key) {
        Uri data;
        Intent intent = getIntent();
        if (intent == null || TextUtils.isEmpty(key)) {
            return null;
        }
        String stringExtra = getIntent().getStringExtra(key);
        return (!TextUtils.isEmpty(stringExtra) || (data = intent.getData()) == null) ? stringExtra : data.getQueryParameter(key);
    }

    private final void initView() {
        ImageView leftImageView;
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(R.id.pp_title_bar);
        this.titleBar = ppTitleBar;
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.palmpay.lib.webview.container.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PPWebActivity f24644b;

                {
                    this.f24644b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f24644b.back();
                            break;
                        case 1:
                            this.f24644b.finish();
                            break;
                        default:
                            this.f24644b.showMenuDialog();
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar2 = this.titleBar;
        if (ppTitleBar2 != null && (leftImageView = ppTitleBar2.getLeftImageView()) != null) {
            final int i10 = 1;
            leftImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.palmpay.lib.webview.container.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PPWebActivity f24644b;

                {
                    this.f24644b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f24644b.back();
                            break;
                        case 1:
                            this.f24644b.finish();
                            break;
                        default:
                            this.f24644b.showMenuDialog();
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar3 = this.titleBar;
        if (ppTitleBar3 != null) {
            final int i11 = 2;
            ppTitleBar3.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: com.palmpay.lib.webview.container.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PPWebActivity f24644b;

                {
                    this.f24644b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f24644b.back();
                            break;
                        case 1:
                            this.f24644b.finish();
                            break;
                        default:
                            this.f24644b.showMenuDialog();
                            break;
                    }
                }
            });
        }
        if (isHideTitleBar()) {
            PpTitleBar ppTitleBar4 = this.titleBar;
            if (ppTitleBar4 != null) {
                ppTitleBar4.setVisibility(8);
                return;
            }
            return;
        }
        PpTitleBar ppTitleBar5 = this.titleBar;
        if (ppTitleBar5 != null) {
            ppTitleBar5.setVisibility(0);
        }
        PpTitleBar ppTitleBar6 = this.titleBar;
        if (ppTitleBar6 != null) {
            ppTitleBar6.setTitle(this.mTitle);
        }
        applyEdgeToEdge(findViewById(R.id.pp_title_container));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mUiHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(PPWebActivity pPWebActivity, WebViewConfig.Builder builder) {
        pPWebActivity.getMUiHandler().postDelayed(new b(pPWebActivity, builder, 0), pPWebActivity.getDelayInitWebViewTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$5(PPWebActivity pPWebActivity, WebViewConfig.Builder builder) {
        Intrinsics.e(builder);
        pPWebActivity.configWebView(builder);
        String str = pPWebActivity.mUrl;
        pPWebActivity.mWebViewConfig = str != null ? builder.loadUrl(str) : builder.get();
    }

    public void configWebView(@NotNull WebViewConfig.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public long getDelayInitWebViewTime() {
        return 0L;
    }

    @Nullable
    public String getLoadUrl() {
        String stringExtra = getIntent().getStringExtra("url");
        Uri data = getIntent().getData();
        return (data == null || !TextUtils.isEmpty(stringExtra)) ? stringExtra : data.getQueryParameter("url");
    }

    @Nullable
    public final String getMTitle() {
        return this.mTitle;
    }

    @Nullable
    public final String getMUrl() {
        return this.mUrl;
    }

    @Nullable
    public final WebViewConfig getMWebViewConfig() {
        return this.mWebViewConfig;
    }

    @Nullable
    public final PpTitleBar getTitleBar() {
        return this.titleBar;
    }

    @Nullable
    public String getWebTitle() {
        String queryParameter = getQueryParameter("title");
        if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(this.mUrl)) {
            try {
                return Uri.parse(this.mUrl).getQueryParameter("title");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return queryParameter;
    }

    @SuppressLint({"NewApi"})
    public void handleFileChooser(int requestCode, int resultCode, @Nullable Intent intent) {
        if (333 != requestCode) {
            WebViewConfig webViewConfig = this.mWebViewConfig;
            if (webViewConfig != null) {
                webViewConfig.handleFileChooser(requestCode, resultCode, intent);
                return;
            }
            return;
        }
        if (this.mUploadMessageForCustom == null) {
            return;
        }
        handlerCustomerFileChooser(resultCode, intent);
        Uri data = (intent == null || resultCode != -1) ? null : intent.getData();
        if (data == null || !shouldReceiveValue(data)) {
            ValueCallback<Uri[]> valueCallback = this.mUploadMessageForCustom;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(new Uri[0]);
            }
        } else {
            ValueCallback<Uri[]> valueCallback2 = this.mUploadMessageForCustom;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(new Uri[]{data});
            }
        }
        this.mUploadMessageForCustom = null;
    }

    public void handlerCustomerFileChooser(int resultCode, @Nullable Intent intent) {
    }

    public boolean isDelayAddWebView() {
        return false;
    }

    public boolean isHideTitleBar() {
        String queryParameter = getQueryParameter(KEY_WEB_NAV_BAR);
        boolean z3 = TextUtils.isEmpty(queryParameter) || "true".equals(queryParameter);
        if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(this.mUrl)) {
            try {
                Uri uri = Uri.parse(this.mUrl);
                String queryParameter2 = uri != null ? uri.getQueryParameter(KEY_WEB_NAV_BAR) : null;
                return TextUtils.isEmpty(queryParameter2) || "true".equals(queryParameter2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return z3;
    }

    public boolean isPending() {
        return false;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        handleFileChooser(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    @RequiresApi(23)
    public void onCreate(@Nullable Bundle savedInstanceState) {
        PPWebActivity pPWebActivity;
        WebCacheLoader webCacheLoaderStartLoader$default;
        View decorView;
        androidx.activity.o.a(this);
        super.onCreate(savedInstanceState);
        setWebTheme();
        String loadUrl = getLoadUrl();
        this.mUrl = loadUrl;
        if (loadUrl != null) {
            pPWebActivity = this;
            webCacheLoaderStartLoader$default = WebCache.startLoader$default(WebCache.INSTANCE, loadUrl, pPWebActivity, false, 4, null);
        } else {
            pPWebActivity = this;
            webCacheLoaderStartLoader$default = null;
        }
        pPWebActivity.mTitle = getWebTitle();
        setContentView(R.layout.lib_web_page);
        initView();
        View viewFindViewById = findViewById(R.id.ll_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        WebViewConfig.Builder builderWith = WebViewConfig.with(this);
        builderWith.setWebParent((LinearLayout) viewFindViewById, 1, new LinearLayout.LayoutParams(-1, -1)).useWebProgress(getColor(L6.b.ppColorPrimary)).setWebChromeCallback(pPWebActivity.webChromeCallback);
        if (webCacheLoaderStartLoader$default != null) {
            builderWith.setCacheLoader(webCacheLoaderStartLoader$default);
        }
        builderWith.setPullRefresh(checkPullRefresh());
        if (isDelayAddWebView()) {
            Window window = getWindow();
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.post(new b(this, builderWith, 1));
            return;
        }
        configWebView(builderWith);
        String str = pPWebActivity.mUrl;
        if (str != null) {
            pPWebActivity.mWebViewConfig = builderWith.loadUrl(str);
        } else {
            pPWebActivity.mWebViewConfig = builderWith.get();
        }
    }

    public boolean onCustomerShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> uploadMsg, @Nullable WebChromeClient.FileChooserParams fileChooserParams, int requestCode) {
        return false;
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        MoreMenuDialog moreMenuDialog;
        getMUiHandler().removeCallbacksAndMessages(null);
        MoreMenuDialog moreMenuDialog2 = this.moreMenuDialog;
        if (moreMenuDialog2 != null && true == moreMenuDialog2.isShowing() && (moreMenuDialog = this.moreMenuDialog) != null) {
            moreMenuDialog.dismiss();
        }
        WebViewConfig webViewConfig = this.mWebViewConfig;
        if (webViewConfig != null) {
            webViewConfig.onDestroy();
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        WebViewConfig webViewConfig;
        if ((keyCode == 4 && isPending()) || ((webViewConfig = this.mWebViewConfig) != null && webViewConfig.handleKeyEvent(keyCode, event))) {
            return true;
        }
        if (keyCode == 4) {
            supportFinishAfterTransition();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onPause() {
        super.onPause();
        WebViewConfig webViewConfig = this.mWebViewConfig;
        if (webViewConfig != null) {
            webViewConfig.onPause();
        }
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onResume() {
        super.onResume();
        WebViewConfig webViewConfig = this.mWebViewConfig;
        if (webViewConfig != null) {
            webViewConfig.onResume();
        }
    }

    public final void setMTitle(@Nullable String str) {
        this.mTitle = str;
    }

    public final void setMUrl(@Nullable String str) {
        this.mUrl = str;
    }

    public final void setMWebViewConfig(@Nullable WebViewConfig webViewConfig) {
        this.mWebViewConfig = webViewConfig;
    }

    @Override // com.palmpay.lib.bridgewrapper.page.IPullRefreshListener
    public void setPullToRefreshEnabled(boolean enabled) {
        WebViewConfig webViewConfig = this.mWebViewConfig;
        if (webViewConfig != null) {
            webViewConfig.setPullToRefreshEnabled(enabled);
        }
    }

    public void setStatusBarTheme(boolean isDark) {
        View decorView;
        int iIntValue;
        View decorView2;
        Window window = getWindow();
        Integer numValueOf = null;
        Integer numValueOf2 = (window == null || (decorView2 = window.getDecorView()) == null) ? null : Integer.valueOf(decorView2.getSystemUiVisibility());
        Window window2 = getWindow();
        if (window2 == null || (decorView = window2.getDecorView()) == null) {
            return;
        }
        if (isDark) {
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue() | UserMetadata.MAX_INTERNAL_KEY_SIZE;
                numValueOf = Integer.valueOf(iIntValue);
            }
        } else if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue() & (-8193);
            numValueOf = Integer.valueOf(iIntValue);
        }
        Intrinsics.e(numValueOf);
        decorView.setSystemUiVisibility(numValueOf.intValue());
    }

    public final void setTitleBar(@Nullable PpTitleBar ppTitleBar) {
        this.titleBar = ppTitleBar;
    }

    @SuppressLint({"NewApi"})
    public void setWebTheme() {
        setStatusBarTheme(true);
    }

    public boolean shouldReceiveValue(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return true;
    }

    public void showMenuDialog() {
        MoreMenuDialog moreMenuDialog;
        if (this.moreMenuDialog == null) {
            this.moreMenuDialog = new MoreMenuDialog(this, this.mWebViewConfig);
        }
        MoreMenuDialog moreMenuDialog2 = this.moreMenuDialog;
        if (moreMenuDialog2 == null || moreMenuDialog2.isShowing() || (moreMenuDialog = this.moreMenuDialog) == null) {
            return;
        }
        moreMenuDialog.show();
    }
}
