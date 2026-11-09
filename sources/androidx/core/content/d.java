package androidx.core.content;

import Y.g;
import Y.j;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.app.AbstractC1037f;
import androidx.core.app.AbstractC1038g;
import androidx.core.app.M;
import androidx.core.app.s;
import androidx.core.os.h;
import androidx.core.os.i;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16012a = null;

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new M(context).f15943b.areNotificationsEnabled() ? 0 : -1;
    }

    public static int b(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC1038g.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static ColorStateList c(int i7, Context context) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        Y.f fVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        g gVar = new g(resources, theme);
        synchronized (j.f11256c) {
            try {
                SparseArray sparseArray = (SparseArray) j.f11255b.get(gVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (fVar = (Y.f) sparseArray.get(i7)) == null) {
                    colorStateList = null;
                } else {
                    if (fVar.f11250b.equals(resources.getConfiguration())) {
                        if (theme != null || fVar.f11251c != 0) {
                            if (theme == null || fVar.f11251c != theme.hashCode()) {
                            }
                        }
                        colorStateList = fVar.f11249a;
                    }
                    sparseArray.remove(i7);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = j.f11254a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i7, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateListA = Y.b.a(resources, resources.getXml(i7), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i7, theme);
        }
        synchronized (j.f11256c) {
            try {
                WeakHashMap weakHashMap = j.f11255b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(gVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(gVar, sparseArray2);
                }
                sparseArray2.append(i7, new Y.f(colorStateListA, gVar.f11252a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Executor d(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(context) : new androidx.core.os.f(new Handler(context.getMainLooper()));
    }

    public static String e(int i7, Context context) {
        h hVarA;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            Object systemService = context.getSystemService("locale");
            hVarA = systemService != null ? new h(new i(s.a(systemService))) : h.f16097b;
        } else {
            hVarA = h.a(AbstractC1037f.e(context));
        }
        if (i10 <= 32 && !hVarA.c()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(hVarA.f16098a.f16099a);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i7);
    }

    public static void f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            a.b(context, broadcastReceiver, intentFilter);
        } else if (i7 >= 26) {
            a.a(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
