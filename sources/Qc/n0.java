package Qc;

import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7805b;

    public /* synthetic */ n0(int i7, int i10) {
        this.f7804a = i10;
        this.f7805b = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7804a) {
            case 0:
                ProductBean productBean = (ProductBean) obj2;
                int i7 = this.f7805b;
                ProductBean productBean2 = (ProductBean) obj;
                return Bf.a.a(Long.valueOf(i7 == 1 ? productBean.getPayTime() : productBean.getCashTime()), Long.valueOf(i7 == 1 ? productBean2.getPayTime() : productBean2.getCashTime()));
            case 1:
                ProductBean productBean3 = (ProductBean) obj2;
                int i10 = this.f7805b;
                ProductBean productBean4 = (ProductBean) obj;
                return Bf.a.a(Long.valueOf(i10 == 1 ? productBean3.getPayTime() : productBean3.getCashTime()), Long.valueOf(i10 == 1 ? productBean4.getPayTime() : productBean4.getCashTime()));
            case 2:
                ProductBean productBean5 = (ProductBean) obj2;
                int i11 = this.f7805b;
                ProductBean productBean6 = (ProductBean) obj;
                return Bf.a.a(Long.valueOf(i11 == 1 ? productBean5.getPayTime() : productBean5.getCashTime()), Long.valueOf(i11 == 1 ? productBean6.getPayTime() : productBean6.getCashTime()));
            default:
                ProductBean productBean7 = (ProductBean) obj2;
                int i12 = this.f7805b;
                ProductBean productBean8 = (ProductBean) obj;
                return Bf.a.a(Long.valueOf(i12 == 1 ? productBean7.getPayTime() : productBean7.getCashTime()), Long.valueOf(i12 == 1 ? productBean8.getPayTime() : productBean8.getCashTime()));
        }
    }
}
