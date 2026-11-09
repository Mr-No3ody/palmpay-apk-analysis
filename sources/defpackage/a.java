package defpackage;

import Da.g;
import Da.h;
import E.C0216v;
import E.m0;
import G.f;
import Ge.e;
import He.x;
import M7.s;
import N8.q0;
import Pa.T;
import Qc.K;
import V0.EnumC0698q;
import V0.RunnableC0701u;
import W8.o;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.biometric.RunnableC0903g;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.RunnableC0930h;
import androidx.camera.core.impl.utils.executor.i;
import androidx.camera.video.E;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.u;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.modal.ReactModalHostView;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.permissionx.guolindev.callback.RequestCallback;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.ui.dialog.SelectPayoutOptionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.SPUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p052da.c0;
import p183m6.j;
import p232p6.p;
import p320v6.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Argument2Callback, CallbackToFutureAdapter$Resolver, OnItemClickListener, SynchronizationGuard.CriticalSection, com.transsnet.palmpay.custom_view.interfac.OnItemClickListener, Encoder.SurfaceInput.OnSurfaceUpdateListener, ReactModalHostView.OnRequestCloseListener, Continuation, OnSuccessListener, RequestCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11811d;

    public /* synthetic */ a(f fVar, C0216v c0216v) {
        this.f11808a = 1;
        Map map = Collections.EMPTY_MAP;
        this.f11809b = fVar;
        this.f11810c = c0216v;
        this.f11811d = map;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(k completer) {
        switch (this.f11808a) {
            case 1:
                f fVar = (f) this.f11809b;
                fVar.getClass();
                Map map = Collections.EMPTY_MAP;
                fVar.b(new g(fVar, (C0216v) this.f11810c, completer), new RunnableC0930h(0));
                return "Init GlRenderer";
            case 6:
                Intrinsics.checkNotNullParameter(completer, "completer");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                completer.a(new RunnableC0701u(atomicBoolean, 0), EnumC0698q.f9962a);
                ((SerialExecutor) this.f11809b).execute(new h(atomicBoolean, 12, completer, (Function0) this.f11811d));
                return (String) this.f11810c;
            case 7:
                m mVar = (m) this.f11809b;
                o oVar = new o(mVar, 15);
                i iVar = (i) this.f11810c;
                completer.a(oVar, iVar);
                mVar.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVar, new j(completer, 11)), iVar);
                return q0.o(new StringBuilder("surfaceList["), (List) this.f11811d, "]");
            default:
                androidx.camera.core.processing.f fVar2 = (androidx.camera.core.processing.f) this.f11809b;
                fVar2.getClass();
                Map map2 = Collections.EMPTY_MAP;
                fVar2.b(new g(fVar2, (C0216v) this.f11810c, completer), new RunnableC0930h(0));
                return "Init GlRenderer";
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((DefaultScheduler) this.f11809b).lambda$schedule$0((TransportContext) this.f11810c, (EventInternal) this.f11811d);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) throws Throwable {
        int i7 = this.f11808a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i7) {
            case 0:
                CommonFileUploadBridge.onHandle$lambda$3$lambda$2((CommonFileUploadBridge) this.f11809b, (Activity) this.f11810c, (CommonFileUploadBridge.FileUploadParam) this.f11811d, iIntValue, (Intent) obj2);
                break;
            default:
                Intent intent = (Intent) obj2;
                WeakReference weakReference = (WeakReference) this.f11810c;
                if (iIntValue != -1) {
                    Function1 function1 = (Function1) weakReference.get();
                    if (function1 != null) {
                        function1.invoke(null);
                    }
                } else {
                    BaseActivity baseActivity = (BaseActivity) ((WeakReference) this.f11809b).get();
                    if (baseActivity != null) {
                        T.b(-4).execute(new g((File) this.f11811d, baseActivity, intent, weakReference, 4));
                    }
                }
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        c0 c0Var = (c0) this.f11809b;
        int size = c0Var.getData().size();
        int i10 = 0;
        while (i10 < size) {
            ((TransactionFilterResp.FilterBean) c0Var.getData().get(i10)).setSelected(i10 == i7);
            i10++;
        }
        c0Var.notifyDataSetChanged();
        e eVar = (e) this.f11810c;
        x xVar = eVar.f3393a;
        if (xVar != null) {
            xVar.onItemSelect((TransactionFilterResp.FilterBean) eVar.f3394b.get(i7));
        }
        ((Ge.f) this.f11811d).dismiss();
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView.OnRequestCloseListener
    public void onRequestClose(DialogInterface dialogInterface) {
        ReactModalHostManager.addEventEmitters$lambda$0((EventDispatcher) this.f11809b, (ThemedReactContext) this.f11810c, (ReactModalHostView) this.f11811d, dialogInterface);
    }

    @Override // com.permissionx.guolindev.callback.RequestCallback
    public void onResult(boolean z3, List list, List list2) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        Object obj = this.f11810c;
        Object obj2 = this.f11811d;
        Object obj3 = this.f11809b;
        switch (this.f11808a) {
            case 15:
                PhotoUploadBridge.m115openCamera$lambda4$lambda3((PhotoUploadBridge) obj3, (AbstractActivityC0837o) obj, (PhotoUploadBridge.PhotoUploadParam) obj2, z3, list, list2);
                break;
            default:
                Intrinsics.checkNotNullParameter(list, "<unused var>");
                Intrinsics.checkNotNullParameter(list2, "<unused var>");
                AuthenticationRequest authenticationRequest = (AuthenticationRequest) obj3;
                LiveID$ILiveIDListener liveID$ILiveIDListener = (LiveID$ILiveIDListener) obj2;
                if (!z3) {
                    D6.f fVar = D6.f.f1626f;
                    String str = fVar.f1633a;
                    String str2 = fVar.f1634b;
                    liveID$ILiveIDListener.onInterrupted(str, str2, null);
                    r6.a aVar = p.f41237d;
                    if (aVar != null && (liveID$ILiveIDMonitor = aVar.f41573e) != null) {
                        d dVar = p320v6.e.f43079g;
                        String str3 = dVar.f43071a;
                        Pair pair = new Pair("event_desc", dVar.f43072b);
                        Integer scene = authenticationRequest.getScene();
                        liveID$ILiveIDMonitor.report(str3, G.h(pair, new Pair("scene", Integer.valueOf(scene != null ? scene.intValue() : -1)), new Pair("code", fVar.f1633a), new Pair("msg", str2)));
                        break;
                    }
                } else {
                    p pVar = p.f41234a;
                    p.b((Activity) obj, authenticationRequest, liveID$ILiveIDListener);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((RolloutsStateSubscriptionsHandler) this.f11809b).lambda$registerRolloutsStateSubscriber$1((Task) this.f11810c, (RolloutsStateSubscriber) this.f11811d, (ConfigContainer) obj);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
    public void onSurfaceUpdate(Surface surface) {
        i iVar;
        E e10 = (E) this.f11809b;
        int i7 = F.i(e10.f14565i);
        k kVar = (k) this.f11810c;
        if (i7 != 0) {
            if (i7 == 1) {
                m0 m0Var = (m0) this.f11811d;
                if (m0Var.a()) {
                    Objects.toString(m0Var, "EMPTY");
                    p140j8.f.G("VideoEncoderSession");
                    kVar.b(null);
                    e10.a();
                    return;
                }
                e10.f14561e = surface;
                Objects.toString(surface);
                p140j8.f.G("VideoEncoderSession");
                m0Var.b(surface, e10.f14558b, new androidx.camera.core.processing.o(e10, 1));
                e10.f14565i = 4;
                kVar.b(e10.f14560d);
                return;
            }
            if (i7 != 2) {
                if (i7 == 3) {
                    if (e10.f14564h != null && (iVar = e10.f14563g) != null) {
                        iVar.execute(new RunnableC0903g(26, e10, surface));
                    }
                    Objects.toString(surface);
                    p140j8.f.G("VideoEncoderSession");
                    return;
                }
                if (i7 != 4) {
                    throw new IllegalStateException("State " + u.z(e10.f14565i) + " is not handled");
                }
            }
        }
        p140j8.f.G("VideoEncoderSession");
        kVar.b(null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f11808a) {
            case 11:
                return CrashlyticsTasks.lambda$race$0((TaskCompletionSource) this.f11809b, (AtomicBoolean) this.f11810c, (CancellationTokenSource) this.f11811d, task);
            case 12:
                return ((FirebaseRemoteConfig) this.f11809b).lambda$activate$2((Task) this.f11810c, (Task) this.f11811d, task);
            default:
                return ((ConfigRealtimeHttpClient) this.f11809b).lambda$createRealtimeConnection$0((Task) this.f11810c, (Task) this.f11811d, task);
        }
    }

    public /* synthetic */ a(Activity activity, AuthenticationRequest authenticationRequest, LiveID$ILiveIDListener liveID$ILiveIDListener) {
        this.f11808a = 16;
        this.f11810c = activity;
        this.f11809b = authenticationRequest;
        this.f11811d = liveID$ILiveIDListener;
    }

    public /* synthetic */ a(androidx.camera.core.processing.f fVar, C0216v c0216v) {
        this.f11808a = 8;
        Map map = Collections.EMPTY_MAP;
        this.f11809b = fVar;
        this.f11810c = c0216v;
        this.f11811d = map;
    }

    public /* synthetic */ a(m mVar, i iVar, List list) {
        this.f11808a = 7;
        this.f11809b = mVar;
        this.f11810c = iVar;
        this.f11811d = list;
    }

    public /* synthetic */ a(Object obj, int i7, Object obj2, Object obj3) {
        this.f11808a = i7;
        this.f11809b = obj;
        this.f11810c = obj2;
        this.f11811d = obj3;
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnItemClickListener
    public void onItemClick(Object obj) {
        PayoutOption payoutOption = (PayoutOption) obj;
        SelectPayoutOptionsDialogFragment selectPayoutOptionsDialogFragment = (SelectPayoutOptionsDialogFragment) this.f11809b;
        selectPayoutOptionsDialogFragment.f32322Q = payoutOption;
        Intrinsics.checkNotNullParameter("KEY_IS_SHOW_CASHBOX_NEWER_AGREE", "key");
        boolean z3 = SPUtils.getInstance(p059e1.a.G("KEY_IS_SHOW_CASHBOX_NEWER_AGREE")).getBoolean(p367ya.a.d().e("KEY_IS_SHOW_CASHBOX_NEWER_AGREE"));
        if (payoutOption.getType() == 2 && Intrinsics.c(selectPayoutOptionsDialogFragment.f32320L, Boolean.TRUE) && !z3) {
            ((RecyclerView) this.f11810c).postDelayed(new s(selectPayoutOptionsDialogFragment, 7), 250L);
        } else if (selectPayoutOptionsDialogFragment.getActivity() instanceof BaseActivity) {
            androidx.fragment.app.E activity = selectPayoutOptionsDialogFragment.getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
            ((BaseActivity) activity).showLoadingDialog(true);
            ((ConstraintLayout) this.f11811d).setVisibility(4);
            CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) selectPayoutOptionsDialogFragment.j();
            int type = payoutOption.getType();
            cashBoxViewModel.getClass();
            p140j8.f.s(cashBoxViewModel, new K(type, null), cashBoxViewModel.f32751p0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
