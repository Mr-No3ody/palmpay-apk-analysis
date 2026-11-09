package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.RequiresApi;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderCreate);
        return true;
    }

    public static boolean isColorResource(int i7) {
        return 28 <= i7 && i7 <= 31;
    }
}
