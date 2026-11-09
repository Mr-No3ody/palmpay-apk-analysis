package p039cb;

import C0.G;
import Ce.T;
import E.AbstractC0198c;
import J1.o;
import Pa.Y;
import Pg.k;
import Pg.m;
import Pg.u;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import androidx.graphics.shapes.PointTransformer;
import androidx.preference.g;
import com.airbnb.lottie.parser.moshi.a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.resource.bitmap.C1330b;
import com.bumptech.glide.load.resource.bitmap.C1331c;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.ValueDescriptor;
import com.facebook.imagepipeline.cache.f;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.Gson;
import com.growingio.android.circler.ThreadSafeTipView$OnExitListener;
import com.growingio.android.circler.d;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import com.nimbusds.jose.shaded.gson.InstanceCreator;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.dialog.MobileWalletGuideDialog;
import com.transsnet.palmpay.core.util.PayStringUtils$OperatorType;
import com.transsnet.palmpay.credit.bean.req.SignInstallmentWithdrawReq;
import com.transsnet.palmpay.credit.bean.resp.LoanPreCheck;
import com.transsnet.palmpay.credit.bean.resp.QueryWithDrawData;
import com.transsnet.palmpay.credit.bean.resp.QueryWithdrawPreCheckResp;
import com.transsnet.palmpay.credit.businessLoan.util.LocationServiceHelper$SimpleLocationCallback;
import com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialogListener;
import df.i;
import io.reactivex.internal.operators.observable.C1765q;
import io.reactivex.internal.operators.observable.K;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.h0;
import p071ef.b;
import p137j3.r;
import p137j3.s;
import p137j3.t;
import p198n5.h;
import retrofit2.C1990h;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import top.zibin.luban.io.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements LocationServiceHelper$SimpleLocationCallback, ResourceEncoder, ObjectConstructor, ValueDescriptor, Converter, PooledByteBufferFactory, AgentAutoRepaymentDialogListener, Callback, PointTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18902c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f18900a = i7;
        this.f18901b = obj;
        this.f18902c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006e, TryCatch #0 {IOException -> 0x006e, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static c d(String... strArr) {
        String str;
        try {
            m[] mVarArr = new m[strArr.length];
            k kVar = new k();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                String str2 = strArr[i7];
                String[] strArr2 = a.f20163e;
                kVar.m(34);
                int length = str2.length();
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = str2.charAt(i11);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i10 < i11) {
                                kVar.u(i10, i11, str2);
                            }
                            kVar.v(str);
                            i10 = i11 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i10 < i11) {
                            kVar.u(i10, i11, str2);
                        }
                        kVar.v(str);
                        i10 = i11 + 1;
                    }
                }
                if (i10 < length) {
                    kVar.u(i10, length, str2);
                }
                kVar.m(34);
                kVar.readByte();
                mVarArr[i7] = kVar.readByteString(kVar.f7358b);
            }
            return new c(1, (String[]) strArr.clone(), u.f7376d.of(mVarArr));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void h(ThreadSafeTipView$OnExitListener threadSafeTipView$OnExitListener) {
        Activity activityX = p279s5.a.f42018a.x();
        if (activityX == null) {
            h.c("ThreadSafeTipView", "showQuitedDialog: ForegroundActivity is NULL", new Object[0]);
        } else {
            new AlertDialog.Builder(activityX).setTitle(d.growing_circler_device_unconnected).setMessage(d.growing_circler_unconnected).setPositiveButton(d.growing_circler_exit, new g(threadSafeTipView$OnExitListener, 2)).setOnDismissListener(new T(threadSafeTipView$OnExitListener, 7)).setCancelable(false).create().show();
        }
    }

    public synchronized void a(org.greenrobot.eventbus.g gVar) {
        try {
            org.greenrobot.eventbus.g gVar2 = (org.greenrobot.eventbus.g) this.f18902c;
            if (gVar2 != null) {
                gVar2.f41083c = gVar;
                this.f18902c = gVar;
            } else {
                if (((org.greenrobot.eventbus.g) this.f18901b) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f18902c = gVar;
                this.f18901b = gVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public String b(Key key) {
        String str;
        synchronized (((J1.k) this.f18901b)) {
            str = (String) ((J1.k) this.f18901b).a(key);
        }
        if (str == null) {
            Object objAcquire = ((top.zibin.luban.io.a) this.f18902c).acquire();
            J1.g.c(objAcquire, "Argument must not be null");
            j jVar = (j) objAcquire;
            try {
                key.updateDiskCacheKey(jVar.f20638a);
                byte[] bArrDigest = jVar.f20638a.digest();
                char[] cArr = o.f4479b;
                synchronized (cArr) {
                    for (int i7 = 0; i7 < bArrDigest.length; i7++) {
                        byte b7 = bArrDigest[i7];
                        int i10 = i7 * 2;
                        int i11 = (b7 & UnsignedBytes.MAX_VALUE) >>> 4;
                        char[] cArr2 = o.f4478a;
                        cArr[i10] = cArr2[i11];
                        cArr[i10 + 1] = cArr2[b7 & Ascii.SI];
                    }
                    str = new String(cArr);
                }
                ((top.zibin.luban.io.a) this.f18902c).release(jVar);
            } catch (Throwable th) {
                ((top.zibin.luban.io.a) this.f18902c).release(jVar);
                throw th;
            }
        }
        synchronized (((J1.k) this.f18901b)) {
            ((J1.k) this.f18901b).d(key, str);
        }
        return str;
    }

    public void c() {
        if (((TipView) this.f18901b) == null) {
            TipView tipView = new TipView((Context) this.f18902c);
            this.f18901b = tipView;
            tipView.setContent(d.growing_circler_connecting_to_web);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return ((InstanceCreator) this.f18901b).createInstance((Type) this.f18902c);
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) throws IOException {
        h0 h0Var = (h0) obj;
        if (h0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strString = h0Var.string();
        if (TextUtils.isEmpty(strString)) {
            throw new IOException("response is null");
        }
        if (!TextUtils.isEmpty(strString) && StringsKt.A(strString, CommonResult.CODE_OTHER_DEVICE_ONLINE, false)) {
            strString = "{\"respCode\":\"CFRONT_000009\",\"respMsg\":\"\"}";
        }
        return ((Gson) this.f18901b).fromJson(strString, (Type) this.f18902c);
    }

    public synchronized org.greenrobot.eventbus.g e() {
        org.greenrobot.eventbus.g gVar;
        gVar = (org.greenrobot.eventbus.g) this.f18901b;
        if (gVar != null) {
            org.greenrobot.eventbus.g gVar2 = gVar.f41083c;
            this.f18901b = gVar2;
            if (gVar2 == null) {
                this.f18902c = null;
            }
        }
        return gVar;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Object obj, File file, com.bumptech.glide.load.h hVar) {
        return ((C1330b) this.f18902c).encode(new C1331c((BitmapPool) this.f18901b, ((BitmapDrawable) ((Resource) obj).get()).getBitmap()), file, hVar);
    }

    public void f(e eVar, Object obj) {
        HashMap map = (HashMap) this.f18902c;
        top.zibin.luban.io.d dVar = (top.zibin.luban.io.d) map.get(eVar);
        if (dVar == null) {
            dVar = new top.zibin.luban.io.d(eVar);
            dVar.f42657d = dVar;
            top.zibin.luban.io.d dVar2 = (top.zibin.luban.io.d) this.f18901b;
            dVar.f42657d = dVar2.f42657d;
            dVar.f42656c = dVar2;
            dVar2.f42657d = dVar;
            dVar.f42657d.f42656c = dVar;
            map.put(eVar, dVar);
        } else {
            eVar.offer();
        }
        if (dVar.f42655b == null) {
            dVar.f42655b = new ArrayList();
        }
        dVar.f42655b.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    public void g() {
        byte b7;
        String string;
        String string2;
        int i7 = p025ba.g.core_mobile_wallet_guide_dialog;
        Context context = (Context) this.f18901b;
        MobileWalletGuideDialog mobileWalletGuideDialog = new MobileWalletGuideDialog(context, i7);
        mobileWalletGuideDialog.setTitle(context.getString(PayStringUtils$OperatorType.VODAFONE.equals((String) this.f18902c) ? p025ba.k.core_create_voucher_guide_title : p025ba.k.core_ussd_guide_title));
        String str = (String) this.f18902c;
        byte b10 = -1;
        if (TextUtils.isEmpty(str)) {
            string = context.getString(p025ba.k.core_mobile_wallet_name_airteltigo);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1334844874) {
                if (iHashCode != 76679) {
                    if (iHashCode == 2574877 && str.equals(PayStringUtils$OperatorType.AIRTELTIGO)) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                } else if (str.equals(PayStringUtils$OperatorType.MTN)) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (str.equals(PayStringUtils$OperatorType.VODAFONE)) {
                b7 = 0;
            } else {
                b7 = -1;
            }
            if (b7 != 0) {
                string = b7 != 1 ? context.getString(p025ba.k.core_mobile_wallet_name_airteltigo) : context.getString(p025ba.k.core_mobile_wallet_name_mtn);
            } else {
                string = context.getString(p025ba.k.core_mobile_wallet_name_vodafone);
            }
        }
        mobileWalletGuideDialog.setMobileWalletName(string);
        String str2 = (String) this.f18902c;
        if (TextUtils.isEmpty(str2)) {
            string2 = context.getString(p025ba.k.core_airteltigo_guide_msg);
        } else {
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1334844874) {
                if (iHashCode2 != 76679) {
                    if (iHashCode2 == 2574877 && str2.equals(PayStringUtils$OperatorType.AIRTELTIGO)) {
                        b10 = 2;
                    }
                } else if (str2.equals(PayStringUtils$OperatorType.MTN)) {
                    b10 = 1;
                }
            } else if (str2.equals(PayStringUtils$OperatorType.VODAFONE)) {
                b10 = 0;
            }
            if (b10 != 0) {
                string2 = b10 != 1 ? context.getString(p025ba.k.core_airteltigo_guide_msg) : context.getString(p025ba.k.core_mtn_guide_msg);
            } else {
                string2 = context.getString(p025ba.k.core_vodafone_guide_msg);
            }
        }
        mobileWalletGuideDialog.setMessage(string2);
        mobileWalletGuideDialog.show();
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public com.bumptech.glide.load.c getEncodeStrategy(com.bumptech.glide.load.h hVar) {
        return com.bumptech.glide.load.c.f20519b;
    }

    @Override // com.facebook.imagepipeline.cache.ValueDescriptor
    public int getSizeInBytes(Object obj) {
        com.facebook.imagepipeline.cache.d dVar = (com.facebook.imagepipeline.cache.d) obj;
        if (((f) this.f18902c).f21418o) {
            return dVar.f21408f;
        }
        return ((ValueDescriptor) this.f18901b).getSizeInBytes(dVar.f21404b.f());
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public PooledByteBuffer newByteBuffer(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        r rVar = (r) this.f18901b;
        t outputStream = new t(rVar, rVar.f38249o[0]);
        try {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            ((p262r2.g) this.f18902c).a(inputStream, outputStream);
            return outputStream.a();
        } finally {
            outputStream.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public p262r2.f newOutputStream() {
        r rVar = (r) this.f18901b;
        return new t(rVar, rVar.f38249o[0]);
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialogListener
    public void onConfirm() {
        LoanPreCheck loanPreCheck;
        int i7 = 1;
        QueryWithDrawData data = ((QueryWithdrawPreCheckResp) this.f18902c).getData();
        Boolean needRoute = (data == null || (loanPreCheck = data.getLoanPreCheck()) == null) ? null : loanPreCheck.getNeedRoute();
        p143jb.j jVar = p143jb.o.f38542z;
        p143jb.o oVar = (p143jb.o) this.f18901b;
        F6.d.h("CreditRouterManager", 3, "signInstallmentLoanProtocol >>>");
        df.d<CommonResult> dVarSignInstallmentLoanWithdrawPreCheck = G.h(p221ob.c.f40268a).signInstallmentLoanWithdrawPreCheck(new SignInstallmentWithdrawReq(1));
        dVarSignInstallmentLoanWithdrawPreCheck.getClass();
        i iVar = p298tf.f.f42629b;
        C1765q c1765qI = new K(dVarSignInstallmentLoanWithdrawPreCheck.k(iVar), iVar, i7).i(b.a());
        WeakReference weakReference = oVar.f38544b;
        if (weakReference != null) {
            c1765qI.c(new Y(new WeakReference((BaseFragment) weakReference.get()), 0)).subscribe(new N8.r(9, oVar, needRoute));
        } else {
            Intrinsics.n("mLoanCreditFragmentRef");
            throw null;
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        C1990h c1990h = (C1990h) this.f18902c;
        c1990h.f41929a.execute(new androidx.emoji2.text.j(this, 27, (Callback) this.f18901b, th));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.util.LocationServiceHelper$SimpleLocationCallback
    public void onLocationDenied() {
        F6.d.h("LocationServiceManager", 3, "requestLocationPermission - Location permission denied");
        ((p1.c) this.f18902c).onPermissionDenied(AbstractC0198c.A((Activity) this.f18901b));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.util.LocationServiceHelper$SimpleLocationCallback
    public void onLocationReady() {
        F6.d.h("LocationServiceManager", 3, "requestLocationPermission - Location permission granted");
        ((p1.c) this.f18902c).onLocationReady(AbstractC0198c.A((Activity) this.f18901b));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, retrofit2.K k2) {
        C1990h c1990h = (C1990h) this.f18902c;
        c1990h.f41929a.execute(new androidx.emoji2.text.j(this, 26, (Callback) this.f18901b, k2));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.util.LocationServiceHelper$SimpleLocationCallback
    public void onUserCancelled() {
        F6.d.h("LocationServiceManager", 3, "requestLocationPermission - User cancelled permission request");
        ((p1.c) this.f18902c).onPermissionDenied(AbstractC0198c.A((Activity) this.f18901b));
    }

    public String toString() {
        switch (this.f18900a) {
            case 17:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                top.zibin.luban.io.d dVar = (top.zibin.luban.io.d) this.f18901b;
                top.zibin.luban.io.d dVar2 = dVar.f42656c;
                boolean z3 = false;
                while (!dVar2.equals(dVar)) {
                    sb2.append('{');
                    sb2.append(dVar2.f42654a);
                    sb2.append(':');
                    ArrayList arrayList = dVar2.f42655b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    dVar2 = dVar2.f42656c;
                    z3 = true;
                }
                if (z3) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.graphics.shapes.PointTransformer
    /* JADX INFO: renamed from: transform-XgqJiTY */
    public long mo72transformXgqJiTY(float f10, float f11) {
        float[] fArr = (float[]) this.f18901b;
        fArr[0] = f10;
        fArr[1] = f11;
        ((Matrix) this.f18902c).mapPoints(fArr);
        return M.h.a(fArr[0], fArr[1]);
    }

    public /* synthetic */ c(int i7, boolean z3) {
        this.f18900a = i7;
    }

    public /* synthetic */ c(Object obj, int i7, Object obj2, boolean z3) {
        this.f18900a = i7;
        this.f18902c = obj;
        this.f18901b = obj2;
    }

    public c(String str) {
        this.f18900a = 13;
        this.f18901b = null;
        this.f18902c = null;
        try {
            byte[] bytes = str.getBytes();
            byte[] bArr = new byte[8];
            for (int i7 = 0; i7 < bytes.length && i7 < 8; i7++) {
                bArr[i7] = bytes[i7];
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DES");
            Cipher cipher = Cipher.getInstance("DES");
            this.f18901b = cipher;
            cipher.init(1, secretKeySpec);
            Cipher cipher2 = Cipher.getInstance("DES");
            this.f18902c = cipher2;
            cipher2.init(2, secretKeySpec);
        } catch (Exception e10) {
            G8.a.c(e10);
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public p262r2.f newOutputStream(int i7) {
        return new t((r) this.f18901b, i7);
    }

    public c(Gson gson, Type type) {
        this.f18900a = 8;
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f18901b = gson;
        this.f18902c = type;
    }

    public c(int i7) {
        this.f18900a = i7;
        switch (i7) {
            case 17:
                this.f18901b = new top.zibin.luban.io.d(null);
                this.f18902c = new HashMap();
                break;
            case 18:
                this.f18901b = new p379z7.e(0);
                this.f18902c = new ArrayList();
                break;
            default:
                this.f18901b = new J1.k(1000L);
                this.f18902c = K1.a.a(10, new org.sufficientlysecure.htmltextview.m(4));
                break;
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public PooledByteBuffer newByteBuffer(InputStream inputStream, int i7) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        t outputStream = new t((r) this.f18901b, i7);
        try {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            ((p262r2.g) this.f18902c).a(inputStream, outputStream);
            return outputStream.a();
        } finally {
            outputStream.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public PooledByteBuffer newByteBuffer(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        t tVar = new t((r) this.f18901b, bytes.length);
        try {
            try {
                tVar.write(bytes, 0, bytes.length);
                s sVarA = tVar.a();
                tVar.close();
                return sVarA;
            } catch (IOException e10) {
                p213o2.e.j(e10);
                throw null;
            }
        } catch (Throwable th) {
            tVar.close();
            throw th;
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public PooledByteBuffer newByteBuffer(int i7) {
        if (i7 > 0) {
            r rVar = (r) this.f18901b;
            com.facebook.common.references.b bVarJ = CloseableReference.j(rVar.get(i7), rVar, CloseableReference.f21217f);
            Intrinsics.checkNotNullExpressionValue(bVarJ, "of(...)");
            try {
                return new s(bVarJ, i7);
            } finally {
                bVarJ.close();
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public c(r pool, p262r2.g pooledByteStreams) {
        this.f18900a = 9;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f18901b = pool;
        this.f18902c = pooledByteStreams;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialogListener
    public void onCancel() {
    }

    public c(Context context, int i7) {
        this.f18900a = i7;
        switch (i7) {
            case 12:
                this.f18901b = context;
                break;
            default:
                this.f18902c = context;
                p291t5.b.e(new com.growingio.android.circler.e(this, 1));
                break;
        }
    }
}
