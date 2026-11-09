package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ProductData extends ProductData {
    private final Integer productId;

    public AutoValue_ProductData(@Nullable Integer num) {
        this.productId = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        Integer num = this.productId;
        Integer productId = ((ProductData) obj).getProductId();
        if (num == null) {
            return productId == null;
        }
        return num.equals(productId);
    }

    @Override // com.google.android.datatransport.ProductData
    @Nullable
    public Integer getProductId() {
        return this.productId;
    }

    public int hashCode() {
        Integer num = this.productId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.productId + "}";
    }
}
