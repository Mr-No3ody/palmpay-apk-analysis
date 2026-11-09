package p184m8;

import C0.G;
import Kf.c;
import N8.q0;
import Pa.i0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapsSdkInitializedCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.GsonBuilder;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnPreviewInterceptListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.UploadImageInfo;
import com.palmpay.lib.liveness.model.UploadRequest;
import com.palmpay.lib.liveness.model.UploadRequestV2;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.reactnativecommunity.webview.RNCWebViewConfig;
import com.rnmaps.maps.MapModule;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.AdRetrofitClient;
import com.transsnet.adsdk.interfaces.IDataUpdateListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import com.transsnet.adsdk.widgets.splash.SplashAdView;
import com.transsnet.analysis.data.network.AnalysisRetrofitClient;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.ui.activity.MonoConnectActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRecordActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.interfac.OnCopyListener;
import com.transsnet.palmpay.jara_packet.bean.resp.Comment;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import com.transsnet.palmpay.jara_packet.ui.model.comments.ReferEarnCommentsView;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.dialog.RefundInAdvanceDialog;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.collections.r;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.y;
import mono.connect.kit.ConnectEventCallback;
import okhttp3.L;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import p140j8.f;
import p232p6.p;
import p236pc.d;
import p252qa.a;
import p265r7.k;
import p320v6.e;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements HttpLoggingInterceptor$Logger, Function, OnFailureListener, IRemoteDataListener, IDataUpdateListener, Consumer, RNCWebViewConfig, OnCopyListener, RefundInAdvanceDialog.Listener, ConnectEventCallback, BaseRecyclerViewAdapter$ItemViewOnClickListener, TabLayoutMediator.TabConfigurationStrategy, OnQueryFilterListener, OnPreviewInterceptListener, Converter, OnMapsSdkInitializedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39550a;

    public /* synthetic */ b(int i7) {
        this.f39550a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        int i7;
        Comment comment = (Comment) obj;
        switch (this.f39550a) {
            case 12:
                int i10 = ReferEarnCommentListActivity.f31856i;
                int id2 = view.getId();
                if (id2 == d.ivPic1) {
                    i7 = 0;
                } else if (id2 == d.ivPic2) {
                    i7 = 1;
                } else if (id2 == d.ivPic3) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                if (comment != null) {
                    int size = comment.pictureList.size();
                    ArrayList<String> arrayList = new ArrayList<>(size);
                    ArrayList<String> arrayList2 = new ArrayList<>(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList.add(comment.pictureList.get(i11));
                        arrayList2.add("");
                    }
                    ARouter.getInstance().build("/mall/grab_photo_activity").withInt("extra_data", i7).withStringArrayList("extra_data_1", arrayList).withStringArrayList("extra_data_2", arrayList2).navigation();
                }
                break;
            default:
                int i12 = ReferEarnCommentsView.f31984e;
                G.z("/refer_earn/comment_list", "extra_data", "ReferEarn", "extra_data_2", "");
                break;
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        SplashAdView.lambda$initAdData$8((Boolean) obj);
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object item) {
        switch (this.f39550a) {
            case 2:
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof CommonResult) {
                    CommonResult commonResult = (CommonResult) item;
                    Set set = a.f41468a;
                    String respCode = commonResult != null ? commonResult.getRespCode() : null;
                    if (respCode != null && !StringsKt.F(respCode) && a.f41468a.contains(respCode)) {
                        a.a(null);
                        throw new p203na.b();
                    }
                }
                return item;
            default:
                return SplashAdView.lambda$downloadSplashImg$10((Boolean) item);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.RefundInAdvanceDialog.Listener
    public void click() {
        ArrayList arrayList = TransferResultActivity.f33237Z;
        i0.b0("/early-refund/#/index");
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewConfig
    public void configWebView(WebView webView) {
        int i7 = k.f41617i;
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) throws IOException {
        int i7 = 1;
        String str = "application/zip";
        int i10 = 0;
        switch (this.f39550a) {
            case 19:
                UploadRequest uploadRequest = (UploadRequest) obj;
                b0 b0Var = c0.Companion;
                Intrinsics.e(uploadRequest);
                Intrinsics.checkNotNullParameter(uploadRequest, "<this>");
                List<UploadImageInfo> images = uploadRequest.getImages();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : images) {
                    String name = ((UploadImageInfo) obj2).getImage().getName();
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() > i7) {
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(r.l(list2, 10));
                        int i11 = i10;
                        for (Object obj3 : list2) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                C1850q.k();
                                throw null;
                            }
                            UploadImageInfo uploadImageInfo = (UploadImageInfo) obj3;
                            Intrinsics.e(str2);
                            String str3 = StringsKt.T(str2, Consts.DOT) + "-" + i11 + Consts.DOT + StringsKt.R(str2, Consts.DOT);
                            p pVar = p.f41234a;
                            String str4 = p.f41239f;
                            if (str4 == null) {
                                Intrinsics.n("fileSavePath");
                                throw null;
                            }
                            File target = new File(str4, str3);
                            File file = uploadImageInfo.getImage();
                            Intrinsics.checkNotNullParameter(file, "<this>");
                            Intrinsics.checkNotNullParameter(target, "target");
                            if (!file.exists()) {
                                throw new Kf.r(file, null, "The source file doesn't exist.", 2, null);
                            }
                            if (target.exists() && !target.delete()) {
                                Intrinsics.checkNotNullParameter(file, "file");
                                throw new c(file, target, "Tried to overwrite the destination, but failed to delete it.");
                            }
                            if (!file.isDirectory()) {
                                File parentFile = target.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(target);
                                    try {
                                        f.d(fileInputStream, fileOutputStream);
                                        fileOutputStream.close();
                                        fileInputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        org.chromium.support_lib_boundary.util.b.o(fileInputStream, th3);
                                        throw th4;
                                    }
                                }
                            } else if (!target.mkdirs()) {
                                throw new Kf.d(file, target, "Failed to create target directory.");
                            }
                            arrayList3.add(UploadImageInfo.copy$default(uploadImageInfo, null, target, 1, null));
                            i7 = 1;
                            i11 = i12;
                        }
                        list = arrayList3;
                    }
                    v.n(arrayList2, list);
                    i7 = i7;
                    i10 = 0;
                }
                UploadRequest uploadRequestCopy = uploadRequest.copy(arrayList2);
                File fileCreateTempFile = File.createTempFile("upload", OfflineConstant.ZIP_SUFFIX);
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
                zipOutputStream.putNextEntry(new ZipEntry("info.json"));
                String json = new GsonBuilder().registerTypeAdapter(File.class, p320v6.c.f43070a).create().toJson(uploadRequestCopy, UploadRequest.class);
                Intrinsics.e(json);
                byte[] bytes = json.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                zipOutputStream.write(bytes);
                zipOutputStream.closeEntry();
                for (UploadImageInfo uploadImageInfo2 : uploadRequestCopy.getImages()) {
                    zipOutputStream.putNextEntry(new ZipEntry(uploadImageInfo2.getImage().getName()));
                    FileInputStream fileInputStream2 = new FileInputStream(uploadImageInfo2.getImage());
                    try {
                        f.d(fileInputStream2, zipOutputStream);
                        fileInputStream2.close();
                        zipOutputStream.closeEntry();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            org.chromium.support_lib_boundary.util.b.o(fileInputStream2, th5);
                            throw th6;
                        }
                    }
                }
                zipOutputStream.close();
                fileCreateTempFile.deleteOnExit();
                return b0Var.create(fileCreateTempFile, L.f40589e.get("application/zip"));
            case 20:
                UploadRequestV2 uploadRequestV2 = (UploadRequestV2) obj;
                Intrinsics.e(uploadRequestV2);
                Intrinsics.checkNotNullParameter(uploadRequestV2, "<this>");
                String name2 = uploadRequestV2.getImage().getName();
                Intrinsics.e(name2);
                if (y.g(name2, "jpeg", false)) {
                    str = "image/jpeg";
                } else if (y.g(name2, MapModule.SNAPSHOT_FORMAT_JPG, false)) {
                    str = ClipboardModule.MIMETYPE_JPG;
                } else if (y.g(name2, MapModule.SNAPSHOT_FORMAT_PNG, false)) {
                    str = "image/png";
                } else if (y.g(name2, "mp4", false)) {
                    str = "mp4/*";
                } else if (!y.g(name2, "zip", false)) {
                    str = "*/*";
                }
                return c0.Companion.create(uploadRequestV2.getImage(), L.f40589e.get(str));
            default:
                String str5 = (String) obj;
                return TextUtils.isEmpty(str5) ? str5 : q0.k("(", str5, ")");
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IDataUpdateListener
    public void dataUpdate(boolean z3, AdEntity adEntity) {
        SplashAdView.lambda$downloadSplashImg$13(z3, adEntity);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean z3) {
        SplashAdView.lambda$downloadSplashImg$12(z3);
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor$Logger
    public void log(String message) {
        switch (this.f39550a) {
            case 0:
                AdRetrofitClient.lambda$setLog$0(message);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            default:
                AnalysisRetrofitClient.lambda$setLog$0(message);
                break;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        int i10 = CLRecordActivity.f29016g;
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i7 == 0) {
            tab.setText("Loan Records");
        } else {
            if (i7 != 1) {
                return;
            }
            tab.setText("Repayment Records");
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnCopyListener
    public void onCopy(CharSequence charSequence) {
        switch (this.f39550a) {
            case 9:
                TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
                ToastUtils.showShort(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                ClipboardUtils.copyText(y.k(charSequence.toString(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, ""));
                break;
            case 17:
                int i7 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                ToastUtils.showShort(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                ClipboardUtils.copyText(y.k(charSequence.toString(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, ""));
                break;
            default:
                int i10 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                ToastUtils.showShort(com.transsnet.palmpay.custom_view.v.cv_copy_successful);
                ClipboardUtils.copyText(y.k(charSequence.toString(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, ""));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        Intrinsics.checkNotNullParameter(it, "it");
        p.f41240g = -1;
        r6.a aVar = p.f41237d;
        if (aVar == null || (liveID$ILiveIDMonitor = aVar.f41573e) == null) {
            return;
        }
        p320v6.d dVar = e.f43080h;
        liveID$ILiveIDMonitor.report(dVar.f43071a, kotlin.collections.G.h(new Pair("result", Integer.valueOf(p.f41240g)), new Pair("event_desc", dVar.f43072b)));
    }

    @Override // com.luck.picture.lib.interfaces.OnQueryFilterListener
    public boolean onFilter(LocalMedia localMedia) {
        int i7 = OcFeedbackActivity.f29425H;
        return false;
    }

    @Override // com.google.android.gms.maps.OnMapsSdkInitializedCallback
    public void onMapsSdkInitialized(MapsInitializer.Renderer renderer) {
        Objects.toString(renderer);
    }

    @Override // com.luck.picture.lib.interfaces.OnPreviewInterceptListener
    public void onPreview(Context context, int i7, int i10, int i11, long j6, String str, boolean z3, ArrayList arrayList, boolean z8) {
        int i12 = OcFeedbackActivity.f29425H;
    }

    @Override // mono.connect.kit.ConnectEventCallback
    public void run(p273rg.a event) {
        int i7 = MonoConnectActivity.f28694q0;
        Intrinsics.checkNotNullParameter(event, "event");
        F6.d.c("MONOSDK", "event.data: " + event.f41982b + "  eventName " + event.f41981a);
    }
}
