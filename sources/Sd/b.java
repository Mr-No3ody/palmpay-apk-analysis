package Sd;

import C0.G;
import Pa.C0525w;
import Pa.i0;
import Q3.k;
import U4.i;
import U9.d;
import W9.D;
import Wb.c;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.m1;
import androidx.camera.camera2.internal.C0944o;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.y0;
import androidx.camera.video.s;
import androidx.core.view.ActionProvider$VisibilityListener;
import androidx.room.C;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver$OnFoldingFeatureChangeListener;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.X;
import androidx.window.layout.FoldingFeature;
import com.abedelazizshe.lightcompressorlibrary.config.VideoResizer;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.resource.bitmap.C1331c;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.pool.FactoryPools$Factory;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankPaymentRewardsDialog$Callback;
import com.google.gson.Gson;
import com.growingio.android.debugger.e;
import com.growingio.android.sdk.track.async.Callback;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.scanplus.ScanPlusFullActivity;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1;
import com.transsnet.palmpay.credit.bean.rsp.AllBillDetail;
import com.transsnet.palmpay.credit.interfaces.FaceRecResultListener;
import com.transsnet.palmpay.credit.rnbridge.CreditFaceRecBridge;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackListActivity;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener;
import com.transsnet.palmpay.managemoney.ui.fragment.TargetSavingsTransactionHistoryFragment;
import com.transsnet.palmpay.teller.db.BillerSearchRecordDataBase;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;
import p135j0.C1768a0;
import p135j0.C1769b;
import p135j0.n0;
import p135j0.w0;
import p135j0.x0;
import p140j8.f;
import p198n5.h;
import p355xf.l;
import retrofit2.C1987e;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ResourceTranscoder, OnScanListener, FlexiBankPaymentRewardsDialog$Callback, Consumer, TimeRemindViewHandler$CallBack1, ActionProvider$VisibilityListener, FutureCallback, FoldingFeatureObserver$OnFoldingFeatureChangeListener, VideoResizer, FactoryPools$Factory, Callback, IBridgeCallback, CashBoxTransactionMonthViewHolder$OnMonthClickListener, Function, FaceRecResultListener, CallAdapter, OnRvItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f8869c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8871b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f8870a = i7;
        this.f8871b = obj;
    }

    public static b a() {
        if (f8869c == null) {
            synchronized (b.class) {
                f8869c = new b(BaseApplication.get());
            }
        }
        return f8869c;
    }

    public static b c(int i7, int i10, int i11, boolean z3) {
        return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i10, z3, i11), 20);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.f8870a) {
            case 7:
                List<PalmPayContact> list = (List) obj;
                IBaseView iBaseView = ((d) this.f8871b).f27351a;
                if (iBaseView != null) {
                    ((MobileContactListContract$IView) iBaseView).showLikeQueryPhoneContact(list);
                }
                break;
            default:
                D d2 = ((AllContactsSearchActivity) this.f8871b).f27159d;
                d2.f4985b = (List) obj;
                d2.notifyDataSetChanged();
                break;
        }
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        C1987e c1987e = new C1987e(call);
        call.enqueue(new C0525w(c1987e, 27));
        return c1987e;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return ((BiFunction) this.f8871b).apply(objArr[0], objArr[1]);
        }
        throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
    }

    public w0 b() {
        return (w0) ((g0) this.f8871b).getValue();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Factory
    public Object create() {
        m1 m1Var = (m1) this.f8871b;
        return new q((p359y1.b) m1Var.f12971a, (p359y1.b) m1Var.f12972b, (p359y1.b) m1Var.f12973c, (p359y1.b) m1Var.f12974d, (m) m1Var.f12975e, (m) m1Var.f12976f, (top.zibin.luban.io.a) m1Var.f12977g);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    public boolean d() {
        boolean z3;
        boolean z8 = false;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) this.f8871b;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (Build.VERSION.SDK_INT < 28) {
                torchFlashRequiredFor3aUpdateQuirk.getClass();
            } else {
                if (C0944o.d(torchFlashRequiredFor3aUpdateQuirk.f13473a, 5) == 5) {
                    z3 = true;
                }
                if (!z3) {
                    z8 = true;
                }
            }
            z3 = false;
            if (!z3) {
                z8 = true;
            }
        }
        f.G("UseFlashModeTorchFor3aUpdate");
        return z8;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public void e(w0 newState) {
        g0 g0Var;
        Object value;
        w0 w0Var;
        Intrinsics.checkNotNullParameter(newState, "newState");
        do {
            g0Var = (g0) this.f8871b;
            value = g0Var.getValue();
            w0Var = (w0) value;
            if (w0Var instanceof n0 ? true : Intrinsics.c(w0Var, x0.f38169b)) {
                w0Var = newState;
            } else if (w0Var instanceof C1769b) {
                if (newState.f38163a > w0Var.f38163a) {
                    w0Var = newState;
                }
            } else if (!(w0Var instanceof C1768a0)) {
                throw new l();
            }
        } while (!g0Var.compareAndSet(value, w0Var));
    }

    @Override // androidx.core.view.ActionProvider$VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z3) {
        androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) this.f8871b;
        mVar.f12455n.onItemVisibleChanged(mVar);
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankPaymentRewardsDialog$Callback
    public void onCancelClick() {
        FlexiBankPayVerificationActivity flexiBankPayVerificationActivity = (FlexiBankPayVerificationActivity) this.f8871b;
        k kVar = flexiBankPayVerificationActivity.f21978Q;
        if (kVar != null) {
            kVar.dismiss();
        }
        flexiBankPayVerificationActivity.f21977M = true;
        flexiBankPayVerificationActivity.finish();
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankPaymentRewardsDialog$Callback
    public void onConfirmClick() {
        k kVar = ((FlexiBankPayVerificationActivity) this.f8871b).f21978Q;
        if (kVar != null) {
            kVar.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.credit.interfaces.FaceRecResultListener
    public void onFaceRecFailed(String str, String str2) {
        F6.d.c(CreditFaceRecBridge.TAG, G.p(">>> onFaceRecFailed=", str, ", ", str2));
        ((CreditFaceRecBridge) this.f8871b).handleReject(str);
    }

    @Override // com.transsnet.palmpay.credit.interfaces.FaceRecResultListener
    public void onFaceRecSuccess(ALiFaceCheckResultData aLiFaceCheckResultData) {
        F6.d.h(CreditFaceRecBridge.TAG, 3, ">>> onFaceRecSuccess=" + aLiFaceCheckResultData + "}");
        BaseBridge.handleSuccess$default((CreditFaceRecBridge) this.f8871b, ((Gson) C0525w.f().f7166b).toJson(aLiFaceCheckResultData), null, 2, null);
    }

    @Override // com.growingio.android.sdk.track.async.Callback
    public void onFailed() {
        h.c("ScreenshotProvider", "Create circle screenshot failed", new Object[0]);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        s sVar = (s) this.f8871b;
        sVar.getClass();
        p118hf.a.k(false, "In-progress recording shouldn't be null");
        sVar.getClass();
        throw null;
    }

    @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver$OnFoldingFeatureChangeListener
    public void onFoldingFeatureChange(FoldingFeature foldingFeature) {
        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f8871b;
        slidingPaneLayout.f17836k0 = foldingFeature;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(300L);
        changeBounds.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f));
        X.a(slidingPaneLayout, changeBounds);
        slidingPaneLayout.requestLayout();
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void onInputChanged(boolean z3) {
        EditBeneficiaryActivity editBeneficiaryActivity = (EditBeneficiaryActivity) this.f8871b;
        editBeneficiaryActivity.f34211g = z3;
        editBeneficiaryActivity.x();
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        switch (this.f8870a) {
            case 26:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                ((c) ((ArrayList) this.f8871b).get(i7)).getClass();
                i0.b0("/cash-spree/#/activity/rules");
                return;
            case 27:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                OcAllBillActivity ocAllBillActivity = (OcAllBillActivity) this.f8871b;
                Object obj = ocAllBillActivity.f29229C.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OcAllBillActivity.m(ocAllBillActivity, (AllBillDetail) obj);
                return;
            default:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_feedback_detail_activity");
                C0525w c0525wF = C0525w.f();
                ArrayList arrayList = ((OcFeedbackListActivity) this.f8871b).f29456e;
                if (arrayList == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                postcardBuild.withString("oc_feedback_detail", ((Gson) c0525wF.f7166b).toJson(arrayList.get(i7))).navigation();
                return;
        }
    }

    @Override // com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener
    public void onMonthClick() {
        ((TargetSavingsTransactionHistoryFragment) this.f8871b).w();
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public void onPointClick(CodeBean codeBean) {
        Intrinsics.checkNotNullParameter(codeBean, "codeBean");
        Intent intent = new Intent();
        intent.putExtra("scan_code_key", codeBean);
        ScanPlusFullActivity scanPlusFullActivity = (ScanPlusFullActivity) this.f8871b;
        scanPlusFullActivity.setResult(-1, intent);
        scanPlusFullActivity.finish();
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public boolean onResult(List result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intent intent = new Intent();
        intent.putExtra("scan_code_key", (Parcelable) result.get(0));
        ScanPlusFullActivity scanPlusFullActivity = (ScanPlusFullActivity) this.f8871b;
        scanPlusFullActivity.setResult(-1, intent);
        scanPlusFullActivity.finish();
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        switch (this.f8870a) {
            case 12:
                f.G("Recorder");
                int i7 = ((s) this.f8871b).f14857v;
                throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
            default:
                e eVar = (e) obj;
                h.a("ScreenshotProvider", "Create circle screenshot successfully", new Object[0]);
                if (eVar != null) {
                    ((i) this.f8871b).l(eVar);
                    return;
                }
                return;
        }
    }

    @Override // com.abedelazizshe.lightcompressorlibrary.config.VideoResizer
    public Pair resize(double d2, double d10) {
        double dDoubleValue;
        Double d11 = (Double) this.f8871b;
        if (d11 != null) {
            dDoubleValue = d11.doubleValue();
        } else if (d2 >= 1920.0d || d10 >= 1920.0d) {
            dDoubleValue = 0.5d;
        } else if (d2 >= 1280.0d || d10 >= 1280.0d) {
            dDoubleValue = 0.75d;
        } else {
            dDoubleValue = (d2 >= 960.0d || d10 >= 960.0d) ? 0.95d : 0.9d;
        }
        return new Pair(Double.valueOf(d2 * dDoubleValue), Double.valueOf(d10 * dDoubleValue));
    }

    @Override // com.palmpay.lib.bridge.IBridgeCallback
    public void resolved(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ((AsyncBridge) this.f8871b).handleResult(result);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.f8871b;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource transcode(Resource resource, com.bumptech.glide.load.h hVar) {
        if (resource == null) {
            return null;
        }
        return new C1331c((Resources) this.f8871b, resource);
    }

    public b(int i7) {
        this.f8870a = i7;
        switch (i7) {
            case 21:
                this.f8871b = kotlinx.coroutines.flow.X.a(x0.f38169b);
                break;
        }
    }

    public b(Z4.a aVar) {
        this.f8870a = 2;
        this.f8871b = new Q2.a(2);
    }

    public b(BaseApplication baseApplication) {
        this.f8870a = 0;
        if (BillerSearchRecordDataBase.f34137a == null) {
            synchronized (BillerSearchRecordDataBase.class) {
                try {
                    if (BillerSearchRecordDataBase.f34137a == null) {
                        C cL = com.palmpay.lib.apm.launchcounter.util.d.l(baseApplication.getApplicationContext(), "biller_search_record.db", BillerSearchRecordDataBase.class);
                        cL.f17692j = true;
                        BillerSearchRecordDataBase.f34137a = (BillerSearchRecordDataBase) cL.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f8871b = BillerSearchRecordDataBase.f34137a.c();
    }

    public b(y0 y0Var) {
        this.f8870a = 11;
        this.f8871b = (TorchFlashRequiredFor3aUpdateQuirk) y0Var.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public b(boolean z3) {
        this.f8870a = 23;
        this.f8871b = new AtomicBoolean(z3);
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public void onCancel() {
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void isChecked(boolean z3) {
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void onSelectBillType(int i7) {
    }
}
