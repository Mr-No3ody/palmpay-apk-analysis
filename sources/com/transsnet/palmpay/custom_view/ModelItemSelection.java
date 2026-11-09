package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/custom_view/ModelItemSelection;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "getStartIconView", "()Landroid/widget/ImageView;", "", "getItemValue", "()Ljava/lang/String;", "Landroid/widget/TextView;", "getItemDescView", "()Landroid/widget/TextView;", "", "<set-?>", "c", "Lkotlin/properties/ReadWriteProperty;", "isAvailable", "()Z", "setAvailable", "(Z)V", "d", "getMErrorMsg", "setMErrorMsg", "(Ljava/lang/String;)V", "mErrorMsg", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelItemSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelItemSelection.kt\ncom/transsnet/palmpay/custom_view/ModelItemSelection\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,250:1\n33#2,3:251\n33#2,3:254\n*S KotlinDebug\n*F\n+ 1 ModelItemSelection.kt\ncom/transsnet/palmpay/custom_view/ModelItemSelection\n*L\n35#1:251,3\n52#1:254,3\n*E\n"})
public final class ModelItemSelection extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f31033e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.f f31035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1551i f31036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1551i f31037d;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("isAvailable", "isAvailable()Z", ModelItemSelection.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f31033e = new KProperty[]{rVar, new kotlin.jvm.internal.r("mErrorMsg", "getMErrorMsg()Ljava/lang/String;", ModelItemSelection.class)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelItemSelection(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelItemSelection modelItemSelection, View.OnClickListener onClickListener, View view) {
        modelItemSelection.setMErrorMsg("");
        onClickListener.onClick(view);
    }

    private final String getMErrorMsg() {
        return (String) this.f31037d.getValue(this, f31033e[1]);
    }

    private final void setAvailable(boolean z3) {
        this.f31036c.setValue(this, f31033e[0], Boolean.valueOf(z3));
    }

    private final void setMErrorMsg(String str) {
        this.f31037d.setValue(this, f31033e[1], str);
    }

    public final void d(boolean z3) {
        setAvailable(z3);
    }

    public final void e(String str) {
        setMErrorMsg(str);
    }

    public final void f(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Bc.f fVar = this.f31035b;
        if (fVar != null) {
            ((ModelItemSelection) fVar.f697c).setOnClickListener(new p010a9.b(18, this, listener));
        }
    }

    public final void g(String str) {
        Bc.f fVar = this.f31035b;
        if (fVar != null) {
            ((TextView) fVar.f700f).setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
        }
        if (fVar != null) {
            TextView textView = (TextView) fVar.f700f;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    @Nullable
    public final TextView getItemDescView() {
        Bc.f fVar = this.f31035b;
        if (fVar != null) {
            return (TextView) fVar.f700f;
        }
        return null;
    }

    @NotNull
    public final String getItemValue() {
        TextView textView;
        CharSequence text;
        String string;
        Bc.f fVar = this.f31035b;
        return (fVar == null || (textView = (TextView) fVar.f702i) == null || (text = textView.getText()) == null || (string = text.toString()) == null) ? "" : string;
    }

    @Nullable
    public final ImageView getStartIconView() {
        Bc.f fVar = this.f31035b;
        if (fVar != null) {
            return (ImageView) fVar.f699e;
        }
        return null;
    }

    public final void h(CharSequence charSequence) {
        Bc.f fVar = this.f31035b;
        if (fVar != null) {
            TextView textView = (TextView) fVar.f702i;
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelItemSelection(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelItemSelection(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelItemSelection(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        View viewM;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31036c = new C1551i(this, context, 0);
        this.f31037d = new C1551i(this, context, 1);
        LayoutInflater.from(context).inflate(t.cv_model_item_selection, this);
        int i10 = s.barrierBottom;
        if (((Barrier) p059e1.a.m(i10, this)) != null) {
            i10 = s.barrierTop;
            if (((Barrier) p059e1.a.m(i10, this)) != null) {
                i10 = s.ivEndIcon;
                ImageView imageView = (ImageView) p059e1.a.m(i10, this);
                if (imageView != null) {
                    i10 = s.ivStartIcon;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i10, this);
                    if (imageView2 != null) {
                        i10 = s.tvDesc;
                        TextView textView = (TextView) p059e1.a.m(i10, this);
                        if (textView != null) {
                            i10 = s.tvError;
                            TextView textView2 = (TextView) p059e1.a.m(i10, this);
                            if (textView2 != null) {
                                i10 = s.tvItem;
                                TextView textView3 = (TextView) p059e1.a.m(i10, this);
                                if (textView3 != null) {
                                    i10 = s.tvTitle;
                                    TextView textView4 = (TextView) p059e1.a.m(i10, this);
                                    if (textView4 != null && (viewM = p059e1.a.m((i10 = s.vLine), this)) != null) {
                                        this.f31035b = new Bc.f(this, imageView, imageView2, textView, textView2, textView3, textView4, viewM, 12);
                                        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CVModelItemSelection);
                                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                                        String string = typedArrayObtainStyledAttributes.getString(x.CVModelItemSelection_cv_item_selection_title);
                                        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelItemSelection_cv_item_selection_title_visible, true);
                                        String string2 = typedArrayObtainStyledAttributes.getString(x.CVModelItemSelection_cv_item_selection_value);
                                        String string3 = typedArrayObtainStyledAttributes.getString(x.CVModelItemSelection_cv_item_selection_hint);
                                        int i11 = typedArrayObtainStyledAttributes.getInt(x.CVModelItemSelection_cv_item_selection_value_max_line, 1);
                                        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CVModelItemSelection_cv_item_selection_title_text_size, CommonViewExtKt.getDp(14));
                                        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CVModelItemSelection_cv_item_selection_value_text_size, CommonViewExtKt.getDp(22));
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.CVModelItemSelection_cv_item_selection_end_icon, 0);
                                        this.f31034a = resourceId;
                                        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelItemSelection_cv_item_selection_end_icon_visible, true);
                                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(x.CVModelItemSelection_cv_item_selection_start_icon, 0);
                                        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelItemSelection_cv_item_selection_start_icon_visible, false);
                                        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CVModelItemSelection_cv_item_selection_start_icon_size, CommonViewExtKt.getDp(36));
                                        typedArrayObtainStyledAttributes.recycle();
                                        textView4.setTextSize(0, dimensionPixelSize);
                                        textView4.setText(string != null ? string : "");
                                        textView4.setVisibility(z3 ? 0 : 8);
                                        textView3.setTextSize(0, dimensionPixelSize2);
                                        textView3.setText(string2 == null ? "" : string2);
                                        textView3.setMaxLines(i11);
                                        textView3.setHint(new SpanUtils().append(string3 == null ? "" : string3).setFontFamily("sans-serif").setFontSize(CommonViewExtKt.getDp(16)).create());
                                        textView3.setHintTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, context));
                                        if (resourceId != 0) {
                                            imageView.setImageResource(resourceId);
                                        } else {
                                            imageView.setImageDrawable(p059e1.a.h(context, S6.a.pay_Arrowdown, null, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context), 24.0f));
                                        }
                                        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                                        layoutParams.width = dimensionPixelSize3;
                                        layoutParams.height = dimensionPixelSize3;
                                        imageView2.setLayoutParams(layoutParams);
                                        if (resourceId2 != 0) {
                                            imageView2.setImageResource(resourceId2);
                                        }
                                        imageView2.setVisibility(z10 ? 0 : 8);
                                        imageView.setVisibility(z8 ? 0 : 8);
                                        return;
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
