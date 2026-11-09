package com.palmpay.lib.webview.container.dialog;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.camera.core.impl.utils.n;
import com.palmpay.lib.webview.R;
import com.palmpay.lib.webview.container.WebViewConfig;
import com.palmpay.lib.webview.container.dialog.MoreMenuDialog;
import com.palmpay.lib.webview.databinding.LibWebMoreDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0015J\u001a\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/webview/container/dialog/MoreMenuDialog;", "Lcom/palmpay/lib/webview/container/dialog/BindingBottomSheetDialog;", "Lcom/palmpay/lib/webview/databinding/LibWebMoreDialogBinding;", "context", "Landroid/content/Context;", "webViewConfig", "Lcom/palmpay/lib/webview/container/WebViewConfig;", "<init>", "(Landroid/content/Context;Lcom/palmpay/lib/webview/container/WebViewConfig;)V", "onCreateViewBinding", "initView", "", "binding", "openBrowser", "url", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoreMenuDialog extends BindingBottomSheetDialog<LibWebMoreDialogBinding> {

    @Nullable
    private final WebViewConfig webViewConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreMenuDialog(@NotNull Context context, @Nullable WebViewConfig webViewConfig) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewConfig = webViewConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MoreMenuDialog moreMenuDialog, View view) {
        WebView webView;
        String url;
        WebViewConfig webViewConfig = moreMenuDialog.webViewConfig;
        if (webViewConfig == null || (webView = webViewConfig.getWebView()) == null || (url = webView.getUrl()) == null) {
            return;
        }
        Object systemService = moreMenuDialog.getContext().getApplicationContext().getSystemService("clipboard");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("webUrl", url));
        n.v(R.string.web_copy_successful);
        moreMenuDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MoreMenuDialog moreMenuDialog, View view) {
        WebViewConfig webViewConfig = moreMenuDialog.webViewConfig;
        if (webViewConfig != null) {
            webViewConfig.reload();
        }
        moreMenuDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(MoreMenuDialog moreMenuDialog, View view) {
        WebView webView;
        Context context = moreMenuDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WebViewConfig webViewConfig = moreMenuDialog.webViewConfig;
        moreMenuDialog.openBrowser(context, (webViewConfig == null || (webView = webViewConfig.getWebView()) == null) ? null : webView.getUrl());
        moreMenuDialog.dismiss();
    }

    private final void openBrowser(Context context, String url) {
        if (url != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(url));
                intent.addFlags(268435456);
                context.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.palmpay.lib.webview.container.dialog.BindingBottomSheetDialog
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void initView(@NotNull LibWebMoreDialogBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        n.s((Application) getContext().getApplicationContext());
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.lib_web_icon_copy_link);
        Drawable drawable2 = getContext().getResources().getDrawable(R.drawable.lib_web_icon_reload);
        Drawable drawable3 = getContext().getResources().getDrawable(R.drawable.lib_web_icon_browser);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.more_menu_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        drawable3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        binding.copyBtn.setCompoundDrawables(null, drawable, null, null);
        binding.refreshBtn.setCompoundDrawables(null, drawable2, null, null);
        binding.openBrowserBtn.setCompoundDrawables(null, drawable3, null, null);
        final int i7 = 0;
        binding.copyBtn.setOnClickListener(new View.OnClickListener(this) { // from class: j7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreMenuDialog f38331b;

            {
                this.f38331b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        MoreMenuDialog.initView$lambda$1(this.f38331b, view);
                        break;
                    case 1:
                        MoreMenuDialog.initView$lambda$2(this.f38331b, view);
                        break;
                    case 2:
                        MoreMenuDialog.initView$lambda$3(this.f38331b, view);
                        break;
                    default:
                        this.f38331b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        binding.refreshBtn.setOnClickListener(new View.OnClickListener(this) { // from class: j7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreMenuDialog f38331b;

            {
                this.f38331b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        MoreMenuDialog.initView$lambda$1(this.f38331b, view);
                        break;
                    case 1:
                        MoreMenuDialog.initView$lambda$2(this.f38331b, view);
                        break;
                    case 2:
                        MoreMenuDialog.initView$lambda$3(this.f38331b, view);
                        break;
                    default:
                        this.f38331b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 2;
        binding.openBrowserBtn.setOnClickListener(new View.OnClickListener(this) { // from class: j7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreMenuDialog f38331b;

            {
                this.f38331b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        MoreMenuDialog.initView$lambda$1(this.f38331b, view);
                        break;
                    case 1:
                        MoreMenuDialog.initView$lambda$2(this.f38331b, view);
                        break;
                    case 2:
                        MoreMenuDialog.initView$lambda$3(this.f38331b, view);
                        break;
                    default:
                        this.f38331b.dismiss();
                        break;
                }
            }
        });
        final int i12 = 3;
        binding.cancelBtn.setOnClickListener(new View.OnClickListener(this) { // from class: j7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreMenuDialog f38331b;

            {
                this.f38331b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        MoreMenuDialog.initView$lambda$1(this.f38331b, view);
                        break;
                    case 1:
                        MoreMenuDialog.initView$lambda$2(this.f38331b, view);
                        break;
                    case 2:
                        MoreMenuDialog.initView$lambda$3(this.f38331b, view);
                        break;
                    default:
                        this.f38331b.dismiss();
                        break;
                }
            }
        });
    }

    @Override // com.palmpay.lib.webview.container.dialog.BindingBottomSheetDialog
    @Nullable
    public LibWebMoreDialogBinding onCreateViewBinding() {
        return LibWebMoreDialogBinding.inflate(getLayoutInflater());
    }
}
