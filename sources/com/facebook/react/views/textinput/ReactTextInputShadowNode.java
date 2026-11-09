package com.facebook.react.views.textinput;

import H3.j;
import H3.k;
import android.text.Spannable;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.N;
import com.facebook.react.R;
import com.facebook.react.common.annotations.LegacyArchitectureShadowNodeWithCxxImpl;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.YogaMeasureFunction;
import com.google.firebase.messaging.Constants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@LegacyArchitectureShadowNodeWithCxxImpl
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R.\u00109\u001a\u0004\u0018\u00010&2\b\u00108\u001a\u0004\u0018\u00010&8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010)R.\u0010>\u001a\u0004\u0018\u00010&2\b\u00108\u001a\u0004\u0018\u00010&8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<\"\u0004\b@\u0010)¨\u0006B"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputShadowNode;", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/yoga/YogaMeasureFunction;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "Landroid/widget/EditText;", "createInternalEditText", "()Landroid/widget/EditText;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "themedContext", "", "setThemedContext", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "LH3/k;", "node", "", "width", "LH3/j;", "widthMode", "height", "heightMode", "", "measure", "(LH3/k;FLH3/j;FLH3/j;)J", "", "isVirtualAnchor", "()Z", "isYogaLeafNode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setLocalData", "(Ljava/lang/Object;)V", "", "mostRecentEventCount", "setMostRecentEventCount", "(I)V", "", ViewProps.TEXT_BREAK_STRATEGY, "setTextBreakStrategy", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "uiViewOperationQueue", "onCollectExtraUpdates", "(Lcom/facebook/react/uimanager/UIViewOperationQueue;)V", "spacingType", ViewProps.PADDING, "setPadding", "(IF)V", "I", "internalEditText", "Landroid/widget/EditText;", "Lcom/facebook/react/views/textinput/ReactTextInputLocalData;", "localData", "Lcom/facebook/react/views/textinput/ReactTextInputLocalData;", "value", ReactTextInputShadowNode.PROP_TEXT, "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "setPlaceholder", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {

    @NotNull
    public static final String PROP_PLACEHOLDER = "placeholder";

    @NotNull
    public static final String PROP_TEXT = "text";

    @Nullable
    private EditText internalEditText;

    @Nullable
    private ReactTextInputLocalData localData;
    private int mostRecentEventCount;

    @Nullable
    private String placeholder;

    @Nullable
    private String text;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactTextInputShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ReactTextInputShadowNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final EditText createInternalEditText() {
        return new EditText(new ContextThemeWrapper(getThemedContext(), R.style.Theme_ReactNative_TextInput_DefaultBackground));
    }

    @Nullable
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(@NotNull k node, float width, @NotNull j widthMode, float height, @NotNull j heightMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        EditText editText = this.internalEditText;
        if (editText == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ReactTextInputLocalData reactTextInputLocalData = this.localData;
        if (reactTextInputLocalData == null) {
            editText.setTextSize(0, this.mTextAttributes.getEffectiveFontSize());
            int i7 = this.mNumberOfLines;
            if (i7 != -1) {
                editText.setLines(i7);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i10 = this.mTextBreakStrategy;
            if (breakStrategy != i10) {
                editText.setBreakStrategy(i10);
            }
        } else if (reactTextInputLocalData != null) {
            reactTextInputLocalData.apply(editText);
        }
        editText.setHint(this.placeholder);
        editText.measure(MeasureUtil.getMeasureSpec(width, widthMode), MeasureUtil.getMeasureSpec(height, heightMode));
        return p059e1.a.O(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(@NotNull UIViewOperationQueue uiViewOperationQueue) {
        Intrinsics.checkNotNullParameter(uiViewOperationQueue, "uiViewOperationQueue");
        super.onCollectExtraUpdates(uiViewOperationQueue);
        if (this.mostRecentEventCount != -1) {
            Spannable spannableSpannedFromShadowNode = spannedFromShadowNode(this, this.text, false, null);
            Intrinsics.checkNotNullExpressionValue(spannableSpannedFromShadowNode, "spannedFromShadowNode(...)");
            uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannableSpannedFromShadowNode, this.mostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        p059e1.a.d(data instanceof ReactTextInputLocalData);
        this.localData = (ReactTextInputLocalData) data;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public final void setMostRecentEventCount(int mostRecentEventCount) {
        this.mostRecentEventCount = mostRecentEventCount;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int spacingType, float padding) {
        super.setPadding(spacingType, padding);
        markUpdated();
    }

    @ReactProp(name = PROP_PLACEHOLDER)
    public final void setPlaceholder(@Nullable String str) {
        this.placeholder = str;
        markUpdated();
    }

    @ReactProp(name = PROP_TEXT)
    public final void setText(@Nullable String str) {
        this.text = str;
        markUpdated();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4.equals("simple") == false) goto L21;
     */
    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTextBreakStrategy(@org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L48
            int r1 = r4.hashCode()
            r2 = -1924829944(0xffffffff8d456d08, float:-6.0836553E-31)
            if (r1 == r2) goto L2e
            r2 = -902286926(0xffffffffca3831b2, float:-3017836.5)
            if (r1 == r2) goto L24
            r2 = 336871677(0x141440fd, float:7.484907E-27)
            if (r1 == r2) goto L17
            goto L36
        L17:
            java.lang.String r1 = "highQuality"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L20
            goto L36
        L20:
            r4 = 1
            r3.mTextBreakStrategy = r4
            return
        L24:
            java.lang.String r1 = "simple"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L48
            goto L36
        L2e:
            java.lang.String r1 = "balanced"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L44
        L36:
            java.lang.String r1 = "Invalid textBreakStrategy: "
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r1 = "ReactNative"
            p229p2.a.v(r1, r4)
            r3.mTextBreakStrategy = r0
            return
        L44:
            r4 = 2
            r3.mTextBreakStrategy = r4
            return
        L48:
            r3.mTextBreakStrategy = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputShadowNode.setTextBreakStrategy(java.lang.String):void");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(@NotNull ThemedReactContext themedContext) {
        Intrinsics.checkNotNullParameter(themedContext, "themedContext");
        super.setThemedContext(themedContext);
        EditText editTextCreateInternalEditText = createInternalEditText();
        WeakHashMap weakHashMap = N.f16168a;
        setDefaultPadding(4, editTextCreateInternalEditText.getPaddingStart());
        setDefaultPadding(1, editTextCreateInternalEditText.getPaddingTop());
        setDefaultPadding(5, editTextCreateInternalEditText.getPaddingEnd());
        setDefaultPadding(3, editTextCreateInternalEditText.getPaddingBottom());
        this.internalEditText = editTextCreateInternalEditText;
        editTextCreateInternalEditText.setPadding(0, 0, 0, 0);
        EditText editText = this.internalEditText;
        if (editText != null) {
            editText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public /* synthetic */ ReactTextInputShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @JvmOverloads
    public ReactTextInputShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mostRecentEventCount = -1;
        this.mTextBreakStrategy = 1;
        setMeasureFunction(this);
    }
}
