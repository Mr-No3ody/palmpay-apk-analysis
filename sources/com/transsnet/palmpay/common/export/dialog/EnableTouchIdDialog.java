package com.transsnet.palmpay.common.export.dialog;

import N9.c;
import N9.d;
import Pa.n0;
import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/common/export/dialog/EnableTouchIdDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/common/export/dialog/EnableTouchIdDialog$OnEnableTouchIdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnEnableTouchIdListener", "(Lcom/transsnet/palmpay/common/export/dialog/EnableTouchIdDialog$OnEnableTouchIdListener;)Lcom/transsnet/palmpay/common/export/dialog/EnableTouchIdDialog;", "show", "animateSuccess", "Landroid/view/View;", "g_touch_id", "Landroid/view/View;", "g_enable_success", "Lcom/airbnb/lottie/LottieAnimationView;", "loadingAnim", "Lcom/airbnb/lottie/LottieAnimationView;", "Lcom/transsnet/palmpay/common/export/dialog/EnableTouchIdDialog$OnEnableTouchIdListener;", "", "", "kotlin.jvm.PlatformType", "params", "Ljava/util/Map;", "OnEnableTouchIdListener", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnableTouchIdDialog extends b {

    @Nullable
    private View g_enable_success;

    @Nullable
    private View g_touch_id;

    @Nullable
    private OnEnableTouchIdListener listener;

    @Nullable
    private LottieAnimationView loadingAnim;

    @NotNull
    private final Map<String, String> params;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/common/export/dialog/EnableTouchIdDialog$OnEnableTouchIdListener;", "", "onEnableClick", "", "v", "Landroid/view/View;", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnEnableTouchIdListener {
        void onEnableClick(@NotNull View v3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableTouchIdDialog(@NotNull Context context) {
        super(context, d.cm_dialog_enable_touch_id);
        Intrinsics.checkNotNullParameter(context, "context");
        this.params = G.g(new Pair("memberid", C0.G.k()), new Pair("functionType", "1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(EnableTouchIdDialog enableTouchIdDialog, View view) {
        n0.g().n("ResultPage_FunctionGuideClose_Click", enableTouchIdDialog.params);
        enableTouchIdDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(EnableTouchIdDialog enableTouchIdDialog, View view) {
        n0.g().n("ResultPage_FunctionGuideLater_Click", enableTouchIdDialog.params);
        enableTouchIdDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(EnableTouchIdDialog enableTouchIdDialog, View view) {
        n0.g().n("ResultPage_FunctionGuideEnable_Click", enableTouchIdDialog.params);
        OnEnableTouchIdListener onEnableTouchIdListener = enableTouchIdDialog.listener;
        if (onEnableTouchIdListener != null) {
            Intrinsics.e(view);
            onEnableTouchIdListener.onEnableClick(view);
        }
    }

    public final void animateSuccess() {
        View view = this.g_touch_id;
        if (view != null) {
            h.c(view);
        }
        View view2 = this.g_enable_success;
        if (view2 != null) {
            h.C(view2);
        }
        LottieAnimationView lottieAnimationView = this.loadingAnim;
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setAnimation(u.cv_result_success);
            lottieAnimationView.e();
        }
        n0.g().w("ResultPage_FunctionGuideSuccess_Click", this.params);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        this.g_touch_id = findViewById(c.g_touch_id);
        this.g_enable_success = findViewById(c.g_enable_success);
        this.loadingAnim = (LottieAnimationView) findViewById(c.loadingAnim);
        final int i7 = 0;
        findViewById(c.btn_close).setOnClickListener(new View.OnClickListener(this) { // from class: P9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableTouchIdDialog f7004b;

            {
                this.f7004b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        EnableTouchIdDialog.initViews$lambda$0(this.f7004b, view);
                        break;
                    case 1:
                        EnableTouchIdDialog.initViews$lambda$1(this.f7004b, view);
                        break;
                    default:
                        EnableTouchIdDialog.initViews$lambda$2(this.f7004b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        findViewById(c.btn_later).setOnClickListener(new View.OnClickListener(this) { // from class: P9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableTouchIdDialog f7004b;

            {
                this.f7004b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        EnableTouchIdDialog.initViews$lambda$0(this.f7004b, view);
                        break;
                    case 1:
                        EnableTouchIdDialog.initViews$lambda$1(this.f7004b, view);
                        break;
                    default:
                        EnableTouchIdDialog.initViews$lambda$2(this.f7004b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        findViewById(c.btn_enbale).setOnClickListener(new View.OnClickListener(this) { // from class: P9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableTouchIdDialog f7004b;

            {
                this.f7004b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        EnableTouchIdDialog.initViews$lambda$0(this.f7004b, view);
                        break;
                    case 1:
                        EnableTouchIdDialog.initViews$lambda$1(this.f7004b, view);
                        break;
                    default:
                        EnableTouchIdDialog.initViews$lambda$2(this.f7004b, view);
                        break;
                }
            }
        });
    }

    @NotNull
    public final EnableTouchIdDialog setOnEnableTouchIdListener(@NotNull OnEnableTouchIdListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        n0.g().w("ResultPage_FunctionGuide_View", this.params);
        super.show();
    }
}
