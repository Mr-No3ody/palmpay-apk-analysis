package com.facebook.react.uimanager;

import H3.f;
import H3.h;
import H3.i;
import H3.m;
import H3.n;
import H3.o;
import H3.p;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

/* JADX INFO: loaded from: classes.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    boolean mCollapsable;
    private final MutableYogaValue mTempYogaValue = new MutableYogaValue(0);

    /* JADX INFO: renamed from: com.facebook.react.uimanager.LayoutShadowNode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[o.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class MutableYogaValue {
        o unit;
        float value;

        public /* synthetic */ MutableYogaValue(int i7) {
            this();
        }

        public void setFromDynamic(Dynamic dynamic) {
            boolean zIsNull = dynamic.isNull();
            o oVar = o.UNDEFINED;
            if (zIsNull) {
                this.unit = oVar;
                this.value = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.unit = o.POINT;
                    this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
                    return;
                } else {
                    this.unit = oVar;
                    this.value = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.unit = o.AUTO;
                this.value = Float.NaN;
            } else if (strAsString.endsWith("%")) {
                this.unit = o.PERCENT;
                this.value = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
            } else {
                p229p2.a.v("ReactNative", "Unknown value: ".concat(strAsString));
                this.unit = oVar;
                this.value = Float.NaN;
            }
        }

        private MutableYogaValue() {
        }

        private MutableYogaValue(MutableYogaValue mutableYogaValue) {
            this.value = mutableYogaValue.value;
            this.unit = mutableYogaValue.unit;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    private int maybeTransformLeftRightToStartEnd(int i7) {
        if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(getThemedContext())) {
            if (i7 == 0) {
                return 4;
            }
            if (i7 == 2) {
                return 5;
            }
        }
        return i7;
    }

    @ReactProp(name = ViewProps.ALIGN_CONTENT)
    public void setAlignContent(@Nullable String str) {
        if (isVirtual()) {
        }
        H3.a aVar = H3.a.FLEX_START;
        if (str == null) {
            setAlignContent(aVar);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignContent(H3.a.STRETCH);
                break;
            case "baseline":
                setAlignContent(H3.a.BASELINE);
                break;
            case "center":
                setAlignContent(H3.a.CENTER);
                break;
            case "flex-start":
                setAlignContent(aVar);
                break;
            case "auto":
                setAlignContent(H3.a.AUTO);
                break;
            case "space-between":
                setAlignContent(H3.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignContent(H3.a.FLEX_END);
                break;
            case "space-around":
                setAlignContent(H3.a.SPACE_AROUND);
                break;
            case "space-evenly":
                setAlignContent(H3.a.SPACE_EVENLY);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for alignContent: ".concat(str));
                setAlignContent(aVar);
                break;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_ITEMS)
    public void setAlignItems(@Nullable String str) {
        if (isVirtual()) {
        }
        H3.a aVar = H3.a.STRETCH;
        if (str == null) {
            setAlignItems(aVar);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignItems(aVar);
                break;
            case "baseline":
                setAlignItems(H3.a.BASELINE);
                break;
            case "center":
                setAlignItems(H3.a.CENTER);
                break;
            case "flex-start":
                setAlignItems(H3.a.FLEX_START);
                break;
            case "auto":
                setAlignItems(H3.a.AUTO);
                break;
            case "space-between":
                setAlignItems(H3.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignItems(H3.a.FLEX_END);
                break;
            case "space-around":
                setAlignItems(H3.a.SPACE_AROUND);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for alignItems: ".concat(str));
                setAlignItems(aVar);
                break;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_SELF)
    public void setAlignSelf(@Nullable String str) {
        if (isVirtual()) {
        }
        H3.a aVar = H3.a.AUTO;
        if (str == null) {
            setAlignSelf(aVar);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignSelf(H3.a.STRETCH);
                break;
            case "baseline":
                setAlignSelf(H3.a.BASELINE);
                break;
            case "center":
                setAlignSelf(H3.a.CENTER);
                break;
            case "flex-start":
                setAlignSelf(H3.a.FLEX_START);
                break;
            case "auto":
                setAlignSelf(aVar);
                break;
            case "space-between":
                setAlignSelf(H3.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignSelf(H3.a.FLEX_END);
                break;
            case "space-around":
                setAlignSelf(H3.a.SPACE_AROUND);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for alignSelf: ".concat(str));
                setAlignSelf(aVar);
                break;
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f10) {
        setStyleAspectRatio(f10);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
    public void setBorderWidths(int i7, float f10) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[i7]), PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(boolean z3) {
        this.mCollapsable = z3;
    }

    @ReactProp(name = ViewProps.COLLAPSABLE_CHILDREN)
    public void setCollapsableChildren(boolean z3) {
    }

    @ReactProp(name = ViewProps.COLUMN_GAP)
    public void setColumnGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            setColumnGap(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setColumnGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "display")
    public void setDisplay(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        f fVar = f.FLEX;
        if (str == null) {
            setDisplay(fVar);
            return;
        }
        if (str.equals(ViewProps.FLEX)) {
            setDisplay(fVar);
        } else if (str.equals(ViewProps.NONE)) {
            setDisplay(f.NONE);
        } else {
            p229p2.a.v("ReactNative", "invalid value for display: ".concat(str));
            setDisplay(fVar);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX)
    public void setFlex(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f10);
    }

    @ReactProp(name = ViewProps.FLEX_BASIS)
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setFlexBasis(this.mTempYogaValue.value);
        } else if (i7 == 3) {
            setFlexBasisAuto();
        } else if (i7 == 4) {
            setFlexBasisPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.FLEX_DIRECTION)
    public void setFlexDirection(@Nullable String str) {
        if (isVirtual()) {
        }
        h hVar = h.COLUMN;
        if (str == null) {
            setFlexDirection(hVar);
            return;
        }
        switch (str) {
            case "row-reverse":
                setFlexDirection(h.ROW_REVERSE);
                break;
            case "column":
                setFlexDirection(hVar);
                break;
            case "row":
                setFlexDirection(h.ROW);
                break;
            case "column-reverse":
                setFlexDirection(h.COLUMN_REVERSE);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for flexDirection: ".concat(str));
                setFlexDirection(hVar);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_GROW)
    public void setFlexGrow(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_SHRINK)
    public void setFlexShrink(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f10);
    }

    @ReactProp(name = ViewProps.FLEX_WRAP)
    public void setFlexWrap(@Nullable String str) {
        if (isVirtual()) {
        }
        p pVar = p.NO_WRAP;
        if (str == null) {
            setFlexWrap(pVar);
            return;
        }
        switch (str) {
            case "nowrap":
                setFlexWrap(pVar);
                break;
            case "wrap-reverse":
                setFlexWrap(p.WRAP_REVERSE);
                break;
            case "wrap":
                setFlexWrap(p.WRAP);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for flexWrap: ".concat(str));
                setFlexWrap(pVar);
                break;
        }
    }

    @ReactProp(name = ViewProps.GAP)
    public void setGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            setGap(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleHeight(this.mTempYogaValue.value);
        } else if (i7 == 3) {
            setStyleHeightAuto();
        } else if (i7 == 4) {
            setStyleHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i7, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i7, Dynamic dynamic) {
    }

    @ReactProp(name = ViewProps.JUSTIFY_CONTENT)
    public void setJustifyContent(@Nullable String str) {
        if (isVirtual()) {
        }
        i iVar = i.FLEX_START;
        if (str == null) {
            setJustifyContent(iVar);
            return;
        }
        switch (str) {
            case "center":
                setJustifyContent(i.CENTER);
                break;
            case "flex-start":
                setJustifyContent(iVar);
                break;
            case "space-between":
                setJustifyContent(i.SPACE_BETWEEN);
                break;
            case "flex-end":
                setJustifyContent(i.FLEX_END);
                break;
            case "space-around":
                setJustifyContent(i.SPACE_AROUND);
                break;
            case "space-evenly":
                setJustifyContent(i.SPACE_EVENLY);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for justifyContent: ".concat(str));
                setJustifyContent(iVar);
                break;
        }
    }

    @ReactPropGroup(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i7, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i7, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i7, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setMargin(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i10 == 3) {
            setMarginAuto(iMaybeTransformLeftRightToStartEnd);
        } else if (i10 == 4) {
            setMarginPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_HEIGHT)
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMaxHeight(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setStyleMaxHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_WIDTH)
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMaxWidth(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setStyleMaxWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_HEIGHT)
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMinHeight(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setStyleMinHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_WIDTH)
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMinWidth(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setStyleMinWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(@Nullable String str) {
        if (isVirtual()) {
        }
        m mVar = m.VISIBLE;
        if (str == null) {
            setOverflow(mVar);
            return;
        }
        switch (str) {
            case "hidden":
                setOverflow(m.HIDDEN);
                break;
            case "scroll":
                setOverflow(m.SCROLL);
                break;
            case "visible":
                setOverflow(mVar);
                break;
            default:
                p229p2.a.v("ReactNative", "invalid value for overflow: ".concat(str));
                setOverflow(mVar);
                break;
        }
    }

    @ReactPropGroup(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i7, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i7, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i7, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setPadding(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setPaddingPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.POSITION)
    public void setPosition(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        n nVar = n.RELATIVE;
        if (str == null) {
            setPositionType(nVar);
            return;
        }
        if (str.equals("relative")) {
            setPositionType(nVar);
        } else if (str.equals("absolute")) {
            setPositionType(n.ABSOLUTE);
        } else {
            p229p2.a.v("ReactNative", "invalid value for position: ".concat(str));
            setPositionType(nVar);
        }
    }

    @ReactPropGroup(names = {ViewProps.START, ViewProps.END, ViewProps.LEFT, ViewProps.RIGHT, ViewProps.TOP, ViewProps.BOTTOM})
    public void setPositionValues(int i7, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i7]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setPosition(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setPositionPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.ROW_GAP)
    public void setRowGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            setRowGap(this.mTempYogaValue.value);
        } else if (i7 == 4) {
            setRowGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z3) {
        super.setShouldNotifyOnLayout(z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER)
    public void setShouldNotifyPointerEnter(boolean z3) {
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE)
    public void setShouldNotifyPointerLeave(boolean z3) {
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE)
    public void setShouldNotifyPointerMove(boolean z3) {
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleWidth(this.mTempYogaValue.value);
        } else if (i7 == 3) {
            setStyleWidthAuto();
        } else if (i7 == 4) {
            setStyleWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }
}
