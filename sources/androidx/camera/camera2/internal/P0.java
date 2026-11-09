package androidx.camera.camera2.internal;

import Bc.C0108e;
import C9.C0142i;
import E.C0216v;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0891x;
import androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.main.export.bean.rsp.AssetsBalanceItem;
import com.transsnet.palmpay.teller.db.BillerSearchRecordDataBase_Impl;
import com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public class P0 implements DrawableFactory, BillerSearchRecordDao, ResourceManagerInternal$ResourceManagerHooks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13251f;

    public P0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13246a = context;
    }

    public static boolean b(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(int i7, Context context) {
        int iC = androidx.appcompat.widget.W0.c(p241q.a.colorControlHighlight, context);
        int iB = androidx.appcompat.widget.W0.b(p241q.a.colorButtonNormal, context);
        int[] iArr = androidx.appcompat.widget.W0.f12853b;
        int[] iArr2 = androidx.appcompat.widget.W0.f12855d;
        int iC2 = androidx.core.graphics.d.c(iC, i7);
        return new ColorStateList(new int[][]{iArr, iArr2, androidx.appcompat.widget.W0.f12854c, androidx.appcompat.widget.W0.f12857f}, new int[]{iB, iC2, androidx.core.graphics.d.c(iC, i7), i7});
    }

    public static LayerDrawable h(androidx.appcompat.widget.B0 b0, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable drawableD = b0.d(p241q.e.abc_star_black_48dp, context);
        Drawable drawableD2 = b0.d(p241q.e.abc_star_half_black_48dp, context);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void k(Drawable drawable, int i7, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0891x.f13026b;
        }
        drawableMutate.setColorFilter(C0891x.c(i7, mode));
    }

    public void a(Intent intent) {
        Bitmap bitmapA;
        Object obj;
        Resources resourcesForApplication;
        Intent[] intentArr = (Intent[]) this.f13248c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", ((String) this.f13249d).toString());
        IconCompat iconCompat = (IconCompat) this.f13250e;
        if (iconCompat != null) {
            Context context = (Context) this.f13246a;
            if (iconCompat.f16047a == 2 && (obj = iconCompat.f16048b) != null) {
                String str = (String) obj;
                if (str.contains(":")) {
                    String str2 = str.split(":", -1)[1];
                    String str3 = str2.split("/", -1)[0];
                    String str4 = str2.split("/", -1)[1];
                    String str5 = str.split(":", -1)[0];
                    if (!"0_resource_name_obfuscated".equals(str4)) {
                        String strD = iconCompat.d();
                        if ("android".equals(strD)) {
                            resourcesForApplication = Resources.getSystem();
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            try {
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strD, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.e("IconCompat", "Unable to find pkg=" + strD + " for icon", e10);
                            }
                        }
                        int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                        if (iconCompat.f16051e != identifier) {
                            iconCompat.f16051e = identifier;
                        }
                    }
                }
            }
            int i7 = iconCompat.f16047a;
            if (i7 == 1) {
                bitmapA = (Bitmap) iconCompat.f16048b;
            } else {
                if (i7 == 2) {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.d(), 0), iconCompat.f16051e));
                        return;
                    } catch (PackageManager.NameNotFoundException e11) {
                        throw new IllegalArgumentException("Can't find package " + iconCompat.f16048b, e11);
                    }
                }
                if (i7 != 5) {
                    throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                }
                bitmapA = IconCompat.a((Bitmap) iconCompat.f16048b, true);
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmapA);
        }
    }

    public View c() {
        NetworkNotConnectView networkNotConnectView = new NetworkNotConnectView((Context) this.f13246a, null, 6, 0);
        String str = (String) this.f13249d;
        if (str != null && str.length() != 0) {
            networkNotConnectView.setMessage((String) this.f13249d);
        }
        networkNotConnectView.setRefreshListener(new C0142i(this, 11));
        String str2 = (String) this.f13248c;
        if (str2 != null && str2.length() != 0) {
            String str3 = (String) this.f13248c;
            View.OnClickListener onClickListener = (View.OnClickListener) this.f13250e;
            C0108e c0108e = networkNotConnectView.f27123c;
            if (c0108e != null) {
                PpButton ppButton = (PpButton) c0108e.f691i;
                ppButton.setText(str3);
                p220oa.h.s(ppButton, !TextUtils.isEmpty(str3));
                ppButton.setOnClickListener(onClickListener);
            }
        }
        return networkNotConnectView;
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public int clearSearchHistoryByMemberId(String str) {
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f13250e;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            billerSearchRecordDataBase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                billerSearchRecordDataBase_Impl.setTransactionSuccessful();
                billerSearchRecordDataBase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                billerSearchRecordDataBase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public Drawable createDrawable(CloseableImage closeableImage) {
        AnimatedImage animatedImage;
        X2.b bVar;
        M2.b bVar2;
        BitmapFrameCache bitmapFrameCache;
        O2.a aVar;
        int iIntValue;
        N2.b bVar3;
        N2.a aVar2;
        BitmapFrameCache dVar;
        p109h3.b bVar4 = (p109h3.b) closeableImage;
        synchronized (bVar4) {
            X2.b bVar5 = bVar4.f37264a;
            animatedImage = bVar5 == null ? null : bVar5.f10995a;
        }
        synchronized (bVar4) {
            bVar = bVar4.f37264a;
        }
        bVar.getClass();
        Bitmap.Config animatedBitmapConfig = animatedImage != null ? animatedImage.getAnimatedBitmapConfig() : null;
        AnimatedImage animatedImage2 = bVar.f10995a;
        AnimatedDrawableBackend animatedDrawableBackend = ((Oe.a) this.f13246a).get(bVar, new Rect(0, 0, animatedImage2.getWidth(), animatedImage2.getHeight()));
        Integer num = 2;
        int iIntValue2 = num.intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 != 2) {
                if (iIntValue2 != 3) {
                    dVar = new M2.d();
                } else {
                    M2.c cVar = new M2.c();
                    cVar.f5744a = -1;
                    dVar = cVar;
                }
                bitmapFrameCache = dVar;
            } else {
                bVar2 = new M2.b(new Z2.d(new M2.a(bVar.hashCode(), false), (CountingMemoryCache) this.f13251f), false);
            }
            aVar = new O2.a();
            Oe.a aVar3 = new Oe.a(aVar, 6);
            aVar.f6556d = aVar3;
            aVar.f6553a = bitmapFrameCache;
            aVar.f6554b = animatedDrawableBackend;
            aVar.f6555c = new C2085k0(animatedDrawableBackend, aVar3);
            Integer num2 = 3;
            iIntValue = num2.intValue();
            if (iIntValue > 0) {
                N2.b bVar6 = new N2.b(iIntValue);
                if (animatedBitmapConfig == null) {
                    animatedBitmapConfig = Bitmap.Config.ARGB_8888;
                }
                SerialExecutorService serialExecutorService = (SerialExecutorService) this.f13248c;
                p032c3.b bVar7 = (p032c3.b) this.f13250e;
                N2.a aVar4 = new N2.a();
                aVar4.f6064a = bVar7;
                aVar4.f6065b = aVar;
                aVar4.f6066c = animatedBitmapConfig;
                aVar4.f6067d = serialExecutorService;
                aVar4.f6068e = new SparseArray();
                bVar3 = bVar6;
                aVar2 = aVar4;
            } else {
                bVar3 = null;
                aVar2 = null;
            }
            L2.a aVar5 = new L2.a((p032c3.b) this.f13250e, bitmapFrameCache, new Ab.r(animatedDrawableBackend, 3), aVar, bVar3, aVar2);
            return new P2.a(new K2.a(aVar5, aVar5, (RealtimeSinceBootClock) this.f13249d, (p180m2.d) this.f13247b));
        }
        bVar2 = new M2.b(new Z2.d(new M2.a(bVar.hashCode(), false), (CountingMemoryCache) this.f13251f), true);
        bitmapFrameCache = bVar2;
        aVar = new O2.a();
        Oe.a aVar6 = new Oe.a(aVar, 6);
        aVar.f6556d = aVar6;
        aVar.f6553a = bitmapFrameCache;
        aVar.f6554b = animatedDrawableBackend;
        aVar.f6555c = new C2085k0(animatedDrawableBackend, aVar6);
        Integer num3 = 3;
        iIntValue = num3.intValue();
        if (iIntValue > 0) {
            N2.b bVar8 = new N2.b(iIntValue);
            if (animatedBitmapConfig == null) {
                animatedBitmapConfig = Bitmap.Config.ARGB_8888;
            }
            SerialExecutorService serialExecutorService2 = (SerialExecutorService) this.f13248c;
            p032c3.b bVar9 = (p032c3.b) this.f13250e;
            N2.a aVar7 = new N2.a();
            aVar7.f6064a = bVar9;
            aVar7.f6065b = aVar;
            aVar7.f6066c = animatedBitmapConfig;
            aVar7.f6067d = serialExecutorService2;
            aVar7.f6068e = new SparseArray();
            bVar3 = bVar8;
            aVar2 = aVar7;
        } else {
            bVar3 = null;
            aVar2 = null;
        }
        L2.a aVar8 = new L2.a((p032c3.b) this.f13250e, bitmapFrameCache, new Ab.r(animatedDrawableBackend, 3), aVar, bVar3, aVar2);
        return new P2.a(new K2.a(aVar8, aVar8, (RealtimeSinceBootClock) this.f13249d, (p180m2.d) this.f13247b));
    }

    @Override // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public Drawable createDrawableFor(androidx.appcompat.widget.B0 b0, Context context, int i7) {
        if (i7 == p241q.e.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{b0.d(p241q.e.abc_cab_background_internal_bg, context), b0.d(p241q.e.abc_cab_background_top_mtrl_alpha, context)});
        }
        if (i7 == p241q.e.abc_ratingbar_material) {
            return h(b0, context, p241q.d.abc_star_big);
        }
        if (i7 == p241q.e.abc_ratingbar_indicator_material) {
            return h(b0, context, p241q.d.abc_star_medium);
        }
        if (i7 == p241q.e.abc_ratingbar_small_material) {
            return h(b0, context, p241q.d.abc_star_small);
        }
        return null;
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public void delete(Ud.a aVar) {
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        billerSearchRecordDataBase_Impl.beginTransaction();
        try {
            ((Td.b) this.f13248c).e(aVar);
            billerSearchRecordDataBase_Impl.setTransactionSuccessful();
        } finally {
            billerSearchRecordDataBase_Impl.endTransaction();
        }
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public int deleteBySearchText(String str) {
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f13251f;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            billerSearchRecordDataBase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                billerSearchRecordDataBase_Impl.setTransactionSuccessful();
                billerSearchRecordDataBase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                billerSearchRecordDataBase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    public androidx.camera.core.impl.H0 e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f13249d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        androidx.camera.core.impl.C0 c0E = androidx.camera.core.impl.C0.e((O0) this.f13248c, size);
        c0E.f13839b.f13957c = 1;
        E.j0 j0Var = new E.j0(surface);
        this.f13246a = j0Var;
        ListenableFuture listenableFutureE = androidx.camera.core.impl.utils.futures.j.e(j0Var.f14025e);
        C0926f c0926f = new C0926f(surface, surfaceTexture);
        listenableFutureE.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureE, c0926f), org.chromium.support_lib_boundary.util.b.u());
        c0E.c((E.j0) this.f13246a, C0216v.f2122d, -1);
        androidx.camera.core.impl.D0 d1 = (androidx.camera.core.impl.D0) this.f13251f;
        if (d1 != null) {
            d1.a();
        }
        androidx.camera.core.impl.D0 d2 = new androidx.camera.core.impl.D0(new SessionConfig$ErrorListener() { // from class: androidx.camera.camera2.internal.M0
            @Override // androidx.camera.core.impl.SessionConfig$ErrorListener
            public final void onError(androidx.camera.core.impl.H0 h7, androidx.camera.core.impl.F0 f1) {
                P0 p3 = this.f13241a;
                p3.f13247b = p3.e();
                r rVar = (r) p3.f13250e;
                if (rVar != null) {
                    rVar.onSurfaceReset();
                }
            }
        });
        this.f13251f = d2;
        c0E.f13843f = d2;
        return c0E.d();
    }

    public void f(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Iterator it = i().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
            synchronizedCaptureSession2.finishClose();
        }
    }

    public ArrayList g() {
        ArrayList arrayList;
        synchronized (this.f13247b) {
            arrayList = new ArrayList((LinkedHashSet) this.f13248c);
        }
        return arrayList;
    }

    @Override // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public ColorStateList getTintListForDrawableRes(Context context, int i7) {
        if (i7 == p241q.e.abc_edit_text_material) {
            return androidx.core.content.d.c(p241q.c.abc_tint_edittext, context);
        }
        if (i7 == p241q.e.abc_switch_track_mtrl_alpha) {
            return androidx.core.content.d.c(p241q.c.abc_tint_switch_track, context);
        }
        if (i7 != p241q.e.abc_switch_thumb_material) {
            if (i7 == p241q.e.abc_btn_default_mtrl_shape) {
                return d(androidx.appcompat.widget.W0.c(p241q.a.colorButtonNormal, context), context);
            }
            if (i7 == p241q.e.abc_btn_borderless_material) {
                return d(0, context);
            }
            if (i7 == p241q.e.abc_btn_colored_material) {
                return d(androidx.appcompat.widget.W0.c(p241q.a.colorAccent, context), context);
            }
            if (i7 == p241q.e.abc_spinner_mtrl_am_alpha || i7 == p241q.e.abc_spinner_textfield_background_material) {
                return androidx.core.content.d.c(p241q.c.abc_tint_spinner, context);
            }
            if (b((int[]) this.f13247b, i7)) {
                return androidx.appcompat.widget.W0.d(p241q.a.colorControlNormal, context);
            }
            if (b((int[]) this.f13250e, i7)) {
                return androidx.core.content.d.c(p241q.c.abc_tint_default, context);
            }
            if (b((int[]) this.f13251f, i7)) {
                return androidx.core.content.d.c(p241q.c.abc_tint_btn_checkable, context);
            }
            if (i7 == p241q.e.abc_seekbar_thumb_material) {
                return androidx.core.content.d.c(p241q.c.abc_tint_seek_thumb, context);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = androidx.appcompat.widget.W0.d(p241q.a.colorSwitchThumbNormal, context);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = androidx.appcompat.widget.W0.f12853b;
            iArr2[0] = androidx.appcompat.widget.W0.b(p241q.a.colorSwitchThumbNormal, context);
            iArr[1] = androidx.appcompat.widget.W0.f12856e;
            iArr2[1] = androidx.appcompat.widget.W0.c(p241q.a.colorControlActivated, context);
            iArr[2] = androidx.appcompat.widget.W0.f12857f;
            iArr2[2] = androidx.appcompat.widget.W0.c(p241q.a.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = androidx.appcompat.widget.W0.f12853b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = androidx.appcompat.widget.W0.f12856e;
            iArr2[1] = androidx.appcompat.widget.W0.c(p241q.a.colorControlActivated, context);
            iArr[2] = androidx.appcompat.widget.W0.f12857f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public PorterDuff.Mode getTintModeForDrawableRes(int i7) {
        if (i7 == p241q.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public ArrayList i() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f13247b) {
            arrayList = new ArrayList();
            arrayList.addAll(g());
            synchronized (this.f13247b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.f13250e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public long insert(Ud.a aVar) {
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        billerSearchRecordDataBase_Impl.beginTransaction();
        try {
            Td.a aVar2 = (Td.a) this.f13247b;
            SupportSQLiteStatement supportSQLiteStatementA = aVar2.a();
            try {
                aVar2.d(supportSQLiteStatementA, aVar);
                long jExecuteInsert = supportSQLiteStatementA.executeInsert();
                aVar2.c(supportSQLiteStatementA);
                billerSearchRecordDataBase_Impl.setTransactionSuccessful();
                billerSearchRecordDataBase_Impl.endTransaction();
                return jExecuteInsert;
            } catch (Throwable th) {
                aVar2.c(supportSQLiteStatementA);
                throw th;
            }
        } catch (Throwable th2) {
            billerSearchRecordDataBase_Impl.endTransaction();
            throw th2;
        }
    }

    public void j(int i7) {
        ((View) this.f13249d).setBackground(((Context) this.f13246a).getResources().getDrawable(i7));
    }

    public void l(int i7, int i10) {
        Context context = (Context) this.f13246a;
        ((TextView) this.f13247b).setTextColor(context.getResources().getColor(i7));
        ((TextView) this.f13248c).setTextColor(context.getResources().getColor(i10));
    }

    public ShortcutInfo m() {
        X.b.j();
        ShortcutInfo.Builder intents = X.b.a((Context) this.f13246a, (String) this.f13247b).setShortLabel((String) this.f13249d).setIntents((Intent[]) this.f13248c);
        IconCompat iconCompat = (IconCompat) this.f13250e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.g((Context) this.f13246a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = (PersistableBundle) this.f13251f;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            intents.setLongLived(false);
        } else {
            if (((PersistableBundle) this.f13251f) == null) {
                this.f13251f = new PersistableBundle();
            }
            ((PersistableBundle) this.f13251f).putBoolean("extraLongLived", false);
            intents.setExtras((PersistableBundle) this.f13251f);
        }
        if (i7 >= 33) {
            F.b.g(intents);
        }
        return intents.build();
    }

    public void n(AssetsBalanceItem assetsBalanceItem, boolean z3) {
        this.f13250e = assetsBalanceItem;
        TextView textView = (TextView) this.f13247b;
        if (textView != null) {
            textView.setText(assetsBalanceItem != null ? assetsBalanceItem.title : null);
        }
        View view = (View) this.f13249d;
        if (view != null) {
            p220oa.h.s(view, z3);
        }
        boolean zC = p059e1.a.C("main_sp_show_balance", false);
        TextView textView2 = (TextView) this.f13248c;
        if (zC) {
            if (textView2 != null) {
                textView2.setText(assetsBalanceItem == null ? "--" : Pa.r0.B(assetsBalanceItem.balance, true));
            }
        } else if (textView2 != null) {
            textView2.setText("****");
        }
        if (!NQEManager.INSTANCE.isNetworkOffline() || textView2 == null) {
            return;
        }
        textView2.setText("--");
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public List querySearchRecord(String str) {
        androidx.room.L lAcquire = androidx.room.L.f17714j.acquire("SELECT * FROM biller_search_record WHERE memberId LIKE ? Order By updateTime desc limit 10", 1);
        lAcquire.bindString(1, str);
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(billerSearchRecordDataBase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "recordId");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "memberId");
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "searchText");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "updateTime");
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                Ud.a aVar = new Ud.a();
                aVar.f9750a = cursorK.getInt(iK);
                aVar.f9751b = cursorK.getString(iK2);
                aVar.f9752c = cursorK.getString(iK3);
                aVar.f9753d = cursorK.getLong(iK4);
                arrayList.add(aVar);
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public List querySearchRecordByText(String str) {
        androidx.room.L lAcquire = androidx.room.L.f17714j.acquire("SELECT * FROM biller_search_record WHERE searchText LIKE ? Order By updateTime desc limit 10", 1);
        lAcquire.bindString(1, str);
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(billerSearchRecordDataBase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "recordId");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "memberId");
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "searchText");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "updateTime");
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                Ud.a aVar = new Ud.a();
                aVar.f9750a = cursorK.getInt(iK);
                aVar.f9751b = cursorK.getString(iK2);
                aVar.f9752c = cursorK.getString(iK3);
                aVar.f9753d = cursorK.getLong(iK4);
                arrayList.add(aVar);
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public boolean supportsImageType(CloseableImage closeableImage) {
        return closeableImage instanceof p109h3.b;
    }

    @Override // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public boolean tintDrawable(Context context, int i7, Drawable drawable) {
        if (i7 == p241q.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
            int iC = androidx.appcompat.widget.W0.c(p241q.a.colorControlNormal, context);
            PorterDuff.Mode mode = C0891x.f13026b;
            k(drawableFindDrawableByLayerId, iC, mode);
            k(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), androidx.appcompat.widget.W0.c(p241q.a.colorControlNormal, context), mode);
            k(layerDrawable.findDrawableByLayerId(R.id.progress), androidx.appcompat.widget.W0.c(p241q.a.colorControlActivated, context), mode);
            return true;
        }
        if (i7 != p241q.e.abc_ratingbar_material && i7 != p241q.e.abc_ratingbar_indicator_material && i7 != p241q.e.abc_ratingbar_small_material) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
        int iB = androidx.appcompat.widget.W0.b(p241q.a.colorControlNormal, context);
        PorterDuff.Mode mode2 = C0891x.f13026b;
        k(drawableFindDrawableByLayerId2, iB, mode2);
        k(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), androidx.appcompat.widget.W0.c(p241q.a.colorControlActivated, context), mode2);
        k(layerDrawable2.findDrawableByLayerId(R.id.progress), androidx.appcompat.widget.W0.c(p241q.a.colorControlActivated, context), mode2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
    @Override // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public boolean tintDrawableUsingColorFilter(Context context, int i7, Drawable drawable) {
        PorterDuff.Mode mode;
        int iRound;
        int i10;
        boolean z3;
        Drawable drawableMutate;
        PorterDuff.Mode mode2 = C0891x.f13026b;
        if (!b((int[]) this.f13246a, i7)) {
            if (b((int[]) this.f13248c, i7)) {
                i10 = p241q.a.colorControlActivated;
            } else {
                if (b((int[]) this.f13249d, i7)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else if (i7 == p241q.e.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i10 = 16842800;
                    mode = mode2;
                    z3 = true;
                } else if (i7 != p241q.e.abc_dialog_material_background) {
                    mode = mode2;
                    iRound = -1;
                    i10 = 0;
                    z3 = false;
                }
                mode = mode2;
                iRound = -1;
                i10 = 16842801;
                z3 = true;
            }
            if (z3) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C0891x.c(androidx.appcompat.widget.W0.c(i10, context), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
        i10 = p241q.a.colorControlNormal;
        mode = mode2;
        iRound = -1;
        z3 = true;
        if (z3) {
            return false;
        }
        drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(C0891x.c(androidx.appcompat.widget.W0.c(i10, context), mode));
        if (iRound != -1) {
            drawableMutate.setAlpha(iRound);
        }
        return true;
    }

    @Override // com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao
    public int update(Ud.a aVar) {
        BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f13246a;
        billerSearchRecordDataBase_Impl.assertNotSuspendingTransaction();
        billerSearchRecordDataBase_Impl.beginTransaction();
        try {
            int iE = ((Td.b) this.f13249d).e(aVar);
            billerSearchRecordDataBase_Impl.setTransactionSuccessful();
            return iE;
        } finally {
            billerSearchRecordDataBase_Impl.endTransaction();
        }
    }

    public P0(BillerSearchRecordDataBase_Impl database) {
        this.f13246a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f13247b = new Td.a(database, 0);
        Intrinsics.checkNotNullParameter(database, "database");
        this.f13248c = new Td.b(database, 0);
        Intrinsics.checkNotNullParameter(database, "database");
        this.f13249d = new Td.b(database, 1);
        this.f13250e = new Td.c(database, 0);
        this.f13251f = new Td.c(database, 1);
    }

    public P0() {
        this.f13246a = new int[]{p241q.e.abc_textfield_search_default_mtrl_alpha, p241q.e.abc_textfield_default_mtrl_alpha, p241q.e.abc_ab_share_pack_mtrl_alpha};
        this.f13247b = new int[]{p241q.e.abc_ic_commit_search_api_mtrl_alpha, p241q.e.abc_seekbar_tick_mark_material, p241q.e.abc_ic_menu_share_mtrl_alpha, p241q.e.abc_ic_menu_copy_mtrl_am_alpha, p241q.e.abc_ic_menu_cut_mtrl_alpha, p241q.e.abc_ic_menu_selectall_mtrl_alpha, p241q.e.abc_ic_menu_paste_mtrl_am_alpha};
        this.f13248c = new int[]{p241q.e.abc_textfield_activated_mtrl_alpha, p241q.e.abc_textfield_search_activated_mtrl_alpha, p241q.e.abc_cab_background_top_mtrl_alpha, p241q.e.abc_text_cursor_material, p241q.e.abc_text_select_handle_left_mtrl, p241q.e.abc_text_select_handle_middle_mtrl, p241q.e.abc_text_select_handle_right_mtrl};
        this.f13249d = new int[]{p241q.e.abc_popup_background_mtrl_mult, p241q.e.abc_cab_background_internal_bg, p241q.e.abc_menu_hardkey_panel_mtrl_mult};
        this.f13250e = new int[]{p241q.e.abc_tab_indicator_material, p241q.e.abc_textfield_search_material};
        this.f13251f = new int[]{p241q.e.abc_btn_check_material, p241q.e.abc_btn_radio_material, p241q.e.abc_btn_check_material_anim, p241q.e.abc_btn_radio_material_anim};
    }

    public P0(View itemView, int i7) {
        switch (i7) {
            case 9:
                this.f13246a = itemView.getContext();
                View viewFindViewById = itemView.findViewById(Pd.c.mllb_content_root);
                this.f13249d = viewFindViewById;
                this.f13250e = (ImageView) itemView.findViewById(Pd.c.mllb_icon_iv);
                this.f13247b = (TextView) itemView.findViewById(Pd.c.mllb_menu_name_tv);
                TextView textView = (TextView) itemView.findViewById(Pd.c.mllb_desc_tv);
                this.f13248c = textView;
                this.f13251f = (ImageView) itemView.findViewById(Pd.c.mllb_corner_icon_iv);
                viewFindViewById.setOnClickListener(new p054dd.d(2));
                textView.setSelected(true);
                break;
            default:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.f13246a = itemView;
                this.f13251f = (LinearLayout) itemView.findViewById(Ac.e.itemContainer);
                this.f13247b = (TextView) itemView.findViewById(Ac.e.tvName);
                this.f13248c = (TextView) itemView.findViewById(Ac.e.tvAmount);
                this.f13249d = itemView.findViewById(Ac.e.dividerView);
                itemView.setOnClickListener(new Ha.d(this, 13));
                break;
        }
    }
}
