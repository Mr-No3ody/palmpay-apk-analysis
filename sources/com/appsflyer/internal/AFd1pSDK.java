package com.appsflyer.internal;

import N8.q0;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nThrowableExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrowableExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ThrowableExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n11653#2,9:36\n13579#2:45\n13580#2:47\n11662#2:48\n1#3:46\n*S KotlinDebug\n*F\n+ 1 ThrowableExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ThrowableExtensionsKt\n*L\n10#1:36,9\n10#1:45\n10#1:47\n10#1:48\n10#1:46\n*E\n"})
public final class AFd1pSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1pSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "getMediationNetwork", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends o implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at " + stackTraceElement;
        }
    }

    @NotNull
    private static String getCurrencyIso4217Code(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!y.m(className, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + CollectionsKt.J(arrayList, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, AnonymousClass5.AFAdRevenueData, 30);
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.AFAdRevenueData(str, "SHA-256");
    }

    @NotNull
    public static final AFc1bSDK getMediationNetwork(@NotNull Throwable th, @NotNull String str) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        String name = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new AFc1bSDK(q0.y(name, ": ", str), getCurrencyIso4217Code(th), C2126e.b(th), 0, 8, null);
    }
}
