package U8;

import C0.AbstractC0130w;
import C0.G;
import C0.J;
import C0.U;
import E.C0205j;
import E.l0;
import E.m0;
import Ff.h;
import H.g;
import M7.s;
import Pa.F;
import Pa.n0;
import Ua.A0;
import Ua.u0;
import Uc.Y;
import V0.C0702v;
import V0.EnumC0698q;
import V0.RunnableC0701u;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.C0753a0;
import Wf.EnumC0778w;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.camera2.internal.C0940m;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest$TransformationInfoListener;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.i;
import androidx.camera.core.impl.utils.futures.j;
import androidx.camera.core.streamsharing.k;
import androidx.camera.video.C;
import androidx.camera.video.x;
import androidx.camera.view.C1023d;
import androidx.camera.view.D;
import androidx.camera.view.H;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.core.os.CancellationSignal$OnCancelListener;
import androidx.fragment.app.v0;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.transition.Transition;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.palmpay.lib.bridgewrapper.location.LocationBridge;
import com.permissionx.guolindev.callback.RequestCallback;
import com.transsnet.palmpay.account.bean.AccountHistoryListRsp;
import com.transsnet.palmpay.account.ui.fragment.history.VerifyAccountHistoryFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithSmsFragment;
import com.transsnet.palmpay.contacts.bean.resp.QueryPhonesData;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import com.transsnet.palmpay.core.viewmodel.OnClaimRewardListener;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import com.transsnet.palmpay.teller.ui.view.ModelBillerMoreService;
import com.transsnet.palmpay.util.ActivityUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import p042cg.e;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements OnItemClickListener, OnItemChildClickListener, GoogleMap.OnCameraMoveListener, CallbackToFutureAdapter$Resolver, ObservableOnSubscribe, Argument2Callback, P2PButton.OnP2PButtonClickListener, ImageReaderProxy.OnImageAvailableListener, SurfaceRequest$TransformationInfoListener, AsyncFunction, CancellationSignal$OnCancelListener, ResultCallback, PackagerStatusCallback, SwipeRefreshLayout.OnRefreshListener, SynchronizationGuard.CriticalSection, Continuation, RequestCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9283c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f9281a = i7;
        this.f9282b = obj;
        this.f9283c = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        k kVar = (k) this.f9282b;
        List list = (List) this.f9283c;
        Object objRetrieveOption = 100;
        try {
            objRetrieveOption = ((T) list.get(0)).f13967b.retrieveOption(T.f13964j);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objRetrieveOption;
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Object objRetrieveOption2 = 0;
        try {
            objRetrieveOption2 = ((T) list.get(0)).f13967b.retrieveOption(T.f13963i);
        } catch (IllegalArgumentException unused2) {
        }
        Integer num2 = (Integer) objRetrieveOption2;
        Objects.requireNonNull(num2);
        return kVar.f14507c.jpegSnapshot(iIntValue, num2.intValue());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k completer) {
        int i7 = 22;
        int i10 = 0;
        int i11 = 1;
        switch (this.f9281a) {
            case 4:
                Intrinsics.checkNotNullParameter(completer, "completer");
                C0753a0 c0753a0 = C0753a0.f10836a;
                CoroutineContext coroutineContext = (CoroutineContext) this.f9282b;
                completer.a(new s((Job) coroutineContext.get(c0753a0), i7), EnumC0698q.f9962a);
                return AbstractC0780y.m(AbstractC0777v.a(coroutineContext), null, EnumC0778w.f10900a, new C0702v((h) this.f9283c, completer, null), 1);
            case 5:
                Intrinsics.checkNotNullParameter(completer, "it");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                completer.a(new RunnableC0701u(atomicBoolean, 1), EnumC0698q.f9962a);
                ((Executor) this.f9282b).execute(new Da.h(atomicBoolean, completer, (o) this.f9283c));
                return Unit.f38893a;
            case 12:
                androidx.camera.lifecycle.h this$0 = (androidx.camera.lifecycle.h) this.f9282b;
                androidx.camera.core.c cameraX = (androidx.camera.core.c) this.f9283c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(cameraX, "$cameraX");
                Intrinsics.checkNotNullParameter(completer, "completer");
                synchronized (this$0.f14529a) {
                    androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(this$0.f14532d);
                    final J j6 = new J(cameraX, 4);
                    AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.lifecycle.c
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            J tmp0 = j6;
                            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                            return (ListenableFuture) tmp0.invoke(obj);
                        }
                    };
                    androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
                    bVarA.getClass();
                    androidx.camera.core.impl.utils.futures.a aVarI = j.i(bVarA, asyncFunction, aVarU);
                    Intrinsics.checkNotNullExpressionValue(aVarI, "cameraX = CameraX(contex…                        )");
                    aVarI.addListener(new i(i10, aVarI, new p279s5.d(i7, completer, cameraX)), org.chromium.support_lib_boundary.util.b.u());
                    Unit unit = Unit.f38893a;
                }
                return "ProcessCameraProvider-initializeCameraX";
            case 13:
                ((C) this.f9282b).getClass();
                Integer numValueOf = Integer.valueOf(completer.hashCode());
                C0 c0 = (C0) this.f9283c;
                c0.f13839b.f13961g.f13941a.put("androidx.camera.video.VideoCapture.streamUpdate", numValueOf);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                x xVar = new x(atomicBoolean2, completer, c0);
                completer.a(new Da.h(atomicBoolean2, 25, c0, xVar), org.chromium.support_lib_boundary.util.b.u());
                c0.f13839b.b(xVar);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
            case 14:
                C1023d c1023d = (C1023d) this.f9282b;
                p058e0.a aVar = (p058e0.a) c1023d.f14920a;
                if (aVar != null) {
                    androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) aVar.f35983a;
                    Objects.requireNonNull(kVar);
                    kVar.c();
                }
                Object obj = this.f9283c;
                c1023d.f14920a = new p058e0.a(completer, obj);
                return "PendingValue " + obj;
            case 15:
                CameraInfo cameraInfo = (CameraInfo) this.f9282b;
                C0940m c0940m = new C0940m(completer, cameraInfo);
                ((ArrayList) this.f9283c).add(c0940m);
                ((CameraInfoInternal) cameraInfo).addSessionCaptureCallback(org.chromium.support_lib_boundary.util.b.u(), c0940m);
                return "waitForCaptureResult";
            default:
                H h7 = (H) this.f9282b;
                h7.getClass();
                f.G("TextureViewImpl");
                m0 m0Var = h7.f14893h;
                androidx.camera.core.impl.utils.executor.a aVarU2 = org.chromium.support_lib_boundary.util.b.u();
                Objects.requireNonNull(completer);
                D d2 = new D(completer, i11);
                Surface surface = (Surface) this.f9283c;
                m0Var.b(surface, aVarU2, d2);
                return "provideSurface[request=" + h7.f14893h + " surface=" + surface + "]";
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f9281a) {
            case 24:
                return ((Uploader) this.f9282b).lambda$logAndUpdateState$5((Iterable) this.f9283c);
            default:
                return ((Uploader) this.f9282b).lambda$logAndUpdateState$7((HashMap) this.f9283c);
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i7 = LogInWithSmsFragment.f26222C;
        boolean zIsEmpty = TextUtils.isEmpty((String) obj);
        LogInWithSmsFragment logInWithSmsFragment = (LogInWithSmsFragment) this.f9282b;
        if (!zIsEmpty || (zBooleanValue && !logInWithSmsFragment.f26226o)) {
            logInWithSmsFragment.x((U) this.f9283c);
            return;
        }
        AbstractC0130w abstractC0130w = logInWithSmsFragment.t;
        if (abstractC0130w != null) {
            abstractC0130w.k(F8.d.fragment_login_input_mobile, false);
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        int i7 = MapPage.f32859u0;
        LatLng target = ((GoogleMap) this.f9282b).getCameraPosition().target;
        Intrinsics.checkNotNullExpressionValue(target, "target");
        F6.d.h("position:" + target.latitude + "," + target.longitude, 4, new Object[0]);
        MapPage mapPage = (MapPage) this.f9283c;
        Y yS = mapPage.s();
        yS.f9606b = yS.f9606b + 1;
        mapPage.getWindow().getDecorView().postDelayed(new H0.a(mapPage.s().f9606b, mapPage, target, 2), 300L);
    }

    @Override // androidx.core.os.CancellationSignal$OnCancelListener
    public void onCancel() {
        ((Transition) this.f9282b).cancel();
        ((v0) this.f9283c).run();
    }

    @Override // com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton.OnP2PButtonClickListener
    public void onClick() {
        ((PayByNoticeDialog) this.f9282b).lambda$setPay$1((PayByNoticeDialog.Listener) this.f9283c);
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        String couponCode;
        String couponCode2;
        Object obj2 = this.f9283c;
        String str = "";
        Object obj3 = this.f9282b;
        List list = (List) obj;
        switch (this.f9281a) {
            case 19:
                BillerCouponItemBean billerCouponItemBean = (BillerCouponItemBean) list.get(0);
                ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = (ModelActivityBannerWithCoupon) obj3;
                BillerCouponClickListener mListener = modelActivityBannerWithCoupon.getMListener();
                if (mListener != null) {
                    List<String> institutionIdList = billerCouponItemBean.getInstitutionIdList();
                    Long limitAmt = billerCouponItemBean.getLimitAmt();
                    mListener.onCouponUseClick(institutionIdList, limitAmt != null ? limitAmt.longValue() : 0L);
                }
                n0 n0VarG = n0.g();
                ClickEvent clickEventAdd = new ClickEvent("Dialog_ModelActivityBannerWithCouponUse").add("transType", modelActivityBannerWithCoupon.f34327g).add("element_details", "Use");
                if (billerCouponItemBean != null && (couponCode = billerCouponItemBean.getCouponCode()) != null) {
                    str = couponCode;
                }
                n0VarG.k(clickEventAdd.add("couponCode", str));
                ((CouponClaimResultDialog) obj2).dismiss();
                break;
            default:
                int i7 = ModelAvailableCouponAndPointItem.f34329i;
                BillerCouponItemBean billerCouponItemBean2 = list != null ? (BillerCouponItemBean) list.get(0) : null;
                ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem = (ModelAvailableCouponAndPointItem) obj3;
                modelAvailableCouponAndPointItem.getClass();
                n0 n0VarG2 = n0.g();
                ClickEvent clickEventAdd2 = new ClickEvent("Dialog_ModelActivityBannerWithCouponUse").add("transType", modelAvailableCouponAndPointItem.f34332e).add("element_details", "Use");
                if (billerCouponItemBean2 != null && (couponCode2 = billerCouponItemBean2.getCouponCode()) != null) {
                    str = couponCode2;
                }
                n0VarG2.k(clickEventAdd2.add("couponCode", str));
                ((CouponClaimResultDialog) obj2).dismiss();
                BillerCouponListDialog billerCouponListDialog = modelAvailableCouponAndPointItem.f34331d;
                if (billerCouponListDialog != null) {
                    billerCouponListDialog.dismiss();
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        androidx.camera.core.imagecapture.o oVar = (androidx.camera.core.imagecapture.o) this.f9282b;
        oVar.getClass();
        ((ImageReaderProxy.OnImageAvailableListener) this.f9283c).onImageAvailable(oVar);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Integer num;
        int i10 = OrderResultRewardModel.t;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        A0 a3 = (A0) this.f9282b;
        OrderResultRewardItemBean orderResultRewardItemBean = (OrderResultRewardItemBean) a3.getItem(i7);
        n0 n0VarG = n0.g();
        Pair pair = new Pair("rewardType", orderResultRewardItemBean.rewardType);
        Pair pair2 = new Pair("activityNodeNo", orderResultRewardItemBean.activityNodeNo);
        Pair pair3 = new Pair("rewardid", orderResultRewardItemBean.recordNo);
        Pair pair4 = new Pair("transtype", orderResultRewardItemBean.transType);
        Pair pair5 = new Pair("memberid", G.k());
        OrderResultRewardModel orderResultRewardModel = (OrderResultRewardModel) this.f9283c;
        n0VarG.n("ResultPage_Reward_Click", kotlin.collections.G.g(pair, pair2, pair3, pair4, pair5, new Pair("orderid", orderResultRewardModel.f28524j)));
        Integer num2 = orderResultRewardItemBean.rewardType;
        if ((num2 == null || num2.intValue() != 1) && ((num = orderResultRewardItemBean.rewardType) == null || num.intValue() != 3)) {
            ActivityUtils.startActivity(F.a(orderResultRewardModel.getContext(), orderResultRewardItemBean.jumpPath));
            return;
        }
        Integer num3 = orderResultRewardItemBean.rewardStatus;
        if (num3 != null && num3.intValue() == 1) {
            ActivityUtils.startActivity(F.a(orderResultRewardModel.getContext(), orderResultRewardItemBean.jumpPath));
            return;
        }
        if (TextUtils.isEmpty(orderResultRewardItemBean.recordNo)) {
            return;
        }
        OnClaimRewardListener onClaimRewardListener = orderResultRewardModel.f28526p;
        if (onClaimRewardListener != null) {
            onClaimRewardListener.onShowLoading(true);
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(orderResultRewardModel);
        p042cg.f fVar = I.f10809a;
        orderResultRewardModel.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new u0(null, orderResultRewardItemBean, orderResultRewardModel, a3, orderResultRewardItemBean), 2));
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        List<Object> data;
        List<Object> data2;
        AccountHistoryListRsp.ItemListBean itemListBean;
        List<Object> data3;
        AccountHistoryListRsp.ItemListBean itemListBean2;
        Object obj = this.f9283c;
        Object obj2 = this.f9282b;
        switch (this.f9281a) {
            case 0:
                VerifyAccountHistoryFragment.a aVar = VerifyAccountHistoryFragment.f26150v;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                VerifyAccountHistoryFragment verifyAccountHistoryFragment = (VerifyAccountHistoryFragment) obj;
                boolean z3 = false;
                if (((AccountHistoryListRsp) obj2).multiSelect) {
                    verifyAccountHistoryFragment.getClass();
                    try {
                        c cVar = verifyAccountHistoryFragment.f26151j;
                        if (cVar != null && (data3 = cVar.getData()) != null && (itemListBean2 = (AccountHistoryListRsp.ItemListBean) data3.get(i7)) != null) {
                            z3 = itemListBean2.check;
                        }
                        c cVar2 = verifyAccountHistoryFragment.f26151j;
                        if (cVar2 != null && (data2 = cVar2.getData()) != null && (itemListBean = (AccountHistoryListRsp.ItemListBean) data2.get(i7)) != null) {
                            itemListBean.check = !z3;
                        }
                        break;
                    } catch (Exception unused) {
                    }
                } else {
                    c cVar3 = verifyAccountHistoryFragment.f26151j;
                    if (cVar3 != null && (data = cVar3.getData()) != null) {
                        Iterator<T> it = data.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            ((AccountHistoryListRsp.ItemListBean) it.next()).check = i10 == i7;
                            i10++;
                        }
                    }
                }
                c cVar4 = verifyAccountHistoryFragment.f26151j;
                if (cVar4 != null) {
                    cVar4.notifyDataSetChanged();
                }
                verifyAccountHistoryFragment.u();
                break;
            case 1:
                ModelBillQuickAccessItem.a((ModelBillQuickAccessItem) obj2, (Context) obj, jVar, view, i7);
                break;
            case 18:
                ModelActivityBannerWithCoupon.c((ModelActivityBannerWithCoupon) obj2, (Context) obj, jVar, view, i7);
                break;
            default:
                ModelBillerMoreService.a((ModelBillerMoreService) obj2, (Context) obj, jVar, view, i7);
                break;
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
    public void onPackagerStatusFetched(boolean z3) {
        ReactHostImpl._get_isMetroRunning_$lambda$43((ReactHostImpl) this.f9282b, "isMetroRunning()", (TaskCompletionSource) this.f9283c, z3);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        SwipeRefreshLayoutManager.addEventEmitters$lambda$0((ThemedReactContext) this.f9282b, (ReactSwipeRefreshLayout) this.f9283c);
    }

    @Override // com.permissionx.guolindev.callback.RequestCallback
    public void onResult(boolean z3, List list, List list2) {
        LocationBridge.m108getCurrentLocation$lambda3$lambda2((LocationBridge) this.f9282b, (AbstractActivityC0837o) this.f9283c, z3, list, list2);
    }

    @Override // androidx.camera.core.SurfaceRequest$TransformationInfoListener
    public void onTransformationInfoUpdate(l0 l0Var) {
        androidx.camera.core.processing.f fVar = (androidx.camera.core.processing.f) this.f9282b;
        fVar.getClass();
        g gVar = g.f3514b;
        if (((m0) this.f9283c).f2057c.a() && ((C0205j) l0Var).f2046d) {
            gVar = g.f3515c;
        }
        androidx.camera.core.processing.h hVar = fVar.f14388a;
        H.j.d(hVar.f14400a, true);
        H.j.c(hVar.f14402c);
        if (hVar.f14411l != gVar) {
            hVar.f14411l = gVar;
            hVar.k(hVar.f14412m);
        }
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter emitter) {
        String strL;
        String strL2;
        int i7 = FindInviteFriendsActivity.f27212i;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((FindInviteFriendsActivity) this.f9282b).f27215e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            QueryPhonesData queryPhonesData = (QueryPhonesData) next;
            String phone = queryPhonesData.getPhone();
            String str = "";
            if (phone == null || (strL = com.airbnb.lottie.model.layer.d.l("getDefault(...)", phone, "toUpperCase(...)")) == null) {
                strL = "";
            }
            boolean zIsEmpty = TextUtils.isEmpty(queryPhonesData.getPhone());
            String str2 = (String) this.f9283c;
            if (!zIsEmpty) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String upperCase = str2.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (StringsKt.A(strL, upperCase, false)) {
                    arrayList.add(queryPhonesData);
                }
            }
            String fullName = queryPhonesData.getFullName();
            if (fullName != null && (strL2 = com.airbnb.lottie.model.layer.d.l("getDefault(...)", fullName, "toUpperCase(...)")) != null) {
                str = strL2;
            }
            if (!TextUtils.isEmpty(queryPhonesData.getFullName())) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String upperCase2 = str2.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (StringsKt.A(str, upperCase2, false)) {
                    arrayList.add(queryPhonesData);
                }
            }
        }
        emitter.onNext(arrayList);
        emitter.onComplete();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f9281a) {
            case 26:
                return ((ConfigFetchHandler) this.f9282b).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) this.f9283c, task);
            case 27:
                return ((ConfigFetchHandler) this.f9282b).lambda$fetchNowWithTypeAndAttemptNumber$1((HashMap) this.f9283c, task);
            default:
                return ((ConfigRealtimeHttpClient) this.f9282b).lambda$beginRealtimeHttpStream$1((Task) this.f9283c, task);
        }
    }

    public /* synthetic */ a(CameraInfo cameraInfo, androidx.camera.view.i iVar, ArrayList arrayList) {
        this.f9281a = 15;
        this.f9282b = cameraInfo;
        this.f9283c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Executor executor, Function0 function0) {
        this.f9281a = 5;
        this.f9282b = executor;
        this.f9283c = (o) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(CoroutineContext coroutineContext, Function2 function2) {
        this.f9281a = 4;
        EnumC0778w enumC0778w = EnumC0778w.f10900a;
        this.f9282b = coroutineContext;
        this.f9283c = (h) function2;
    }
}
