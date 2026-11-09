package com.transsnet.palmpay.credit.view;

import Bc.C0105b;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.SingleAdView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/view/DefaultInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "b", "Ljava/lang/String;", "getAccountNo", "()Ljava/lang/String;", "setAccountNo", "(Ljava/lang/String;)V", "accountNo", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultInfoView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30736c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0105b f30737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String accountNo;

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
    public DefaultInfoView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        View viewInflate = View.inflate(context, f.cs_cl_phone_default_layout, this);
        int i7 = e.adView;
        if (((SingleAdView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.btnContact;
            if (((PpButton) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.ivServicePhone;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = e.ivShop;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView2 != null) {
                        i7 = e.ivShopCopyWriting;
                        ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView3 != null) {
                            i7 = e.llService;
                            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout != null) {
                                i7 = e.tvServicePhone;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    this.f30737a = new C0105b(viewInflate, imageView, imageView2, imageView3, linearLayout, textView);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }
}
