package com.flexibank.sdk.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.flexibank.sdk.t;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankSideBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "letters", "", "setLetters", "([Ljava/lang/String;)V", "letter", "setCurrentLetter", "(Ljava/lang/String;)V", "Lcom/flexibank/sdk/customview/FlexiBankSideBarView$OnLetterChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLetterChangeListener", "(Lcom/flexibank/sdk/customview/FlexiBankSideBarView$OnLetterChangeListener;)V", "OnLetterChangeListener", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankSideBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankSideBarView.kt\ncom/flexibank/sdk/customview/FlexiBankSideBarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1#2:178\n1872#3,3:179\n*S KotlinDebug\n*F\n+ 1 FlexiBankSideBarView.kt\ncom/flexibank/sdk/customview/FlexiBankSideBarView\n*L\n98#1:179,3\n*E\n"})
public final class FlexiBankSideBarView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f22179A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22186g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f22187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextPaint f22188j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f22189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnLetterChangeListener f22190p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22192w;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankSideBarView$OnLetterChangeListener;", "", "onLetterChanged", "", "letter", "", "letterIndex", "", "onLetterGone", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnLetterChangeListener {
        void onLetterChanged(@NotNull String letter, int letterIndex);

        void onLetterGone();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankSideBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f22187i.isEmpty() || this.t <= 0.0f) {
            return;
        }
        int i7 = 0;
        for (Object obj : this.f22187i) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            String str = (String) obj;
            boolean z3 = i7 == this.f22192w;
            TextPaint textPaint = this.f22188j;
            textPaint.setColor(z3 ? this.f22182c : this.f22180a);
            textPaint.setTextSize(z3 ? this.f22183d : this.f22181b);
            textPaint.setFakeBoldText(z3);
            int length = str.length();
            Rect rect = this.f22189o;
            textPaint.getTextBounds(str, 0, length, rect);
            float width = (getWidth() - rect.width()) / 2.0f;
            float f10 = this.t;
            canvas.drawText(str, width, ((f10 + rect.height()) / 2.0f) + (i7 * f10), textPaint);
            i7 = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i7), View.resolveSize(((this.f22186g * 2) + this.f22179A) * this.f22187i.size(), i10));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.t = this.f22187i.isEmpty() ? 0.0f : i10 / this.f22187i.size();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        int iC;
        OnLetterChangeListener onLetterChangeListener;
        OnLetterChangeListener onLetterChangeListener2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f22187i.isEmpty() || this.t <= 0.0f) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            setBackgroundColor(this.f22184e);
            iC = kotlin.ranges.b.c((int) (event.getY() / this.t), 0, C1850q.g(this.f22187i));
            this.f22192w = iC;
            if (iC != this.f22191v) {
                onLetterChangeListener = this.f22190p;
                if (onLetterChangeListener != null) {
                    onLetterChangeListener.onLetterChanged((String) this.f22187i.get(iC), iC);
                }
                this.f22191v = iC;
            }
        } else if (actionMasked == 1) {
            if (event.getActionMasked() == 1) {
                super.performClick();
            }
            setBackgroundColor(this.f22185f);
            this.f22192w = -1;
            this.f22191v = -1;
            onLetterChangeListener2 = this.f22190p;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        } else if (actionMasked == 2) {
            setBackgroundColor(this.f22184e);
            iC = kotlin.ranges.b.c((int) (event.getY() / this.t), 0, C1850q.g(this.f22187i));
            this.f22192w = iC;
            if (iC != this.f22191v) {
                onLetterChangeListener = this.f22190p;
                if (onLetterChangeListener != null) {
                    onLetterChangeListener.onLetterChanged((String) this.f22187i.get(iC), iC);
                }
                this.f22191v = iC;
            }
        } else if (actionMasked == 3) {
            if (event.getActionMasked() == 1) {
                super.performClick();
            }
            setBackgroundColor(this.f22185f);
            this.f22192w = -1;
            this.f22191v = -1;
            onLetterChangeListener2 = this.f22190p;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setCurrentLetter(@NotNull String letter) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        int iIndexOf = this.f22187i.indexOf(letter);
        if (iIndexOf < 0 || iIndexOf == this.f22192w) {
            return;
        }
        this.f22192w = iIndexOf;
        invalidate();
    }

    public final void setLetters(@NotNull String[] letters) {
        Intrinsics.checkNotNullParameter(letters, "letters");
        this.f22187i = C1847n.y(letters);
        this.f22192w = -1;
        this.f22191v = -1;
        requestLayout();
        invalidate();
    }

    public final void setOnLetterChangeListener(@NotNull OnLetterChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22190p = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankSideBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankSideBarView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankSideBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = Color.parseColor("#969696");
        this.f22180a = color;
        int iApplyDimension = (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics());
        this.f22181b = iApplyDimension;
        int color2 = Color.parseColor("#FF0000");
        this.f22182c = color2;
        int iApplyDimension2 = (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics());
        this.f22183d = iApplyDimension2;
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f22186g = iApplyDimension3;
        this.f22187i = z.f38935a;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        this.f22188j = textPaint;
        this.f22189o = new Rect();
        this.f22191v = -1;
        this.f22192w = -1;
        this.f22179A = (int) TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.fb_SideBarView, i7, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f22185f = typedArrayObtainStyledAttributes.getColor(t.fb_SideBarView_fb_sidebar_normal_background_color, 0);
            this.f22184e = typedArrayObtainStyledAttributes.getColor(t.fb_SideBarView_fb_sidebar_pressed_background_color, 0);
            this.f22180a = typedArrayObtainStyledAttributes.getColor(t.fb_SideBarView_fb_sidebar_text_color, color);
            this.f22181b = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_SideBarView_fb_sidebar_text_size, iApplyDimension);
            this.f22182c = typedArrayObtainStyledAttributes.getColor(t.fb_SideBarView_fb_sidebar_selected_text_color, color2);
            this.f22183d = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_SideBarView_fb_sidebar_selected_text_size, iApplyDimension2);
            this.f22186g = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_SideBarView_fb_sidebar_item_padding, iApplyDimension3);
            typedArrayObtainStyledAttributes.recycle();
        }
        textPaint.setTextSize(this.f22181b);
        setBackgroundColor(this.f22185f);
    }
}
