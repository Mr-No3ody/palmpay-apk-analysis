package C0;

import N8.q0;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H f952o = new H(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final LinkedHashMap f953p = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N f955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M.o f959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f960g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f962j;

    /* JADX WARN: Multi-variable type inference failed */
    public K(e0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String navigatorName = g0.f1042b.getNameForNavigator$navigation_common_release(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f954a = navigatorName;
        this.f958e = new ArrayList();
        this.f959f = new M.o();
        this.f960g = new LinkedHashMap();
    }

    public final void a(F navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList arrayListU = Z4.e.u(this.f960g, new J(navDeepLink, 0));
        if (arrayListU.isEmpty()) {
            this.f958e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f928a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListU).toString());
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f960g;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C0114f c0114f = (C0114f) entry.getValue();
            c0114f.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            if (c0114f.f1040c) {
                c0114f.f1038a.e(bundle2, name, c0114f.f1041d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C0114f c0114f2 = (C0114f) entry2.getValue();
                c0114f2.getClass();
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                d0 d0Var = c0114f2.f1038a;
                if (c0114f2.f1039b || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        d0Var.a(bundle2, name2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbQ = q0.q("Wrong argument type for '", name2, "' in argument bundle. ");
                sbQ.append(d0Var.b());
                sbQ.append(" expected.");
                throw new IllegalArgumentException(sbQ.toString().toString());
            }
        }
        return bundle2;
    }

    public final C0113e c(int i7) {
        M.o oVar = this.f959f;
        C0113e c0113e = oVar.e() == 0 ? null : (C0113e) oVar.b(i7);
        if (c0113e != null) {
            return c0113e;
        }
        N n10 = this.f955b;
        if (n10 != null) {
            return n10.c(i7);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024a  */
    /* JADX WARN: Code duplicated, block: B:101:0x024c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0255  */
    /* JADX WARN: Code duplicated, block: B:107:0x025b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0260  */
    /* JADX WARN: Code duplicated, block: B:110:0x0262  */
    /* JADX WARN: Code duplicated, block: B:112:0x0265  */
    /* JADX WARN: Code duplicated, block: B:115:0x0270  */
    /* JADX WARN: Code duplicated, block: B:117:0x027a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0283  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[LOOP:1: B:79:0x01b3->B:147:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:2: B:90:0x0208->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d4 A[EDGE_INSN: B:86:0x01d4->B:85:0x01d2 BREAK  A[LOOP:1: B:79:0x01b3->B:147:?]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0200  */
    /* JADX WARN: Code duplicated, block: B:92:0x020e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0229 A[EDGE_INSN: B:97:0x0229->B:96:0x0227 BREAK  A[LOOP:2: B:90:0x0208->B:150:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, kotlin.Lazy] */
    public I d(top.zibin.luban.io.a navDeepLinkRequest) throws Throwable {
        Throwable th;
        Object obj;
        Throwable th2;
        int size;
        String str;
        boolean z3;
        String mimeType;
        int i7;
        int i10;
        I i11;
        Bundle bundle;
        Pattern pattern;
        Matcher matcher;
        Matcher matcher2;
        String mimeType2;
        int i12;
        Pattern pattern2;
        List listC;
        List listU;
        String str2;
        String str3;
        B other;
        List listC2;
        int i13;
        List listU2;
        ListIterator listIterator;
        ListIterator listIterator2;
        String str4;
        List<String> elements;
        Matcher matcher3;
        Matcher matcher4;
        Throwable th3;
        Matcher matcher5;
        Matcher matcher6;
        this = this;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList<F> arrayList = this.f958e;
        Throwable th4 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        I i14 = null;
        for (F f10 : arrayList) {
            LinkedHashMap arguments = this.f960g;
            Uri deepLink = (Uri) navDeepLinkRequest.f42645b;
            if (deepLink != null) {
                f10.getClass();
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                Pattern pattern3 = (Pattern) f10.f933f.getValue();
                if (pattern3 != null) {
                    matcher6 = pattern3.matcher(deepLink.toString());
                } else {
                    matcher3 = th4;
                }
                if (matcher3 != 0 && matcher3.matches()) {
                    Bundle bundle2 = new Bundle();
                    if (f10.b(matcher3, bundle2, arguments) && (!((Boolean) f10.f934g.getValue()).booleanValue() || f10.c(deepLink, bundle2, arguments))) {
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        String fragment = deepLink.getFragment();
                        Pattern pattern4 = (Pattern) f10.f940m.getValue();
                        if (pattern4 != null) {
                            matcher5 = pattern4.matcher(String.valueOf(fragment));
                        } else {
                            matcher4 = th4;
                        }
                        if (matcher4 != 0 && matcher4.matches()) {
                            matcher4 = matcher5;
                            List list = (List) f10.f938k.getValue();
                            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(list, 10));
                            int i15 = 0;
                            th4 = th4;
                            for (Object obj2 : list) {
                                th3 = th4;
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    C1850q.k();
                                    throw th3;
                                }
                                String str5 = (String) obj2;
                                String value = Uri.decode(matcher4.group(i16));
                                C0114f c0114f = (C0114f) arguments.get(str5);
                                try {
                                    Intrinsics.checkNotNullExpressionValue(value, "value");
                                    F.d(bundle2, str5, value, c0114f);
                                    arrayList2.add(Unit.f38893a);
                                    i15 = i16;
                                    th4 = th3;
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                            matcher4 = matcher5;
                            matcher4 = matcher5;
                            th3 = th4;
                        } else {
                            matcher4 = matcher5;
                            matcher4 = matcher5;
                            th3 = th4;
                        }
                        boolean zIsEmpty = Z4.e.u(arguments, new E(0, bundle2)).isEmpty();
                        obj = bundle2;
                        th2 = th3;
                        th = th3;
                        if (!zIsEmpty) {
                        }
                    } else {
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        Throwable th5 = th4;
                        th2 = th5;
                        obj = th5;
                    }
                } else {
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    Throwable th6 = th4;
                    th2 = th6;
                    obj = th6;
                }
                if (deepLink != null) {
                    str4 = f10.f928a;
                    if (str4 == null) {
                        List<String> requestedPathSegments = deepLink.getPathSegments();
                        List<String> uriPathSegments = Uri.parse(str4).getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
                        List<String> list2 = requestedPathSegments;
                        Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
                        elements = uriPathSegments;
                        Intrinsics.checkNotNullParameter(list2, "<this>");
                        Intrinsics.checkNotNullParameter(elements, "other");
                        LinkedHashSet linkedHashSetA0 = CollectionsKt.a0(list2);
                        Intrinsics.checkNotNullParameter(linkedHashSetA0, "<this>");
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        Intrinsics.checkNotNullParameter(elements, "<this>");
                        if (!(elements instanceof Collection)) {
                            elements = CollectionsKt.Y(elements);
                        }
                        linkedHashSetA0.retainAll(elements);
                        size = linkedHashSetA0.size();
                    }
                    str = (String) navDeepLinkRequest.f42646c;
                    if (str == null && str.equals(f10.f929b)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mimeType = (String) navDeepLinkRequest.f42647d;
                    if (mimeType != null) {
                        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                        mimeType2 = f10.f930c;
                        if (mimeType2 != null) {
                            pattern2 = (Pattern) f10.f942o.getValue();
                            Intrinsics.e(pattern2);
                            if (pattern2.matcher(mimeType).matches()) {
                                Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                                listC = new Regex("/").c(mimeType2);
                                if (!listC.isEmpty()) {
                                    listU = kotlin.collections.z.f38935a;
                                    break;
                                }
                                listIterator2 = listC.listIterator(listC.size());
                                while (true) {
                                    if (listIterator2.hasPrevious()) {
                                        listU = kotlin.collections.z.f38935a;
                                        break;
                                    }
                                    if (((String) listIterator2.previous()).length() == 0) {
                                        listU = CollectionsKt.U(listC, listIterator2.nextIndex() + 1);
                                        break;
                                    }
                                }
                                str2 = (String) listU.get(0);
                                i7 = size;
                                str3 = (String) listU.get(1);
                                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                                other = new B();
                                listC2 = new Regex("/").c(mimeType);
                                if (!listC2.isEmpty()) {
                                    i13 = 1;
                                    listU2 = kotlin.collections.z.f38935a;
                                    break;
                                }
                                listIterator = listC2.listIterator(listC2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        i13 = 1;
                                        listU2 = kotlin.collections.z.f38935a;
                                        break;
                                    }
                                    if (((String) listIterator.previous()).length() == 0) {
                                        i13 = 1;
                                        listU2 = CollectionsKt.U(listC2, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                }
                                other.f918a = (String) listU2.get(0);
                                other.f919b = (String) listU2.get(i13);
                                Intrinsics.checkNotNullParameter(other, "other");
                                if (Intrinsics.c(str2, other.f918a)) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                                if (Intrinsics.c(str3, other.f919b)) {
                                    i12++;
                                }
                            } else {
                                i7 = size;
                                i12 = -1;
                            }
                        } else {
                            i7 = size;
                            i12 = -1;
                        }
                        i10 = i12;
                    } else {
                        i7 = size;
                        i10 = -1;
                    }
                    if (obj != null) {
                        i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                        if (i14 != null || i11.compareTo(i14) > 0) {
                            i14 = i11;
                        }
                    } else if (z3 || i10 > -1) {
                        Intrinsics.checkNotNullParameter(arguments, "arguments");
                        bundle = new Bundle();
                        if (deepLink != null) {
                            pattern = (Pattern) f10.f933f.getValue();
                            if (pattern != null) {
                                matcher2 = pattern.matcher(deepLink.toString());
                            } else {
                                matcher = th2;
                            }
                            if (matcher != 0 && matcher.matches()) {
                                f10.b(matcher, bundle, arguments);
                                if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                                    matcher = matcher2;
                                    f10.c(deepLink, bundle, arguments);
                                }
                            }
                        }
                        matcher = matcher2;
                        matcher = matcher2;
                        matcher = matcher2;
                        if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                            i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                            if (i14 != null) {
                            }
                            i14 = i11;
                        }
                    }
                    th4 = th2;
                } else {
                    f10.getClass();
                }
                size = 0;
                str = (String) navDeepLinkRequest.f42646c;
                if (str == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                mimeType = (String) navDeepLinkRequest.f42647d;
                if (mimeType != null) {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    mimeType2 = f10.f930c;
                    if (mimeType2 != null) {
                        pattern2 = (Pattern) f10.f942o.getValue();
                        Intrinsics.e(pattern2);
                        if (pattern2.matcher(mimeType).matches()) {
                            i7 = size;
                            i12 = -1;
                        } else {
                            Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                            listC = new Regex("/").c(mimeType2);
                            if (!listC.isEmpty()) {
                                listU = kotlin.collections.z.f38935a;
                                break;
                            }
                            listIterator2 = listC.listIterator(listC.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    listU = kotlin.collections.z.f38935a;
                                    break;
                                }
                                if (((String) listIterator2.previous()).length() == 0) {
                                    listU = CollectionsKt.U(listC, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                            str2 = (String) listU.get(0);
                            i7 = size;
                            str3 = (String) listU.get(1);
                            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                            other = new B();
                            listC2 = new Regex("/").c(mimeType);
                            if (!listC2.isEmpty()) {
                                i13 = 1;
                                listU2 = kotlin.collections.z.f38935a;
                                break;
                            }
                            listIterator = listC2.listIterator(listC2.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    i13 = 1;
                                    listU2 = kotlin.collections.z.f38935a;
                                    break;
                                }
                                if (((String) listIterator.previous()).length() == 0) {
                                    i13 = 1;
                                    listU2 = CollectionsKt.U(listC2, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            other.f918a = (String) listU2.get(0);
                            other.f919b = (String) listU2.get(i13);
                            Intrinsics.checkNotNullParameter(other, "other");
                            if (Intrinsics.c(str2, other.f918a)) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            if (Intrinsics.c(str3, other.f919b)) {
                                i12++;
                            }
                        }
                    } else {
                        i7 = size;
                        i12 = -1;
                    }
                    i10 = i12;
                } else {
                    i7 = size;
                    i10 = -1;
                }
                if (obj != null) {
                    i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                    if (i14 != null) {
                    }
                    i14 = i11;
                } else if (z3) {
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    bundle = new Bundle();
                    if (deepLink != null) {
                        pattern = (Pattern) f10.f933f.getValue();
                        if (pattern != null) {
                            matcher2 = pattern.matcher(deepLink.toString());
                        } else {
                            matcher = th2;
                        }
                        if (matcher != 0) {
                            f10.b(matcher, bundle, arguments);
                            if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                                matcher = matcher2;
                                f10.c(deepLink, bundle, arguments);
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher = matcher2;
                    matcher = matcher2;
                    if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                        i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                        if (i14 != null) {
                        }
                        i14 = i11;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    bundle = new Bundle();
                    if (deepLink != null) {
                        pattern = (Pattern) f10.f933f.getValue();
                        if (pattern != null) {
                            matcher2 = pattern.matcher(deepLink.toString());
                        } else {
                            matcher = th2;
                        }
                        if (matcher != 0) {
                            f10.b(matcher, bundle, arguments);
                            if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                                matcher = matcher2;
                                f10.c(deepLink, bundle, arguments);
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher = matcher2;
                    matcher = matcher2;
                    if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                        i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                        if (i14 != null) {
                        }
                        i14 = i11;
                    }
                }
                th4 = th2;
            } else {
                th = th4;
            }
            obj = th;
            th2 = th;
            if (deepLink != null) {
                str4 = f10.f928a;
                if (str4 == null) {
                    List<String> requestedPathSegments2 = deepLink.getPathSegments();
                    List<String> uriPathSegments2 = Uri.parse(str4).getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(requestedPathSegments2, "requestedPathSegments");
                    List<String> list3 = requestedPathSegments2;
                    Intrinsics.checkNotNullExpressionValue(uriPathSegments2, "uriPathSegments");
                    elements = uriPathSegments2;
                    Intrinsics.checkNotNullParameter(list3, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "other");
                    LinkedHashSet linkedHashSetA1 = CollectionsKt.a0(list3);
                    Intrinsics.checkNotNullParameter(linkedHashSetA1, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Intrinsics.checkNotNullParameter(elements, "<this>");
                    if (!(elements instanceof Collection)) {
                        elements = CollectionsKt.Y(elements);
                    }
                    linkedHashSetA1.retainAll(elements);
                    size = linkedHashSetA1.size();
                }
                str = (String) navDeepLinkRequest.f42646c;
                if (str == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                mimeType = (String) navDeepLinkRequest.f42647d;
                if (mimeType != null) {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    mimeType2 = f10.f930c;
                    if (mimeType2 != null) {
                        pattern2 = (Pattern) f10.f942o.getValue();
                        Intrinsics.e(pattern2);
                        if (pattern2.matcher(mimeType).matches()) {
                            i7 = size;
                            i12 = -1;
                        } else {
                            Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                            listC = new Regex("/").c(mimeType2);
                            if (!listC.isEmpty()) {
                                listU = kotlin.collections.z.f38935a;
                                break;
                            }
                            listIterator2 = listC.listIterator(listC.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    listU = kotlin.collections.z.f38935a;
                                    break;
                                }
                                if (((String) listIterator2.previous()).length() == 0) {
                                    listU = CollectionsKt.U(listC, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                            str2 = (String) listU.get(0);
                            i7 = size;
                            str3 = (String) listU.get(1);
                            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                            other = new B();
                            listC2 = new Regex("/").c(mimeType);
                            if (!listC2.isEmpty()) {
                                i13 = 1;
                                listU2 = kotlin.collections.z.f38935a;
                                break;
                            }
                            listIterator = listC2.listIterator(listC2.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    i13 = 1;
                                    listU2 = kotlin.collections.z.f38935a;
                                    break;
                                }
                                if (((String) listIterator.previous()).length() == 0) {
                                    i13 = 1;
                                    listU2 = CollectionsKt.U(listC2, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            other.f918a = (String) listU2.get(0);
                            other.f919b = (String) listU2.get(i13);
                            Intrinsics.checkNotNullParameter(other, "other");
                            if (Intrinsics.c(str2, other.f918a)) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            if (Intrinsics.c(str3, other.f919b)) {
                                i12++;
                            }
                        }
                    } else {
                        i7 = size;
                        i12 = -1;
                    }
                    i10 = i12;
                } else {
                    i7 = size;
                    i10 = -1;
                }
                if (obj != null) {
                    i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                    if (i14 != null) {
                    }
                    i14 = i11;
                } else if (z3) {
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    bundle = new Bundle();
                    if (deepLink != null) {
                        pattern = (Pattern) f10.f933f.getValue();
                        if (pattern != null) {
                            matcher2 = pattern.matcher(deepLink.toString());
                        } else {
                            matcher = th2;
                        }
                        if (matcher != 0) {
                            f10.b(matcher, bundle, arguments);
                            if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                                matcher = matcher2;
                                f10.c(deepLink, bundle, arguments);
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher = matcher2;
                    matcher = matcher2;
                    if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                        i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                        if (i14 != null) {
                        }
                        i14 = i11;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    bundle = new Bundle();
                    if (deepLink != null) {
                        pattern = (Pattern) f10.f933f.getValue();
                        if (pattern != null) {
                            matcher2 = pattern.matcher(deepLink.toString());
                        } else {
                            matcher = th2;
                        }
                        if (matcher != 0) {
                            f10.b(matcher, bundle, arguments);
                            if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                                matcher = matcher2;
                                f10.c(deepLink, bundle, arguments);
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher = matcher2;
                    matcher = matcher2;
                    if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                        i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                        if (i14 != null) {
                        }
                        i14 = i11;
                    }
                }
                th4 = th2;
            } else {
                f10.getClass();
            }
            size = 0;
            str = (String) navDeepLinkRequest.f42646c;
            if (str == null) {
                z3 = false;
            } else {
                z3 = false;
            }
            mimeType = (String) navDeepLinkRequest.f42647d;
            if (mimeType != null) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                mimeType2 = f10.f930c;
                if (mimeType2 != null) {
                    pattern2 = (Pattern) f10.f942o.getValue();
                    Intrinsics.e(pattern2);
                    if (pattern2.matcher(mimeType).matches()) {
                        i7 = size;
                        i12 = -1;
                    } else {
                        Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
                        listC = new Regex("/").c(mimeType2);
                        if (!listC.isEmpty()) {
                            listU = kotlin.collections.z.f38935a;
                            break;
                        }
                        listIterator2 = listC.listIterator(listC.size());
                        while (true) {
                            if (listIterator2.hasPrevious()) {
                                listU = kotlin.collections.z.f38935a;
                                break;
                            }
                            if (((String) listIterator2.previous()).length() == 0) {
                                listU = CollectionsKt.U(listC, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        str2 = (String) listU.get(0);
                        i7 = size;
                        str3 = (String) listU.get(1);
                        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                        other = new B();
                        listC2 = new Regex("/").c(mimeType);
                        if (!listC2.isEmpty()) {
                            i13 = 1;
                            listU2 = kotlin.collections.z.f38935a;
                            break;
                        }
                        listIterator = listC2.listIterator(listC2.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                i13 = 1;
                                listU2 = kotlin.collections.z.f38935a;
                                break;
                            }
                            if (((String) listIterator.previous()).length() == 0) {
                                i13 = 1;
                                listU2 = CollectionsKt.U(listC2, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        other.f918a = (String) listU2.get(0);
                        other.f919b = (String) listU2.get(i13);
                        Intrinsics.checkNotNullParameter(other, "other");
                        if (Intrinsics.c(str2, other.f918a)) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        if (Intrinsics.c(str3, other.f919b)) {
                            i12++;
                        }
                    }
                } else {
                    i7 = size;
                    i12 = -1;
                }
                i10 = i12;
            } else {
                i7 = size;
                i10 = -1;
            }
            if (obj != null) {
                i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                if (i14 != null) {
                }
                i14 = i11;
            } else if (z3) {
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                bundle = new Bundle();
                if (deepLink != null) {
                    pattern = (Pattern) f10.f933f.getValue();
                    if (pattern != null) {
                        matcher2 = pattern.matcher(deepLink.toString());
                    } else {
                        matcher = th2;
                    }
                    if (matcher != 0) {
                        f10.b(matcher, bundle, arguments);
                        if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                            matcher = matcher2;
                            f10.c(deepLink, bundle, arguments);
                        }
                    }
                }
                matcher = matcher2;
                matcher = matcher2;
                matcher = matcher2;
                if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                    i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                    if (i14 != null) {
                    }
                    i14 = i11;
                }
            } else {
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                bundle = new Bundle();
                if (deepLink != null) {
                    pattern = (Pattern) f10.f933f.getValue();
                    if (pattern != null) {
                        matcher2 = pattern.matcher(deepLink.toString());
                    } else {
                        matcher = th2;
                    }
                    if (matcher != 0) {
                        f10.b(matcher, bundle, arguments);
                        if (((Boolean) f10.f934g.getValue()).booleanValue()) {
                            matcher = matcher2;
                            f10.c(deepLink, bundle, arguments);
                        }
                    }
                }
                matcher = matcher2;
                matcher = matcher2;
                matcher = matcher2;
                if (Z4.e.u(arguments, new E(1, bundle)).isEmpty()) {
                    i11 = new I(this, obj, f10.f943p, i7, z3, i10);
                    if (i14 != null) {
                    }
                    i14 = i11;
                }
            }
            th4 = th2;
        }
        return i14;
    }

    public void e(Context context, AttributeSet attrs) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, D0.a.Navigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(D0.a.Navigator_route);
        H h7 = f952o;
        if (string == null) {
            this.f961i = 0;
            this.f956c = null;
        } else {
            if (StringsKt.F(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = h7.createRoute(string);
            this.f961i = uriPattern.hashCode();
            this.f956c = null;
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            C0133z c0133z = new C0133z();
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            c0133z.f1129a = uriPattern;
            a(new F(c0133z.f1129a, c0133z.f1130b, c0133z.f1131c));
        }
        ArrayList arrayList = this.f958e;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(((F) next).f928a, h7.createRoute(this.f962j)));
        kotlin.jvm.internal.K.a(arrayList);
        arrayList.remove(next);
        this.f962j = string;
        if (typedArrayObtainAttributes.hasValue(D0.a.Navigator_android_id)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(D0.a.Navigator_android_id, 0);
            this.f961i = resourceId;
            this.f956c = null;
            this.f956c = h7.getDisplayName(context, resourceId);
        }
        this.f957d = typedArrayObtainAttributes.getText(D0.a.Navigator_android_label);
        Unit unit = Unit.f38893a;
        typedArrayObtainAttributes.recycle();
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z8;
        if (this != obj) {
            if (obj != null && (obj instanceof K)) {
                K k2 = (K) obj;
                boolean zC = Intrinsics.c(this.f958e, k2.f958e);
                M.o oVar = this.f959f;
                int iE = oVar.e();
                M.o oVar2 = k2.f959f;
                if (iE != oVar2.e()) {
                    z3 = false;
                    break;
                }
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                Iterator it = Sf.m.a(new M.p(oVar)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!Intrinsics.c(oVar.b(iIntValue), oVar2.b(iIntValue))) {
                        z3 = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap = this.f960g;
                int size = linkedHashMap.size();
                LinkedHashMap linkedHashMap2 = k2.f960g;
                if (size != linkedHashMap2.size()) {
                    z8 = false;
                    break;
                }
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                Iterator it2 = ((Iterable) CollectionsKt.y(linkedHashMap.entrySet()).f5486b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z8 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap2.containsKey(entry.getKey()) || !Intrinsics.c(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                        z8 = false;
                        break;
                    }
                }
                if (this.f961i != k2.f961i || !Intrinsics.c(this.f962j, k2.f962j) || !zC || !z3 || !z8) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i7 = this.f961i * 31;
        String str = this.f962j;
        int iHashCode = i7 + (str != null ? str.hashCode() : 0);
        for (F f10 : this.f958e) {
            int i10 = iHashCode * 31;
            String str2 = f10.f928a;
            int iHashCode2 = (i10 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = f10.f929b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = f10.f930c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        M.o oVar = this.f959f;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i11 = 0;
        while (true) {
            if (!(i11 < oVar.e())) {
                break;
            }
            int i12 = i11 + 1;
            C0113e c0113e = (C0113e) oVar.f(i11);
            int i13 = ((iHashCode * 31) + c0113e.f1033a) * 31;
            U u6 = c0113e.f1034b;
            iHashCode = i13 + (u6 != null ? u6.hashCode() : 0);
            Bundle bundle = c0113e.f1035c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
                for (String str5 : setKeySet) {
                    int i14 = iHashCode * 31;
                    Bundle bundle2 = c0113e.f1035c;
                    Intrinsics.e(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i14 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i11 = i12;
        }
        LinkedHashMap linkedHashMap = this.f960g;
        for (String str6 : linkedHashMap.keySet()) {
            int iC = G.c(iHashCode * 31, 31, str6);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iC + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f956c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f961i));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f962j;
        if (str2 != null && !StringsKt.F(str2)) {
            sb2.append(" route=");
            sb2.append(this.f962j);
        }
        if (this.f957d != null) {
            sb2.append(" label=");
            sb2.append(this.f957d);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
