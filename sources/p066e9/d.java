package p066e9;

import F8.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36222e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f36227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f36228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f36229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[][] f36233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36234q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f36223f = {null, null};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f36224g = {-1, -1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f36235r = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    public d(Context context, int i7) {
        b bVarA = null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        this.f36229l = i10;
        this.f36230m = displayMetrics.heightPixels;
        int i11 = 0;
        this.f36218a = 0;
        int i12 = i10 / 10;
        this.f36219b = i12;
        this.f36221d = 0;
        this.f36220c = i12;
        ArrayList arrayList = new ArrayList();
        this.f36227j = arrayList;
        this.f36228k = new ArrayList();
        XmlResourceParser xml = context.getResources().getXml(i7);
        Resources resources = context.getResources();
        c cVar = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            try {
                int next = xml.next();
                if (next == 1) {
                    break;
                }
                int i17 = i11;
                if (next == 2) {
                    String name = xml.getName();
                    if ("Row".equals(name)) {
                        c cVarB = b(resources, xml);
                        this.f36235r.add(cVarB);
                        int i18 = cVarB.f36216g;
                        if (i18 == 0 || i18 == 0) {
                            cVar = cVarB;
                            i15 = 1;
                            i16 = i17;
                        } else {
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || (next2 == 3 && xml.getName().equals("Row"))) {
                                    break;
                                }
                            }
                            cVar = cVarB;
                            i15 = i17;
                            i16 = i15;
                        }
                    } else if ("Key".equals(name)) {
                        bVarA = a(resources, cVar, i16, i13, xml);
                        arrayList.add(bVarA);
                        int i19 = bVarA.f36192a[i17];
                        ArrayList arrayList2 = this.f36228k;
                        if (i19 == -1) {
                            int i20 = i17;
                            while (true) {
                                b[] bVarArr = this.f36223f;
                                if (i20 >= bVarArr.length) {
                                    break;
                                }
                                if (bVarArr[i20] == null) {
                                    bVarArr[i20] = bVarA;
                                    this.f36224g[i20] = arrayList.size() - 1;
                                    break;
                                }
                                i20++;
                            }
                            arrayList2.add(bVarA);
                        } else if (i19 == -6) {
                            arrayList2.add(bVarA);
                        }
                        cVar.f36214e.add(bVarA);
                        i14 = 1;
                    } else if ("Keyboard".equals(name)) {
                        d(resources, xml);
                    }
                    i11 = i17;
                } else if (next != 3) {
                    i11 = i17;
                } else if (i14 != 0) {
                    i16 += bVarA.f36198g + bVarA.f36196e;
                    if (i16 > this.f36226i) {
                        this.f36226i = i16;
                    }
                    i11 = i17;
                    i14 = i11;
                } else if (i15 != 0) {
                    i13 = i13 + cVar.f36213d + cVar.f36211b;
                    i11 = i17;
                    i15 = i11;
                } else {
                    i11 = i17;
                }
            } catch (Exception e10) {
                F6.d.c("Keyboard", "Parse error:" + e10);
                e10.printStackTrace();
            }
        }
        this.f36225h = i13 - this.f36221d;
    }

    public static b a(Resources resources, c cVar, int i7, int i10, XmlResourceParser xmlResourceParser) {
        int i11;
        b bVar = new b(cVar);
        bVar.f36200i = i7;
        bVar.f36201j = i10;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i.Keyboard);
        bVar.f36196e = c(typedArrayObtainAttributes, i.Keyboard_keyWidth, bVar.f36207p.f36229l, cVar.f36210a);
        bVar.f36197f = c(typedArrayObtainAttributes, i.Keyboard_keyHeight, bVar.f36207p.f36230m, cVar.f36211b);
        int iC = c(typedArrayObtainAttributes, i.Keyboard_horizontalGap, bVar.f36207p.f36229l, cVar.f36212c);
        bVar.f36198g = iC;
        typedArrayObtainAttributes.recycle();
        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i.Keyboard_Key);
        bVar.f36200i += iC;
        TypedValue typedValue = new TypedValue();
        typedArrayObtainAttributes2.getValue(i.Keyboard_Key_codes, typedValue);
        int i12 = typedValue.type;
        if (i12 == 16 || i12 == 17) {
            bVar.f36192a = new int[]{typedValue.data};
        } else if (i12 == 3) {
            String string = typedValue.string.toString();
            if (string.length() > 0) {
                i11 = 1;
                int iIndexOf = 0;
                while (true) {
                    iIndexOf = string.indexOf(",", iIndexOf + 1);
                    if (iIndexOf <= 0) {
                        break;
                    }
                    i11++;
                }
            } else {
                i11 = 0;
            }
            int[] iArr = new int[i11];
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            int i13 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                int i14 = i13 + 1;
                try {
                    iArr[i13] = Integer.parseInt(stringTokenizer.nextToken());
                } catch (NumberFormatException unused) {
                    F6.d.c("Keyboard", "Error parsing keycodes ".concat(string));
                }
                i13 = i14;
            }
            bVar.f36192a = iArr;
        }
        Drawable drawable = typedArrayObtainAttributes2.getDrawable(i.Keyboard_Key_iconPreview);
        bVar.f36195d = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        bVar.f36205n = typedArrayObtainAttributes2.getText(i.Keyboard_Key_popupCharacters);
        bVar.f36208q = typedArrayObtainAttributes2.getResourceId(i.Keyboard_Key_popupKeyboard, 0);
        bVar.f36209r = typedArrayObtainAttributes2.getBoolean(i.Keyboard_Key_isRepeatable, false);
        typedArrayObtainAttributes2.getBoolean(i.Keyboard_Key_isModifier, false);
        bVar.f36199h = typedArrayObtainAttributes2.getBoolean(i.Keyboard_Key_isSticky, false);
        bVar.f36206o = cVar.f36215f | typedArrayObtainAttributes2.getInt(i.Keyboard_Key_keyEdgeFlags, 0);
        Drawable drawable2 = typedArrayObtainAttributes2.getDrawable(i.Keyboard_Key_keyIcon);
        bVar.f36194c = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
        bVar.f36193b = typedArrayObtainAttributes2.getText(i.Keyboard_Key_keyLabel);
        bVar.f36204m = typedArrayObtainAttributes2.getText(i.Keyboard_Key_keyOutputText);
        if (bVar.f36192a == null && !TextUtils.isEmpty(bVar.f36193b)) {
            bVar.f36192a = new int[]{bVar.f36193b.charAt(0)};
        }
        typedArrayObtainAttributes2.recycle();
        return bVar;
    }

    public static int c(TypedArray typedArray, int i7, int i10, int i11) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                return typedArray.getDimensionPixelOffset(i7, i11);
            }
            if (i12 == 6) {
                return Math.round(typedArray.getFraction(i7, i10, i10, i11));
            }
        }
        return i11;
    }

    public final c b(Resources resources, XmlResourceParser xmlResourceParser) {
        c cVar = new c();
        cVar.f36214e = new ArrayList();
        cVar.f36217h = this;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i.Keyboard);
        int i7 = i.Keyboard_keyWidth;
        int i10 = this.f36219b;
        int i11 = this.f36229l;
        cVar.f36210a = c(typedArrayObtainAttributes, i7, i11, i10);
        int i12 = i.Keyboard_keyHeight;
        int i13 = this.f36220c;
        int i14 = this.f36230m;
        cVar.f36211b = c(typedArrayObtainAttributes, i12, i14, i13);
        cVar.f36212c = c(typedArrayObtainAttributes, i.Keyboard_horizontalGap, i11, this.f36218a);
        cVar.f36213d = c(typedArrayObtainAttributes, i.Keyboard_verticalGap, i14, this.f36221d);
        typedArrayObtainAttributes.recycle();
        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i.Keyboard_Row);
        cVar.f36215f = typedArrayObtainAttributes2.getInt(i.Keyboard_Row_rowEdgeFlags, 0);
        cVar.f36216g = typedArrayObtainAttributes2.getResourceId(i.Keyboard_Row_keyboardMode, 0);
        return cVar;
    }

    public final void d(Resources resources, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i.Keyboard);
        int i7 = i.Keyboard_keyWidth;
        int i10 = this.f36229l;
        this.f36219b = c(typedArrayObtainAttributes, i7, i10, i10 / 10);
        int i11 = i.Keyboard_keyHeight;
        int i12 = this.f36230m;
        this.f36220c = c(typedArrayObtainAttributes, i11, i12, 50);
        this.f36218a = c(typedArrayObtainAttributes, i.Keyboard_horizontalGap, i10, 0);
        this.f36221d = c(typedArrayObtainAttributes, i.Keyboard_verticalGap, i12, 0);
        int i13 = (int) (this.f36219b * 1.8f);
        this.f36234q = i13 * i13;
        typedArrayObtainAttributes.recycle();
    }
}
