package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.B0;
import androidx.appcompat.widget.C0891x;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.n1;
import androidx.core.app.AbstractC1037f;
import androidx.core.app.TaskStackBuilder$SupportParentable;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.internal.ViewUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0837o extends androidx.fragment.app.E implements AppCompatCallback, TaskStackBuilder$SupportParentable, ActionBarDrawerToggle$DelegateProvider {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0841t mDelegate;
    private Resources mResources;

    public AbstractActivityC0837o() {
        getSavedStateRegistry().c(DELEGATE_TAG, new C0835m(this));
        addOnContextAvailableListener(new C0836n(this));
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        I i7 = (I) getDelegate();
        i7.x();
        ((ViewGroup) i7.f12146q0.findViewById(R.id.content)).addView(view, layoutParams);
        i7.f12151v.a(i7.t.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01db  */
    /* JADX WARN: Code duplicated, block: B:120:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:127:0x0201  */
    /* JADX WARN: Code duplicated, block: B:154:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x0134  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:96:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        ContextThemeWrapper contextThemeWrapper;
        Resources.Theme theme;
        Method method;
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46 = 3;
        I i47 = (I) getDelegate();
        i47.f12117E0 = true;
        int i48 = i47.f12122I0;
        if (i48 == -100) {
            i48 = AbstractC0841t.f12315b;
        }
        int iE = i47.E(i48, context);
        if (AbstractC0841t.c(context) && AbstractC0841t.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0841t.f12322j) {
                    try {
                        androidx.core.os.h hVar = AbstractC0841t.f12316c;
                        if (hVar == null) {
                            if (AbstractC0841t.f12317d == null) {
                                AbstractC0841t.f12317d = androidx.core.os.h.a(AbstractC1037f.e(context));
                            }
                            if (!AbstractC0841t.f12317d.c()) {
                                AbstractC0841t.f12316c = AbstractC0841t.f12317d;
                            }
                        } else if (!hVar.equals(AbstractC0841t.f12317d)) {
                            androidx.core.os.h hVar2 = AbstractC0841t.f12316c;
                            AbstractC0841t.f12317d = hVar2;
                            AbstractC1037f.d(context, hVar2.e());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC0841t.f12319f) {
                AbstractC0841t.f12314a.execute(new H0.e(context, i46));
            }
        }
        androidx.core.os.h hVarQ = I.q(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(I.u(context, iE, hVarQ, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof ContextThemeWrapper) {
                    try {
                        ((ContextThemeWrapper) context).applyOverrideConfiguration(I.u(context, iE, hVarQ, null, false));
                    } catch (IllegalStateException unused2) {
                        if (I.Z0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f10 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f10 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i7 = configuration.mcc;
                                    i10 = configuration2.mcc;
                                    if (i7 != i10) {
                                        configuration3.mcc = i10;
                                    }
                                    i11 = configuration.mnc;
                                    i12 = configuration2.mnc;
                                    if (i11 != i12) {
                                        configuration3.mnc = i12;
                                    }
                                    i13 = Build.VERSION.SDK_INT;
                                    B.a(configuration, configuration2, configuration3);
                                    i14 = configuration.touchscreen;
                                    i15 = configuration2.touchscreen;
                                    if (i14 != i15) {
                                        configuration3.touchscreen = i15;
                                    }
                                    i16 = configuration.keyboard;
                                    i17 = configuration2.keyboard;
                                    if (i16 != i17) {
                                        configuration3.keyboard = i17;
                                    }
                                    i18 = configuration.keyboardHidden;
                                    i19 = configuration2.keyboardHidden;
                                    if (i18 != i19) {
                                        configuration3.keyboardHidden = i19;
                                    }
                                    i20 = configuration.navigation;
                                    i21 = configuration2.navigation;
                                    if (i20 != i21) {
                                        configuration3.navigation = i21;
                                    }
                                    i22 = configuration.navigationHidden;
                                    i23 = configuration2.navigationHidden;
                                    if (i22 != i23) {
                                        configuration3.navigationHidden = i23;
                                    }
                                    i24 = configuration.orientation;
                                    i25 = configuration2.orientation;
                                    if (i24 != i25) {
                                        configuration3.orientation = i25;
                                    }
                                    i26 = configuration.screenLayout & 15;
                                    i27 = configuration2.screenLayout & 15;
                                    if (i26 != i27) {
                                        configuration3.screenLayout |= i27;
                                    }
                                    i28 = configuration.screenLayout & JfifUtil.MARKER_SOFn;
                                    i29 = configuration2.screenLayout & JfifUtil.MARKER_SOFn;
                                    if (i28 != i29) {
                                        configuration3.screenLayout |= i29;
                                    }
                                    i30 = configuration.screenLayout & 48;
                                    i31 = configuration2.screenLayout & 48;
                                    if (i30 != i31) {
                                        configuration3.screenLayout |= i31;
                                    }
                                    i32 = configuration.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                                    i33 = configuration2.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                                    if (i32 != i33) {
                                        configuration3.screenLayout |= i33;
                                    }
                                    if (i13 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode = (3 & configuration2.colorMode) | configuration3.colorMode;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i34 = configuration.uiMode & 15;
                                    i35 = configuration2.uiMode & 15;
                                    if (i34 != i35) {
                                        configuration3.uiMode |= i35;
                                    }
                                    i36 = configuration.uiMode & 48;
                                    i37 = configuration2.uiMode & 48;
                                    if (i36 != i37) {
                                        configuration3.uiMode |= i37;
                                    }
                                    i38 = configuration.screenWidthDp;
                                    i39 = configuration2.screenWidthDp;
                                    if (i38 != i39) {
                                        configuration3.screenWidthDp = i39;
                                    }
                                    i40 = configuration.screenHeightDp;
                                    i41 = configuration2.screenHeightDp;
                                    if (i40 != i41) {
                                        configuration3.screenHeightDp = i41;
                                    }
                                    i42 = configuration.smallestScreenWidthDp;
                                    i43 = configuration2.smallestScreenWidthDp;
                                    if (i42 != i43) {
                                        configuration3.smallestScreenWidthDp = i43;
                                    }
                                    i44 = configuration.densityDpi;
                                    i45 = configuration2.densityDpi;
                                    if (i44 != i45) {
                                        configuration3.densityDpi = i45;
                                    }
                                }
                            }
                            Configuration configurationU = I.u(context, iE, hVarQ, configuration3, true);
                            contextThemeWrapper = new ContextThemeWrapper(context, p241q.i.Theme_AppCompat_Empty);
                            contextThemeWrapper.applyOverrideConfiguration(configurationU);
                            try {
                                if (context.getTheme() != null) {
                                    theme = contextThemeWrapper.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        Y.i.a(theme);
                                    } else {
                                        synchronized (Y.a.f11233e) {
                                            if (!Y.a.f11235g) {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                                    Y.a.f11234f = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException unused3) {
                                                }
                                                Y.a.f11235g = true;
                                            }
                                            method = Y.a.f11234f;
                                            if (method != null) {
                                                try {
                                                    method.invoke(theme, new Object[0]);
                                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                                    Y.a.f11234f = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused5) {
                            }
                            context = contextThemeWrapper;
                        }
                    }
                } else if (I.Z0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i7 = configuration.mcc;
                            i10 = configuration2.mcc;
                            if (i7 != i10) {
                                configuration3.mcc = i10;
                            }
                            i11 = configuration.mnc;
                            i12 = configuration2.mnc;
                            if (i11 != i12) {
                                configuration3.mnc = i12;
                            }
                            i13 = Build.VERSION.SDK_INT;
                            B.a(configuration, configuration2, configuration3);
                            i14 = configuration.touchscreen;
                            i15 = configuration2.touchscreen;
                            if (i14 != i15) {
                                configuration3.touchscreen = i15;
                            }
                            i16 = configuration.keyboard;
                            i17 = configuration2.keyboard;
                            if (i16 != i17) {
                                configuration3.keyboard = i17;
                            }
                            i18 = configuration.keyboardHidden;
                            i19 = configuration2.keyboardHidden;
                            if (i18 != i19) {
                                configuration3.keyboardHidden = i19;
                            }
                            i20 = configuration.navigation;
                            i21 = configuration2.navigation;
                            if (i20 != i21) {
                                configuration3.navigation = i21;
                            }
                            i22 = configuration.navigationHidden;
                            i23 = configuration2.navigationHidden;
                            if (i22 != i23) {
                                configuration3.navigationHidden = i23;
                            }
                            i24 = configuration.orientation;
                            i25 = configuration2.orientation;
                            if (i24 != i25) {
                                configuration3.orientation = i25;
                            }
                            i26 = configuration.screenLayout & 15;
                            i27 = configuration2.screenLayout & 15;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & JfifUtil.MARKER_SOFn;
                            i29 = configuration2.screenLayout & JfifUtil.MARKER_SOFn;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 48;
                            i31 = configuration2.screenLayout & 48;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            i32 = configuration.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                            i33 = configuration2.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                            if (i32 != i33) {
                                configuration3.screenLayout |= i33;
                            }
                            if (i13 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode = (3 & configuration2.colorMode) | configuration3.colorMode;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i34 = configuration.uiMode & 15;
                            i35 = configuration2.uiMode & 15;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.uiMode & 48;
                            i37 = configuration2.uiMode & 48;
                            if (i36 != i37) {
                                configuration3.uiMode |= i37;
                            }
                            i38 = configuration.screenWidthDp;
                            i39 = configuration2.screenWidthDp;
                            if (i38 != i39) {
                                configuration3.screenWidthDp = i39;
                            }
                            i40 = configuration.screenHeightDp;
                            i41 = configuration2.screenHeightDp;
                            if (i40 != i41) {
                                configuration3.screenHeightDp = i41;
                            }
                            i42 = configuration.smallestScreenWidthDp;
                            i43 = configuration2.smallestScreenWidthDp;
                            if (i42 != i43) {
                                configuration3.smallestScreenWidthDp = i43;
                            }
                            i44 = configuration.densityDpi;
                            i45 = configuration2.densityDpi;
                            if (i44 != i45) {
                                configuration3.densityDpi = i45;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationU2 = I.u(context, iE, hVarQ, configuration3, true);
                    contextThemeWrapper = new ContextThemeWrapper(context, p241q.i.Theme_AppCompat_Empty);
                    contextThemeWrapper.applyOverrideConfiguration(configurationU2);
                    if (context.getTheme() != null) {
                        theme = contextThemeWrapper.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            Y.i.a(theme);
                        } else {
                            synchronized (Y.a.f11233e) {
                                if (!Y.a.f11235g) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    Y.a.f11234f = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    Y.a.f11235g = true;
                                }
                                method = Y.a.f11234f;
                                if (method != null) {
                                    method.invoke(theme, new Object[0]);
                                }
                            }
                        }
                    }
                    context = contextThemeWrapper;
                }
            }
        } else if (context instanceof ContextThemeWrapper) {
            ((ContextThemeWrapper) context).applyOverrideConfiguration(I.u(context, iE, hVarQ, null, false));
        } else if (I.Z0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i7 = configuration.mcc;
                    i10 = configuration2.mcc;
                    if (i7 != i10) {
                        configuration3.mcc = i10;
                    }
                    i11 = configuration.mnc;
                    i12 = configuration2.mnc;
                    if (i11 != i12) {
                        configuration3.mnc = i12;
                    }
                    i13 = Build.VERSION.SDK_INT;
                    B.a(configuration, configuration2, configuration3);
                    i14 = configuration.touchscreen;
                    i15 = configuration2.touchscreen;
                    if (i14 != i15) {
                        configuration3.touchscreen = i15;
                    }
                    i16 = configuration.keyboard;
                    i17 = configuration2.keyboard;
                    if (i16 != i17) {
                        configuration3.keyboard = i17;
                    }
                    i18 = configuration.keyboardHidden;
                    i19 = configuration2.keyboardHidden;
                    if (i18 != i19) {
                        configuration3.keyboardHidden = i19;
                    }
                    i20 = configuration.navigation;
                    i21 = configuration2.navigation;
                    if (i20 != i21) {
                        configuration3.navigation = i21;
                    }
                    i22 = configuration.navigationHidden;
                    i23 = configuration2.navigationHidden;
                    if (i22 != i23) {
                        configuration3.navigationHidden = i23;
                    }
                    i24 = configuration.orientation;
                    i25 = configuration2.orientation;
                    if (i24 != i25) {
                        configuration3.orientation = i25;
                    }
                    i26 = configuration.screenLayout & 15;
                    i27 = configuration2.screenLayout & 15;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.screenLayout & JfifUtil.MARKER_SOFn;
                    i29 = configuration2.screenLayout & JfifUtil.MARKER_SOFn;
                    if (i28 != i29) {
                        configuration3.screenLayout |= i29;
                    }
                    i30 = configuration.screenLayout & 48;
                    i31 = configuration2.screenLayout & 48;
                    if (i30 != i31) {
                        configuration3.screenLayout |= i31;
                    }
                    i32 = configuration.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                    i33 = configuration2.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                    if (i32 != i33) {
                        configuration3.screenLayout |= i33;
                    }
                    if (i13 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode = (3 & configuration2.colorMode) | configuration3.colorMode;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i34 = configuration.uiMode & 15;
                    i35 = configuration2.uiMode & 15;
                    if (i34 != i35) {
                        configuration3.uiMode |= i35;
                    }
                    i36 = configuration.uiMode & 48;
                    i37 = configuration2.uiMode & 48;
                    if (i36 != i37) {
                        configuration3.uiMode |= i37;
                    }
                    i38 = configuration.screenWidthDp;
                    i39 = configuration2.screenWidthDp;
                    if (i38 != i39) {
                        configuration3.screenWidthDp = i39;
                    }
                    i40 = configuration.screenHeightDp;
                    i41 = configuration2.screenHeightDp;
                    if (i40 != i41) {
                        configuration3.screenHeightDp = i41;
                    }
                    i42 = configuration.smallestScreenWidthDp;
                    i43 = configuration2.smallestScreenWidthDp;
                    if (i42 != i43) {
                        configuration3.smallestScreenWidthDp = i43;
                    }
                    i44 = configuration.densityDpi;
                    i45 = configuration2.densityDpi;
                    if (i44 != i45) {
                        configuration3.densityDpi = i45;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationU3 = I.u(context, iE, hVarQ, configuration3, true);
            contextThemeWrapper = new ContextThemeWrapper(context, p241q.i.Theme_AppCompat_Empty);
            contextThemeWrapper.applyOverrideConfiguration(configurationU3);
            if (context.getTheme() != null) {
                theme = contextThemeWrapper.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    Y.i.a(theme);
                } else {
                    synchronized (Y.a.f11233e) {
                        if (!Y.a.f11235g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            Y.a.f11234f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            Y.a.f11235g = true;
                        }
                        method = Y.a.f11234f;
                        if (method != null) {
                            method.invoke(theme, new Object[0]);
                        }
                    }
                }
            }
            context = contextThemeWrapper;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.AbstractActivityC1040i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.m(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@IdRes int i7) {
        I i10 = (I) getDelegate();
        i10.x();
        return (T) i10.t.findViewById(i7);
    }

    @NonNull
    public AbstractC0841t getDelegate() {
        if (this.mDelegate == null) {
            r rVar = AbstractC0841t.f12314a;
            this.mDelegate = new I(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle$DelegateProvider
    @Nullable
    public ActionBarDrawerToggle$Delegate getDrawerToggleDelegate() {
        I i7 = (I) getDelegate();
        i7.getClass();
        return new y(i7);
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        I i7 = (I) getDelegate();
        if (i7.f12112B == null) {
            i7.C();
            AbstractC0824b abstractC0824b = i7.f12110A;
            i7.f12112B = new p343x.f(abstractC0824b != null ? abstractC0824b.f() : i7.f12144p);
        }
        return i7.f12112B;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i7 = n1.f12981a;
        }
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public AbstractC0824b getSupportActionBar() {
        I i7 = (I) getDelegate();
        i7.C();
        return i7.f12110A;
    }

    @Override // androidx.core.app.TaskStackBuilder$SupportParentable
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return AbstractC1037f.b(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        I i7 = (I) getDelegate();
        if (i7.f12152v0 && i7.f12145p0) {
            i7.C();
            AbstractC0824b abstractC0824b = i7.f12110A;
            if (abstractC0824b != null) {
                abstractC0824b.j();
            }
        }
        C0891x c0891xA = C0891x.a();
        Context context = i7.f12144p;
        synchronized (c0891xA) {
            B0 b0 = c0891xA.f13028a;
            synchronized (b0) {
                M.j jVar = (M.j) b0.f12632b.get(context);
                if (jVar != null) {
                    jVar.a();
                }
            }
        }
        i7.f12121H0 = new Configuration(i7.f12144p.getResources().getConfiguration());
        i7.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull androidx.core.app.Q q10) {
        q10.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC1037f.b(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(q10.f15953b.getPackageManager());
            }
            q10.a(component);
            q10.f15952a.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    public void onLocalesChanged(@NonNull androidx.core.os.h hVar) {
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.e() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    public void onNightModeChanged(int i7) {
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, @NonNull Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        ((I) getDelegate()).x();
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        I i7 = (I) getDelegate();
        i7.C();
        AbstractC0824b abstractC0824b = i7.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.t(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull androidx.core.app.Q q10) {
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onStart() throws IllegalAccessException {
        super.onStart();
        ((I) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public void onStop() {
        super.onStop();
        I i7 = (I) getDelegate();
        i7.C();
        AbstractC0824b abstractC0824b = i7.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.t(false);
        }
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.Q q10 = new androidx.core.app.Q(this);
        onCreateSupportNavigateUpTaskStack(q10);
        onPrepareSupportNavigateUpTaskStack(q10);
        q10.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        getDelegate().m(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public p343x.a onWindowStartingSupportActionMode(@NonNull ActionMode$Callback actionMode$Callback) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.n()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void setContentView(@LayoutRes int i7) {
        initializeViewTreeOwners();
        getDelegate().h(i7);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        I i7 = (I) getDelegate();
        if (i7.f12143o instanceof Activity) {
            i7.C();
            AbstractC0824b abstractC0824b = i7.f12110A;
            if (abstractC0824b instanceof X) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            i7.f12112B = null;
            if (abstractC0824b != null) {
                abstractC0824b.k();
            }
            i7.f12110A = null;
            if (toolbar != null) {
                Object obj = i7.f12143o;
                S s3 = new S(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : i7.f12114C, i7.f12151v);
                i7.f12110A = s3;
                i7.f12151v.f12083b = s3.f12166c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                i7.f12151v.f12083b = null;
            }
            i7.b();
        }
    }

    @Deprecated
    public void setSupportProgress(int i7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z3) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@StyleRes int i7) {
        super.setTheme(i7);
        ((I) getDelegate()).f12123J0 = i7;
    }

    @Nullable
    public p343x.a startSupportActionMode(@NonNull ActionMode$Callback actionMode$Callback) {
        return getDelegate().n(actionMode$Callback);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i7) {
        return getDelegate().g(i7);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().i(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().j(view, layoutParams);
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @CallSuper
    public void onSupportActionModeFinished(@NonNull p343x.a aVar) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @CallSuper
    public void onSupportActionModeStarted(@NonNull p343x.a aVar) {
    }
}
