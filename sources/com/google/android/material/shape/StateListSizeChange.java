package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class StateListSizeChange {
    private static final int INITIAL_CAPACITY = 10;

    @NonNull
    private SizeChange defaultSizeChange;
    int stateCount;

    @NonNull
    int[][] stateSpecs = new int[10][];

    @NonNull
    SizeChange[] sizeChanges = new SizeChange[10];

    public static class SizeChangeAmount {
        float amount;
        SizeChangeType type;

        public SizeChangeAmount(SizeChangeType sizeChangeType, float f10) {
            this.type = sizeChangeType;
            this.amount = f10;
        }

        public int getChange(@Px int i7) {
            SizeChangeType sizeChangeType = this.type;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.amount * i7);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.amount;
            }
            return 0;
        }
    }

    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    private void addStateSizeChange(@NonNull int[] iArr, @NonNull SizeChange sizeChange) {
        int i7 = this.stateCount;
        if (i7 == 0 || iArr.length == 0) {
            this.defaultSizeChange = sizeChange;
        }
        if (i7 >= this.stateSpecs.length) {
            growArray(i7, i7 + 10);
        }
        int[][] iArr2 = this.stateSpecs;
        int i10 = this.stateCount;
        iArr2[i10] = iArr;
        this.sizeChanges[i10] = sizeChange;
        this.stateCount = i10 + 1;
    }

    @Nullable
    public static StateListSizeChange create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i7) {
        int next;
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    stateListSizeChange.loadSizeChangeFromItems(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Nullable
    private SizeChangeAmount getSizeChangeAmount(@NonNull TypedArray typedArray, int i7, @Nullable SizeChangeAmount sizeChangeAmount) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new SizeChangeAmount(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new SizeChangeAmount(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return sizeChangeAmount;
    }

    private void growArray(int i7, int i10) {
        int[][] iArr = new int[i10][];
        System.arraycopy(this.stateSpecs, 0, iArr, 0, i7);
        this.stateSpecs = iArr;
        SizeChange[] sizeChangeArr = new SizeChange[i10];
        System.arraycopy(this.sizeChanges, 0, sizeChangeArr, 0, i7);
        this.sizeChanges = sizeChangeArr;
    }

    private int indexOfStateSet(int[] iArr) {
        int[][] iArr2 = this.stateSpecs;
        for (int i7 = 0; i7 < this.stateCount; i7++) {
            if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                return i7;
            }
        }
        return -1;
    }

    private void loadSizeChangeFromItems(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R.styleable.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, R.styleable.StateListSizeChange, 0, 0);
                SizeChangeAmount sizeChangeAmount = getSizeChangeAmount(typedArrayObtainAttributes, R.styleable.StateListSizeChange_widthChange, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i7 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i11 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i7] = attributeNameResource;
                        i7 = i11;
                    }
                }
                addStateSizeChange(StateSet.trimStateSet(iArr, i7), new SizeChange(sizeChangeAmount));
            }
        }
    }

    @NonNull
    public SizeChange getDefaultSizeChange() {
        return this.defaultSizeChange;
    }

    public int getMaxWidthChange(@Px int i7) {
        float fMax;
        int i10 = -i7;
        for (int i11 = 0; i11 < this.stateCount; i11++) {
            SizeChangeAmount sizeChangeAmount = this.sizeChanges[i11].widthChange;
            SizeChangeType sizeChangeType = sizeChangeAmount.type;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i10, sizeChangeAmount.amount);
            } else {
                if (sizeChangeType == SizeChangeType.PERCENT) {
                    fMax = Math.max(i10, i7 * sizeChangeAmount.amount);
                }
            }
            i10 = (int) fMax;
        }
        return i10;
    }

    @NonNull
    public SizeChange getSizeChangeForState(@NonNull int[] iArr) {
        int iIndexOfStateSet = indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        return iIndexOfStateSet < 0 ? this.defaultSizeChange : this.sizeChanges[iIndexOfStateSet];
    }

    public boolean isStateful() {
        return this.stateCount > 1;
    }

    public static class SizeChange {

        @Nullable
        public SizeChangeAmount widthChange;

        public SizeChange(@Nullable SizeChangeAmount sizeChangeAmount) {
            this.widthChange = sizeChangeAmount;
        }

        public SizeChange(@NonNull SizeChange sizeChange) {
            SizeChangeAmount sizeChangeAmount = sizeChange.widthChange;
            this.widthChange = new SizeChangeAmount(sizeChangeAmount.type, sizeChangeAmount.amount);
        }
    }
}
