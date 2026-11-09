package com.palmpay.lib.scanplus.view;

import Ae.n;
import Gb.T;
import I6.e;
import I6.g;
import Je.l;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0019\u001a\u00020\r2#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)R\"\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010!R\"\u00104\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010%R\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010!R\"\u0010<\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010!R\"\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b>\u0010-\"\u0004\b?\u0010!R\"\u0010D\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010-\"\u0004\bC\u0010!R\"\u0010H\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010+\u001a\u0004\bF\u0010-\"\u0004\bG\u0010!R\"\u0010L\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010-\"\u0004\bK\u0010!R\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/palmpay/lib/scanplus/view/CodePointView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/palmpay/lib/scanplus/bean/CodeBean;", "list", "", "setQrCodes", "(Ljava/util/List;)V", "Lkotlin/Function0;", "cancelAction", "setCancelButtonListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "codeBean", "pointAction", "setPointButtonListener", "(Lkotlin/jvm/functions/Function1;)V", "", "cancelText", "setCancelText", "(Ljava/lang/String;)V", "cancelColor", "setCancelTextColor", "(I)V", "", "cancelTextSize", "setCancelTextSize", "(F)V", "Landroid/view/View;", "view", "setAnimator", "(Landroid/view/View;)V", "e", "I", "getCancelColor", "()I", "setCancelColor", "f", "F", "getCancelSize", "()F", "setCancelSize", "cancelSize", "g", "getCancelTop", "setCancelTop", "cancelTop", "i", "getCancelLeft", "setCancelLeft", "cancelLeft", "j", "getPointViewRes", "setPointViewRes", "pointViewRes", "o", "getPointViewColor", "setPointViewColor", "pointViewColor", "p", "getPointViewSize", "setPointViewSize", "pointViewSize", "t", "getSuccessColorRes", "setSuccessColorRes", "successColorRes", "Lcom/palmpay/lib/scanplus/view/ScanLineView;", "w", "Lcom/palmpay/lib/scanplus/view/ScanLineView;", "getScanLineView", "()Lcom/palmpay/lib/scanplus/view/ScanLineView;", "scanLineView", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CodePointView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f24008A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f24010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f24011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int cancelColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float cancelSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int cancelTop;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int cancelLeft;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int pointViewRes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int pointViewColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int pointViewSize;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int successColorRes;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f24020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final ScanLineView scanLineView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CodePointView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setAnimator(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ViewProps.SCALE_X, 1.0f, 0.7f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, ViewProps.SCALE_Y, 1.0f, 0.7f, 1.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(2000L);
        animatorSet.setStartDelay(500L);
        animatorSet.start();
        this.f24009a.add(animatorSet);
    }

    public final void a() {
        ArrayList arrayList = this.f24009a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnimatorSet) it.next()).cancel();
        }
        arrayList.clear();
        this.f24020v.setVisibility(8);
        setBackgroundResource(e.transparent);
        ScanLineView scanLineView = this.scanLineView;
        if (scanLineView.f24039p) {
            AnimatorSet animatorSet = scanLineView.f24037j;
            if (animatorSet != null) {
                animatorSet.start();
            }
        } else {
            AnimatorSet animatorSet2 = scanLineView.f24038o;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
        scanLineView.setVisibility(0);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt != null ? childAt.getTag() : null) != null && (getChildAt(i7).getTag() instanceof CodeBean)) {
                removeViewAt(i7);
            }
        }
        requestLayout();
    }

    public final int getCancelColor() {
        return this.cancelColor;
    }

    public final int getCancelLeft() {
        return this.cancelLeft;
    }

    public final float getCancelSize() {
        return this.cancelSize;
    }

    public final int getCancelTop() {
        return this.cancelTop;
    }

    public final int getPointViewColor() {
        return this.pointViewColor;
    }

    public final int getPointViewRes() {
        return this.pointViewRes;
    }

    public final int getPointViewSize() {
        return this.pointViewSize;
    }

    @NotNull
    public final ScanLineView getScanLineView() {
        return this.scanLineView;
    }

    public final int getSuccessColorRes() {
        return this.successColorRes;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTag() != null) {
                Object tag = childAt.getTag();
                Intrinsics.f(tag, "null cannot be cast to non-null type com.palmpay.lib.scanplus.bean.CodeBean");
                CodeBean codeBean = (CodeBean) tag;
                PointF pointF = codeBean.center;
                if (pointF != null) {
                    childAt.layout(((int) pointF.x) - (childAt.getLayoutParams().width / 2), ((int) codeBean.center.y) - (childAt.getLayoutParams().width / 2), (childAt.getLayoutParams().width / 2) + ((int) codeBean.center.x), (childAt.getLayoutParams().width / 2) + ((int) codeBean.center.y));
                }
            } else if (i13 == 0) {
                measureChild(childAt, 0, 0);
                int i14 = this.cancelLeft;
                childAt.layout(i14, this.cancelTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + this.cancelTop);
            } else {
                measureChild(childAt, Integer.MIN_VALUE, Integer.MIN_VALUE);
                childAt.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        post(new n(this, 26));
    }

    public final void setCancelButtonListener(@Nullable Function0<Unit> cancelAction) {
        this.f24010b = cancelAction;
    }

    public final void setCancelColor(int i7) {
        this.cancelColor = i7;
    }

    public final void setCancelLeft(int i7) {
        this.cancelLeft = i7;
    }

    public final void setCancelSize(float f10) {
        this.cancelSize = f10;
    }

    public final void setCancelText(@NotNull String cancelText) {
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        this.f24012d = cancelText;
        this.f24020v.setText(cancelText);
    }

    public final void setCancelTextColor(int cancelColor) {
        this.f24020v.setTextColor(cancelColor);
    }

    public final void setCancelTextSize(float cancelTextSize) {
        this.f24020v.setTextSize(0, cancelTextSize);
    }

    public final void setCancelTop(int i7) {
        this.cancelTop = i7;
    }

    public final void setPointButtonListener(@Nullable Function1<? super CodeBean, Unit> pointAction) {
        this.f24011c = pointAction;
    }

    public final void setPointViewColor(int i7) {
        this.pointViewColor = i7;
    }

    public final void setPointViewRes(int i7) {
        this.pointViewRes = i7;
    }

    public final void setPointViewSize(int i7) {
        this.pointViewSize = i7;
    }

    public final void setQrCodes(@NotNull List<? extends CodeBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f24020v.setVisibility(0);
        setBackgroundColor(this.successColorRes);
        ScanLineView scanLineView = this.scanLineView;
        if (scanLineView.f24039p) {
            AnimatorSet animatorSet = scanLineView.f24037j;
            if (animatorSet != null) {
                animatorSet.pause();
            }
        } else {
            AnimatorSet animatorSet2 = scanLineView.f24038o;
            if (animatorSet2 != null) {
                animatorSet2.pause();
            }
        }
        scanLineView.setVisibility(8);
        for (CodeBean codeBean : list) {
            View view = new View(getContext());
            int i7 = this.pointViewColor;
            if (i7 != 0) {
                view.setBackgroundColor(i7);
            } else {
                view.setBackgroundResource(this.pointViewRes);
            }
            view.setTag(codeBean);
            view.setOnClickListener(new T(9, this, codeBean));
            int i10 = this.pointViewSize;
            addView(view, new ViewGroup.LayoutParams(i10, i10));
            setAnimator(view);
        }
        requestLayout();
    }

    public final void setSuccessColorRes(int i7) {
        this.successColorRes = i7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CodePointView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CodePointView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CodePointView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24009a = new ArrayList();
        this.f24012d = PPRNBridge.DIALOG_ACTION_CANCEL;
        this.cancelColor = e.width;
        Intrinsics.checkNotNullParameter(context, "context");
        this.cancelSize = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        this.cancelTop = (int) J3.a.S(40, context);
        this.cancelLeft = (int) J3.a.S(20, context);
        this.pointViewRes = g.scan_code_point;
        this.pointViewSize = (int) J3.a.S(50, context);
        this.successColorRes = context.getColor(e.half_transparent);
        TextView textView = new TextView(context);
        this.f24020v = textView;
        textView.setText(this.f24012d);
        textView.setTextSize(0, this.cancelSize);
        textView.setTextColor(context.getResources().getColor(this.cancelColor));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        textView.setVisibility(8);
        ScanLineView scanLineView = new ScanLineView(context, null, 6, 0);
        this.scanLineView = scanLineView;
        addView(scanLineView, new ViewGroup.LayoutParams(-1, -1));
        textView.setOnClickListener(new l(this, 1));
    }
}
