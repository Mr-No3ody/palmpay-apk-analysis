package com.transsnet.palmpay.managemoney.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/view/PlanInfoItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "com/transsnet/palmpay/managemoney/ui/view/d", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlanInfoItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanInfoItem.kt\ncom/transsnet/palmpay/managemoney/ui/view/PlanInfoItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public final class PlanInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32704e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconicsImageView f32705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconicsTextView f32706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f32707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintLayout f32708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanInfoItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(d dVar) {
        IconicsTextView iconicsTextView = this.f32706b;
        if (iconicsTextView != null) {
            iconicsTextView.setText(dVar.f32714a);
        }
        IconicsTextView iconicsTextView2 = this.f32706b;
        if (iconicsTextView2 != null) {
            iconicsTextView2.setTextSize(dVar.f32715b);
        }
        if (dVar.f32718e) {
            IconicsTextView iconicsTextView3 = this.f32706b;
            if (iconicsTextView3 != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconicsDrawable iconicsDrawable = new IconicsDrawable(context, S6.a.pay_ArrowCenterRight);
                iconicsDrawable.a(new m(this, 16));
                iconicsTextView3.setIconicsDrawableEnd(iconicsDrawable);
            }
            IconicsTextView iconicsTextView4 = this.f32706b;
            if (iconicsTextView4 != null) {
                iconicsTextView4.setOnClickListener(new b(dVar, 2));
            }
        } else {
            Drawable drawable = dVar.f32717d;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                IconicsTextView iconicsTextView5 = this.f32706b;
                if (iconicsTextView5 != null) {
                    iconicsTextView5.setCompoundDrawables(null, null, drawable, null);
                }
                IconicsTextView iconicsTextView6 = this.f32706b;
                if (iconicsTextView6 != null) {
                    iconicsTextView6.setOnClickListener(new b(dVar, 3));
                }
            }
        }
        IconicsTextView iconicsTextView7 = this.f32706b;
        if (iconicsTextView7 != null) {
            iconicsTextView7.setTextColor(getContext().getColor(dVar.f32716c));
        }
    }

    public final void b() {
        this.f32705a = (IconicsImageView) findViewById(Jc.c.iconImageInfo);
        this.f32706b = (IconicsTextView) findViewById(Jc.c.tvInfoValue);
        this.f32707c = (TextView) findViewById(Jc.c.tvInfoTitle);
        this.f32708d = (ConstraintLayout) findViewById(Jc.c.layoutParent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlanInfoItem(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlanInfoItem(@NotNull Context context) {
        this(context, (AttributeSet) null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlanInfoItem(Context context, d dVar, d dVar2, int i7) {
        this(context, dVar, dVar2);
        DensityUtil.dp2px(36.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlanInfoItem(Context context, d dVar, d dVar2) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(Jc.d.mm_plan_info_item, this);
        b();
        if (dVar != null) {
            TextView textView = this.f32707c;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f32707c;
            if (textView2 != null) {
                textView2.setText(dVar.f32714a);
            }
            TextView textView3 = this.f32707c;
            if (textView3 != null) {
                textView3.setTextSize(dVar.f32715b);
            }
            TextView textView4 = this.f32707c;
            if (textView4 != null) {
                textView4.setTextColor(context.getColor(dVar.f32716c));
            }
            IconicsImageView iconicsImageView = this.f32705a;
            if (iconicsImageView != null) {
                iconicsImageView.setVisibility(dVar.f32720g ? 0 : 8);
            }
            TextView textView5 = this.f32707c;
            if (textView5 != null) {
                textView5.setOnClickListener(new b(dVar, 0));
            }
            IconicsImageView iconicsImageView2 = this.f32705a;
            if (iconicsImageView2 != null) {
                iconicsImageView2.setOnClickListener(new b(dVar, 1));
            }
        }
        a(dVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlanInfoItem(Context context, d dVar, d dVar2, int i7, Drawable drawable) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(Jc.d.mm_plan_info_item, this);
        ConstraintLayout constraintLayout = this.f32708d;
        if (constraintLayout != null) {
            constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, i7));
        }
        b();
        int iDp2px = DensityUtil.dp2px(12.0f);
        setPadding(iDp2px, 0, iDp2px, 0);
        if (drawable != null) {
            setBackground(drawable);
        }
        TextView textView = this.f32707c;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f32707c;
        if (textView2 != null) {
            textView2.setText(dVar.f32714a);
        }
        TextView textView3 = this.f32707c;
        if (textView3 != null) {
            textView3.setTextSize(dVar.f32715b);
        }
        TextView textView4 = this.f32707c;
        if (textView4 != null) {
            textView4.setTextColor(context.getColor(dVar.f32716c));
        }
        IconicsImageView iconicsImageView = this.f32705a;
        if (iconicsImageView != null) {
            iconicsImageView.setVisibility(dVar.f32720g ? 0 : 8);
        }
        TextView textView5 = this.f32707c;
        if (textView5 != null) {
            textView5.setOnClickListener(new b(dVar, 4));
        }
        IconicsImageView iconicsImageView2 = this.f32705a;
        if (iconicsImageView2 != null) {
            iconicsImageView2.setOnClickListener(new b(dVar, 5));
        }
        a(dVar2);
    }
}
