package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HarmonizedColors {
    private static final String TAG = "HarmonizedColors";

    private HarmonizedColors() {
    }

    @RequiresApi(api = BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    private static void addHarmonizedColorAttributesToReplacementMap(@NonNull Map<Integer, Integer> map, @NonNull TypedArray typedArray, @Nullable TypedArray typedArray2, @ColorInt int i7) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i10 = 0; i10 < typedArray.getIndexCount(); i10++) {
            int resourceId = typedArray2.getResourceId(i10, 0);
            if (resourceId != 0 && typedArray.hasValue(i10) && ResourcesLoaderUtils.isColorResource(typedArray.getType(i10))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArray.getColor(i10, 0), i7)));
            }
        }
    }

    @NonNull
    public static void applyToContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map<Integer, Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            int themeOverlayResourceId = harmonizedColorsOptions.getThemeOverlayResourceId(0);
            if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, mapCreateHarmonizedColorReplacementMap) || themeOverlayResourceId == 0) {
                return;
            }
            ThemeUtils.applyThemeOverlay(context, themeOverlayResourceId);
        }
    }

    @RequiresApi(api = BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    private static Map<Integer, Integer> createHarmonizedColorReplacementMap(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        HashMap map = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), TAG);
        for (int i7 : harmonizedColorsOptions.getColorResourceIds()) {
            map.put(Integer.valueOf(i7), Integer.valueOf(MaterialColors.harmonize(context.getColor(i7), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributes);
                TypedArray typedArrayObtainStyledAttributes2 = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                addHarmonizedColorAttributesToReplacementMap(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, color);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @ChecksSdkIntAtLeast(api = BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map<Integer, Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, harmonizedColorsOptions.getThemeOverlayResourceId(R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            if (ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, mapCreateHarmonizedColorReplacementMap)) {
                return contextThemeWrapper;
            }
        }
        return context;
    }
}
