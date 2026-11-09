package C0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f970c = new Q(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f971d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f973b;

    public S(Context context, g0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f972a = context;
        this.f973b = navigatorProvider;
    }

    public static C0114f c(TypedArray typedArray, Resources resources, int i7) throws XmlPullParserException {
        Object objC;
        boolean z3 = false;
        boolean z8 = typedArray.getBoolean(D0.a.NavArgument_nullable, false);
        ThreadLocal threadLocal = f971d;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = typedArray.getString(D0.a.NavArgument_argType);
        d0 d0VarInferFromValueType = null;
        d0 type = string != null ? d0.f1020b.fromArgType(string, resources.getResourcePackageName(i7)) : null;
        if (typedArray.getValue(D0.a.NavArgument_android_defaultValue, typedValue2)) {
            W w3 = d0.f1022d;
            if (type == w3) {
                int i10 = typedValue2.resourceId;
                if (i10 == 0) {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + type.b() + ". Must be a reference to a resource.");
                    }
                    i10 = 0;
                }
                objC = Integer.valueOf(i10);
            } else {
                int i11 = typedValue2.resourceId;
                if (i11 != 0) {
                    if (type != null) {
                        w3.getClass();
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + type.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    objC = Integer.valueOf(i11);
                    type = w3;
                } else if (type == d0.f1030l) {
                    objC = typedArray.getString(D0.a.NavArgument_android_defaultValue);
                } else {
                    int i12 = typedValue2.type;
                    if (i12 == 3) {
                        String string2 = typedValue2.string.toString();
                        if (type == null) {
                            type = d0.f1020b.inferFromValue(string2);
                        }
                        objC = type.c(string2);
                    } else if (i12 == 4) {
                        type = f970c.checkNavType$navigation_runtime_release(typedValue2, type, d0.f1026h, string, "float");
                        objC = Float.valueOf(typedValue2.getFloat());
                    } else if (i12 == 5) {
                        type = f970c.checkNavType$navigation_runtime_release(typedValue2, type, d0.f1021c, string, "dimension");
                        objC = Integer.valueOf((int) typedValue2.getDimension(resources.getDisplayMetrics()));
                    } else if (i12 == 18) {
                        type = f970c.checkNavType$navigation_runtime_release(typedValue2, type, d0.f1028j, string, "boolean");
                        objC = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i12 < 16 || i12 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        W w6 = d0.f1026h;
                        if (type == w6) {
                            type = f970c.checkNavType$navigation_runtime_release(typedValue2, type, w6, string, "float");
                            objC = Float.valueOf(typedValue2.data);
                        } else {
                            type = f970c.checkNavType$navigation_runtime_release(typedValue2, type, d0.f1021c, string, "integer");
                            objC = Integer.valueOf(typedValue2.data);
                        }
                    }
                }
            }
        } else {
            objC = null;
        }
        if (objC != null) {
            z3 = true;
        } else {
            objC = null;
        }
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            d0VarInferFromValueType = type;
        }
        if (d0VarInferFromValueType == null) {
            d0VarInferFromValueType = d0.f1020b.inferFromValueType(objC);
            Intrinsics.f(d0VarInferFromValueType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        }
        return new C0114f(d0VarInferFromValueType, z8, objC, z3);
    }

    public final K a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i7) throws XmlPullParserException, IOException {
        int depth;
        TypedArray typedArray;
        int depth2;
        S s3;
        S s8 = this;
        int i10 = i7;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        K kA = s8.f973b.b(name).a();
        Context context = s8.f972a;
        kA.e(context, attributeSet);
        int i11 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i11 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                if ("argument".equals(name2)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, D0.a.NavArgument);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String argumentName = typedArrayObtainAttributes.getString(D0.a.NavArgument_android_name);
                    if (argumentName == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    Intrinsics.checkNotNullExpressionValue(argumentName, "array.getString(R.stylea…uments must have a name\")");
                    C0114f argument = c(typedArrayObtainAttributes, resources, i10);
                    Intrinsics.checkNotNullParameter(argumentName, "argumentName");
                    Intrinsics.checkNotNullParameter(argument, "argument");
                    kA.f960g.put(argumentName, argument);
                    Unit unit = Unit.f38893a;
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, D0.a.NavDeepLink);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string = typedArrayObtainAttributes2.getString(D0.a.NavDeepLink_uri);
                    String string2 = typedArrayObtainAttributes2.getString(D0.a.NavDeepLink_action);
                    String string3 = typedArrayObtainAttributes2.getString(D0.a.NavDeepLink_mimeType);
                    if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    C0133z c0133z = new C0133z();
                    int i12 = i11;
                    if (string != null) {
                        String packageName = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                        String uriPattern = kotlin.text.y.k(string, "${applicationId}", packageName);
                        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                        c0133z.f1129a = uriPattern;
                    }
                    if (string2 != null && string2.length() != 0) {
                        String packageName2 = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
                        String action = kotlin.text.y.k(string2, "${applicationId}", packageName2);
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                        c0133z.f1130b = action;
                    }
                    if (string3 != null) {
                        String packageName3 = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
                        String mimeType = kotlin.text.y.k(string3, "${applicationId}", packageName3);
                        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                        c0133z.f1131c = mimeType;
                    }
                    kA.a(new F(c0133z.f1129a, c0133z.f1130b, c0133z.f1131c));
                    Unit unit2 = Unit.f38893a;
                    typedArrayObtainAttributes2.recycle();
                    i11 = i12;
                } else {
                    int i13 = i11;
                    if ("action".equals(name2)) {
                        int[] NavAction = D0.a.NavAction;
                        Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_android_id, 0);
                        C0113e action2 = new C0113e(typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_destination, 0));
                        Context context2 = context;
                        action2.f1034b = new U(typedArrayObtainStyledAttributes.getBoolean(D0.a.NavAction_launchSingleTop, false), typedArrayObtainStyledAttributes.getBoolean(D0.a.NavAction_restoreState, false), typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(D0.a.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(D0.a.NavAction_popUpToSaveState, false), typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_enterAnim, -1), typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_exitAnim, -1), typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_popEnterAnim, -1), typedArrayObtainStyledAttributes.getResourceId(D0.a.NavAction_popExitAnim, -1));
                        Bundle bundle = new Bundle();
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        int i14 = depth3;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            typedArray = typedArrayObtainStyledAttributes;
                            if (next2 == i13 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, D0.a.NavArgument);
                                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                    String name3 = typedArrayObtainAttributes3.getString(D0.a.NavArgument_android_name);
                                    if (name3 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    Intrinsics.checkNotNullExpressionValue(name3, "array.getString(R.stylea…uments must have a name\")");
                                    C0114f c0114fC = c(typedArrayObtainAttributes3, resources, i10);
                                    boolean z3 = c0114fC.f1040c;
                                    if (z3) {
                                        Intrinsics.checkNotNullParameter(name3, "name");
                                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                                        if (z3) {
                                            c0114fC.f1038a.e(bundle, name3, c0114fC.f1041d);
                                        }
                                    }
                                    Unit unit3 = Unit.f38893a;
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i13 = 1;
                                i10 = i7;
                            } else {
                                i13 = 1;
                            }
                            typedArrayObtainStyledAttributes = typedArray;
                        }
                        if (!bundle.isEmpty()) {
                            action2.f1035c = bundle;
                        }
                        Intrinsics.checkNotNullParameter(action2, "action");
                        if (kA instanceof C0110b) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + kA + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                        kA.f959f.d(resourceId, action2);
                        typedArray.recycle();
                        i11 = 1;
                        s8 = this;
                        i10 = i7;
                        context = context2;
                        depth3 = i14;
                    } else {
                        Context context3 = context;
                        int i15 = depth3;
                        if ("include".equals(name2) && (kA instanceof N)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, j0.NavInclude);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            s3 = this;
                            ((N) kA).f(s3.b(typedArrayObtainAttributes4.getResourceId(j0.NavInclude_graph, 0)));
                            Unit unit4 = Unit.f38893a;
                            typedArrayObtainAttributes4.recycle();
                        } else {
                            s3 = this;
                            if (kA instanceof N) {
                                ((N) kA).f(a(resources, xmlResourceParser, attributeSet, i7));
                            }
                        }
                        i10 = i7;
                        s8 = s3;
                        context = context3;
                        depth3 = i15;
                        i11 = 1;
                    }
                }
            }
        }
        return kA;
    }

    public final N b(int i7) {
        int next;
        Resources res = this.f972a.getResources();
        XmlResourceParser xml = res.getXml(i7);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i7) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        K kA = a(res, xml, attrs, i7);
        if (kA instanceof N) {
            N n10 = (N) kA;
            xml.close();
            return n10;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
