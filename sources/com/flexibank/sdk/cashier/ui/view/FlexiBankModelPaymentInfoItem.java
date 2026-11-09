package com.flexibank.sdk.cashier.ui.view;

import Bc.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.t;
import com.transsnet.palmpay.util.ScreenUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p371yf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentInfoItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getItemKeyTv", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "getItemKeyIconIv", "()Landroid/widget/ImageView;", "getItemValueTv", "ItemStyle", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelPaymentInfoItem extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f22052a;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentInfoItem$ItemStyle;", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    public FlexiBankModelPaymentInfoItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        i iVar = this.f22052a;
        if (zIsEmpty) {
            if (iVar != null) {
                ((TextView) iVar.f729g).setVisibility(8);
                return;
            }
            return;
        }
        if (iVar != null) {
            ((TextView) iVar.f729g).setVisibility(0);
        }
        if (iVar != null) {
            TextView textView = (TextView) iVar.f729g;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    public final void d(CharSequence charSequence) {
        i iVar = this.f22052a;
        if (iVar != null) {
            TextView textView = (TextView) iVar.f728f;
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    public final void e(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        i iVar = this.f22052a;
        if (zIsEmpty) {
            if (iVar != null) {
                ((TextView) iVar.f726d).setVisibility(8);
                return;
            }
            return;
        }
        if (iVar != null) {
            ((TextView) iVar.f726d).setVisibility(0);
        }
        if (iVar != null) {
            TextView textView = (TextView) iVar.f726d;
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    public final void f(CharSequence charSequence) {
        i iVar = this.f22052a;
        if (iVar != null) {
            TextView textView = (TextView) iVar.f725c;
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    public final void g(int i7) {
        i iVar = this.f22052a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    if (iVar != null) {
                        ((ImageView) iVar.f727e).setVisibility(8);
                    }
                    if (iVar != null) {
                        ((ImageView) iVar.f724b).setVisibility(0);
                    }
                } else if (i7 == 4) {
                    if (iVar != null) {
                        ((ImageView) iVar.f727e).setVisibility(0);
                    }
                    if (iVar != null) {
                        ((ImageView) iVar.f724b).setVisibility(0);
                    }
                } else if (iVar != null) {
                    ((ImageView) iVar.f727e).setVisibility(0);
                }
            } else if (iVar != null) {
                ((ImageView) iVar.f727e).setVisibility(8);
            }
        } else if (iVar != null) {
            ((ImageView) iVar.f727e).setVisibility(0);
        }
        if (iVar != null) {
            TextView textView = (TextView) iVar.f726d;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
    }

    @Nullable
    public final ImageView getItemKeyIconIv() {
        i iVar = this.f22052a;
        if (iVar != null) {
            return (ImageView) iVar.f727e;
        }
        return null;
    }

    @Nullable
    public final TextView getItemKeyTv() {
        i iVar = this.f22052a;
        if (iVar != null) {
            return (TextView) iVar.f728f;
        }
        return null;
    }

    @Nullable
    public final TextView getItemValueTv() {
        i iVar = this.f22052a;
        if (iVar != null) {
            return (TextView) iVar.f725c;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentInfoItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankModelPaymentInfoItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentInfoItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, q.fb_layout_payment_info_item, this);
        int i10 = p.fb_barrier_content_bottom;
        if (((Barrier) p059e1.a.m(i10, viewInflate)) != null) {
            i10 = p.fb_iv_item_key_icon;
            ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
            if (imageView != null) {
                i10 = p.fb_iv_item_value_icon;
                ImageView imageView2 = (ImageView) p059e1.a.m(i10, viewInflate);
                if (imageView2 != null) {
                    i10 = p.fb_ll_item_key;
                    if (((ConstraintLayout) p059e1.a.m(i10, viewInflate)) != null) {
                        i10 = p.fb_ll_item_value;
                        if (((LinearLayout) p059e1.a.m(i10, viewInflate)) != null) {
                            i10 = p.fb_space_item;
                            if (((Space) p059e1.a.m(i10, viewInflate)) != null) {
                                i10 = p.fb_tv_item_key;
                                TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                                if (textView != null) {
                                    i10 = p.fb_tv_item_key_hint;
                                    TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
                                    if (textView2 != null) {
                                        i10 = p.fb_tv_item_line_value;
                                        TextView textView3 = (TextView) p059e1.a.m(i10, viewInflate);
                                        if (textView3 != null) {
                                            i10 = p.fb_tv_item_value;
                                            TextView textView4 = (TextView) p059e1.a.m(i10, viewInflate);
                                            if (textView4 != null) {
                                                this.f22052a = new i(viewInflate, imageView, imageView2, textView, textView2, textView3, textView4);
                                                float f10 = 16;
                                                float f11 = 6;
                                                setPadding(ScreenUtils.dip2px(f10), ScreenUtils.dip2px(f11), ScreenUtils.dip2px(f10), ScreenUtils.dip2px(f11));
                                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.fb_ModelPaymentInfoItem);
                                                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                                                String string = typedArrayObtainStyledAttributes.getString(t.fb_ModelPaymentInfoItem_fb_item_key);
                                                String string2 = typedArrayObtainStyledAttributes.getString(t.fb_ModelPaymentInfoItem_fb_item_value);
                                                int i11 = typedArrayObtainStyledAttributes.getInt(t.fb_ModelPaymentInfoItem_fb_item_style, 1);
                                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(t.fb_ModelPaymentInfoItem_fb_item_key_icon, 0);
                                                boolean z3 = typedArrayObtainStyledAttributes.getBoolean(t.fb_ModelPaymentInfoItem_fb_item_key_icon_visible, false);
                                                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(t.fb_ModelPaymentInfoItem_fb_item_value_icon, 0);
                                                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(t.fb_ModelPaymentInfoItem_fb_item_value_icon_visible, false);
                                                typedArrayObtainStyledAttributes.recycle();
                                                setMinimumHeight(ScreenUtils.dip2px(28.0f));
                                                d(string);
                                                f(string2);
                                                g(i11);
                                                if (resourceId != 0) {
                                                    imageView.setImageResource(resourceId);
                                                    imageView.setVisibility(0);
                                                }
                                                imageView.setVisibility(z3 ? 0 : 8);
                                                if (resourceId2 != 0) {
                                                    imageView2.setImageResource(resourceId2);
                                                    imageView2.setVisibility(0);
                                                }
                                                imageView2.setVisibility(z8 ? 0 : 8);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
