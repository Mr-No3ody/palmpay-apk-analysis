package p189me.jessyan.autosize;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import p189me.jessyan.autosize.external.ExternalAdaptInfo;
import p189me.jessyan.autosize.internal.CustomAdapt;
import p189me.jessyan.autosize.unit.Subunits;
import p189me.jessyan.autosize.utils.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoSizeCompat {
    private static final int MODE_DEVICE_SIZE = Integer.MIN_VALUE;
    private static final int MODE_MASK = -1073741824;
    private static final int MODE_ON_WIDTH = 1073741824;
    private static final int MODE_SHIFT = 30;
    private static SparseArray<DisplayMetricsInfo> mCache = new SparseArray<>();

    /* JADX INFO: renamed from: me.jessyan.autosize.AutoSizeCompat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$me$jessyan$autosize$unit$Subunits;

        static {
            int[] iArr = new int[Subunits.values().length];
            $SwitchMap$me$jessyan$autosize$unit$Subunits = iArr;
            try {
                iArr[Subunits.PT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.MM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AutoSizeCompat() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void autoConvertDensity(Resources resources, float f10, boolean z3) {
        float density;
        int densityDpi;
        float scaledDensity;
        float xdpi;
        int screenWidthDp;
        int screenHeightDp;
        float initScaledDensity;
        Preconditions.checkNotNull(resources, "resources == null");
        Preconditions.checkMainThread();
        float designWidth = z3 ? AutoSizeConfig.getInstance().getUnitsManager().getDesignWidth() : AutoSizeConfig.getInstance().getUnitsManager().getDesignHeight();
        if (designWidth <= 0.0f) {
            designWidth = f10;
        }
        int iRound = Math.round(AutoSizeConfig.getInstance().getInitScaledDensity() * (f10 + designWidth + (z3 ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight())));
        int i7 = z3 ? 1073741824 | (iRound & 1073741823) : iRound & 1073741823;
        int i10 = AutoSizeConfig.getInstance().isUseDeviceSize() ? i7 | Integer.MIN_VALUE : i7 & Integer.MAX_VALUE;
        DisplayMetricsInfo displayMetricsInfo = mCache.get(i10);
        if (displayMetricsInfo == null) {
            density = ((z3 ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight()) * 1.0f) / f10;
            if (AutoSizeConfig.getInstance().getPrivateFontScale() > 0.0f) {
                initScaledDensity = AutoSizeConfig.getInstance().getPrivateFontScale() * density;
            } else {
                initScaledDensity = (AutoSizeConfig.getInstance().isExcludeFontScale() ? 1.0f : (AutoSizeConfig.getInstance().getInitScaledDensity() * 1.0f) / AutoSizeConfig.getInstance().getInitDensity()) * density;
            }
            scaledDensity = initScaledDensity;
            densityDpi = (int) (160.0f * density);
            screenWidthDp = (int) (AutoSizeConfig.getInstance().getScreenWidth() / density);
            screenHeightDp = (int) (AutoSizeConfig.getInstance().getScreenHeight() / density);
            xdpi = ((z3 ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight()) * 1.0f) / designWidth;
            mCache.put(i10, new DisplayMetricsInfo(density, densityDpi, scaledDensity, xdpi, screenWidthDp, screenHeightDp));
        } else {
            density = displayMetricsInfo.getDensity();
            densityDpi = displayMetricsInfo.getDensityDpi();
            scaledDensity = displayMetricsInfo.getScaledDensity();
            xdpi = displayMetricsInfo.getXdpi();
            screenWidthDp = displayMetricsInfo.getScreenWidthDp();
            screenHeightDp = displayMetricsInfo.getScreenHeightDp();
        }
        setDensity(resources, density, densityDpi, scaledDensity, xdpi);
        setScreenSizeDp(resources, screenWidthDp, screenHeightDp);
    }

    public static void autoConvertDensityBaseOnHeight(Resources resources, float f10) {
        autoConvertDensity(resources, f10, false);
    }

    public static void autoConvertDensityBaseOnWidth(Resources resources, float f10) {
        autoConvertDensity(resources, f10, true);
    }

    public static void autoConvertDensityOfCustomAdapt(Resources resources, CustomAdapt customAdapt) {
        Preconditions.checkNotNull(customAdapt, "customAdapt == null");
        float sizeInDp = customAdapt.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            sizeInDp = customAdapt.isBaseOnWidth() ? AutoSizeConfig.getInstance().getDesignWidthInDp() : AutoSizeConfig.getInstance().getDesignHeightInDp();
        }
        autoConvertDensity(resources, sizeInDp, customAdapt.isBaseOnWidth());
    }

    public static void autoConvertDensityOfExternalAdaptInfo(Resources resources, ExternalAdaptInfo externalAdaptInfo) {
        Preconditions.checkNotNull(externalAdaptInfo, "externalAdaptInfo == null");
        float sizeInDp = externalAdaptInfo.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            sizeInDp = externalAdaptInfo.isBaseOnWidth() ? AutoSizeConfig.getInstance().getDesignWidthInDp() : AutoSizeConfig.getInstance().getDesignHeightInDp();
        }
        autoConvertDensity(resources, sizeInDp, externalAdaptInfo.isBaseOnWidth());
    }

    public static void autoConvertDensityOfGlobal(Resources resources) {
        if (AutoSizeConfig.getInstance().isBaseOnWidth()) {
            autoConvertDensityBaseOnWidth(resources, AutoSizeConfig.getInstance().getDesignWidthInDp());
        } else {
            autoConvertDensityBaseOnHeight(resources, AutoSizeConfig.getInstance().getDesignHeightInDp());
        }
    }

    public static void cancelAdapt(Resources resources) {
        float f10;
        Preconditions.checkMainThread();
        float initXdpi = AutoSizeConfig.getInstance().getInitXdpi();
        int i7 = AnonymousClass1.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i7 != 1) {
            f10 = i7 == 2 ? 25.4f : 72.0f;
            setDensity(resources, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
            setScreenSizeDp(resources, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
        }
        initXdpi /= f10;
        setDensity(resources, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
        setScreenSizeDp(resources, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
    }

    private static DisplayMetrics getMetricsOnMiui(Resources resources) {
        if (AutoSizeConfig.getInstance().isMiui() && AutoSizeConfig.getInstance().getTmpMetricsField() != null) {
            try {
                return (DisplayMetrics) AutoSizeConfig.getInstance().getTmpMetricsField().get(resources);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static void setDensity(Resources resources, float f10, int i7, float f11, float f12) {
        setDensity(resources.getDisplayMetrics(), f10, i7, f11, f12);
        setDensity(AutoSizeConfig.getInstance().getApplication().getResources().getDisplayMetrics(), f10, i7, f11, f12);
        DisplayMetrics metricsOnMiui = getMetricsOnMiui(resources);
        DisplayMetrics metricsOnMiui2 = getMetricsOnMiui(AutoSizeConfig.getInstance().getApplication().getResources());
        if (metricsOnMiui != null) {
            setDensity(metricsOnMiui, f10, i7, f11, f12);
        }
        if (metricsOnMiui2 != null) {
            setDensity(metricsOnMiui2, f10, i7, f11, f12);
        }
    }

    private static void setScreenSizeDp(Resources resources, int i7, int i10) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP() && AutoSizeConfig.getInstance().getUnitsManager().isSupportScreenSizeDP()) {
            setScreenSizeDp(resources.getConfiguration(), i7, i10);
            setScreenSizeDp(AutoSizeConfig.getInstance().getApplication().getResources().getConfiguration(), i7, i10);
        }
    }

    private static void setScreenSizeDp(Configuration configuration, int i7, int i10) {
        configuration.screenWidthDp = i7;
        configuration.screenHeightDp = i10;
    }

    private static void setDensity(DisplayMetrics displayMetrics, float f10, int i7, float f11, float f12) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP()) {
            displayMetrics.density = f10;
            displayMetrics.densityDpi = i7;
        }
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportSP()) {
            displayMetrics.scaledDensity = f11;
        }
        int i10 = AnonymousClass1.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i10 == 1) {
            displayMetrics.xdpi = f12 * 72.0f;
        } else if (i10 == 2) {
            displayMetrics.xdpi = f12 * 25.4f;
        } else {
            if (i10 != 4) {
                return;
            }
            displayMetrics.xdpi = f12;
        }
    }
}
