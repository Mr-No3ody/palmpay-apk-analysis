package androidx.camera.camera2.internal;

import E.C0212q;
import E.C0216v;
import Pa.C0525w;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.impl.C0967a;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C0995o;
import androidx.camera.core.impl.C0997p;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CamcorderProfileHelper f13307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1.c f13309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f13314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0997p f13316s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0966z0 f13317u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final He.a f13320x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13298a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13299b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13300c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13301d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f13302e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f13303f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f13304g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f13305h = new ArrayList();
    public final ArrayList t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p045d3.j f13318v = new p045d3.j(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0525w f13319w = new C0525w(13);

    public Y0(Context context, String str, androidx.camera.camera2.internal.compat.s sVar, CamcorderProfileHelper camcorderProfileHelper) throws C0212q {
        List listSingletonList;
        long[] jArr;
        int[] iArr;
        boolean z3;
        this.f13311n = false;
        this.f13312o = false;
        this.f13313p = false;
        this.f13314q = false;
        this.f13315r = false;
        str.getClass();
        this.f13306i = str;
        camcorderProfileHelper.getClass();
        this.f13307j = camcorderProfileHelper;
        this.f13309l = new p1.c(12);
        this.f13317u = C0966z0.b(context);
        try {
            androidx.camera.camera2.internal.compat.l lVarA = sVar.a(str);
            this.f13308k = lVarA;
            Integer num = (Integer) lVarA.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f13310m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) lVarA.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i7 : iArr2) {
                    if (i7 == 3) {
                        this.f13311n = true;
                    } else if (i7 == 6) {
                        this.f13312o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i7 == 16) {
                        this.f13315r = true;
                    }
                }
            }
            this.f13320x = new He.a(this.f13308k);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            androidx.camera.core.impl.L0 l5 = new androidx.camera.core.impl.L0();
            androidx.camera.core.impl.M0 m7 = androidx.camera.core.impl.M0.MAXIMUM;
            F.g(1, m7, 0L, l5);
            androidx.camera.core.impl.L0 l0B = F.b(arrayList2, l5);
            F.g(3, m7, 0L, l0B);
            androidx.camera.core.impl.L0 l0B2 = F.b(arrayList2, l0B);
            F.g(2, m7, 0L, l0B2);
            androidx.camera.core.impl.L0 l0B3 = F.b(arrayList2, l0B2);
            androidx.camera.core.impl.M0 m10 = androidx.camera.core.impl.M0.PREVIEW;
            l0B3.a(new C0995o(1, m10, 0L));
            F.g(3, m7, 0L, l0B3);
            androidx.camera.core.impl.L0 l0B4 = F.b(arrayList2, l0B3);
            l0B4.a(new C0995o(2, m10, 0L));
            F.g(3, m7, 0L, l0B4);
            androidx.camera.core.impl.L0 l0B5 = F.b(arrayList2, l0B4);
            l0B5.a(new C0995o(1, m10, 0L));
            F.g(1, m10, 0L, l0B5);
            androidx.camera.core.impl.L0 l0B6 = F.b(arrayList2, l0B5);
            l0B6.a(new C0995o(1, m10, 0L));
            F.g(2, m10, 0L, l0B6);
            androidx.camera.core.impl.L0 l0B7 = F.b(arrayList2, l0B6);
            l0B7.a(new C0995o(1, m10, 0L));
            l0B7.a(new C0995o(2, m10, 0L));
            F.g(3, m7, 0L, l0B7);
            arrayList2.add(l0B7);
            arrayList.addAll(arrayList2);
            int i10 = this.f13310m;
            androidx.camera.core.impl.M0 m11 = androidx.camera.core.impl.M0.RECORD;
            if (i10 == 0 || i10 == 1 || i10 == 3) {
                ArrayList arrayList3 = new ArrayList();
                androidx.camera.core.impl.L0 l6 = new androidx.camera.core.impl.L0();
                l6.a(new C0995o(1, m10, 0L));
                F.g(1, m11, 0L, l6);
                androidx.camera.core.impl.L0 l0B8 = F.b(arrayList3, l6);
                l0B8.a(new C0995o(1, m10, 0L));
                F.g(2, m11, 0L, l0B8);
                androidx.camera.core.impl.L0 l0B9 = F.b(arrayList3, l0B8);
                l0B9.a(new C0995o(2, m10, 0L));
                F.g(2, m11, 0L, l0B9);
                androidx.camera.core.impl.L0 l0B10 = F.b(arrayList3, l0B9);
                l0B10.a(new C0995o(1, m10, 0L));
                l0B10.a(new C0995o(1, m11, 0L));
                F.g(3, m11, 0L, l0B10);
                androidx.camera.core.impl.L0 l0B11 = F.b(arrayList3, l0B10);
                l0B11.a(new C0995o(1, m10, 0L));
                l0B11.a(new C0995o(2, m11, 0L));
                F.g(3, m11, 0L, l0B11);
                androidx.camera.core.impl.L0 l0B12 = F.b(arrayList3, l0B11);
                l0B12.a(new C0995o(2, m10, 0L));
                l0B12.a(new C0995o(2, m10, 0L));
                F.g(3, m7, 0L, l0B12);
                arrayList3.add(l0B12);
                arrayList.addAll(arrayList3);
            }
            androidx.camera.core.impl.M0 m12 = androidx.camera.core.impl.M0.VGA;
            if (i10 == 1 || i10 == 3) {
                ArrayList arrayList4 = new ArrayList();
                androidx.camera.core.impl.L0 l8 = new androidx.camera.core.impl.L0();
                l8.a(new C0995o(1, m10, 0L));
                F.g(1, m7, 0L, l8);
                androidx.camera.core.impl.L0 l0B13 = F.b(arrayList4, l8);
                l0B13.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B13);
                androidx.camera.core.impl.L0 l0B14 = F.b(arrayList4, l0B13);
                l0B14.a(new C0995o(2, m10, 0L));
                F.g(2, m7, 0L, l0B14);
                androidx.camera.core.impl.L0 l0B15 = F.b(arrayList4, l0B14);
                l0B15.a(new C0995o(1, m10, 0L));
                l0B15.a(new C0995o(1, m10, 0L));
                F.g(3, m7, 0L, l0B15);
                androidx.camera.core.impl.L0 l0B16 = F.b(arrayList4, l0B15);
                l0B16.a(new C0995o(2, m12, 0L));
                l0B16.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B16);
                androidx.camera.core.impl.L0 l0B17 = F.b(arrayList4, l0B16);
                l0B17.a(new C0995o(2, m12, 0L));
                l0B17.a(new C0995o(2, m10, 0L));
                F.g(2, m7, 0L, l0B17);
                arrayList4.add(l0B17);
                arrayList.addAll(arrayList4);
            }
            if (this.f13311n) {
                ArrayList arrayList5 = new ArrayList();
                androidx.camera.core.impl.L0 l10 = new androidx.camera.core.impl.L0();
                F.g(5, m7, 0L, l10);
                androidx.camera.core.impl.L0 l0B18 = F.b(arrayList5, l10);
                l0B18.a(new C0995o(1, m10, 0L));
                F.g(5, m7, 0L, l0B18);
                androidx.camera.core.impl.L0 l0B19 = F.b(arrayList5, l0B18);
                l0B19.a(new C0995o(2, m10, 0L));
                F.g(5, m7, 0L, l0B19);
                androidx.camera.core.impl.L0 l0B20 = F.b(arrayList5, l0B19);
                l0B20.a(new C0995o(1, m10, 0L));
                l0B20.a(new C0995o(1, m10, 0L));
                F.g(5, m7, 0L, l0B20);
                androidx.camera.core.impl.L0 l0B21 = F.b(arrayList5, l0B20);
                l0B21.a(new C0995o(1, m10, 0L));
                l0B21.a(new C0995o(2, m10, 0L));
                F.g(5, m7, 0L, l0B21);
                androidx.camera.core.impl.L0 l0B22 = F.b(arrayList5, l0B21);
                l0B22.a(new C0995o(2, m10, 0L));
                l0B22.a(new C0995o(2, m10, 0L));
                F.g(5, m7, 0L, l0B22);
                androidx.camera.core.impl.L0 l0B23 = F.b(arrayList5, l0B22);
                l0B23.a(new C0995o(1, m10, 0L));
                l0B23.a(new C0995o(3, m7, 0L));
                F.g(5, m7, 0L, l0B23);
                androidx.camera.core.impl.L0 l0B24 = F.b(arrayList5, l0B23);
                l0B24.a(new C0995o(2, m10, 0L));
                l0B24.a(new C0995o(3, m7, 0L));
                F.g(5, m7, 0L, l0B24);
                arrayList5.add(l0B24);
                arrayList.addAll(arrayList5);
            }
            if (this.f13312o && i10 == 0) {
                ArrayList arrayList6 = new ArrayList();
                androidx.camera.core.impl.L0 l11 = new androidx.camera.core.impl.L0();
                l11.a(new C0995o(1, m10, 0L));
                F.g(1, m7, 0L, l11);
                androidx.camera.core.impl.L0 l0B25 = F.b(arrayList6, l11);
                l0B25.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B25);
                androidx.camera.core.impl.L0 l0B26 = F.b(arrayList6, l0B25);
                l0B26.a(new C0995o(2, m10, 0L));
                F.g(2, m7, 0L, l0B26);
                arrayList6.add(l0B26);
                arrayList.addAll(arrayList6);
            }
            if (i10 == 3) {
                ArrayList arrayList7 = new ArrayList();
                androidx.camera.core.impl.L0 l12 = new androidx.camera.core.impl.L0();
                l12.a(new C0995o(1, m10, 0L));
                l12.a(new C0995o(1, m12, 0L));
                l12.a(new C0995o(2, m7, 0L));
                F.g(5, m7, 0L, l12);
                androidx.camera.core.impl.L0 l0B27 = F.b(arrayList7, l12);
                l0B27.a(new C0995o(1, m10, 0L));
                l0B27.a(new C0995o(1, m12, 0L));
                l0B27.a(new C0995o(3, m7, 0L));
                F.g(5, m7, 0L, l0B27);
                arrayList7.add(l0B27);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.f13298a;
            arrayList8.addAll(arrayList);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.f13309l.f41176b) == null) {
                listSingletonList = new ArrayList();
            } else {
                androidx.camera.core.impl.L0 l13 = ExtraSupportedSurfaceCombinationsQuirk.f13451a;
                String str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (this.f13306i.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f13451a);
                        listSingletonList = arrayList9;
                    }
                } else {
                    listSingletonList = ((!Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f13453c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.a()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f13452b) : Collections.EMPTY_LIST;
                }
            }
            arrayList8.addAll(listSingletonList);
            if (this.f13315r) {
                ArrayList arrayList10 = new ArrayList();
                androidx.camera.core.impl.L0 l14 = new androidx.camera.core.impl.L0();
                androidx.camera.core.impl.M0 m13 = androidx.camera.core.impl.M0.ULTRA_MAXIMUM;
                l14.a(new C0995o(2, m13, 0L));
                l14.a(new C0995o(1, m10, 0L));
                F.g(1, m11, 0L, l14);
                androidx.camera.core.impl.L0 l0B28 = F.b(arrayList10, l14);
                l0B28.a(new C0995o(3, m13, 0L));
                l0B28.a(new C0995o(1, m10, 0L));
                F.g(1, m11, 0L, l0B28);
                androidx.camera.core.impl.L0 l0B29 = F.b(arrayList10, l0B28);
                l0B29.a(new C0995o(5, m13, 0L));
                l0B29.a(new C0995o(1, m10, 0L));
                F.g(1, m11, 0L, l0B29);
                androidx.camera.core.impl.L0 l0B30 = F.b(arrayList10, l0B29);
                l0B30.a(new C0995o(2, m13, 0L));
                l0B30.a(new C0995o(1, m10, 0L));
                F.g(3, m7, 0L, l0B30);
                androidx.camera.core.impl.L0 l0B31 = F.b(arrayList10, l0B30);
                l0B31.a(new C0995o(3, m13, 0L));
                l0B31.a(new C0995o(1, m10, 0L));
                F.g(3, m7, 0L, l0B31);
                androidx.camera.core.impl.L0 l0B32 = F.b(arrayList10, l0B31);
                l0B32.a(new C0995o(5, m13, 0L));
                l0B32.a(new C0995o(1, m10, 0L));
                F.g(3, m7, 0L, l0B32);
                androidx.camera.core.impl.L0 l0B33 = F.b(arrayList10, l0B32);
                l0B33.a(new C0995o(2, m13, 0L));
                l0B33.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B33);
                androidx.camera.core.impl.L0 l0B34 = F.b(arrayList10, l0B33);
                l0B34.a(new C0995o(3, m13, 0L));
                l0B34.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B34);
                androidx.camera.core.impl.L0 l0B35 = F.b(arrayList10, l0B34);
                l0B35.a(new C0995o(5, m13, 0L));
                l0B35.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B35);
                androidx.camera.core.impl.L0 l0B36 = F.b(arrayList10, l0B35);
                l0B36.a(new C0995o(2, m13, 0L));
                l0B36.a(new C0995o(1, m10, 0L));
                F.g(5, m7, 0L, l0B36);
                androidx.camera.core.impl.L0 l0B37 = F.b(arrayList10, l0B36);
                l0B37.a(new C0995o(3, m13, 0L));
                l0B37.a(new C0995o(1, m10, 0L));
                F.g(5, m7, 0L, l0B37);
                androidx.camera.core.impl.L0 l0B38 = F.b(arrayList10, l0B37);
                l0B38.a(new C0995o(5, m13, 0L));
                l0B38.a(new C0995o(1, m10, 0L));
                F.g(5, m7, 0L, l0B38);
                arrayList10.add(l0B38);
                this.f13299b.addAll(arrayList10);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f13313p = zHasSystemFeature;
            androidx.camera.core.impl.M0 m14 = androidx.camera.core.impl.M0.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList11 = new ArrayList();
                androidx.camera.core.impl.L0 l15 = new androidx.camera.core.impl.L0();
                F.g(2, m14, 0L, l15);
                androidx.camera.core.impl.L0 l0B39 = F.b(arrayList11, l15);
                F.g(1, m14, 0L, l0B39);
                androidx.camera.core.impl.L0 l0B40 = F.b(arrayList11, l0B39);
                F.g(3, m14, 0L, l0B40);
                androidx.camera.core.impl.L0 l0B41 = F.b(arrayList11, l0B40);
                androidx.camera.core.impl.M0 m15 = androidx.camera.core.impl.M0.s720p;
                l0B41.a(new C0995o(2, m15, 0L));
                F.g(3, m14, 0L, l0B41);
                androidx.camera.core.impl.L0 l0B42 = F.b(arrayList11, l0B41);
                l0B42.a(new C0995o(1, m15, 0L));
                F.g(3, m14, 0L, l0B42);
                androidx.camera.core.impl.L0 l0B43 = F.b(arrayList11, l0B42);
                l0B43.a(new C0995o(2, m15, 0L));
                F.g(2, m14, 0L, l0B43);
                androidx.camera.core.impl.L0 l0B44 = F.b(arrayList11, l0B43);
                l0B44.a(new C0995o(2, m15, 0L));
                F.g(1, m14, 0L, l0B44);
                androidx.camera.core.impl.L0 l0B45 = F.b(arrayList11, l0B44);
                l0B45.a(new C0995o(1, m15, 0L));
                F.g(2, m14, 0L, l0B45);
                androidx.camera.core.impl.L0 l0B46 = F.b(arrayList11, l0B45);
                l0B46.a(new C0995o(1, m15, 0L));
                F.g(1, m14, 0L, l0B46);
                arrayList11.add(l0B46);
                this.f13300c.addAll(arrayList11);
            }
            if (this.f13320x.f3864b) {
                ArrayList arrayList12 = new ArrayList();
                androidx.camera.core.impl.L0 l16 = new androidx.camera.core.impl.L0();
                F.g(1, m7, 0L, l16);
                androidx.camera.core.impl.L0 l0B47 = F.b(arrayList12, l16);
                F.g(2, m7, 0L, l0B47);
                androidx.camera.core.impl.L0 l0B48 = F.b(arrayList12, l0B47);
                l0B48.a(new C0995o(1, m10, 0L));
                F.g(3, m7, 0L, l0B48);
                androidx.camera.core.impl.L0 l0B49 = F.b(arrayList12, l0B48);
                l0B49.a(new C0995o(1, m10, 0L));
                F.g(2, m7, 0L, l0B49);
                androidx.camera.core.impl.L0 l0B50 = F.b(arrayList12, l0B49);
                l0B50.a(new C0995o(2, m10, 0L));
                F.g(2, m7, 0L, l0B50);
                androidx.camera.core.impl.L0 l0B51 = F.b(arrayList12, l0B50);
                l0B51.a(new C0995o(1, m10, 0L));
                F.g(1, m11, 0L, l0B51);
                androidx.camera.core.impl.L0 l0B52 = F.b(arrayList12, l0B51);
                l0B52.a(new C0995o(1, m10, 0L));
                l0B52.a(new C0995o(1, m11, 0L));
                F.g(2, m11, 0L, l0B52);
                androidx.camera.core.impl.L0 l0B53 = F.b(arrayList12, l0B52);
                l0B53.a(new C0995o(1, m10, 0L));
                l0B53.a(new C0995o(1, m11, 0L));
                F.g(3, m11, 0L, l0B53);
                arrayList12.add(l0B53);
                this.f13303f.addAll(arrayList12);
            }
            int[] outputFormats = ((androidx.camera.camera2.internal.compat.n) this.f13308k.b().f6553a).getOutputFormats();
            int[] iArr3 = outputFormats == null ? null : (int[]) outputFormats.clone();
            if (iArr3 != null) {
                for (int i11 : iArr3) {
                    if (i11 == 4101) {
                        ArrayList arrayList13 = new ArrayList();
                        androidx.camera.core.impl.L0 l17 = new androidx.camera.core.impl.L0();
                        F.g(4, m7, 0L, l17);
                        androidx.camera.core.impl.L0 l0B54 = F.b(arrayList13, l17);
                        l0B54.a(new C0995o(1, m10, 0L));
                        F.g(4, m7, 0L, l0B54);
                        arrayList13.add(l0B54);
                        this.f13304g.addAll(arrayList13);
                        break;
                    }
                }
            }
            androidx.camera.camera2.internal.compat.l lVar = this.f13308k;
            C0971c c0971c = X0.f13293a;
            int i12 = Build.VERSION.SDK_INT;
            boolean z8 = (i12 < 33 || (jArr = (long[]) lVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.f13314q = z8;
            if (z8 && i12 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                androidx.camera.core.impl.L0 l18 = new androidx.camera.core.impl.L0();
                F.g(1, m14, 4L, l18);
                androidx.camera.core.impl.L0 l0B55 = F.b(arrayList14, l18);
                F.g(2, m14, 4L, l0B55);
                androidx.camera.core.impl.L0 l0B56 = F.b(arrayList14, l0B55);
                F.g(1, m11, 3L, l0B56);
                androidx.camera.core.impl.L0 l0B57 = F.b(arrayList14, l0B56);
                F.g(2, m11, 3L, l0B57);
                androidx.camera.core.impl.L0 l0B58 = F.b(arrayList14, l0B57);
                F.g(3, m7, 2L, l0B58);
                androidx.camera.core.impl.L0 l0B59 = F.b(arrayList14, l0B58);
                F.g(2, m7, 2L, l0B59);
                androidx.camera.core.impl.L0 l0B60 = F.b(arrayList14, l0B59);
                l0B60.a(new C0995o(1, m10, 1L));
                F.g(3, m7, 2L, l0B60);
                androidx.camera.core.impl.L0 l0B61 = F.b(arrayList14, l0B60);
                l0B61.a(new C0995o(1, m10, 1L));
                F.g(2, m7, 2L, l0B61);
                androidx.camera.core.impl.L0 l0B62 = F.b(arrayList14, l0B61);
                l0B62.a(new C0995o(1, m10, 1L));
                F.g(1, m11, 3L, l0B62);
                androidx.camera.core.impl.L0 l0B63 = F.b(arrayList14, l0B62);
                l0B63.a(new C0995o(1, m10, 1L));
                F.g(2, m11, 3L, l0B63);
                androidx.camera.core.impl.L0 l0B64 = F.b(arrayList14, l0B63);
                l0B64.a(new C0995o(1, m10, 1L));
                F.g(2, m10, 1L, l0B64);
                androidx.camera.core.impl.L0 l0B65 = F.b(arrayList14, l0B64);
                l0B65.a(new C0995o(1, m10, 1L));
                l0B65.a(new C0995o(1, m11, 3L));
                F.g(3, m11, 2L, l0B65);
                androidx.camera.core.impl.L0 l0B66 = F.b(arrayList14, l0B65);
                l0B66.a(new C0995o(1, m10, 1L));
                l0B66.a(new C0995o(2, m11, 3L));
                F.g(3, m11, 2L, l0B66);
                androidx.camera.core.impl.L0 l0B67 = F.b(arrayList14, l0B66);
                l0B67.a(new C0995o(1, m10, 1L));
                l0B67.a(new C0995o(2, m10, 1L));
                F.g(3, m7, 2L, l0B67);
                arrayList14.add(l0B67);
                this.f13305h.addAll(arrayList14);
            }
            androidx.camera.camera2.internal.compat.l lVar2 = this.f13308k;
            if (i12 < 33 || (iArr = (int[]) lVar2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z3 = false;
                break;
            }
            int length = iArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    z3 = false;
                    break;
                } else {
                    if (iArr[i13] == 2) {
                        z3 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z3 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList15 = new ArrayList();
                androidx.camera.core.impl.L0 l19 = new androidx.camera.core.impl.L0();
                F.g(1, m14, 0L, l19);
                androidx.camera.core.impl.L0 l0B68 = F.b(arrayList15, l19);
                F.g(2, m14, 0L, l0B68);
                androidx.camera.core.impl.L0 l0B69 = F.b(arrayList15, l0B68);
                l0B69.a(new C0995o(1, m14, 0L));
                F.g(3, m7, 0L, l0B69);
                androidx.camera.core.impl.L0 l0B70 = F.b(arrayList15, l0B69);
                l0B70.a(new C0995o(2, m14, 0L));
                F.g(3, m7, 0L, l0B70);
                androidx.camera.core.impl.L0 l0B71 = F.b(arrayList15, l0B70);
                l0B71.a(new C0995o(1, m14, 0L));
                F.g(2, m7, 0L, l0B71);
                androidx.camera.core.impl.L0 l0B72 = F.b(arrayList15, l0B71);
                l0B72.a(new C0995o(2, m14, 0L));
                F.g(2, m7, 0L, l0B72);
                androidx.camera.core.impl.L0 l0B73 = F.b(arrayList15, l0B72);
                l0B73.a(new C0995o(1, m10, 0L));
                F.g(1, m14, 0L, l0B73);
                androidx.camera.core.impl.L0 l0B74 = F.b(arrayList15, l0B73);
                l0B74.a(new C0995o(2, m10, 0L));
                F.g(1, m14, 0L, l0B74);
                androidx.camera.core.impl.L0 l0B75 = F.b(arrayList15, l0B74);
                l0B75.a(new C0995o(1, m10, 0L));
                F.g(2, m14, 0L, l0B75);
                androidx.camera.core.impl.L0 l0B76 = F.b(arrayList15, l0B75);
                l0B76.a(new C0995o(2, m10, 0L));
                F.g(2, m14, 0L, l0B76);
                arrayList15.add(l0B76);
                this.f13301d.addAll(arrayList15);
            }
            b();
        } catch (androidx.camera.camera2.internal.compat.a e10) {
            throw new C0212q(e10);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i7, boolean z3) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i7 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i7);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        androidx.camera.core.impl.utils.d dVar = new androidx.camera.core.impl.utils.d(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), dVar);
        Size size2 = androidx.camera.core.internal.utils.d.f14361a;
        if (z3 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i7)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    public static int e(Range range, Range range2) {
        p118hf.a.k((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(C0922d c0922d, List list) {
        List list2;
        HashMap map = this.f13302e;
        if (map.containsKey(c0922d)) {
            list2 = (List) map.get(c0922d);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z3 = c0922d.f13494d;
            int i7 = c0922d.f13491a;
            if (!z3) {
                int i10 = c0922d.f13492b;
                if (i10 == 8) {
                    if (i7 != 1) {
                        ArrayList arrayList2 = this.f13298a;
                        if (i7 != 2) {
                            if (c0922d.f13493c) {
                                arrayList2 = this.f13301d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f13299b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f13300c;
                    }
                } else if (i10 == 10 && i7 == 0) {
                    arrayList.addAll(this.f13303f);
                }
            } else if (i7 == 0) {
                arrayList.addAll(this.f13304g);
            }
            map.put(c0922d, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = ((androidx.camera.core.impl.L0) it.next()).c(list) != null;
            if (z8) {
                break;
            }
        }
        return z8;
    }

    public final void b() {
        Size size;
        Size size2;
        Size size3;
        Size sizeE = this.f13317u.e();
        try {
            int i7 = Integer.parseInt(this.f13306i);
            CamcorderProfileHelper camcorderProfileHelper = this.f13307j;
            CamcorderProfile camcorderProfile = null;
            CamcorderProfile camcorderProfile2 = camcorderProfileHelper.hasProfile(i7, 1) ? camcorderProfileHelper.get(i7, 1) : null;
            if (camcorderProfile2 == null) {
                Size size4 = androidx.camera.core.internal.utils.d.f14364d;
                if (camcorderProfileHelper.hasProfile(i7, 10)) {
                    camcorderProfile = camcorderProfileHelper.get(i7, 10);
                } else if (camcorderProfileHelper.hasProfile(i7, 8)) {
                    camcorderProfile = camcorderProfileHelper.get(i7, 8);
                } else if (camcorderProfileHelper.hasProfile(i7, 12)) {
                    camcorderProfile = camcorderProfileHelper.get(i7, 12);
                } else if (camcorderProfileHelper.hasProfile(i7, 6)) {
                    camcorderProfile = camcorderProfileHelper.get(i7, 6);
                } else if (camcorderProfileHelper.hasProfile(i7, 5)) {
                    camcorderProfile = camcorderProfileHelper.get(i7, 5);
                } else if (camcorderProfileHelper.hasProfile(i7, 4)) {
                    camcorderProfile = camcorderProfileHelper.get(i7, 4);
                }
                if (camcorderProfile != null) {
                    size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                } else {
                    size3 = size4;
                }
                this.f13316s = new C0997p(androidx.camera.core.internal.utils.d.f14363c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((androidx.camera.camera2.internal.compat.n) this.f13308k.b().f6553a).f13411a).getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = androidx.camera.core.internal.utils.d.f14364d;
            } else {
                Arrays.sort(outputSizes, new androidx.camera.core.impl.utils.d(true));
                int length = outputSizes.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Size size5 = outputSizes[i10];
                        int width = size5.getWidth();
                        Size size6 = androidx.camera.core.internal.utils.d.f14366f;
                        if (width <= size6.getWidth() && size5.getHeight() <= size6.getHeight()) {
                            size2 = size5;
                            break;
                        }
                        i10++;
                    } else {
                        size = androidx.camera.core.internal.utils.d.f14364d;
                    }
                }
            }
            size2 = size;
            break;
        }
        size3 = size2;
        this.f13316s = new C0997p(androidx.camera.core.internal.utils.d.f14363c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
    }

    public final List d(C0922d c0922d, List list) {
        C0971c c0971c = X0.f13293a;
        if (c0922d.f13491a != 0 || c0922d.f13492b != 8) {
            return null;
        }
        Iterator it = this.f13305h.iterator();
        while (it.hasNext()) {
            List listC = ((androidx.camera.core.impl.L0) it.next()).c(list);
            if (listC != null) {
                return listC;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:431:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:432:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:453:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:501:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:588:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:590:0x0d91  */
    /* JADX WARN: Code duplicated, block: B:592:0x0da3  */
    /* JADX WARN: Code duplicated, block: B:594:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:596:0x0db4  */
    /* JADX WARN: Code duplicated, block: B:598:0x0dc0  */
    /* JADX WARN: Code duplicated, block: B:600:0x0dc8  */
    /* JADX WARN: Code duplicated, block: B:609:0x0de7  */
    /* JADX WARN: Code duplicated, block: B:611:0x0df1  */
    /* JADX WARN: Code duplicated, block: B:613:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:751:0x0e1b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0dde A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0dd8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x0dd2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Pair g(int i7, List list, Map map, boolean z3, boolean z8) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        HashMap map2;
        HashMap map3;
        ArrayList arrayList;
        HashMap map4;
        ArrayList arrayList2;
        List list2;
        String str;
        int i11;
        C0216v c0216v;
        Range range;
        List<C0967a> list3;
        HashMap map5;
        List list4;
        String str2;
        String str3;
        ArrayList arrayList3;
        HashMap map6;
        int i12;
        String str4;
        HashMap map7;
        List list5;
        List list6;
        Range range2;
        HashMap map8;
        int i13;
        int i14;
        HashMap map9;
        int i15;
        long j6;
        UseCaseConfig useCaseConfig;
        C0993n c0993n;
        androidx.camera.camera2.impl.b bVarA;
        C0967a c0967a;
        androidx.camera.camera2.impl.b bVarA2;
        C0991m c0991m;
        Size size;
        Range range3;
        C0216v c0216v2;
        Range range4;
        Range range5;
        Range[] rangeArr;
        Range range6;
        Range range7;
        int i16;
        Range range8;
        Range range9;
        List list7;
        Range range10;
        List list8;
        long[] jArr;
        int i17;
        int outputMinFrameDuration;
        Rational rational;
        Size sizeA;
        HashMap map10;
        C0216v c0216v3;
        String str5;
        int outputMinFrameDuration2;
        Iterator it;
        ArrayList arrayList4;
        He.a aVar;
        C0216v c0216vC;
        ArrayList arrayList5;
        Map map11 = map;
        C0966z0 c0966z0 = this.f13317u;
        c0966z0.f13704b = c0966z0.a();
        if (this.f13316s == null) {
            b();
        } else {
            Size sizeE = this.f13317u.e();
            C0997p c0997p = this.f13316s;
            this.f13316s = new C0997p(c0997p.f14116a, c0997p.f14117b, sizeE, c0997p.f14119d, c0997p.f14120e, c0997p.f14121f, c0997p.f14122g);
        }
        ArrayList<UseCaseConfig> arrayList6 = new ArrayList(map11.keySet());
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            int surfaceOccupancyPriority = ((UseCaseConfig) it2.next()).getSurfaceOccupancyPriority(0);
            if (!arrayList8.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList8.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList8);
        Collections.reverse(arrayList8);
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Integer) it3.next()).intValue();
            for (UseCaseConfig useCaseConfig2 : arrayList6) {
                if (iIntValue == useCaseConfig2.getSurfaceOccupancyPriority(0)) {
                    arrayList7.add(Integer.valueOf(arrayList6.indexOf(useCaseConfig2)));
                }
            }
        }
        He.a aVar2 = this.f13320x;
        aVar2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            linkedHashSet.add(((C0967a) it4.next()).f14010d);
        }
        androidx.camera.camera2.internal.compat.params.b bVar = (androidx.camera.camera2.internal.compat.params.b) aVar2.f3866d;
        Set setC = bVar.c();
        HashSet hashSet = new HashSet(setC);
        Iterator it5 = linkedHashSet.iterator();
        while (it5.hasNext()) {
            He.a.k(hashSet, (C0216v) it5.next(), bVar);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            UseCaseConfig useCaseConfig3 = (UseCaseConfig) arrayList6.get(((Integer) it6.next()).intValue());
            C0216v dynamicRange = useCaseConfig3.getDynamicRange();
            if (Objects.equals(dynamicRange, C0216v.f2121c)) {
                arrayList11.add(useCaseConfig3);
                arrayList5 = arrayList7;
            } else {
                int i18 = dynamicRange.f2128a;
                arrayList5 = arrayList7;
                if (i18 != 2) {
                    int i19 = dynamicRange.f2129b;
                    if ((i18 == 0 || i19 != 0) && (i18 != 0 || i19 == 0)) {
                        arrayList9.add(useCaseConfig3);
                    } else {
                        arrayList10.add(useCaseConfig3);
                    }
                } else {
                    arrayList10.add(useCaseConfig3);
                }
            }
            arrayList7 = arrayList5;
        }
        ArrayList arrayList12 = arrayList7;
        HashMap map12 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList13 = new ArrayList();
        arrayList13.addAll(arrayList9);
        arrayList13.addAll(arrayList10);
        arrayList13.addAll(arrayList11);
        Iterator it7 = arrayList13.iterator();
        while (true) {
            boolean zHasNext = it7.hasNext();
            C0216v c0216v4 = C0216v.f2122d;
            if (!zHasNext) {
                ArrayList arrayList14 = arrayList6;
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        Iterator it9 = map11.keySet().iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                z10 = false;
                                break;
                            }
                            if (((UseCaseConfig) it9.next()).getInputFormat() == 4101) {
                            }
                        }
                    } else if (((C0967a) it8.next()).f14008b == 4101) {
                    }
                    z10 = true;
                    break;
                }
                Iterator it10 = map12.values().iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        i10 = 8;
                        break;
                    }
                    if (((C0216v) it10.next()).f2129b == 10) {
                        i10 = 10;
                        break;
                    }
                }
                String str6 = this.f13306i;
                if (i7 != 0 && z10) {
                    throw new IllegalArgumentException(C0.G.q("Camera device id is ", str6, ". Ultra HDR is not currently supported in ", i7 != 1 ? i7 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                if (i7 != 0 && i10 == 10) {
                    throw new IllegalArgumentException(C0.G.q("Camera device id is ", str6, ". 10 bit dynamic range is not currently supported in ", i7 != 1 ? i7 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                C0922d c0922d = new C0922d(i7, i10, z3, z10);
                ArrayList arrayList15 = new ArrayList();
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList15.add(((C0967a) it11.next()).f14007a);
                }
                androidx.camera.core.impl.utils.d dVar = new androidx.camera.core.impl.utils.d(false);
                for (UseCaseConfig useCaseConfig4 : map11.keySet()) {
                    List list9 = (List) map11.get(useCaseConfig4);
                    p118hf.a.g((list9 == null || list9.isEmpty()) ? false : true, "No available output size is found for " + useCaseConfig4 + Consts.DOT);
                    Size size2 = (Size) Collections.min(list9, dVar);
                    int inputFormat = useCaseConfig4.getInputFormat();
                    arrayList15.add(androidx.camera.core.impl.N0.b(c0922d.f13491a, inputFormat, size2, i(inputFormat)));
                }
                boolean zA = a(c0922d, arrayList15);
                String str7 = " New configs: ";
                String str8 = "No supported surface combination is found for camera device - Id : ";
                if (!zA) {
                    throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f13306i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList14);
                }
                Iterator it12 = list.iterator();
                Range rangeIntersect = null;
                while (it12.hasNext()) {
                    Range range11 = ((C0967a) it12.next()).f14013g;
                    if (rangeIntersect == null) {
                        rangeIntersect = range11;
                    } else if (range11 != null) {
                        try {
                            rangeIntersect = rangeIntersect.intersect(range11);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                Iterator it13 = arrayList12.iterator();
                while (it13.hasNext()) {
                    ArrayList arrayList16 = arrayList14;
                    Range<Integer> targetFrameRate = ((UseCaseConfig) arrayList16.get(((Integer) it13.next()).intValue())).getTargetFrameRate(null);
                    if (rangeIntersect == null) {
                        rangeIntersect = targetFrameRate;
                    } else if (targetFrameRate != null) {
                        try {
                            rangeIntersect = rangeIntersect.intersect(targetFrameRate);
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    arrayList14 = arrayList16;
                }
                ArrayList arrayList17 = arrayList14;
                HashMap map13 = new HashMap();
                Iterator it14 = map11.keySet().iterator();
                while (true) {
                    z11 = zA;
                    if (!it14.hasNext()) {
                        break;
                    }
                    UseCaseConfig useCaseConfig5 = (UseCaseConfig) it14.next();
                    ArrayList arrayList18 = new ArrayList();
                    HashMap map14 = new HashMap();
                    for (Size size3 : (List) map11.get(useCaseConfig5)) {
                        int inputFormat2 = useCaseConfig5.getInputFormat();
                        Range range12 = rangeIntersect;
                        Iterator it15 = it14;
                        C0995o c0995oB = androidx.camera.core.impl.N0.b(c0922d.f13491a, inputFormat2, size3, i(inputFormat2));
                        if (range12 != null) {
                            map10 = map12;
                            try {
                                c0216v3 = c0216v4;
                                str5 = str7;
                                try {
                                    outputMinFrameDuration2 = (int) (1.0E9d / ((StreamConfigurationMap) this.f13308k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(inputFormat2, size3));
                                } catch (Exception unused3) {
                                    outputMinFrameDuration2 = 0;
                                }
                            } catch (Exception unused4) {
                                c0216v3 = c0216v4;
                                str5 = str7;
                            }
                        } else {
                            map10 = map12;
                            c0216v3 = c0216v4;
                            str5 = str7;
                            outputMinFrameDuration2 = Integer.MAX_VALUE;
                        }
                        androidx.camera.core.impl.M0 m7 = c0995oB.f14114b;
                        Set hashSet2 = (Set) map14.get(m7);
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                            map14.put(m7, hashSet2);
                        }
                        if (!hashSet2.contains(Integer.valueOf(outputMinFrameDuration2))) {
                            arrayList18.add(size3);
                            hashSet2.add(Integer.valueOf(outputMinFrameDuration2));
                        }
                        c0216v4 = c0216v3;
                        rangeIntersect = range12;
                        it14 = it15;
                        map12 = map10;
                        str7 = str5;
                    }
                    map13.put(useCaseConfig5, arrayList18);
                    map11 = map;
                    zA = z11;
                    map12 = map12;
                }
                Range range13 = rangeIntersect;
                HashMap map15 = map12;
                C0216v c0216v5 = c0216v4;
                String str9 = str7;
                ArrayList arrayList19 = new ArrayList();
                Iterator it16 = arrayList12.iterator();
                while (it16.hasNext()) {
                    UseCaseConfig useCaseConfig6 = (UseCaseConfig) arrayList17.get(((Integer) it16.next()).intValue());
                    List<Size> list10 = (List) map13.get(useCaseConfig6);
                    int inputFormat3 = useCaseConfig6.getInputFormat();
                    p045d3.j jVar = this.f13318v;
                    androidx.camera.camera2.internal.compat.l lVar = this.f13308k;
                    jVar.getClass();
                    char c6 = (((Nexus4AndroidLTargetAspectRatioQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) Z4.e.g(lVar).b(AspectRatioLegacyApi21Quirk.class)) == null) ? (char) 3 : (char) 2;
                    if (c6 == 0) {
                        rational = androidx.camera.core.impl.utils.b.f14143a;
                    } else if (c6 == 1) {
                        rational = androidx.camera.core.impl.utils.b.f14145c;
                    } else if (c6 != 2) {
                        rational = null;
                    } else {
                        Size size4 = (Size) i(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).f14121f.get(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
                        rational = new Rational(size4.getWidth(), size4.getHeight());
                    }
                    if (rational != null) {
                        ArrayList arrayList20 = new ArrayList();
                        ArrayList arrayList21 = new ArrayList();
                        for (Size size5 : list10) {
                            Rational rational2 = androidx.camera.core.impl.utils.b.f14143a;
                            if (androidx.camera.core.impl.utils.b.a(size5, rational, androidx.camera.core.internal.utils.d.f14363c)) {
                                arrayList20.add(size5);
                            } else {
                                arrayList21.add(size5);
                            }
                        }
                        arrayList21.addAll(0, arrayList20);
                        list10 = arrayList21;
                    }
                    C0525w c0525w = this.f13319w;
                    int iA = androidx.camera.core.impl.N0.a(inputFormat3);
                    if (((ExtraCroppingQuirk) c0525w.f7166b) != null && (sizeA = ExtraCroppingQuirk.a(iA)) != null) {
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(sizeA);
                        for (Size size6 : list10) {
                            if (!size6.equals(sizeA)) {
                                arrayList22.add(size6);
                            }
                        }
                        list10 = arrayList22;
                    }
                    arrayList19.add(list10);
                }
                Iterator it17 = arrayList19.iterator();
                int size7 = 1;
                while (it17.hasNext()) {
                    size7 *= ((List) it17.next()).size();
                }
                if (size7 == 0) {
                    throw new IllegalArgumentException("Failed to find supported resolutions.");
                }
                ArrayList arrayList23 = new ArrayList();
                for (int i20 = 0; i20 < size7; i20++) {
                    arrayList23.add(new ArrayList());
                }
                int size8 = size7 / ((List) arrayList19.get(0)).size();
                int i21 = size7;
                for (int i22 = 0; i22 < arrayList19.size(); i22++) {
                    List list11 = (List) arrayList19.get(i22);
                    for (int i23 = 0; i23 < size7; i23++) {
                        ((List) arrayList23.get(i23)).add((Size) list11.get((i23 % i21) / size8));
                    }
                    if (i22 < arrayList19.size() - 1) {
                        i21 = size8;
                        size8 /= ((List) arrayList19.get(i22 + 1)).size();
                    }
                }
                HashMap map16 = new HashMap();
                HashMap map17 = new HashMap();
                HashMap map18 = new HashMap();
                HashMap map19 = new HashMap();
                C0971c c0971c = X0.f13293a;
                Iterator it18 = list.iterator();
                while (true) {
                    if (!it18.hasNext()) {
                        Iterator it19 = arrayList17.iterator();
                        while (true) {
                            if (!it19.hasNext()) {
                                z12 = false;
                                break;
                            }
                            UseCaseConfig useCaseConfig7 = (UseCaseConfig) it19.next();
                            if (X0.c(useCaseConfig7, useCaseConfig7.getCaptureType())) {
                            }
                        }
                    } else {
                        C0967a c0967a2 = (C0967a) it18.next();
                        if (X0.c(c0967a2.f14012f, (androidx.camera.core.impl.T0) c0967a2.f14011e.get(0))) {
                        }
                    }
                    z12 = true;
                    break;
                }
                Iterator it20 = list.iterator();
                ArrayList arrayList24 = arrayList17;
                int iMin = Integer.MAX_VALUE;
                while (it20.hasNext()) {
                    C0967a c0967a3 = (C0967a) it20.next();
                    boolean z13 = z12;
                    Iterator it21 = it20;
                    try {
                        outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f13308k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(c0967a3.f14008b, c0967a3.f14009c));
                    } catch (Exception unused5) {
                        outputMinFrameDuration = 0;
                    }
                    iMin = Math.min(iMin, outputMinFrameDuration);
                    z12 = z13;
                    it20 = it21;
                }
                boolean z14 = z12;
                String str10 = "SurfaceConfig does not map to any use case";
                if (!this.f13314q || z14) {
                    map2 = map18;
                    map3 = map19;
                    arrayList = arrayList23;
                    map4 = map16;
                    arrayList2 = arrayList12;
                    list2 = null;
                    str = "SurfaceConfig does not map to any use case";
                    i11 = iMin;
                    c0216v = c0216v5;
                    range = range13;
                    list3 = list;
                    map5 = map17;
                    list4 = null;
                } else {
                    Iterator it22 = arrayList23.iterator();
                    List list12 = null;
                    Range range14 = range13;
                    loop25: while (true) {
                        if (!it22.hasNext()) {
                            map2 = map18;
                            map3 = map19;
                            arrayList = arrayList23;
                            map4 = map16;
                            arrayList2 = arrayList12;
                            list2 = null;
                            str = str10;
                            i11 = iMin;
                            c0216v = c0216v5;
                            range10 = range14;
                            list3 = list;
                            map5 = map17;
                            list8 = list12;
                            break;
                        }
                        arrayList = arrayList23;
                        ArrayList arrayList25 = arrayList12;
                        list2 = null;
                        str = str10;
                        c0216v = c0216v5;
                        range10 = range14;
                        list3 = list;
                        Pair pairH = h(i7, list3, (List) it22.next(), arrayList24, arrayList25, iMin, map18, map19);
                        HashMap map20 = map19;
                        i11 = iMin;
                        HashMap map21 = map18;
                        map3 = map20;
                        List listD = d(c0922d, (List) pairH.first);
                        arrayList2 = arrayList25;
                        if (listD != null) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < listD.size()) {
                                    map4 = map16;
                                    map5 = map17;
                                    long j10 = ((C0995o) ((androidx.camera.core.impl.N0) listD.get(i24))).f14115c;
                                    boolean zContainsKey = map21.containsKey(Integer.valueOf(i24));
                                    List list13 = listD;
                                    androidx.camera.core.impl.T0 t1 = androidx.camera.core.impl.T0.f13978e;
                                    if (zContainsKey) {
                                        C0967a c0967a4 = (C0967a) map21.get(Integer.valueOf(i24));
                                        i17 = i24;
                                        int size9 = c0967a4.f14011e.size();
                                        List list14 = c0967a4.f14011e;
                                        map2 = map21;
                                        if (size9 == 1) {
                                            t1 = (androidx.camera.core.impl.T0) list14.get(0);
                                        }
                                        if (!X0.b(t1, j10, list14)) {
                                            list8 = null;
                                        }
                                        i24 = i17 + 1;
                                        map16 = map4;
                                        map17 = map5;
                                        listD = list13;
                                        map21 = map2;
                                    } else {
                                        i17 = i24;
                                        map2 = map21;
                                        if (!map3.containsKey(Integer.valueOf(i17))) {
                                            throw new AssertionError(str);
                                        }
                                        UseCaseConfig useCaseConfig8 = (UseCaseConfig) map3.get(Integer.valueOf(i17));
                                        if (!X0.b(useCaseConfig8.getCaptureType(), j10, useCaseConfig8.getCaptureType() == t1 ? (List) ((androidx.camera.core.streamsharing.f) useCaseConfig8).retrieveOption(androidx.camera.core.streamsharing.f.f14485b) : Collections.EMPTY_LIST)) {
                                            list8 = null;
                                        }
                                        i24 = i17 + 1;
                                        map16 = map4;
                                        map17 = map5;
                                        listD = list13;
                                        map21 = map2;
                                    }
                                } else {
                                    list8 = listD;
                                    map2 = map21;
                                    map4 = map16;
                                    map5 = map17;
                                }
                            }
                        } else {
                            list8 = listD;
                            map2 = map21;
                            map4 = map16;
                            map5 = map17;
                        }
                        if (list8 != null) {
                            androidx.camera.camera2.internal.compat.l lVar2 = this.f13308k;
                            if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) lVar2.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
                                HashSet hashSet3 = new HashSet();
                                for (long j11 : jArr) {
                                    hashSet3.add(Long.valueOf(j11));
                                }
                                Iterator it23 = list8.iterator();
                                do {
                                    if (!it23.hasNext()) {
                                        break loop25;
                                    }
                                } while (hashSet3.contains(Long.valueOf(((C0995o) ((androidx.camera.core.impl.N0) it23.next())).f14115c)));
                            }
                            list12 = null;
                        } else {
                            list12 = list8;
                        }
                        map2.clear();
                        map3.clear();
                        iMin = i11;
                        str10 = str;
                        map16 = map4;
                        map17 = map5;
                        arrayList23 = arrayList;
                        map19 = map3;
                        range14 = range10;
                        c0216v5 = c0216v;
                        arrayList12 = arrayList2;
                        map18 = map2;
                    }
                    if (list8 == null && !z11) {
                        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f13306i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list3 + str9 + arrayList24);
                    }
                    list4 = list8;
                    range = range10;
                }
                Iterator it24 = arrayList.iterator();
                List list15 = list2;
                List list16 = list15;
                int i25 = Integer.MAX_VALUE;
                int i26 = Integer.MAX_VALUE;
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    if (!it24.hasNext()) {
                        str2 = str9;
                        str3 = str8;
                        arrayList3 = arrayList2;
                        map6 = map2;
                        i12 = 0;
                        str4 = str;
                        map7 = map3;
                        list5 = list15;
                        list6 = list16;
                        break;
                    }
                    List list17 = (List) it24.next();
                    int i27 = i11;
                    str2 = str9;
                    Iterator it25 = it24;
                    str3 = str8;
                    map6 = map2;
                    int i28 = i25;
                    int i29 = i26;
                    str4 = str;
                    arrayList3 = arrayList2;
                    map7 = map3;
                    i12 = 0;
                    Pair pairH2 = h(i7, list3, list17, arrayList24, arrayList3, i27, null, null);
                    List list18 = (List) pairH2.first;
                    int iIntValue2 = ((Integer) pairH2.second).intValue();
                    boolean z17 = range == null || i27 <= iIntValue2 || iIntValue2 >= ((Integer) range.getLower()).intValue();
                    if (z15 || !a(c0922d, list18)) {
                        list7 = list17;
                    } else {
                        list7 = list17;
                        if (i28 == Integer.MAX_VALUE || i28 < iIntValue2) {
                            i28 = iIntValue2;
                            list15 = list7;
                        }
                        if (z17) {
                            if (z16) {
                                i25 = iIntValue2;
                                i26 = i29;
                                list6 = list16;
                                list5 = list7;
                                break;
                            }
                            i28 = iIntValue2;
                            list15 = list7;
                            z15 = true;
                        }
                    }
                    if (list4 != null && !z16 && d(c0922d, list18) != null) {
                        if (i29 == Integer.MAX_VALUE || i29 < iIntValue2) {
                            i29 = iIntValue2;
                            list16 = list7;
                        }
                        if (!z17) {
                            continue;
                        } else {
                            if (z15) {
                                i26 = iIntValue2;
                                i25 = i28;
                                list5 = list15;
                                list6 = list7;
                                break;
                            }
                            i29 = iIntValue2;
                            list16 = list7;
                            z16 = true;
                        }
                    }
                    arrayList2 = arrayList3;
                    i11 = i27;
                    map3 = map7;
                    i26 = i29;
                    i25 = i28;
                    str9 = str2;
                    str = str4;
                    it24 = it25;
                    map2 = map6;
                    str8 = str3;
                }
                if (list5 == null) {
                    throw new IllegalArgumentException(str3 + this.f13306i + " and Hardware level: " + this.f13310m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list3 + str2 + arrayList24);
                }
                if (range != null) {
                    range5 = C0993n.f14107f;
                    if (!range.equals(range5) && (rangeArr = (Range[]) this.f13308k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) != null) {
                        Range range15 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i25)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i25)));
                        int length = rangeArr.length;
                        int iF = i12;
                        Range range16 = range5;
                        int i30 = iF;
                        while (true) {
                            if (i30 >= length) {
                                range2 = range5;
                                range2 = range5;
                                break;
                            }
                            int i31 = i30;
                            Range range17 = rangeArr[i31];
                            int i32 = length;
                            if (i25 >= ((Integer) range17.getLower()).intValue()) {
                                if (range16.equals(C0993n.f14107f)) {
                                    range2 = range5;
                                    range2 = range5;
                                    range7 = range16;
                                    range7 = range17;
                                }
                                range2 = range5;
                                range2 = range5;
                                range7 = range16;
                                if (range17.equals(range15)) {
                                    range16 = range17;
                                    break;
                                }
                                try {
                                    int iF2 = f(range17.intersect(range15));
                                    if (iF == 0) {
                                        iF = iF2;
                                        range8 = range17;
                                    } else if (iF2 >= iF) {
                                        try {
                                            range9 = range7;
                                            double dF = f(range7.intersect(range15));
                                            try {
                                                double dF2 = f(range17.intersect(range15));
                                                double dF3 = dF2 / ((double) f(range17));
                                                double dF4 = dF / ((double) f(range9));
                                                if (dF2 > dF) {
                                                    if (dF3 >= 0.5d || dF3 >= dF4) {
                                                        range7 = range17;
                                                    } else {
                                                        range7 = range9;
                                                    }
                                                } else if (dF2 == dF) {
                                                    if (dF3 <= dF4 && (dF3 != dF4 || ((Integer) range17.getLower()).intValue() <= ((Integer) range9.getLower()).intValue())) {
                                                        range7 = range9;
                                                    } else {
                                                        range7 = range17;
                                                    }
                                                } else if (dF4 >= 0.5d || dF3 <= dF4) {
                                                    range7 = range9;
                                                } else {
                                                    range7 = range17;
                                                }
                                                try {
                                                    iF = f(range15.intersect(range7));
                                                    range8 = range7;
                                                } catch (IllegalArgumentException unused6) {
                                                    if (iF == 0) {
                                                        i16 = iF;
                                                        if (e(range17, range15) < e(range7, range15) || (e(range17, range15) == e(range7, range15) && (((Integer) range17.getLower()).intValue() > ((Integer) range7.getUpper()).intValue() || f(range17) < f(range7)))) {
                                                            iF = i16;
                                                            range8 = range17;
                                                        }
                                                        i30 = i31 + 1;
                                                        length = i32;
                                                        range16 = range6;
                                                    } else {
                                                        i16 = iF;
                                                    }
                                                    iF = i16;
                                                    range6 = range7;
                                                    i30 = i31 + 1;
                                                    length = i32;
                                                    range16 = range6;
                                                }
                                            } catch (IllegalArgumentException unused7) {
                                                range7 = range9;
                                                if (iF == 0) {
                                                    i16 = iF;
                                                    if (e(range17, range15) < e(range7, range15)) {
                                                    }
                                                    iF = i16;
                                                    range8 = range17;
                                                    range6 = range8;
                                                    i30 = i31 + 1;
                                                    length = i32;
                                                    range16 = range6;
                                                } else {
                                                    i16 = iF;
                                                }
                                                iF = i16;
                                                range6 = range7;
                                                i30 = i31 + 1;
                                                length = i32;
                                                range16 = range6;
                                            }
                                        } catch (IllegalArgumentException unused8) {
                                            range9 = range7;
                                        }
                                    } else {
                                        range8 = range7;
                                    }
                                } catch (IllegalArgumentException unused9) {
                                }
                                range6 = range8;
                            } else {
                                range2 = range5;
                                range2 = range5;
                                range6 = range16;
                            }
                            i30 = i31 + 1;
                            length = i32;
                            range16 = range6;
                        }
                        range2 = range16;
                    }
                } else {
                    range2 = list2;
                }
                range2 = range5;
                range2 = range5;
                range2 = range5;
                Iterator it26 = arrayList24.iterator();
                while (it26.hasNext()) {
                    UseCaseConfig useCaseConfig9 = (UseCaseConfig) it26.next();
                    Iterator it27 = it26;
                    Size size10 = (Size) list5.get(arrayList3.indexOf(Integer.valueOf(arrayList24.indexOf(useCaseConfig9))));
                    Range range18 = C0993n.f14107f;
                    ArrayList arrayList26 = arrayList3;
                    C0991m c0991m2 = new C0991m();
                    if (size10 == null) {
                        throw new NullPointerException("Null resolution");
                    }
                    c0991m2.f14102a = size10;
                    Range range19 = C0993n.f14107f;
                    if (range19 == null) {
                        throw new NullPointerException("Null expectedFrameRateRange");
                    }
                    c0991m2.f14104c = range19;
                    C0216v c0216v6 = c0216v;
                    c0991m2.f14103b = c0216v6;
                    c0991m2.f14106e = Boolean.FALSE;
                    HashMap map22 = map15;
                    C0216v c0216v7 = (C0216v) map22.get(useCaseConfig9);
                    c0216v7.getClass();
                    c0991m2.f14103b = c0216v7;
                    C0992m0 c0992m0B = C0992m0.b();
                    map15 = map22;
                    C0971c c0971c2 = androidx.camera.camera2.impl.b.f13107d;
                    if (useCaseConfig9.containsOption(c0971c2)) {
                        c0992m0B.insertOption(c0971c2, (Long) useCaseConfig9.retrieveOption(c0971c2));
                    }
                    C0971c c0971c3 = UseCaseConfig.f13988T;
                    if (useCaseConfig9.containsOption(c0971c3)) {
                        c0992m0B.insertOption(c0971c3, (Boolean) useCaseConfig9.retrieveOption(c0971c3));
                    }
                    C0971c c0971c4 = C0982h0.f14069b;
                    if (useCaseConfig9.containsOption(c0971c4)) {
                        c0992m0B.insertOption(c0971c4, (Integer) useCaseConfig9.retrieveOption(c0971c4));
                    }
                    C0971c c0971c5 = ImageInputConfig.f13897r;
                    if (useCaseConfig9.containsOption(c0971c5)) {
                        c0992m0B.insertOption(c0971c5, (Integer) useCaseConfig9.retrieveOption(c0971c5));
                    }
                    c0991m2.f14105d = new androidx.camera.camera2.impl.b(c0992m0B, 2);
                    c0991m2.f14106e = Boolean.valueOf(z8);
                    if (range2 != 0) {
                        c0991m2.f14104c = range2;
                    }
                    map5.put(useCaseConfig9, c0991m2.a());
                    c0216v = c0216v6;
                    arrayList3 = arrayList26;
                    arrayList24 = arrayList24;
                    it26 = it27;
                }
                C0216v c0216v8 = c0216v;
                HashMap map23 = map5;
                if (list4 != null && i25 == i26 && list5.size() == list6.size()) {
                    int i33 = i12;
                    while (true) {
                        if (i33 >= list5.size()) {
                            androidx.camera.camera2.internal.compat.l lVar3 = this.f13308k;
                            if (Build.VERSION.SDK_INT < 33) {
                                map8 = map4;
                                for (i15 = i12; i15 < list4.size(); i15++) {
                                    j6 = ((C0995o) ((androidx.camera.core.impl.N0) list4.get(i15))).f14115c;
                                    if (map6.containsKey(Integer.valueOf(i15))) {
                                        c0967a = (C0967a) map6.get(Integer.valueOf(i15));
                                        bVarA2 = X0.a(c0967a.f14012f, j6);
                                        if (bVarA2 != null) {
                                            Range range20 = C0993n.f14107f;
                                            c0991m = new C0991m();
                                            size = c0967a.f14009c;
                                            if (size != null) {
                                                throw new NullPointerException("Null resolution");
                                            }
                                            c0991m.f14102a = size;
                                            range3 = C0993n.f14107f;
                                            if (range3 != null) {
                                                throw new NullPointerException("Null expectedFrameRateRange");
                                            }
                                            c0991m.f14104c = range3;
                                            c0991m.f14103b = c0216v8;
                                            c0991m.f14106e = Boolean.FALSE;
                                            c0216v2 = c0967a.f14010d;
                                            if (c0216v2 != null) {
                                                throw new NullPointerException("Null dynamicRange");
                                            }
                                            c0991m.f14103b = c0216v2;
                                            c0991m.f14105d = bVarA2;
                                            range4 = c0967a.f14013g;
                                            if (range4 != null) {
                                                c0991m.f14104c = range4;
                                            }
                                            map8.put(c0967a, c0991m.a());
                                        }
                                    } else {
                                        if (map7.containsKey(Integer.valueOf(i15))) {
                                            throw new AssertionError(str4);
                                        }
                                        useCaseConfig = (UseCaseConfig) map7.get(Integer.valueOf(i15));
                                        c0993n = (C0993n) map23.get(useCaseConfig);
                                        bVarA = X0.a(c0993n.f14111d, j6);
                                        if (bVarA != null) {
                                            C0991m c0991mA = c0993n.a();
                                            c0991mA.f14105d = bVarA;
                                            map23.put(useCaseConfig, c0991mA.a());
                                        }
                                    }
                                }
                            } else {
                                ArrayList<UseCaseConfig> arrayList27 = new ArrayList(map23.keySet());
                                Iterator it28 = list3.iterator();
                                while (it28.hasNext()) {
                                    ((C0967a) it28.next()).f14012f.getClass();
                                }
                                Iterator it29 = arrayList27.iterator();
                                while (it29.hasNext()) {
                                    C0993n c0993n2 = (C0993n) map23.get((UseCaseConfig) it29.next());
                                    c0993n2.getClass();
                                    c0993n2.f14111d.getClass();
                                }
                                long[] jArr2 = (long[]) lVar3.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                                if (jArr2 == null || jArr2.length == 0) {
                                    map8 = map4;
                                    while (i15 < list4.size()) {
                                        j6 = ((C0995o) ((androidx.camera.core.impl.N0) list4.get(i15))).f14115c;
                                        if (map6.containsKey(Integer.valueOf(i15))) {
                                            c0967a = (C0967a) map6.get(Integer.valueOf(i15));
                                            bVarA2 = X0.a(c0967a.f14012f, j6);
                                            if (bVarA2 != null) {
                                                Range range21 = C0993n.f14107f;
                                                c0991m = new C0991m();
                                                size = c0967a.f14009c;
                                                if (size != null) {
                                                    throw new NullPointerException("Null resolution");
                                                }
                                                c0991m.f14102a = size;
                                                range3 = C0993n.f14107f;
                                                if (range3 != null) {
                                                    throw new NullPointerException("Null expectedFrameRateRange");
                                                }
                                                c0991m.f14104c = range3;
                                                c0991m.f14103b = c0216v8;
                                                c0991m.f14106e = Boolean.FALSE;
                                                c0216v2 = c0967a.f14010d;
                                                if (c0216v2 != null) {
                                                    throw new NullPointerException("Null dynamicRange");
                                                }
                                                c0991m.f14103b = c0216v2;
                                                c0991m.f14105d = bVarA2;
                                                range4 = c0967a.f14013g;
                                                if (range4 != null) {
                                                    c0991m.f14104c = range4;
                                                }
                                                map8.put(c0967a, c0991m.a());
                                            }
                                        } else {
                                            if (map7.containsKey(Integer.valueOf(i15))) {
                                                throw new AssertionError(str4);
                                            }
                                            useCaseConfig = (UseCaseConfig) map7.get(Integer.valueOf(i15));
                                            c0993n = (C0993n) map23.get(useCaseConfig);
                                            bVarA = X0.a(c0993n.f14111d, j6);
                                            if (bVarA != null) {
                                                C0991m c0991mA2 = c0993n.a();
                                                c0991mA2.f14105d = bVarA;
                                                map23.put(useCaseConfig, c0991mA2.a());
                                            }
                                        }
                                    }
                                } else {
                                    HashSet hashSet4 = new HashSet();
                                    int length2 = jArr2.length;
                                    for (int i34 = i12; i34 < length2; i34++) {
                                        hashSet4.add(Long.valueOf(jArr2[i34]));
                                    }
                                    HashSet hashSet5 = new HashSet();
                                    Iterator it30 = list3.iterator();
                                    if (it30.hasNext()) {
                                        C0967a c0967a5 = (C0967a) it30.next();
                                        androidx.camera.camera2.impl.b bVar2 = c0967a5.f14012f;
                                        C0971c c0971c6 = androidx.camera.camera2.impl.b.f13107d;
                                        if (bVar2.containsOption(c0971c6) && ((Long) c0967a5.f14012f.retrieveOption(c0971c6)).longValue() != 0) {
                                            i14 = i12;
                                            i13 = 1;
                                        } else {
                                            i13 = i12;
                                            i14 = 1;
                                        }
                                    } else {
                                        i13 = i12;
                                        i14 = i13;
                                    }
                                    for (UseCaseConfig useCaseConfig10 : arrayList27) {
                                        ArrayList arrayList28 = arrayList27;
                                        int i35 = i13;
                                        C0971c c0971c7 = androidx.camera.camera2.impl.b.f13107d;
                                        int i36 = i14;
                                        if (useCaseConfig10.containsOption(c0971c7)) {
                                            Long l5 = (Long) useCaseConfig10.retrieveOption(c0971c7);
                                            if (l5.longValue() != 0) {
                                                if (i36 != 0) {
                                                    throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                }
                                                hashSet5.add(l5);
                                                i14 = i36;
                                                i13 = 1;
                                            } else if (i35 != 0) {
                                                throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                            }
                                            arrayList27 = arrayList28;
                                        } else if (i35 != 0) {
                                            throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                        }
                                        i13 = i35;
                                        i14 = 1;
                                        arrayList27 = arrayList28;
                                    }
                                    ArrayList<UseCaseConfig> arrayList29 = arrayList27;
                                    if (i14 == 0) {
                                        Iterator it31 = hashSet5.iterator();
                                        do {
                                            if (!it31.hasNext()) {
                                                for (C0967a c0967a6 : list3) {
                                                    androidx.camera.camera2.impl.b bVar3 = c0967a6.f14012f;
                                                    androidx.camera.camera2.impl.b bVarA3 = X0.a(bVar3, ((Long) bVar3.retrieveOption(androidx.camera.camera2.impl.b.f13107d)).longValue());
                                                    if (bVarA3 != null) {
                                                        Range range22 = C0993n.f14107f;
                                                        C0991m c0991m3 = new C0991m();
                                                        Size size11 = c0967a6.f14009c;
                                                        if (size11 == null) {
                                                            throw new NullPointerException("Null resolution");
                                                        }
                                                        c0991m3.f14102a = size11;
                                                        Range range23 = C0993n.f14107f;
                                                        if (range23 == null) {
                                                            throw new NullPointerException("Null expectedFrameRateRange");
                                                        }
                                                        c0991m3.f14104c = range23;
                                                        c0991m3.f14103b = c0216v8;
                                                        c0991m3.f14106e = Boolean.FALSE;
                                                        C0216v c0216v9 = c0967a6.f14010d;
                                                        if (c0216v9 == null) {
                                                            throw new NullPointerException("Null dynamicRange");
                                                        }
                                                        c0991m3.f14103b = c0216v9;
                                                        c0991m3.f14105d = bVarA3;
                                                        Range range24 = c0967a6.f14013g;
                                                        if (range24 != null) {
                                                            c0991m3.f14104c = range24;
                                                        }
                                                        C0993n c0993nA = c0991m3.a();
                                                        map9 = map4;
                                                        map9.put(c0967a6, c0993nA);
                                                    } else {
                                                        map9 = map4;
                                                    }
                                                    map4 = map9;
                                                }
                                                map8 = map4;
                                                for (UseCaseConfig useCaseConfig11 : arrayList29) {
                                                    C0993n c0993n3 = (C0993n) map23.get(useCaseConfig11);
                                                    androidx.camera.camera2.impl.b bVar4 = c0993n3.f14111d;
                                                    androidx.camera.camera2.impl.b bVarA4 = X0.a(bVar4, ((Long) bVar4.retrieveOption(androidx.camera.camera2.impl.b.f13107d)).longValue());
                                                    if (bVarA4 != null) {
                                                        C0991m c0991mA3 = c0993n3.a();
                                                        c0991mA3.f14105d = bVarA4;
                                                        map23.put(useCaseConfig11, c0991mA3.a());
                                                    }
                                                }
                                            }
                                        } while (hashSet4.contains((Long) it31.next()));
                                        map8 = map4;
                                        while (i15 < list4.size()) {
                                            j6 = ((C0995o) ((androidx.camera.core.impl.N0) list4.get(i15))).f14115c;
                                            if (map6.containsKey(Integer.valueOf(i15))) {
                                                c0967a = (C0967a) map6.get(Integer.valueOf(i15));
                                                bVarA2 = X0.a(c0967a.f14012f, j6);
                                                if (bVarA2 != null) {
                                                    Range range25 = C0993n.f14107f;
                                                    c0991m = new C0991m();
                                                    size = c0967a.f14009c;
                                                    if (size != null) {
                                                        throw new NullPointerException("Null resolution");
                                                    }
                                                    c0991m.f14102a = size;
                                                    range3 = C0993n.f14107f;
                                                    if (range3 != null) {
                                                        throw new NullPointerException("Null expectedFrameRateRange");
                                                    }
                                                    c0991m.f14104c = range3;
                                                    c0991m.f14103b = c0216v8;
                                                    c0991m.f14106e = Boolean.FALSE;
                                                    c0216v2 = c0967a.f14010d;
                                                    if (c0216v2 != null) {
                                                        throw new NullPointerException("Null dynamicRange");
                                                    }
                                                    c0991m.f14103b = c0216v2;
                                                    c0991m.f14105d = bVarA2;
                                                    range4 = c0967a.f14013g;
                                                    if (range4 != null) {
                                                        c0991m.f14104c = range4;
                                                    }
                                                    map8.put(c0967a, c0991m.a());
                                                }
                                            } else {
                                                if (map7.containsKey(Integer.valueOf(i15))) {
                                                    throw new AssertionError(str4);
                                                }
                                                useCaseConfig = (UseCaseConfig) map7.get(Integer.valueOf(i15));
                                                c0993n = (C0993n) map23.get(useCaseConfig);
                                                bVarA = X0.a(c0993n.f14111d, j6);
                                                if (bVarA != null) {
                                                    C0991m c0991mA4 = c0993n.a();
                                                    c0991mA4.f14105d = bVarA;
                                                    map23.put(useCaseConfig, c0991mA4.a());
                                                }
                                            }
                                        }
                                    } else {
                                        map8 = map4;
                                        while (i15 < list4.size()) {
                                            j6 = ((C0995o) ((androidx.camera.core.impl.N0) list4.get(i15))).f14115c;
                                            if (map6.containsKey(Integer.valueOf(i15))) {
                                                c0967a = (C0967a) map6.get(Integer.valueOf(i15));
                                                bVarA2 = X0.a(c0967a.f14012f, j6);
                                                if (bVarA2 != null) {
                                                    Range range26 = C0993n.f14107f;
                                                    c0991m = new C0991m();
                                                    size = c0967a.f14009c;
                                                    if (size != null) {
                                                        throw new NullPointerException("Null resolution");
                                                    }
                                                    c0991m.f14102a = size;
                                                    range3 = C0993n.f14107f;
                                                    if (range3 != null) {
                                                        throw new NullPointerException("Null expectedFrameRateRange");
                                                    }
                                                    c0991m.f14104c = range3;
                                                    c0991m.f14103b = c0216v8;
                                                    c0991m.f14106e = Boolean.FALSE;
                                                    c0216v2 = c0967a.f14010d;
                                                    if (c0216v2 != null) {
                                                        throw new NullPointerException("Null dynamicRange");
                                                    }
                                                    c0991m.f14103b = c0216v2;
                                                    c0991m.f14105d = bVarA2;
                                                    range4 = c0967a.f14013g;
                                                    if (range4 != null) {
                                                        c0991m.f14104c = range4;
                                                    }
                                                    map8.put(c0967a, c0991m.a());
                                                }
                                            } else {
                                                if (map7.containsKey(Integer.valueOf(i15))) {
                                                    throw new AssertionError(str4);
                                                }
                                                useCaseConfig = (UseCaseConfig) map7.get(Integer.valueOf(i15));
                                                c0993n = (C0993n) map23.get(useCaseConfig);
                                                bVarA = X0.a(c0993n.f14111d, j6);
                                                if (bVarA != null) {
                                                    C0991m c0991mA5 = c0993n.a();
                                                    c0991mA5.f14105d = bVarA;
                                                    map23.put(useCaseConfig, c0991mA5.a());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!((Size) list5.get(i33)).equals(list6.get(i33))) {
                                break;
                            }
                            i33++;
                        }
                    }
                    map8 = map4;
                } else {
                    map8 = map4;
                }
                return new Pair(map23, map8);
            }
            UseCaseConfig useCaseConfig12 = (UseCaseConfig) it7.next();
            C0216v dynamicRange2 = useCaseConfig12.getDynamicRange();
            useCaseConfig12.getTargetName();
            if (!dynamicRange2.b()) {
                int i37 = dynamicRange2.f2128a;
                it = it7;
                int i38 = dynamicRange2.f2129b;
                arrayList4 = arrayList6;
                if (i37 != 1 || i38 != 0) {
                    C0216v c0216vD = He.a.d(dynamicRange2, linkedHashSet, hashSet);
                    if (c0216vD != null) {
                        dynamicRange2.toString();
                        c0216vD.toString();
                        p140j8.f.G("DynamicRangeResolver");
                    } else {
                        c0216vD = He.a.d(dynamicRange2, linkedHashSet2, hashSet);
                        if (c0216vD != null) {
                            dynamicRange2.toString();
                            c0216vD.toString();
                            p140j8.f.G("DynamicRangeResolver");
                        } else if (He.a.b(dynamicRange2, c0216v4, hashSet)) {
                            dynamicRange2.toString();
                            c0216v4.toString();
                            p140j8.f.G("DynamicRangeResolver");
                            aVar = aVar2;
                        } else {
                            if (i37 == 2 && (i38 == 10 || i38 == 0)) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    c0216vC = F.b.c((androidx.camera.camera2.internal.compat.l) aVar2.f3865c);
                                    if (c0216vC != null) {
                                        linkedHashSet3.add(c0216vC);
                                    }
                                } else {
                                    c0216vC = null;
                                }
                                linkedHashSet3.add(C0216v.f2123e);
                                c0216vD = He.a.d(dynamicRange2, linkedHashSet3, hashSet);
                                if (c0216vD != null) {
                                    c0216vD.equals(c0216vC);
                                    dynamicRange2.toString();
                                    c0216vD.toString();
                                    p140j8.f.G("DynamicRangeResolver");
                                }
                            }
                            Iterator it32 = hashSet.iterator();
                            while (true) {
                                if (it32.hasNext()) {
                                    C0216v c0216v10 = (C0216v) it32.next();
                                    aVar = aVar2;
                                    p118hf.a.k(c0216v10.b(), "Candidate dynamic range must be fully specified.");
                                    if (!c0216v10.equals(c0216v4) && He.a.a(dynamicRange2, c0216v10)) {
                                        dynamicRange2.toString();
                                        c0216v10.toString();
                                        p140j8.f.G("DynamicRangeResolver");
                                        c0216v4 = c0216v10;
                                    } else {
                                        aVar2 = aVar;
                                    }
                                } else {
                                    aVar = aVar2;
                                    c0216v4 = null;
                                }
                            }
                        }
                    }
                    aVar = aVar2;
                    c0216v4 = c0216vD;
                } else if (hashSet.contains(c0216v4)) {
                    aVar = aVar2;
                } else {
                    aVar = aVar2;
                    c0216v4 = null;
                }
            } else if (hashSet.contains(dynamicRange2)) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                it = it7;
                c0216v4 = dynamicRange2;
            } else {
                aVar = aVar2;
                arrayList4 = arrayList6;
                it = it7;
                c0216v4 = null;
            }
            if (c0216v4 == null) {
                String targetName = useCaseConfig12.getTargetName();
                String strJoin = TextUtils.join("\n  ", setC);
                String strJoin2 = TextUtils.join("\n  ", hashSet);
                StringBuilder sb2 = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb2.append(targetName);
                sb2.append("\nRequested dynamic range:\n  ");
                sb2.append(dynamicRange2);
                sb2.append("\nSupported dynamic ranges:\n  ");
                throw new IllegalArgumentException(F.d(sb2, strJoin, "\nConstrained set of concurrent dynamic ranges:\n  ", strJoin2));
            }
            He.a.k(hashSet, c0216v4, bVar);
            map12.put(useCaseConfig12, c0216v4);
            if (!linkedHashSet.contains(c0216v4)) {
                linkedHashSet2.add(c0216v4);
            }
            aVar2 = aVar;
            it7 = it;
            arrayList6 = arrayList4;
        }
    }

    public final Pair h(int i7, List list, List list2, ArrayList arrayList, ArrayList arrayList2, int i10, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0967a c0967a = (C0967a) it.next();
            arrayList3.add(c0967a.f14007a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList3.size() - 1), c0967a);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = (Size) list2.get(i11);
            UseCaseConfig useCaseConfig = (UseCaseConfig) arrayList.get(((Integer) arrayList2.get(i11)).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList3.add(androidx.camera.core.impl.N0.b(i7, inputFormat, size, i(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList3.size() - 1), useCaseConfig);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f13308k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(useCaseConfig.getInputFormat(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i10 = Math.min(i10, outputMinFrameDuration);
        }
        return new Pair(arrayList3, Integer.valueOf(i10));
    }

    public final C0997p i(int i7) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.t;
        if (!arrayList.contains(Integer.valueOf(i7))) {
            j(this.f13316s.f14117b, androidx.camera.core.internal.utils.d.f14365e, i7);
            j(this.f13316s.f14119d, androidx.camera.core.internal.utils.d.f14367g, i7);
            HashMap map = this.f13316s.f14121f;
            androidx.camera.camera2.internal.compat.l lVar = this.f13308k;
            Size sizeC = c((StreamConfigurationMap) ((androidx.camera.camera2.internal.compat.n) lVar.b().f6553a).f13411a, i7, true);
            if (sizeC != null) {
                map.put(Integer.valueOf(i7), sizeC);
            }
            HashMap map2 = this.f13316s.f14122g;
            if (Build.VERSION.SDK_INT >= 31 && this.f13315r && (streamConfigurationMap = (StreamConfigurationMap) lVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i7), c(streamConfigurationMap, i7, true));
            }
            arrayList.add(Integer.valueOf(i7));
        }
        return this.f13316s;
    }

    public final void j(HashMap map, Size size, int i7) {
        if (this.f13313p) {
            Size sizeC = c((StreamConfigurationMap) ((androidx.camera.camera2.internal.compat.n) this.f13308k.b().f6553a).f13411a, i7, false);
            Integer numValueOf = Integer.valueOf(i7);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new androidx.camera.core.impl.utils.d(false));
            }
            map.put(numValueOf, size);
        }
    }
}
