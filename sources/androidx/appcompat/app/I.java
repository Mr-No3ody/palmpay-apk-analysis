package androidx.appcompat.app;

import Me.AbstractC0456a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0891x;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.Z0;
import androidx.appcompat.widget.n1;
import androidx.appcompat.widget.p1;
import androidx.core.app.AbstractC1037f;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.luck.picture.lib.config.PictureMimeType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0841t implements MenuBuilder$Callback, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final M.n f12108X0 = new M.n(0);

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final int[] f12109Y0 = {R.attr.windowBackground};
    public static final boolean Z0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0824b f12110A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f12111A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p343x.f f12112B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public G[] f12113B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f12114C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public G f12115C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f12116D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f12117E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f12118F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f12119G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public DecorContentParent f12120H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public Configuration f12121H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f12122I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f12123J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f12124K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public z f12125L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f12126L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public H f12127M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public E f12128M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public E f12129N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f12130O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f12131P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public p343x.a f12132Q;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f12134R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public Rect f12135S0;
    public Rect T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public L f12136U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public OnBackInvokedDispatcher f12137V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public OnBackInvokedCallback f12138W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ActionBarContextView f12139X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PopupWindow f12140Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public RunnableC0842u f12141Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f12143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f12144p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f12145p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ViewGroup f12146q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f12147r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f12148s0;
    public Window t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f12149t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f12150u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D f12151v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f12152v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f12153w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f12154w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f12155x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f12156y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f12157z0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public androidx.core.view.U f12142k0 = null;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final RunnableC0842u f12133Q0 = new RunnableC0842u(this, 0);

    public I(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AbstractActivityC0837o abstractActivityC0837o = null;
        this.f12122I0 = -100;
        this.f12144p = context;
        this.f12153w = appCompatCallback;
        this.f12143o = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0837o)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0837o = (AbstractActivityC0837o) context;
                    break;
                }
            }
            if (abstractActivityC0837o != null) {
                this.f12122I0 = ((I) abstractActivityC0837o.getDelegate()).f12122I0;
            }
        }
        if (this.f12122I0 == -100) {
            M.n nVar = f12108X0;
            Integer num = (Integer) nVar.get(this.f12143o.getClass().getName());
            if (num != null) {
                this.f12122I0 = num.intValue();
                nVar.remove(this.f12143o.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0891x.d();
    }

    public static androidx.core.os.h q(Context context) {
        androidx.core.os.h hVar;
        androidx.core.os.h hVar2;
        if (Build.VERSION.SDK_INT >= 33 || (hVar = AbstractC0841t.f12316c) == null) {
            return null;
        }
        androidx.core.os.h hVarB = B.b(context.getApplicationContext().getResources().getConfiguration());
        if (hVar.c()) {
            hVar2 = androidx.core.os.h.f16097b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = 0;
            while (i7 < hVarB.d() + hVar.d()) {
                Locale localeB = i7 < hVar.d() ? hVar.b(i7) : hVarB.b(i7 - hVar.d());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i7++;
            }
            hVar2 = new androidx.core.os.h(new androidx.core.os.i(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return hVar2.c() ? hVarB : hVar2;
    }

    public static Configuration u(Context context, int i7, androidx.core.os.h hVar, Configuration configuration, boolean z3) {
        int i10;
        if (i7 == 1) {
            i10 = 16;
        } else if (i7 != 2) {
            i10 = z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i10 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            B.d(configuration2, hVar);
        }
        return configuration2;
    }

    public final AbstractC0456a A(Context context) {
        if (this.f12128M0 == null) {
            if (top.zibin.luban.io.a.f42643g == null) {
                Context applicationContext = context.getApplicationContext();
                top.zibin.luban.io.a.f42643g = new top.zibin.luban.io.a(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.f12128M0 = new E(this, top.zibin.luban.io.a.f42643g);
        }
        return this.f12128M0;
    }

    public final G B(int i7) {
        G[] gArr = this.f12113B0;
        if (gArr == null || gArr.length <= i7) {
            G[] gArr2 = new G[i7 + 1];
            if (gArr != null) {
                System.arraycopy(gArr, 0, gArr2, 0, gArr.length);
            }
            this.f12113B0 = gArr2;
            gArr = gArr2;
        }
        G g7 = gArr[i7];
        if (g7 != null) {
            return g7;
        }
        G g10 = new G();
        g10.f12091a = i7;
        g10.f12104n = false;
        gArr[i7] = g10;
        return g10;
    }

    public final void C() {
        x();
        if (this.f12152v0 && this.f12110A == null) {
            Object obj = this.f12143o;
            if (obj instanceof Activity) {
                this.f12110A = new X((Activity) obj, this.f12154w0);
            } else if (obj instanceof Dialog) {
                this.f12110A = new X((Dialog) obj);
            }
            AbstractC0824b abstractC0824b = this.f12110A;
            if (abstractC0824b != null) {
                abstractC0824b.o(this.f12134R0);
            }
        }
    }

    public final void D(int i7) {
        this.f12131P0 = (1 << i7) | this.f12131P0;
        if (this.f12130O0) {
            return;
        }
        View decorView = this.t.getDecorView();
        RunnableC0842u runnableC0842u = this.f12133Q0;
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        decorView.postOnAnimation(runnableC0842u);
        this.f12130O0 = true;
    }

    public final int E(int i7, Context context) {
        if (i7 != -100) {
            if (i7 == -1) {
                return i7;
            }
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2) {
                    return i7;
                }
                if (i7 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f12129N0 == null) {
                    this.f12129N0 = new E(this, context);
                }
                return this.f12129N0.c();
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return A(context).c();
            }
        }
        return -1;
    }

    public final boolean F() {
        boolean z3 = this.f12116D0;
        this.f12116D0 = false;
        G gB = B(0);
        if (!gB.f12103m) {
            p343x.a aVar = this.f12132Q;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            C();
            AbstractC0824b abstractC0824b = this.f12110A;
            if (abstractC0824b == null || !abstractC0824b.b()) {
                return false;
            }
        } else if (!z3) {
            t(gB, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r15.f12428g.getCount() > 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(androidx.appcompat.app.G r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.I.G(androidx.appcompat.app.G, android.view.KeyEvent):void");
    }

    public final boolean H(G g7, int i7, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((g7.f12101k || I(g7, keyEvent)) && (kVar = g7.f12098h) != null) {
            return kVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    public final boolean I(G g7, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.k kVar;
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme themeNewTheme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (!this.f12119G0) {
            if (g7.f12101k) {
                return true;
            }
            G g10 = this.f12115C0;
            if (g10 != null && g10 != g7) {
                t(g10, false);
            }
            Window.Callback callback = this.t.getCallback();
            int i7 = g7.f12091a;
            if (callback != null) {
                g7.f12097g = callback.onCreatePanelView(i7);
            }
            boolean z3 = i7 == 0 || i7 == 108;
            if (z3 && (decorContentParent4 = this.f12120H) != null) {
                decorContentParent4.setMenuPrepared();
            }
            if (g7.f12097g == null && (!z3 || !(this.f12110A instanceof S))) {
                androidx.appcompat.view.menu.k kVar2 = g7.f12098h;
                if (kVar2 == null || g7.f12105o) {
                    if (kVar2 == null) {
                        Context context = this.f12144p;
                        if ((i7 == 0 || i7 == 108) && this.f12120H != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(p241q.a.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(p241q.a.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(p241q.a.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                                context = contextThemeWrapper;
                            }
                        }
                        androidx.appcompat.view.menu.k kVar3 = new androidx.appcompat.view.menu.k(context);
                        kVar3.setCallback(this);
                        androidx.appcompat.view.menu.k kVar4 = g7.f12098h;
                        if (kVar3 != kVar4) {
                            if (kVar4 != null) {
                                kVar4.removeMenuPresenter(g7.f12099i);
                            }
                            g7.f12098h = kVar3;
                            androidx.appcompat.view.menu.i iVar = g7.f12099i;
                            if (iVar != null) {
                                kVar3.addMenuPresenter(iVar);
                            }
                        }
                        if (g7.f12098h != null) {
                            if (z3 && (decorContentParent2 = this.f12120H) != null) {
                                if (this.f12125L == null) {
                                    this.f12125L = new z(this);
                                }
                                decorContentParent2.setMenu(g7.f12098h, this.f12125L);
                            }
                            g7.f12098h.stopDispatchingItemsChanged();
                            if (callback.onCreatePanelMenu(i7, g7.f12098h)) {
                                g7.f12105o = false;
                            } else {
                                kVar = g7.f12098h;
                                if (kVar != null) {
                                    if (kVar != null) {
                                        kVar.removeMenuPresenter(g7.f12099i);
                                    }
                                    g7.f12098h = null;
                                }
                                if (z3 && (decorContentParent = this.f12120H) != null) {
                                    decorContentParent.setMenu(null, this.f12125L);
                                }
                            }
                        }
                    } else {
                        if (z3) {
                            if (this.f12125L == null) {
                                this.f12125L = new z(this);
                            }
                            decorContentParent2.setMenu(g7.f12098h, this.f12125L);
                        }
                        g7.f12098h.stopDispatchingItemsChanged();
                        if (callback.onCreatePanelMenu(i7, g7.f12098h)) {
                            kVar = g7.f12098h;
                            if (kVar != null) {
                                if (kVar != null) {
                                    kVar.removeMenuPresenter(g7.f12099i);
                                }
                                g7.f12098h = null;
                            }
                            if (z3) {
                                decorContentParent.setMenu(null, this.f12125L);
                            }
                        } else {
                            g7.f12105o = false;
                        }
                    }
                }
                g7.f12098h.stopDispatchingItemsChanged();
                Bundle bundle = g7.f12106p;
                if (bundle != null) {
                    g7.f12098h.restoreActionViewStates(bundle);
                    g7.f12106p = null;
                }
                if (!callback.onPreparePanel(0, g7.f12097g, g7.f12098h)) {
                    if (z3 && (decorContentParent3 = this.f12120H) != null) {
                        decorContentParent3.setMenu(null, this.f12125L);
                    }
                    g7.f12098h.startDispatchingItemsChanged();
                    return false;
                }
                g7.f12098h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                g7.f12098h.startDispatchingItemsChanged();
            }
            g7.f12101k = true;
            g7.f12102l = false;
            this.f12115C0 = g7;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.f12145p0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f12137V0 != null && (B(0).f12103m || this.f12132Q != null)) {
                z3 = true;
            }
            if (z3 && this.f12138W0 == null) {
                this.f12138W0 = C.b(this.f12137V0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f12138W0) == null) {
                    return;
                }
                C.c(this.f12137V0, onBackInvokedCallback);
                this.f12138W0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f12136U0 == null) {
            int[] iArr = p241q.j.AppCompatTheme;
            Context context2 = this.f12144p;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(p241q.j.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f12136U0 = new L();
            } else {
                try {
                    this.f12136U0 = (L) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.f12136U0 = new L();
                }
            }
        }
        L l5 = this.f12136U0;
        int i7 = n1.f12981a;
        return l5.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void b() {
        if (this.f12110A != null) {
            C();
            if (this.f12110A.i()) {
                return;
            }
            D(0);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void d() throws IllegalAccessException {
        String strC;
        this.f12117E0 = true;
        o(false, true);
        y();
        Object obj = this.f12143o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = AbstractC1037f.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC0824b abstractC0824b = this.f12110A;
                if (abstractC0824b == null) {
                    this.f12134R0 = true;
                } else {
                    abstractC0824b.o(true);
                }
            }
            synchronized (AbstractC0841t.f12321i) {
                AbstractC0841t.f(this);
                AbstractC0841t.f12320g.add(new WeakReference(this));
            }
        }
        this.f12121H0 = new Configuration(this.f12144p.getResources().getConfiguration());
        this.f12118F0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AbstractC0841t
    public final void e() {
        if (this.f12143o instanceof Activity) {
            synchronized (AbstractC0841t.f12321i) {
                AbstractC0841t.f(this);
            }
        }
        if (this.f12130O0) {
            this.t.getDecorView().removeCallbacks(this.f12133Q0);
        }
        this.f12119G0 = true;
        if (this.f12122I0 != -100) {
            Object obj = this.f12143o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f12108X0.put(this.f12143o.getClass().getName(), Integer.valueOf(this.f12122I0));
            } else {
                f12108X0.remove(this.f12143o.getClass().getName());
            }
        } else {
            f12108X0.remove(this.f12143o.getClass().getName());
        }
        AbstractC0824b abstractC0824b = this.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.k();
        }
        E e10 = this.f12128M0;
        if (e10 != null) {
            e10.a();
        }
        E e11 = this.f12129N0;
        if (e11 != null) {
            e11.a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final boolean g(int i7) {
        if (i7 == 8) {
            i7 = 108;
        } else if (i7 == 9) {
            i7 = 109;
        }
        if (this.f12157z0 && i7 == 108) {
            return false;
        }
        if (this.f12152v0 && i7 == 1) {
            this.f12152v0 = false;
        }
        if (i7 == 1) {
            J();
            this.f12157z0 = true;
            return true;
        }
        if (i7 == 2) {
            J();
            this.f12149t0 = true;
            return true;
        }
        if (i7 == 5) {
            J();
            this.f12150u0 = true;
            return true;
        }
        if (i7 == 10) {
            J();
            this.f12155x0 = true;
            return true;
        }
        if (i7 == 108) {
            J();
            this.f12152v0 = true;
            return true;
        }
        if (i7 != 109) {
            return this.t.requestFeature(i7);
        }
        J();
        this.f12154w0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void h(int i7) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12146q0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f12144p).inflate(i7, viewGroup);
        this.f12151v.a(this.t.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void i(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12146q0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f12151v.a(this.t.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12146q0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f12151v.a(this.t.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void l(int i7) throws IllegalAccessException {
        if (this.f12122I0 != i7) {
            this.f12122I0 = i7;
            if (this.f12117E0) {
                o(true, true);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0841t
    public final void m(CharSequence charSequence) {
        this.f12114C = charSequence;
        DecorContentParent decorContentParent = this.f12120H;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        AbstractC0824b abstractC0824b = this.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.v(charSequence);
            return;
        }
        TextView textView = this.f12147r0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.appcompat.app.AppCompatCallback, java.lang.Object] */
    @Override // androidx.appcompat.app.AbstractC0841t
    public final p343x.a n(ActionMode$Callback actionMode$Callback) {
        p343x.a aVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        boolean z3 = false;
        int i7 = 1;
        if (actionMode$Callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        p343x.a aVar = this.f12132Q;
        if (aVar != null) {
            aVar.a();
        }
        p279s5.d dVar = new p279s5.d(this, 18, actionMode$Callback, z3);
        C();
        AbstractC0824b abstractC0824b = this.f12110A;
        ?? r3 = this.f12153w;
        if (abstractC0824b != null) {
            p343x.a aVarW = abstractC0824b.w(dVar);
            this.f12132Q = aVarW;
            if (aVarW != null) {
                r3.onSupportActionModeStarted(aVarW);
            }
        }
        if (this.f12132Q == null) {
            androidx.core.view.U u6 = this.f12142k0;
            if (u6 != null) {
                u6.b();
            }
            p343x.a aVar2 = this.f12132Q;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (this.f12119G0) {
                aVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    aVarOnWindowStartingSupportActionMode = r3.onWindowStartingSupportActionMode(dVar);
                } catch (AbstractMethodError unused) {
                    aVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (aVarOnWindowStartingSupportActionMode != null) {
                this.f12132Q = aVarOnWindowStartingSupportActionMode;
            } else {
                if (this.f12139X == null) {
                    if (this.f12156y0) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f12144p;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(p241q.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                        this.f12139X = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, p241q.a.actionModePopupWindowStyle);
                        this.f12140Y = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.f12140Y.setContentView(this.f12139X);
                        this.f12140Y.setWidth(-1);
                        context.getTheme().resolveAttribute(p241q.a.actionBarSize, typedValue, true);
                        this.f12139X.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f12140Y.setHeight(-2);
                        this.f12141Z = new RunnableC0842u(this, i7);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f12146q0.findViewById(p241q.f.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(z()));
                            this.f12139X = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f12139X != null) {
                    androidx.core.view.U u10 = this.f12142k0;
                    if (u10 != null) {
                        u10.b();
                    }
                    this.f12139X.g();
                    Context context2 = this.f12139X.getContext();
                    ActionBarContextView actionBarContextView = this.f12139X;
                    p343x.b bVar = new p343x.b();
                    bVar.f43500c = context2;
                    bVar.f43501d = actionBarContextView;
                    bVar.f43502e = dVar;
                    androidx.appcompat.view.menu.k defaultShowAsAction = new androidx.appcompat.view.menu.k(actionBarContextView.getContext()).setDefaultShowAsAction(1);
                    bVar.f43505i = defaultShowAsAction;
                    defaultShowAsAction.setCallback(bVar);
                    if (((ActionMode$Callback) dVar.f42025b).onCreateActionMode(bVar, defaultShowAsAction)) {
                        bVar.g();
                        this.f12139X.e(bVar);
                        this.f12132Q = bVar;
                        if (this.f12145p0 && (viewGroup = this.f12146q0) != null && viewGroup.isLaidOut()) {
                            this.f12139X.setAlpha(0.0f);
                            androidx.core.view.U uA = androidx.core.view.N.a(this.f12139X);
                            uA.a(1.0f);
                            this.f12142k0 = uA;
                            uA.d(new C0845x(this, i7));
                        } else {
                            this.f12139X.setAlpha(1.0f);
                            this.f12139X.setVisibility(0);
                            if (this.f12139X.getParent() instanceof View) {
                                View view = (View) this.f12139X.getParent();
                                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                                androidx.core.view.C.c(view);
                            }
                        }
                        if (this.f12140Y != null) {
                            this.t.getDecorView().post(this.f12141Z);
                        }
                    } else {
                        this.f12132Q = null;
                    }
                }
            }
            p343x.a aVar3 = this.f12132Q;
            if (aVar3 != null) {
                r3.onSupportActionModeStarted(aVar3);
            }
            K();
            this.f12132Q = this.f12132Q;
        }
        K();
        return this.f12132Q;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(boolean z3, boolean z8) throws IllegalAccessException {
        int i7;
        boolean z10;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        boolean z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        if (this.f12119G0) {
            return false;
        }
        int i10 = this.f12122I0;
        if (i10 == -100) {
            i10 = AbstractC0841t.f12315b;
        }
        int i11 = i10;
        Context context = this.f12144p;
        int iE = E(i11, context);
        int i12 = Build.VERSION.SDK_INT;
        androidx.core.os.h hVarQ = i12 < 33 ? q(context) : null;
        if (!z8 && hVarQ != null) {
            hVarQ = B.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iE, hVarQ, null, false);
        boolean z12 = this.f12126L0;
        Object obj3 = this.f12143o;
        if (z12 || !(obj3 instanceof Activity)) {
            this.f12126L0 = true;
            i7 = this.f12124K0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i7 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i12 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f12124K0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f12124K0 = 0;
                }
                this.f12126L0 = true;
                i7 = this.f12124K0;
            }
        }
        Configuration configuration = this.f12121H0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationU.uiMode & 48;
        androidx.core.os.h hVarB = B.b(configuration);
        androidx.core.os.h hVarB2 = hVarQ == null ? null : B.b(configurationU);
        int i15 = i13 != i14 ? 512 : 0;
        if (hVarB2 != null && !hVarB.equals(hVarB2)) {
            i15 |= 8196;
        }
        if (((~i7) & i15) != 0 && z3 && this.f12117E0 && ((Z0 || this.f12118F0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z10 = false;
            } else {
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && (i15 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                if (i16 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Da.f(activity, z11 ? 1 : 0));
                }
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10 || i15 == 0) {
            z11 = z10;
        } else {
            boolean z13 = (i7 & i15) == i15;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (hVarB2 != null) {
                B.d(configuration2, hVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i17 = Build.VERSION.SDK_INT;
            if (i17 < 26 && i17 < 28) {
                if (!androidx.camera.core.impl.utils.n.f14260l) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        androidx.camera.core.impl.utils.n.f14259k = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e10) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                    }
                    androidx.camera.core.impl.utils.n.f14260l = true;
                }
                Field field = androidx.camera.core.impl.utils.n.f14259k;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e11) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!androidx.camera.core.impl.utils.n.f14254f) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                androidx.camera.core.impl.utils.n.f14253e = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e12) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                            }
                            androidx.camera.core.impl.utils.n.f14254f = true;
                        }
                        Field field2 = androidx.camera.core.impl.utils.n.f14253e;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e13) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!androidx.camera.core.impl.utils.n.f14256h) {
                                try {
                                    androidx.camera.core.impl.utils.n.f14255g = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e14) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e14);
                                }
                                androidx.camera.core.impl.utils.n.f14256h = true;
                            }
                            Class cls = androidx.camera.core.impl.utils.n.f14255g;
                            if (cls != null) {
                                if (!androidx.camera.core.impl.utils.n.f14258j) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        androidx.camera.core.impl.utils.n.f14257i = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e15) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e15);
                                    }
                                    androidx.camera.core.impl.utils.n.f14258j = true;
                                }
                                Field field3 = androidx.camera.core.impl.utils.n.f14257i;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e16) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e16);
                                        longSparseArray = null;
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i18 = this.f12123J0;
            if (i18 != 0) {
                context.setTheme(i18);
                context.getTheme().applyStyle(this.f12123J0, true);
            }
            if (z13 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof LifecycleOwner) {
                    if (((C1212w) ((LifecycleOwner) activity2).getLifecycle()).f17478d.a(EnumC1204n.f17462c)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f12118F0 && !this.f12119G0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z11 && (obj3 instanceof AbstractActivityC0837o)) {
            if ((i15 & 512) != 0) {
                ((AbstractActivityC0837o) obj3).onNightModeChanged(iE);
            }
            if ((i15 & 4) != 0) {
                ((AbstractActivityC0837o) obj3).onLocalesChanged(hVarQ);
            }
        }
        if (hVarB2 != null) {
            B.c(B.b(context.getResources().getConfiguration()));
        }
        if (i11 == 0) {
            A(context).j();
        } else {
            E e17 = this.f12128M0;
            if (e17 != null) {
                e17.a();
            }
        }
        if (i11 == 3) {
            if (this.f12129N0 == null) {
                this.f12129N0 = new E(this, context);
            }
            this.f12129N0.j();
        } else {
            E e18 = this.f12129N0;
            if (e18 != null) {
                e18.a();
            }
        }
        return z11;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return a(null, str, context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        G g7;
        Window.Callback callback = this.t.getCallback();
        if (callback != null && !this.f12119G0) {
            androidx.appcompat.view.menu.k rootMenu = kVar.getRootMenu();
            G[] gArr = this.f12113B0;
            int length = gArr != null ? gArr.length : 0;
            for (int i7 = 0; i7 < length; i7++) {
                g7 = gArr[i7];
                if (g7 != null && g7.f12098h == rootMenu) {
                    if (g7 != null) {
                        return callback.onMenuItemSelected(g7.f12091a, menuItem);
                    }
                }
            }
            g7 = null;
            if (g7 != null) {
                return callback.onMenuItemSelected(g7.f12091a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(androidx.appcompat.view.menu.k kVar) {
        DecorContentParent decorContentParent = this.f12120H;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.f12144p).hasPermanentMenuKey() && !this.f12120H.isOverflowMenuShowPending())) {
            G gB = B(0);
            gB.f12104n = true;
            t(gB, false);
            G(gB, null);
            return;
        }
        Window.Callback callback = this.t.getCallback();
        if (this.f12120H.isOverflowMenuShowing()) {
            this.f12120H.hideOverflowMenu();
            if (this.f12119G0) {
                return;
            }
            callback.onPanelClosed(108, B(0).f12098h);
            return;
        }
        if (callback == null || this.f12119G0) {
            return;
        }
        if (this.f12130O0 && (1 & this.f12131P0) != 0) {
            View decorView = this.t.getDecorView();
            RunnableC0842u runnableC0842u = this.f12133Q0;
            decorView.removeCallbacks(runnableC0842u);
            runnableC0842u.run();
        }
        G gB2 = B(0);
        androidx.appcompat.view.menu.k kVar2 = gB2.f12098h;
        if (kVar2 == null || gB2.f12105o || !callback.onPreparePanel(0, gB2.f12097g, kVar2)) {
            return;
        }
        callback.onMenuOpened(108, gB2.f12098h);
        this.f12120H.showOverflowMenu();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void p(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.t != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof D) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        D d2 = new D(this, callback);
        this.f12151v = d2;
        window.setCallback(d2);
        Z0 z0E = Z0.e(this.f12144p, null, f12109Y0);
        Drawable drawableC = z0E.c(0);
        if (drawableC != null) {
            window.setBackgroundDrawable(drawableC);
        }
        z0E.g();
        this.t = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f12137V0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f12138W0) != null) {
            C.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f12138W0 = null;
        }
        Object obj = this.f12143o;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f12137V0 = C.a(activity);
            } else {
                this.f12137V0 = null;
            }
        } else {
            this.f12137V0 = null;
        }
        K();
    }

    public final void r(int i7, G g7, androidx.appcompat.view.menu.k kVar) {
        if (kVar == null) {
            if (g7 == null && i7 >= 0) {
                G[] gArr = this.f12113B0;
                if (i7 < gArr.length) {
                    g7 = gArr[i7];
                }
            }
            if (g7 != null) {
                kVar = g7.f12098h;
            }
        }
        if ((g7 == null || g7.f12103m) && !this.f12119G0) {
            D d2 = this.f12151v;
            Window.Callback callback = this.t.getCallback();
            d2.getClass();
            try {
                d2.f12086e = true;
                callback.onPanelClosed(i7, kVar);
            } finally {
                d2.f12086e = false;
            }
        }
    }

    public final void s(androidx.appcompat.view.menu.k kVar) {
        if (this.f12111A0) {
            return;
        }
        this.f12111A0 = true;
        this.f12120H.dismissPopups();
        Window.Callback callback = this.t.getCallback();
        if (callback != null && !this.f12119G0) {
            callback.onPanelClosed(108, kVar);
        }
        this.f12111A0 = false;
    }

    public final void t(G g7, boolean z3) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z3 && g7.f12091a == 0 && (decorContentParent = this.f12120H) != null && decorContentParent.isOverflowMenuShowing()) {
            s(g7.f12098h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f12144p.getSystemService("window");
        if (windowManager != null && g7.f12103m && (viewGroup = g7.f12095e) != null) {
            windowManager.removeView(viewGroup);
            if (z3) {
                r(g7.f12091a, g7, null);
            }
        }
        g7.f12101k = false;
        g7.f12102l = false;
        g7.f12103m = false;
        g7.f12096f = null;
        g7.f12104n = true;
        if (this.f12115C0 == g7) {
            this.f12115C0 = null;
        }
        if (g7.f12091a == 0) {
            K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6 A[RETURN] */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        G gB;
        DecorContentParent decorContentParent;
        boolean z3;
        boolean zHideOverflowMenu;
        boolean zI;
        AudioManager audioManager;
        G gB2;
        Object obj = this.f12143o;
        if ((!(obj instanceof KeyEventDispatcher$Component) && !(obj instanceof K)) || (decorView = this.t.getDecorView()) == null || !com.facebook.imagepipeline.nativecode.b.j(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                D d2 = this.f12151v;
                Window.Callback callback = this.t.getCallback();
                d2.getClass();
                try {
                    d2.f12085d = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    d2.f12085d = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f12116D0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    gB2 = B(0);
                                    if (!gB2.f12103m) {
                                        I(gB2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f12132Q == null) {
                                    gB = B(0);
                                    decorContentParent = this.f12120H;
                                    Context context = this.f12144p;
                                    if (decorContentParent != null || !decorContentParent.canShowOverflowMenu() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z3 = gB.f12103m;
                                        if (!z3 || gB.f12102l) {
                                            t(gB, true);
                                            zHideOverflowMenu = z3;
                                        } else if (gB.f12101k) {
                                            if (gB.f12105o) {
                                                gB.f12101k = false;
                                                zI = I(gB, keyEvent);
                                            } else {
                                                zI = true;
                                            }
                                            if (zI) {
                                                G(gB, keyEvent);
                                                zHideOverflowMenu = true;
                                            } else {
                                                zHideOverflowMenu = false;
                                            }
                                        } else {
                                            zHideOverflowMenu = false;
                                        }
                                    } else if (this.f12120H.isOverflowMenuShowing()) {
                                        zHideOverflowMenu = this.f12120H.hideOverflowMenu();
                                    } else if (this.f12119G0 || !I(gB, keyEvent)) {
                                        zHideOverflowMenu = false;
                                    } else {
                                        zHideOverflowMenu = this.f12120H.showOverflowMenu();
                                    }
                                    if (zHideOverflowMenu && (audioManager = (AudioManager) context.getApplicationContext().getSystemService(PictureMimeType.MIME_TYPE_PREFIX_AUDIO)) != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (F()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    d2.f12085d = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f12116D0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            gB2 = B(0);
                            if (!gB2.f12103m) {
                                I(gB2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f12132Q == null) {
                            gB = B(0);
                            decorContentParent = this.f12120H;
                            Context context2 = this.f12144p;
                            if (decorContentParent != null) {
                                z3 = gB.f12103m;
                                if (z3) {
                                    t(gB, true);
                                    zHideOverflowMenu = z3;
                                } else {
                                    t(gB, true);
                                    zHideOverflowMenu = z3;
                                }
                            } else {
                                z3 = gB.f12103m;
                                if (z3) {
                                    t(gB, true);
                                    zHideOverflowMenu = z3;
                                } else {
                                    t(gB, true);
                                    zHideOverflowMenu = z3;
                                }
                            }
                            if (zHideOverflowMenu) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (F()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void w(int i7) {
        G gB = B(i7);
        if (gB.f12098h != null) {
            Bundle bundle = new Bundle();
            gB.f12098h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                gB.f12106p = bundle;
            }
            gB.f12098h.stopDispatchingItemsChanged();
            gB.f12098h.clear();
        }
        gB.f12105o = true;
        gB.f12104n = true;
        if ((i7 == 108 || i7 == 0) && this.f12120H != null) {
            G gB2 = B(0);
            gB2.f12101k = false;
            I(gB2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f12145p0) {
            return;
        }
        int[] iArr = p241q.j.AppCompatTheme;
        Context context = this.f12144p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(p241q.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTheme_windowNoTitle, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTheme_windowActionBar, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTheme_windowActionBarOverlay, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTheme_windowActionModeOverlay, false)) {
            g(10);
        }
        this.f12156y0 = typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.t.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f12157z0) {
            viewGroup = this.f12155x0 ? (ViewGroup) layoutInflaterFrom.inflate(p241q.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(p241q.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.f12156y0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(p241q.g.abc_dialog_title_material, (ViewGroup) null);
            this.f12154w0 = false;
            this.f12152v0 = false;
        } else if (this.f12152v0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(p241q.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(p241q.g.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(p241q.f.decor_content_parent);
            this.f12120H = decorContentParent;
            decorContentParent.setWindowCallback(this.t.getCallback());
            if (this.f12154w0) {
                this.f12120H.initFeature(109);
            }
            if (this.f12149t0) {
                this.f12120H.initFeature(2);
            }
            if (this.f12150u0) {
                this.f12120H.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f12152v0 + ", windowActionBarOverlay: " + this.f12154w0 + ", android:windowIsFloating: " + this.f12156y0 + ", windowActionModeOverlay: " + this.f12155x0 + ", windowNoTitle: " + this.f12157z0 + " }");
        }
        C0843v c0843v = new C0843v(this);
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.E.n(viewGroup, c0843v);
        if (this.f12120H == null) {
            this.f12147r0 = (TextView) viewGroup.findViewById(p241q.f.title);
        }
        boolean z3 = p1.f12995a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(p241q.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.t.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.t.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0844w(this));
        this.f12146q0 = viewGroup;
        Object obj = this.f12143o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f12114C;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.f12120H;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                AbstractC0824b abstractC0824b = this.f12110A;
                if (abstractC0824b != null) {
                    abstractC0824b.v(title);
                } else {
                    TextView textView = this.f12147r0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f12146q0.findViewById(R.id.content);
        View decorView = this.t.getDecorView();
        contentFrameLayout2.f12648g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(p241q.j.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(p241q.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(p241q.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(p241q.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(p241q.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(p241q.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(p241q.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(p241q.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(p241q.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(p241q.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(p241q.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f12145p0 = true;
        G gB = B(0);
        if (this.f12119G0 || gB.f12098h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.t == null) {
            Object obj = this.f12143o;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context z() {
        C();
        AbstractC0824b abstractC0824b = this.f12110A;
        Context contextF = abstractC0824b != null ? abstractC0824b.f() : null;
        return contextF == null ? this.f12144p : contextF;
    }
}
