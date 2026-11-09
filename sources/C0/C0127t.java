package C0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.fragment.NavHostFragment;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.palmpay.lib.scanplus.view.ScanView;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.collections.C1843j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: C0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127t extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0127t(Object obj, int i7) {
        super(0);
        this.f1089a = i7;
        this.f1090b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC1205o lifecycle;
        N0.k sQLiteOpenHelper;
        switch (this.f1089a) {
            case 0:
                AbstractC0130w abstractC0130w = (AbstractC0130w) this.f1090b;
                abstractC0130w.getClass();
                return new S(abstractC0130w.f1101a, abstractC0130w.f1120u);
            case 1:
                NavHostFragment owner = (NavHostFragment) this.f1090b;
                Context context = owner.getContext();
                if (context == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…nt is attached\"\n        }");
                Intrinsics.checkNotNullParameter(context, "context");
                P navController = new P(context);
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (!owner.equals(navController.f1114n)) {
                    LifecycleOwner lifecycleOwner = navController.f1114n;
                    C0120l c0120l = navController.f1118r;
                    if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.b(c0120l);
                    }
                    navController.f1114n = owner;
                    owner.getLifecycle().a(c0120l);
                }
                androidx.lifecycle.i0 viewModelStore = owner.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
                Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
                C0131x c0131x = navController.f1115o;
                C0131x.a aVar = C0131x.f1126e;
                if (!Intrinsics.c(c0131x, aVar.getInstance(viewModelStore))) {
                    if (!navController.f1107g.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    navController.f1115o = aVar.getInstance(viewModelStore);
                }
                Intrinsics.checkNotNullParameter(navController, "navHostController");
                Intrinsics.checkNotNullParameter(navController, "navController");
                g0 g0Var = navController.f1120u;
                Context contextRequireContext = owner.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                androidx.fragment.app.Z childFragmentManager = owner.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                g0Var.a(new E0.b(contextRequireContext, childFragmentManager));
                Context contextRequireContext2 = owner.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext()");
                androidx.fragment.app.Z childFragmentManager2 = owner.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
                int id2 = owner.getId();
                if (id2 == 0 || id2 == -1) {
                    id2 = E0.o.nav_host_fragment_container;
                }
                navController.f1120u.a(new E0.f(contextRequireContext2, childFragmentManager2, id2));
                Bundle bundleA = owner.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                if (bundleA != null) {
                    bundleA.setClassLoader(context.getClassLoader());
                    navController.f1104d = bundleA.getBundle("android-support-nav:controller:navigatorState");
                    navController.f1105e = bundleA.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = navController.f1113m;
                    linkedHashMap.clear();
                    int[] intArray = bundleA.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i7 = 0;
                        int i10 = 0;
                        while (i7 < length) {
                            navController.f1112l.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i10));
                            i7++;
                            i10++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String id3 : stringArrayList2) {
                            Parcelable[] parcelableArray = bundleA.getParcelableArray("android-support-nav:controller:backStackStates:" + id3);
                            if (parcelableArray != null) {
                                Intrinsics.checkNotNullExpressionValue(id3, "id");
                                C1843j c1843j = new C1843j(parcelableArray.length);
                                M.q qVarA = AbstractC1859i.a(parcelableArray);
                                while (qVarA.hasNext()) {
                                    Parcelable parcelable = (Parcelable) qVarA.next();
                                    Intrinsics.f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    c1843j.addLast((NavBackStackEntryState) parcelable);
                                }
                                linkedHashMap.put(id3, c1843j);
                            }
                        }
                    }
                    navController.f1106f = bundleA.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                owner.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new E0.n(navController, 0));
                Bundle bundleA2 = owner.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                if (bundleA2 != null) {
                    owner.f17505c = bundleA2.getInt("android-support-nav:fragment:graphId");
                }
                owner.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new E0.n(owner, 1));
                int i11 = owner.f17505c;
                p355xf.t tVar = navController.f1099B;
                if (i11 != 0) {
                    navController.q(((S) tVar.getValue()).b(i11), null);
                } else {
                    Bundle arguments = owner.getArguments();
                    int i12 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i12 != 0) {
                        navController.q(((S) tVar.getValue()).b(i12), bundle);
                    }
                }
                return navController;
            case 2:
                okhttp3.D d2 = ((Gg.n) this.f1090b).f3465e;
                Intrinsics.e(d2);
                List<Certificate> listA = d2.a();
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(listA, 10));
                for (Certificate certificate : listA) {
                    Intrinsics.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 3:
                return new I5.d((IconicsAnimationProcessor) this.f1090b);
            case 4:
                ((View) this.f1090b).invalidate();
                return Unit.f38893a;
            case 5:
                ScanView scanView = (ScanView) this.f1090b;
                scanView.f(true);
                OnScanListener onScanListener = scanView.f24046e;
                if (onScanListener != null) {
                    onScanListener.onCancel();
                }
                return Unit.f38893a;
            case 6:
                N0.l lVar = (N0.l) this.f1090b;
                if (lVar.f6055b == null || !lVar.f6057d) {
                    sQLiteOpenHelper = new N0.k(lVar.f6054a, lVar.f6055b, new N0.f(), lVar.f6056c, lVar.f6058e);
                } else {
                    Context context2 = lVar.f6054a;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                    sQLiteOpenHelper = new N0.k(lVar.f6054a, new File(noBackupFilesDir, lVar.f6055b).getAbsolutePath(), new N0.f(), lVar.f6056c, lVar.f6058e);
                }
                boolean z3 = lVar.f6060g;
                Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
                sQLiteOpenHelper.setWriteAheadLoggingEnabled(z3);
                return sQLiteOpenHelper;
            case 7:
                return (ViewModelStoreOwner) ((Zd.B) this.f1090b).invoke();
            case 8:
                return (ViewModelStoreOwner) ((Zd.B) this.f1090b).invoke();
            case 9:
                return (ViewModelStoreOwner) ((Zd.G) this.f1090b).invoke();
            case 10:
                return (ViewModelStoreOwner) ((Zd.G) this.f1090b).invoke();
            case 11:
                return androidx.lifecycle.V.g((ViewModelStoreOwner) this.f1090b);
            case 12:
                androidx.room.P p3 = (androidx.room.P) this.f1090b;
                return p3.f17739a.compileStatement(p3.b());
            case 13:
                ((Function0) this.f1090b).invoke();
                return Unit.f38893a;
            case 14:
                return new androidx.work.impl.constraints.c[((Flow[]) this.f1090b).length];
            case 15:
                p135j0.T t = p135j0.U.f37982d;
                Object activeFilesLock$datastore_core_release = t.getActiveFilesLock$datastore_core_release();
                File file = (File) this.f1090b;
                synchronized (activeFilesLock$datastore_core_release) {
                    t.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
                }
                return Unit.f38893a;
            case 16:
                ((DisposableHandle) this.f1090b).dispose();
                return Unit.f38893a;
            case 17:
                return (ViewModelStoreOwner) ((m9.j) this.f1090b).invoke();
            case 18:
                File file2 = (File) ((E0.h) this.f1090b).invoke();
                if (Intrinsics.c(Kf.o.f(file2), "preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                try {
                    return (List) ((kotlin.jvm.internal.o) this.f1090b).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return kotlin.collections.z.f38935a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0127t(Function0 function0) {
        super(0);
        this.f1089a = 19;
        this.f1090b = (kotlin.jvm.internal.o) function0;
    }
}
