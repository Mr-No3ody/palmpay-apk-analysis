package E0;

import C0.C0119k;
import C0.C0123o;
import C0.C0129v;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.work.impl.AbstractC1274g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.s;
import com.permissionx.guolindev.request.ChainTask;
import com.permissionx.guolindev.request.InvisibleFragment;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        super(0);
        this.f2160a = i7;
        this.f2161b = obj;
        this.f2162c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewModelProvider$Factory defaultViewModelProviderFactory;
        switch (this.f2160a) {
            case 0:
                C0123o c0123o = (C0123o) this.f2161b;
                for (C0119k c0119k : (Iterable) c0123o.f1071f.f39102a.getValue()) {
                    if (Z.L(2)) {
                        Objects.toString(c0119k);
                        Objects.toString((Fragment) this.f2162c);
                    }
                    c0123o.b(c0119k);
                }
                return Unit.f38893a;
            case 1:
                androidx.work.impl.constraints.trackers.e eVar = ((androidx.work.impl.constraints.controllers.c) this.f2161b).f18477a;
                androidx.work.impl.constraints.controllers.a listener = (androidx.work.impl.constraints.controllers.a) this.f2162c;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                synchronized (eVar.f18514c) {
                    if (eVar.f18515d.remove(listener) && eVar.f18515d.isEmpty()) {
                        eVar.d();
                    }
                    break;
                }
                return Unit.f38893a;
            case 2:
                s sVar = (s) this.f2161b;
                WorkDatabase workDatabase = sVar.f18677d;
                Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.runInTransaction(new androidx.camera.video.internal.encoder.o(19, sVar, (UUID) this.f2162c));
                AbstractC1274g.b(sVar.f18676c, sVar.f18677d, sVar.f18679f);
                return Unit.f38893a;
            case 3:
                return ((C0129v) this.f2161b).invoke((WorkDatabase) this.f2162c);
            case 4:
                SharedPreferences sharedPreferences = ((Context) this.f2161b).getSharedPreferences((String) this.f2162c, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 5:
                Context applicationContext = (Context) this.f2161b;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                String name = ((p178m0.a) this.f2162c).f39410a;
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                return G8.a.o(applicationContext, name + ".preferences_pb");
            case 6:
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f2162c.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider$Factory defaultViewModelProviderFactory2 = ((ScheduleTopUpAddTaskFragment) this.f2161b).getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            default:
                Map grantResults = (Map) this.f2162c;
                Intrinsics.checkNotNullExpressionValue(grantResults, "grantResults");
                InvisibleFragment invisibleFragment = (InvisibleFragment) this.f2161b;
                if (invisibleFragment.f()) {
                    p218o7.h hVar = invisibleFragment.f24646b;
                    if (hVar == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    hVar.f40081f.clear();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : grantResults.entrySet()) {
                        String str = (String) entry.getKey();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            p218o7.h hVar2 = invisibleFragment.f24646b;
                            if (hVar2 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar2.f40081f.add(str);
                            p218o7.h hVar3 = invisibleFragment.f24646b;
                            if (hVar3 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar3.f40082g.remove(str);
                            p218o7.h hVar4 = invisibleFragment.f24646b;
                            if (hVar4 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar4.f40083h.remove(str);
                        } else if (invisibleFragment.shouldShowRequestPermissionRationale(str)) {
                            arrayList.add(str);
                            p218o7.h hVar5 = invisibleFragment.f24646b;
                            if (hVar5 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar5.f40082g.add(str);
                        } else {
                            arrayList2.add(str);
                            p218o7.h hVar6 = invisibleFragment.f24646b;
                            if (hVar6 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar6.f40083h.add(str);
                            p218o7.h hVar7 = invisibleFragment.f24646b;
                            if (hVar7 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar7.f40082g.remove(str);
                        }
                    }
                    ArrayList<String> arrayList3 = new ArrayList();
                    p218o7.h hVar8 = invisibleFragment.f24646b;
                    if (hVar8 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    arrayList3.addAll(hVar8.f40082g);
                    p218o7.h hVar9 = invisibleFragment.f24646b;
                    if (hVar9 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    arrayList3.addAll(hVar9.f40083h);
                    for (String str2 : arrayList3) {
                        if (androidx.core.content.d.a(invisibleFragment.requireContext(), str2) == 0) {
                            p218o7.h hVar10 = invisibleFragment.f24646b;
                            if (hVar10 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar10.f40082g.remove(str2);
                            p218o7.h hVar11 = invisibleFragment.f24646b;
                            if (hVar11 == null) {
                                Intrinsics.n("pb");
                                throw null;
                            }
                            hVar11.f40081f.add(str2);
                        }
                    }
                    p218o7.h hVar12 = invisibleFragment.f24646b;
                    if (hVar12 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    int size = hVar12.f40081f.size();
                    p218o7.h hVar13 = invisibleFragment.f24646b;
                    if (hVar13 == null) {
                        Intrinsics.n("pb");
                        throw null;
                    }
                    if (size == hVar13.f40078c.size()) {
                        ChainTask chainTask = invisibleFragment.f24647c;
                        if (chainTask == null) {
                            Intrinsics.n("task");
                            throw null;
                        }
                        chainTask.finish();
                    } else {
                        if (invisibleFragment.f24646b == null) {
                            Intrinsics.n("pb");
                            throw null;
                        }
                        ChainTask chainTask2 = invisibleFragment.f24647c;
                        if (chainTask2 == null) {
                            Intrinsics.n("task");
                            throw null;
                        }
                        chainTask2.finish();
                        if (invisibleFragment.f24646b == null) {
                            Intrinsics.n("pb");
                            throw null;
                        }
                    }
                }
                return Unit.f38893a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C0119k c0119k, C0123o c0123o, Fragment fragment) {
        super(0);
        this.f2160a = 0;
        this.f2161b = c0123o;
        this.f2162c = fragment;
    }
}
