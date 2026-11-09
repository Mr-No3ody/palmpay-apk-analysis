package com.transsnet.palmpay.credit.ui.view;

import L6.b;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeTextView;
import com.transsnet.palmpay.credit.bean.NotifyInfo;
import com.transsnet.palmpay.credit.ui.view.NotifyInfoView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p116hb.d;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/NotifyInfoView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeTextView;", "a", "Lkotlin/Lazy;", "getTvNotifyContent", "()Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeTextView;", "tvNotifyContent", "Landroid/widget/ImageView;", "b", "getIvIcon", "()Landroid/widget/ImageView;", "ivIcon", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotifyInfoView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30645c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30647b;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyInfoView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30646a = C2131j.b(new Function0(this) { // from class: Cb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotifyInfoView f1348b;

            {
                this.f1348b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NotifyInfoView notifyInfoView = this.f1348b;
                switch (i7) {
                    case 0:
                        int i10 = NotifyInfoView.f30645c;
                        return (MarqueeTextView) notifyInfoView.findViewById(p116hb.c.tvNotifyContent);
                    default:
                        int i11 = NotifyInfoView.f30645c;
                        return (ImageView) notifyInfoView.findViewById(p116hb.c.ivIcon);
                }
            }
        });
        final int i10 = 1;
        this.f30647b = C2131j.b(new Function0(this) { // from class: Cb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotifyInfoView f1348b;

            {
                this.f1348b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NotifyInfoView notifyInfoView = this.f1348b;
                switch (i10) {
                    case 0:
                        int i11 = NotifyInfoView.f30645c;
                        return (MarqueeTextView) notifyInfoView.findViewById(p116hb.c.tvNotifyContent);
                    default:
                        int i12 = NotifyInfoView.f30645c;
                        return (ImageView) notifyInfoView.findViewById(p116hb.c.ivIcon);
                }
            }
        });
        LayoutInflater.from(context).inflate(d.cs_cl_notify_info_view, this);
    }

    private final ImageView getIvIcon() {
        Object value = this.f30647b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final MarqueeTextView getTvNotifyContent() {
        Object value = this.f30646a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MarqueeTextView) value;
    }

    public final void a(NotifyInfo notifyInfo) {
        F6.d.h("NotifyInfoView", 3, "update >>> " + notifyInfo);
        if (notifyInfo == null) {
            setVisibility(8);
            return;
        }
        setVisibility(TextUtils.isEmpty(notifyInfo.title) ? 8 : 0);
        if (TextUtils.isEmpty(notifyInfo.title)) {
            return;
        }
        boolean zV = i0.V(this);
        r0.l1(zV ? notifyInfo.iconDark : notifyInfo.icon, getIvIcon());
        h.s(getIvIcon(), !TextUtils.isEmpty(zV ? notifyInfo.iconDark : notifyInfo.icon));
        getTvNotifyContent().setText(notifyInfo.title);
        getTvNotifyContent().setTextColor(getContext().getColor(b.ppColorTextPrimary));
    }
}
