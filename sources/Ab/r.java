package Ab;

import C0.G;
import E.I;
import Pa.C0525w;
import Pa.T;
import Pa.Z;
import Pa.a0;
import Pa.n0;
import Pa.r0;
import U2.EnumC0614e;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.internal.WebViewProviderFactory;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.hermes.intl.ILocaleObject;
import com.facebook.hermes.intl.IPlatformDateTimeFormatter;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.core.FileCacheFactory;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.google.api.Service;
import com.growingio.android.circler.ThreadSafeTipView$OnExitListener;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithSmsFragment;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.init.LivenessTask;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.managemoney.ui.activity.InsuranceTakePhotoActivity;
import com.transsnet.palmpay.send_money.api.kkcar.IApiKkCarService;
import com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p051d9.C1623u;
import retrofit2.C1987e;
import retrofit2.C1993k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.K;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements OnRvItemClickListener, FutureCallback, ProfileInstaller$DiagnosticsCallback, AnimationInformation, Consumer, ImageDecoder, IPlatformDateTimeFormatter, ModelLoaderFactory, OnSendCodeListener, AccessibilityViewCommand, WebViewProviderFactory, ThreadSafeTipView$OnExitListener, Observer, FileCacheFactory, Argument2Callback, LiveID$ILiveIDMonitor, Callback, BillerCouponClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f139b;

    public /* synthetic */ r(int i7, boolean z3) {
        this.f138a = i7;
    }

    public static void a(StringBuilder sb2, char[] cArr, char c6) {
        for (int i7 = 0; i7 < sb2.length(); i7++) {
            for (char c10 : cArr) {
                if (sb2.charAt(i7) == c10) {
                    sb2.setCharAt(i7, c6);
                    break;
                }
            }
        }
    }

    public static int b(EnumC0614e enumC0614e) throws U2.B {
        int iOrdinal = enumC0614e.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new U2.B("Invalid DateStyle: ".concat(enumC0614e.toString()), 0);
            }
        }
        return i7;
    }

    public static int c(U2.n nVar) throws U2.B {
        int iOrdinal = nVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new U2.B("Invalid DateStyle: ".concat(nVar.toString()), 0);
            }
        }
        return i7;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        T.b(-4).execute(new Z(obj, ((a0) this.f139b).f7070b, 1));
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public ModelLoader build() {
        return new V4.a(new He.a((Context) this.f139b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public void configure(ILocaleObject iLocaleObject, String str, String str2, U2.h hVar, U2.p pVar, U2.g gVar, U2.q qVar, U2.l lVar, U2.f fVar, U2.i iVar, U2.k kVar, U2.m mVar, U2.o oVar, U2.j jVar, Object obj, EnumC0614e enumC0614e, U2.n nVar, Object obj2) throws U2.B {
        String localizedPattern;
        Calendar calendar;
        ILocaleObject iLocaleObject2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        StringBuilder sb2 = new StringBuilder();
        EnumC0614e enumC0614e2 = EnumC0614e.f9132a;
        U2.j jVar2 = U2.j.f9142b;
        U2.j jVar3 = U2.j.f9141a;
        U2.n nVar2 = U2.n.f9153a;
        if (enumC0614e == enumC0614e2 && nVar == nVar2) {
            int iOrdinal = pVar.ordinal();
            String str12 = "";
            if (iOrdinal == 0) {
                str3 = "EEEE";
            } else if (iOrdinal == 1) {
                str3 = "EEE";
            } else if (iOrdinal == 2) {
                str3 = "EEEEE";
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException();
                }
                str3 = "";
            }
            sb2.append(str3);
            int iOrdinal2 = gVar.ordinal();
            if (iOrdinal2 == 0) {
                str4 = "GGGG";
            } else if (iOrdinal2 == 1) {
                str4 = "GGG";
            } else if (iOrdinal2 == 2) {
                str4 = "G5";
            } else {
                if (iOrdinal2 != 3) {
                    throw new IllegalArgumentException();
                }
                str4 = "";
            }
            sb2.append(str4);
            int iOrdinal3 = qVar.ordinal();
            if (iOrdinal3 == 0) {
                str5 = "yyyy";
            } else if (iOrdinal3 == 1) {
                str5 = "yy";
            } else {
                if (iOrdinal3 != 2) {
                    throw new IllegalArgumentException();
                }
                str5 = "";
            }
            sb2.append(str5);
            int iOrdinal4 = lVar.ordinal();
            if (iOrdinal4 == 0) {
                str6 = "M";
            } else if (iOrdinal4 == 1) {
                str6 = "MM";
            } else if (iOrdinal4 == 2) {
                str6 = "MMMM";
            } else if (iOrdinal4 == 3) {
                str6 = "MMM";
            } else if (iOrdinal4 == 4) {
                str6 = "MMMMM";
            } else {
                if (iOrdinal4 != 5) {
                    throw new IllegalArgumentException();
                }
                str6 = "";
            }
            sb2.append(str6);
            int iOrdinal5 = fVar.ordinal();
            if (iOrdinal5 == 0) {
                str7 = "d";
            } else if (iOrdinal5 == 1) {
                str7 = "dd";
            } else {
                if (iOrdinal5 != 2) {
                    throw new IllegalArgumentException();
                }
                str7 = "";
            }
            sb2.append(str7);
            if (jVar == jVar3 || jVar == jVar2) {
                int iOrdinal6 = iVar.ordinal();
                if (iOrdinal6 == 0) {
                    str8 = "h";
                } else if (iOrdinal6 == 1) {
                    str8 = "hh";
                } else {
                    if (iOrdinal6 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str8 = "";
                }
                sb2.append(str8);
            } else {
                int iOrdinal7 = iVar.ordinal();
                if (iOrdinal7 == 0) {
                    str11 = "k";
                } else if (iOrdinal7 == 1) {
                    str11 = "kk";
                } else {
                    if (iOrdinal7 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str11 = "";
                }
                sb2.append(str11);
            }
            int iOrdinal8 = kVar.ordinal();
            if (iOrdinal8 == 0) {
                str9 = "m";
            } else if (iOrdinal8 == 1) {
                str9 = "mm";
            } else {
                if (iOrdinal8 != 2) {
                    throw new IllegalArgumentException();
                }
                str9 = "";
            }
            sb2.append(str9);
            int iOrdinal9 = mVar.ordinal();
            if (iOrdinal9 == 0) {
                str10 = "s";
            } else if (iOrdinal9 == 1) {
                str10 = "ss";
            } else {
                if (iOrdinal9 != 2) {
                    throw new IllegalArgumentException();
                }
                str10 = "";
            }
            sb2.append(str10);
            switch (oVar.ordinal()) {
                case 0:
                    str12 = "zzzz";
                    sb2.append(str12);
                    break;
                case 1:
                    str12 = "OOOO";
                    sb2.append(str12);
                    break;
                case 2:
                    str12 = "vvvv";
                    sb2.append(str12);
                    break;
                case 3:
                    str12 = "z";
                    sb2.append(str12);
                    break;
                case 4:
                    str12 = "O";
                    sb2.append(str12);
                    break;
                case 5:
                    str12 = "v";
                    sb2.append(str12);
                    break;
                case 6:
                    sb2.append(str12);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if (enumC0614e == enumC0614e2) {
                localizedPattern = ((SimpleDateFormat) DateFormat.getTimeInstance(c(nVar), (ULocale) iLocaleObject.getLocale())).toLocalizedPattern();
            } else {
                localizedPattern = nVar == nVar2 ? ((SimpleDateFormat) DateFormat.getDateInstance(b(enumC0614e), (ULocale) iLocaleObject.getLocale())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(b(enumC0614e), c(nVar), (ULocale) iLocaleObject.getLocale())).toLocalizedPattern();
            }
            sb2.append(localizedPattern);
            HashMap<String, String> unicodeExtensions = iLocaleObject.getUnicodeExtensions();
            if (unicodeExtensions.containsKey("hc")) {
                String str13 = unicodeExtensions.get("hc");
                if (str13 == "h11" || str13 == "h12") {
                    a(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str13 == "h23" || str13 == "h24") {
                    a(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (jVar == jVar3 || jVar == jVar2) {
                a(sb2, new char[]{'H', 'K', 'k'}, 'h');
            } else if (jVar == U2.j.f9143c || jVar == U2.j.f9144d) {
                a(sb2, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!(obj2 instanceof U2.A) && !(obj2 instanceof U2.z)) {
                if (((Boolean) obj2).booleanValue()) {
                    a(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    a(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        String string = sb2.toString();
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            ILocaleObject iLocaleObjectCloneObject = iLocaleObject.cloneObject();
            iLocaleObjectCloneObject.setUnicodeExtensions("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) iLocaleObjectCloneObject.getLocale());
        }
        if (str2.isEmpty()) {
            iLocaleObject2 = iLocaleObject;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(str2) == null) {
                    throw new U2.B("Invalid numbering system: ".concat(str2), 0);
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add(str2);
                iLocaleObject2 = iLocaleObject;
                iLocaleObject2.setUnicodeExtensions("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new U2.B("Invalid numbering system: ".concat(str2), 0);
            }
        }
        if (calendar != null) {
            this.f139b = DateFormat.getPatternInstance(calendar, string, (ULocale) iLocaleObject2.getLocale());
        } else {
            this.f139b = DateFormat.getPatternInstance(string, (ULocale) iLocaleObject2.getLocale());
        }
        if ((obj instanceof U2.A) || (obj instanceof U2.z)) {
            return;
        }
        ((DateFormat) this.f139b).setTimeZone(TimeZone.getTimeZone((String) obj));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).createWebView(webView));
    }

    @Override // com.facebook.imagepipeline.decoder.ImageDecoder
    public CloseableImage decode(p109h3.e eVar, int i7, QualityInfo qualityInfo, com.facebook.imagepipeline.common.c cVar) {
        ColorSpace colorSpace;
        switch (this.f138a) {
            case 5:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f139b;
                if (animatedFactoryV2Impl.f21345e == null) {
                    animatedFactoryV2Impl.f21345e = new Y2.a(new C0525w(animatedFactoryV2Impl, 8), animatedFactoryV2Impl.f21341a);
                }
                return animatedFactoryV2Impl.f21345e.decodeWebP(eVar, cVar, cVar.f21426b);
            default:
                eVar.k();
                W2.e eVar2 = eVar.f37275b;
                N2.a aVar = (N2.a) this.f139b;
                aVar.getClass();
                Boolean bool = Boolean.FALSE;
                if (bool.booleanValue()) {
                    cVar.getClass();
                    eVar.k();
                    colorSpace = eVar.f37283o;
                } else {
                    cVar.getClass();
                    colorSpace = null;
                }
                if (eVar2 == W2.c.f10530a) {
                    CloseableReference closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace = ((PlatformDecoder) aVar.f6067d).decodeJPEGFromEncodedImageWithColorSpace(eVar, cVar.f21425a, null, i7, colorSpace);
                    try {
                        closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace.getClass();
                        eVar.k();
                        int i10 = eVar.f37276c;
                        eVar.k();
                        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace, qualityInfo, i10, eVar.f37277d);
                        closeableStaticBitmapOf.putExtra("is_rounded", bool);
                        closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace.close();
                        return closeableStaticBitmapOf;
                    } catch (Throwable th) {
                        CloseableReference.d(closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace);
                        throw th;
                    }
                }
                if (eVar2 == W2.c.f10532c) {
                    eVar.k();
                    if (eVar.f37278e != -1) {
                        eVar.k();
                        if (eVar.f37279f != -1) {
                            cVar.getClass();
                            ImageDecoder imageDecoder = (ImageDecoder) aVar.f6064a;
                            return imageDecoder != null ? imageDecoder.decode(eVar, i7, qualityInfo, cVar) : aVar.a(eVar, cVar);
                        }
                    }
                    throw new g3.a("image width or height is incorrect", eVar);
                }
                if (eVar2 == W2.c.f10539j) {
                    cVar.getClass();
                    ImageDecoder imageDecoder2 = (ImageDecoder) aVar.f6065b;
                    return imageDecoder2 != null ? imageDecoder2.decode(eVar, i7, qualityInfo, cVar) : aVar.a(eVar, cVar);
                }
                if (eVar2 != W2.c.f10542m) {
                    if (eVar2 != W2.e.f10545c) {
                        return aVar.a(eVar, cVar);
                    }
                    throw new g3.a("unknown image format", eVar);
                }
                p214o3.b bVar = (p214o3.b) aVar.f6066c;
                if (bVar != null) {
                    return bVar.decode(eVar, i7, qualityInfo, cVar);
                }
                return null;
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String fieldToString(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        }
        if (attribute == DateFormat.Field.MONTH) {
            return "month";
        }
        if (attribute == DateFormat.Field.DAY_OF_MONTH) {
            return "day";
        }
        if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
            return "hour";
        }
        if (attribute == DateFormat.Field.MINUTE) {
            return "minute";
        }
        if (attribute == DateFormat.Field.SECOND) {
            return "second";
        }
        if (attribute == DateFormat.Field.TIME_ZONE) {
            return "timeZoneName";
        }
        if (attribute == DateFormat.Field.AM_PM) {
            return "dayPeriod";
        }
        return attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String format(double d2) {
        return ((DateFormat) this.f139b).format(new Date((long) d2));
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public AttributedCharacterIterator formatToParts(double d2) {
        return ((DateFormat) this.f139b).formatToCharacterIterator(Double.valueOf(d2));
    }

    @Override // com.facebook.imagepipeline.core.FileCacheFactory
    public FileCache get(p136j2.b bVar) {
        DiskStorage diskStorage = ((p166l2.a) this.f139b).get(bVar);
        ExecutorService executorServiceNewOptimizedSingleThreadExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.facebook.imagepipeline.core.DiskStorageCacheFactory");
        return new com.facebook.cache.disk.f(diskStorage, bVar.f38185g, new p136j2.e(bVar.f38184f, bVar.f38183e, bVar.f38182d), bVar.f38187i, bVar.f38186h, bVar.f38188j, executorServiceNewOptimizedSingleThreadExecutor);
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (ULocale uLocale : ULocale.getAvailableLocales()) {
            arrayList.add(uLocale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String getDefaultCalendarName(ILocaleObject iLocaleObject) {
        String type = DateFormat.getDateInstance(3, (ULocale) iLocaleObject.getLocale()).getCalendar().getType();
        G.h hVar = U2.E.f9114d;
        return !hVar.containsKey(type) ? type : (String) hVar.get(type);
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public U2.j getDefaultHourCycle(ILocaleObject iLocaleObject) {
        U2.j jVar = U2.j.f9144d;
        try {
            String pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) iLocaleObject.getLocale())).toPattern();
            StringBuilder sb2 = new StringBuilder();
            boolean z3 = false;
            for (int i7 = 0; i7 < pattern.length(); i7++) {
                char cCharAt = pattern.charAt(i7);
                if (cCharAt == '\'') {
                    z3 = !z3;
                } else if (!z3 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb2.append(pattern.charAt(i7));
                }
            }
            String string = sb2.toString();
            if (string.contains(String.valueOf('h'))) {
                return U2.j.f9142b;
            }
            if (string.contains(String.valueOf('K'))) {
                return U2.j.f9141a;
            }
            if (string.contains(String.valueOf('H'))) {
                return U2.j.f9143c;
            }
            return jVar;
        } catch (ClassCastException unused) {
        }
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String getDefaultNumberingSystem(ILocaleObject iLocaleObject) {
        return NumberingSystem.getInstance((ULocale) iLocaleObject.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.IPlatformDateTimeFormatter
    public String getDefaultTimeZone(ILocaleObject iLocaleObject) {
        return Calendar.getInstance((ULocale) iLocaleObject.getLocale()).getTimeZone().getID();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(DropDataContentProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getDropDataProvider());
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameCount() {
        return ((AnimatedDrawableBackend) this.f139b).getFrameCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameDurationMs(int i7) {
        return ((AnimatedDrawableBackend) this.f139b).getDurationMsForFrame(i7);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getLoopCount() {
        return ((AnimatedDrawableBackend) this.f139b).getLoopCount();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getProxyController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(ServiceWorkerControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(TracingControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public WebViewBuilderBoundaryInterface getWebViewBuilder() {
        return (WebViewBuilderBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebViewBuilderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getWebViewBuilder());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public String[] getWebViewFeatures() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f139b).getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f139b).getWebkitToCompatConverter());
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        if (((Number) obj).intValue() == -1) {
            try {
                io.fastkv.n.J(intent);
                io.fastkv.n.N(true);
                ((EnableTouchIdDialog) this.f139b).animateSuccess();
            } catch (Exception unused) {
                Z4.c cVar = n0.f7107i;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onButtonVisibilityChange(View view, int i7) {
        Bc.i iVar;
        TextView textView;
        if (i7 != 0 || (iVar = ((LogInWithSmsFragment) this.f139b).f26223A) == null || (textView = (TextView) iVar.f728f) == null) {
            return;
        }
        p220oa.h.s(textView, true);
    }

    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponClaimComplete() {
        ModelBettingRootView modelBettingRootView = ((BettingHomeActivity) this.f139b).f26676p;
        if (modelBettingRootView != null) {
            modelBettingRootView.d();
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener
    public void onCouponUseClick(List list, long j6) {
        BettingHomeActivity.p((BettingHomeActivity) this.f139b, list, j6);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        InsuranceTakePhotoActivity insuranceTakePhotoActivity = (InsuranceTakePhotoActivity) this.f139b;
        insuranceTakePhotoActivity.showLoadingDialog(false);
        int i7 = InsuranceTakePhotoActivity.f32109C;
        insuranceTakePhotoActivity.r();
        insuranceTakePhotoActivity.t = false;
        ToastUtils.showLong(G.o("something error, ", e10.getMessage()), new Object[0]);
        e10.printStackTrace();
    }

    @Override // com.growingio.android.circler.ThreadSafeTipView$OnExitListener
    public void onExitDebugger() {
        ((com.growingio.android.circler.c) this.f139b).a();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((C1987e) this.f139b).completeExceptionally(th);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        int i10 = this.f138a;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        switch (i10) {
            case 0:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) this.f139b;
                cLInstallmentBorrowFragment.f30559o1 = i7;
                cLInstallmentBorrowFragment.f30562p1 = (CLRepaymentPlanData) cLInstallmentBorrowFragment.f30566r1.get(i7);
                int i11 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.r0();
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i12 = OcContactActivity.f29378l1;
                OcContactActivity ocContactActivity = (OcContactActivity) this.f139b;
                Object value = ocContactActivity.f29389K0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setVisibility(8);
                n0 n0VarG = n0.g();
                String strConcat = "OcContactActivity".concat("_element_click");
                ArrayList arrayList = ocContactActivity.f29407c1;
                if (arrayList != null) {
                    n0VarG.m(strConcat, "first_contact_rv", (String) arrayList.get(i7));
                    return;
                } else {
                    Intrinsics.n("mFirstLabelData");
                    throw null;
                }
            default:
                Object obj = ((CLMainFragment) this.f139b).f30275e1.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OcFinanceMenuData ocFinanceMenuData = (OcFinanceMenuData) obj;
                org.chromium.support_lib_boundary.util.b.Q(ocFinanceMenuData.getJumpType(), ocFinanceMenuData.getJumpPath(), ocFinanceMenuData.getJumpParams(), null);
                return;
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        String t = (String) obj;
        Intrinsics.checkNotNullParameter(t, "t");
        InsuranceTakePhotoActivity insuranceTakePhotoActivity = (InsuranceTakePhotoActivity) this.f139b;
        insuranceTakePhotoActivity.showLoadingDialog(false);
        InsuranceTakePhotoActivity.m(insuranceTakePhotoActivity);
        insuranceTakePhotoActivity.t = false;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, K k2) {
        boolean zIsSuccessful = k2.f41873a.isSuccessful();
        C1987e c1987e = (C1987e) this.f139b;
        if (zIsSuccessful) {
            c1987e.complete(k2.f41874b);
        } else {
            c1987e.completeExceptionally(new C1993k(k2));
        }
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onResultReceived(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f139b).setResultCode(i7);
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        String securityEmail;
        LogInWithSmsFragment logInWithSmsFragment = (LogInWithSmsFragment) this.f139b;
        logInWithSmsFragment.f26229w = i10;
        if (i7 != 4 || TextUtils.isEmpty(str)) {
            C1623u c1623u = (C1623u) logInWithSmsFragment.f27328i;
            if (c1623u != null) {
                String strV = logInWithSmsFragment.v();
                if (TextUtils.isEmpty(logInWithSmsFragment.f26224B)) {
                    Bc.i iVar = logInWithSmsFragment.f26223A;
                    securityEmail = iVar != null ? ((OneTimeCodeV5View) iVar.f725c).getSecurityEmail() : null;
                } else {
                    securityEmail = logInWithSmsFragment.f26224B;
                }
                c1623u.getSmsCode(strV, securityEmail, i7, 2);
            }
        } else {
            Intrinsics.e(str);
            logInWithSmsFragment.f26228v = str;
            if (r0.j(logInWithSmsFragment.w(), logInWithSmsFragment.f26229w, logInWithSmsFragment.f26228v, 740, logInWithSmsFragment)) {
                logInWithSmsFragment.showLoadingDialog(true);
            }
        }
        Bc.i iVar2 = logInWithSmsFragment.f26223A;
        if (iVar2 != null) {
            p220oa.h.s((TextView) iVar2.f728f, true);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        switch (this.f138a) {
            case 1:
                break;
            default:
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f139b;
                try {
                    kVar.b(obj);
                } catch (Throwable th) {
                    kVar.d(th);
                }
                break;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, p074f0.h hVar) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f139b;
        if (!drawerLayout.isDrawerOpen(view) || drawerLayout.getDrawerLockMode(view) == 2) {
            return false;
        }
        drawerLayout.closeDrawer(view);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.palmpay.lib.liveness.LiveID$ILiveIDMonitor
    public void report(String eventId, Map map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (map == null) {
            map = new LinkedHashMap();
        }
        map.put(LivenessTask.SDK_VERSION, "1.0.13");
        ((LiveID$ILiveIDMonitor) this.f139b).report(eventId, map);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public void startUpWebView(androidx.webkit.l lVar, WebViewCompat$WebViewStartUpCallback webViewCompat$WebViewStartUpCallback) {
        ((WebViewProviderFactoryBoundaryInterface) this.f139b).startUpWebView(new org.chromium.support_lib_boundary.util.a(new C0525w(lVar, 16)), new org.chromium.support_lib_boundary.util.a(new Oe.a(webViewCompat$WebViewStartUpCallback, 14)));
    }

    public /* synthetic */ r(Object obj, int i7) {
        this.f138a = i7;
        this.f139b = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.f138a) {
            case 1:
                ((I) this.f139b).close();
                break;
            default:
                ((androidx.concurrent.futures.k) this.f139b).d(th);
                break;
        }
    }

    public r(Context context) {
        this.f138a = 14;
        this.f139b = new OverScroller(context);
    }

    public r(int i7) {
        this.f138a = i7;
        switch (i7) {
            case 20:
                this.f139b = (IApiKkCarService) p324va.e.a().f43145a.b(IApiKkCarService.class);
                break;
            default:
                this.f139b = (ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ExtraCroppingQuirk.class);
                break;
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onDiagnosticReceived(int i7, Object obj) {
    }
}
