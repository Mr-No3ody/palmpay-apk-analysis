package com.facebook.react.views.text;

import M.q;
import N8.q0;
import Nf.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.collections.z;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003MNOB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020%J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0014J0\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u001aH\u0014J\u0016\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001aJ\u0006\u00104\u001a\u00020%J\u0010\u00105\u001a\u00020,2\u0006\u00106\u001a\u000207H\u0016J3\u00108\u001a\u0004\u0018\u0001H9\"\u0004\b\u0000\u001092\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u001a2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H90=H\u0002¢\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u001aH\u0002J\u0010\u0010@\u001a\u00020,2\u0006\u00106\u001a\u000207H\u0016J\"\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020,2\u0006\u00106\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020,H\u0016J\u0018\u0010I\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006P"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ReactCompoundView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "clickableSpans", "", "Landroid/text/style/ClickableSpan;", "selection", "Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", "value", "Lcom/facebook/react/views/text/PreparedLayout;", "preparedLayout", "getPreparedLayout", "()Lcom/facebook/react/views/text/PreparedLayout;", "setPreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;)V", "Lcom/facebook/react/uimanager/style/Overflow;", ViewProps.OVERFLOW, "getOverflow", "()Lcom/facebook/react/uimanager/style/Overflow;", "setOverflow", "(Lcom/facebook/react/uimanager/style/Overflow;)V", "selectionColor", "", "getSelectionColor", "()Ljava/lang/Integer;", "setSelectionColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", ReactTextInputShadowNode.PROP_TEXT, "", "getText", "()Ljava/lang/CharSequence;", "initView", "", "recycleView", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "l", "t", "r", "b", "setSelection", ViewProps.START, ViewProps.END, "clearSelection", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "getSpanInCoords", "T", "x", "y", "clazz", "Ljava/lang/Class;", "(IILjava/lang/Class;)Ljava/lang/Object;", "getTextOffsetAt", "dispatchHoverEvent", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "hasOverlappingRendering", "reactTagForTouch", "touchX", "", "touchY", "Api34Utils", "TextSelection", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreparedLayoutTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreparedLayoutTextView.kt\ncom/facebook/react/views/text/PreparedLayoutTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
public final class PreparedLayoutTextView extends ViewGroup implements ReactCompoundView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Paint selectionPaint = new Paint();

    @NotNull
    private List<? extends ClickableSpan> clickableSpans;

    @NotNull
    private Overflow overflow;

    @Nullable
    private PreparedLayout preparedLayout;

    @Nullable
    private TextSelection selection;

    @ColorInt
    @Nullable
    private Integer selectionColor;

    @RequiresApi(api = 34)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;", "", "<init>", "()V", "highlightPaths", "", "Landroid/graphics/Path;", "highlightPaints", "Landroid/graphics/Paint;", "draw", "", "layout", "Landroid/text/Layout;", "canvas", "Landroid/graphics/Canvas;", "selectionPath", "selectionPaint", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api34Utils {

        @NotNull
        public static final Api34Utils INSTANCE = new Api34Utils();

        @Nullable
        private static List<? extends Paint> highlightPaints;

        @Nullable
        private static List<? extends Path> highlightPaths;

        private Api34Utils() {
        }

        @DoNotInline
        public final void draw(@NotNull Layout layout, @NotNull Canvas canvas, @Nullable Path selectionPath, @Nullable Paint selectionPaint) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if (selectionPath != null) {
                if (highlightPaths == null) {
                    highlightPaths = new ArrayList();
                }
                if (highlightPaints == null) {
                    highlightPaints = new ArrayList();
                }
            }
            layout.draw(canvas, highlightPaths, highlightPaints, selectionPath, selectionPaint, 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;", "", "<init>", "()V", "selectionPaint", "Landroid/graphics/Paint;", "filterClickableSpans", "", "Landroid/text/style/ClickableSpan;", ReactTextInputShadowNode.PROP_TEXT, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ClickableSpan> filterClickableSpans(CharSequence text) {
            if (!(text instanceof Spanned)) {
                return z.f38935a;
            }
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < text.length()) {
                Spanned spanned = (Spanned) text;
                int iNextSpanTransition = spanned.nextSpanTransition(i7, text.length(), ClickableSpan.class);
                Object[] spans = spanned.getSpans(i7, iNextSpanTransition, ClickableSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                v.p(arrayList, spans);
                i7 = iNextSpanTransition;
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", "", ViewProps.START, "", ViewProps.END, "path", "Landroid/graphics/Path;", "<init>", "(IILandroid/graphics/Path;)V", "getStart", "()I", "setStart", "(I)V", "getEnd", "setEnd", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextSelection {
        private int end;

        @NotNull
        private Path path;
        private int start;

        public TextSelection(int i7, int i10, @NotNull Path path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.start = i7;
            this.end = i10;
            this.path = path;
        }

        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public final int getStart() {
            return this.start;
        }

        public final void setEnd(int i7) {
            this.end = i7;
        }

        public final void setPath(@NotNull Path path) {
            Intrinsics.checkNotNullParameter(path, "<set-?>");
            this.path = path;
        }

        public final void setStart(int i7) {
            this.start = i7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparedLayoutTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clickableSpans = z.f38935a;
        this.overflow = Overflow.HIDDEN;
        initView();
        setWillNotDraw(false);
    }

    private final <T> T getSpanInCoords(int x3, int y8, Class<T> clazz) {
        int textOffsetAt = getTextOffsetAt(x3, y8);
        if (textOffsetAt >= 0) {
            CharSequence text = getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(textOffsetAt, textOffsetAt, clazz);
                Intrinsics.e(spans);
                if (spans.length != 0) {
                    if (spans.length > 2) {
                        throw new IllegalStateException("Check failed.");
                    }
                    q qVarA = AbstractC1859i.a(spans);
                    while (qVarA.hasNext()) {
                        T t = (T) qVarA.next();
                        int spanFlags = spanned.getSpanFlags(t);
                        int i7 = spanFlags & 18;
                        int spanStart = (i7 == 0 && (spanFlags & 17) == 0) ? spanned.getSpanStart(t) + 1 : spanned.getSpanStart(t);
                        int spanEnd = (i7 == 0 && (spanFlags & 34) == 0) ? spanned.getSpanEnd(t) - 1 : spanned.getSpanEnd(t);
                        if (textOffsetAt >= spanStart && textOffsetAt <= spanEnd) {
                            return t;
                        }
                    }
                }
            }
        }
        return null;
    }

    private final int getTextOffsetAt(int x3, int y8) {
        Layout layout;
        float paragraphRight;
        float lineLeft;
        int paddingLeft = x3 - getPaddingLeft();
        int paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        int iB = y8 - (paddingTop + (preparedLayout != null ? b.b(preparedLayout.getVerticalOffset()) : 0));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        if (preparedLayout2 != null && (layout = preparedLayout2.getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(iB);
            if (layout.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
                lineLeft = layout.getLineLeft(lineForVertical);
                paragraphRight = layout.getLineRight(lineForVertical);
            } else {
                boolean z3 = layout.getParagraphDirection(lineForVertical) == -1;
                float width = z3 ? layout.getWidth() - layout.getLineMax(lineForVertical) : layout.getParagraphLeft(lineForVertical);
                paragraphRight = z3 ? layout.getParagraphRight(lineForVertical) : layout.getLineMax(lineForVertical);
                lineLeft = width;
            }
            float f10 = paddingLeft;
            if (f10 >= lineLeft && f10 <= paragraphRight) {
                try {
                    return layout.getOffsetForHorizontal(lineForVertical, f10);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return -1;
    }

    private final void initView() {
        this.clickableSpans = z.f38935a;
        this.selection = null;
        setPreparedLayout(null);
    }

    public final void clearSelection() {
        this.selection = null;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C1050b c1050bD = N.d(this);
        return ((c1050bD instanceof ReactTextViewAccessibilityDelegate) && ((ReactTextViewAccessibilityDelegate) c1050bD).dispatchKeyEvent(event)) || super.dispatchKeyEvent(event);
    }

    @NotNull
    public final Overflow getOverflow() {
        return this.overflow;
    }

    @Nullable
    public final PreparedLayout getPreparedLayout() {
        return this.preparedLayout;
    }

    @Nullable
    public final Integer getSelectionColor() {
        return this.selectionColor;
    }

    @DoNotStrip
    @Nullable
    public final CharSequence getText() {
        Layout layout;
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int defaultTextColorHighlight;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.overflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        canvas.translate(paddingLeft, paddingTop + (preparedLayout != null ? preparedLayout.getVerticalOffset() : 0.0f));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        Layout layout = preparedLayout2 != null ? preparedLayout2.getLayout() : null;
        if (layout != null) {
            if (this.selection != null) {
                Paint paint = selectionPaint;
                Integer num = this.selectionColor;
                if (num != null) {
                    defaultTextColorHighlight = num.intValue();
                } else {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    defaultTextColorHighlight = DefaultStyleValuesUtil.getDefaultTextColorHighlight(context);
                }
                paint.setColor(defaultTextColorHighlight);
            }
            if (Build.VERSION.SDK_INT < 34) {
                TextSelection textSelection = this.selection;
                layout.draw(canvas, textSelection != null ? textSelection.getPath() : null, selectionPaint, 0);
            } else {
                Api34Utils api34Utils = Api34Utils.INSTANCE;
                TextSelection textSelection2 = this.selection;
                api34Utils.draw(layout, canvas, textSelection2 != null ? textSelection2.getPath() : null, selectionPaint);
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        if (!this.clickableSpans.isEmpty() && !gainFocus) {
            clearSelection();
        }
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        C1050b c1050bD = N.d(this);
        if (c1050bD == null || !(c1050bD instanceof ReactTextViewAccessibilityDelegate)) {
            return;
        }
        ((ReactTextViewAccessibilityDelegate) c1050bD).onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l5, int t, int r3, int b7) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled() || this.clickableSpans.isEmpty()) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 3) {
            clearSelection();
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) getSpanInCoords((int) event.getX(), (int) event.getY(), ClickableSpan.class);
        if (clickableSpan == null) {
            clearSelection();
            return super.onTouchEvent(event);
        }
        if (actionMasked == 0) {
            PreparedLayout preparedLayout = this.preparedLayout;
            if (preparedLayout == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Layout layout = preparedLayout.getLayout();
            CharSequence text = layout.getText();
            Intrinsics.f(text, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text).getSpanStart(clickableSpan);
            CharSequence text2 = layout.getText();
            Intrinsics.f(text2, "null cannot be cast to non-null type android.text.Spanned");
            setSelection(spanStart, ((Spanned) text2).getSpanEnd(clickableSpan));
        } else if (actionMasked == 1) {
            clearSelection();
            clickableSpan.onClick(this);
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float touchX, float touchY) {
        ReactTagSpan reactTagSpan = (ReactTagSpan) getSpanInCoords(b.b(touchX), b.b(touchY), ReactTagSpan.class);
        return reactTagSpan != null ? reactTagSpan.getReactTag() : getId();
    }

    public final void recycleView() {
        initView();
        BackgroundStyleApplicator.reset(this);
        setOverflow(Overflow.HIDDEN);
    }

    public final void setOverflow(@NotNull Overflow value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.overflow != value) {
            this.overflow = value;
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    public final void setPreparedLayout(@Nullable PreparedLayout preparedLayout) {
        List<? extends ClickableSpan> listFilterClickableSpans;
        Layout layout;
        CharSequence text;
        Layout layout2;
        if (Intrinsics.c(this.preparedLayout, preparedLayout)) {
            return;
        }
        TextSelection textSelection = this.selection;
        if (textSelection != null) {
            if (preparedLayout == null) {
                clearSelection();
            } else {
                PreparedLayout preparedLayout2 = this.preparedLayout;
                if (String.valueOf((preparedLayout2 == null || (layout2 = preparedLayout2.getLayout()) == null) ? null : layout2.getText()).equals(preparedLayout.getLayout().getText().toString())) {
                    preparedLayout.getLayout().getSelectionPath(textSelection.getStart(), textSelection.getEnd(), textSelection.getPath());
                } else {
                    clearSelection();
                }
            }
        }
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null || (text = layout.getText()) == null || (listFilterClickableSpans = Companion.filterClickableSpans(text)) == null) {
            listFilterClickableSpans = z.f38935a;
        }
        this.clickableSpans = listFilterClickableSpans;
        this.preparedLayout = preparedLayout;
        invalidate();
    }

    public final void setSelection(int start, int end) {
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Layout layout = preparedLayout.getLayout();
        if (start < 0 || end > layout.getText().length() || start >= end) {
            int length = layout.getText().length();
            StringBuilder sbP = q0.p(start, "setSelection start and end are not in valid range. start: ", end, ", end: ", ", text length: ");
            sbP.append(length);
            throw new IllegalArgumentException(sbP.toString());
        }
        TextSelection textSelection = this.selection;
        if (textSelection == null) {
            Path path = new Path();
            layout.getSelectionPath(start, end, path);
            this.selection = new TextSelection(start, end, path);
        } else {
            textSelection.setStart(start);
            textSelection.setEnd(end);
            layout.getSelectionPath(start, end, textSelection.getPath());
        }
        invalidate();
    }

    public final void setSelectionColor(@Nullable Integer num) {
        this.selectionColor = num;
    }
}
