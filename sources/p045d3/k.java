package p045d3;

import Ab.ViewOnClickListenerC0053e;
import E.Q;
import Fe.f0;
import G4.j;
import Ie.i;
import Jb.C0346e;
import Pa.Y;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.c;
import androidx.camera.core.impl.utils.e;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.n;
import androidx.camera.core.impl.utils.o;
import androidx.camera.core.impl.y0;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.b;
import androidx.camera.video.E;
import androidx.room.C;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener;
import androidx.work.RunnableScheduler;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCacheTracker;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierVerifyViewModel;
import com.flexibank.sdk.core.listener.FlexiBankOnSendCodeListener;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.growingio.android.sdk.track.middleware.format.FormatDataFetcher;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.internal.t;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.mtn.sdk.config.Result;
import com.transsnet.mtn.sdk.util.MTNHandler;
import com.transsnet.palmpay.contacts.ui.activity.EditCloseContactsActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.db.RequestContactDB;
import com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcSaveSmsTokenReq;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView;
import com.transsnet.palmpay.util.ImageUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p140j8.f;
import p198n5.h;
import p216o5.d;
import p231p5.a;
import p242q0.g;

/* JADX INFO: loaded from: classes.dex */
public final class k implements IValueFormatter, Consumer, Action, FlexiBankOnSendCodeListener, ObservableOnSubscribe, TimeRemindViewHandler$CallBack1, FormatDataFetcher, Operation, FutureCallback, RunnableScheduler, ObjectConstructor, IBridgeCallback, MemoryCacheTracker, ResourceReleaser, Observer, MTNHandler, OnRvItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f35518b;

    public /* synthetic */ k(int i7, char c6) {
        this.f35517a = i7;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener) it.next()).onPost();
        }
    }

    public static a c(d dVar) {
        return dVar instanceof p111h5.d ? new a(((p111h5.d) dVar).c().toString().getBytes()) : new a();
    }

    public static a g(List list) {
        String string;
        if (list == null || list.isEmpty()) {
            string = "[]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int size = list.size();
            h.a("JsonDataFetcher", F.c(size, "----- merge json data size:", " ----"), new Object[0]);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                size--;
                if (bArr.length > 0) {
                    String str = new String(bArr);
                    if (str.startsWith("{") && str.endsWith("}")) {
                        sb2.append(str);
                        if (size > 0) {
                            sb2.append(",");
                        }
                    }
                } else {
                    h.c("JsonDataFetcher", "Events in the database are not in the JSON format", new Object[0]);
                }
            }
            sb2.append("]");
            string = sb2.toString();
        }
        return new a(string.getBytes(StandardCharsets.UTF_8));
    }

    public static k h(int i7, int i10, int i11, int i12, boolean z3, boolean z8) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i10, i11, i12, z3, z8), 22);
    }

    public static b j(c cVar) throws Q {
        b bVar = cVar.f13745a;
        ImageProxy imageProxy = (ImageProxy) bVar.f14371a;
        Rect rect = bVar.f14375e;
        try {
            byte[] bArrD = androidx.camera.core.internal.utils.c.d(imageProxy, rect, cVar.f13746b, bVar.f14376f);
            try {
                e eVar = new e(new g(new ByteArrayInputStream(bArrD)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                Matrix matrix = bVar.f14377g;
                RectF rectF = o.f14263a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new b(bArrD, eVar, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, size, rect2, bVar.f14376f, matrix2, bVar.f14378h);
            } catch (IOException e10) {
                throw new Q(0, "Failed to extract Exif from YUV-generated JPEG", e10);
            }
        } catch (androidx.camera.core.internal.utils.b e11) {
            throw new Q(1, "Failed to encode the image to JPEG.", e11);
        }
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.f35518b).values());
            ((HashMap) this.f35518b).clear();
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            p109h3.e eVar = (p109h3.e) arrayList.get(i7);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        String str = (String) obj;
        IBaseView iBaseView = ((f0) this.f35518b).f27351a;
        if (iBaseView != null) {
            ((ReceiveMoneyContract$IView) iBaseView).showSaveResult(str);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    public Object apply(Object obj) {
        b bVarJ;
        c cVar = (c) obj;
        try {
            b bVar = cVar.f13745a;
            int i7 = bVar.f14373c;
            Object obj2 = bVar.f14371a;
            if (i7 == 35) {
                bVarJ = j(cVar);
            } else {
                if (i7 != 256 && i7 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i7);
                }
                bVarJ = i(cVar, i7);
            }
            ((ImageProxy) obj2).close();
            return bVarJ;
        } catch (Throwable th) {
            ((ImageProxy) cVar.f13745a.f14371a).close();
            throw th;
        }
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(Runnable runnable) {
        ((Handler) this.f35518b).removeCallbacks(runnable);
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        Class cls = (Class) this.f35518b;
        try {
            return t.f23675a.a(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public synchronized p109h3.e d(CacheKey cacheKey) {
        cacheKey.getClass();
        p109h3.e eVarA = (p109h3.e) ((HashMap) this.f35518b).get(cacheKey);
        if (eVarA != null) {
            synchronized (eVarA) {
                if (!p109h3.e.j(eVarA)) {
                    ((HashMap) this.f35518b).remove(cacheKey);
                    p229p2.a.u(k.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVarA)), cacheKey.getUriString(), Integer.valueOf(System.identityHashCode(cacheKey)));
                    return null;
                }
                eVarA = p109h3.e.a(eVarA);
            }
        }
        return eVarA;
    }

    public synchronized ArrayList e(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (E1.a aVar : (ArrayList) this.f35518b) {
            if ((aVar.f2175a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f2176b)) && !arrayList.contains(aVar.f2176b)) {
                arrayList.add(aVar.f2176b);
            }
        }
        return arrayList;
    }

    @Override // com.transsnet.mtn.sdk.util.MTNHandler
    public String encrypt(String str) {
        byte[] bytes;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String string = ((OcApplyBaseActivity) this.f35518b).getString(p025ba.k.core_one_loop_private_key);
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            } else {
                bytes = null;
            }
            return Z4.e.L(string, bytes);
        } catch (GeneralSecurityException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public Object executeData() {
        p231p5.b bVar = (p231p5.b) this.f35518b;
        try {
            int i7 = bVar.f41185a;
            if (i7 == 0) {
                d dVar = bVar.f41186b;
                if (dVar != null) {
                    return c(dVar);
                }
                throw new IllegalArgumentException("leak necessary event");
            }
            if (i7 != 1) {
                return new a();
            }
            ArrayList arrayList = bVar.f41187c;
            if (arrayList != null) {
                return g(arrayList);
            }
            throw new IllegalArgumentException("leak necessary events");
        } catch (IllegalArgumentException e10) {
            h.b("JsonDataFetcher", e10);
            return new a();
        }
    }

    public synchronized void f() {
        p229p2.a.o(k.class, "Count = %d", Integer.valueOf(((HashMap) this.f35518b).size()));
    }

    @Override // com.growingio.android.sdk.track.middleware.format.FormatDataFetcher
    public /* bridge */ /* synthetic */ Object format(d dVar) {
        return c(dVar);
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public Class getDataClass() {
        return a.class;
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public String getFormattedValue(float f10, Entry entry, int i7, j jVar) {
        return ((DecimalFormat) this.f35518b).format(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r2 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.camera.core.processing.b i(androidx.camera.core.imagecapture.c r12, int r13) {
        /*
            r11 = this;
            androidx.camera.core.processing.b r12 = r12.f13745a
            java.lang.Object r0 = r12.f14371a
            androidx.camera.core.ImageProxy r0 = (androidx.camera.core.ImageProxy) r0
            java.lang.Object r1 = r11.f35518b
            androidx.camera.core.internal.compat.workaround.a r1 = (androidx.camera.core.internal.compat.workaround.a) r1
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r1 = r1.f14322a
            r2 = 0
            if (r1 != 0) goto L27
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r0.getPlanes()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r0.rewind()
            r0.get(r1)
        L25:
            r3 = r1
            goto L82
        L27:
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r0.getPlanes()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            int r1 = r0.capacity()
            byte[] r3 = new byte[r1]
            r0.rewind()
            r0.get(r3)
            r4 = 2
            r5 = r4
        L3f:
            int r6 = r5 + 4
            r7 = -1
            if (r6 > r1) goto L66
            r6 = r3[r5]
            if (r6 == r7) goto L49
            goto L66
        L49:
            if (r6 != r7) goto L54
            int r6 = r5 + 1
            r6 = r3[r6]
            r7 = -38
            if (r6 != r7) goto L54
            goto L79
        L54:
            int r6 = r5 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r7 = r5 + 3
            r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L3f
        L66:
            int r2 = r4 + 1
            if (r2 <= r1) goto L6c
            r2 = r7
            goto L77
        L6c:
            r5 = r3[r4]
            if (r5 != r7) goto L98
            r5 = r3[r2]
            r6 = -40
            if (r5 != r6) goto L98
            r2 = r4
        L77:
            if (r2 == r7) goto L82
        L79:
            int r0 = r0.limit()
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L25
        L82:
            androidx.camera.core.impl.utils.e r4 = r12.f14372b
            java.util.Objects.requireNonNull(r4)
            androidx.camera.core.processing.b r2 = new androidx.camera.core.processing.b
            android.util.Size r6 = r12.f14374d
            android.graphics.Rect r7 = r12.f14375e
            int r8 = r12.f14376f
            android.graphics.Matrix r9 = r12.f14377g
            androidx.camera.core.impl.CameraCaptureResult r10 = r12.f14378h
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L98:
            r5 = r13
            r4 = r2
            r13 = r5
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: p045d3.k.i(androidx.camera.core.imagecapture.c, int):androidx.camera.core.processing.b");
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void isChecked(boolean z3) {
        EditCloseContactsActivity editCloseContactsActivity = (EditCloseContactsActivity) this.f35518b;
        if (z3) {
            editCloseContactsActivity.p(editCloseContactsActivity.f27210v.f9331v);
        } else {
            editCloseContactsActivity.f27211w.a(true);
            editCloseContactsActivity.f27211w.b(true);
        }
    }

    public synchronized void k(p332w1.c cVar) {
        cVar.f43251b = null;
        cVar.f43252c = null;
        ((ArrayDeque) this.f35518b).offer(cVar);
    }

    public void l(CacheKey cacheKey) {
        p109h3.e eVar;
        cacheKey.getClass();
        synchronized (this) {
            eVar = (p109h3.e) ((HashMap) this.f35518b).remove(cacheKey);
        }
        if (eVar == null) {
            return;
        }
        try {
            eVar.i();
        } finally {
            eVar.close();
        }
    }

    public synchronized void m(CacheKey cacheKey, p109h3.e eVar) {
        cacheKey.getClass();
        eVar.getClass();
        if (!p109h3.e.j(eVar)) {
            throw new IllegalArgumentException();
        }
        p109h3.e eVar2 = (p109h3.e) ((HashMap) this.f35518b).get(cacheKey);
        if (eVar2 == null) {
            return;
        }
        CloseableReference closeableReferenceC = CloseableReference.c(eVar2.f37274a);
        CloseableReference closeableReferenceC2 = CloseableReference.c(eVar.f37274a);
        if (closeableReferenceC != null && closeableReferenceC2 != null) {
            try {
                if (closeableReferenceC.f() == closeableReferenceC2.f()) {
                    ((HashMap) this.f35518b).remove(cacheKey);
                    closeableReferenceC2.close();
                    closeableReferenceC.close();
                    eVar2.close();
                    f();
                    return;
                }
            } catch (Throwable th) {
                closeableReferenceC2.close();
                closeableReferenceC.close();
                eVar2.close();
                throw th;
            }
        }
        CloseableReference.d(closeableReferenceC2);
        CloseableReference.d(closeableReferenceC);
        eVar2.close();
    }

    @Override // com.growingio.android.sdk.track.middleware.format.FormatDataFetcher
    public /* bridge */ /* synthetic */ Object merge(List list) {
        return g(list);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
    public void onCacheHit(Object obj) {
        ((ImageCacheStatsTracker) this.f35518b).onMemoryCacheHit((CacheKey) obj);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
    public void onCacheMiss(Object obj) {
        ((ImageCacheStatsTracker) this.f35518b).onMemoryCacheMiss((CacheKey) obj);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
    public void onCachePut(Object obj) {
        ((ImageCacheStatsTracker) this.f35518b).onMemoryCachePut((CacheKey) obj);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        f.G("VideoEncoderSession");
        ((E) this.f35518b).b();
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void onInputChanged(boolean z3) {
        EditCloseContactsActivity editCloseContactsActivity = (EditCloseContactsActivity) this.f35518b;
        editCloseContactsActivity.f27192A = z3;
        editCloseContactsActivity.f27201c.setEnabled(z3 && editCloseContactsActivity.f27193B);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        OcInstallmentRepayActivity ocInstallmentRepayActivity = (OcInstallmentRepayActivity) this.f35518b;
        ocInstallmentRepayActivity.f29546q0 = i7;
        OcInstallmentRepayActivity.m(ocInstallmentRepayActivity);
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        ReferEarnRewardDialogActivity referEarnRewardDialogActivity = (ReferEarnRewardDialogActivity) this.f35518b;
        Object value = referEarnRewardDialogActivity.f31947g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(referEarnRewardDialogActivity.getString(p236pc.f.jp_this_will_automatically_close_in_s, String.valueOf(jLongValue)));
        if (jLongValue == 0) {
            referEarnRewardDialogActivity.finish();
        }
    }

    @Override // com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1
    public void onSelectBillType(int i7) {
        int i10 = EditCloseContactsActivity.f27191X;
        ((EditCloseContactsActivity) this.f35518b).p(i7);
    }

    @Override // com.flexibank.sdk.core.listener.FlexiBankOnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = (FlexiBankCheckPalmPayOtpFragment) this.f35518b;
        KeyboardUtils.hideSoftInput(flexiBankCheckPalmPayOtpFragment.getActivity());
        Z3.g req = new Z3.g();
        req.a();
        req.b(i7);
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) flexiBankCheckPalmPayOtpFragment.h();
        i function = new i(flexiBankCheckPalmPayOtpFragment, i7, 1);
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(function, "function");
        U3.f fVar = new U3.f(req, null);
        K3.j jVar = flexiBankCashierVerifyViewModel.f22083g;
        jVar.f4932m = function;
        Unit unit = Unit.f38893a;
        p118hf.a.B(flexiBankCashierVerifyViewModel, fVar, jVar);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        ((ReferEarnRewardDialogActivity) this.f35518b).addSubscription(d2);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // com.facebook.common.references.ResourceReleaser
    public void release(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((p137j3.d) this.f35518b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    @Override // com.palmpay.lib.bridge.IBridgeCallback
    public void resolved(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ((SyncBridge) this.f35518b).handleResult(result);
    }

    @Override // com.transsnet.mtn.sdk.util.MTNHandler
    public void result(Result result) {
        if (result != null) {
            int i7 = result.resultCode;
            if (i7 != 101) {
                if (i7 != 102) {
                    return;
                }
                ToastUtils.showLong(result.msg, new Object[0]);
                return;
            }
            OcApplyBaseActivity ocApplyBaseActivity = (OcApplyBaseActivity) this.f35518b;
            if (ocApplyBaseActivity.f29260v) {
                Integer numValueOf = Integer.valueOf(i7);
                OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) ocApplyBaseActivity.l();
                OcApplyData ocApplyData = ocApplyBaseActivity.f29248B;
                OcSaveSmsTokenReq req = new OcSaveSmsTokenReq(ocApplyData != null ? ocApplyData.getApplyId() : null, String.valueOf(numValueOf));
                ocApplyBaseViewModel.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                f.s(ocApplyBaseViewModel, new C0346e(req, null), ocApplyBaseViewModel.f30901o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                ocApplyBaseActivity.t++;
                ocApplyBaseActivity.f29257j = true;
            }
        }
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        switch (this.f35517a) {
            case 6:
                BaseFragment baseFragment = (BaseFragment) ((Y) this.f35518b).f7061b.get();
                if (baseFragment != null) {
                    baseFragment.showLoadingDialog(false);
                }
                break;
            default:
                BaseActivity baseActivity = (BaseActivity) ((Y) this.f35518b).f7061b.get();
                if (baseActivity != null) {
                    baseActivity.showLoadingDialog(false);
                }
                break;
        }
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long j6, Runnable runnable) {
        ((Handler) this.f35518b).postDelayed(runnable, j6);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        int dimensionPixelOffset = BaseApplication.getContext().getResources().getDimensionPixelOffset(q.dp160);
        int dimensionPixelOffset2 = BaseApplication.getContext().getResources().getDimensionPixelOffset(q.dp45);
        observableEmitter.onNext(J3.a.i((String) this.f35518b, dimensionPixelOffset, dimensionPixelOffset, ImageUtils.getBitmap(r.cv_qrcode_logo_icon, dimensionPixelOffset2, dimensionPixelOffset2)));
        observableEmitter.onComplete();
    }

    public /* synthetic */ k(Object obj, int i7) {
        this.f35517a = i7;
        this.f35518b = obj;
    }

    public k(View view) {
        this.f35517a = 5;
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(Ac.e.tvMsgCount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f35518b = (TextView) viewFindViewById;
        view.findViewById(Ac.e.ivBell).setOnClickListener(new ViewOnClickListenerC0053e(26));
    }

    public k(byte b7, int i7) {
        this.f35517a = i7;
        switch (i7) {
            case 16:
                this.f35518b = n.d(Looper.getMainLooper());
                break;
            case 17:
                this.f35518b = new HashSet();
                break;
            case 18:
                char[] cArr = J1.o.f4478a;
                this.f35518b = new ArrayDeque(0);
                break;
            default:
                this.f35518b = new ArrayList();
                break;
        }
    }

    public k(ContextWrapper contextWrapper) {
        this.f35517a = 24;
        if (RequestContactDB.f27373a == null) {
            synchronized (RequestContactDB.class) {
                try {
                    if (RequestContactDB.f27373a == null) {
                        C cL = com.palmpay.lib.apm.launchcounter.util.d.l(contextWrapper.getApplicationContext(), "request_contact.db", RequestContactDB.class);
                        cL.f17692j = true;
                        RequestContactDB.f27373a = (RequestContactDB) cL.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f35518b = RequestContactDB.f27373a.c();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    public k(int i7) {
        this.f35517a = 2;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 == 0) {
                stringBuffer.append(Consts.DOT);
            }
            stringBuffer.append("0");
        }
        this.f35518b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public k(y0 y0Var, int i7) {
        this.f35517a = i7;
        switch (i7) {
            case 13:
                this.f35518b = new androidx.camera.core.internal.compat.workaround.a(y0Var);
                break;
            default:
                AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) y0Var.b(AeFpsRangeLegacyQuirk.class);
                if (aeFpsRangeLegacyQuirk == null) {
                    this.f35518b = null;
                } else {
                    this.f35518b = aeFpsRangeLegacyQuirk.f13445a;
                }
                break;
        }
    }

    @Override // com.flexibank.sdk.core.listener.FlexiBankOnSendCodeListener
    public void onButtonVisibilityChange(View view, int i7) {
    }
}
