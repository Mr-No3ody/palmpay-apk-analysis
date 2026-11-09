package O3;

import com.flexibank.sdk.cashier.bean.FlexiBankCalcOfPaymentMethodResultBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierFlexiPreCreditInfoBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"LO3/g;", "LW3/f;", "<init>", "()V", "LO3/g$b;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "LO3/g$b;", "e", "()LO3/g$b;", "setData", "(LO3/g$b;)V", "b", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends W3.f {

    @Nullable
    private b data;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LO3/g$a;", "", "<init>", "()V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFlexiPreCreditInfoBean;", "okcardPayInfoRes", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFlexiPreCreditInfoBean;", "getOkcardPayInfoRes", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFlexiPreCreditInfoBean;", "setOkcardPayInfoRes", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFlexiPreCreditInfoBean;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Nullable
        private FlexiBankCashierFlexiPreCreditInfoBean okcardPayInfoRes;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"LO3/g$b;", "", "<init>", "()V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcOfPaymentMethodResultBean;", "calculationDto", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcOfPaymentMethodResultBean;", "a", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcOfPaymentMethodResultBean;", "setCalculationDto", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcOfPaymentMethodResultBean;)V", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierPaymentMethodBean;", "paymentMethodList", "Ljava/util/List;", "c", "()Ljava/util/List;", "setPaymentMethodList", "(Ljava/util/List;)V", "LO3/a;", "payUnable", "b", "setPayUnable", "LO3/g$a;", "openAccountInfo", "LO3/g$a;", "getOpenAccountInfo", "()LO3/g$a;", "setOpenAccountInfo", "(LO3/g$a;)V", "LO3/b;", "limitAmountResp", "LO3/b;", "getLimitAmountResp", "()LO3/b;", "setLimitAmountResp", "(LO3/b;)V", "", "detainmentContent", "Ljava/lang/String;", "getDetainmentContent", "()Ljava/lang/String;", "setDetainmentContent", "(Ljava/lang/String;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        @Nullable
        private FlexiBankCalcOfPaymentMethodResultBean calculationDto;

        @Nullable
        private String detainmentContent;

        @Nullable
        private O3.b limitAmountResp;

        @Nullable
        private a openAccountInfo;

        @Nullable
        private List<O3.a> payUnable;

        @Nullable
        private List<? extends FlexiBankCashierPaymentMethodBean> paymentMethodList;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FlexiBankCalcOfPaymentMethodResultBean getCalculationDto() {
            return this.calculationDto;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getPayUnable() {
            return this.payUnable;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getPaymentMethodList() {
            return this.paymentMethodList;
        }
    }

    public g() {
        super(0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getData() {
        return this.data;
    }
}
