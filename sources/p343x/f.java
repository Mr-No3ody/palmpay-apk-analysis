package p343x;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.AbstractC0859g0;
import androidx.appcompat.widget.Z0;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.AbstractC1051c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p241q.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f43541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f43542f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f43543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f43544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f43545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f43546d;

    static {
        Class[] clsArr = {Context.class};
        f43541e = clsArr;
        f43542f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f43545c = context;
        Object[] objArr = {context};
        this.f43543a = objArr;
        this.f43544b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i7;
        XmlResourceParser xmlResourceParser2;
        e eVar = new e(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z3 = false;
        boolean z8 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i7) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z8 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z8 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            eVar.f43517b = 0;
                            eVar.f43518c = 0;
                            eVar.f43519d = 0;
                            eVar.f43520e = 0;
                            eVar.f43521f = true;
                            eVar.f43522g = true;
                        } else if (name2.equals("item")) {
                            if (!eVar.f43523h) {
                                AbstractC1051c abstractC1051c = eVar.f43540z;
                                if (abstractC1051c == null || !((n) abstractC1051c).f12468c.hasSubMenu()) {
                                    eVar.f43523h = true;
                                    eVar.b(eVar.f43516a.add(eVar.f43517b, eVar.f43524i, eVar.f43525j, eVar.f43526k));
                                } else {
                                    eVar.f43523h = true;
                                    eVar.b(eVar.f43516a.addSubMenu(eVar.f43517b, eVar.f43524i, eVar.f43525j, eVar.f43526k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z3 = true;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                    }
                }
            } else if (z8) {
                xmlResourceParser2 = xmlResourceParser;
            } else {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                f fVar = eVar.f43515E;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = fVar.f43545c.obtainStyledAttributes(attributeSet, j.MenuGroup);
                    eVar.f43517b = typedArrayObtainStyledAttributes.getResourceId(j.MenuGroup_android_id, 0);
                    eVar.f43518c = typedArrayObtainStyledAttributes.getInt(j.MenuGroup_android_menuCategory, 0);
                    eVar.f43519d = typedArrayObtainStyledAttributes.getInt(j.MenuGroup_android_orderInCategory, 0);
                    eVar.f43520e = typedArrayObtainStyledAttributes.getInt(j.MenuGroup_android_checkableBehavior, 0);
                    eVar.f43521f = typedArrayObtainStyledAttributes.getBoolean(j.MenuGroup_android_visible, true);
                    eVar.f43522g = typedArrayObtainStyledAttributes.getBoolean(j.MenuGroup_android_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Z0 z0E = Z0.e(fVar.f43545c, attributeSet, j.MenuItem);
                    int i10 = j.MenuItem_android_id;
                    TypedArray typedArray = z0E.f12863b;
                    eVar.f43524i = typedArray.getResourceId(i10, 0);
                    eVar.f43525j = (typedArray.getInt(j.MenuItem_android_orderInCategory, eVar.f43519d) & 65535) | (typedArray.getInt(j.MenuItem_android_menuCategory, eVar.f43518c) & (-65536));
                    eVar.f43526k = typedArray.getText(j.MenuItem_android_title);
                    eVar.f43527l = typedArray.getText(j.MenuItem_android_titleCondensed);
                    eVar.f43528m = typedArray.getResourceId(j.MenuItem_android_icon, 0);
                    String string = typedArray.getString(j.MenuItem_android_alphabeticShortcut);
                    eVar.f43529n = string == null ? (char) 0 : string.charAt(0);
                    eVar.f43530o = typedArray.getInt(j.MenuItem_alphabeticModifiers, 4096);
                    String string2 = typedArray.getString(j.MenuItem_android_numericShortcut);
                    eVar.f43531p = string2 == null ? (char) 0 : string2.charAt(0);
                    eVar.f43532q = typedArray.getInt(j.MenuItem_numericModifiers, 4096);
                    if (typedArray.hasValue(j.MenuItem_android_checkable)) {
                        eVar.f43533r = typedArray.getBoolean(j.MenuItem_android_checkable, false) ? 1 : 0;
                    } else {
                        eVar.f43533r = eVar.f43520e;
                    }
                    eVar.f43534s = typedArray.getBoolean(j.MenuItem_android_checked, false);
                    eVar.t = typedArray.getBoolean(j.MenuItem_android_visible, eVar.f43521f);
                    eVar.f43535u = typedArray.getBoolean(j.MenuItem_android_enabled, eVar.f43522g);
                    eVar.f43536v = typedArray.getInt(j.MenuItem_showAsAction, -1);
                    eVar.f43539y = typedArray.getString(j.MenuItem_android_onClick);
                    eVar.f43537w = typedArray.getResourceId(j.MenuItem_actionLayout, 0);
                    eVar.f43538x = typedArray.getString(j.MenuItem_actionViewClass);
                    String string3 = typedArray.getString(j.MenuItem_actionProviderClass);
                    if (string3 != null && eVar.f43537w == 0 && eVar.f43538x == null) {
                        eVar.f43540z = (AbstractC1051c) eVar.a(string3, f43542f, fVar.f43544b);
                    } else {
                        eVar.f43540z = null;
                    }
                    eVar.f43511A = typedArray.getText(j.MenuItem_contentDescription);
                    eVar.f43512B = typedArray.getText(j.MenuItem_tooltipText);
                    if (typedArray.hasValue(j.MenuItem_iconTintMode)) {
                        eVar.f43514D = AbstractC0859g0.c(typedArray.getInt(j.MenuItem_iconTintMode, -1), eVar.f43514D);
                    } else {
                        eVar.f43514D = null;
                    }
                    if (typedArray.hasValue(j.MenuItem_iconTint)) {
                        eVar.f43513C = z0E.a(j.MenuItem_iconTint);
                    } else {
                        eVar.f43513C = null;
                    }
                    z0E.g();
                    eVar.f43523h = false;
                } else if (name3.equals("menu")) {
                    eVar.f43523h = true;
                    SubMenu subMenuAddSubMenu = eVar.f43516a.addSubMenu(eVar.f43517b, eVar.f43524i, eVar.f43525j, eVar.f43526k);
                    eVar.b(subMenuAddSubMenu.getItem());
                    xmlResourceParser2 = xmlResourceParser;
                    b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlResourceParser2 = xmlResourceParser;
                    str = name3;
                    z8 = true;
                }
                xmlResourceParser2 = xmlResourceParser;
            }
            eventType = xmlResourceParser2.next();
            i7 = 2;
            z3 = z3;
            z8 = z8;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z3 = false;
        try {
            try {
                layout = this.f43545c.getResources().getLayout(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof k) {
                    k kVar = (k) menu;
                    if (kVar.isDispatchingItemsChanged()) {
                        kVar.stopDispatchingItemsChanged();
                        z3 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z3) {
                    ((k) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z3) {
                ((k) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
