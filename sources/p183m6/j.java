package p183m6;

import C0.G;
import F6.d;
import Jb.C0345d;
import Pa.Y;
import Pa.r0;
import Wf.C0765i;
import Ya.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.v;
import androidx.fragment.app.E;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat$WebMessageListener;
import androidx.webkit.internal.o;
import com.bumptech.glide.util.GlideSuppliers$GlideSupplier;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCacheTracker;
import com.google.gson.Gson;
import com.luck.picture.lib.config.PictureMimeType;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.p;
import com.palmpay.lib.ui.picker.wheel.adapter.WheelAdapter;
import com.reactnativecommunity.webview.RNCWebView;
import com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView;
import com.transsnet.palmpay.contacts.ui.activity.EditCloseContactsActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcUploadALiFaceResultReq;
import com.transsnet.palmpay.credit.bean.req.SendMTNOTPReq;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuData;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcALiFaceFailedDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.util.ImageUtils;
import com.transsnet.palmpay.util.TimeUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import p025ba.k;
import p071ef.b;
import p200n7.a;
import p218o7.h;
import p221ob.c;
import p284sb.A;
import p294tb.W;
import p298tf.f;
import p310ub.C2079h0;
import p355xf.q;
import retrofit2.C1993k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.K;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements OnRvItemClickListener, ObservableOnSubscribe, Consumer, TimeRemindViewHandler$CallBack1, WheelAdapter, FutureCallback, ProfileStore, GlideSuppliers$GlideSupplier, ObjectConstructor, MemoryCacheTracker, WebViewCompat$WebMessageListener, Callback, ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile j f39517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f39518d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39520b;

    public /* synthetic */ j(int i7) {
        this.f39519a = i7;
    }

    public static void a(j jVar, String str) {
        OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) jVar.f39520b;
        ocMTNLoginActivity.showLoadingDialog(true);
        ((OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b).f29573y0 = false;
        SendMTNOTPReq sendMTNOTPReq = new SendMTNOTPReq();
        sendMTNOTPReq.applyId = str;
        c.f40268a.getInstance().getClass();
        c.a().sendMTNOTP(sendMTNOTPReq).k(f.f42629b).i(b.a()).subscribe(new C2079h0(jVar));
    }

    public static j c() {
        if (f39517c == null) {
            synchronized (j.class) {
                try {
                    if (f39517c == null) {
                        j jVar = new j(0);
                        jVar.f39520b = new Gson();
                        f39517c = jVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39517c;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.f39519a) {
            case 5:
                BaseFragment baseFragment = (BaseFragment) ((Y) this.f39520b).f7061b.get();
                if (baseFragment != null) {
                    baseFragment.showLoadingDialog(true);
                }
                break;
            case 6:
                BaseActivity baseActivity = (BaseActivity) ((Y) this.f39520b).f7061b.get();
                if (baseActivity != null) {
                    baseActivity.showLoadingDialog(true);
                }
                break;
            default:
                String str = (String) obj;
                IBaseView iBaseView = ((U9.f) this.f39520b).f27351a;
                if (iBaseView != null) {
                    ((PersonalQRCodeContract$IView) iBaseView).showSavePath(str);
                }
                break;
        }
    }

    public Object b(String str, Class cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ((Gson) this.f39520b).fromJson(str, cls);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        throw new p((String) this.f39520b, 10, false);
    }

    public h d(List permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        LinkedHashSet normalPermissions = new LinkedHashSet();
        LinkedHashSet specialPermissions = new LinkedHashSet();
        int i7 = Build.VERSION.SDK_INT;
        E e10 = (E) this.f39520b;
        if (e10 == null) {
            Intrinsics.e(null);
            throw null;
        }
        int i10 = e10.getApplicationInfo().targetSdkVersion;
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (a.f39853a.contains(str)) {
                specialPermissions.add(str);
            } else {
                normalPermissions.add(str);
            }
        }
        if (specialPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i7 == 29 || (i7 == 30 && i10 < 30))) {
            specialPermissions.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            normalPermissions.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (specialPermissions.contains("android.permission.POST_NOTIFICATIONS") && i7 >= 33 && i10 >= 33) {
            specialPermissions.remove("android.permission.POST_NOTIFICATIONS");
            normalPermissions.add("android.permission.POST_NOTIFICATIONS");
        }
        Intrinsics.checkNotNullParameter(normalPermissions, "normalPermissions");
        Intrinsics.checkNotNullParameter(specialPermissions, "specialPermissions");
        h hVar = new h();
        hVar.f40077b = -1;
        hVar.f40080e = new LinkedHashSet();
        hVar.f40081f = new LinkedHashSet();
        hVar.f40082g = new LinkedHashSet();
        hVar.f40083h = new LinkedHashSet();
        new LinkedHashSet();
        hVar.f40084i = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(e10, "<set-?>");
        hVar.f40076a = e10;
        hVar.f40078c = normalPermissions;
        hVar.f40079d = specialPermissions;
        return hVar;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (o.f18314g.b()) {
            return ((ProfileStoreBoundaryInterface) this.f39520b).deleteProfile(str);
        }
        throw o.a();
    }

    public h e(String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return d(C1850q.h(Arrays.copyOf(permissions, permissions.length)));
    }

    @Override // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public Object get() {
        return (ConnectivityManager) ((Context) this.f39520b).getSystemService("connectivity");
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (o.f18314g.b()) {
            return ((ProfileStoreBoundaryInterface) this.f39520b).getAllProfileNames();
        }
        throw o.a();
    }

    @Override // com.palmpay.lib.ui.picker.wheel.adapter.WheelAdapter
    public Object getItem(int i7) {
        List list = (List) this.f39520b;
        return i7 >= list.size() ? CollectionsKt.K(list) : list.get(i7);
    }

    @Override // com.palmpay.lib.ui.picker.wheel.adapter.WheelAdapter
    public int getItemsCount() {
        return ((List) this.f39520b).size();
    }

    @Override // androidx.webkit.ProfileStore
    public Profile getOrCreateProfile(String str) {
        if (o.f18314g.b()) {
            return new androidx.webkit.internal.h((ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(ProfileBoundaryInterface.class, ((ProfileStoreBoundaryInterface) this.f39520b).getOrCreateProfile(str)));
        }
        throw o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public Profile getProfile(String str) {
        if (!o.f18314g.b()) {
            throw o.a();
        }
        InvocationHandler profile = ((ProfileStoreBoundaryInterface) this.f39520b).getProfile(str);
        if (profile != null) {
            return new androidx.webkit.internal.h((ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }

    @Override // com.palmpay.lib.ui.picker.wheel.adapter.WheelAdapter
    public int indexOf(Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        return ((List) this.f39520b).indexOf(o10);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
    public void onCacheHit(Object obj) {
        ((ImageCacheStatsTracker) this.f39520b).onBitmapCacheHit((CacheKey) obj);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
    public void onCacheMiss(Object obj) {
        ((ImageCacheStatsTracker) this.f39520b).onBitmapCacheMiss((CacheKey) obj);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
    public void onCachePut(Object obj) {
        ((ImageCacheStatsTracker) this.f39520b).onBitmapCachePut((CacheKey) obj);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onFailed(String str, String str2, String str3) {
        final OcApplyBaseActivity ocApplyBaseActivity = (OcApplyBaseActivity) this.f39520b;
        final int i7 = 0;
        ocApplyBaseActivity.showLoadingDialog(false);
        int i10 = OcApplyBaseActivity.f29246X;
        d.h(ocApplyBaseActivity.TAG, 3, G.p("checkAliFaceResultFailed >>> errorCode=", str, ", errorMsg=", str2));
        if (Intrinsics.c(str, "VL000073")) {
            OcALiFaceFailedDialog ocALiFaceFailedDialog = new OcALiFaceFailedDialog(ocApplyBaseActivity, null, ocApplyBaseActivity.getString(k.core_sign_out), ocApplyBaseActivity.getString(g.cs_oc_face_recognition_failed), ocApplyBaseActivity.getString(g.cs_oc_ali_face_max_time));
            ocALiFaceFailedDialog.setRightListener(new View.OnClickListener() { // from class: ub.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OcApplyBaseActivity ocApplyBaseActivity2 = ocApplyBaseActivity;
                    switch (i7) {
                        case 0:
                            int i11 = OcApplyBaseActivity.f29246X;
                            ocApplyBaseActivity2.getClass();
                            OcApplyBaseActivity.n();
                            break;
                        default:
                            int i12 = OcApplyBaseActivity.f29246X;
                            ocApplyBaseActivity2.getClass();
                            OcApplyBaseActivity.n();
                            break;
                    }
                }
            });
            ocALiFaceFailedDialog.show();
        } else if (!Intrinsics.c(str, "VL000075")) {
            OcALiFaceFailedDialog ocALiFaceFailedDialog2 = new OcALiFaceFailedDialog(ocApplyBaseActivity, null, ocApplyBaseActivity.getString(k.core_got_it), ocApplyBaseActivity.getString(g.cs_oc_face_recognition_failed), ocApplyBaseActivity.getString(g.cs_oc_face_service_unavailable));
            ocALiFaceFailedDialog2.setRightListener(new W(4, str, ocApplyBaseActivity));
            ocALiFaceFailedDialog2.show();
        } else {
            OcALiFaceFailedDialog ocALiFaceFailedDialog3 = new OcALiFaceFailedDialog(ocApplyBaseActivity, ocApplyBaseActivity.getString(g.cs_oc_face_give_up), ocApplyBaseActivity.getString(k.core_try_again1), ocApplyBaseActivity.getString(g.cs_oc_face_recognition_failed), ocApplyBaseActivity.getString(g.cs_oc_face_common_failed_reason));
            final int i11 = 1;
            ocALiFaceFailedDialog3.setLeftListener(new View.OnClickListener() { // from class: ub.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OcApplyBaseActivity ocApplyBaseActivity2 = ocApplyBaseActivity;
                    switch (i11) {
                        case 0:
                            int i12 = OcApplyBaseActivity.f29246X;
                            ocApplyBaseActivity2.getClass();
                            OcApplyBaseActivity.n();
                            break;
                        default:
                            int i13 = OcApplyBaseActivity.f29246X;
                            ocApplyBaseActivity2.getClass();
                            OcApplyBaseActivity.n();
                            break;
                    }
                }
            });
            ocALiFaceFailedDialog3.setRightListener(new A(15));
            ocALiFaceFailedDialog3.show();
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "t");
        p355xf.o oVar = q.f43977a;
        ((C0765i) this.f39520b).resumeWith(androidx.camera.core.impl.utils.executor.g.f(t));
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void onInputChanged(boolean z3) {
        EditCloseContactsActivity editCloseContactsActivity = (EditCloseContactsActivity) this.f39520b;
        editCloseContactsActivity.f27193B = z3;
        editCloseContactsActivity.f27201c.setEnabled(editCloseContactsActivity.f27192A && z3);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        int i10 = this.f39519a;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        switch (i10) {
            case 1:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) this.f39520b;
                cLInstallmentBorrowFragment.f30581y1 = i7;
                cLInstallmentBorrowFragment.f30564q1 = (CLRepaymentPlanData) cLInstallmentBorrowFragment.f30583z1.get(i7);
                int i11 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.n0();
                return;
            case 22:
                ArrayList arrayList = ((CLRepaymentListActivity) this.f39520b).f29105e;
                if (arrayList == null) {
                    Intrinsics.n("mData");
                    throw null;
                }
                Object obj = arrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) obj;
                Bundle bundle = new Bundle();
                bundle.putString("orderType", TransType.TRANS_TYPE_CL_REPAY);
                bundle.putString("orderNo", ocRepaidListDetail.getPayId());
                bundle.putString("cardNo", ocRepaidListDetail.getCardNo());
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "RepaymentDetails");
                return;
            default:
                Object obj2 = ((OcMainFragment) this.f39520b).f30470z0.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                OcFinanceMenuData ocFinanceMenuData = (OcFinanceMenuData) obj2;
                org.chromium.support_lib_boundary.util.b.Q(ocFinanceMenuData.getJumpType(), ocFinanceMenuData.getJumpPath(), ocFinanceMenuData.getJumpParams(), null);
                return;
        }
    }

    @Override // androidx.webkit.WebViewCompat$WebMessageListener
    public void onPostMessage(WebView webView, androidx.webkit.h hVar, Uri uri, boolean z3, androidx.webkit.b bVar) {
        String str;
        int i7 = hVar.f18290b;
        if (i7 == 0) {
            ((RNCWebView) this.f39520b).c(hVar.f18289a, uri.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        if (i7 != 0) {
            str = i7 != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        throw new IllegalStateException(F.d(sb2, str, " expected, but got ", "String"));
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onProcessing() {
        ((OcApplyBaseActivity) this.f39520b).showLoadingDialog(true);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, K response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zIsSuccessful = response.f41873a.isSuccessful();
        C0765i c0765i = (C0765i) this.f39520b;
        if (zIsSuccessful) {
            p355xf.o oVar = q.f43977a;
            c0765i.resumeWith(response.f41874b);
        } else {
            p355xf.o oVar2 = q.f43977a;
            c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(new C1993k(response)));
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        OcApplyBaseActivity ocApplyBaseActivity = (OcApplyBaseActivity) this.f39520b;
        ocApplyBaseActivity.showLoadingDialog(false);
        ocApplyBaseActivity.f29260v = true;
        d.h(ocApplyBaseActivity.TAG, 3, "checkAliFaceResultSuccess >>> resp=" + data);
        if (ocApplyBaseActivity.f29260v) {
            String str = data.s3Url;
            String str2 = Intrinsics.c(ocApplyBaseActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
            OcApplyData ocApplyData = ocApplyBaseActivity.f29248B;
            String applyId = ocApplyData != null ? ocApplyData.getApplyId() : null;
            OcApplyData ocApplyData2 = ocApplyBaseActivity.f29248B;
            OcUploadALiFaceResultReq ocUploadALiFaceResultReq = new OcUploadALiFaceResultReq(str, applyId, ocApplyData2 != null ? ocApplyData2.getProduct() : null, str2);
            OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) ocApplyBaseActivity.l();
            ocApplyBaseViewModel.getClass();
            p140j8.f.s(ocApplyBaseViewModel, new C0345d(ocUploadALiFaceResultReq, null), ocApplyBaseViewModel.f30902p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        File file = new File(BaseApplication.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES), GetCustomerServiceUrlReq.ENTER_TYPE_QRCODE);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "qrcode_" + TimeUtils.millis2String(System.currentTimeMillis(), new SimpleDateFormat("yyyy-MM-dd_HH-mm_ss", Locale.ENGLISH)) + PictureMimeType.JPG);
        ImageUtils.save((Bitmap) this.f39520b, file2, Bitmap.CompressFormat.JPEG);
        String path = file2.getPath();
        if (!TextUtils.isEmpty(path)) {
            r0.N1(BaseApplication.getContext(), path);
            observableEmitter.onNext(path);
        }
        observableEmitter.onComplete();
    }

    public /* synthetic */ j(Object obj, int i7) {
        this.f39519a = i7;
        this.f39520b = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.f39519a) {
            case 11:
                boolean z3 = th instanceof TimeoutException;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f39520b;
                if (!z3) {
                    kVar.b(Collections.EMPTY_LIST);
                } else {
                    kVar.d(th);
                }
                break;
            default:
                boolean z8 = th instanceof MediaCodec.CodecException;
                v vVar = (v) ((org.greenrobot.eventbus.f) this.f39520b).f41079b;
                if (!z8) {
                    vVar.b(0, th.getMessage(), th);
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    vVar.getClass();
                    vVar.b(1, codecException.getMessage(), codecException);
                }
                break;
        }
    }

    public j(List items) {
        this.f39519a = 9;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f39520b = items;
    }

    public j() {
        this.f39519a = 10;
        this.f39520b = (SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(SmallDisplaySizeQuirk.class);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        switch (this.f39519a) {
            case 11:
                List list = (List) obj;
                list.getClass();
                ((androidx.concurrent.futures.k) this.f39520b).b(new ArrayList(list));
                break;
            default:
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void isChecked(boolean z3) {
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void onSelectBillType(int i7) {
    }
}
