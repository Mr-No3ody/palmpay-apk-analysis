package D6;

import E.AbstractC0198c;
import Pa.r0;
import Ua.E0;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.palmpay.lib.liveness.task.IDetectionTask;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.adsdk.widgets.snackbar.SnackBarAdView;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentAccount;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentDetail;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;
import p051d9.C1605b;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1597d;

    public /* synthetic */ a(Object obj, int i7, Object obj2, Object obj3) {
        this.f1594a = i7;
        this.f1595b = obj;
        this.f1596c = obj2;
        this.f1597d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x05e7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        String str;
        ArrayList arrayList;
        Object value6;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor3;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor4;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor5;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor6;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor7;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor8;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor9;
        Object value7;
        String upperCase;
        Integer num;
        r6.a aVar;
        Integer num2;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor10;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor11;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor12;
        Face face2 = null;
        int i7 = 1;
        Object obj2 = this.f1596c;
        Object obj3 = this.f1595b;
        Object obj4 = this.f1597d;
        switch (this.f1594a) {
            case 0:
                List list = (List) obj;
                Intrinsics.e(list);
                e eVar = (e) obj3;
                if (eVar.f1622w < 1) {
                    eVar.f1622w = System.currentTimeMillis();
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - eVar.f1622w;
                long j6 = eVar.f1621v;
                ImageProxy imageProxy = (ImageProxy) obj2;
                g0 g0Var = eVar.f1617i;
                if (jCurrentTimeMillis < j6) {
                    do {
                        value7 = g0Var.getValue();
                    } while (!g0Var.compareAndSet(value7, i.a((i) value7, h.InitialInstruction, 0.0f, null, null, null, null, null, 126)));
                } else if (list.isEmpty()) {
                    p292t6.a.a("no face 3---------------");
                    p.f41245l.ensureFaceInFrame();
                    do {
                        value5 = g0Var.getValue();
                    } while (!g0Var.compareAndSet(value5, i.a((i) value5, h.EnsureFaceInFrame, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                } else {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            Face face3 = (Face) next;
                            int iHeight = face3.getBoundingBox().height() * face3.getBoundingBox().width();
                            do {
                                Object next2 = it.next();
                                Face face4 = (Face) next2;
                                int iHeight2 = face4.getBoundingBox().height() * face4.getBoundingBox().width();
                                if (iHeight < iHeight2) {
                                    iHeight = iHeight2;
                                    next = next2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Face face5 = (Face) next;
                    if (face5 == null) {
                        p292t6.a.a("no face 1---------------");
                        p.f41245l.ensureFaceInFrame();
                        do {
                            value4 = g0Var.getValue();
                        } while (!g0Var.compareAndSet(value4, i.a((i) value4, h.EnsureFaceInFrame, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                    } else {
                        int i10 = p292t6.a.f42345a;
                        InputImage inputImage = (InputImage) obj4;
                        p292t6.a.a("width: " + inputImage.getWidth() + ", height: " + inputImage.getHeight());
                        Image image = imageProxy.getImage();
                        Intrinsics.e(image);
                        int width = image.getWidth();
                        Image image2 = imageProxy.getImage();
                        Intrinsics.e(image2);
                        if (D3.a.n(face5, width, image2.getHeight(), eVar.f1611M, eVar.f1612Q, imageProxy.getImageInfo().getRotationDegrees())) {
                            Rect boundingBox = face5.getBoundingBox();
                            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
                            float fT = AbstractC0198c.t(boundingBox) / AbstractC0198c.u(inputImage);
                            p292t6.a.a("faceFillRatio: " + fT);
                            if (fT < 0.1f) {
                                p.f41245l.moveCloser();
                                do {
                                    value2 = g0Var.getValue();
                                } while (!g0Var.compareAndSet(value2, i.a((i) value2, h.MoveCloser, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                            } else if (fT > 0.4f) {
                                p.f41245l.moveAway();
                                do {
                                    value = g0Var.getValue();
                                } while (!g0Var.compareAndSet(value, i.a((i) value, h.MoveAway, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                            } else {
                                face2 = face5;
                            }
                        } else {
                            p292t6.a.a("no face 2---------------");
                            p.f41245l.ensureFaceInFrame();
                            do {
                                value3 = g0Var.getValue();
                            } while (!g0Var.compareAndSet(value3, i.a((i) value3, h.EnsureFaceInFrame, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                        }
                    }
                }
                if (face2 != null) {
                    int i11 = eVar.f1609H;
                    ArrayList arrayList2 = eVar.f1613d;
                    IDetectionTask task = (IDetectionTask) CollectionsKt.G(i11, arrayList2);
                    if (task != null) {
                        int i12 = p292t6.a.f42345a;
                        p292t6.a.a("taskIndex: " + eVar.f1609H + " , lastTaskIndex : " + eVar.f1610L);
                        int i13 = eVar.f1609H;
                        if (i13 != eVar.f1610L) {
                            eVar.f1610L = i13;
                            task.start();
                            p292t6.a.a("onTaskStarted: " + task);
                            eVar.d(task);
                            p320v6.d dVar = p320v6.e.f43073a;
                            String str2 = eVar.t;
                            Intrinsics.checkNotNullParameter(task, "task");
                            if (task instanceof p348x6.a) {
                                r6.a aVar2 = p.f41237d;
                                if (aVar2 == null || (liveID$ILiveIDMonitor9 = aVar2.f41573e) == null) {
                                    str = "";
                                    arrayList = arrayList2;
                                } else {
                                    p320v6.d dVar2 = p320v6.e.f43082j;
                                    String str3 = dVar2.f43071a;
                                    str = "";
                                    Pair pair = new Pair("event_desc", dVar2.f43072b);
                                    if (str2 == null) {
                                        str2 = str;
                                    }
                                    Pair pair2 = new Pair("transactionId", str2);
                                    String str4 = p.f41242i;
                                    if (str4 == null) {
                                        str4 = str;
                                    }
                                    arrayList = arrayList2;
                                    liveID$ILiveIDMonitor9.report(str3, G.h(pair, pair2, new Pair("uuid", str4)));
                                }
                            } else {
                                str = "";
                                arrayList = arrayList2;
                                if (task instanceof p348x6.i) {
                                    r6.a aVar3 = p.f41237d;
                                    if (aVar3 != null && (liveID$ILiveIDMonitor8 = aVar3.f41573e) != null) {
                                        p320v6.d dVar3 = p320v6.e.f43084l;
                                        String str5 = dVar3.f43071a;
                                        Pair pair3 = new Pair("event_desc", dVar3.f43072b);
                                        if (str2 == null) {
                                            str2 = str;
                                        }
                                        Pair pair4 = new Pair("transactionId", str2);
                                        String str6 = p.f41242i;
                                        if (str6 == null) {
                                            str6 = str;
                                        }
                                        liveID$ILiveIDMonitor8.report(str5, G.h(pair3, pair4, new Pair("uuid", str6)));
                                    }
                                } else if (task instanceof p348x6.c) {
                                    r6.a aVar4 = p.f41237d;
                                    if (aVar4 != null && (liveID$ILiveIDMonitor7 = aVar4.f41573e) != null) {
                                        p320v6.d dVar4 = p320v6.e.f43088p;
                                        String str7 = dVar4.f43071a;
                                        Pair pair5 = new Pair("event_desc", dVar4.f43072b);
                                        if (str2 == null) {
                                            str2 = str;
                                        }
                                        Pair pair6 = new Pair("transactionId", str2);
                                        String str8 = p.f41242i;
                                        if (str8 == null) {
                                            str8 = str;
                                        }
                                        liveID$ILiveIDMonitor7.report(str7, G.h(pair5, pair6, new Pair("uuid", str8)));
                                    }
                                } else if (task instanceof p348x6.e) {
                                    r6.a aVar5 = p.f41237d;
                                    if (aVar5 != null && (liveID$ILiveIDMonitor6 = aVar5.f41573e) != null) {
                                        p320v6.d dVar5 = p320v6.e.f43086n;
                                        String str9 = dVar5.f43071a;
                                        Pair pair7 = new Pair("event_desc", dVar5.f43072b);
                                        if (str2 == null) {
                                            str2 = str;
                                        }
                                        Pair pair8 = new Pair("transactionId", str2);
                                        String str10 = p.f41242i;
                                        if (str10 == null) {
                                            str10 = str;
                                        }
                                        liveID$ILiveIDMonitor6.report(str9, G.h(pair7, pair8, new Pair("uuid", str10)));
                                    }
                                } else {
                                    boolean z3 = task instanceof p348x6.g;
                                }
                            }
                        } else {
                            str = "";
                            arrayList = arrayList2;
                        }
                        p292t6.a.a("onTaskProcess: " + task);
                        eVar.d(task);
                        if (task.process(face2)) {
                            boolean z8 = eVar.f1609H == C1850q.g(arrayList);
                            p292t6.a.a("onTaskCompleted: " + task + " , isLastTask : " + z8);
                            if (z8) {
                                Bitmap bitmap = imageProxy.toBitmap();
                                Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
                                Bitmap bitmapY = AbstractC0198c.Y(imageProxy.getImageInfo().getRotationDegrees(), bitmap);
                                int i14 = eVar.f1614e;
                                Size size = eVar.f1616g;
                                if (i14 == 2) {
                                    File fileK = AbstractC0198c.k();
                                    eVar.f1620p = fileK;
                                    AbstractC0198c.U(bitmapY, fileK, size);
                                } else {
                                    File fileJ = AbstractC0198c.j("selfie");
                                    eVar.f1620p = fileJ;
                                    AbstractC0198c.T(bitmapY, fileJ, size);
                                }
                                while (true) {
                                    Object value8 = g0Var.getValue();
                                    File file = eVar.f1620p;
                                    Matrix matrix = new Matrix();
                                    matrix.preScale(-1.0f, 1.0f);
                                    Bitmap bitmap2 = bitmapY;
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmapY.getWidth(), bitmapY.getHeight(), matrix, false);
                                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                                    if (g0Var.compareAndSet(value8, i.a((i) value8, null, 0.0f, null, file, null, null, bitmapCreateBitmap, 55))) {
                                        p.f41245l.collectLiveness();
                                        r6.a aVar6 = p.f41237d;
                                        if (aVar6 != null && (liveID$ILiveIDMonitor5 = aVar6.f41573e) != null) {
                                            p320v6.d dVar6 = p320v6.e.f43077e;
                                            String str11 = dVar6.f43071a;
                                            Pair pair9 = new Pair("event_desc", dVar6.f43072b);
                                            Integer num3 = p.f41243j;
                                            Pair pair10 = new Pair("scene", Integer.valueOf(num3 != null ? num3.intValue() : -1));
                                            Pair pair11 = new Pair("total", Integer.valueOf(eVar.f1615f));
                                            String str12 = eVar.t;
                                            if (str12 == null) {
                                                str12 = str;
                                            }
                                            Pair pair12 = new Pair("transactionId", str12);
                                            String str13 = p.f41242i;
                                            if (str13 == null) {
                                                str13 = str;
                                            }
                                            liveID$ILiveIDMonitor5.report(str11, G.h(pair9, pair10, pair11, pair12, new Pair("uuid", str13)));
                                        }
                                    } else {
                                        bitmapY = bitmap2;
                                    }
                                }
                            } else {
                                do {
                                    value6 = g0Var.getValue();
                                } while (!g0Var.compareAndSet(value6, i.a((i) value6, null, eVar.f1609H + 1, null, null, null, null, null, 125)));
                            }
                            p320v6.d dVar7 = p320v6.e.f43073a;
                            String str14 = eVar.t;
                            Intrinsics.checkNotNullParameter(task, "task");
                            if (task instanceof p348x6.a) {
                                r6.a aVar7 = p.f41237d;
                                if (aVar7 != null && (liveID$ILiveIDMonitor4 = aVar7.f41573e) != null) {
                                    p320v6.d dVar8 = p320v6.e.f43083k;
                                    String str15 = dVar8.f43071a;
                                    Pair pair13 = new Pair("event_desc", dVar8.f43072b);
                                    if (str14 == null) {
                                        str14 = str;
                                    }
                                    Pair pair14 = new Pair("transactionId", str14);
                                    String str16 = p.f41242i;
                                    if (str16 == null) {
                                        str16 = str;
                                    }
                                    liveID$ILiveIDMonitor4.report(str15, G.h(pair13, pair14, new Pair("uuid", str16)));
                                }
                            } else if (task instanceof p348x6.i) {
                                r6.a aVar8 = p.f41237d;
                                if (aVar8 != null && (liveID$ILiveIDMonitor3 = aVar8.f41573e) != null) {
                                    p320v6.d dVar9 = p320v6.e.f43085m;
                                    String str17 = dVar9.f43071a;
                                    Pair pair15 = new Pair("event_desc", dVar9.f43072b);
                                    if (str14 == null) {
                                        str14 = str;
                                    }
                                    Pair pair16 = new Pair("transactionId", str14);
                                    String str18 = p.f41242i;
                                    if (str18 == null) {
                                        str18 = str;
                                    }
                                    liveID$ILiveIDMonitor3.report(str17, G.h(pair15, pair16, new Pair("uuid", str18)));
                                }
                            } else if (task instanceof p348x6.c) {
                                r6.a aVar9 = p.f41237d;
                                if (aVar9 != null && (liveID$ILiveIDMonitor2 = aVar9.f41573e) != null) {
                                    p320v6.d dVar10 = p320v6.e.f43089q;
                                    String str19 = dVar10.f43071a;
                                    Pair pair17 = new Pair("event_desc", dVar10.f43072b);
                                    if (str14 == null) {
                                        str14 = str;
                                    }
                                    Pair pair18 = new Pair("transactionId", str14);
                                    String str20 = p.f41242i;
                                    if (str20 == null) {
                                        str20 = str;
                                    }
                                    liveID$ILiveIDMonitor2.report(str19, G.h(pair17, pair18, new Pair("uuid", str20)));
                                }
                            } else if (task instanceof p348x6.e) {
                                r6.a aVar10 = p.f41237d;
                                if (aVar10 != null && (liveID$ILiveIDMonitor = aVar10.f41573e) != null) {
                                    p320v6.d dVar11 = p320v6.e.f43087o;
                                    String str21 = dVar11.f43071a;
                                    Pair pair19 = new Pair("event_desc", dVar11.f43072b);
                                    if (str14 == null) {
                                        str14 = str;
                                    }
                                    Pair pair20 = new Pair("transactionId", str14);
                                    String str22 = p.f41242i;
                                    if (str22 == null) {
                                        str22 = str;
                                    }
                                    liveID$ILiveIDMonitor.report(str21, G.h(pair19, pair20, new Pair("uuid", str22)));
                                }
                            } else {
                                boolean z10 = task instanceof p348x6.g;
                            }
                            eVar.f1609H++;
                        }
                    }
                }
                return Unit.f38893a;
            case 1:
                String str23 = (String) ((List) obj3).get(((Integer) obj).intValue());
                E0 e10 = (E0) obj2;
                if (Intrinsics.c((String) obj4, e10.f9321k)) {
                    upperCase = str23.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } else {
                    upperCase = str23;
                }
                e10.f9326p = upperCase;
                TextView textView = (TextView) e10.f9313c.getValue();
                if (textView != null) {
                    textView.setText(str23);
                }
                return Unit.f38893a;
            case 2:
                return ReactHostImpl.callFunctionOnModule$lambda$18((String) obj3, (String) obj2, (NativeArray) obj4, (ReactInstance) obj);
            case 3:
                return SnackBarAdView.fetchData$lambda$2((SnackBarAdView) obj3, (AdShowCallback) obj2, (WeakReference) obj4, ((Boolean) obj).booleanValue());
            case 4:
                View view = (View) obj;
                int i15 = CouponPackageResultActivity.f34663o;
                Intrinsics.checkNotNullParameter(view, "view");
                if (ActivityUtils.isValidActivityContext((CouponPackageResultActivity) obj3)) {
                    ImageView imageView = (ImageView) view.findViewById(Ac.e.iv_coupon_package);
                    r0.l1((String) obj2, imageView);
                    imageView.setOnClickListener(new Ib.a(view, (String) obj4, i7));
                }
                return Unit.f38893a;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                D d2 = new D();
                int i16 = !zBooleanValue ? 1 : 0;
                d2.f38949a = i16;
                LiveID$ILiveIDListener liveID$ILiveIDListener = (LiveID$ILiveIDListener) obj3;
                AuthenticationRequest authenticationRequest = (AuthenticationRequest) obj2;
                if (1 != i16 || (aVar = p.f41237d) == null || (num2 = aVar.f41575g) == null || 1 != num2.intValue()) {
                    C1605b c1605b = new C1605b(13, authenticationRequest, liveID$ILiveIDListener);
                    r6.a aVar11 = p.f41237d;
                    if (aVar11 != null && (num = aVar11.f41575g) != null && 2 == num.intValue()) {
                        d2.f38949a = 1;
                    }
                    Activity activity = (Activity) obj4;
                    if (activity instanceof LifecycleOwner) {
                        AbstractC0780y.m(V.f((LifecycleOwner) activity), AbstractC0198c.x(c1605b), null, new p232p6.e(activity, authenticationRequest, liveID$ILiveIDListener, d2, null), 2);
                    } else {
                        AbstractC0780y.m(AbstractC0777v.b(), AbstractC0198c.x(c1605b), null, new p232p6.f(activity, authenticationRequest, liveID$ILiveIDListener, d2, null), 2);
                    }
                    return Unit.f38893a;
                }
                int i17 = p292t6.a.f42345a;
                p292t6.a.c("install status : " + p.f41240g);
                int i18 = p.f41240g;
                if (2 == i18) {
                    f fVar = f.f1624d;
                    String str24 = fVar.f1633a;
                    String str25 = fVar.f1634b;
                    liveID$ILiveIDListener.onInterrupted(str24, str25, null);
                    r6.a aVar12 = p.f41237d;
                    if (aVar12 != null && (liveID$ILiveIDMonitor12 = aVar12.f41573e) != null) {
                        p320v6.d dVar12 = p320v6.e.f43079g;
                        String str26 = dVar12.f43071a;
                        Pair pair21 = new Pair("event_desc", dVar12.f43072b);
                        Integer scene = authenticationRequest.getScene();
                        Pair pair22 = new Pair("scene", Integer.valueOf(scene != null ? scene.intValue() : -1));
                        Pair pair23 = new Pair("code", fVar.f1633a);
                        Pair pair24 = new Pair("msg", str25);
                        String str27 = p.f41242i;
                        liveID$ILiveIDMonitor12.report(str26, G.h(pair21, pair22, pair23, pair24, new Pair("uuid", str27 != null ? str27 : "")));
                    }
                } else if (3 == i18) {
                    f fVar2 = f.f1623c;
                    liveID$ILiveIDListener.onInterrupted(fVar2.f1633a, fVar2.f1634b, null);
                    r6.a aVar13 = p.f41237d;
                    if (aVar13 != null && (liveID$ILiveIDMonitor11 = aVar13.f41573e) != null) {
                        p320v6.d dVar13 = p320v6.e.f43079g;
                        String str28 = dVar13.f43071a;
                        Pair pair25 = new Pair("event_desc", dVar13.f43072b);
                        Integer scene2 = authenticationRequest.getScene();
                        Pair pair26 = new Pair("scene", Integer.valueOf(scene2 != null ? scene2.intValue() : -1));
                        f fVar3 = f.f1625e;
                        Pair pair27 = new Pair("code", fVar3.f1633a);
                        Pair pair28 = new Pair("msg", fVar3.f1634b);
                        String str29 = p.f41242i;
                        liveID$ILiveIDMonitor11.report(str28, G.h(pair25, pair26, pair27, pair28, new Pair("uuid", str29 != null ? str29 : "")));
                    }
                } else {
                    f fVar4 = f.f1623c;
                    String str30 = fVar4.f1633a;
                    String str31 = fVar4.f1634b;
                    liveID$ILiveIDListener.onInterrupted(str30, str31, null);
                    r6.a aVar14 = p.f41237d;
                    if (aVar14 != null && (liveID$ILiveIDMonitor10 = aVar14.f41573e) != null) {
                        p320v6.d dVar14 = p320v6.e.f43079g;
                        String str32 = dVar14.f43071a;
                        Pair pair29 = new Pair("event_desc", dVar14.f43072b);
                        Integer scene3 = authenticationRequest.getScene();
                        Pair pair30 = new Pair("scene", Integer.valueOf(scene3 != null ? scene3.intValue() : -1));
                        Pair pair31 = new Pair("code", fVar4.f1633a);
                        Pair pair32 = new Pair("msg", str31);
                        String str33 = p.f41242i;
                        liveID$ILiveIDMonitor10.report(str32, G.h(pair29, pair30, pair31, pair32, new Pair("uuid", str33 != null ? str33 : "")));
                    }
                }
                return Unit.f38893a;
            case 6:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Fb.i.f((Context) obj3, (LoanHomeRepaymentAccount) obj2, (LoanHomeRepaymentDetail) obj4);
                return Unit.f38893a;
            default:
                View it3 = (View) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String loanProduct = ((LoanHomeRepaymentAccount) obj4).getLoanProduct();
                ((p339wb.i) obj3).getClass();
                Bundle bundle = new Bundle();
                LoanHomeRepaymentDetail loanHomeRepaymentDetail = (LoanHomeRepaymentDetail) obj2;
                bundle.putString("loanNo", loanHomeRepaymentDetail.getLoanNo());
                bundle.putString("loanProduct", loanProduct);
                Long billId = loanHomeRepaymentDetail.getBillId();
                if (billId != null) {
                    bundle.putLong("billId", billId.longValue());
                }
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                return Unit.f38893a;
        }
    }
}
