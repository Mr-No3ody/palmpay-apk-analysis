package com.transsnet.palmpay.teller.ui.view;

import Pd.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/SideBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "letters", "", "setLetters", "([Ljava/lang/String;)V", "Lcom/transsnet/palmpay/teller/ui/view/SideBarView$OnLetterChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLetterChangeListener", "(Lcom/transsnet/palmpay/teller/ui/view/SideBarView$OnLetterChangeListener;)V", "letter", "setCurrentLetter", "(Ljava/lang/String;)V", "w", "Lkotlin/Lazy;", "getItemBaseHeight", "()I", "itemBaseHeight", "OnLetterChangeListener", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSideBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SideBarView.kt\ncom/transsnet/palmpay/teller/ui/view/SideBarView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1878#2,2:286\n1880#2:289\n1#3:288\n*S KotlinDebug\n*F\n+ 1 SideBarView.kt\ncom/transsnet/palmpay/teller/ui/view/SideBarView\n*L\n160#1:286,2\n160#1:289\n*E\n"})
public final class SideBarView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f34350A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f34351B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f34358g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextPaint f34359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnLetterChangeListener f34360j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f34362p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f34363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f34364w;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/SideBarView$OnLetterChangeListener;", "", "onLetterChanged", "", "letter", "", "letterIndex", "", "onLetterGone", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnLetterChangeListener {
        void onLetterChanged(@NotNull String letter, int letterIndex);

        void onLetterGone();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SideBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getItemBaseHeight() {
        return ((Number) this.f34364w.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        ViewParent parent;
        int i7;
        int i10;
        OnLetterChangeListener onLetterChangeListener;
        ViewParent parent2;
        OnLetterChangeListener onLetterChangeListener2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f34358g.isEmpty() || this.f34362p <= 0.0f) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            setBackgroundColor(this.f34356e);
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.f34351B = kotlin.ranges.b.c((int) (event.getY() / this.f34362p), 0, C1850q.g(this.f34358g));
            if (!this.f34358g.isEmpty() && (i7 = this.f34351B) >= 0 && i7 < this.f34358g.size() && (i10 = this.f34351B) != this.f34350A) {
                onLetterChangeListener = this.f34360j;
                if (onLetterChangeListener != null) {
                    onLetterChangeListener.onLetterChanged((String) this.f34358g.get(i10), this.f34351B);
                }
                this.f34350A = this.f34351B;
            }
        } else if (actionMasked == 1) {
            setBackgroundColor(this.f34357f);
            parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            this.f34351B = -1;
            this.f34350A = -1;
            onLetterChangeListener2 = this.f34360j;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        } else if (actionMasked == 2) {
            setBackgroundColor(this.f34356e);
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.f34351B = kotlin.ranges.b.c((int) (event.getY() / this.f34362p), 0, C1850q.g(this.f34358g));
            if (!this.f34358g.isEmpty()) {
                onLetterChangeListener = this.f34360j;
                if (onLetterChangeListener != null) {
                    onLetterChangeListener.onLetterChanged((String) this.f34358g.get(i10), this.f34351B);
                }
                this.f34350A = this.f34351B;
            }
        } else if (actionMasked == 3) {
            setBackgroundColor(this.f34357f);
            parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            this.f34351B = -1;
            this.f34350A = -1;
            onLetterChangeListener2 = this.f34360j;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f34358g.isEmpty() || this.f34362p <= 0.0f) {
            return;
        }
        int i7 = 0;
        for (Object obj : this.f34358g) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            String str = (String) obj;
            int i11 = this.f34351B;
            TextPaint textPaint = this.f34359i;
            if (i7 == i11) {
                textPaint.setColor(this.f34354c);
                textPaint.setTextSize(this.f34355d);
                textPaint.setFakeBoldText(true);
            } else {
                textPaint.setColor(this.f34352a);
                textPaint.setTextSize(this.f34353b);
                textPaint.setFakeBoldText(false);
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f10 = fontMetrics.descent - fontMetrics.ascent;
            if (f10 > this.f34362p) {
                textPaint.setTextSize((this.f34362p / f10) * textPaint.getTextSize());
            }
            Rect rect = new Rect();
            textPaint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, (int) ((this.f34361o / 2.0f) - (rect.width() / 2.0f)), (int) ((i7 * this.f34362p) + (rect.height() / 2.0f) + (this.f34362p / 2.0f)), textPaint);
            i7 = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size;
        if (this.f34358g.isEmpty()) {
            size = 0;
        } else {
            size = this.f34358g.size() * ((this.t * 2) + getItemBaseHeight());
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i7), View.resolveSize(size, i10));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f34361o = getMeasuredWidth();
        this.f34362p = this.f34358g.isEmpty() ? 0.0f : getHeight() / this.f34358g.size();
    }

    public final void setCurrentLetter(@NotNull String letter) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        int iIndexOf = this.f34358g.indexOf(letter);
        if (iIndexOf != this.f34351B) {
            this.f34351B = iIndexOf;
            postInvalidate();
        }
    }

    public final void setLetters(@NotNull String[] letters) {
        Intrinsics.checkNotNullParameter(letters, "letters");
        String str = (String) CollectionsKt.G(this.f34351B, this.f34358g);
        List listY = C1847n.y(letters);
        this.f34358g = listY;
        Intrinsics.checkNotNullParameter(listY, "<this>");
        this.f34351B = listY.indexOf(str);
        this.f34350A = -1;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        setBackgroundColor(this.f34357f);
        this.f34362p = this.f34358g.isEmpty() ? 0.0f : getHeight() / this.f34358g.size();
        requestLayout();
        postInvalidate();
    }

    public final void setOnLetterChangeListener(@NotNull OnLetterChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34360j = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SideBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SideBarView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SideBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34352a = CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, context);
        this.f34354c = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context);
        this.f34356e = CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, context);
        this.f34358g = z.f38935a;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        this.f34359i = textPaint;
        this.f34363v = 14.0f;
        this.f34364w = C2131j.b(new X6.c(this, 12));
        this.f34350A = -1;
        this.f34351B = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.SMSideBarView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f34357f = typedArrayObtainStyledAttributes.getColor(g.SMSideBarView_sm_normal_bg_color, this.f34357f);
        this.f34356e = typedArrayObtainStyledAttributes.getColor(g.SMSideBarView_sm_press_bg_color, this.f34356e);
        this.f34352a = typedArrayObtainStyledAttributes.getColor(g.SMSideBarView_sm_textColor, this.f34352a);
        this.f34353b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.SMSideBarView_sm_textSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        this.f34354c = typedArrayObtainStyledAttributes.getColor(g.SMSideBarView_sm_selectTextColor, this.f34354c);
        this.f34355d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.SMSideBarView_sm_selectTextSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.SMSideBarView_sm_padding, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.recycle();
        textPaint.setTextSize(this.f34353b);
    }
}
