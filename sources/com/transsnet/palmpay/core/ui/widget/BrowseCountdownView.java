package com.transsnet.palmpay.core.ui.widget;

import Wf.t0;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.fragment.app.E;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/BrowseCountdownView;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/E;", "getActivityFromView", "()Landroidx/fragment/app/E;", "Landroid/widget/TextView;", "c", "Lkotlin/Lazy;", "getTv_browse_second", "()Landroid/widget/TextView;", "tv_browse_second", "Landroidx/appcompat/widget/AppCompatSeekBar;", "d", "getProgress_bar_second", "()Landroidx/appcompat/widget/AppCompatSeekBar;", "progress_bar_second", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrowseCountdownView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowseCountdownView.kt\ncom/transsnet/palmpay/core/ui/widget/BrowseCountdownView\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,198:1\n116#2:199\n*S KotlinDebug\n*F\n+ 1 BrowseCountdownView.kt\ncom/transsnet/palmpay/core/ui/widget/BrowseCountdownView\n*L\n174#1:199\n*E\n"})
public final class BrowseCountdownView extends BaseConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28106i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f28110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28111g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BrowseCountdownView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E getActivityFromView() {
        Context context = getContext();
        if (context instanceof E) {
            return (E) context;
        }
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null ? true : topActivity instanceof E) {
            return (E) topActivity;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatSeekBar getProgress_bar_second() {
        Object value = this.f28108d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppCompatSeekBar) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTv_browse_second() {
        Object value = this.f28107c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void f(Integer num, String str) {
        if ((num != null ? num.intValue() : 0) <= 0) {
            return;
        }
        this.f28111g = str;
        int iIntValue = num != null ? num.intValue() : 15;
        getProgress_bar_second().setMax(iIntValue);
        this.f28110f = org.chromium.support_lib_boundary.util.b.r(V.f(this), ((long) iIntValue) * ((long) 1000), null, new Oa.f(this, null), new Oa.g(this, iIntValue, null), 14);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28109e = true;
        t0 t0Var = this.f28110f;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BrowseCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BrowseCountdownView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BrowseCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28107c = C2131j.b(new Function0(this) { // from class: Oa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrowseCountdownView f6686b;

            {
                this.f6686b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BrowseCountdownView browseCountdownView = this.f6686b;
                switch (i10) {
                    case 0:
                        int i11 = BrowseCountdownView.f28106i;
                        return (TextView) browseCountdownView.findViewById(p025ba.e.tv_browse_second);
                    default:
                        int i12 = BrowseCountdownView.f28106i;
                        return (AppCompatSeekBar) browseCountdownView.findViewById(p025ba.e.progress_bar_second);
                }
            }
        });
        final int i11 = 1;
        this.f28108d = C2131j.b(new Function0(this) { // from class: Oa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrowseCountdownView f6686b;

            {
                this.f6686b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BrowseCountdownView browseCountdownView = this.f6686b;
                switch (i11) {
                    case 0:
                        int i12 = BrowseCountdownView.f28106i;
                        return (TextView) browseCountdownView.findViewById(p025ba.e.tv_browse_second);
                    default:
                        int i13 = BrowseCountdownView.f28106i;
                        return (AppCompatSeekBar) browseCountdownView.findViewById(p025ba.e.progress_bar_second);
                }
            }
        });
        View.inflate(context, p025ba.g.core_layout_browse_countdown, this);
        getProgress_bar_second().setEnabled(false);
    }
}
