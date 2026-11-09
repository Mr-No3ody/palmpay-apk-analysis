package C6;

import B6.RunnableC0085g;
import E.AbstractC0198c;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.a0;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f1202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputImage f1203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f1204e;

    public /* synthetic */ q(a0 a0Var, long j6, ImageProxy imageProxy, InputImage inputImage, int i7) {
        this.f1200a = i7;
        this.f1204e = a0Var;
        this.f1201b = j6;
        this.f1202c = imageProxy;
        this.f1203d = inputImage;
    }

    /* JADX WARN: Code duplicated, block: B:271:0x07a1  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        boolean z3;
        Object value;
        Object value2;
        Handler handler;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        Object value3;
        Object value4;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        int i7;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        g0 g0Var;
        Object value14;
        Integer num2;
        boolean z8;
        Object value15;
        Object value16;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor3;
        Object value17;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor4;
        Object value18;
        Object value19;
        Object value20;
        Integer num3;
        Object value21;
        Object value22;
        Object value23;
        Object value24;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor5;
        Object value25;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor6;
        Object value26;
        Object value27;
        Object value28;
        Object value29;
        Object value30;
        g0 g0Var2;
        Object value31;
        InputImage inputImage = this.f1203d;
        ImageProxy imageProxy = this.f1202c;
        long j6 = this.f1201b;
        a0 a0Var = this.f1204e;
        switch (this.f1200a) {
            case 0:
                List list = (List) obj;
                v vVar = (v) a0Var;
                if (!list.isEmpty()) {
                    Face face2 = (Face) CollectionsKt.F(list);
                    Intrinsics.e(face2);
                    if (D3.a.m(face2, Math.max(imageProxy.getWidth(), imageProxy.getHeight()))) {
                        Rect boundingBox = face2.getBoundingBox();
                        Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
                        float fT = AbstractC0198c.t(boundingBox) / AbstractC0198c.u(inputImage);
                        if (fT < 0.1f) {
                            p232p6.p.f41245l.moveCloser();
                            g0 g0Var3 = vVar.f1235o;
                            do {
                                value11 = g0Var3.getValue();
                            } while (!g0Var3.compareAndSet(value11, D6.i.a((D6.i) value11, D6.h.MoveCloser, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                        } else if (fT <= 0.4f) {
                            boolean z10 = vVar.f1223H;
                            g0 g0Var4 = vVar.f1235o;
                            if (!z10) {
                                r6.a aVar = p232p6.p.f41237d;
                                if (aVar != null && (num = aVar.f41584p) != null && 2 == num.intValue()) {
                                    Float leftEyeOpenProbability = face2.getLeftEyeOpenProbability();
                                    Float rightEyeOpenProbability = face2.getRightEyeOpenProbability();
                                    ArrayList arrayList = vVar.f1237v;
                                    int i10 = vVar.f1229d;
                                    if (leftEyeOpenProbability == null || rightEyeOpenProbability == null) {
                                        z3 = false;
                                    } else {
                                        float fFloatValue = leftEyeOpenProbability.floatValue();
                                        float f10 = vVar.f1233i;
                                        boolean z11 = fFloatValue < f10 || rightEyeOpenProbability.floatValue() < f10;
                                        if (i10 > 2) {
                                            if (arrayList.size() > i10 / 2 && !z11 && arrayList.size() != i10) {
                                                p232p6.p.f41245l.blink();
                                                do {
                                                    value7 = g0Var4.getValue();
                                                } while (!g0Var4.compareAndSet(value7, D6.i.a((D6.i) value7, D6.h.Blink, 0.0f, null, null, null, null, null, 126)));
                                            }
                                        } else if (i10 > 1) {
                                            if (arrayList.size() >= 1 && !z11 && arrayList.size() != i10) {
                                                p232p6.p.f41245l.blink();
                                                do {
                                                    value6 = g0Var4.getValue();
                                                } while (!g0Var4.compareAndSet(value6, D6.i.a((D6.i) value6, D6.h.Blink, 0.0f, null, null, null, null, null, 126)));
                                            }
                                        } else if (arrayList.size() == 0 && !z11) {
                                            p232p6.p.f41245l.blink();
                                            do {
                                                value5 = g0Var4.getValue();
                                            } while (!g0Var4.compareAndSet(value5, D6.i.a((D6.i) value5, D6.h.Blink, 0.0f, null, null, null, null, null, 126)));
                                        }
                                        z3 = z11;
                                    }
                                    do {
                                        value = g0Var4.getValue();
                                    } while (!g0Var4.compareAndSet(value, D6.i.a((D6.i) value, D6.h.Capturing, 0.0f, null, null, null, null, null, 126)));
                                    Bitmap bitmapU = p118hf.a.u(imageProxy);
                                    if (bitmapU == null) {
                                        p232p6.p.f41245l.bitmapEmpty();
                                        break;
                                    } else {
                                        vVar.f1221B = System.currentTimeMillis();
                                        int size = arrayList.size();
                                        int i11 = vVar.f1230e;
                                        if (size < i10) {
                                            arrayList.add(AbstractC0198c.j("liveness"));
                                            do {
                                                value4 = g0Var4.getValue();
                                            } while (!g0Var4.compareAndSet(value4, D6.i.a((D6.i) value4, null, arrayList.size() / i11, null, null, null, null, null, 125)));
                                            p232p6.p.f41245l.collectLiveness();
                                            r6.a aVar2 = p232p6.p.f41237d;
                                            if (aVar2 != null && (liveID$ILiveIDMonitor2 = aVar2.f41573e) != null) {
                                                p320v6.d dVar = p320v6.e.f43077e;
                                                String str = dVar.f43071a;
                                                Pair pair = new Pair("event_desc", dVar.f43072b);
                                                Integer num4 = p232p6.p.f41243j;
                                                Pair pair2 = new Pair("scene", Integer.valueOf(num4 != null ? num4.intValue() : -1));
                                                Pair pair3 = new Pair("current", Integer.valueOf(arrayList.size()));
                                                Pair pair4 = new Pair("total", Integer.valueOf(i11));
                                                String str2 = vVar.f1220A;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                Pair pair5 = new Pair("transactionId", str2);
                                                String str3 = p232p6.p.f41242i;
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                liveID$ILiveIDMonitor2.report(str, G.h(pair, pair2, pair3, pair4, pair5, new Pair("uuid", str3)));
                                            }
                                        } else if (!z3) {
                                            File fileJ = AbstractC0198c.j("selfie");
                                            vVar.f1238w = fileJ;
                                            Objects.toString(fileJ);
                                            File file = vVar.f1238w;
                                            Intrinsics.e(file);
                                            AbstractC0198c.T(bitmapU, file, vVar.f1231f);
                                            if (Boolean.TRUE.equals(vVar.f1228Y)) {
                                                vVar.f1222C = false;
                                                do {
                                                    value3 = g0Var4.getValue();
                                                } while (!g0Var4.compareAndSet(value3, D6.i.a((D6.i) value3, null, 1.0f, null, vVar.f1238w, null, null, null, 117)));
                                            } else {
                                                vVar.f1223H = true;
                                                do {
                                                    value2 = g0Var4.getValue();
                                                } while (!g0Var4.compareAndSet(value2, D6.i.a((D6.i) value2, D6.h.SquarelyFaceInFrame, 1.0f, Boolean.TRUE, null, null, null, null, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP)));
                                                o oVar = vVar.f1227X;
                                                if (oVar != null && (handler = oVar.f1195h) != null) {
                                                    handler.post(new l(oVar, 0));
                                                }
                                            }
                                            p232p6.p.f41245l.collectLiveness();
                                            r6.a aVar3 = p232p6.p.f41237d;
                                            if (aVar3 != null && (liveID$ILiveIDMonitor = aVar3.f41573e) != null) {
                                                p320v6.d dVar2 = p320v6.e.f43077e;
                                                String str4 = dVar2.f43071a;
                                                Pair pair6 = new Pair("event_desc", dVar2.f43072b);
                                                Integer num5 = p232p6.p.f41243j;
                                                Pair pair7 = new Pair("scene", Integer.valueOf(num5 != null ? num5.intValue() : -1));
                                                Pair pair8 = new Pair("current", Integer.valueOf(arrayList.size() + 1));
                                                Pair pair9 = new Pair("total", Integer.valueOf(i11));
                                                String str5 = vVar.f1220A;
                                                if (str5 == null) {
                                                    str5 = "";
                                                }
                                                Pair pair10 = new Pair("transactionId", str5);
                                                String str6 = p232p6.p.f41242i;
                                                if (str6 == null) {
                                                    str6 = "";
                                                }
                                                liveID$ILiveIDMonitor.report(str4, G.h(pair6, pair7, pair8, pair9, pair10, new Pair("uuid", str6)));
                                            }
                                        }
                                    }
                                }
                            } else {
                                Bitmap bitmap = p118hf.a.u(imageProxy);
                                if (bitmap != null) {
                                    p292t6.a.a("analyze record------------");
                                    vVar.f1221B = System.currentTimeMillis();
                                    if (vVar.f1224L <= vVar.f1234j && !Boolean.TRUE.equals(vVar.f1228Y)) {
                                        do {
                                            value9 = g0Var4.getValue();
                                        } while (!g0Var4.compareAndSet(value9, D6.i.a((D6.i) value9, D6.h.SquarelyFaceInFrame, 0.0f, Boolean.TRUE, null, null, null, null, 122)));
                                        o oVar2 = vVar.f1227X;
                                        if (oVar2 != null) {
                                            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                                            Handler handler2 = oVar2.f1195h;
                                            if (handler2 != null) {
                                                i7 = 1;
                                                handler2.post(new RunnableC0085g(1, oVar2, bitmap));
                                            } else {
                                                i7 = 1;
                                            }
                                        } else {
                                            i7 = 1;
                                        }
                                        vVar.f1224L += i7;
                                    } else {
                                        vVar.f1222C = false;
                                        vVar.f1223H = false;
                                        o oVar3 = vVar.f1227X;
                                        if (oVar3 != null) {
                                            oVar3.f1188a = null;
                                            Handler handler3 = oVar3.f1195h;
                                            if (handler3 != null) {
                                                handler3.post(new l(oVar3, 2));
                                            }
                                        }
                                        do {
                                            value8 = g0Var4.getValue();
                                        } while (!g0Var4.compareAndSet(value8, D6.i.a((D6.i) value8, null, 1.0f, null, vVar.f1238w, null, null, null, 117)));
                                    }
                                } else {
                                    p232p6.p.f41245l.bitmapEmpty();
                                }
                            }
                        } else {
                            p232p6.p.f41245l.moveAway();
                            g0 g0Var5 = vVar.f1235o;
                            do {
                                value10 = g0Var5.getValue();
                            } while (!g0Var5.compareAndSet(value10, D6.i.a((D6.i) value10, D6.h.MoveAway, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                        }
                    } else {
                        p232p6.p.f41245l.ensureFaceInFrame();
                        g0 g0Var6 = vVar.f1235o;
                        do {
                            value12 = g0Var6.getValue();
                        } while (!g0Var6.compareAndSet(value12, D6.i.a((D6.i) value12, D6.h.EnsureFaceInFrame, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                    }
                } else {
                    p232p6.p.f41245l.ensureFaceInFrame();
                    g0 g0Var7 = vVar.f1235o;
                    do {
                        value13 = g0Var7.getValue();
                    } while (!g0Var7.compareAndSet(value13, D6.i.a((D6.i) value13, D6.h.EnsureFaceInFrame, 0.0f, Boolean.FALSE, null, null, null, null, 122)));
                    if (j6 > vVar.f1232g) {
                        p232p6.p.f41245l.timeOut();
                        vVar.f1222C = false;
                        do {
                            g0Var = vVar.f1235o;
                            value14 = g0Var.getValue();
                        } while (!g0Var.compareAndSet(value14, D6.i.a((D6.i) value14, null, 0.0f, Boolean.FALSE, null, D6.g.f1638d, null, null, 67)));
                    }
                }
                break;
            default:
                List list2 = (List) obj;
                D6.m mVar = (D6.m) a0Var;
                if (!list2.isEmpty()) {
                    Face face3 = (Face) CollectionsKt.F(list2);
                    Intrinsics.e(face3);
                    if (D3.a.m(face3, Math.max(imageProxy.getWidth(), imageProxy.getHeight()))) {
                        Rect boundingBox2 = face3.getBoundingBox();
                        Intrinsics.checkNotNullExpressionValue(boundingBox2, "getBoundingBox(...)");
                        float fT2 = AbstractC0198c.t(boundingBox2) / AbstractC0198c.u(inputImage);
                        if (fT2 < 0.1f) {
                            p232p6.p.f41245l.moveCloser();
                            g0 g0Var8 = mVar.f1682p;
                            do {
                                value28 = g0Var8.getValue();
                            } while (!g0Var8.compareAndSet(value28, D6.i.a((D6.i) value28, D6.h.MoveCloser, 0.0f, null, null, null, null, null, 126)));
                        } else if (fT2 <= 0.4f) {
                            r6.a aVar4 = p232p6.p.f41237d;
                            if (aVar4 == null || (num3 = aVar4.f41584p) == null || 1 != num3.intValue()) {
                                r6.a aVar5 = p232p6.p.f41237d;
                                if (aVar5 != null && (num2 = aVar5.f41584p) != null && 2 == num2.intValue()) {
                                    Float leftEyeOpenProbability2 = face3.getLeftEyeOpenProbability();
                                    Float rightEyeOpenProbability2 = face3.getRightEyeOpenProbability();
                                    if (leftEyeOpenProbability2 == null || rightEyeOpenProbability2 == null) {
                                        z8 = false;
                                    } else {
                                        z8 = leftEyeOpenProbability2.floatValue() < mVar.f1681o || rightEyeOpenProbability2.floatValue() < mVar.f1681o;
                                        ArrayList arrayList2 = mVar.f1684w;
                                        g0 g0Var9 = mVar.f1682p;
                                        int i12 = mVar.f1676e;
                                        if (i12 > 2) {
                                            if (arrayList2.size() > i12 / 2 && !z8 && arrayList2.size() != i12) {
                                                p232p6.p.f41245l.blink();
                                                do {
                                                    value20 = g0Var9.getValue();
                                                } while (!g0Var9.compareAndSet(value20, D6.i.a((D6.i) value20, D6.h.Blink, 0.0f, null, null, null, null, null, 126)));
                                            }
                                        } else if (i12 > 1) {
                                            if (arrayList2.size() >= 1 && !z8 && arrayList2.size() != i12) {
                                                p232p6.p.f41245l.blink();
                                                do {
                                                    value19 = g0Var9.getValue();
                                                } while (!g0Var9.compareAndSet(value19, D6.i.a((D6.i) value19, D6.h.Blink, 0.0f, null, null, null, null, null, 126)));
                                            }
                                        } else if (arrayList2.size() == 0 && !z8) {
                                            p232p6.p.f41245l.blink();
                                            do {
                                                value18 = g0Var9.getValue();
                                            } while (!g0Var9.compareAndSet(value18, D6.i.a((D6.i) value18, D6.h.Blink, 0.0f, null, null, null, null, null, 126)));
                                        }
                                    }
                                    g0 g0Var10 = mVar.f1682p;
                                    do {
                                        value15 = g0Var10.getValue();
                                    } while (!g0Var10.compareAndSet(value15, D6.i.a((D6.i) value15, D6.h.Capturing, 0.0f, null, null, null, null, null, 126)));
                                    Bitmap bitmapU2 = p118hf.a.u(imageProxy);
                                    if (bitmapU2 == null) {
                                        p232p6.p.f41245l.bitmapEmpty();
                                        break;
                                    } else {
                                        mVar.f1671C = System.currentTimeMillis();
                                        ArrayList arrayList3 = mVar.f1684w;
                                        int size2 = arrayList3.size();
                                        g0 g0Var11 = mVar.f1682p;
                                        int i13 = mVar.f1676e;
                                        int i14 = mVar.f1677f;
                                        if (size2 < i13) {
                                            arrayList3.add(AbstractC0198c.j("liveness"));
                                            do {
                                                value17 = g0Var11.getValue();
                                            } while (!g0Var11.compareAndSet(value17, D6.i.a((D6.i) value17, null, arrayList3.size() / i14, null, null, null, null, null, 125)));
                                            p232p6.p.f41245l.collectLiveness();
                                            r6.a aVar6 = p232p6.p.f41237d;
                                            if (aVar6 != null && (liveID$ILiveIDMonitor4 = aVar6.f41573e) != null) {
                                                p320v6.d dVar3 = p320v6.e.f43077e;
                                                String str7 = dVar3.f43071a;
                                                Pair pair11 = new Pair("event_desc", dVar3.f43072b);
                                                Integer num6 = p232p6.p.f41243j;
                                                Pair pair12 = new Pair("scene", Integer.valueOf(num6 != null ? num6.intValue() : -1));
                                                Pair pair13 = new Pair("current", Integer.valueOf(arrayList3.size()));
                                                Pair pair14 = new Pair("total", Integer.valueOf(i14));
                                                String str8 = mVar.f1670B;
                                                if (str8 == null) {
                                                    str8 = "";
                                                }
                                                Pair pair15 = new Pair("transactionId", str8);
                                                String str9 = p232p6.p.f41242i;
                                                if (str9 == null) {
                                                    str9 = "";
                                                }
                                                liveID$ILiveIDMonitor4.report(str7, G.h(pair11, pair12, pair13, pair14, pair15, new Pair("uuid", str9)));
                                                Unit unit = Unit.f38893a;
                                            }
                                        } else if (!z8) {
                                            Objects.toString(mVar.f1669A);
                                            int i15 = mVar.f1675d;
                                            Size size3 = mVar.f1678g;
                                            if (i15 == 2) {
                                                File fileK = AbstractC0198c.k();
                                                mVar.f1669A = fileK;
                                                AbstractC0198c.U(bitmapU2, fileK, size3);
                                            } else {
                                                File fileJ2 = AbstractC0198c.j("selfie");
                                                mVar.f1669A = fileJ2;
                                                AbstractC0198c.T(bitmapU2, fileJ2, size3);
                                            }
                                            mVar.f1672H = false;
                                            do {
                                                value16 = g0Var11.getValue();
                                            } while (!g0Var11.compareAndSet(value16, D6.i.a((D6.i) value16, null, 1.0f, null, mVar.f1669A, null, null, null, 117)));
                                            p232p6.p.f41245l.collectLiveness();
                                            r6.a aVar7 = p232p6.p.f41237d;
                                            if (aVar7 != null && (liveID$ILiveIDMonitor3 = aVar7.f41573e) != null) {
                                                p320v6.d dVar4 = p320v6.e.f43077e;
                                                String str10 = dVar4.f43071a;
                                                Pair pair16 = new Pair("event_desc", dVar4.f43072b);
                                                Integer num7 = p232p6.p.f41243j;
                                                Pair pair17 = new Pair("scene", Integer.valueOf(num7 != null ? num7.intValue() : -1));
                                                Pair pair18 = new Pair("current", Integer.valueOf(arrayList3.size() + 1));
                                                Pair pair19 = new Pair("total", Integer.valueOf(i14));
                                                String str11 = mVar.f1670B;
                                                if (str11 == null) {
                                                    str11 = "";
                                                }
                                                Pair pair20 = new Pair("transactionId", str11);
                                                String str12 = p232p6.p.f41242i;
                                                if (str12 == null) {
                                                    str12 = "";
                                                }
                                                liveID$ILiveIDMonitor3.report(str10, G.h(pair16, pair17, pair18, pair19, pair20, new Pair("uuid", str12)));
                                                Unit unit2 = Unit.f38893a;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Float smilingProbability = face3.getSmilingProbability();
                                boolean z12 = (smilingProbability != null ? smilingProbability.floatValue() : 0.0f) > mVar.f1680j;
                                ArrayList arrayList4 = mVar.f1684w;
                                g0 g0Var12 = mVar.f1682p;
                                int i16 = mVar.f1676e;
                                if (i16 > 2) {
                                    if (arrayList4.size() > i16 / 2 && !z12 && arrayList4.size() != i16) {
                                        p232p6.p.f41245l.smile();
                                        do {
                                            value26 = g0Var12.getValue();
                                        } while (!g0Var12.compareAndSet(value26, D6.i.a((D6.i) value26, D6.h.Smile, 0.0f, null, null, null, null, null, 126)));
                                    }
                                } else if (i16 > 1) {
                                    if (arrayList4.size() >= 1 && !z12 && arrayList4.size() != i16) {
                                        p232p6.p.f41245l.smile();
                                        do {
                                            value22 = g0Var12.getValue();
                                        } while (!g0Var12.compareAndSet(value22, D6.i.a((D6.i) value22, D6.h.Smile, 0.0f, null, null, null, null, null, 126)));
                                    }
                                } else if (arrayList4.size() == 0 && !z12) {
                                    p232p6.p.f41245l.smile();
                                    do {
                                        value21 = g0Var12.getValue();
                                    } while (!g0Var12.compareAndSet(value21, D6.i.a((D6.i) value21, D6.h.Smile, 0.0f, null, null, null, null, null, 126)));
                                }
                                do {
                                    value23 = g0Var12.getValue();
                                } while (!g0Var12.compareAndSet(value23, D6.i.a((D6.i) value23, D6.h.Capturing, 0.0f, null, null, null, null, null, 126)));
                                Bitmap bitmapU3 = p118hf.a.u(imageProxy);
                                if (bitmapU3 == null) {
                                    p232p6.p.f41245l.bitmapEmpty();
                                    break;
                                } else {
                                    mVar.f1671C = System.currentTimeMillis();
                                    int size4 = arrayList4.size();
                                    int i17 = mVar.f1677f;
                                    if (size4 < i16) {
                                        arrayList4.add(AbstractC0198c.j("liveness"));
                                        do {
                                            value25 = g0Var12.getValue();
                                        } while (!g0Var12.compareAndSet(value25, D6.i.a((D6.i) value25, null, arrayList4.size() / i17, null, null, null, null, null, 125)));
                                        p232p6.p.f41245l.collectLiveness();
                                        r6.a aVar8 = p232p6.p.f41237d;
                                        if (aVar8 != null && (liveID$ILiveIDMonitor6 = aVar8.f41573e) != null) {
                                            p320v6.d dVar5 = p320v6.e.f43077e;
                                            String str13 = dVar5.f43071a;
                                            Pair pair21 = new Pair("event_desc", dVar5.f43072b);
                                            Integer num8 = p232p6.p.f41243j;
                                            Pair pair22 = new Pair("scene", Integer.valueOf(num8 != null ? num8.intValue() : -1));
                                            Pair pair23 = new Pair("current", Integer.valueOf(arrayList4.size()));
                                            Pair pair24 = new Pair("total", Integer.valueOf(i17));
                                            String str14 = mVar.f1670B;
                                            if (str14 == null) {
                                                str14 = "";
                                            }
                                            Pair pair25 = new Pair("transactionId", str14);
                                            String str15 = p232p6.p.f41242i;
                                            if (str15 == null) {
                                                str15 = "";
                                            }
                                            liveID$ILiveIDMonitor6.report(str13, G.h(pair21, pair22, pair23, pair24, pair25, new Pair("uuid", str15)));
                                            Unit unit3 = Unit.f38893a;
                                        }
                                    } else if (!z12) {
                                        Objects.toString(mVar.f1669A);
                                        int i18 = mVar.f1675d;
                                        Size size5 = mVar.f1678g;
                                        if (i18 == 2) {
                                            File fileK2 = AbstractC0198c.k();
                                            mVar.f1669A = fileK2;
                                            AbstractC0198c.U(bitmapU3, fileK2, size5);
                                        } else {
                                            File fileJ3 = AbstractC0198c.j("selfie");
                                            mVar.f1669A = fileJ3;
                                            AbstractC0198c.T(bitmapU3, fileJ3, size5);
                                        }
                                        mVar.f1672H = false;
                                        do {
                                            value24 = g0Var12.getValue();
                                        } while (!g0Var12.compareAndSet(value24, D6.i.a((D6.i) value24, null, 1.0f, null, mVar.f1669A, null, null, null, 117)));
                                        p232p6.p.f41245l.collectLiveness();
                                        r6.a aVar9 = p232p6.p.f41237d;
                                        if (aVar9 != null && (liveID$ILiveIDMonitor5 = aVar9.f41573e) != null) {
                                            p320v6.d dVar6 = p320v6.e.f43077e;
                                            String str16 = dVar6.f43071a;
                                            Pair pair26 = new Pair("event_desc", dVar6.f43072b);
                                            Integer num9 = p232p6.p.f41243j;
                                            Pair pair27 = new Pair("scene", Integer.valueOf(num9 != null ? num9.intValue() : -1));
                                            Pair pair28 = new Pair("current", Integer.valueOf(arrayList4.size() + 1));
                                            Pair pair29 = new Pair("total", Integer.valueOf(i17));
                                            String str17 = mVar.f1670B;
                                            if (str17 == null) {
                                                str17 = "";
                                            }
                                            Pair pair30 = new Pair("transactionId", str17);
                                            String str18 = p232p6.p.f41242i;
                                            if (str18 == null) {
                                                str18 = "";
                                            }
                                            liveID$ILiveIDMonitor5.report(str16, G.h(pair26, pair27, pair28, pair29, pair30, new Pair("uuid", str18)));
                                            Unit unit4 = Unit.f38893a;
                                        }
                                    }
                                }
                            }
                        } else {
                            p232p6.p.f41245l.moveAway();
                            g0 g0Var13 = mVar.f1682p;
                            do {
                                value27 = g0Var13.getValue();
                            } while (!g0Var13.compareAndSet(value27, D6.i.a((D6.i) value27, D6.h.MoveAway, 0.0f, null, null, null, null, null, 126)));
                        }
                    } else {
                        p232p6.p.f41245l.ensureFaceInFrame();
                        g0 g0Var14 = mVar.f1682p;
                        do {
                            value29 = g0Var14.getValue();
                        } while (!g0Var14.compareAndSet(value29, D6.i.a((D6.i) value29, D6.h.EnsureFaceInFrame, 0.0f, null, null, null, null, null, 126)));
                    }
                } else {
                    p232p6.p.f41245l.ensureFaceInFrame();
                    g0 g0Var15 = mVar.f1682p;
                    do {
                        value30 = g0Var15.getValue();
                    } while (!g0Var15.compareAndSet(value30, D6.i.a((D6.i) value30, D6.h.EnsureFaceInFrame, 0.0f, null, null, null, null, null, 126)));
                    if (j6 > mVar.f1679i) {
                        p232p6.p.f41245l.timeOut();
                        mVar.f1672H = false;
                        do {
                            g0Var2 = mVar.f1682p;
                            value31 = g0Var2.getValue();
                        } while (!g0Var2.compareAndSet(value31, D6.i.a((D6.i) value31, null, 0.0f, null, null, D6.g.f1638d, null, null, 71)));
                    }
                }
                break;
        }
        return Unit.f38893a;
    }
}
