package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.palmpay.custom_view.interfac.OnCopyListener;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.ToastUtils;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002A\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u001b\u001a\n \u0017*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R#\u0010\u001e\u001a\n \u0017*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\tR#\u0010!\u001a\n \u0017*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0011R#\u0010$\u001a\n \u0017*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u0011R#\u0010'\u001a\n \u0017*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\tR#\u0010,\u001a\n \u0017*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R#\u0010/\u001a\n \u0017*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u0011R#\u00102\u001a\n \u0017*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010+R#\u00105\u001a\n \u0017*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010+R#\u00108\u001a\n \u0017*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u0011R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultItemModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "visibility", "", "setItemValueIconVisibility", "(I)V", "Landroid/view/View;", "getItemKeyRightIconIv", "()Landroid/view/View;", "", "show", "setItemKeyRightIconVisibility", "(Z)V", "setItemRightIconVisibility", "Landroid/widget/TextView;", "getItemKeyTv", "()Landroid/widget/TextView;", "getItemValueTv", "Lcom/transsnet/palmpay/custom_view/interfac/OnCopyListener;", "onCopyListener", "setOnCopyListener", "(Lcom/transsnet/palmpay/custom_view/interfac/OnCopyListener;)V", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTvBottomDesc", "tvBottomDesc", "b", "getClSubInfo", "clSubInfo", "c", "getTvSubKey", "tvSubKey", "d", "getTvSubValue", "tvSubValue", "e", "getIvSubArrow", "ivSubArrow", "Landroid/widget/ImageView;", "g", "getIv_item_right_icon", "()Landroid/widget/ImageView;", "iv_item_right_icon", "i", "getTv_item_value", "tv_item_value", "j", "getIv_item_value_left_icon", "iv_item_value_left_icon", "o", "getIv_item_key_right_icon", "iv_item_key_right_icon", "p", "getTv_item_key", "tv_item_key", "", "t", "F", "getBackgroundRadius", "()F", "setBackgroundRadius", "(F)V", "backgroundRadius", "ItemStyle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderResultItemModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderResultItemModel.kt\ncom/transsnet/palmpay/custom_view/model/OrderResultItemModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
public final class OrderResultItemModel extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f31624w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31631g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31633j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f31635p;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float backgroundRadius;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OnCopyListener f31636v;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultItemModel$ItemStyle;", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    public OrderResultItemModel(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 0.0f, 0.0f, 0, 62);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(OrderResultItemModel orderResultItemModel) {
        CharSequence text;
        CharSequence text2;
        OnCopyListener onCopyListener = orderResultItemModel.f31636v;
        CharSequence charSequence = "";
        if (onCopyListener != null) {
            TextView tv_item_value = orderResultItemModel.getTv_item_value();
            if (tv_item_value != null && (text2 = tv_item_value.getText()) != null) {
                charSequence = text2;
            }
            onCopyListener.onCopy(charSequence);
            return;
        }
        ToastUtils.showShort(v.cv_copy_successful);
        TextView tv_item_value2 = orderResultItemModel.getTv_item_value();
        if (tv_item_value2 != null && (text = tv_item_value2.getText()) != null) {
            charSequence = text;
        }
        ClipboardUtils.copyText(charSequence);
    }

    public static void d(OrderResultItemModel orderResultItemModel) {
        CharSequence text;
        String string;
        String strK;
        Intent intent = new Intent("android.intent.action.DIAL");
        TextView tv_item_value = orderResultItemModel.getTv_item_value();
        String str = "";
        if (tv_item_value != null && (text = tv_item_value.getText()) != null && (string = text.toString()) != null && (strK = y.k(string, " ", "")) != null) {
            str = strK;
        }
        Uri uri = Uri.parse("tel:".concat(str));
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        intent.setData(uri);
        Context context = orderResultItemModel.getContext();
        if (context != null) {
            context.startActivity(intent);
        }
    }

    private final View getClSubInfo() {
        return (View) this.f31626b.getValue();
    }

    private final View getIvSubArrow() {
        return (View) this.f31629e.getValue();
    }

    private final ImageView getIv_item_key_right_icon() {
        return (ImageView) this.f31634o.getValue();
    }

    private final ImageView getIv_item_right_icon() {
        return (ImageView) this.f31631g.getValue();
    }

    private final ImageView getIv_item_value_left_icon() {
        return (ImageView) this.f31633j.getValue();
    }

    private final TextView getTvBottomDesc() {
        return (TextView) this.f31625a.getValue();
    }

    private final TextView getTvSubKey() {
        return (TextView) this.f31627c.getValue();
    }

    private final TextView getTvSubValue() {
        return (TextView) this.f31628d.getValue();
    }

    private final TextView getTv_item_key() {
        return (TextView) this.f31635p.getValue();
    }

    private final TextView getTv_item_value() {
        return (TextView) this.f31632i.getValue();
    }

    public final void e() {
        getClSubInfo().setVisibility(8);
        getClSubInfo().setOnClickListener(null);
        getClSubInfo().setClickable(false);
        getTvSubKey().setText("");
        getTvSubKey().setVisibility(8);
        getTvSubValue().setText("");
        getTvSubValue().setVisibility(8);
        getIvSubArrow().setVisibility(8);
    }

    public final void f() {
        getTvBottomDesc().setVisibility(TextUtils.isEmpty("") ? 8 : 0);
        getTvBottomDesc().setText("");
    }

    public final void g(String str) {
        TextView tv_item_key = getTv_item_key();
        if (str == null) {
            str = "";
        }
        tv_item_key.setText(str);
    }

    public final float getBackgroundRadius() {
        return this.backgroundRadius;
    }

    @NotNull
    public final View getItemKeyRightIconIv() {
        ImageView iv_item_key_right_icon = getIv_item_key_right_icon();
        Intrinsics.checkNotNullExpressionValue(iv_item_key_right_icon, "<get-iv_item_key_right_icon>(...)");
        return iv_item_key_right_icon;
    }

    @NotNull
    public final TextView getItemKeyTv() {
        TextView tv_item_key = getTv_item_key();
        Intrinsics.checkNotNullExpressionValue(tv_item_key, "<get-tv_item_key>(...)");
        return tv_item_key;
    }

    @NotNull
    public final TextView getItemValueTv() {
        TextView tv_item_value = getTv_item_value();
        Intrinsics.checkNotNullExpressionValue(tv_item_value, "<get-tv_item_value>(...)");
        return tv_item_value;
    }

    public final void h(CharSequence charSequence) {
        getTv_item_key().setText(charSequence);
    }

    public final void i(int i7) {
        getIv_item_right_icon().setImageResource(i7);
        getIv_item_right_icon().setVisibility(0);
    }

    public final void j(CharSequence charSequence) {
        TextView tv_item_value = getTv_item_value();
        if (charSequence == null) {
            charSequence = "";
        }
        tv_item_value.setText(charSequence);
    }

    public final void k(int i7) {
        getIv_item_value_left_icon().setImageResource(i7);
        getIv_item_value_left_icon().setVisibility(0);
    }

    public final void l(String str) {
        getIv_item_value_left_icon().setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bumptech.glide.b.e(getContext()).load(str).S(getIv_item_value_left_icon());
    }

    public final void m(int i7) {
        final int i10 = 1;
        this.f31630f = i7;
        e();
        final int i11 = 0;
        switch (i7) {
            case 1001:
                getIv_item_value_left_icon().setVisibility(0);
                getIv_item_right_icon().setVisibility(8);
                break;
            case 1002:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(8);
                break;
            case ErrorCodes.MALFORMED_URL_EXCEPTION /* 1003 */:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(0);
                getIv_item_right_icon().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_Copy, null, getContext().getColor(L6.b.ppColorTextAssist), 16.0f));
                View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: Vb.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OrderResultItemModel f10312b;

                    {
                        this.f10312b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                OrderResultItemModel.c(this.f10312b);
                                break;
                            default:
                                OrderResultItemModel.d(this.f10312b);
                                break;
                        }
                    }
                };
                getIv_item_right_icon().setOnClickListener(onClickListener);
                getTv_item_value().setOnClickListener(onClickListener);
                break;
            case 1004:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(0);
                getIv_item_right_icon().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_ArrowCenterRight, null, getContext().getColor(L6.b.ppColorTextAssist), 16.0f));
                break;
            case 1005:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(8);
                getTv_item_value().setTextColor(getContext().getColor(L6.b.ppColorPrimary));
                getTv_item_value().getPaint().setFlags(8);
                getTv_item_value().getPaint().setAntiAlias(true);
                getTv_item_value().setOnClickListener(new View.OnClickListener(this) { // from class: Vb.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OrderResultItemModel f10312b;

                    {
                        this.f10312b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                OrderResultItemModel.c(this.f10312b);
                                break;
                            default:
                                OrderResultItemModel.d(this.f10312b);
                                break;
                        }
                    }
                });
                break;
            case ErrorCodes.SSL_HANDSHAKE_EXCEPTION /* 1006 */:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(8);
                break;
            case ErrorCodes.IO_EXCEPTION /* 1007 */:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(0);
                getIv_item_right_icon().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_ArrowCenterRight, null, getContext().getColor(L6.b.ppColorTextAssist), 16.0f));
                int iDip2px = ScreenUtils.dip2px(this.backgroundRadius);
                int color = Color.parseColor("#ffffff");
                float f10 = iDip2px;
                float[] fArr = {f10, f10, f10, f10, f10, f10, f10, f10};
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadii(fArr);
                gradientDrawable.setColor(color);
                gradientDrawable.setStroke(0, color);
                setBackground(gradientDrawable);
                break;
            case 1008:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(8);
                break;
            case 1009:
                getIv_item_value_left_icon().setVisibility(8);
                getIv_item_right_icon().setVisibility(8);
                break;
            default:
                getIv_item_value_left_icon().setVisibility(0);
                getIv_item_right_icon().setVisibility(8);
                break;
        }
    }

    public final void n(CharSequence charSequence, String str, View.OnClickListener onClickListener) {
        e();
        int i7 = this.f31630f;
        if (i7 == 1008 || i7 == 1009) {
            if ((charSequence == null || charSequence.length() == 0) && (str == null || str.length() == 0)) {
                return;
            }
            getClSubInfo().setVisibility(0);
            getTvSubKey().setText(charSequence);
            getTvSubKey().setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
            getTvSubValue().setText(str);
            getTvSubValue().setVisibility((str == null || str.length() == 0) ? 8 : 0);
            if (this.f31630f == 1009) {
                getIvSubArrow().setVisibility(8);
                getTvSubValue().setBackgroundResource(r.cv_shape_round_corner_primary);
                getTvSubValue().setTextAppearance(w.Text_medium);
                getTvSubValue().setTextSize(0, CommonViewExtKt.getDp(12));
                getTvSubValue().setTextColor(getContext().getColor(L6.b.ppColorButtonTextWhite));
                ViewGroup.LayoutParams layoutParams = getTvSubValue().getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = CommonViewExtKt.getDp(44);
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = CommonViewExtKt.getDp(20);
                layoutParams2.setMarginEnd(CommonViewExtKt.getDp(8));
                getTvSubValue().setLayoutParams(layoutParams2);
            } else {
                getIvSubArrow().setVisibility(onClickListener != null ? 0 : 8);
                getTvSubValue().setBackground(null);
                getTvSubValue().setTextAppearance(w.Text_202046_12);
                ViewGroup.LayoutParams layoutParams3 = getTvSubValue().getLayoutParams();
                Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams4).height = -2;
                layoutParams4.setMarginEnd(0);
                getTvSubValue().setLayoutParams(layoutParams4);
            }
            getClSubInfo().setOnClickListener(onClickListener);
            getClSubInfo().setClickable(onClickListener != null);
        }
    }

    public final void setBackgroundRadius(float f10) {
        this.backgroundRadius = f10;
    }

    public final void setItemKeyRightIconVisibility(boolean show) {
        getIv_item_key_right_icon().setVisibility(show ? 0 : 8);
    }

    public final void setItemRightIconVisibility(int visibility) {
        getIv_item_right_icon().setVisibility(visibility);
    }

    public final void setItemValueIconVisibility(int visibility) {
        getIv_item_value_left_icon().setVisibility(visibility);
    }

    public final void setOnCopyListener(@NotNull OnCopyListener onCopyListener) {
        Intrinsics.checkNotNullParameter(onCopyListener, "onCopyListener");
        this.f31636v = onCopyListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultItemModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0.0f, 0.0f, 0, 60);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultItemModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0.0f, 0.0f, 0, 56);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderResultItemModel(Context context, AttributeSet attributeSet, int i7, float f10, float f11, int i10, int i11) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        i7 = (i11 & 4) != 0 ? 0 : i7;
        f10 = (i11 & 8) != 0 ? 12.0f : f10;
        f11 = (i11 & 16) != 0 ? 8.0f : f11;
        i10 = (i11 & 32) != 0 ? CommonViewExtKt.getDp(32) : i10;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i7);
        final int i12 = 0;
        this.f31625a = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i12) {
                    case 0:
                        int i13 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i14 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i15 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i16 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i17 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i18 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i19 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i13 = 1;
        this.f31626b = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i13) {
                    case 0:
                        int i14 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i15 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i16 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i17 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i18 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i19 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i110 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i14 = 2;
        this.f31627c = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i14) {
                    case 0:
                        int i15 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i16 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i17 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i18 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i19 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i110 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i111 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i15 = 3;
        this.f31628d = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i15) {
                    case 0:
                        int i16 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i17 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i18 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i19 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i110 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i111 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i112 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i16 = 4;
        this.f31629e = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i16) {
                    case 0:
                        int i17 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i18 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i19 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i110 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i111 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i112 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i113 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        this.f31630f = 1002;
        final int i17 = 5;
        this.f31631g = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i17) {
                    case 0:
                        int i18 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i19 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i110 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i111 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i112 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i113 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i114 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i18 = 6;
        this.f31632i = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i18) {
                    case 0:
                        int i19 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i110 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i111 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i112 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i113 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i114 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i115 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i19 = 7;
        this.f31633j = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i19) {
                    case 0:
                        int i110 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i111 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i112 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i113 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i114 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i115 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i116 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i20 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i22 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i20 = 8;
        this.f31634o = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i20) {
                    case 0:
                        int i110 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i111 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i112 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i113 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i114 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i115 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i116 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i21 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i22 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i23 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i21 = 9;
        this.f31635p = C2131j.b(new Function0(this) { // from class: Vb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultItemModel f10310b;

            {
                this.f10310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultItemModel orderResultItemModel = this.f10310b;
                switch (i21) {
                    case 0:
                        int i110 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvBottomDesc);
                    case 1:
                        int i111 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.clSubInfo);
                    case 2:
                        int i112 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubKey);
                    case 3:
                        int i113 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tvSubValue);
                    case 4:
                        int i114 = OrderResultItemModel.f31624w;
                        return orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.ivSubArrow);
                    case 5:
                        int i115 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_right_icon);
                    case 6:
                        int i116 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 7:
                        int i22 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_value_left_icon);
                    case 8:
                        int i23 = OrderResultItemModel.f31624w;
                        return (ImageView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_key_right_icon);
                    default:
                        int i24 = OrderResultItemModel.f31624w;
                        return (TextView) orderResultItemModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        this.backgroundRadius = 12.0f;
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_item, this);
        setPadding(CommonViewExtKt.getDp(f10), CommonViewExtKt.getDp(f11), CommonViewExtKt.getDp(f10), CommonViewExtKt.getDp(f11));
        setMinimumHeight(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultItemModel(Context context, int i7, String str, CharSequence charSequence) {
        this(context, i7, str, charSequence, 12.0f, 8.0f, CommonViewExtKt.getDp(32));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultItemModel(Context context, int i7, String str, CharSequence charSequence, float f10, float f11, int i10) {
        this(context, (AttributeSet) null, 0, f10, f11, i10, 6);
        Intrinsics.checkNotNullParameter(context, "context");
        m(i7);
        g(str);
        j(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultItemModel(Context context, int i7, int i10, CharSequence charSequence) {
        this(context, (AttributeSet) null, 0, 0.0f, 0.0f, 0, 62);
        Intrinsics.checkNotNullParameter(context, "context");
        m(i7);
        getTv_item_key().setText(getContext().getResources().getText(i10));
        j(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultItemModel(Context context, String str, CharSequence charSequence) {
        this(context, (AttributeSet) null, 0, 0.0f, 0.0f, 0, 62);
        Intrinsics.checkNotNullParameter(context, "context");
        m(1002);
        g(str);
        j(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultItemModel(Context context, int i7, CharSequence charSequence) {
        this(context, (AttributeSet) null, 0, 0.0f, 0.0f, 0, 62);
        Intrinsics.checkNotNullParameter(context, "context");
        m(1002);
        getTv_item_key().setText(getContext().getResources().getText(i7));
        j(charSequence);
    }
}
