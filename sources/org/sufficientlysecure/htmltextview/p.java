package org.sufficientlysecure.htmltextview;

import android.graphics.Color;
import android.text.Editable;
import android.text.Layout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.camera.video.u;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements WrapperTagHandler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f41137f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BulletSpan f41138g = new BulletSpan(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Stack f41139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Stack f41140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f41141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f41143e;

    public static Object b(Editable editable, Class cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        for (int length = spans.length; length > 0; length--) {
            int i7 = length - 1;
            if (editable.getSpanFlags(spans[i7]) == 17) {
                return spans[i7];
            }
        }
        return null;
    }

    public final void a(Editable editable, Class cls, boolean z3, Object... objArr) {
        Object objB = b(editable, cls);
        int spanStart = editable.getSpanStart(objB);
        int length = editable.length();
        if (this.f41142d > 0) {
            int spanStart2 = editable.getSpanStart(b(editable, cls));
            int length2 = editable.length();
            CharSequence charSequenceSubSequence = editable.subSequence(spanStart2, length2);
            editable.delete(spanStart2, length2);
            this.f41141c.append(charSequenceSubSequence);
        }
        editable.removeSpan(objB);
        if (spanStart != length) {
            if (z3) {
                editable.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                length++;
            }
            for (Object obj : objArr) {
                editable.setSpan(obj, spanStart, length, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x042b A[Catch: IllegalArgumentException -> 0x0465, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x0465, blocks: (B:175:0x0425, B:177:0x042b, B:180:0x044f, B:182:0x0467), top: B:255:0x0425 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0484  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a1 A[Catch: IllegalArgumentException -> 0x04db, TRY_LEAVE, TryCatch #5 {IllegalArgumentException -> 0x04db, blocks: (B:191:0x049b, B:193:0x04a1, B:196:0x04c5, B:198:0x04dd), top: B:263:0x049b }] */
    /* JADX WARN: Code duplicated, block: B:201:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:204:0x0525  */
    /* JADX WARN: Code duplicated, block: B:206:0x0535  */
    /* JADX WARN: Code duplicated, block: B:208:0x053d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0547  */
    /* JADX WARN: Code duplicated, block: B:253:0x0497 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0421 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.sufficientlysecure.htmltextview.WrapperTagHandler
    public final boolean handleTag(boolean z3, String str, Editable editable, Attributes attributes) {
        final p pVar;
        Object[] objArr;
        int i7;
        Float fValueOf;
        Matcher matcher;
        int i10;
        String strGroup;
        Integer numValueOf;
        Matcher matcher2;
        String strGroup2;
        Integer numValueOf2;
        Matcher matcher3;
        String str2;
        String strTrim;
        int i11;
        p pVar2;
        Stack stack = this.f41140b;
        Stack stack2 = this.f41139a;
        if (z3) {
            editable.toString();
            if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                stack2.push(str);
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                stack2.push(str);
                stack.push(1);
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_LI_TAG")) {
                if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                    editable.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                if (!stack2.isEmpty()) {
                    String str3 = (String) stack2.peek();
                    if (str3.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                        Object hVar = new h(0);
                        int length = editable.length();
                        editable.setSpan(hVar, length, length, 17);
                        stack.push(Integer.valueOf(((Integer) stack.pop()).intValue() + 1));
                    } else if (str3.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                        Object oVar = new o(0);
                        int length2 = editable.length();
                        editable.setSpan(oVar, length2, length2, 17);
                    }
                }
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_A_TAG")) {
                String value = attributes != null ? attributes.getValue("href") : null;
                editable.toString();
                e eVar = new e();
                eVar.f41126a = value;
                int length3 = editable.length();
                editable.setSpan(eVar, length3, length3, 17);
            } else if (str.equalsIgnoreCase("code")) {
                Object gVar = new g(0);
                int length4 = editable.length();
                editable.setSpan(gVar, length4, length4, 17);
            } else if (str.equalsIgnoreCase("center")) {
                Object fVar = new f(0);
                int length5 = editable.length();
                editable.setSpan(fVar, length5, length5, 17);
            } else {
                if (str.equalsIgnoreCase("s") || str.equalsIgnoreCase("strike")) {
                    pVar2 = this;
                    Object iVar = new i(0);
                    int length6 = editable.length();
                    editable.setSpan(iVar, length6, length6, 17);
                } else if (str.equalsIgnoreCase("table")) {
                    Object kVar = new k(0);
                    int length7 = editable.length();
                    editable.setSpan(kVar, length7, length7, 17);
                    pVar2 = this;
                    if (pVar2.f41142d == 0) {
                        pVar2.f41141c = new StringBuilder();
                        editable.append("table placeholder");
                    }
                    pVar2.f41142d++;
                } else {
                    pVar2 = this;
                    if (str.equalsIgnoreCase("tr")) {
                        Object nVar = new n(0);
                        int length8 = editable.length();
                        editable.setSpan(nVar, length8, length8, 17);
                    } else if (str.equalsIgnoreCase("th")) {
                        Object mVar = new m(0);
                        int length9 = editable.length();
                        editable.setSpan(mVar, length9, length9, 17);
                    } else if (str.equalsIgnoreCase("td")) {
                        Object lVar = new l(0);
                        int length10 = editable.length();
                        editable.setSpan(lVar, length10, length10, 17);
                    } else {
                        if (!str.equalsIgnoreCase("span")) {
                            return false;
                        }
                        String value2 = attributes != null ? attributes.getValue("style") : null;
                        j jVar = new j();
                        jVar.f41131a = value2;
                        int length11 = editable.length();
                        editable.setSpan(jVar, length11, length11, 17);
                    }
                }
                pVar = pVar2;
            }
            pVar = this;
        } else {
            pVar = this;
            editable.toString();
            if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                stack2.pop();
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                stack2.pop();
                stack.pop();
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_LI_TAG")) {
                if (!stack2.isEmpty()) {
                    int i12 = f41137f;
                    int i13 = i12 > -1 ? i12 * 2 : 20;
                    if (((String) stack2.peek()).equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                            editable.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        }
                        int i14 = f41137f;
                        int leadingMargin = i14 > -1 ? i14 : 10;
                        BulletSpan bulletSpan = i14 > -1 ? new BulletSpan(f41137f) : f41138g;
                        if (stack2.size() > 1) {
                            leadingMargin -= bulletSpan.getLeadingMargin(true);
                            if (stack2.size() > 2) {
                                leadingMargin -= (stack2.size() - 2) * i13;
                            }
                        }
                        pVar.a(editable, o.class, false, new LeadingMarginSpan.Standard((stack2.size() - 1) * i13), new BulletSpan(leadingMargin));
                    } else if (((String) stack2.peek()).equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                        if (editable.length() > 0) {
                            i11 = 10;
                            if (editable.charAt(editable.length() - 1) != '\n') {
                                editable.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            }
                        } else {
                            i11 = 10;
                        }
                        int leadingMargin2 = f41137f;
                        if (leadingMargin2 <= -1) {
                            leadingMargin2 = i11;
                        }
                        NumberSpan numberSpan = new NumberSpan(leadingMargin2, ((Integer) stack.lastElement()).intValue() - 1);
                        if (stack2.size() > 1) {
                            leadingMargin2 -= numberSpan.getLeadingMargin(true);
                            if (stack2.size() > 2) {
                                leadingMargin2 -= (stack2.size() - 2) * i13;
                            }
                        }
                        pVar.a(editable, h.class, false, new LeadingMarginSpan.Standard((stack2.size() - 1) * i13), new NumberSpan(leadingMargin2, ((Integer) stack.lastElement()).intValue() - 1));
                    }
                }
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_A_TAG")) {
                Object objB = b(editable, e.class);
                int spanStart = editable.getSpanStart(objB);
                int length12 = editable.length();
                final String str4 = objB instanceof e ? ((e) objB).f41126a : null;
                final String string = editable.subSequence(spanStart, length12).toString();
                pVar.a(editable, e.class, false, new URLSpan(str4) { // from class: org.sufficientlysecure.htmltextview.HtmlTagHandler$1
                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        q qVar = this.f41110b.f41143e;
                        if (qVar == null || qVar.f41144a.f41115e.onClick(view, string, getURL())) {
                            return;
                        }
                        super.onClick(view);
                    }
                });
            } else if (str.equalsIgnoreCase("code")) {
                pVar.a(editable, g.class, false, new TypefaceSpan("monospace"));
            } else if (str.equalsIgnoreCase("center")) {
                pVar.a(editable, f.class, true, new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER));
            } else if (str.equalsIgnoreCase("s") || str.equalsIgnoreCase("strike")) {
                pVar.a(editable, i.class, false, new StrikethroughSpan());
            } else if (str.equalsIgnoreCase("table")) {
                int i15 = pVar.f41142d - 1;
                pVar.f41142d = i15;
                if (i15 == 0) {
                    pVar.f41141c.getClass();
                    pVar.a(editable, k.class, false, null, null);
                } else {
                    pVar.a(editable, k.class, false, new Object[0]);
                }
            } else if (str.equalsIgnoreCase("tr")) {
                pVar.a(editable, n.class, false, new Object[0]);
            } else if (str.equalsIgnoreCase("th")) {
                pVar.a(editable, m.class, false, new Object[0]);
            } else if (str.equalsIgnoreCase("td")) {
                pVar.a(editable, l.class, false, new Object[0]);
            } else {
                if (!str.equalsIgnoreCase("span")) {
                    return false;
                }
                Object objB2 = b(editable, j.class);
                String str5 = objB2 instanceof j ? ((j) objB2).f41131a : null;
                if (str5 == null || str5.isEmpty()) {
                    Boolean bool = Boolean.FALSE;
                    objArr = new Object[]{null, null, null, bool, bool, null};
                } else {
                    Matcher matcher4 = Pattern.compile("font-size:\\s*(\\d+(?:\\.\\d+)?)px", 2).matcher(str5);
                    if (matcher4.find()) {
                        i7 = 1;
                        try {
                            fValueOf = Float.valueOf(Float.parseFloat(matcher4.group(1)));
                        } catch (NumberFormatException unused) {
                            matcher4.group(1);
                            fValueOf = null;
                        }
                        matcher = Pattern.compile("color:\\s*#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})", 2).matcher(str5);
                        if (matcher.find()) {
                            try {
                                strGroup = matcher.group(i7);
                                try {
                                    if (strGroup.length() == 3) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(String.valueOf(strGroup.charAt(0)));
                                        sb2.append(strGroup.charAt(0));
                                        i10 = 1;
                                        try {
                                            sb2.append(strGroup.charAt(1));
                                            sb2.append(strGroup.charAt(1));
                                            sb2.append(strGroup.charAt(2));
                                            sb2.append(strGroup.charAt(2));
                                            strGroup = sb2.toString();
                                        } catch (IllegalArgumentException unused2) {
                                            matcher.group(i10);
                                            numValueOf = null;
                                        }
                                    }
                                    numValueOf = Integer.valueOf(Color.parseColor("#" + strGroup));
                                    i10 = 1;
                                } catch (IllegalArgumentException unused3) {
                                    i10 = 1;
                                }
                            } catch (IllegalArgumentException unused4) {
                                i10 = i7;
                            }
                            matcher2 = Pattern.compile("background-color:\\s*#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})", 2).matcher(str5);
                            if (matcher2.find()) {
                                try {
                                    strGroup2 = matcher2.group(i10);
                                    try {
                                        if (strGroup2.length() == 3) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(String.valueOf(strGroup2.charAt(0)));
                                            sb3.append(strGroup2.charAt(0));
                                            i10 = 1;
                                            sb3.append(strGroup2.charAt(1));
                                            sb3.append(strGroup2.charAt(1));
                                            sb3.append(strGroup2.charAt(2));
                                            sb3.append(strGroup2.charAt(2));
                                            strGroup2 = sb3.toString();
                                        }
                                        numValueOf2 = Integer.valueOf(Color.parseColor("#" + strGroup2));
                                    } catch (IllegalArgumentException unused5) {
                                        i10 = 1;
                                        matcher2.group(i10);
                                        numValueOf2 = null;
                                    }
                                } catch (IllegalArgumentException unused6) {
                                }
                            } else {
                                numValueOf2 = null;
                            }
                            boolean zFind = Pattern.compile("font-weight:\\s*bold", 2).matcher(str5).find();
                            boolean zFind2 = Pattern.compile("text-decoration:\\s*underline", 2).matcher(str5).find();
                            matcher3 = Pattern.compile("font-family:\\s*([\"']?)([^;,\"']+)\\1", 2).matcher(str5);
                            if (matcher3.find()) {
                                strTrim = matcher3.group(2).trim();
                                if (!strTrim.startsWith("\"") || strTrim.startsWith("'")) {
                                }
                                str2 = strTrim;
                            } else {
                                str2 = null;
                            }
                            objArr = new Object[]{fValueOf, numValueOf, numValueOf2, Boolean.valueOf(zFind), Boolean.valueOf(zFind2), str2};
                        } else {
                            i10 = i7;
                        }
                        numValueOf = null;
                        matcher2 = Pattern.compile("background-color:\\s*#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})", 2).matcher(str5);
                        if (matcher2.find()) {
                            strGroup2 = matcher2.group(i10);
                            if (strGroup2.length() == 3) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(String.valueOf(strGroup2.charAt(0)));
                                sb4.append(strGroup2.charAt(0));
                                i10 = 1;
                                sb4.append(strGroup2.charAt(1));
                                sb4.append(strGroup2.charAt(1));
                                sb4.append(strGroup2.charAt(2));
                                sb4.append(strGroup2.charAt(2));
                                strGroup2 = sb4.toString();
                            }
                            numValueOf2 = Integer.valueOf(Color.parseColor("#" + strGroup2));
                        } else {
                            numValueOf2 = null;
                        }
                        boolean zFind3 = Pattern.compile("font-weight:\\s*bold", 2).matcher(str5).find();
                        boolean zFind4 = Pattern.compile("text-decoration:\\s*underline", 2).matcher(str5).find();
                        matcher3 = Pattern.compile("font-family:\\s*([\"']?)([^;,\"']+)\\1", 2).matcher(str5);
                        if (matcher3.find()) {
                            strTrim = matcher3.group(2).trim();
                            strTrim = !strTrim.startsWith("\"") ? u.f(1, 1, strTrim) : u.f(1, 1, strTrim);
                            str2 = strTrim;
                        } else {
                            str2 = null;
                        }
                        objArr = new Object[]{fValueOf, numValueOf, numValueOf2, Boolean.valueOf(zFind3), Boolean.valueOf(zFind4), str2};
                    } else {
                        i7 = 1;
                    }
                    fValueOf = null;
                    matcher = Pattern.compile("color:\\s*#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})", 2).matcher(str5);
                    if (matcher.find()) {
                        strGroup = matcher.group(i7);
                        if (strGroup.length() == 3) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(String.valueOf(strGroup.charAt(0)));
                            sb5.append(strGroup.charAt(0));
                            i10 = 1;
                            sb5.append(strGroup.charAt(1));
                            sb5.append(strGroup.charAt(1));
                            sb5.append(strGroup.charAt(2));
                            sb5.append(strGroup.charAt(2));
                            strGroup = sb5.toString();
                        }
                        numValueOf = Integer.valueOf(Color.parseColor("#" + strGroup));
                        i10 = 1;
                        matcher2 = Pattern.compile("background-color:\\s*#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})", 2).matcher(str5);
                        if (matcher2.find()) {
                            strGroup2 = matcher2.group(i10);
                            if (strGroup2.length() == 3) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(String.valueOf(strGroup2.charAt(0)));
                                sb6.append(strGroup2.charAt(0));
                                i10 = 1;
                                sb6.append(strGroup2.charAt(1));
                                sb6.append(strGroup2.charAt(1));
                                sb6.append(strGroup2.charAt(2));
                                sb6.append(strGroup2.charAt(2));
                                strGroup2 = sb6.toString();
                            }
                            numValueOf2 = Integer.valueOf(Color.parseColor("#" + strGroup2));
                        } else {
                            numValueOf2 = null;
                        }
                        boolean zFind5 = Pattern.compile("font-weight:\\s*bold", 2).matcher(str5).find();
                        boolean zFind6 = Pattern.compile("text-decoration:\\s*underline", 2).matcher(str5).find();
                        matcher3 = Pattern.compile("font-family:\\s*([\"']?)([^;,\"']+)\\1", 2).matcher(str5);
                        if (matcher3.find()) {
                            strTrim = matcher3.group(2).trim();
                            if (!strTrim.startsWith("\"")) {
                            }
                            str2 = strTrim;
                        } else {
                            str2 = null;
                        }
                        objArr = new Object[]{fValueOf, numValueOf, numValueOf2, Boolean.valueOf(zFind5), Boolean.valueOf(zFind6), str2};
                    } else {
                        i10 = i7;
                    }
                    numValueOf = null;
                    matcher2 = Pattern.compile("background-color:\\s*#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})", 2).matcher(str5);
                    if (matcher2.find()) {
                        strGroup2 = matcher2.group(i10);
                        if (strGroup2.length() == 3) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(String.valueOf(strGroup2.charAt(0)));
                            sb7.append(strGroup2.charAt(0));
                            i10 = 1;
                            sb7.append(strGroup2.charAt(1));
                            sb7.append(strGroup2.charAt(1));
                            sb7.append(strGroup2.charAt(2));
                            sb7.append(strGroup2.charAt(2));
                            strGroup2 = sb7.toString();
                        }
                        numValueOf2 = Integer.valueOf(Color.parseColor("#" + strGroup2));
                    } else {
                        numValueOf2 = null;
                    }
                    boolean zFind7 = Pattern.compile("font-weight:\\s*bold", 2).matcher(str5).find();
                    boolean zFind8 = Pattern.compile("text-decoration:\\s*underline", 2).matcher(str5).find();
                    matcher3 = Pattern.compile("font-family:\\s*([\"']?)([^;,\"']+)\\1", 2).matcher(str5);
                    if (matcher3.find()) {
                        strTrim = matcher3.group(2).trim();
                        if (!strTrim.startsWith("\"")) {
                        }
                        str2 = strTrim;
                    } else {
                        str2 = null;
                    }
                    objArr = new Object[]{fValueOf, numValueOf, numValueOf2, Boolean.valueOf(zFind7), Boolean.valueOf(zFind8), str2};
                }
                Float f10 = (Float) objArr[0];
                Integer num = (Integer) objArr[1];
                Integer num2 = (Integer) objArr[2];
                Boolean bool2 = (Boolean) objArr[3];
                Boolean bool3 = (Boolean) objArr[4];
                String str6 = (String) objArr[5];
                ArrayList arrayList = new ArrayList();
                if (f10 != null) {
                    arrayList.add(new AbsoluteSizeSpan(f10.intValue(), true));
                }
                if (num != null) {
                    arrayList.add(new ForegroundColorSpan(num.intValue()));
                }
                if (num2 != null) {
                    arrayList.add(new BackgroundColorSpan(num2.intValue()));
                }
                if (bool2 != null && bool2.booleanValue()) {
                    arrayList.add(new StyleSpan(1));
                }
                if (bool3 != null && bool3.booleanValue()) {
                    arrayList.add(new UnderlineSpan());
                }
                if (str6 != null && !str6.isEmpty()) {
                    arrayList.add(new b(str6));
                }
                if (arrayList.isEmpty()) {
                    pVar.a(editable, j.class, false, new Object[0]);
                } else {
                    pVar.a(editable, j.class, false, arrayList.toArray());
                }
            }
        }
        if (pVar.f41142d <= 0 && !str.equalsIgnoreCase("table")) {
            return true;
        }
        pVar.f41141c.append("<");
        if (!z3) {
            pVar.f41141c.append("/");
        }
        StringBuilder sb8 = pVar.f41141c;
        sb8.append(str.toLowerCase());
        sb8.append(">");
        return true;
    }
}
