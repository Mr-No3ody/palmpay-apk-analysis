package com.transsnet.palmpay.common.export.view;

import Bc.C0108e;
import L6.b;
import M3.f;
import N9.d;
import N9.e;
import Pa.b0;
import Q9.c;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/common/export/view/NetworkNotConnectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubTitle", "message", "setTopMessage", "setMessage", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setRefreshListener", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "getRefreshListener", "()Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Landroid/view/View$OnClickListener;", "setSettingClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/net/ConnectivityManager;", "f", "Lkotlin/Lazy;", "getConnectManager", "()Landroid/net/ConnectivityManager;", "connectManager", "LQ9/c;", "g", "getMNetworkCallback", "()LQ9/c;", "mNetworkCallback", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkNotConnectView extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f27120i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ObjectAnimator f27121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0108e f27123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CompleteCallback f27124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View.OnClickListener f27125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f27126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f27127g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NetworkNotConnectView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ConnectivityManager getConnectManager() {
        return (ConnectivityManager) this.f27126f.getValue();
    }

    private final c getMNetworkCallback() {
        return (c) this.f27127g.getValue();
    }

    @Override // android.view.ViewGroup
    public final void detachAllViewsFromParent() {
        super.detachAllViewsFromParent();
        try {
            ObjectAnimator objectAnimator = this.f27121a;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.f27121a = null;
        } catch (Exception unused) {
        }
    }

    @Nullable
    public final CompleteCallback<Boolean> getRefreshListener() {
        return this.f27124d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConnectManager().registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), getMNetworkCallback());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getConnectManager().unregisterNetworkCallback(getMNetworkCallback());
    }

    public final void setMessage(@Nullable CharSequence message) {
        TextView textView;
        C0108e c0108e = this.f27123c;
        if (c0108e == null || (textView = c0108e.f685b) == null) {
            return;
        }
        textView.setText(message);
    }

    public final void setRefreshListener(@NotNull CompleteCallback<Boolean> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f27124d = listener;
    }

    public final void setSettingClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f27125e = listener;
    }

    public final void setSubTitle(@Nullable CharSequence title) {
        TextView textView;
        C0108e c0108e = this.f27123c;
        if (c0108e == null || (textView = (TextView) c0108e.f693o) == null) {
            return;
        }
        textView.setText(title);
    }

    public final void setTitle(@Nullable CharSequence title) {
        PpTitleBar ppTitleBar;
        PpTitleBar ppTitleBar2;
        C0108e c0108e = this.f27123c;
        if (c0108e != null && (ppTitleBar2 = (PpTitleBar) c0108e.f690g) != null) {
            ppTitleBar2.setTitle(title);
        }
        C0108e c0108e2 = this.f27123c;
        if (c0108e2 == null || (ppTitleBar = (PpTitleBar) c0108e2.f690g) == null) {
            return;
        }
        h.s(ppTitleBar, !TextUtils.isEmpty(title));
    }

    public final void setTopMessage(@Nullable CharSequence message) {
        TextView textView;
        C0108e c0108e = this.f27123c;
        if (c0108e == null || (textView = (TextView) c0108e.f694p) == null) {
            return;
        }
        textView.setText(message);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NetworkNotConnectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NetworkNotConnectView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NetworkNotConnectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        TextView tvTitle;
        ImageView backImageView;
        C0108e c0108e;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27126f = C2131j.b(new b0(4));
        this.f27127g = C2131j.b(new f(this, 14));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.CmNetworkNotConnectView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        CharSequence text = typedArrayObtainStyledAttributes.getText(e.CmNetworkNotConnectView_android_title);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(e.CmNetworkNotConnectView_android_title);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(e.CmNetworkNotConnectView_android_summary);
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(e.CmNetworkNotConnectView_cmTopMessage);
        this.f27122b = typedArrayObtainStyledAttributes.getBoolean(e.CmNetworkNotConnectView_cmAutoRefresh, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(e.CmNetworkNotConnectView_cmShowBack, false);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(e.CmNetworkNotConnectView_cmIncludeStatusBar, false);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), d.cm_layout_not_network, this);
        setBackgroundResource(b.ppColorBackgroundLight);
        int i10 = N9.c.ivCenter;
        if (((AppCompatImageView) a.m(i10, this)) != null) {
            i10 = N9.c.ivRefresh;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i10, this);
            if (iconicsImageView != null) {
                i10 = N9.c.statusBarView;
                StatusBarView statusBarView = (StatusBarView) a.m(i10, this);
                if (statusBarView != null) {
                    i10 = N9.c.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) a.m(i10, this);
                    if (ppTitleBar != null) {
                        i10 = N9.c.topBarrier;
                        if (((Barrier) a.m(i10, this)) != null) {
                            i10 = N9.c.tvAction;
                            PpButton ppButton = (PpButton) a.m(i10, this);
                            if (ppButton != null) {
                                i10 = N9.c.tvMessage;
                                TextView textView = (TextView) a.m(i10, this);
                                if (textView != null) {
                                    i10 = N9.c.tvRefresh;
                                    TextView textView2 = (TextView) a.m(i10, this);
                                    if (textView2 != null) {
                                        i10 = N9.c.tvSettings;
                                        PpButton ppButton2 = (PpButton) a.m(i10, this);
                                        if (ppButton2 != null) {
                                            i10 = N9.c.tvTitle;
                                            TextView textView3 = (TextView) a.m(i10, this);
                                            if (textView3 != null) {
                                                i10 = N9.c.tvTopMessage;
                                                TextView textView4 = (TextView) a.m(i10, this);
                                                if (textView4 != null) {
                                                    this.f27123c = new C0108e(this, iconicsImageView, statusBarView, ppTitleBar, ppButton, textView, textView2, ppButton2, textView3, textView4, 4);
                                                    setTitle(text);
                                                    if (z3) {
                                                        C0108e c0108e2 = this.f27123c;
                                                        if (c0108e2 != null) {
                                                            h.s((PpTitleBar) c0108e2.f690g, true);
                                                        }
                                                    } else {
                                                        C0108e c0108e3 = this.f27123c;
                                                        if (c0108e3 != null && (backImageView = ((PpTitleBar) c0108e3.f690g).getBackImageView()) != null) {
                                                            h.c(backImageView);
                                                        }
                                                        C0108e c0108e4 = this.f27123c;
                                                        if (c0108e4 != null && (tvTitle = ((PpTitleBar) c0108e4.f690g).getTvTitle()) != null) {
                                                            tvTitle.setPadding(CommonViewExtKt.getDp(16), 0, 0, 0);
                                                        }
                                                    }
                                                    if (TextUtils.isEmpty(text2)) {
                                                        C0108e c0108e5 = this.f27123c;
                                                        if (c0108e5 != null) {
                                                            ((TextView) c0108e5.f693o).setText("No Network Connection");
                                                        }
                                                    } else {
                                                        C0108e c0108e6 = this.f27123c;
                                                        if (c0108e6 != null) {
                                                            ((TextView) c0108e6.f693o).setText(text2);
                                                        }
                                                    }
                                                    if (z8 && (c0108e = this.f27123c) != null) {
                                                        h.s((StatusBarView) c0108e.f689f, true);
                                                    }
                                                    if (TextUtils.isEmpty(text3)) {
                                                        C0108e c0108e7 = this.f27123c;
                                                        if (c0108e7 != null) {
                                                            c0108e7.f685b.setText("Please check your network settings");
                                                        }
                                                    } else {
                                                        C0108e c0108e8 = this.f27123c;
                                                        if (c0108e8 != null) {
                                                            c0108e8.f685b.setText(text3);
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(text4)) {
                                                        setTopMessage(text4);
                                                    }
                                                    C0108e c0108e9 = this.f27123c;
                                                    if (c0108e9 != null) {
                                                        final int i11 = 0;
                                                        c0108e9.f686c.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ NetworkNotConnectView f7644b;

                                                            {
                                                                this.f7644b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                NetworkNotConnectView networkNotConnectView = this.f7644b;
                                                                switch (i11) {
                                                                    case 0:
                                                                        C0108e c0108e10 = networkNotConnectView.f27123c;
                                                                        View view2 = c0108e10 != null ? (IconicsImageView) c0108e10.f688e : null;
                                                                        ObjectAnimator objectAnimator = networkNotConnectView.f27121a;
                                                                        if (objectAnimator != null) {
                                                                            objectAnimator.cancel();
                                                                        }
                                                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, ViewProps.ROTATION, 0.0f, 360.0f);
                                                                        networkNotConnectView.f27121a = objectAnimatorOfFloat;
                                                                        if (objectAnimatorOfFloat != null) {
                                                                            objectAnimatorOfFloat.setDuration(1000L);
                                                                            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                                                            objectAnimatorOfFloat.setRepeatMode(1);
                                                                            objectAnimatorOfFloat.setRepeatCount(1);
                                                                            objectAnimatorOfFloat.start();
                                                                        }
                                                                        CompleteCallback completeCallback = networkNotConnectView.f27124d;
                                                                        if (completeCallback != null) {
                                                                            completeCallback.onComplete(Boolean.FALSE);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        View.OnClickListener onClickListener = networkNotConnectView.f27125e;
                                                                        if (onClickListener != null) {
                                                                            C0108e c0108e11 = networkNotConnectView.f27123c;
                                                                            onClickListener.onClick(c0108e11 != null ? (PpButton) c0108e11.f692j : null);
                                                                        } else {
                                                                            try {
                                                                                Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                                                                                intent.addFlags(268435456);
                                                                                Context context2 = networkNotConnectView.getContext();
                                                                                if (context2 != null) {
                                                                                    context2.startActivity(intent);
                                                                                    Unit unit = Unit.f38893a;
                                                                                }
                                                                            } catch (Exception unused) {
                                                                                Intent intent2 = new Intent("android.settings.SETTINGS");
                                                                                intent2.addFlags(268435456);
                                                                                ActivityUtils.startActivity(intent2);
                                                                                Unit unit2 = Unit.f38893a;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                    C0108e c0108e10 = this.f27123c;
                                                    if (c0108e10 != null) {
                                                        final int i12 = 1;
                                                        ((PpButton) c0108e10.f692j).setOnClickListener(new View.OnClickListener(this) { // from class: Q9.a

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ NetworkNotConnectView f7644b;

                                                            {
                                                                this.f7644b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                NetworkNotConnectView networkNotConnectView = this.f7644b;
                                                                switch (i12) {
                                                                    case 0:
                                                                        C0108e c0108e11 = networkNotConnectView.f27123c;
                                                                        View view2 = c0108e11 != null ? (IconicsImageView) c0108e11.f688e : null;
                                                                        ObjectAnimator objectAnimator = networkNotConnectView.f27121a;
                                                                        if (objectAnimator != null) {
                                                                            objectAnimator.cancel();
                                                                        }
                                                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, ViewProps.ROTATION, 0.0f, 360.0f);
                                                                        networkNotConnectView.f27121a = objectAnimatorOfFloat;
                                                                        if (objectAnimatorOfFloat != null) {
                                                                            objectAnimatorOfFloat.setDuration(1000L);
                                                                            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                                                            objectAnimatorOfFloat.setRepeatMode(1);
                                                                            objectAnimatorOfFloat.setRepeatCount(1);
                                                                            objectAnimatorOfFloat.start();
                                                                        }
                                                                        CompleteCallback completeCallback = networkNotConnectView.f27124d;
                                                                        if (completeCallback != null) {
                                                                            completeCallback.onComplete(Boolean.FALSE);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        View.OnClickListener onClickListener = networkNotConnectView.f27125e;
                                                                        if (onClickListener != null) {
                                                                            C0108e c0108e12 = networkNotConnectView.f27123c;
                                                                            onClickListener.onClick(c0108e12 != null ? (PpButton) c0108e12.f692j : null);
                                                                        } else {
                                                                            try {
                                                                                Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                                                                                intent.addFlags(268435456);
                                                                                Context context2 = networkNotConnectView.getContext();
                                                                                if (context2 != null) {
                                                                                    context2.startActivity(intent);
                                                                                    Unit unit = Unit.f38893a;
                                                                                }
                                                                            } catch (Exception unused) {
                                                                                Intent intent2 = new Intent("android.settings.SETTINGS");
                                                                                intent2.addFlags(268435456);
                                                                                ActivityUtils.startActivity(intent2);
                                                                                Unit unit2 = Unit.f38893a;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }
}
