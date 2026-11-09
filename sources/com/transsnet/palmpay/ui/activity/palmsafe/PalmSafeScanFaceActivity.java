package com.transsnet.palmpay.ui.activity.palmsafe;

import Ac.e;
import Ac.f;
import Bc.C0107d;
import Bc.l;
import C0.G;
import L6.b;
import Pa.C0525w;
import Pa.g0;
import Pa.n0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.imageutils.JfifUtil;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.palmsafe.PalmSafeScanFaceActivity;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.PalmSafeViewModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import p038ca.d;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/palm_safe_scan_face")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/palmsafe/PalmSafeScanFaceActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/PalmSafeViewModel;", "Lcom/transsnet/palmpay/core/util/ScanFaceLogicUtil$IScanFaceResultCallBack;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmSafeScanFaceActivity extends BaseMvvmActivity<PalmSafeViewModel> implements ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34780j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34782d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34784f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0107d f34786i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34781c = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34783e = "1";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f34785g = new d(this);

    public static String m(MessageEvent messageEvent) {
        HashMap map = new HashMap();
        map.put("fnName", "faceCapture");
        map.put("result", messageEvent.getEventObj());
        if (!TextUtils.isEmpty(messageEvent.getEventContent())) {
            if (Intrinsics.c(messageEvent.getEventObj(), 1)) {
                map.put("param", messageEvent.getEventContent());
            } else {
                map.put("errorMessage", messageEvent.getEventContent());
            }
        }
        return C0525w.c(map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_palm_safe_scan_face_v2, (ViewGroup) null, false);
        int i7 = e.faceGuideView;
        if (((FaceRecognitionGuideView) a.m(i7, viewInflate)) != null && (viewM = a.m((i7 = e.layoutScanFaceBtn), viewInflate)) != null) {
            l lVarA = l.a(viewM);
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i7 = e.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                C0107d c0107d = new C0107d(linearLayout, lVarA, linearLayout, ppTitleBar, 3);
                this.f34786i = c0107d;
                return c0107d;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        if (getIntent() != null) {
            return !getIntent().getBooleanExtra("extra_use_night_mode", false);
        }
        return super.isForceNoNightMode();
    }

    public final void n() {
        g0.e(g0.f7080h.getInstance(), this, this.f34781c, this, this.f34785g, G.A(), this.f34782d, JfifUtil.MARKER_SOFn);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        g0.f7080h.getInstance().c(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onFailed(String str, String str2, String str3) {
        C0107d c0107d = this.f34786i;
        if (c0107d != null) {
            ((PpButton) ((l) c0107d.f681c).f755c).b(false);
        }
        if (this.f34784f) {
            if (Intrinsics.c(this.f34783e, "2")) {
                ToastUtils.showLong(str2, new Object[0]);
                finish();
                return;
            } else {
                if (TextUtils.isEmpty(str3) || h.v(this, str3, null, null, 14) == null) {
                    ToastUtils.showLong(str2, new Object[0]);
                    return;
                }
                return;
            }
        }
        MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, (Object) 0);
        messageEvent.setEventContent(str2);
        c.b().f(messageEvent);
        Intent intent = new Intent();
        intent.putExtra("extra_flag", 0);
        intent.putExtra("extra_message", str2);
        intent.putExtra("result", m(messageEvent));
        setResult(0, intent);
        finish();
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onProcessing() {
        l lVar;
        PpButton ppButton;
        C0107d c0107d = this.f34786i;
        if (c0107d == null || (lVar = (l) c0107d.f681c) == null || (ppButton = (PpButton) lVar.f755c) == null) {
            return;
        }
        ppButton.b(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public final void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C0107d c0107d = this.f34786i;
        if (c0107d != null) {
            ((PpButton) ((l) c0107d.f681c).f755c).b(false);
        }
        MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, (Object) 1);
        messageEvent.setEventContent(TextUtils.isEmpty(data.token) ? data.s3Url : data.token);
        c.b().f(messageEvent);
        Intent intent = new Intent();
        intent.putExtra("extra_flag", 1);
        intent.putExtra("extra_data", data.token);
        intent.putExtra("linkUrl", data.s3Url);
        intent.putExtra("result", m(messageEvent));
        setResult(-1, intent);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView backImageView;
        LinearLayout linearLayout;
        ARouter.getInstance().inject(this);
        if ("2".equals(this.f34783e)) {
            requestLayoutFullScreen();
            C0107d c0107d = this.f34786i;
            if (c0107d != null && (linearLayout = (LinearLayout) c0107d.f682d) != null) {
                h.c(linearLayout);
            }
            initStatusBar(true);
            n();
            return;
        }
        C0107d c0107d2 = this.f34786i;
        if (c0107d2 != null) {
            final int i7 = 0;
            ((PpButton) ((l) c0107d2.f681c).f755c).setOnClickListener(new View.OnClickListener(this) { // from class: oe.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmSafeScanFaceActivity f40536b;

                {
                    this.f40536b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PalmSafeScanFaceActivity palmSafeScanFaceActivity = this.f40536b;
                    switch (i7) {
                        case 0:
                            int i10 = PalmSafeScanFaceActivity.f34780j;
                            n0.g().k(new ClickEvent("PalmSafeScanFaceActivity_click").add("memberid", BaseApplication.get().getUser().getMemberId()));
                            palmSafeScanFaceActivity.n();
                            break;
                        default:
                            int i11 = PalmSafeScanFaceActivity.f34780j;
                            MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, (Object) 2);
                            messageEvent.setEventContent("Cancelled by User");
                            c.b().f(messageEvent);
                            Intent intent = new Intent();
                            intent.putExtra("extra_flag", 2);
                            intent.putExtra("extra_message", "Cancelled by User");
                            intent.putExtra("result", PalmSafeScanFaceActivity.m(messageEvent));
                            palmSafeScanFaceActivity.setResult(0, intent);
                            palmSafeScanFaceActivity.finish();
                            break;
                    }
                }
            });
        }
        C0107d c0107d3 = this.f34786i;
        if (c0107d3 == null || (backImageView = ((PpTitleBar) c0107d3.f683e).getBackImageView()) == null) {
            return;
        }
        final int i10 = 1;
        backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: oe.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmSafeScanFaceActivity f40536b;

            {
                this.f40536b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PalmSafeScanFaceActivity palmSafeScanFaceActivity = this.f40536b;
                switch (i10) {
                    case 0:
                        int i11 = PalmSafeScanFaceActivity.f34780j;
                        n0.g().k(new ClickEvent("PalmSafeScanFaceActivity_click").add("memberid", BaseApplication.get().getUser().getMemberId()));
                        palmSafeScanFaceActivity.n();
                        break;
                    default:
                        int i12 = PalmSafeScanFaceActivity.f34780j;
                        MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, (Object) 2);
                        messageEvent.setEventContent("Cancelled by User");
                        c.b().f(messageEvent);
                        Intent intent = new Intent();
                        intent.putExtra("extra_flag", 2);
                        intent.putExtra("extra_message", "Cancelled by User");
                        intent.putExtra("result", PalmSafeScanFaceActivity.m(messageEvent));
                        palmSafeScanFaceActivity.setResult(0, intent);
                        palmSafeScanFaceActivity.finish();
                        break;
                }
            }
        });
    }
}
