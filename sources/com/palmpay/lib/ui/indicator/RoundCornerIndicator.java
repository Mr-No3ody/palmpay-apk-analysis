package com.palmpay.lib.ui.indicator;

import L6.j;
import U6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/palmpay/lib/ui/indicator/RoundCornerIndicator;", "Landroid/view/View;", "Lcom/palmpay/lib/ui/indicator/PageIndicator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "f", "I", "getCount", "()I", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "g", "getCurrentItem", "currentItem", "", "C", "Z", "isSnap", "()Z", "setSnap", "(Z)V", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "H", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "getCallback", "()Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "setCallback", "(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V", "callback", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoundCornerIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundCornerIndicator.kt\ncom/palmpay/lib/ui/indicator/RoundCornerIndicator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public class RoundCornerIndicator extends View implements PageIndicator {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f24463A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f24464B;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public boolean isSnap;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public ViewPager2.OnPageChangeCallback callback;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GradientDrawable f24470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f24471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int count;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int currentItem;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24475j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f24476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f24477p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f24478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24479w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundCornerIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int a(float f10) {
        return (int) ((f10 * this.f24467a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.palmpay.lib.ui.indicator.PageIndicator
    public final void bindViewPager(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        if (viewPager2 == null) {
            throw new IllegalStateException("ViewPager can not be NULL!");
        }
        if (viewPager2.getAdapter() == null) {
            throw new IllegalStateException("ViewPager adapter can not be NULL!");
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        Objects.requireNonNull(adapter);
        this.count = adapter.getItemCount();
        viewPager2.unregisterOnPageChangeCallback(this.callback);
        viewPager2.registerOnPageChangeCallback(this.callback);
        ArrayList arrayList = this.f24468b;
        arrayList.clear();
        ArrayList arrayList2 = this.f24469c;
        arrayList2.clear();
        int i7 = this.count;
        for (int i10 = 0; i10 < i7; i10++) {
            arrayList.add(new GradientDrawable());
            arrayList2.add(new Rect());
        }
        requestLayout();
        invalidate();
    }

    @NotNull
    public final ViewPager2.OnPageChangeCallback getCallback() {
        return this.callback;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getCurrentItem() {
        return this.currentItem;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.count <= 0) {
            return;
        }
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int i10 = this.f24476o;
        int i11 = height - (i10 / 2);
        int i12 = this.count;
        int i13 = this.f24475j;
        int i14 = this.f24477p;
        int width = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft()) - ((((i12 - 1) * i14) + (i13 * i12)) / 2);
        int i15 = this.count;
        int i16 = 0;
        while (true) {
            i7 = this.t;
            if (i16 >= i15) {
                break;
            }
            Object obj = this.f24469c.get(i16);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Rect rect = (Rect) obj;
            int i17 = ((i13 + i14) * i16) + width;
            rect.left = i17;
            rect.top = i11;
            rect.right = i17 + i13;
            rect.bottom = i11 + i10;
            Object obj2 = this.f24468b.get(i16);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            GradientDrawable gradientDrawable = (GradientDrawable) obj2;
            gradientDrawable.setCornerRadius(i7);
            gradientDrawable.setColor(this.f24479w);
            gradientDrawable.setStroke(this.f24463A, this.f24464B);
            gradientDrawable.setBounds(rect);
            gradientDrawable.draw(canvas);
            i16++;
        }
        int i18 = i14 + i13;
        int i19 = (i18 * this.currentItem) + width + ((int) (i18 * (this.isSnap ? 0.0f : this.f24474i)));
        Rect rect2 = this.f24471e;
        rect2.left = i19;
        rect2.top = i11;
        rect2.right = i19 + i13;
        rect2.bottom = i11 + i10;
        GradientDrawable gradientDrawable2 = this.f24470d;
        gradientDrawable2.setCornerRadius(i7);
        gradientDrawable2.setColor(this.f24478v);
        gradientDrawable2.setBounds(rect2);
        gradientDrawable2.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != 1073741824 && this.count != 0) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int i11 = this.count;
            int i12 = ((i11 - 1) * this.f24477p) + (this.f24475j * i11) + paddingRight;
            if (mode != Integer.MIN_VALUE || i12 <= size) {
                size = i12;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 != 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f24476o;
            if (mode2 != Integer.MIN_VALUE || paddingBottom <= size2) {
                size2 = paddingBottom;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public final void setCallback(@NotNull ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        Intrinsics.checkNotNullParameter(onPageChangeCallback, "<set-?>");
        this.callback = onPageChangeCallback;
    }

    public final void setSnap(boolean z3) {
        this.isSnap = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundCornerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoundCornerIndicator(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundCornerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24467a = context;
        this.f24468b = new ArrayList();
        this.f24469c = new ArrayList();
        this.f24470d = new GradientDrawable();
        this.f24471e = new Rect();
        this.callback = new a(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.RoundCornerIndicator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f24475j = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.RoundCornerIndicator_rci_width, a(6.0f));
        this.f24476o = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.RoundCornerIndicator_rci_height, a(6.0f));
        this.f24477p = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.RoundCornerIndicator_rci_gap, a(8.0f));
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.RoundCornerIndicator_rci_cornerRadius, a(3.0f));
        this.f24463A = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.RoundCornerIndicator_rci_strokeWidth, a(0.0f));
        this.f24478v = typedArrayObtainStyledAttributes.getColor(j.RoundCornerIndicator_rci_selectColor, Color.parseColor("#FFFFFF"));
        this.f24479w = typedArrayObtainStyledAttributes.getColor(j.RoundCornerIndicator_rci_unselectColor, Color.parseColor("#88FFFFFF"));
        this.f24464B = typedArrayObtainStyledAttributes.getColor(j.RoundCornerIndicator_rci_strokeColor, Color.parseColor("#FFFFFF"));
        this.isSnap = typedArrayObtainStyledAttributes.getBoolean(j.RoundCornerIndicator_rci_snap, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
