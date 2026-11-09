package com.transsnet.palmpay.send_money.ui.view.kkcar;

import Ab.C;
import Bc.j;
import Bc.p;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeRsp;
import com.transsnet.palmpay.util.NetworkUtils;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/kkcar/KkCarQrView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "block", "setOnTapToRefreshListener", "(Lkotlin/jvm/functions/Function0;)V", "setOnEnableClickListener", "", ReactTextInputShadowNode.PROP_TEXT, "setPromotionText", "(Ljava/lang/String;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarQrView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarQrView.kt\ncom/transsnet/palmpay/send_money/ui/view/kkcar/KkCarQrView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1#2:349\n774#3:350\n865#3,2:351\n1878#3,3:353\n*S KotlinDebug\n*F\n+ 1 KkCarQrView.kt\ncom/transsnet/palmpay/send_money/ui/view/kkcar/KkCarQrView\n*L\n113#1:350\n113#1:351,2\n124#1:353,3\n*E\n"})
public final class KkCarQrView extends ConstraintLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f33948o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f33949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f33950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f33951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f33954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33955g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public KkCarQrCodeRsp.QrCodeDTO f33956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f33957j;

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
    public KkCarQrView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final void c(int i7) {
        boolean z3;
        if (((Collection) this.f33954f).isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
            if (i7 != 1 && i7 != 2) {
                z3 = false;
            }
        }
        LinearLayout llKkQrBadges = (LinearLayout) this.f33949a.f736c;
        Intrinsics.checkNotNullExpressionValue(llKkQrBadges, "llKkQrBadges");
        h.s(llKkQrBadges, z3);
    }

    public final void d(S6.a aVar) {
        j jVar = this.f33949a;
        IconicsImageView ivKkQrMaskIcon = (IconicsImageView) jVar.f741i;
        Intrinsics.checkNotNullExpressionValue(ivKkQrMaskIcon, "ivKkQrMaskIcon");
        h.s(ivKkQrMaskIcon, true);
        IconicsImageView iconicsImageView = (IconicsImageView) jVar.f741i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, aVar);
        iconicsDrawable.a(new C(this, 19));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    public final boolean e() {
        KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
        String qrCode;
        if (this.f33952d != 1 || !NetworkUtils.isConnected() || this.f33955g || (qrCodeDTO = this.f33956i) == null) {
            return false;
        }
        Integer qrCodeStatus = qrCodeDTO.getQrCodeStatus();
        return qrCodeStatus == null || qrCodeStatus.intValue() != 1 || (qrCode = qrCodeDTO.getQrCode()) == null || qrCode.length() == 0;
    }

    public final void setOnEnableClickListener(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f33951c = block;
    }

    public final void setOnTapToRefreshListener(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f33950b = block;
    }

    public final void setPromotionText(@Nullable String text) {
        boolean z3 = text == null || text.length() == 0;
        j jVar = this.f33949a;
        LinearLayout llKkQrPromotion = (LinearLayout) jVar.f742j;
        Intrinsics.checkNotNullExpressionValue(llKkQrPromotion, "llKkQrPromotion");
        h.s(llKkQrPromotion, !z3);
        if (z3) {
            return;
        }
        ((TextView) jVar.f746w).setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KkCarQrView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ KkCarQrView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KkCarQrView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(f.sm_kk_view_qr, this);
        int i10 = e.barrierKkQrBelowHeader;
        if (((Barrier) p059e1.a.m(i10, this)) != null) {
            i10 = e.flKkQrCard;
            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i10, this);
            if (constraintLayout != null) {
                i10 = e.flKkQrContainer;
                FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i10, this);
                if (frameLayout != null) {
                    i10 = e.flKkQrMask;
                    FrameLayout frameLayout2 = (FrameLayout) p059e1.a.m(i10, this);
                    if (frameLayout2 != null) {
                        i10 = e.ivKkQrCode;
                        ImageView imageView = (ImageView) p059e1.a.m(i10, this);
                        if (imageView != null) {
                            i10 = e.ivKkQrMaskIcon;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, this);
                            if (iconicsImageView != null) {
                                i10 = e.llKkQrBadges;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, this);
                                if (linearLayout != null) {
                                    i10 = e.llKkQrPromotion;
                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, this);
                                    if (linearLayout2 != null) {
                                        i10 = e.pbKkQrLoading;
                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) p059e1.a.m(i10, this);
                                        if (circularProgressIndicator != null) {
                                            i10 = e.spaceKkQrOverlap;
                                            if (((Space) p059e1.a.m(i10, this)) != null) {
                                                i10 = e.stubKkQrFrozen;
                                                ViewStub viewStub = (ViewStub) p059e1.a.m(i10, this);
                                                if (viewStub != null) {
                                                    i10 = e.tvKkQrDesc;
                                                    TextView textView = (TextView) p059e1.a.m(i10, this);
                                                    if (textView != null) {
                                                        i10 = e.tvKkQrHint;
                                                        TextView textView2 = (TextView) p059e1.a.m(i10, this);
                                                        if (textView2 != null) {
                                                            i10 = e.tvKkQrMaskSubtitle;
                                                            TextView textView3 = (TextView) p059e1.a.m(i10, this);
                                                            if (textView3 != null) {
                                                                i10 = e.tvKkQrPromotion;
                                                                TextView textView4 = (TextView) p059e1.a.m(i10, this);
                                                                if (textView4 != null) {
                                                                    i10 = e.tvKkQrSubHint;
                                                                    TextView textView5 = (TextView) p059e1.a.m(i10, this);
                                                                    if (textView5 != null) {
                                                                        i10 = e.tvKkQrTitle;
                                                                        TextView textView6 = (TextView) p059e1.a.m(i10, this);
                                                                        if (textView6 != null) {
                                                                            j jVar = new j(this, constraintLayout, frameLayout, frameLayout2, imageView, iconicsImageView, linearLayout, linearLayout2, circularProgressIndicator, viewStub, textView, textView2, textView3, textView4, textView5, textView6);
                                                                            Intrinsics.checkNotNullExpressionValue(jVar, "inflate(...)");
                                                                            this.f33949a = jVar;
                                                                            this.f33952d = -1;
                                                                            this.f33954f = z.f38935a;
                                                                            setBackgroundColor(0);
                                                                            frameLayout.setOnClickListener(new Hd.a(this, 1));
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }
}
