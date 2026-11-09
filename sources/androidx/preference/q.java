package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import com.alibaba.android.arouter.utils.Consts;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f17652e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f17653f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17654a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f17656c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f17655b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f17657d = {Preference.class.getPackage().getName() + Consts.DOT, SwitchPreference.class.getPackage().getName() + Consts.DOT};

    public q(Context context, r rVar) {
        this.f17654a = context;
        this.f17656c = rVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f17653f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f17654a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f17652e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e12) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e12);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e13) {
                throw e13;
            }
        }
        Object[] objArr = this.f17655b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f17657d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f17655b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f17655b[0] = this.f17654a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e10) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e10.getMessage());
                            inflateException.initCause(e10);
                            throw inflateException;
                        }
                    } catch (InflateException e11) {
                        throw e11;
                    }
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.j(this.f17656c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jLongValue;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.t = Intent.parseIntent(this.f17654a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f17654a.getResources();
                    if (preference.f17571w == null) {
                        preference.f17571w = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f17571w);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f17593D0.contains(preferenceB)) {
                        if (preferenceB.f17562p != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f17573x0;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceB.f17562p;
                            if (preferenceGroup2.x(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i7 = preferenceB.f17556f;
                        if (i7 == Integer.MAX_VALUE) {
                            if (preferenceGroup.f17594E0) {
                                int i10 = preferenceGroup.f17595F0;
                                preferenceGroup.f17595F0 = i10 + 1;
                                if (i10 != i7) {
                                    preferenceB.f17556f = i10;
                                    p pVar = preferenceB.f17570v0;
                                    if (pVar != null) {
                                        pVar.onPreferenceHierarchyChange(preferenceB);
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).f17594E0 = preferenceGroup.f17594E0;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f17593D0, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zV = preferenceGroup.v();
                        if (preferenceB.f17547Q == zV) {
                            preferenceB.f17547Q = !zV;
                            preferenceB.h(preferenceB.v());
                            preferenceB.g();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f17593D0.add(iBinarySearch, preferenceB);
                        }
                        r rVar = preferenceGroup.f17552b;
                        String str2 = preferenceB.f17562p;
                        if (str2 == null || !preferenceGroup.f17592C0.containsKey(str2)) {
                            synchronized (rVar) {
                                jLongValue = rVar.f17659b;
                                rVar.f17659b = 1 + jLongValue;
                            }
                        } else {
                            jLongValue = ((Long) preferenceGroup.f17592C0.get(str2)).longValue();
                            preferenceGroup.f17592C0.remove(str2);
                        }
                        preferenceB.f17553c = jLongValue;
                        preferenceB.f17554d = true;
                        try {
                            preferenceB.j(rVar);
                            preferenceB.f17554d = false;
                            if (preferenceB.f17573x0 != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.f17573x0 = preferenceGroup;
                            if (preferenceGroup.f17596G0) {
                                preferenceB.i();
                            }
                            p pVar2 = preferenceGroup.f17570v0;
                            if (pVar2 != null) {
                                pVar2.onPreferenceHierarchyChange(preferenceGroup);
                            }
                        } catch (Throwable th) {
                            preferenceB.f17554d = false;
                            throw th;
                        }
                    }
                    d(xmlResourceParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
