package p1;

import C0.G;
import M1.j;
import N8.q0;
import Pa.F;
import Pa.T;
import Pa.Z;
import Pa.g0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import U9.g;
import W9.D;
import Wf.C0765i;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import com.airbnb.lottie.C1311c;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.load.ResourceEncoder;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.i;
import com.facebook.imagepipeline.producers.AbstractC1338c;
import com.facebook.imagepipeline.producers.JobScheduler$JobRunnable;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.p;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.activity.ResetPinActivity;
import com.transsnet.palmpay.airtime.bean.AirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQBean;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.adapter.AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpGuideFragment;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.contacts.contract.RequestContactListContract$IView;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback;
import com.transsnet.palmpay.credit.businessLoan.rnbridge.LocationServiceBridge;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLReceiveAccountDialog;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.h0;
import p016b.b$a;
import p134j.e;
import p137j3.t;
import p220oa.h;
import p262r2.f;
import p310ub.C2085k0;
import p355xf.o;
import p355xf.q;
import retrofit2.Converter;
import top.zibin.luban.io.PoolAble;

/* JADX INFO: loaded from: classes.dex */
public final class c implements OnRvItemClickListener, IBridgeCallback, OnSendCodeListener, Consumer, LiveID$ILiveIDListener, CallbackToFutureAdapter$Resolver, JobScheduler$JobRunnable, ObjectConstructor, LocationServiceManager$LocationServiceCallback, OnCompleteListener, AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener, OnItemClickListener, Argument2Callback, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f41176b;

    public /* synthetic */ c(int i7, boolean z3) {
        this.f41175a = i7;
    }

    public static String c(String str, b bVar, boolean z3) {
        String strConcat = bVar.f41174a;
        if (z3) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b7 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b7)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return q0.k("lottie_cache_", strReplaceAll, strConcat);
    }

    public void a(e eVar) {
        new Handler(Looper.getMainLooper()).post(new Y0.a((b$a) this.f41176b, eVar, 0));
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.f41175a) {
            case 6:
                T.b(-4).execute(new Z(obj, (String) ((C2085k0) this.f41176b).f42878b, 0));
                break;
            case 9:
                List<RequestContact> list = (List) obj;
                IBaseView iBaseView = ((g) this.f41176b).f27351a;
                if (iBaseView != null) {
                    ((RequestContactListContract$IView) iBaseView).showRequestContactsList(list);
                }
                break;
            default:
                D d2 = ((PalmPayContactsSearchActivity) this.f41176b).f27242d;
                d2.f4985b = (List) obj;
                d2.notifyDataSetChanged();
                break;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(k kVar) {
        androidx.camera.core.impl.utils.futures.b bVar = (androidx.camera.core.impl.utils.futures.b) this.f41176b;
        p118hf.a.k(bVar.f14194b == null, "The result can only set once!");
        bVar.f14194b = kVar;
        return "FutureChain[" + bVar + "]";
    }

    public void b(e eVar) {
        new Handler(Looper.getMainLooper()).post(new Y0.a((b$a) this.f41176b, eVar, 1));
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        Type type = (Type) this.f41176b;
        if (!(type instanceof ParameterizedType)) {
            throw new p("Invalid EnumSet type: " + type.toString(), 10, false);
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new p("Invalid EnumSet type: " + type.toString(), 10, false);
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        return Optional.ofNullable(((Converter) this.f41176b).convert((h0) obj));
    }

    public synchronized ResourceEncoder d(Class cls) {
        int size = ((ArrayList) this.f41176b).size();
        for (int i7 = 0; i7 < size; i7++) {
            F1.g gVar = (F1.g) ((ArrayList) this.f41176b).get(i7);
            if (gVar.f2527a.isAssignableFrom(cls)) {
                return gVar.f2528b;
            }
        }
        return null;
    }

    public top.zibin.luban.io.e e(int i7, Class cls) {
        Object eVar = (PoolAble) ((ArrayDeque) this.f41176b).poll();
        if (eVar == null) {
            eVar = new top.zibin.luban.io.e(this);
        }
        top.zibin.luban.io.e eVar2 = (top.zibin.luban.io.e) eVar;
        eVar2.f42659b = i7;
        eVar2.f42660c = cls;
        return eVar2;
    }

    public File f(String str) {
        File file = new File(g(), c(str, b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(g(), c(str, b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(g(), c(str, b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public File g() {
        File cacheDir = ((C1311c) this.f41176b).getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    public File h(String str, InputStream inputStream, b bVar) throws IOException {
        File file = new File(g(), c(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i7);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        if (((Number) obj).intValue() == -1) {
            try {
                n.J(intent);
                n.N(true);
                ((EnableTouchIdDialog) this.f41176b).animateSuccess();
            } catch (Exception unused) {
                Z4.c cVar = n0.f7107i;
            }
        }
    }

    @Override // com.transsnet.palmpay.airtime.ui.adapter.AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener
    public void onAutoRenewItemClick(int i7, AirtimeSpecialRechargeItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (r0.U0()) {
            return;
        }
        ActivityUtils.startActivity(F.a((TopupAirtimeActivity) this.f41176b, item.getJumpUrl()));
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onButtonVisibilityChange(View view, int i7) {
        Bc.k kVar;
        TextView textView;
        if (i7 != 0 || BaseApplication.hasLogin() || (kVar = ((ResetPinActivity) this.f41176b).f25975j) == null || (textView = (TextView) kVar.f751e) == null) {
            return;
        }
        h.s(textView, true);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        C0765i c0765i = (C0765i) this.f41176b;
        if (exception != null) {
            o oVar = q.f43977a;
            c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(exception));
        } else if (task.isCanceled()) {
            c0765i.cancel(null);
        } else {
            o oVar2 = q.f43977a;
            c0765i.resumeWith(task.getResult());
        }
    }

    @Override // com.palmpay.lib.liveness.LiveID$ILiveIDListener
    public void onCompleted(CheckResponse response, String str) {
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zIsEmpty = TextUtils.isEmpty(response.getData().getToken());
        g0 g0Var = (g0) this.f41176b;
        if (!zIsEmpty) {
            ALiFaceCheckResultData aLiFaceCheckResultData = new ALiFaceCheckResultData(response.getData().getS3Url(), response.getData().getToken(), response.getData().getSimilarity(), response.getRespMsg());
            ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack = g0Var.f7083b;
            if (scanFaceLogicUtil$IScanFaceResultCallBack != null) {
                scanFaceLogicUtil$IScanFaceResultCallBack.onSuccess(aLiFaceCheckResultData);
            }
            g0Var.c(scanFaceLogicUtil$IScanFaceResultCallBack);
            return;
        }
        String respCode = response.getRespCode();
        String respMsg = response.getRespMsg();
        ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack2 = g0Var.f7083b;
        if (scanFaceLogicUtil$IScanFaceResultCallBack2 != null) {
            scanFaceLogicUtil$IScanFaceResultCallBack2.onFailed(respCode, respMsg, null);
        }
        g0Var.c(scanFaceLogicUtil$IScanFaceResultCallBack2);
    }

    @Override // com.transsnet.palmpay.airtime.ui.adapter.AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener
    public void onCustomJumpItemClick(int i7, AirtimeSpecialRechargeItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (r0.U0()) {
            return;
        }
        ActivityUtils.startActivity(F.a((TopupAirtimeActivity) this.f41176b, item.getJumpUrl()));
    }

    @Override // com.transsnet.palmpay.airtime.ui.adapter.AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener
    public void onCustomPackageItemClick(int i7, AirtimeSpecialRechargeItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
            return;
        }
        int i10 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.f41176b;
        topupAirtimeActivity.C();
        if (topupAirtimeActivity.v()) {
            return;
        }
        Long price = item.getPrice();
        topupAirtimeActivity.f26502Q = price != null ? price.longValue() : 0L;
        if (r0.U0()) {
            return;
        }
        TopupAirtimeActivity.G(topupAirtimeActivity, 0, item.getItemId(), 1);
        n0.g().k(((ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Fund Area-Top up")).add("element_name", String.valueOf(topupAirtimeActivity.f26502Q)));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onError(String error, Exception exc) {
        Intrinsics.checkNotNullParameter(error, "error");
        F6.d.c(LocationServiceBridge.TAG, "Error checking location permission: " + error, exc);
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41176b;
        locationServiceBridge.handleSuccess(LocationServiceBridge.createFailureResult$default(locationServiceBridge, LocationServiceBridge.ACTION_TRIGGER_CHECK, "Error checking location permission: " + error, error, null, 8, null));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onGpsDisabled(p039cb.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Map mapG = kotlin.collections.G.g(new Pair("status", "GPS_DISABLED"), new Pair("permissionStatus", status.a()));
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41176b;
        locationServiceBridge.handleSuccess(LocationServiceBridge.createFailureResult$default(locationServiceBridge, LocationServiceBridge.ACTION_TRIGGER_CHECK, "GPS is disabled", null, mapG, 4, null));
    }

    @Override // com.palmpay.lib.liveness.LiveID$ILiveIDListener
    public void onInterrupted(String str, String str2, String str3) {
        F6.d.c("Face", G.p("initAliParams: ", str, " ", str2));
        g0 g0Var = (g0) this.f41176b;
        ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack = g0Var.f7083b;
        if (scanFaceLogicUtil$IScanFaceResultCallBack != null) {
            scanFaceLogicUtil$IScanFaceResultCallBack.onFailed(str, str2, str3);
        }
        g0Var.c(scanFaceLogicUtil$IScanFaceResultCallBack);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTopUpGuideFragment scheduleTopUpGuideFragment = (ScheduleTopUpGuideFragment) this.f41176b;
        ActivityUtils.startActivity(F.a(scheduleTopUpGuideFragment.requireContext(), ((ScheduleTopUpFAQBean) scheduleTopUpGuideFragment.u().getItem(i7)).getUrl()));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onLocationNotReady(p039cb.b status, String reason) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Map mapG = kotlin.collections.G.g(new Pair("status", "LOCATION_NOT_READY"), new Pair("reason", reason), new Pair("permissionStatus", status.a()));
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41176b;
        locationServiceBridge.handleSuccess(LocationServiceBridge.createFailureResult$default(locationServiceBridge, LocationServiceBridge.ACTION_TRIGGER_CHECK, "Location service is not ready: " + reason, null, mapG, 4, null));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onLocationReady(p039cb.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Map mapG = kotlin.collections.G.g(new Pair("status", "LOCATION_READY"), new Pair("permissionStatus", status.a()));
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41176b;
        locationServiceBridge.handleSuccess(locationServiceBridge.createSuccessResult(LocationServiceBridge.ACTION_TRIGGER_CHECK, "Location service is ready", mapG));
    }

    @Override // com.transsnet.palmpay.airtime.ui.adapter.AirtimeRechargeAmountAdapter$OnRechargeAmountItemClickListener
    public void onNormalItemClick(int i7, AirtimeItemsBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
            return;
        }
        int i10 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.f41176b;
        topupAirtimeActivity.C();
        if (topupAirtimeActivity.v()) {
            return;
        }
        Long price = item.getPrice();
        topupAirtimeActivity.f26502Q = price != null ? price.longValue() : 0L;
        if (r0.U0()) {
            return;
        }
        if (Intrinsics.c(item.getSuspend(), Boolean.TRUE)) {
            topupAirtimeActivity.F(3, item.getItemId());
            return;
        }
        TopupAirtimeActivity.G(topupAirtimeActivity, 0, item.getItemId(), 1);
        n0.g().k(((ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Fund Area-Top up")).add("element_name", String.valueOf(topupAirtimeActivity.f26502Q)));
        n0.g().l("Airtime_click_amount");
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onPermissionDenied(p039cb.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Map mapG = kotlin.collections.G.g(new Pair("status", "PERMISSION_DENIED"), new Pair("permissionStatus", status.a()));
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41176b;
        locationServiceBridge.handleSuccess(LocationServiceBridge.createFailureResult$default(locationServiceBridge, LocationServiceBridge.ACTION_TRIGGER_CHECK, "Location permission denied", null, mapG, 4, null));
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        ResetPinActivity resetPinActivity = (ResetPinActivity) this.f41176b;
        resetPinActivity.f25970d = i10;
        resetPinActivity.f25974i = i7;
        if (i7 == 4 && !TextUtils.isEmpty(str)) {
            Intrinsics.e(str);
            resetPinActivity.m(str);
            return;
        }
        String strD0 = r0.D0(resetPinActivity.p());
        if (resetPinActivity.f25974i == 3) {
            strD0 = i0.R(resetPinActivity.o());
        }
        String string = resetPinActivity.getString(F8.h.ac_msg_sms_will_sent, strD0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Bc.k kVar = resetPinActivity.f25975j;
        if (kVar != null) {
            ((TextView) kVar.f749c).setText(string);
        }
        SmsActionReq smsActionReq = new SmsActionReq();
        GetSecurityFlowRsp getSecurityFlowRsp = resetPinActivity.f25973g;
        smsActionReq.businessType = (getSecurityFlowRsp == null || getSecurityFlowRsp.action != 14) ? 1 : 3;
        smsActionReq.phoneNo = resetPinActivity.p();
        smsActionReq.voiceSms = i7;
        smsActionReq.codeCount = 4;
        smsActionReq.email = resetPinActivity.o();
        p051d9.D d2 = (p051d9.D) resetPinActivity.f27350a;
        if (d2 != null) {
            d2.sendSms(smsActionReq);
        }
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onUserChooseNotToEnableGps() {
        ((LocationServiceBridge) this.f41176b).handleSuccess(LocationServiceBridge.createFailureResult$default((LocationServiceBridge) this.f41176b, LocationServiceBridge.ACTION_TRIGGER_CHECK, "User chose not to enable GPS", null, com.airbnb.lottie.model.layer.d.q("status", "USER_CHOOSE_NOT_ENABLE_GPS"), 4, null));
    }

    @Override // com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback
    public void onUserChooseToEnableGps() {
        Map mapB = kotlin.collections.F.b(new Pair("status", "USER_CHOOSE_ENABLE_GPS"));
        LocationServiceBridge locationServiceBridge = (LocationServiceBridge) this.f41176b;
        locationServiceBridge.handleSuccess(locationServiceBridge.createSuccessResult(LocationServiceBridge.ACTION_TRIGGER_CHECK, "User chose to enable GPS", mapB));
    }

    @Override // com.palmpay.lib.bridge.IBridgeCallback
    public void resolved(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ((Promise) this.f41176b).resolve(result);
    }

    @Override // com.facebook.imagepipeline.producers.JobScheduler$JobRunnable
    public void run(p109h3.e eVar, int i7) throws Throwable {
        int i10 = i7;
        com.facebook.imagepipeline.producers.g0 g0Var = (com.facebook.imagepipeline.producers.g0) this.f41176b;
        com.facebook.imagepipeline.producers.Consumer consumer = g0Var.f21631b;
        if (eVar == null) {
            consumer.onNewResult(null, i10);
            return;
        }
        eVar.k();
        ImageTranscoder imageTranscoderCreateImageTranscoder = g0Var.f21565d.createImageTranscoder(eVar.f37275b, g0Var.f21564c);
        ProducerContext producerContext = g0Var.f21566e;
        producerContext.getProducerListener().onProducerStart(producerContext, "ResizeAndRotateProducer");
        com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
        f fVarNewOutputStream = g0Var.f21569h.f21571b.newOutputStream();
        try {
            try {
                i rotationOptions = imageRequest.getRotationOptions();
                com.facebook.imagepipeline.common.g resizeOptions = imageRequest.getResizeOptions();
                eVar.k();
                p196n3.a aVarTranscode = imageTranscoderCreateImageTranscoder.transcode(eVar, fVarNewOutputStream, rotationOptions, resizeOptions, null, 85, eVar.f37283o);
                if (aVarTranscode.f39822a == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                p213o2.d dVarI = g0Var.i(eVar, imageRequest.getResizeOptions(), aVarTranscode, imageTranscoderCreateImageTranscoder.getIdentifier());
                com.facebook.common.references.b bVarI = CloseableReference.i(((t) fVarNewOutputStream).a());
                try {
                    p109h3.e eVar2 = new p109h3.e(bVarI);
                    eVar2.f37275b = W2.c.f10530a;
                    try {
                        eVar2.g();
                        producerContext.getProducerListener().onProducerFinishWithSuccess(producerContext, "ResizeAndRotateProducer", dVarI);
                        if (aVarTranscode.f39822a != 1) {
                            i10 |= 16;
                        }
                        consumer.onNewResult(eVar2, i10);
                        eVar2.close();
                        bVarI.close();
                        fVarNewOutputStream.close();
                    } catch (Throwable th) {
                        eVar2.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    CloseableReference.d(bVarI);
                    throw th2;
                }
            } catch (Exception e10) {
                producerContext.getProducerListener().onProducerFinishWithFailure(producerContext, "ResizeAndRotateProducer", e10, null);
                if (AbstractC1338c.a(i10)) {
                    consumer.onFailure(e10);
                }
                fVarNewOutputStream.close();
            }
        } catch (Throwable th3) {
            fVarNewOutputStream.close();
            throw th3;
        }
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.f41175a = i7;
        this.f41176b = obj;
    }

    public c(int i7) {
        this.f41175a = i7;
        switch (i7) {
            case 12:
                this.f41176b = (ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            case 28:
                this.f41176b = new ArrayDeque(20);
                break;
            default:
                this.f41176b = new ArrayList();
                break;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        Integer operationType;
        Integer operationType2;
        Integer operationType3;
        Integer operationType4;
        Integer operationType5;
        Integer operationType6;
        int i10 = this.f41175a;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        switch (i10) {
            case 1:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) this.f41176b;
                cLInstallmentBorrowFragment.f30581y1 = i7;
                cLInstallmentBorrowFragment.f30564q1 = (CLRepaymentPlanData) cLInstallmentBorrowFragment.f30583z1.get(i7);
                int i11 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.p0();
                return;
            case 20:
                CLReceiveAccountDialog cLReceiveAccountDialog = (CLReceiveAccountDialog) this.f41176b;
                OnRvItemClickListener onRvItemClickListener = cLReceiveAccountDialog.mSelectedListener;
                if (onRvItemClickListener != null) {
                    onRvItemClickListener.onItemClick(itemView, i7);
                }
                cLReceiveAccountDialog.dismiss();
                return;
            default:
                ArrayList arrayList = ((OcBillDetailActivity) this.f41176b).f29353o;
                if (arrayList != null) {
                    Object obj = arrayList.get(i7);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) obj;
                    Integer operationType7 = ocRepaidListDetail.getOperationType();
                    if ((operationType7 != null && operationType7.intValue() == 12) || (((operationType = ocRepaidListDetail.getOperationType()) != null && operationType.intValue() == 13) || (((operationType2 = ocRepaidListDetail.getOperationType()) != null && operationType2.intValue() == 14) || (((operationType3 = ocRepaidListDetail.getOperationType()) != null && operationType3.intValue() == 2) || (((operationType4 = ocRepaidListDetail.getOperationType()) != null && operationType4.intValue() == 4) || (((operationType5 = ocRepaidListDetail.getOperationType()) != null && operationType5.intValue() == 12) || ((operationType6 = ocRepaidListDetail.getOperationType()) != null && operationType6.intValue() == 17))))))) {
                        ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD).withString("orderNo", ocRepaidListDetail.getPayId()).navigation();
                        return;
                    }
                    return;
                }
                Intrinsics.n("mData");
                throw null;
        }
    }

    public c(EditText editText) {
        this.f41175a = 25;
        this.f41176b = new androidx.work.impl.model.b(editText);
    }
}
