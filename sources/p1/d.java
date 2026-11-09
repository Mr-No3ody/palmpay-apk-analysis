package p1;

import Bc.C0107d;
import C0.G;
import E.AbstractC0198c;
import E.k0;
import Kg.g;
import N8.q0;
import Oc.j;
import Pa.C0525w;
import Pa.H;
import Pa.r0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.biometric.AbstractC0913q;
import androidx.biometric.C0914s;
import androidx.biometric.RunnableC0903g;
import androidx.camera.camera2.internal.C0933i0;
import androidx.camera.camera2.internal.M;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.imagecapture.n;
import androidx.camera.core.imagecapture.t;
import androidx.camera.core.impl.C0975e;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.executor.i;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.y0;
import androidx.camera.video.C1015d;
import androidx.camera.video.E;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.A;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.l;
import androidx.camera.video.o;
import androidx.camera.video.q;
import androidx.camera.video.r;
import androidx.camera.video.s;
import androidx.camera.video.u;
import androidx.concurrent.futures.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.dynamicanimation.animation.AnimationHandler$DurationScaleChangeListener;
import androidx.lifecycle.F;
import androidx.work.Operation;
import com.airbnb.lottie.B;
import com.airbnb.lottie.p;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.x;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.network.NQEManager;
import com.swmansion.rnscreens.gamma.tabs.TabScreen;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CloseContactBean;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.main.export.bean.rsp.AssetsBalanceItem;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.teller.ui.dialog.BeneficiaresEditPopWindow$OnPopuClickListener;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Y;
import okhttp3.e0;
import p025ba.k;
import p140j8.f;
import p220oa.h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements OnRvItemClickListener, FutureCallback, RecoveryStrategy, Callback, Argument2Callback, ObservableOnSubscribe, Operation, BeneficiaresEditPopWindow$OnPopuClickListener, EncoderProfilesProvider, AnimationHandler$DurationScaleChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f41178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41179c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f41177a = i7;
        this.f41178b = obj;
        this.f41179c = obj2;
    }

    public static d f(CameraInfo cameraInfo) {
        if (cameraInfo instanceof C0933i0) {
            return ((C0933i0) cameraInfo).f13556c;
        }
        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
        p118hf.a.g(implementation instanceof M, "CameraInfo doesn't contain Camera2 implementation.");
        return ((M) implementation).f13230c;
    }

    public static d h(List list, C1015d c1015d) {
        p118hf.a.j(list, "qualities cannot be null");
        p118hf.a.g(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            p118hf.a.g(l.f14800h.contains(lVar), "qualities contain invalid quality: " + lVar);
        }
        return new d(list, c1015d);
    }

    public Size[] a(Size[] sizeArr, int i7) {
        List arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.f41178b) != null) {
            Size[] sizeArr2 = (i7 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList4.addAll(Arrays.asList(sizeArr2));
            }
        }
        g gVar = (g) this.f41179c;
        gVar.getClass();
        if (((ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList = new ArrayList();
        } else {
            String str = gVar.f5494a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i7 == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i7 == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str.equals("0") && (i7 == 34 || i7 == 35)) {
                        arrayList2.add(new Size(720, 720));
                        arrayList2.add(new Size(400, 400));
                    }
                } else if (ExcludedSupportedSizesQuirk.b()) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0")) {
                        if (i7 == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i7 == 35) {
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i7 == 34 || i7 == 35)) {
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(2448, 2448));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if (ExcludedSupportedSizesQuirk.a()) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0")) {
                        if (i7 == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i7 == 35) {
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i7 == 34 || i7 == 35)) {
                        arrayList3.add(new Size(2576, 1932));
                        arrayList3.add(new Size(2560, 1440));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList2 = new ArrayList();
                    if (str.equals("0") && i7 == 256) {
                        arrayList2.add(new Size(9280, 6944));
                    }
                } else {
                    f.G("ExcludedSupportedSizesQuirk");
                    arrayList = Collections.EMPTY_LIST;
                }
                arrayList = arrayList2;
            }
            arrayList = arrayList3;
        }
        if (!arrayList.isEmpty()) {
            arrayList4.removeAll(arrayList);
        }
        if (arrayList4.isEmpty()) {
            f.G("OutputSizesCorrector");
        }
        return (Size[]) arrayList4.toArray(new Size[0]);
    }

    public d b(int i7, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strValueOf = String.valueOf(i7);
        ((ArrayList) this.f41179c).add(key + ": " + strValueOf);
        return this;
    }

    public d c(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = value.toString();
        ((ArrayList) this.f41179c).add(key + ": " + string);
        return this;
    }

    public int d() {
        p003a0.b bVar = (p003a0.b) this.f41179c;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (!bVar.c()) {
            return 12;
        }
        FingerprintManager fingerprintManagerB = p003a0.b.b(bVar.f11816a);
        return (fingerprintManagerB == null || !fingerprintManagerB.hasEnrolledFingerprints()) ? 11 : 0;
    }

    public void e() {
        D3.a.a(((String) this.f41178b).concat(""));
    }

    public B g(Context context, String str, InputStream inputStream, String str2, String str3) {
        B bI;
        b bVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        c cVar = (c) this.f41178b;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.c.a();
            b bVar2 = b.ZIP;
            bI = str3 != null ? p.i(context, new ZipInputStream(new FileInputStream(cVar.h(str, inputStream, bVar2))), str) : p.i(context, new ZipInputStream(inputStream), null);
            bVar = bVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            com.airbnb.lottie.utils.c.a();
            bVar = b.GZIP;
            bI = str3 != null ? p.d(new GZIPInputStream(new FileInputStream(cVar.h(str, inputStream, bVar))), str) : p.d(new GZIPInputStream(inputStream), null);
        } else {
            com.airbnb.lottie.utils.c.a();
            bVar = b.JSON;
            bI = str3 != null ? p.d(new FileInputStream(cVar.h(str, inputStream, bVar).getAbsolutePath()), str) : p.d(inputStream, null);
        }
        if (str3 != null && bI.f19556a != null) {
            File file = new File(cVar.g(), c.c(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            com.airbnb.lottie.utils.c.a();
            if (!zRenameTo) {
                com.airbnb.lottie.utils.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + Consts.DOT);
            }
        }
        return bI;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i7) {
        return i(i7);
    }

    @Override // androidx.work.Operation
    public ListenableFuture getResult() {
        return (m) this.f41179c;
    }

    @Override // androidx.work.Operation
    public androidx.lifecycle.B getState() {
        return (F) this.f41178b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i7) {
        return i(i7) != null;
    }

    public EncoderProfilesProxy i(int i7) {
        HashMap map = (HashMap) this.f41179c;
        return (map == null || !map.containsKey(Integer.valueOf(i7))) ? ((EncoderProfilesProvider) this.f41178b).getAll(i7) : (EncoderProfilesProxy) map.get(Integer.valueOf(i7));
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) throws IOException {
        Intent intent = (Intent) obj2;
        if (((Integer) obj).intValue() != -1) {
            ToastUtils.showLong(k.core_operation_fail);
            return;
        }
        Context context = BaseApplication.getContext();
        Uri data = intent.getData();
        String str = p220oa.b.f40249a;
        File file = (File) this.f41178b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (file.canRead() && file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                p220oa.b.d(fileInputStream, context, data);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(fileInputStream, th);
                    throw th2;
                }
            }
        } else {
            F6.d.h("ImageExt", 5, u.k(file, "check: read file error: "));
        }
        r0.x1((WeakReference) this.f41179c, file);
    }

    public void j(MenuItem menuItem, TabScreen tabScreen) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) ((BottomNavigationView) this.f41178b).findViewById(menuItem.getItemId());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(tabScreen.getTabBarItemAccessibilityLabel());
        }
        navigationBarItemView.setTag(tabScreen.getTabBarItemTestID());
    }

    public void k(AssetsBalanceItem assetsBalanceItem) {
        ConstraintLayout constraintLayout;
        this.f41179c = assetsBalanceItem;
        C0107d c0107d = (C0107d) this.f41178b;
        if (c0107d != null && (constraintLayout = (ConstraintLayout) c0107d.f680b) != null) {
            h.s(constraintLayout, true);
        }
        if (c0107d != null) {
            ((TextView) c0107d.f683e).setText(assetsBalanceItem.title);
        }
        boolean zC = p059e1.a.C("main_sp_show_balance", false);
        if (assetsBalanceItem.itemType != 1) {
            if (c0107d != null) {
                ((IconicsTextView) c0107d.f682d).setText(zC ? assetsBalanceItem.tips : "****");
            }
            if (NQEManager.INSTANCE.isNetworkOffline() && c0107d != null) {
                ((IconicsTextView) c0107d.f682d).setText("--");
            }
            if (c0107d != null) {
                h.s((TextView) c0107d.f681c, false);
                return;
            }
            return;
        }
        if (c0107d != null) {
            ((IconicsTextView) c0107d.f682d).setText(zC ? r0.B(assetsBalanceItem.balance * 100, false) : "****");
        }
        if (NQEManager.INSTANCE.isNetworkOffline() && c0107d != null) {
            ((IconicsTextView) c0107d.f682d).setText("--");
        }
        Long l5 = assetsBalanceItem.expireTime;
        if (l5 != null) {
            if (c0107d != null) {
                ((TextView) c0107d.f681c).setText(assetsBalanceItem.tips + " " + TimeUtils.millis2String(l5.longValue(), new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH)));
            }
        } else if (c0107d != null) {
            ((TextView) c0107d.f681c).setText(assetsBalanceItem.tips);
        }
        if (c0107d != null) {
            h.s((TextView) c0107d.f681c, !TextUtils.isEmpty(assetsBalanceItem.tips));
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.BeneficiaresEditPopWindow$OnPopuClickListener
    public void onDelete() {
        BeneficiariesActivity beneficiariesActivity = (BeneficiariesActivity) this.f41178b;
        O6.c cVar = new O6.c(beneficiariesActivity);
        cVar.f6596b = O6.d.f("");
        cVar.b(Pd.f.qt_confirm_delete_beneficiary);
        cVar.d(k.core_delete, new j(23, (CloseContactBean) this.f41179c, beneficiariesActivity));
        cVar.c(k.core_cancel, null);
        cVar.g();
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.BeneficiaresEditPopWindow$OnPopuClickListener
    public void onEdit() {
        d0.g(1, "/quick_teller/edit_beneficiaries", "key_editable").withString("extra_type", ((BeneficiariesActivity) this.f41178b).f34152f).withParcelable("business_data", (CloseContactBean) this.f41179c).navigation();
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        ((Ng.h) this.f41178b).b(e10, null);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        switch (this.f41177a) {
            case 1:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                long jLongValue = ((Number) ((ArrayList) this.f41179c).get(i7)).longValue();
                RechargeActivity rechargeActivity = (RechargeActivity) this.f41178b;
                rechargeActivity.f26867Q = jLongValue;
                rechargeActivity.p().setAmount(r0.E(rechargeActivity.f26867Q));
                rechargeActivity.m();
                break;
            default:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                StateAmountEditText stateAmountEditTextU = ((WithdrawV2Fragment) this.f41178b).u();
                if (stateAmountEditTextU != null) {
                    stateAmountEditTextU.setText(r0.E(((Number) ((E9.k) this.f41179c).f4992b.get(i7)).longValue()));
                }
                break;
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, e0 response) throws IOException {
        Integer num;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        D.d dVar = response.f40739v;
        try {
            ((Ng.h) this.f41178b).a(response, dVar);
            Gg.m mVarC = dVar.c();
            Ng.j jVar = Ng.j.f6429g.parse(response.f40733f);
            ((Ng.h) this.f41178b).f6411e = jVar;
            if (jVar.f6435f || jVar.f6431b != null || ((num = jVar.f6433d) != null && !new IntRange(8, 15, 1).contains(num.intValue()))) {
                Ng.h hVar = (Ng.h) this.f41178b;
                synchronized (hVar) {
                    hVar.f6422p.clear();
                    hVar.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                ((Ng.h) this.f41178b).c(Dg.c.f1885g + " WebSocket " + ((Y) this.f41179c).f40685a.i(), mVarC);
                Ng.h hVar2 = (Ng.h) this.f41178b;
                hVar2.f6408b.onOpen(hVar2, response);
                ((Ng.h) this.f41178b).d();
            } catch (Exception e10) {
                ((Ng.h) this.f41178b).b(e10, null);
            }
        } catch (IOException e11) {
            ((Ng.h) this.f41178b).b(e11, response);
            Dg.c.c(response);
            if (dVar != null) {
                dVar.a(-1L, true, true, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00df A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:21:0x0093, B:22:0x0099, B:57:0x0126, B:24:0x009e, B:27:0x00aa, B:30:0x00b0, B:31:0x00b7, B:34:0x00bb, B:35:0x00c2, B:36:0x00d5, B:39:0x00d9, B:41:0x00df, B:43:0x00e9, B:44:0x00ef, B:45:0x0104, B:46:0x0105, B:48:0x010b, B:51:0x0110, B:52:0x0117, B:53:0x0118, B:54:0x011f, B:55:0x0120), top: B:77:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:21:0x0093, B:22:0x0099, B:57:0x0126, B:24:0x009e, B:27:0x00aa, B:30:0x00b0, B:31:0x00b7, B:34:0x00bb, B:35:0x00c2, B:36:0x00d5, B:39:0x00d9, B:41:0x00df, B:43:0x00e9, B:44:0x00ef, B:45:0x0104, B:46:0x0105, B:48:0x010b, B:51:0x0110, B:52:0x0117, B:53:0x0118, B:54:0x011f, B:55:0x0120), top: B:77:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:21:0x0093, B:22:0x0099, B:57:0x0126, B:24:0x009e, B:27:0x00aa, B:30:0x00b0, B:31:0x00b7, B:34:0x00bb, B:35:0x00c2, B:36:0x00d5, B:39:0x00d9, B:41:0x00df, B:43:0x00e9, B:44:0x00ef, B:45:0x0104, B:46:0x0105, B:48:0x010b, B:51:0x0110, B:52:0x0117, B:53:0x0118, B:54:0x011f, B:55:0x0120), top: B:77:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0105 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:21:0x0093, B:22:0x0099, B:57:0x0126, B:24:0x009e, B:27:0x00aa, B:30:0x00b0, B:31:0x00b7, B:34:0x00bb, B:35:0x00c2, B:36:0x00d5, B:39:0x00d9, B:41:0x00df, B:43:0x00e9, B:44:0x00ef, B:45:0x0104, B:46:0x0105, B:48:0x010b, B:51:0x0110, B:52:0x0117, B:53:0x0118, B:54:0x011f, B:55:0x0120), top: B:77:0x0093 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00ef, please report this as an issue */
    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        boolean z3;
        r rVar;
        switch (this.f41177a) {
            case 3:
                p118hf.a.k(((androidx.concurrent.futures.k) this.f41178b).b(null), null);
                return;
            case 22:
                return;
            case 23:
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                surfaceOutput.getClass();
                ((androidx.camera.core.processing.f) ((top.zibin.luban.io.a) this.f41179c).f42645b).onOutputSurface(surfaceOutput);
                return;
            default:
                Encoder encoder = (Encoder) obj;
                Objects.toString(encoder);
                f.G("Recorder");
                if (encoder == null) {
                    return;
                }
                boolean z8 = false;
                p118hf.a.k(((q) this.f41179c).f14815g.f14833A == ((E) this.f41178b), null);
                p118hf.a.k(((q) this.f41179c).f14815g.f14855s == null, null);
                s sVar = ((q) this.f41179c).f14815g;
                E e10 = (E) this.f41178b;
                sVar.getClass();
                Encoder encoder2 = e10.f14560d;
                sVar.f14855s = encoder2;
                ((VideoEncoderInfo) encoder2.getEncoderInfo()).getSupportedBitrateRange();
                sVar.f14855s.getConfiguredBitrate();
                Surface surface = e10.f14565i == 4 ? e10.f14561e : null;
                sVar.f14853q = surface;
                sVar.g(surface);
                i iVar = sVar.f14840d;
                o oVar = new o(sVar);
                e10.f14563g = iVar;
                e10.f14564h = oVar;
                ListenableFuture listenableFutureE = androidx.camera.core.impl.utils.futures.j.e(e10.f14568l);
                listenableFutureE.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureE, new p279s5.d(sVar, 23, e10, false)), iVar);
                s sVar2 = ((q) this.f41179c).f14815g;
                synchronized (sVar2.f14842f) {
                    try {
                        switch (sVar2.f14844h.ordinal()) {
                            case 0:
                                sVar2.h(r.f14819d);
                                z3 = false;
                                break;
                            case 1:
                                z3 = false;
                                if (sVar2.f14860y == androidx.camera.video.F.f14572c) {
                                    rVar = sVar2.f14844h;
                                    if (rVar != r.f14818c && rVar != r.f14817b) {
                                        throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                                    }
                                    throw new AssertionError("Pending recording should exist when in a PENDING state.");
                                }
                                if (s.f14825E.contains(sVar2.f14844h)) {
                                    throw new AssertionError("Cannot restore non-pending state when in state " + sVar2.f14844h);
                                }
                                sVar2.h(sVar2.f14845i);
                                break;
                                break;
                            case 2:
                                z3 = true;
                                if (sVar2.f14860y == androidx.camera.video.F.f14572c) {
                                    rVar = sVar2.f14844h;
                                    if (rVar != r.f14818c) {
                                        throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
                                    }
                                    throw new AssertionError("Pending recording should exist when in a PENDING state.");
                                }
                                if (s.f14825E.contains(sVar2.f14844h)) {
                                    throw new AssertionError("Cannot restore non-pending state when in state " + sVar2.f14844h);
                                }
                                sVar2.h(sVar2.f14845i);
                                break;
                                break;
                            case 3:
                            case 7:
                                throw new AssertionError("Incorrectly invoke onConfigured() in state " + sVar2.f14844h);
                            case 4:
                                z3 = false;
                                p118hf.a.k(false, "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                                z8 = true;
                                break;
                            case 5:
                                z3 = true;
                                p118hf.a.k(false, "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                                z8 = true;
                                break;
                            case 6:
                                if (!sVar2.f14843g) {
                                    throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                                }
                                z3 = false;
                                break;
                                break;
                            case 8:
                                f.g("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                                z3 = false;
                                break;
                            default:
                                z3 = false;
                                break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z8) {
                    ArrayList arrayList = sVar2.f14849m;
                    if (!arrayList.isEmpty()) {
                        androidx.camera.core.impl.utils.futures.m mVarA = androidx.camera.core.impl.utils.futures.j.a(arrayList);
                        if (!mVarA.isDone()) {
                            mVarA.cancel(true);
                        }
                        arrayList.clear();
                    }
                    arrayList.add(AbstractC0198c.y(new o(sVar2)));
                    androidx.camera.core.impl.utils.futures.m mVarA2 = androidx.camera.core.impl.utils.futures.j.a(arrayList);
                    mVarA2.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVarA2, new Sd.b(sVar2, 12)), org.chromium.support_lib_boundary.util.b.u());
                    sVar2.f14855s.start();
                    if (z3) {
                        sVar2.f14855s.pause();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        String str = ((Context) this.f41178b).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder sbQ = q0.q("Base apk does not exist: ", str, ". ");
        ((C4.a) this.f41179c).j(sbQ);
        throw new com.facebook.soloader.s(sbQ.toString(), unsatisfiedLinkError);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.dynamicanimation.animation.b, java.lang.Object] */
    @Override // androidx.dynamicanimation.animation.AnimationHandler$DurationScaleChangeListener
    public boolean register() {
        if (((androidx.dynamicanimation.animation.b) this.f41178b) != null) {
            return true;
        }
        ?? r3 = new ValueAnimator.DurationScaleChangeListener() { // from class: androidx.dynamicanimation.animation.b
            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
            public final void onChanged(float f10) {
                ((d) this.f16834a.f41179c).f16843g = f10;
            }
        };
        this.f41178b = r3;
        return ValueAnimator.registerDurationScaleChangeListener(r3);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        switch (this.f41177a) {
            case 11:
                String strD = H.c(BaseApplication.getInstance()).d((String) this.f41178b);
                try {
                    if (!TextUtils.isEmpty(strD)) {
                        C0525w c0525wF = C0525w.f();
                        Object objFromJson = ((Gson) c0525wF.f7166b).fromJson(strD, (Type) this.f41179c);
                        if (objFromJson instanceof CommonResult) {
                            ((CommonResult) objFromJson).markParseFromCache(true);
                        }
                        if (objFromJson != null) {
                            observableEmitter.onNext(objFromJson);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                observableEmitter.onComplete();
                break;
            case 12:
            default:
                ArrayList arrayList = new ArrayList();
                for (PalmPayContact palmPayContact : ((PalmPayContactsSearchActivity) this.f41179c).f27244f) {
                    boolean zIsEmpty = TextUtils.isEmpty(palmPayContact.getAlias());
                    String str = (String) this.f41178b;
                    if (!zIsEmpty && palmPayContact.getAlias().toUpperCase().contains(str.toUpperCase())) {
                        arrayList.add(palmPayContact);
                    } else if (!TextUtils.isEmpty(palmPayContact.getPhone()) && palmPayContact.getPhone().toUpperCase().contains(str.toUpperCase())) {
                        arrayList.add(palmPayContact);
                    } else if (!TextUtils.isEmpty(palmPayContact.getFullName()) && palmPayContact.getFullName().toUpperCase().contains(str.toUpperCase())) {
                        arrayList.add(palmPayContact);
                    }
                }
                observableEmitter.onNext(arrayList);
                observableEmitter.onComplete();
                break;
            case 13:
                observableEmitter.onNext(Integer.valueOf(((RequestContactDao) ((U9.g) this.f41179c).f9298d.f35518b).delete((RequestContact) this.f41178b)));
                observableEmitter.onComplete();
                break;
        }
    }

    public String toString() {
        switch (this.f41177a) {
            case 24:
                return "QualitySelector{preferredQualities=" + ((List) this.f41178b) + ", fallbackStrategy=" + ((C1015d) this.f41179c) + "}";
            case 27:
                String string = "[ ";
                if (((androidx.constraintlayout.core.g) this.f41178b) != null) {
                    for (int i7 = 0; i7 < 9; i7++) {
                        StringBuilder sbS = u.s(string);
                        sbS.append(((androidx.constraintlayout.core.g) this.f41178b).f15117i[i7]);
                        sbS.append(" ");
                        string = sbS.toString();
                    }
                }
                StringBuilder sbT = G.t(string, "] ");
                sbT.append((androidx.constraintlayout.core.g) this.f41178b);
                return sbT.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler$DurationScaleChangeListener
    public boolean unregister() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener((androidx.dynamicanimation.animation.b) this.f41178b);
        this.f41178b = null;
        return zUnregisterDurationScaleChangeListener;
    }

    public /* synthetic */ d(int i7, boolean z3) {
        this.f41177a = i7;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.f41177a) {
            case 3:
                if (th instanceof k0) {
                    p118hf.a.k(((m) this.f41179c).cancel(false), null);
                    return;
                } else {
                    p118hf.a.k(((androidx.concurrent.futures.k) this.f41178b).b(null), null);
                    return;
                }
            case 22:
                f.b();
                n nVar = (n) this.f41179c;
                t tVar = nVar.f13773a;
                if (((t) this.f41178b) == tVar) {
                    int i7 = tVar.f13797a;
                    f.G("CaptureNode");
                    androidx.camera.core.imagecapture.o oVar = nVar.f13778f;
                    if (oVar != null) {
                        oVar.f13780b = null;
                    }
                    nVar.f13773a = null;
                    return;
                }
                return;
            case 23:
                int i10 = ((androidx.camera.core.processing.m) this.f41178b).f14431f;
                if (i10 == 2 && (th instanceof CancellationException)) {
                    f.G("SurfaceProcessorNode");
                    return;
                } else {
                    p377z5.l.i(i10);
                    f.G("SurfaceProcessorNode");
                    return;
                }
            default:
                Objects.toString(th);
                f.G("Recorder");
                q qVar = (q) this.f41179c;
                int i11 = qVar.f14813e;
                if (i11 < qVar.f14811c) {
                    qVar.f14813e = i11 + 1;
                    W8.o oVar2 = new W8.o(this, 22);
                    qVar.f14814f = org.chromium.support_lib_boundary.util.b.S().schedule(new RunnableC0903g(23, qVar.f14815g.f14840d, oVar2), s.f14832L, TimeUnit.MILLISECONDS);
                    return;
                }
                s sVar = qVar.f14815g;
                synchronized (sVar.f14842f) {
                    try {
                        switch (sVar.f14844h.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                                sVar.i(-1);
                                sVar.h(r.f14823i);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + sVar.f14844h + ": " + th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i7) {
        this.f41177a = i7;
        this.f41179c = obj;
    }

    public /* synthetic */ d(Object obj, int i7, Object obj2, boolean z3) {
        this.f41177a = i7;
        this.f41179c = obj;
        this.f41178b = obj2;
    }

    public d(BottomNavigationView bottomNavigationView, ArrayList tabScreenFragments) {
        this.f41177a = 16;
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(tabScreenFragments, "tabScreenFragments");
        this.f41178b = bottomNavigationView;
        this.f41179c = tabScreenFragments;
    }

    public d(int i7) {
        this.f41177a = i7;
        switch (i7) {
            case 12:
                this.f41179c = new HashMap();
                break;
            default:
                this.f41178b = new AtomicReference();
                this.f41179c = new M.f(0);
                break;
        }
    }

    public d(String str, String str2) {
        this.f41177a = 19;
        HashMap map = new HashMap();
        this.f41179c = map;
        this.f41178b = new com.growingio.android.sdk.a(str, str2);
        map.put(Z4.a.class, new Z4.a(0));
        map.put(Z4.b.class, new Z4.b());
    }

    public d(ViewStub viewStub, View view) {
        View viewInflate;
        this.f41177a = 8;
        if (viewStub != null && (viewInflate = viewStub.inflate()) != null) {
            C0107d c0107dA = C0107d.a(viewInflate);
            this.f41178b = c0107dA;
            r0.R1((IconicsTextView) c0107dA.f682d, "fonts/PalmPayNum-Regular.ttf");
        }
        if (view != null) {
            this.f41178b = C0107d.a(view);
        }
        C0107d c0107d = (C0107d) this.f41178b;
        if (c0107d != null) {
            ((IconicsTextView) c0107d.f682d).setOnClickListener(new Ha.d(this, 14));
        }
    }

    public d(String sectionName, int i7) {
        this.f41177a = i7;
        switch (i7) {
            case 21:
                this.f41178b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ExtraSupportedOutputSizeQuirk.class);
                this.f41179c = new g(sectionName);
                break;
            default:
                Intrinsics.checkNotNullParameter(sectionName, "sectionName");
                this.f41178b = sectionName;
                this.f41179c = new ArrayList();
                break;
        }
    }

    public d(androidx.room.G database) {
        this.f41177a = 29;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f41178b = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f41179c = setNewSetFromMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.HashMap] */
    public d(CameraInfoInternal cameraInfoInternal, EncoderProfilesProvider encoderProfilesProvider, y0 y0Var) {
        Range<Integer> supportedBitrateRange;
        this.f41177a = 26;
        this.f41178b = encoderProfilesProvider;
        ArrayList arrayListC = y0Var.c(ExtraSupportedQualityQuirk.class);
        if (arrayListC.isEmpty()) {
            return;
        }
        ?? map = 0;
        VideoEncoderInfo videoEncoderInfoA = null;
        map = 0;
        map = 0;
        p118hf.a.k(arrayListC.size() == 1, null);
        ((ExtraSupportedQualityQuirk) arrayListC.get(0)).getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            if ("1".equals(cameraInfoInternal.getCameraId()) && !encoderProfilesProvider.hasProfile(4)) {
                EncoderProfilesProxy all = encoderProfilesProvider.getAll(1);
                C0977f c0977f = (all == null || all.getVideoProfiles().isEmpty()) ? null : all.getVideoProfiles().get(0);
                if (c0977f != null) {
                    try {
                        videoEncoderInfoA = androidx.camera.video.internal.workaround.b.a(A.l(androidx.camera.video.internal.config.b.d(c0977f)), null);
                    } catch (androidx.camera.video.internal.encoder.x unused) {
                        f.G("VideoEncoderInfoImpl");
                    }
                    if (videoEncoderInfoA != null) {
                        supportedBitrateRange = videoEncoderInfoA.getSupportedBitrateRange();
                    } else {
                        supportedBitrateRange = androidx.camera.video.j.f14783f;
                    }
                    Range<Integer> range = supportedBitrateRange;
                    Size size = androidx.camera.core.internal.utils.d.f14364d;
                    int i7 = c0977f.f14050c;
                    int width = size.getWidth();
                    int height = size.getHeight();
                    int i10 = c0977f.f14055h;
                    int i11 = c0977f.f14051d;
                    C0975e c0975eA = C0975e.a(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), Collections.singletonList(new C0977f(c0977f.f14048a, c0977f.f14049b, androidx.camera.video.internal.config.b.c(i7, i10, i10, i11, i11, width, c0977f.f14052e, height, c0977f.f14053f, range), c0977f.f14051d, size.getWidth(), size.getHeight(), c0977f.f14054g, c0977f.f14055h, c0977f.f14056i, c0977f.f14057j)));
                    map = new HashMap();
                    map.put(4, c0975eA);
                    Size size2 = new Size(c0977f.f14052e, c0977f.f14053f);
                    if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                        map.put(1, c0975eA);
                    }
                }
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != 0) {
            this.f41179c = new HashMap((Map) map);
        }
    }

    public d(F state, m future) {
        this.f41177a = 15;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        this.f41178b = state;
        this.f41179c = future;
    }

    public d(List list, C1015d c1015d) {
        this.f41177a = 24;
        p118hf.a.g((list.isEmpty() && c1015d == C1015d.f14587c) ? false : true, "No preferred quality and fallback strategy.");
        this.f41178b = Collections.unmodifiableList(new ArrayList(list));
        this.f41179c = c1015d;
    }

    public d(C0914s c0914s) {
        this.f41177a = 20;
        int i7 = Build.VERSION.SDK_INT;
        this.f41178b = i7 >= 29 ? AbstractC0913q.b(c0914s.f13089a) : null;
        this.f41179c = i7 <= 29 ? c0914s.getFingerprintManager() : null;
    }
}
