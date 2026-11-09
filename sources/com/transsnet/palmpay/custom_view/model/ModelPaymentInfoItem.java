package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.model.ModelPaymentInfoItem;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.x;
import com.transsnet.palmpay.util.ScreenUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001:\u0002*\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u000fR#\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR#\u0010\u001a\u001a\n \u0013*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR#\u0010\u001d\u001a\n \u0013*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\fR#\u0010 \u001a\n \u0013*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u000fR#\u0010#\u001a\n \u0013*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u000fR#\u0010&\u001a\n \u0013*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u000fR#\u0010)\u001a\n \u0013*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\f¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentInfoItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getItemKeyTv", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "getItemKeyIconIv", "()Landroid/widget/ImageView;", "getItemValueTv", "getItemLineValueTv", "getItemValueTagIv", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_item_key_hint", "tv_item_key_hint", "b", "getTv_item_value", "tv_item_value", "c", "getTv_item_line_value", "tv_item_line_value", "d", "getIv_item_value_icon", "iv_item_value_icon", "e", "getIv_item_key_icon", "iv_item_key_icon", "f", "getIv_item_value_tag", "iv_item_value_tag", "g", "getTv_item_key", "tv_item_key", "ItemStyle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelPaymentInfoItem extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31536i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31543g;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentInfoItem$ItemStyle;", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Documented
    public @interface ItemStyle {
    }

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
    public ModelPaymentInfoItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_item_key_icon() {
        return (ImageView) this.f31541e.getValue();
    }

    private final ImageView getIv_item_value_icon() {
        return (ImageView) this.f31540d.getValue();
    }

    private final ImageView getIv_item_value_tag() {
        return (ImageView) this.f31542f.getValue();
    }

    private final TextView getTv_item_key() {
        return (TextView) this.f31543g.getValue();
    }

    private final TextView getTv_item_key_hint() {
        return (TextView) this.f31537a.getValue();
    }

    private final TextView getTv_item_line_value() {
        return (TextView) this.f31539c.getValue();
    }

    private final TextView getTv_item_value() {
        return (TextView) this.f31538b.getValue();
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            getTv_item_key_hint().setVisibility(8);
            return;
        }
        getTv_item_key_hint().setVisibility(0);
        TextView tv_item_key_hint = getTv_item_key_hint();
        if (str == null) {
            str = "";
        }
        tv_item_key_hint.setText(str);
    }

    public final void d(CharSequence charSequence) {
        TextView tv_item_key = getTv_item_key();
        if (charSequence == null) {
            charSequence = "";
        }
        tv_item_key.setText(charSequence);
    }

    public final void e(IconicsDrawable iconicsDrawable) {
        getIv_item_key_icon().setImageDrawable(iconicsDrawable);
        getIv_item_key_icon().setVisibility(0);
    }

    public final void f(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            getTv_item_line_value().setVisibility(8);
            return;
        }
        getTv_item_line_value().setVisibility(0);
        TextView tv_item_line_value = getTv_item_line_value();
        if (charSequence == null) {
            charSequence = "";
        }
        tv_item_line_value.setText(charSequence);
    }

    public final void g(CharSequence charSequence) {
        TextView tv_item_value = getTv_item_value();
        if (charSequence == null) {
            charSequence = "";
        }
        tv_item_value.setText(charSequence);
    }

    @NotNull
    public final ImageView getItemKeyIconIv() {
        ImageView iv_item_key_icon = getIv_item_key_icon();
        Intrinsics.checkNotNullExpressionValue(iv_item_key_icon, "<get-iv_item_key_icon>(...)");
        return iv_item_key_icon;
    }

    @NotNull
    public final TextView getItemKeyTv() {
        TextView tv_item_key = getTv_item_key();
        Intrinsics.checkNotNullExpressionValue(tv_item_key, "<get-tv_item_key>(...)");
        return tv_item_key;
    }

    @NotNull
    public final TextView getItemLineValueTv() {
        TextView tv_item_line_value = getTv_item_line_value();
        Intrinsics.checkNotNullExpressionValue(tv_item_line_value, "<get-tv_item_line_value>(...)");
        return tv_item_line_value;
    }

    @NotNull
    public final ImageView getItemValueTagIv() {
        ImageView iv_item_value_tag = getIv_item_value_tag();
        Intrinsics.checkNotNullExpressionValue(iv_item_value_tag, "<get-iv_item_value_tag>(...)");
        return iv_item_value_tag;
    }

    @NotNull
    public final TextView getItemValueTv() {
        TextView tv_item_value = getTv_item_value();
        Intrinsics.checkNotNullExpressionValue(tv_item_value, "<get-tv_item_value>(...)");
        return tv_item_value;
    }

    public final void h(Uri uri) {
        if (uri == null) {
            return;
        }
        com.bumptech.glide.b.e(getContext()).load(uri).S(getIv_item_value_tag());
        getIv_item_value_tag().setVisibility(0);
    }

    public final void i(int i7) {
        if (i7 == 1) {
            getIv_item_key_icon().setVisibility(0);
        } else if (i7 == 2) {
            getIv_item_key_icon().setVisibility(8);
        } else if (i7 == 3) {
            getIv_item_key_icon().setVisibility(8);
            getIv_item_value_icon().setVisibility(0);
        } else if (i7 == 4) {
            getIv_item_key_icon().setVisibility(0);
            getIv_item_value_icon().setVisibility(0);
        } else if (i7 != 5) {
            getIv_item_key_icon().setVisibility(0);
        } else {
            getIv_item_key_icon().setVisibility(8);
            ImageView iv_item_value_tag = getIv_item_value_tag();
            if (iv_item_value_tag != null) {
                iv_item_value_tag.setVisibility(0);
            }
        }
        TextView tv_item_line_value = getTv_item_line_value();
        if (tv_item_line_value != null) {
            tv_item_line_value.setPaintFlags(getTv_item_line_value().getPaintFlags() | 16);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentInfoItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPaymentInfoItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentInfoItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31537a = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i10) {
                    case 0:
                        int i11 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i12 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i13 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i14 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i15 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i16 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i11 = 1;
        this.f31538b = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i11) {
                    case 0:
                        int i12 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i13 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i14 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i15 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i16 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i18 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i12 = 2;
        this.f31539c = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i12) {
                    case 0:
                        int i13 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i14 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i15 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i16 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i18 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i19 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i13 = 3;
        this.f31540d = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i13) {
                    case 0:
                        int i14 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i15 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i16 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i18 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i19 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i110 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i14 = 4;
        this.f31541e = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i14) {
                    case 0:
                        int i15 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i16 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i18 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i19 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i110 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i111 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i15 = 5;
        this.f31542f = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i15) {
                    case 0:
                        int i16 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i18 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i19 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i110 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i111 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i112 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i16 = 6;
        this.f31543g = C2131j.b(new Function0(this) { // from class: Vb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentInfoItem f10290b;

            {
                this.f10290b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentInfoItem modelPaymentInfoItem = this.f10290b;
                switch (i16) {
                    case 0:
                        int i17 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key_hint);
                    case 1:
                        int i18 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 2:
                        int i19 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_line_value);
                    case 3:
                        int i110 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_icon);
                    case 4:
                        int i111 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_icon);
                    case 5:
                        int i112 = ModelPaymentInfoItem.f31536i;
                        return (ImageView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_tag);
                    default:
                        int i113 = ModelPaymentInfoItem.f31536i;
                        return (TextView) modelPaymentInfoItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_payment_info_item, this);
        setPadding(CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(6), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(6));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CVModelPaymentInfoItem);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(x.CVModelPaymentInfoItem_cv_item_key);
        String string2 = typedArrayObtainStyledAttributes.getString(x.CVModelPaymentInfoItem_cv_item_value);
        int i17 = typedArrayObtainStyledAttributes.getInt(x.CVModelPaymentInfoItem_cv_item_style, 1);
        int i18 = 0;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.CVModelPaymentInfoItem_cv_item_key_icon, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelPaymentInfoItem_cv_item_key_icon_visible, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(x.CVModelPaymentInfoItem_cv_item_value_icon, 0);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelPaymentInfoItem_cv_item_value_icon_visible, false);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(x.CVModelPaymentInfoItem_cv_item_value_icon, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelPaymentInfoItem_cv_item_value_icon_visible, false);
        typedArrayObtainStyledAttributes.recycle();
        setMinimumHeight(ScreenUtils.dip2px(28.0f));
        d(string);
        g(string2);
        i(i17);
        if (resourceId != 0) {
            getIv_item_key_icon().setImageResource(resourceId);
            getIv_item_key_icon().setVisibility(0);
        }
        getIv_item_key_icon().setVisibility(z3 ? 0 : 8);
        if (resourceId2 != 0) {
            getIv_item_value_icon().setImageResource(resourceId2);
            getIv_item_value_icon().setVisibility(0);
        }
        getIv_item_value_icon().setVisibility(z8 ? 0 : 8);
        if (resourceId3 != 0) {
            try {
                h(CommonExtKt.toDrawableUri(resourceId3));
                ImageView iv_item_value_tag = getIv_item_value_tag();
                if (!z10) {
                    i18 = 8;
                }
                iv_item_value_tag.setVisibility(i18);
            } catch (Exception unused) {
            }
        }
    }
}
